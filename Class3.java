/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3 {
	static int anInt53;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_54;
	static SignlinkNode aClass185_56;

	static final void method79(final js5 js5, final js5 class50_0_) {
		MapSceneType.configJs5 = class50_0_;
		MapSceneType.spriteJs5 = js5;
		final int i_1_ = (int) (Math.random() * 21.0) - 10;
		final int i_2_ = (int) (Math.random() * 41.0) - 20;
		final int i_3_ = (int) (Math.random() * 21.0) - 10;
		final int i_4_ = (int) (Math.random() * 21.0) - 10;
		//Class30.aClass50_233.getFileAmount(34); not sure if this is needed
		Class158.mapSceneRedColorModifier = i_2_ + i_3_;
		GameEntity.mapSceneBlueColorModifier = i_1_ + i_2_;
		Class5.mapSceneGreenColorModifier = i_2_ + i_4_;
	}

	public static void method80(final int i) {
		try {
			if (i != 1) {
				method83(33, 116, -67);
			}
			aClass120_Sub14_Sub9_54 = null;
			aClass185_56 = null;
			UnderlayType.configClient = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ab.C(").append(i).append(')').toString());
		}
	}

	static final void method81(final int i, final byte i_5_, final String string) {
		try {
			if (i_5_ < 40) {
				aClass120_Sub14_Sub9_54 = null;
			}
			final String string_6_ = Class120_Sub12_Sub23.method1326(Class120_Sub6.method1068(string, -8251));
			boolean bool = false;
			for (int i_7_ = 0; i_7_ < FileSystemWorker.localPlayerCount; i_7_++) {
				final Player class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_7_]];
				if (class180_sub5_sub1 != null && class180_sub5_sub1.name != null && class180_sub5_sub1.name.equalsIgnoreCase(string_6_)) {
					bool = true;
					if (i == 1) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(212);
						Class120_Sub12_Sub11.outputStream.putShortA(Class112.playerIndices[i_7_]);
						Class120_Sub12_Sub11.outputStream.putByteA(0);
					} else if (i != 4) {
						if (i != 5) {
							if (i != 6) {
								if (i == 7) {
									Class120_Sub12_Sub11.outputStream.putByteIsaac(52);
									Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[i_7_]);
									Class120_Sub12_Sub11.outputStream.putByte(0);
								}
							} else {
								Class120_Sub12_Sub11.outputStream.putByteIsaac(77);
								Class120_Sub12_Sub11.outputStream.putLEShort(Class112.playerIndices[i_7_]);
								Class120_Sub12_Sub11.outputStream.putByteS(0);
							}
						} else {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(96);
							Class120_Sub12_Sub11.outputStream.putByteA(0);
							Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[i_7_]);
						}
					} else {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(105);
						Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[i_7_]);
						Class120_Sub12_Sub11.outputStream.putByte(0);
					}
					break;
				}
			}
			if (!bool) {
				AbstractRequest.method1540("", 0, new StringBuilder(AnimatedLocation.aString3062).append(string_6_).toString());
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ab.G(").append(i).append(',').append(i_5_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method82() {
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final int index = Class120_Sub12_Sub36.localNpcIndices[id];
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			if (npc != null) {
				Class120_Sub12_Sub9.method1245(npc, npc.npcType.size);
			}
		}
	}

	static final int method83(final int i, final int i_10_, final int i_12_) {
		return i_10_ >= i ? i_10_ > i_12_ ? i_12_ : i_10_ : i;
	}

	static final void method84(final int i, final int i_14_, final int i_15_, final int i_16_, final boolean bool) {
		Class186.anInt1900 = i_14_;
		Class120_Sub12_Sub38.anInt3440 = i_15_;
		Class120_Sub14_Sub13.anInt3563 = i_16_;
		Class86.aClass120_Sub18ArrayArrayArray820 = new GroundTile[i][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
		Class120_Sub12_Sub33.anIntArrayArrayArray3388 = new int[i][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		if (HDToolkit.glEnabled) {
			SceneGroundObject.aClass120_Sub9ArrayArray2844 = new Class120_Sub9[4][];
		}
		if (bool) {
			Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 = new GroundTile[1][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
			NodeCache.anIntArrayArray300 = new int[Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
			Class24.anIntArrayArrayArray140 = new int[1][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
			if (HDToolkit.glEnabled) {
				IntegerNode.aClass120_Sub9ArrayArray2789 = new Class120_Sub9[1][];
			}
		} else {
			Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 = null;
			NodeCache.anIntArrayArray300 = null;
			Class24.anIntArrayArrayArray140 = null;
			IntegerNode.aClass120_Sub9ArrayArray2789 = null;
		}
		Class178.method2257(false);
		SceneGraphNode.aClass188Array1782 = new Class188[500];
		Class49.anInt438 = 0;
		AnimatedLocation.aClass188Array3076 = new Class188[500];
		CursorType.anInt1237 = 0;
		JagexSocket.anIntArrayArrayArray419 = new int[i][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		Class111.aClass28Array1057 = new Class28[5000];
		ClientScript.anInt3556 = 0;
		Class39.aClass28Array323 = new Class28[100];
		SpotAnimType.aBooleanArrayArray992 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1];
		ClanMember.aBooleanArrayArray2573 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2];
		Class114.aByteArrayArrayArray1094 = new byte[i][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
	}

	static final void smoothCamera() {
		for (int i = 0; i < 5; i++) {
			Class120_Sub12_Sub12.aBooleanArray3223[i] = false;
		}
		AbstractGraphicsBuffer.anInt1157 = -1;
		client.cameraType = 5;
		Class120_Sub12_Sub31.anInt3384 = 0;
		Class101_Sub1.anInt2272 = 0;
		Class120_Sub12_Sub15.anInt3248 = -1;
	}

	static final int[] method86(final int i, final int i_17_, final int i_18_, final float f, final int i_19_, final int i_20_, final boolean bool) {
		final int[] is_22_ = new int[i_19_];
		final Class120_Sub12_Sub12 class120_sub12_sub12 = new Class120_Sub12_Sub12();
		class120_sub12_sub12.anInt3221 = (int) (4096.0F * f);
		class120_sub12_sub12.anInt3228 = i_17_;
		class120_sub12_sub12.aBoolean3226 = bool;
		class120_sub12_sub12.anInt3229 = i;
		class120_sub12_sub12.anInt3222 = i_18_;
		class120_sub12_sub12.anInt3225 = i_20_;
		class120_sub12_sub12.postDecode();
		Class22.method199(i_19_, 1, false);
		class120_sub12_sub12.method1261(is_22_, 0);
		return is_22_;
	}

	static final void method87(final long l) {
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class120_Sub12_Sub11.outputStream.putByte(21);
		Class120_Sub12_Sub11.outputStream.putLong(l);
		Class120_Sub12_Sub35.anInt3410 = -3;
		Class120_Sub14_Sub4.anInt3466 = 0;
		AbstractIndexedSprite.anInt1027 = 0;
		Class154.anInt1440 = 1;
	}
}
