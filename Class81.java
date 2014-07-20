/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class81 {
	static Hashtable aClass75_777;
	static int nameiconsId;
	static int[] anIntArray779 = new int[50];

	public static void method703() {
		aClass75_777 = null;
		anIntArray779 = null;
	}

	static final String method704(final int i, final byte i_0_, final int i_1_) {
		String string;
		try {
			final int i_2_ = i + -i_1_;
			if (i_2_ < -9) {
				return "<col=ff0000>";
			}
			if (i_2_ < -6) {
				return "<col=ff3000>";
			}
			if (i_2_ < -3) {
				return "<col=ff7000>";
			}
			if (i_2_ < 0) {
				return "<col=ffb000>";
			}
			if (i_2_ > 9) {
				return "<col=00ff00>";
			}
			if (i_2_ > 6) {
				return "<col=40ff00>";
			}
			if (i_2_ > 3) {
				return "<col=80ff00>";
			}
			if (i_2_ > 0) {
				return "<col=c0ff00>";
			}
			if (i_0_ != -109) {
				anIntArray779 = null;
			}
			string = "<col=ffff00>";
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("il.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return string;
	}

	static final void method705(final byte i) {
		try {
			if (Class79.aClass120_Sub14_Sub22_691 != null) {
				if (Class90.anInt848 < 10) {
					if (!Class79.aClass50_689.method435(Class79.aClass120_Sub14_Sub22_691.aString3645, 2)) {
						Class90.anInt848 = Class120_Sub12_Sub24.aClass50_3309.method412(Class79.aClass120_Sub14_Sub22_691.aString3645, (byte) -11) / 10;
						return;
					}
					Class120_Sub12_Sub25.method1332((byte) -23);
					Class90.anInt848 = 10;
				}
				if (Class90.anInt848 == 10) {
					Class79.anInt695 = Class79.aClass120_Sub14_Sub22_691.anInt3632 >> 6 << 6;
					Class79.anInt700 = -Class79.anInt695 + (Class79.aClass120_Sub14_Sub22_691.anInt3642 >> 6 << 6) + 64;
					Class79.anInt694 = Class79.aClass120_Sub14_Sub22_691.anInt3636 >> 6 << 6;
					final int[] is = new int[3];
					Class79.anInt692 = -Class79.anInt694 + (Class79.aClass120_Sub14_Sub22_691.anInt3644 >> 6 << 6) - -64;
					int i_3_ = -1;
					int i_4_ = -1;
					if (Class79.aClass120_Sub14_Sub22_691.method1630(Class181.currentBaseZ + (Class100.selfPlayer.z >> 7), -1, Class173.gameLevel, is, (Class100.selfPlayer.x >> 7) + GameEntity.currentBaseX)) {
						i_4_ = is[1] - Class79.anInt695;
						i_3_ = -is[2] + Class79.anInt694 + -1 + Class79.anInt692;
					}
					if (!JagexSocket.aBoolean423 && i_4_ >= 0 && Class79.anInt700 > i_4_ && i_3_ >= 0 && Class79.anInt692 > i_3_) {
						i_3_ += (int) (Math.random() * 10.0) - 5;
						Class169.anInt1646 = i_3_;
						i_4_ += -5 + (int) (Math.random() * 10.0);
						Class108_Sub1.anInt2336 = i_4_;
					} else if ((Class120_Sub12_Sub33.anInt3407 ^ 0xffffffff) != 0 && (Class86.anInt818 ^ 0xffffffff) != 0) {
						Class79.aClass120_Sub14_Sub22_691.method1632(is, Class86.anInt818, (byte) -84, Class120_Sub12_Sub33.anInt3407);
						Class120_Sub12_Sub33.anInt3407 = Class86.anInt818 = -1;
						JagexSocket.aBoolean423 = false;
						if (is != null) {
							Class169.anInt1646 = -1 + Class79.anInt692 - is[2] - -Class79.anInt694;
							Class108_Sub1.anInt2336 = is[1] + -Class79.anInt695;
						}
					} else {
						Class79.aClass120_Sub14_Sub22_691.method1632(is, 0x3fff & Class79.aClass120_Sub14_Sub22_691.anInt3633, (byte) 68, 0x3fff & Class79.aClass120_Sub14_Sub22_691.anInt3633 >> 14);
						Class169.anInt1646 = Class79.anInt694 - (is[2] - (-1 + Class79.anInt692));
						Class108_Sub1.anInt2336 = -Class79.anInt695 + is[1];
					}
					if (Class79.aClass120_Sub14_Sub22_691.anInt3643 != 37) {
						if (Class79.aClass120_Sub14_Sub22_691.anInt3643 == 50) {
							Class79.aFloat698 = Class79.aFloat696 = 4.0F;
						} else if (Class79.aClass120_Sub14_Sub22_691.anInt3643 != 75) {
							if (Class79.aClass120_Sub14_Sub22_691.anInt3643 != 100) {
								if (Class79.aClass120_Sub14_Sub22_691.anInt3643 != 200) {
									Class79.aFloat698 = Class79.aFloat696 = 8.0F;
								} else {
									Class79.aFloat698 = Class79.aFloat696 = 16.0F;
								}
							} else {
								Class79.aFloat698 = Class79.aFloat696 = 8.0F;
							}
						} else {
							Class79.aFloat698 = Class79.aFloat696 = 6.0F;
						}
					} else {
						Class79.aFloat698 = Class79.aFloat696 = 3.0F;
					}
					Class127.method1889((byte) 15);
					final int i_5_ = Class79.anInt700 >> 6;
					Class79.anIntArray715 = new int[1 + Buffer.anInt2471];
					final int i_6_ = Class79.anInt692 >> 6;
					Class79.aByteArrayArrayArray706 = new byte[i_5_][i_6_][];
					Class79.anIntArrayArrayArray702 = new int[i_5_][i_6_][];
					Class79.aByteArrayArrayArray707 = new byte[i_5_][i_6_][];
					Class79.aByteArrayArrayArray710 = new byte[i_5_][i_6_][];
					Class79.anIntArrayArrayArray713 = new int[i_5_][i_6_][];
					Class79.aByteArrayArrayArray703 = new byte[i_5_][i_6_][];
					Class79.aByteArrayArrayArray711 = new byte[i_5_][i_6_][];
					Class73.aClass105_653 = new Deque();
					Class22.aClass127_130 = new Class127();
					Class43.method338(1024, 256, -87);
					Class52.method453(256, (byte) 104);
					Class90.anInt848 = 20;
				} else if (Class90.anInt848 == 20) {
					Class118.method1024(i ^ ~0x1cf1, new Buffer(Class79.aClass50_689.method428(108, "underlay", Class79.aClass120_Sub14_Sub22_691.aString3645)));
					Class90.anInt848 = 30;
					Class120_Sub12_Sub29.ping(true);
					Class69.method613();
				} else if (Class90.anInt848 == 30) {
					Class79.method680(new Buffer(Class79.aClass50_689.method428(108, "overlay", Class79.aClass120_Sub14_Sub22_691.aString3645)));
					Class90.anInt848 = 40;
					Class69.method613();
				} else if (Class90.anInt848 == 40) {
					Class79.method688(new Buffer(Class79.aClass50_689.method428(i ^ ~0x62, "overlay2", Class79.aClass120_Sub14_Sub22_691.aString3645)));
					Class90.anInt848 = 50;
					Class69.method613();
				} else if (Class90.anInt848 == 50) {
					Class79.method689(new Buffer(Class79.aClass50_689.method428(111, "loc", Class79.aClass120_Sub14_Sub22_691.aString3645)), Class120_Sub12_Sub37.membersClient);
					Class90.anInt848 = 60;
					Class120_Sub12_Sub29.ping(true);
					Class69.method613();
				} else if (i == -39) {
					if (Class90.anInt848 == 60) {
						if (!Class79.aClass50_689.method414(new StringBuilder(Class79.aClass120_Sub14_Sub22_691.aString3645).append("_labels").toString())) {
							Class79.aClass137_693 = new Class137(0);
						} else {
							if (!Class79.aClass50_689.method435(new StringBuilder(Class79.aClass120_Sub14_Sub22_691.aString3645).append("_labels").toString(), 2)) {
								return;
							}
							Class79.aClass137_693 = Class54.method478(Class79.aClass50_689, -2, new StringBuilder(Class79.aClass120_Sub14_Sub22_691.aString3645).append("_labels").toString(), Class120_Sub12_Sub37.membersClient);
						}
						Class79.method682();
						Class90.anInt848 = 70;
						Class69.method613();
					} else if (Class90.anInt848 == 70) {
						PlayerAppearance.aClass98_1373 = new Class98(11, true, Node.canvas);
						Class90.anInt848 = 73;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 73) {
						Class92.aClass98_863 = new Class98(12, true, Node.canvas);
						Class90.anInt848 = 76;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 76) {
						Class112.aClass98_1070 = new Class98(14, true, Node.canvas);
						Class90.anInt848 = 79;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 79) {
						Class110.aClass98_1052 = new Class98(17, true, Node.canvas);
						Class90.anInt848 = 82;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 82) {
						FileSystemRequest.aClass98_3929 = new Class98(19, true, Node.canvas);
						Class90.anInt848 = 85;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 85) {
						World.aClass98_2833 = new Class98(22, true, Node.canvas);
						Class90.anInt848 = 88;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else if (Class90.anInt848 == 88) {
						Class124.aClass98_1201 = new Class98(26, true, Node.canvas);
						Class90.anInt848 = 91;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
					} else {
						OverridedJInterface.aClass98_2739 = new Class98(30, true, Node.canvas);
						Class90.anInt848 = 100;
						Class120_Sub12_Sub29.ping(true);
						Class69.method613();
						System.gc();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("il.D(").append(i).append(')').toString());
		}
	}

	static final void method707() {
		if (!Class188.aBoolean1925) {
			if (!Class134.aBoolean1277) {
				Class120_Sub15.aFloat2598 += (-Class120_Sub15.aFloat2598 + 24.0F) / 2.0F;
			} else {
				DummyOutputStream.aFloat28 = (int) DummyOutputStream.aFloat28 + 191 & ~0x7f;
			}
			Class188.aBoolean1925 = true;
			Class118.aBoolean1134 = true;
		}
	}

	static final void method708(final int i) {
		do {
			try {
				Class120_Sub12_Sub9.aClass21_3196.clearSoftReference();
				if (i != -11) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("il.A(").append(i).append(')').toString());
			}
		} while (false);
	}
}
