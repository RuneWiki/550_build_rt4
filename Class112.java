/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class112 {
	static int[] playerIndices = new int[2048];
	private final FileSystemWorker fileSystemWorker;
	static int[] anIntArray1069;
	static WorldMapFont aClass98_1070;
	private final Js5Worker js5Worker;
	private Buffer masterIndexBuffer;
	private Js5Request masterIndexRequest;
	private Class53_Sub1[] aClass53_Sub1Array1074;
	static int gameLoopCount;
	static Frame frame;
	static int anInt1077 = 0;
	static byte kickRights;
	static int anInt1080;

	static {
		anIntArray1069 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
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
			is = Class101_Sub1.underWaterLocationsMapFilesBuffer;
		} else {
			is = Class134.locationMapFilesBuffer;
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
							for (int i_11_ = 0; Class120_Sub12_Sub36.regionBitPackeds.length > i_11_; i_11_++) {
								if (i_10_ == Class120_Sub12_Sub36.regionBitPackeds[i_11_] && is[i_11_] != null) {
									Class120_Sub12_Sub10.method1247(level, x * 8, WallLocation.collisionMaps, is[i_11_], i_7_, 8 * (0x7 & i_8_), (0x7 & i_9_) * 8, i_6_, bool, z * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method989(final int i, final int i_12_, final int i_14_) {
		final ClientScript class120_sub14_sub12 = Class120_Sub12_Sub16.method1277(i, i_12_, i_14_);
		if (class120_sub14_sub12 != null) {
			TileParticleQueue.intArguments = new int[class120_sub14_sub12.intArgumentCount];
			Class79_Sub1.stringArguments = new String[class120_sub14_sub12.stringArgumentCount];
			if (class120_sub14_sub12.anInt3546 == 15 || class120_sub14_sub12.anInt3546 == 17 || class120_sub14_sub12.anInt3546 == 16) {
				int x = 0;
				int y = 0;
				if (MapSceneType.worldMapInterface != null) {
					x = MapSceneType.worldMapInterface.x;
					y = MapSceneType.worldMapInterface.y;
				}
				TileParticleQueue.intArguments[0] = Queue.lastMouseX - x;
				TileParticleQueue.intArguments[1] = ChunkAtmosphere.lastMouseY - y;
			}
			World.executeScript(class120_sub14_sub12, 200000);
		}
	}

	static final void getRunesSpriteId(final js5 js5) {
		Class120_Sub14_Sub13.runesId = js5.getGroupId("runes");
	}

	private final Class53_Sub1 method991(final FileSystem masterIndexFs, final FileSystem indexFs, final boolean bool, final int indexId) {
		if (masterIndexBuffer == null) {
			throw new RuntimeException();
		}
		masterIndexBuffer.pos = 5 + indexId * 8;
		if (masterIndexBuffer.buf.length <= masterIndexBuffer.pos) {
			throw new RuntimeException();
		}
		if (aClass53_Sub1Array1074[indexId] != null) {
			return aClass53_Sub1Array1074[indexId];
		}
		final int crc = masterIndexBuffer.getInt();
		final int version = masterIndexBuffer.getInt();
		final Class53_Sub1 class53_sub1_21_ = new Class53_Sub1(indexId, indexFs, masterIndexFs, js5Worker, fileSystemWorker, crc, version, bool);
		aClass53_Sub1Array1074[indexId] = class53_sub1_21_;
		return class53_sub1_21_;
	}

	static final MapFunctionNode method992() {
		if (WorldMapHandler.mapFunctionsQueue == null) {
			return null;
		}
		for (MapFunctionNode class120_sub14_sub5_22_ = (MapFunctionNode) Class22.aClass127_130.method1890(); class120_sub14_sub5_22_ != null; class120_sub14_sub5_22_ = (MapFunctionNode) Class22.aClass127_130.method1890()) {
			final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5_22_.id);
			if (class73 != null && class73.aBoolean659 && class73.method647()) {
				return class120_sub14_sub5_22_;
			}
		}
		return null;
	}

	final Class53_Sub1 method993(final FileSystem masterIndexFs, final FileSystem indexFs, final int id) {
		return method991(masterIndexFs, indexFs, true, id);
	}

	Class112(final Js5Worker jw, final FileSystemWorker fsw) {
		js5Worker = jw;
		fileSystemWorker = fsw;
		if (!js5Worker.method357()) {
			masterIndexRequest = js5Worker.putRequest(255, 255, (byte) 0, true);
		}
	}
}
