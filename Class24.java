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
		Class31.anInt244 = 0;
		Class114.anInt1093 = -1;
		Class120_Sub22.systemUpdateCycle = 0;
		MapFunctionType.anInt639 = -1;
		Class120_Sub12_Sub11.outputStream.pos = 0;
		SeqType.anInt333 = -1;
		Class88.timoutCycle = 0;
		Class23.packetType = -1;
		Canvas_Sub1.inputStream.pos = 0;
		for (int i_0_ = 0; i_0_ < Class187.hintIcons.length; i_0_++) {
			Class187.hintIcons[i_0_] = null;
		}
		Class15.menuOpen = false;
		Class186.menuOptionCount = 0;
		Class120_Sub12_Sub39.setMouseIdleCycle(0);
		for (int i_1_ = 0; i_1_ < 100; i_1_++) {
			GrandExchangeObject.aStringArray1502[i_1_] = null;
		}
		Class154.minimapRandomZoom = -20 + (int) (Math.random() * 30.0);
		Class23.anInt136 = -50 + (int) (100.0 * Math.random());
		Class164.minimapRandomRotation = (int) (120.0 * Math.random()) - 60;
		Class120_Sub16.messageCount = 0;
		DummyOutputStream.aFloat28 = 0x7ff & -10 + (int) (20.0 * Math.random());
		ProjectileNode.anInt3447 = -40 + (int) (Math.random() * 80.0);
		Class88.spellSelected = false;
		Light.objSelected = 0;
		EntityRenderData.anInt195 = (int) (110.0 * Math.random()) - 55;
		Class150.anInt1407 = 0;
		AbstractGraphicsBuffer.method1842();
		FileSystemWorker.localPlayerCount = 0;
		Class148.localNpcCount = 0;
		for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
			Class118.playersList[i_2_] = null;
			StringNode.playerAppearanceBuffers[i_2_] = null;
		}
		for (int i_3_ = 0; -32769 < (i_3_ ^ 0xffffffff); i_3_++) {
			Class120_Sub12_Sub11.npcList[i_3_] = null;
		}
		TileParticleQueue.selfPlayer = Class118.playersList[2047] = new Player();
		FileSystemRequest.projectileDeque.clear();
		Class120_Sub12_Sub7.aClass105_3177.clear();
		if (ClientScript.groundObjects != null) {
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
				for (int i_5_ = 0; i_5_ < 104; i_5_++) {
					for (int i_6_ = 0; i_6_ < 104; i_6_++) {
						ClientScript.groundObjects[i_4_][i_5_][i_6_] = null;
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
		Class121.anInt1154 = 0;
		Class109.anInt1042 = 0;
		Class99.anInt951 = 0;
		SpotAnimType.anInt986 = 0;
		Class134.anInt1280 = 0;
		Class120_Sub12_Sub31.anInt3384 = 0;
		for (int i_7_ = 0; Class120_Sub12_Sub25.anIntArray3320.length > i_7_; i_7_++) {
			Class120_Sub12_Sub25.anIntArray3320[i_7_] = -1;
		}
		if (Class69.rootInterfaceId != -1) {
			Class120_Sub12_Sub32.uncacheJInterface(Class69.rootInterfaceId);
		}
		for (OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getFirst(); class120_sub26 != null; class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getNext()) {
			Class120_Sub19.removeOverridedInterface(class120_sub26, true);
		}
		Class69.rootInterfaceId = -1;
		Class120_Sub12_Sub13.overridedInterfaces = new Hashtable(8);
		Class43.createJInterfaceCache();
		Class156.aClass189_1454 = null;
		Class186.menuOptionCount = 0;
		Class15.menuOpen = false;
		Class26.aClass144_159.method2042(-1, null, -1, new int[5], false);
		for (int i_8_ = 0; i_8_ < 8; i_8_++) {
			Buffer.playerOptions[i_8_] = null;
			InterfaceListener.playerOptionsOnTop[i_8_] = false;
			AbstractRequest.playerOptionsIcon[i_8_] = -1;
		}
		ObjectContainer.objectContainerCache = new Hashtable(32);
		Class69.aBoolean615 = true;
		for (int i_9_ = 0; i_9_ < 100; i_9_++) {
			MasterIndexInfo.needInterfaceRedrawWrapper[i_9_] = true;
		}
		ReflectionCheckNode.clanMembers = null;
		InterfaceChangeNode.clanName = null;
		Class120_Sub14_Sub13.clanMembersAmount = 0;
		for (int i_10_ = 0; i_10_ < 6; i_10_++) {
			LongNode.grandExchangeObjects[i_10_] = new GrandExchangeObject();
		}
		for (int i_11_ = 0; i_11_ < 25; i_11_++) {
			SceneGraphNode.skillsLevel[i_11_] = 0;
			Decimator.skillsBaseLevel[i_11_] = 0;
			Class120_Sub12_Sub38.skillsXp[i_11_] = 0;
		}
		if (HDToolkit.glEnabled) {
			ModelParticle.aBoolean1478 = true;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		MasterIndexInfo.aBoolean466 = false;
		Class118.aBoolean1134 = true;
		OverlayFrequencyNode.packetCounter = 0;
		Npc.aString3752 = Class120_Sub12_Sub1.aString3132;
		LocType.resetSpriteMenu();
		Class186.usingSpriteMenu = false;
		ParamType.sendDisplayInfo();
	}

	public static void method206(final byte i) {
		try {
			aClass50_145 = null;
			anIntArrayArrayArray140 = null;
			if (i != -102) {
				aFloat144 = 0.38711727F;
			}
			aClass50_143 = null;
			aString142 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("cg.B(").append(i).append(')').toString());
		}
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

	static final int method208(final int i, final int i_13_, final int i_14_, final int i_15_, final boolean bool) {
		int i_16_;
		try {
			if (!bool) {
				return -3;
			}
			final int i_17_ = 65536 + -Rasterizer.cosineTable[1024 * i_15_ / i] >> 1;
			i_16_ = ((-i_17_ + 65536) * i_14_ >> 16) - -(i_17_ * i_13_ >> 16);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("cg.A(").append(i).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(',').append(bool).append(')').toString());
		}
		return i_16_;
	}

	static final void method209(final int i, final long[] ls, final Object[] objects) {
		try {
			if (i == -4391) {
				Class132_Sub2.method1939(ls, (byte) 24, -1 + ls.length, 0, objects);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("cg.C(").append(i).append(',').append(ls != null ? "{...}" : "null").append(',').append(objects != null ? "{...}" : "null").append(')').toString());
		}
	}
}
