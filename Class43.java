/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
	static boolean usingJavaAbove5;
	static byte[][] aByteArrayArray365;
	static int[] toRemoveEntityIndices = new int[1000];
	static ObjectCache playerModelsCache;
	static int anInt368;

	static {
		aByteArrayArray365 = new byte[50][];
		usingJavaAbove5 = false;
		playerModelsCache = new ObjectCache(260);
	}

	static final void resetMapFunctionCache(final int i, final int i_0_) {
		MapFunctionType.recentUse = new ObjectCache(i);
		MapFunctionType.spriteCache = new ObjectCache(i_0_);
	}

	static final void createJInterfaceCache() {
		JagexInterface.interfaceCache = new JagexInterface[JagexInterface.interfaceJs5.method421()][];
		JagexInterface.interfaceLoaded = new boolean[JagexInterface.interfaceJs5.method421()];
	}

	static final void method343(final int i, final int i_5_, final int i_6_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		if (!js5.loadInterface(i)) {
			if (i_12_ != -1) {
				MasterIndexInfo.needInterfaceRedrawWrapper[i_12_] = true;
			} else {
				for (int i_13_ = 0; i_13_ < 100; i_13_++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[i_13_] = true;
				}
			}
		} else {
			MapSceneType.method2008(JagexInterface.interfaceCache[i], i_8_, -1, i_12_, i_9_, i_11_, i_5_, i_6_, i_10_);
		}
	}

	static final void method345(final String string) {
		System.out.println("Bad " + string + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	static final void decodeWorldListInfo(final Buffer buffer) {
		final int worldAmount = buffer.getUSmart();
		Class148.worldsInfo = new WorldInfo[worldAmount];
		for (int id = 0; id < worldAmount; id++) {
			Class148.worldsInfo[id] = new WorldInfo();
			Class148.worldsInfo[id].country = buffer.getUSmart();
			Class148.worldsInfo[id].region = buffer.getJagexString2();
		}
		SubInterface.worldOff = buffer.getUSmart();
		EnumType.worldLen = buffer.getUSmart();
		Class57.worldLen2 = buffer.getUSmart();
		Class48.worldList = new World[EnumType.worldLen - SubInterface.worldOff + 1];
		for (int id = 0; id < Class57.worldLen2; id++) {
			final int worldId = buffer.getUSmart();
			final World world = Class48.worldList[worldId] = new World();
			world.location = buffer.getUByte();
			world.flag = buffer.getInt();
			world.worldId = SubInterface.worldOff + worldId;
			world.activity = buffer.getJagexString2();
			world.ip = buffer.getJagexString2();
		}
		Class96.anInt900 = buffer.getInt();
		Class159.worldsLoaded = true;
	}
}
