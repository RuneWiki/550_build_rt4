/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static boolean aBoolean139 = false;
	static int[][][] anIntArrayArrayArray140;
	static String aString142 = "Please wait - attempting to reestablish.";
	static js5 aClass50_143;
	static float aFloat144;
	static js5 aClass50_145;
	static int anInt146;
	static int anInt147 = 0;

	static final void method205() {
		Class179.aClient1776.loadJagmisc();
		DummyInputStream.focus = true;
		Class120_Sub12_Sub11.anInt3214 = 0;
		Class179.aBoolean1779 = true;
		Class110.mouseRecorder.cacheIndex = 0;
		EnumType.aLong3462 = 0L;
		Class28.method247();
		Class31.logoutCycle = 0;
		Class114.anInt1093 = -1;
		Class120_Sub22.systemUpdateCycle = 0;
		MapFunctionType.anInt639 = -1;
		Class120_Sub12_Sub11.outputStream.pos = 0;
		SeqType.anInt333 = -1;
		Class88.timoutCycle = 0;
		Class23.packetType = -1;
		Canvas_Sub1.inputStream.pos = 0;
		for (int id = 0; id < Class187.hintIcons.length; id++) {
			Class187.hintIcons[id] = null;
		}
		Class15.menuOpen = false;
		WallDecoration.menuOptionCount = 0;
		Class120_Sub12_Sub39.setMouseIdleCycle(0);
		for (int id = 0; id < 100; id++) {
			GrandExchangeObject.aStringArray1502[id] = null;
		}
		Class120_Sub16.messageCount = 0;
		DummyOutputStream.aFloat28 = 0x7ff & -10 + (int) (20.0 * Math.random());
		Class88.spellSelected = false;
		Light.objSelected = 0;
		Class150.anInt1407 = 0;
		AbstractGraphicsBuffer.method1842();
		FileSystemWorker.localPlayerCount = 0;
		Class148.localNpcCount = 0;
		for (int id = 0; id < 2048; id++) {
			Class118.playersList[id] = null;
			StringNode.playerAppearanceBuffers[id] = null;
		}
		for (int id = 0; id < 32768; id++) {
			Class120_Sub12_Sub11.npcList[id] = null;
		}
		TileParticleQueue.selfPlayer = Class118.playersList[2047] = new Player();
		FileSystemRequest.projectileDeque.clear();
		Class120_Sub12_Sub7.aClass105_3177.clear();
		if (ClientScript.groundObjects != null) {
			for (int level = 0; level < 4; level++) {
				for (int x = 0; x < 104; x++) {
					for (int z = 0; z < 104; z++) {
						ClientScript.groundObjects[level][x][z] = null;
					}
				}
			}
		}
		Class120_Sub4.aClass105_2439 = new Deque();
		ObjectPile.friendsServerStatus = 0;
		ProducingGraphicsBuffer.friendCount = 0;
		Class33.resetVarp();
		LookupTable.clearInterfaceChanges();
		Class101_Sub1.anInt2272 = 0;
		InterfaceListener.anInt2546 = 0;
		ObjectContainer.anInt2621 = 0;
		NpcType.anInt1660 = 0;
		client.anInt1154 = 0;
		Class109.anInt1042 = 0;
		Class99.anInt951 = 0;
		SpotAnimType.anInt986 = 0;
		Class134.anInt1280 = 0;
		Class120_Sub12_Sub31.anInt3384 = 0;
		for (int id = 0; id < Class120_Sub12_Sub25.anIntArray3320.length; id++) {
			Class120_Sub12_Sub25.anIntArray3320[id] = -1;
		}
		if (Class69.rootInterfaceId != -1) {
			Class120_Sub12_Sub32.uncacheJInterface(Class69.rootInterfaceId);
		}
		for (OverridedJInterface overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getFirst(); overridedInterface != null; overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getNext()) {
			Class120_Sub19.removeOverridedInterface(overridedInterface, true);
		}
		Class69.rootInterfaceId = -1;
		Class120_Sub12_Sub13.overridedInterfaces = new Hashtable(8);
		Class43.createJInterfaceCache();
		Class156.aClass189_1454 = null;
		WallDecoration.menuOptionCount = 0;
		Class15.menuOpen = false;
		Class26.aClass144_159.method2042(-1, null, -1, new int[5], false);
		for (int id = 0; id < 8; id++) {
			Buffer.playerOptions[id] = null;
			InterfaceListener.playerOptionsOnTop[id] = false;
			AbstractRequest.playerOptionsIcon[id] = -1;
		}
		ObjectContainer.objectContainerCache = new Hashtable(32);
		Class69.aBoolean615 = true;
		for (int id = 0; id < 100; id++) {
			MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
		}
		ReflectionCheckNode.clanMembers = null;
		InterfaceChangeNode.clanName = null;
		Class120_Sub14_Sub13.clanMembersAmount = 0;
		for (int id = 0; id < 6; id++) {
			LongNode.grandExchangeObjects[id] = new GrandExchangeObject();
		}
		for (int id = 0; id < 25; id++) {
			SceneGraphNode.skillsLevel[id] = 0;
			Decimator.skillsBaseLevel[id] = 0;
			Class120_Sub12_Sub38.skillsXp[id] = 0;
		}
		if (HDToolkit.glEnabled) {
			ModelParticleEmitter.instantScreenFade = true;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		MasterIndexInfo.aBoolean466 = false;
		Class118.aBoolean1134 = true;
		OverlayFrequencyNode.packetCounter = 0;
		TextRepository.walkText = Class120_Sub12_Sub1.aString3132;
		LocType.resetSpriteMenu();
		WallDecoration.usingSpriteMenu = false;
		ParamType.sendDisplayInfo();
	}

	static final int method207() {
		if (MasterIndexInfo.aBoolean466) {
			return 0;
		}
		if (!Class143_Sub1.method2021()) {
			return 1;
		}
		return Class120_Sub12.aBoolean2564 ? 2 : 1;
	}

	static final int method208(final int i, final int i_13_, final int i_14_, final int i_15_) {
		final int i_17_ = 65536 - Rasterizer.cosTable[1024 * i_15_ / i] >> 1;
		return ((65536 - i_17_) * i_14_ >> 16) + (i_17_ * i_13_ >> 16);
	}

	static final void method209(final int i, final long[] ls, final Object[] objects) {
		Class132_Sub2.method1939(ls, (byte) 24, -1 + ls.length, 0, objects);
	}
}
