/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;

final class JagexSocket implements Runnable {
	static int anInt414 = 5063219;
	static BigInteger aBigInteger415;
	private OutputStream outputStream;
	private boolean closed = false;
	private int tcycle = 0;
	static int[][][] anIntArrayArrayArray419;
	static int selectedSpellComponextIndex = -1;
	private byte[] buffer;
	private final Socket socket;
	static boolean aBoolean423 = false;
	private InputStream inputStream;
	private boolean IOError = false;
	static LDIndexedSprite[] runesSprite;
	private final Signlink signlink;
	private SignlinkNode socketThread;
	private int tnum = 0;

	static {
		aBigInteger415 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	}

	final void read(final byte[] buf, int off, int len) throws IOException {
		if (!closed) {
			while (len > 0) {
				final int i_2_ = inputStream.read(buf, off, len);
				if (i_2_ <= 0) {
					throw new EOFException();
				}
				len -= i_2_;
				off += i_2_;
			}
		}
	}

	static final void method374() {
		if (FrameGroup.anInt3609 != 0) {
			do {
				try {
					if (Class79_Sub1.anInt2244++ > 1500) {
						if (AbstractTimer.worldConnection != null) {
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
						if (MapFunctionGroup.anInt1323 >= 1) {
							Class48.returnCode = -5;
							FrameGroup.anInt3609 = 0;
							return;
						}
						FrameGroup.anInt3609 = 1;
						MapFunctionGroup.anInt1323++;
						if (Hashtable.anInt675 != Class116.worldListPort) {
							Class116.worldListPort = Hashtable.anInt675;
						} else {
							Class116.worldListPort = ObjectPile.anInt1808;
						}
						Class79_Sub1.anInt2244 = 0;
					}
					if (FrameGroup.anInt3609 == 1) {
						Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.worldListIpAddress, Class116.worldListPort);
						FrameGroup.anInt3609 = 2;
					}
					if (FrameGroup.anInt3609 == 2) {
						if (Class53_Sub1.worldConnectionNode.status == 2) {
							throw new IOException();
						}
						if (Class53_Sub1.worldConnectionNode.status != 1) {
							return;
						}
						AbstractTimer.worldConnection = new JagexSocket((Socket) Class53_Sub1.worldConnectionNode.value, NpcType.gameSignlink);
						Class53_Sub1.worldConnectionNode = null;
						AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						if (Class120_Sub12_Sub3.aClass164_3150 != null) {
							Class120_Sub12_Sub3.aClass164_3150.method2131();
						}
						if (Class120_Sub12_Sub29.aClass164_3366 != null) {
							Class120_Sub12_Sub29.aClass164_3366.method2131();
						}
						final int i_3_ = AbstractTimer.worldConnection.read();
						if (Class120_Sub12_Sub3.aClass164_3150 != null) {
							Class120_Sub12_Sub3.aClass164_3150.method2131();
						}
						if (Class120_Sub12_Sub29.aClass164_3366 != null) {
							Class120_Sub12_Sub29.aClass164_3366.method2131();
						}
						if (i_3_ == 101) {
							FrameGroup.anInt3609 = 3;
						} else {
							Class48.returnCode = i_3_;
							FrameGroup.anInt3609 = 0;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
							return;
						}
					}
					if (FrameGroup.anInt3609 != 3) {
						break;
					}
					if (AbstractTimer.worldConnection.getAvailable() >= 2) {
						final int i_4_ = AbstractTimer.worldConnection.read() << 8 | AbstractTimer.worldConnection.read();
						Class188.hopWorld(i_4_);
						if (Class157.worldId == -1) {
							FrameGroup.anInt3609 = 0;
							Class48.returnCode = 6;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						} else {
							FrameGroup.anInt3609 = 0;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
							SeqFrameBase.method1037();
						}
					}
				} catch (final IOException ioexception) {
					if (AbstractTimer.worldConnection != null) {
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
					if (MapFunctionGroup.anInt1323 < 1) {
						MapFunctionGroup.anInt1323++;
						Class79_Sub1.anInt2244 = 0;
						if (Class116.worldListPort == Hashtable.anInt675) {
							Class116.worldListPort = ObjectPile.anInt1808;
						} else {
							Class116.worldListPort = Hashtable.anInt675;
						}
						FrameGroup.anInt3609 = 1;
					} else {
						FrameGroup.anInt3609 = 0;
						Class48.returnCode = -4;
					}
					break;
				}
				return;
			} while (false);
		}
	}

	final int getAvailable() throws IOException {
		if (closed) {
			return 0;
		}
		return inputStream.available();
	}

	static final void executeOnloadScript(final int interfaceId) {
		if (interfaceId != -1 && js5.loadInterface(interfaceId)) {
			for (int id = 0; id < JagexInterface.interfaceCache[interfaceId].length; id++) {
				final JagexInterface jagexInterface = JagexInterface.interfaceCache[interfaceId][id];
				if (jagexInterface.onloadListener != null) {
					final InterfaceListener interfaceListener = new InterfaceListener();
					interfaceListener.objectData = jagexInterface.onloadListener;
					interfaceListener.jagexInterface = jagexInterface;
					ObjectCache.executeScript(interfaceListener, 2000000);
				}
			}
		}
	}

	final void close() {
		if (!closed) {
			synchronized (this) {
				closed = true;
				notifyAll();
			}
			if (socketThread != null) {
				while (socketThread.status == 0) {
					PacketBuffer.sleepWrapper(1L);
				}
				if (socketThread.status == 1) {
					try {
						((Thread) socketThread.value).join();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			socketThread = null;
		}
	}

	final void replaceStreamsWithDummy() {
		if (!closed) {
			inputStream = new DummyInputStream();
			outputStream = new DummyOutputStream();
		}
	}

	final int read() throws IOException {
		if (closed) {
			return 0;
		}
		return inputStream.read();
	}

	@Override
	protected final void finalize() {
		close();
	}

	final void checkForError() throws IOException {
		if (!closed) {
			if (IOError) {
				IOError = false;
				throw new IOException();
			}
		}
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				int off;
				int len;
				synchronized (this) {
					if (tnum == tcycle) {
						if (closed) {
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
					off = tcycle;
					if (tcycle <= tnum) {
						len = tnum - tcycle;
					} else {
						len = 5000 - tcycle;
					}
				}
				if (len > 0) {
					try {
						outputStream.write(buffer, off, len);
					} catch (final IOException ioexception) {
						IOError = true;
					}
					tcycle = (len + tcycle) % 5000;
					try {
						if (tnum == tcycle) {
							outputStream.flush();
						}
					} catch (final IOException ioexception) {
						IOError = true;
					}
				}
			}
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (final IOException ioexception) {
				/* empty */
			}
			buffer = null;
		} catch (final Exception exception) {
			SpotAnimation.method2312(exception, null);
		}
	}

	final void put(final byte[] buf, final int off, final int len) throws IOException {
		if (!closed) {
			if (IOError) {
				IOError = false;
				throw new IOException();
			}
			if (buffer == null) {
				buffer = new byte[5000];
			}
			synchronized (this) {
				for (int id = 0; id < len; id++) {
					buffer[tnum] = buf[id + off];
					tnum = (tnum + 1) % 5000;
					if ((tcycle + 4900) % 5000 == tnum) {
						throw new IOException();
					}
				}
				if (socketThread == null) {
					socketThread = signlink.startThread(this, 3);
				}
				notifyAll();
			}
		}
	}

	JagexSocket(final Socket socket, final Signlink signlink) throws IOException {
		this.socket = socket;
		this.signlink = signlink;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}
}
