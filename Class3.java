/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3 {
	static int anInt53;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_54;
	static Class50 aClass50_55;
	static SignlinkNode aClass185_56;

	static final void method79(final int i, final Class50 class50, final Class50 class50_0_) {
		try {
			final int i_1_ = -10 + (int) (Math.random() * 21.0);
			Class30.aClass50_233 = class50_0_;
			final int i_2_ = (int) (Math.random() * 41.0) - 20;
			Class120_Sub14_Sub22.aClass50_3640 = class50;
			final int i_3_ = (int) (Math.random() * 21.0) - 10;
			Class30.aClass50_233.method441(34, 1);
			final int i_4_ = (int) (21.0 * Math.random()) + -10;
			Class158.anInt1481 = i_2_ + i_3_;
			GameEntity.anInt2957 = i_1_ - -i_2_;
			if (i != -8) {
				method87(-79, -77L);
			}
			Class5.anInt2157 = i_2_ + i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.E(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(class50_0_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method80(final int i) {
		try {
			if (i != 1) {
				method83(33, 116, -90, -67);
			}
			aClass120_Sub14_Sub9_54 = null;
			aClass185_56 = null;
			aClass50_55 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.C(").append(i).append(')').toString());
		}
	}

	static final void method81(final int i, final byte i_5_, final String string) {
		try {
			if (i_5_ < 40) {
				aClass120_Sub14_Sub9_54 = null;
			}
			final String string_6_ = Class120_Sub12_Sub23.method1326(Class120_Sub6.method1068(string, -8251), true);
			boolean bool = false;
			for (int i_7_ = 0; i_7_ < Class83.localPlayerCount; i_7_++) {
				final Player class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_7_]];
				if (class180_sub5_sub1 != null && class180_sub5_sub1.aString3745 != null && class180_sub5_sub1.aString3745.equalsIgnoreCase(string_6_)) {
					bool = true;
					if (i == 1) {
						Class40.anInt330++;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(212);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class112.playerIndices[i_7_]);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(0, -42);
					} else if (i != 4) {
						if (i != 5) {
							if (i != 6) {
								if (i == 7) {
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(52);
									GameEntity.anInt3023++;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class112.playerIndices[i_7_]);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(0);
								}
							} else {
								Class22.anInt132++;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(77);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class112.playerIndices[i_7_]);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(0);
							}
						} else {
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(96);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(0, 82);
							PacketBuffer.anInt3122++;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class112.playerIndices[i_7_]);
						}
					} else {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(105);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class112.playerIndices[i_7_]);
						Class193.anInt2131++;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(0);
					}
					break;
				}
			}
			if (!bool) {
				Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(Class180_Sub6.aString3062).append(string_6_).toString());
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.G(").append(i).append(',').append(i_5_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method82(final byte i) {
		try {
			for (int i_8_ = 0; i_8_ < Class148.localNpcCount; i_8_++) {
				final int i_9_ = Class120_Sub12_Sub36.localNpcIndices[i_8_];
				final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_9_];
				if (class180_sub5_sub2 != null) {
					Class120_Sub12_Sub9.method1245(-29399, class180_sub5_sub2.npcType.size, class180_sub5_sub2);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.D(").append(i).append(')').toString());
		}
	}

	static final int method83(final int i, final int i_10_, final int i_11_, final int i_12_) {
		int i_13_;
		try {
			if (i_11_ != 1) {
				aClass50_55 = null;
			}
			i_13_ = i_10_ >= i ? i_10_ > i_12_ ? i_12_ : i_10_ : i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.B(").append(i).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
		return i_13_;
	}

	static final void method84(final int i, final int i_14_, final int i_15_, final int i_16_, final boolean bool) {
		Class186.anInt1900 = i_14_;
		Class120_Sub12_Sub38.anInt3440 = i_15_;
		Class120_Sub14_Sub13.anInt3563 = i_16_;
		Class86.aClass120_Sub18ArrayArrayArray820 = new Class120_Sub18[i][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
		Class120_Sub12_Sub33.anIntArrayArrayArray3388 = new int[i][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		if (HDToolkit.glEnabled) {
			Class180_Sub1.aClass120_Sub9ArrayArray2844 = new Class120_Sub9[4][];
		}
		if (bool) {
			Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 = new Class120_Sub18[1][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
			Class35.anIntArrayArray300 = new int[Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
			Class24.anIntArrayArrayArray140 = new int[1][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
			if (HDToolkit.glEnabled) {
				Class120_Sub32.aClass120_Sub9ArrayArray2789 = new Class120_Sub9[1][];
			}
		} else {
			Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 = null;
			Class35.anIntArrayArray300 = null;
			Class24.anIntArrayArrayArray140 = null;
			Class120_Sub32.aClass120_Sub9ArrayArray2789 = null;
		}
		Class178.method2257(false);
		Class180.aClass188Array1782 = new Class188[500];
		Class49.anInt438 = 0;
		Class180_Sub6.aClass188Array3076 = new Class188[500];
		CursorType.anInt1237 = 0;
		Class46.anIntArrayArrayArray419 = new int[i][Class186.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		Class111.aClass28Array1057 = new Class28[5000];
		Class120_Sub14_Sub12.anInt3556 = 0;
		Class39.aClass28Array323 = new Class28[100];
		SpotAnimType.aBooleanArrayArray992 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1];
		Class120_Sub13.aBooleanArrayArray2573 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2];
		Class114.aByteArrayArrayArray1094 = new byte[i][Class186.anInt1900][Class120_Sub12_Sub38.anInt3440];
	}

	static final void method85(final boolean bool) {
		try {
			for (int i = 0; i < 5; i++) {
				Class120_Sub12_Sub12.aBooleanArray3223[i] = false;
			}
			AbstractGraphicsBuffer.anInt1157 = -1;
			client.anInt2200 = 5;
			Class120_Sub12_Sub31.anInt3384 = 0;
			if (bool) {
				Class101_Sub1.anInt2272 = 0;
				Class120_Sub12_Sub15.anInt3248 = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.I(").append(bool).append(')').toString());
		}
	}

	static final int[] method86(final int i, final int i_17_, final int i_18_, final float f, final int i_19_, final int i_20_, final boolean bool, final byte i_21_) {
		int[] is;
		try {
			final int[] is_22_ = new int[i_19_];
			if (i_21_ != -24) {
				return null;
			}
			final Class120_Sub12_Sub12 class120_sub12_sub12 = new Class120_Sub12_Sub12();
			class120_sub12_sub12.anInt3221 = (int) (4096.0F * f);
			class120_sub12_sub12.anInt3228 = i_17_;
			class120_sub12_sub12.aBoolean3226 = bool;
			class120_sub12_sub12.anInt3229 = i;
			class120_sub12_sub12.anInt3222 = i_18_;
			class120_sub12_sub12.anInt3225 = i_20_;
			class120_sub12_sub12.method1193((byte) -17);
			Class22.method199(i_19_, 1, false);
			class120_sub12_sub12.method1261(is_22_, 0, i_21_ ^ ~0x4a);
			is = is_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.A(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(f).append(',').append(i_19_).append(',').append(i_20_).append(',').append(bool).append(',').append(i_21_).append(')')
					.toString());
		}
		return is;
	}

	static final void method87(final int i, final long l) {
		try {
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos = 0;
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(21);
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLong(l);
			if (i != 19536) {
				method83(-67, -6, -68, 36);
			}
			Class120_Sub12_Sub35.anInt3410 = -3;
			Class120_Sub14_Sub4.anInt3466 = 0;
			Class107.anInt1027 = 0;
			Class154.anInt1440 = 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ab.H(").append(i).append(',').append(l).append(')').toString());
		}
	}
}
