/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class112 {
	static int[] playerIndices = new int[2048];
	private final FileSystemWorker fileSystemWorker;
	static int[] anIntArray1069;
	static Class98 aClass98_1070;
	private final Js5Worker js5Worker;
	private Buffer masterIndexBuffer;
	private Js5Request masterIndexRequest;
	private Class53_Sub1[] aClass53_Sub1Array1074;
	static int gameLoopCount;
	static Frame frame;
	static int anInt1077 = 0;
	static byte kickRights;
	static String aString1079;
	static int anInt1080;

	static {
		anIntArray1069 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
		aString1079 = "You can't add yourself to your own ignore list.";
	}

	final void method985() {
		if (aClass53_Sub1Array1074 != null) {
			for (final Class53_Sub1 element : aClass53_Sub1Array1074) {
				if (element != null) {
					element.method469();
				}
			}
			for (int i_0_ = 0; i_0_ < aClass53_Sub1Array1074.length; i_0_++) {
				final Class53_Sub1 class53_sub1 = aClass53_Sub1Array1074[i_0_];
				if (class53_sub1 != null) {
					class53_sub1.method476();
				}
			}
		}
	}

	final boolean method986() {
		if (masterIndexBuffer != null) {
			return true;
		}
		if (masterIndexRequest == null) {
			if (js5Worker.method357()) {
				return false;
			}
			masterIndexRequest = js5Worker.putRequest(255, 255, (byte) 0, true);
		}
		if (masterIndexRequest.aBoolean3576) {
			return false;
		}
		masterIndexBuffer = new Buffer(masterIndexRequest.getBuffer());
		aClass53_Sub1Array1074 = new Class53_Sub1[(masterIndexBuffer.buf.length - 5) / 8];
		return true;
	}

	static final void method987(final boolean bool) {
		byte[][] is;
		int maxLevel;
		if (HDToolkit.glEnabled && bool) {
			maxLevel = 1;
			is = Class101_Sub1.aByteArrayArray2271;
		} else {
			is = Class134.aByteArrayArray1287;
			maxLevel = 4;
		}
		for (int level = 0; level < maxLevel; level++) {
			Class120_Sub2.method1050();
			for (int x = 0; x < 13; x++) {
				for (int z = 0; z < 13; z++) {
					final int i_5_ = Class120_Sub12_Sub36.anIntArrayArrayArray3420[level][x][z];
					if (i_5_ != -1) {
						final int i_6_ = (0x39ff11b & i_5_) >> 24;
						if (!bool || i_6_ == 0) {
							final int i_7_ = (0x7 & i_5_) >> 1;
							final int i_8_ = (i_5_ & 0x3fff) >> 3;
							final int i_9_ = (i_5_ & 0xffd503) >> 14;
							final int i_10_ = (i_9_ / 8 << 8) + i_8_ / 8;
							for (int i_11_ = 0; Class120_Sub12_Sub36.anIntArray3417.length > i_11_; i_11_++) {
								if (i_10_ == Class120_Sub12_Sub36.anIntArray3417[i_11_] && is[i_11_] != null) {
									Class120_Sub12_Sub10.method1247(level, x * 8, Class182.collisionMaps, is[i_11_], i_7_, 8 * (0x7 & i_8_), (0x7 & i_9_) * 8, i_6_, bool, z * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method988() {
		playerIndices = null;
		aClass98_1070 = null;
		frame = null;
		aString1079 = null;
		anIntArray1069 = null;
	}

	static final void method989(final int i, final int i_12_, final int i_14_) {
		final ClientScript class120_sub14_sub12 = Class120_Sub12_Sub16.method1277(i, i_12_, i_14_);
		if (class120_sub14_sub12 != null) {
			TileParticleQueue.intArguments = new int[class120_sub14_sub12.intArgumentCount];
			Class79_Sub1.stringArguments = new String[class120_sub14_sub12.stringArgumentCount];
			if (class120_sub14_sub12.anInt3546 == 15 || class120_sub14_sub12.anInt3546 == 17 || class120_sub14_sub12.anInt3546 == 16) {
				int i_15_ = 0;
				int i_16_ = 0;
				if (Class142.aClass189_1362 != null) {
					i_15_ = Class142.aClass189_1362.x;
					i_16_ = Class142.aClass189_1362.y;
				}
				TileParticleQueue.intArguments[1] = Class191.lastMouseY - i_16_;
				TileParticleQueue.intArguments[0] = Queue.lastMouseX - i_15_;
			}
			World.method2194(class120_sub14_sub12, 200000);
		}
	}

	static final void getRunesSpriteId(final js5 js5) {
		Class120_Sub14_Sub13.runesId = js5.method432("runes");
	}

	private final Class53_Sub1 method991(final FileSystem fileSystem, final FileSystem class51_17_, final boolean bool, final int index) {
		if (masterIndexBuffer == null) {
			throw new RuntimeException();
		}
		masterIndexBuffer.pos = 5 + index * 8;
		if (masterIndexBuffer.buf.length <= masterIndexBuffer.pos) {
			throw new RuntimeException();
		}
		if (aClass53_Sub1Array1074[index] != null) {
			return aClass53_Sub1Array1074[index];
		}
		final int crc = masterIndexBuffer.getInt();
		final int version = masterIndexBuffer.getInt();
		final Class53_Sub1 class53_sub1_21_ = new Class53_Sub1(index, class51_17_, fileSystem, js5Worker, fileSystemWorker, crc, version, bool);
		aClass53_Sub1Array1074[index] = class53_sub1_21_;
		return class53_sub1_21_;
	}

	static final Class120_Sub14_Sub5 method992() {
		if (Class79.aClass177_690 == null) {
			return null;
		}
		for (Class120_Sub14_Sub5 class120_sub14_sub5_22_ = (Class120_Sub14_Sub5) Class22.aClass127_130.method1890(); class120_sub14_sub5_22_ != null; class120_sub14_sub5_22_ = (Class120_Sub14_Sub5) Class22.aClass127_130.method1890()) {
			final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5_22_.anInt3473);
			if (class73 != null && class73.aBoolean659 && class73.method647()) {
				return class120_sub14_sub5_22_;
			}
		}
		return null;
	}

	final Class53_Sub1 method993(final FileSystem fileSystem, final FileSystem class51_23_, final int i) {
		return method991(fileSystem, class51_23_, true, i);
	}

	Class112(final Js5Worker jw, final FileSystemWorker fsw) {
		js5Worker = jw;
		fileSystemWorker = fsw;
		if (!js5Worker.method357()) {
			masterIndexRequest = js5Worker.putRequest(255, 255, (byte) 0, true);
		}
	}
}
