/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static boolean aBoolean139 = false;
	static int[][][] underWaterTileHeightMap;
	static float aFloat144;
	static int anInt146;
	static int anInt147 = 0;

	static final void method205() {
		Class179.clientInstance.loadJagmisc();
		DummyInputStream.focus = true;
		Class120_Sub12_Sub11.anInt3214 = 0;
		Class179.aBoolean1779 = true;
		Class110.mouseRecorder.cacheIndex = 0;
		EnumType.lastClickPacketSendTime = 0L;
		Class28.method247();
		Class31.logoutCycle = 0;
		Class114.previousPacketType = -1;
		Class120_Sub22.rebootTimer = 0;
		MapFunctionType.thirdPacketType = -1;
		Class120_Sub12_Sub11.outputStream.pos = 0;
		SeqType.fourthPacketType = -1;
		Class88.timoutCycle = 0;
		client.packetType = -1;
		Canvas_Sub1.inputStream.pos = 0;
		for (int id = 0; id < Class187.hintIcons.length; id++) {
			Class187.hintIcons[id] = null;
		}
		Class15.menuOpen = false;
		WallDecoration.menuOptionCount = 0;
		Class120_Sub12_Sub39.setMouseIdleCycle(0);
		for (int id = 0; id < 100; id++) {
			GrandExchangeObject.chatMessages[id] = null;
		}
		Class120_Sub16.chatMessageCount = 0;
		DummyOutputStream.cameraYaw = (int) (20.0 * Math.random()) - 10 & 0x7ff;
		Class88.spellSelected = false;
		Light.objSelected = 0;
		Class150.soundEffectCount = 0;
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
		Class120_Sub12_Sub7.spotAnimationDeque.clear();
		if (ClientScript.groundObjects != null) {
			for (int level = 0; level < 4; level++) {
				for (int x = 0; x < 104; x++) {
					for (int z = 0; z < 104; z++) {
						ClientScript.groundObjects[level][x][z] = null;
					}
				}
			}
		}
		Class120_Sub4.customLocations = new Deque();
		ObjectPile.friendsServerStatus = 0;
		ProducingGraphicsBuffer.friendCount = 0;
		Varp.reset();
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
		for (SubInterface subInterface = (SubInterface) Class120_Sub12_Sub13.subInterfaces.getFirst(); subInterface != null; subInterface = (SubInterface) Class120_Sub12_Sub13.subInterfaces.getNext()) {
			Class120_Sub19.removeSubInterface(subInterface, true);
		}
		Class69.rootInterfaceId = -1;
		Class120_Sub12_Sub13.subInterfaces = new Hashtable(8);
		Class43.createJInterfaceCache();
		Class156.dialogInterface = null;
		WallDecoration.menuOptionCount = 0;
		Class15.menuOpen = false;
		Normal.dummyPlayerAppearance.init(-1, null, -1, new int[5], false);
		for (int id = 0; id < 8; id++) {
			Buffer.playerOptions[id] = null;
			InterfaceListener.playerOptionsOnTop[id] = false;
			AbstractRequest.playerOptionsIcon[id] = -1;
		}
		ObjectContainer.objectContainerCache = new Hashtable(32);
		Class69.loadingScreenOpened = true;
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
			client.skillsLevel[id] = 0;
			client.skillsBaseLevel[id] = 0;
			client.skillsXp[id] = 0;
		}
		if (HDToolkit.glEnabled) {
			ModelParticleEmitter.instantScreenFade = true;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		MasterIndexInfo.neverRemoveRoofs = false;
		Class118.sendCameraPacket = true;
		OverlayFrequencyNode.triggerId = 0;
		StringLibrary.walkText = Class120_Sub12_Sub1.aString3132;
		LocType.resetSpriteMenu();
		WallDecoration.usingSpriteMenu = false;
		ParamType.sendDisplayInfo();
	}

	static final int method207() {
		if (MasterIndexInfo.neverRemoveRoofs) {
			return 0;
		}
		if (!Class143_Sub1.allLevelsAreVisible()) {
			return 1;
		}
		return Class120_Sub12.removeRoofsSelectively ? 2 : 1;
	}

	static final int method208(final int i, final int i_13_, final int i_14_, final int i_15_) {
		final int i_17_ = 65536 - Rasterizer.cosTable[1024 * i_15_ / i] >> 1;
		return ((65536 - i_17_) * i_14_ >> 16) + (i_17_ * i_13_ >> 16);
	}
}
