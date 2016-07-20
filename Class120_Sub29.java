/* Class120_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub29 extends Node {
	int entityIndex;
	int z;
	int anInt2766;
	int anInt2767;
	static int anInt2768;
	static int[] menuOptionsData3 = new int[500];
	static js5 aClass50_2770;
	int anInt2771;
	int locType;
	int anInt2773;
	static int anInt2774;
	int rotation;
	int locId;
	static short[] menuOptionsCode;
	int anInt2778;
	int anInt2779;
	int x;

	static {
		anInt2768 = 0;
		menuOptionsCode = new short[500];
	}

	static final void receiveRegionData(final boolean bool) {
		Class134.dynamicMapRegion = bool;
		if (Class134.dynamicMapRegion) {
			final int playerZ = Canvas_Sub1.inputStream.getULEShortA();
			final int baseZ = Canvas_Sub1.inputStream.getUShortA();
			final int baseX = Canvas_Sub1.inputStream.getULEShort();
			Canvas_Sub1.inputStream.startBitAccess();
			for (int level = 0; level < 4; level++) {
				for (int x = 0; x < 13; x++) {
					for (int z = 0; z < 13; z++) {
						final int exist = Canvas_Sub1.inputStream.getBitValue(1);
						if (exist == 1) {
							Class120_Sub12_Sub36.dynamicMapData[level][x][z] = Canvas_Sub1.inputStream.getBitValue(26);
						} else {
							Class120_Sub12_Sub36.dynamicMapData[level][x][z] = -1;
						}
					}
				}
			}
			Canvas_Sub1.inputStream.endBitAccess();
			int regionCount = (AbstractMouseWheelHandler.packetSize - Canvas_Sub1.inputStream.pos) / 16;
			Class125.regionsXteaKeys = new int[regionCount][4];
			for (int regionId = 0; regionId < regionCount; regionId++) {
				for (int level = 0; level < 4; level++) {
					Class125.regionsXteaKeys[regionId][level] = Canvas_Sub1.inputStream.getInt2();
				}
			}
			final int playerX = Canvas_Sub1.inputStream.getUShort();
			final boolean buildAreaChanged = Projectile.setBuildArea(Canvas_Sub1.inputStream.getUByteS());
			final int level = Canvas_Sub1.inputStream.getUByteA();
			client.underWaterLocationsMapFileIds = new int[regionCount];
			Class179.npcSpawnsFilesBuffer = null;
			Class120_Sub12_Sub36.underWaterMapFilesBuffer = new byte[regionCount][];
			Class120_Sub12_Sub36.regionBitPackeds = new int[regionCount];
			ProducingGraphicsBuffer.npcSpawnsFileIds = null;
			Class111.underWaterMapFileIds = new int[regionCount];
			LookupTable.mapFileIds = new int[regionCount];
			Class101_Sub1.underWaterLocationsMapFilesBuffer = new byte[regionCount][];
			Class134.locationMapFilesBuffer = new byte[regionCount][];
			Class28.locationsMapFileIds = new int[regionCount];
			RuntimeException_Sub1.mapFilesBuffer = new byte[regionCount][];
			regionCount = 0;
			for (int level_ = 0; level_ < 4; level_++) {
				for (int x = 0; x < 13; x++) {
					for (int z = 0; z < 13; z++) {
						final int data = Class120_Sub12_Sub36.dynamicMapData[level_][x][z];
						if (data != -1) {
							final int regionX = data >> 14 & 0x3ff;
							final int regionZ = data >> 3 & 0x7ff;
							int regionBitPacked = (regionX / 8 << 8) + regionZ / 8;
							for (int regionId = 0; regionId < regionCount; regionId++) {
								if (Class120_Sub12_Sub36.regionBitPackeds[regionId] == regionBitPacked) {
									regionBitPacked = -1;
									break;
								}
							}
							if (regionBitPacked != -1) {
								Class120_Sub12_Sub36.regionBitPackeds[regionCount] = regionBitPacked;
								final int mapX = regionBitPacked >> 8 & 0xff;
								final int mapZ = regionBitPacked & 0xff;
								LookupTable.mapFileIds[regionCount] = Class65.mapsJs5.getGroupId("m" + mapX + "_" + mapZ);
								Class28.locationsMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("l" + mapX + "_" + mapZ);
								Class111.underWaterMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("um" + mapX + "_" + mapZ);
								client.underWaterLocationsMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("ul" + mapX + "_" + mapZ);
								regionCount++;
							}
						}
					}
				}
			}
			Class2.updateRegion(baseX, baseZ, level, playerX, playerZ, false, buildAreaChanged);
		} else {
			final boolean buildAreaChanged = Projectile.setBuildArea(Canvas_Sub1.inputStream.getUByteS());
			final int baseZ = Canvas_Sub1.inputStream.getUShort();
			int regionCount = (AbstractMouseWheelHandler.packetSize - Canvas_Sub1.inputStream.pos) / 16;
			Class125.regionsXteaKeys = new int[regionCount][4];
			for (int regionId = 0; regionId < regionCount; regionId++) {
				for (int levelId = 0; levelId < 4; levelId++) {
					Class125.regionsXteaKeys[regionId][levelId] = Canvas_Sub1.inputStream.getLEInt();
				}
			}
			final int level = Canvas_Sub1.inputStream.getUByteC();
			final int playerX = Canvas_Sub1.inputStream.getUShortA();
			final int playerZ = Canvas_Sub1.inputStream.getUShort();
			boolean tutorialIsland = false;
			final int baseX = Canvas_Sub1.inputStream.getUShort();
			if ((baseX / 8 == 48 || baseX / 8 == 49) && baseZ / 8 == 48) {
				tutorialIsland = true;
			}
			if (baseX / 8 == 48 && baseZ / 8 == 148) {
				tutorialIsland = true;
			}
			Class111.underWaterMapFileIds = new int[regionCount];
			LookupTable.mapFileIds = new int[regionCount];
			RuntimeException_Sub1.mapFilesBuffer = new byte[regionCount][];
			client.underWaterLocationsMapFileIds = new int[regionCount];
			Class28.locationsMapFileIds = new int[regionCount];
			Class179.npcSpawnsFilesBuffer = null;
			Class120_Sub12_Sub36.underWaterMapFilesBuffer = new byte[regionCount][];
			Class134.locationMapFilesBuffer = new byte[regionCount][];
			ProducingGraphicsBuffer.npcSpawnsFileIds = null;
			Class101_Sub1.underWaterLocationsMapFilesBuffer = new byte[regionCount][];
			Class120_Sub12_Sub36.regionBitPackeds = new int[regionCount];
			regionCount = 0;
			for (int x = (baseX - 6) / 8; x <= (baseX + 6) / 8; x++) {
				for (int z = (baseZ - 6) / 8; z <= (baseZ + 6) / 8; z++) {
					final int regionIdBitPacked = (x << 8) + z;
					if (!tutorialIsland || z != 49 && z != 149 && z != 147 && x != 50 && (x != 49 || z != 47)) {
						Class120_Sub12_Sub36.regionBitPackeds[regionCount] = regionIdBitPacked;
						LookupTable.mapFileIds[regionCount] = Class65.mapsJs5.getGroupId("m" + x + "_" + z);
						Class28.locationsMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("l" + x + "_" + z);
						Class111.underWaterMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("um" + x + "_" + z);
						client.underWaterLocationsMapFileIds[regionCount] = Class65.mapsJs5.getGroupId("ul" + x + "_" + z);
					} else {
						Class120_Sub12_Sub36.regionBitPackeds[regionCount] = regionIdBitPacked;
						LookupTable.mapFileIds[regionCount] = -1;
						Class28.locationsMapFileIds[regionCount] = -1;
						Class111.underWaterMapFileIds[regionCount] = -1;
						client.underWaterLocationsMapFileIds[regionCount] = -1;
					}
					regionCount++;
				}
			}
			Class2.updateRegion(baseX, baseZ, level, playerX, playerZ, false, buildAreaChanged);
		}
	}

	static final void method1730(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(6, i);
		class120_sub14_sub7.method1453();
	}

	public Class120_Sub29() {
		/* empty */
	}
}
