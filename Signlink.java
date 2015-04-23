/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public class Signlink implements Runnable {
	public static String osArch;
	private boolean closed;
	public static String javaVendor;
	public static String javaVersion;
	private static String userHome;
	private Mouseimp mouseImp;
	private SignlinkNode current;
	public FileOnDisk cacheDatFile = null;
	public FileOnDisk randomFile;
	private Interface4 anInterface4_1297;
	private final Thread aThread1298;
	public Applet gameApplet = null;
	private final String gameName;
	public static String osNameRaw;
	private final int cacheStoreId;
	public static String osVersion;
	public FileOnDisk masterIndexFile;
	public static String osName;
	private SignlinkNode next;
	public FileOnDisk[] cacheIndexFiles;
	private Fullscreenimp14 fsimp14;
	public static int clientType = 1;//1 - normal, 2 - ?, 3 - unsigned
	private static Hashtable filesCache = new Hashtable(16);
	public static Method setFocusCycleRootMethod;
	static volatile long aLong1313 = 0L;
	public static Method traversalKeyMethod;

	public final SignlinkNode setCursor(final Point point, final int i_0_, final int[] is, final int i_1_, final Component component) {
		return putNode(17, i_0_, new Object[] { component, is, point }, i_1_);
	}

	public final SignlinkNode grabHostName(final int i_2_) {
		return putNode(3, 0, null, i_2_);
	}

	public final SignlinkNode requestUrl(final String string) {
		return putNode(16, 0, string, 0);
	}

	public final SignlinkNode loadJagmisc(final Class var_class) {
		return putNode(20, 0, var_class, 0);
	}

	private final SignlinkNode putNode(final int i, final int i_3_, final Object object, final int i_4_) {
		final SignlinkNode signlinkNode = new SignlinkNode();
		signlinkNode.integerData = i_4_;
		signlinkNode.integerData2 = i_3_;
		signlinkNode.type = i;
		signlinkNode.objectData = object;
		synchronized (this) {
			if (next == null) {
				next = current = signlinkNode;
			} else {
				next.prev = signlinkNode;
				next = signlinkNode;
			}
			notify();
		}
		return signlinkNode;
	}

	public final SignlinkNode finalizeNatives(final Class var_class) {
		return putNode(11, 0, var_class, 0);
	}

	@Override
	public final void run() {
		for (;;) {
			SignlinkNode currentNode;
			synchronized (this) {
				for (;;) {
					if (closed) {
						return;
					}
					if (current != null) {
						currentNode = current;
						current = current.prev;
						if (current == null) {
							next = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				final int type = currentNode.type;
				if (type == 1) {
					if (aLong1313 > TimeUtil.getSafeTime()) {
						throw new IOException();
					}
					System.out.println(currentNode.objectData+":"+currentNode.integerData);
					currentNode.value = new Socket(InetAddress.getByName((String) currentNode.objectData), currentNode.integerData);
				} else if (type == 2) {
					final Thread thread = new Thread((Runnable) currentNode.objectData);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(currentNode.integerData);
					currentNode.value = thread;
				} else if (type == 3) {
					if (aLong1313 > TimeUtil.getSafeTime()) {
						throw new IOException();
					}
					final String string = new StringBuilder(String.valueOf(0xff & currentNode.integerData >> 24)).append(".").append(0xff & currentNode.integerData >> 16).append(".").append(currentNode.integerData >> 8 & 0xff).append(".").append(0xff & currentNode.integerData).toString();
					currentNode.value = InetAddress.getByName(string).getHostName();
				} else if (type == 4) {
					if (aLong1313 > TimeUtil.getSafeTime()) {
						throw new IOException();
					}
					currentNode.value = new DataInputStream(((URL) currentNode.objectData).openStream());
				} else if (type == 5) {
					currentNode.value = fsimp14.getDisplayModesInfo();
				} else if (type == 6) {
					final Frame frame = new Frame("Jagex Full Screen");
					currentNode.value = frame;
					frame.setResizable(false);
					fsimp14.setDisplayMode(frame, 0xffff & currentNode.integerData, currentNode.integerData >>> 16, currentNode.integerData2 >> 16, currentNode.integerData2 & 0xffff);
				} else if (type == 7) {
					fsimp14.revert();
				} else if (type == 8) {
					final Object[] objects = (Object[]) currentNode.objectData;
					if (((Class) objects[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					currentNode.value = ((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
				} else if (type == 9) {
					final Object[] objects = (Object[]) currentNode.objectData;
					if (((Class) objects[0]).getClassLoader() == null) {
						throw new SecurityException();
					}
					currentNode.value = ((Class) objects[0]).getDeclaredField((String) objects[1]);
				} else if (type == 10) {
					final Class[] var_classes = { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
					final Runtime runtime = Runtime.getRuntime();
					if (!osName.startsWith("mac")) {
						final Method method = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var_classes);
						method.setAccessible(true);
						method.invoke(runtime, new Object[] { currentNode.objectData, "jawt" });
						method.setAccessible(false);
					}
					final Method method = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var_classes);
					method.setAccessible(true);
					if (osName.startsWith("linux") || osName.startsWith("sunos")) {
						method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("libjaggl_dri.so", gameName, cacheStoreId).toString() });
						final Class var_class = ((Class) currentNode.objectData).getClassLoader().loadClass("com.sun.opengl.impl.x11.DRIHack");
						var_class.getMethod("begin", new Class[0]).invoke(null, new Object[0]);
						method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("libjaggl.so", gameName, cacheStoreId).toString() });
						var_class.getMethod("end", new Class[0]).invoke(null, new Object[0]);
					} else if (osName.startsWith("mac")) {
						method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("libjaggl.jnilib", gameName, cacheStoreId).toString() });
					} else if (osName.startsWith("win")) {
						method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("jaggl.dll", gameName, cacheStoreId).toString() });
					} else {
						throw new Exception();
					}
					method.setAccessible(false);
				} else if (type == 11) {
					final Field field = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
					field.setAccessible(true);
					final Vector vector = (Vector) field.get(((Class) currentNode.objectData).getClassLoader());
					for (int i_10_ = 0; i_10_ < vector.size(); i_10_++) {
						final Object object = vector.elementAt(i_10_);
						final Method method = object.getClass().getDeclaredMethod("finalize", new Class[0]);
						method.setAccessible(true);
						method.invoke(object, new Object[0]);
						method.setAccessible(false);
						final Field field_11_ = object.getClass().getDeclaredField("handle");
						field_11_.setAccessible(true);
						field_11_.set(object, new Integer(0));
						field_11_.setAccessible(false);
					}
					field.setAccessible(false);
				} else if (type == 12) {
					final String string = (String) currentNode.objectData;
					final FileOnDisk fileOnDisk = getPreferencesFile(string);
					currentNode.value = fileOnDisk;
				} else if (type == 14) {
					final int i_6_ = currentNode.integerData;
					final int i_7_ = currentNode.integerData2;
					mouseImp.moveMouse(i_6_, i_7_);
				} else if (type == 15) {
					final Component component = (Component) currentNode.objectData;
					final boolean bool = currentNode.integerData != 0;
					mouseImp.setCursor(component, bool);
				} else if (type == 16) {
					try {
						if (!osName.startsWith("win")) {
							throw new Exception();
						}
						final String url = (String) currentNode.objectData;
						if (!url.startsWith("http://") && !url.startsWith("https://")) {
							throw new Exception();
						}
						for (int id = 0; id < url.length(); id++) {
							if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*".indexOf(url.charAt(id)) == -1) {
								throw new Exception();
							}
						}
						Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
						currentNode.value = null;
					} catch (final Exception exception) {
						currentNode.value = exception;
					}
				} else if (type == 17) {
					final Object[] objects = (Object[]) currentNode.objectData;
					mouseImp.setCursor((Point) objects[2], (Component) objects[0], currentNode.integerData, currentNode.integerData2, (int[]) objects[1]);
				} else if (type == 18) {
					final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					currentNode.value = clipboard.getContents(null);
				} else if (type == 19) {
					final Transferable transferable = (Transferable) currentNode.objectData;
					final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard.setContents(transferable, null);
				} else if (type == 20) {
					try {
						final Class[] var_classes = { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
						final Runtime runtime = Runtime.getRuntime();
						final Method method = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var_classes);
						method.setAccessible(true);
						if (osName.startsWith("win")) {
							if (!osArch.startsWith("amd64") && !osArch.startsWith("x86_64")) {
								method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("jagmisc.dll", gameName, cacheStoreId).toString() });
							} else {
								method.invoke(runtime, new Object[] { currentNode.objectData, getCacheFile("jagmisc64.dll", gameName, cacheStoreId).toString() });
							}
						}
						method.setAccessible(false);
					} catch (final Throwable throwable) {
						currentNode.value = throwable;
					}
				}
				currentNode.status = 1;
			} catch (final ThreadDeath threaddeath) {
				threaddeath.printStackTrace();
				throw threaddeath;
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
				currentNode.status = 2;
			}
		}
	}

	private static final FileOnDisk getPreferencesFile(final String game) {
		final String[] dirs = { "c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (int id = 0; id < dirs.length; id++) {
			final String dir = dirs[id];
			if (dir.length() <= 0 || new File(dir).exists()) {
				try {
					return new FileOnDisk(new File(dir, "jagex_" + game + "_preferences.dat"), "rw", 10000L);
				} catch (final Exception exception) {
					continue;
				}
			}
		}
		return null;
	}

	public final SignlinkNode revertFrame(final Frame frame) {
		return putNode(7, 0, frame, 0);
	}

	public final SignlinkNode getDisplayModeInfo() {
		return putNode(5, 0, null, 0);
	}

	public static final File getCacheFile(final String fileName, final String game, final int store) {
		final File file = (File) filesCache.get(fileName);
		if (file != null) {
			return file;
		}
		final String[] strings = { "c:/rscache/" };
		final String[] strings_18_ = { new StringBuilder(".jagex_cache_550_").append(store).toString() };
		for (int i_19_ = 0; i_19_ < 2; i_19_++) {
			for (final String element : strings_18_) {
				for (final String string2 : strings) {
					final String string_22_ = new StringBuilder(string2).append(element).append("/").append(game != null ? new StringBuilder(game).append("/").toString() : "").append(fileName).toString();
					RandomAccessFile randomaccessfile = null;
					File file_23_;
					try {
						final File file_24_ = new File(string_22_);
						if (i_19_ == 0 && !file_24_.exists()) {
							continue;
						}
						final String string_25_ = string2;
						if (i_19_ == 1 && string_25_.length() > 0 && !new File(string_25_).exists()) {
							continue;
						}
						new File(new StringBuilder(string2).append(element).toString()).mkdir();
						if (game != null) {
							new File(new StringBuilder(string2).append(element).append("/").append(game).toString()).mkdir();
						}
						randomaccessfile = new RandomAccessFile(file_24_, "rw");
						final int i_26_ = randomaccessfile.read();
						randomaccessfile.seek(0L);
						randomaccessfile.write(i_26_);
						randomaccessfile.seek(0L);
						randomaccessfile.close();
						filesCache.put(fileName, file_24_);
						file_23_ = file_24_;
					} catch (final Exception exception) {
						try {
							if (randomaccessfile != null) {
								randomaccessfile.close();
							}
						} catch (final Exception exception_27_) {
							/* empty */
						}
						continue;
					}
					return file_23_;
				}
			}
		}
		throw new RuntimeException();
	}

	public final void method1963(final int i) {
		aLong1313 = TimeUtil.getSafeTime() + i;
	}

	public final SignlinkNode getMethodInformation(final Class var_class, final String methodName, final Class[] methodArguments) {
		return putNode(8, 0, new Object[] { var_class, methodName, methodArguments }, 0);
	}

	public final Interface4 method1966() {
		return anInterface4_1297;
	}

	public final SignlinkNode method1967(final Class var_class) {
		return putNode(10, 0, var_class, 0);
	}

	public final boolean canUseFullscreen() {
		if (fsimp14 != null) {
			return true;
		}
		return false;
	}

	public final SignlinkNode method1969(final URL url) {
		return putNode(4, 0, url, 0);
	}

	public final SignlinkNode openPreferencesFile(final String string) {
		return putNode(12, 0, string, 0);
	}

	public final void method1971() {
		synchronized (this) {
			closed = true;
			notifyAll();
		}
		try {
			aThread1298.join();
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
		if (cacheDatFile != null) {
			try {
				cacheDatFile.close();
			} catch (final IOException ioexception) {
				/* empty */
			}
		}
		if (masterIndexFile != null) {
			try {
				masterIndexFile.close();
			} catch (final IOException ioexception) {
				/* empty */
			}
		}
		if (cacheIndexFiles != null) {
			for (final FileOnDisk element : cacheIndexFiles) {
				if (element != null) {
					try {
						element.close();
					} catch (final IOException ioexception) {
						/* empty */
					}
				}
			}
		}
		if (randomFile != null) {
			try {
				randomFile.close();
			} catch (final IOException ioexception) {
				/* empty */
			}
		}
	}

	public final SignlinkNode startThread(final Runnable runnable, final int priority) {
		return putNode(2, 0, runnable, priority);
	}

	public final SignlinkNode setDisplayMode(final int i, final int i_29_, final int i_30_, final int i_32_) {
		return putNode(6, (i_32_ << 16) + i, null, i_30_ + (i_29_ << 16));
	}

	public final SignlinkNode getFieldInformation(final Class var_class, final String fieldName) {
		return putNode(9, 0, new Object[] { var_class, fieldName }, 0);
	}

	public Signlink(final Applet applet, final int storeId, final String gName, final int indexAmount) throws Exception {
		randomFile = null;
		masterIndexFile = null;
		closed = false;
		current = null;
		next = null;
		javaVersion = "1.1";
		cacheStoreId = storeId;
		gameName = gName;
		javaVendor = "Unknown";
		gameApplet = applet;
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (final Exception exception) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArch = System.getProperty("os.arch").toLowerCase();
		} catch (final Exception exception) {
			osArch = "";
		}
		try {
			osVersion = System.getProperty("os.version").toLowerCase();
		} catch (final Exception exception) {
			osVersion = "";
		}
		try {
			userHome = System.getProperty("user.home");
			if (userHome != null) {
				final String string_34_ = userHome;
				final StringBuilder stringbuilder = new StringBuilder(string_34_);
				userHome = stringbuilder.append("/").toString();
			}
		} catch (final Exception exception) {
			/* empty */
		}
		if (userHome == null) {
			userHome = "~/";
		}
		try {
			if (applet != null) {
				traversalKeyMethod = applet.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
			} else {
				traversalKeyMethod = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
			}
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			if (applet == null) {
				setFocusCycleRootMethod = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
			} else {
				setFocusCycleRootMethod = applet.getClass().getMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
			}
		} catch (final Exception exception) {
			/* empty */
		}
		randomFile = new FileOnDisk(getCacheFile("random.dat", null, cacheStoreId), "rw", 25L);
		cacheDatFile = new FileOnDisk(getCacheFile("main_file_cache.dat2", gameName, cacheStoreId), "rw", 104857600L);
		masterIndexFile = new FileOnDisk(getCacheFile("main_file_cache.idx255", gameName, cacheStoreId), "rw", 1048576L);
		cacheIndexFiles = new FileOnDisk[indexAmount];
		for (int id = 0; id < indexAmount; id++) {
			cacheIndexFiles[id] = new FileOnDisk(getCacheFile(new StringBuilder("main_file_cache.idx").append(id).toString(), gameName, cacheStoreId), "rw", 1048576L);
		}
		try {
			fsimp14 = new Fullscreenimp14();
		} catch (final Throwable throwable) {
			/* empty */
		}
		try {
			mouseImp = new Mouseimp();
		} catch (final Throwable throwable) {
			/* empty */
		}
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup parent = threadgroup.getParent(); parent != null; parent = threadgroup.getParent()) {
			threadgroup = parent;
		}
		final Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int id = 0; id < threads.length; id++) {
			final Thread thread = threads[id];
			if (thread != null && thread.getName().startsWith("AWT")) {
				thread.setPriority(1);
			}
		}
		closed = false;
		aThread1298 = new Thread(this);
		aThread1298.setPriority(10);
		aThread1298.setDaemon(true);
		aThread1298.start();
	}

	public final SignlinkNode openConnection(final String ip, final int port) {
		return putNode(1, 0, ip, port);
	}
}
