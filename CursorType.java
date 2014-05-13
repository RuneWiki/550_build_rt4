/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CursorType {
	int hotSpotY;
	static int anInt1237 = 0;
	static String aString1238;
	static String aString1239 = "Loaded title screen";
	private int graphic;
	int hotSpotX;
	static int anInt1242;
	static JagexInterface aClass189_1243;

	static {
		aString1238 = "K";
		anInt1242 = 127;
	}

	static final void method1914(final int i, final int i_0_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(1, i_0_);
			class120_sub14_sub7.method1453((byte) -104);
			if (i != -9626) {
				aString1238 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pe.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	public static void method1915(final int i) {
		try {
			aString1238 = null;
			aClass189_1243 = null;
			if (i != -23239) {
				anInt1242 = 9;
			}
			aString1239 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pe.B(").append(i).append(')').toString());
		}
	}

	final void method1916(final int i, final int i_1_, final Buffer class120_sub7) {
		do {
			try {
				for (;;) {
					final int i_2_ = class120_sub7.getUByte();
					if (i_2_ == 0) {
						break;
					}
					method1917((byte) -94, class120_sub7, i_2_, i_1_);
				}
				if (i != -24927) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pe.D(").append(i).append(',').append(i_1_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
			}
		} while (false);
	}

	private final void method1917(final byte i, final Buffer class120_sub7, final int i_3_, final int i_4_) {
			if (i_3_ == 1) {
				graphic = class120_sub7.getUShort();
			} else if (i_3_ == 2) {
				this.hotSpotX = class120_sub7.getUByte();
				this.hotSpotY = class120_sub7.getUByte();
			}
	}

	static final void method1918(final int i) {
		try {
			if (Class180_Sub4.aClass189_2954 == null && Class120_Sub12_Sub4.aClass189_3156 == null && Class120_Sub14_Sub2.anInt3450 <= 0) {
				int i_5_ = Class156.anInt1455;
				if (i != 13) {
					method1914(100, 27);
				}
				if (!Class15.menuOpen) {
					if (i_5_ == 1 && Class186.anInt1906 > 0) {
						final short i_6_ = Class120_Sub29.aShortArray2777[Class186.anInt1906 + -1];
						if (i_6_ == 30 || i_6_ == 20 || i_6_ == 13 || i_6_ == 2 || i_6_ == 49 || i_6_ == 58 || i_6_ == 35 || i_6_ == 17 || i_6_ == 10 || i_6_ == 51 || i_6_ == 9 || i_6_ == 1001) {
							final int i_7_ = Class120_Sub29.anIntArray2769[Class186.anInt1906 - 1];
							final int i_8_ = Class120_Sub12_Sub7.anIntArray3182[Class186.anInt1906 - 1];
							final JagexInterface jagexInterface = Class74.getJagexInterface(i_7_);
							final InterfaceClickMask class120_sub20 = client.method54(jagexInterface);
							if (class120_sub20.method1681(-9617) || class120_sub20.method1691(-104)) {
								JavaObject.anInt3915 = 0;
								Class126.aBoolean1207 = false;
								if (Class180_Sub4.aClass189_2954 != null) {
									InterfaceClickMask.redrawInterface(Class180_Sub4.aClass189_2954);
								}
								Class180_Sub4.aClass189_2954 = Class74.getJagexInterface(i_7_);
								Class23.anInt134 = Class50.anInt449;
								Class5.anInt2154 = i_8_;
								Class27.anInt166 = Class120_Sub12_Sub36.anInt3424;
								InterfaceClickMask.redrawInterface(Class180_Sub4.aClass189_2954);
								return;
							}
						}
					}
					if (i_5_ == 1 && (Class69.anInt617 == 1 && Class186.anInt1906 > 2 || Class120_Sub14_Sub4.method1438(0, Class186.anInt1906 + -1))) {
						i_5_ = 2;
					}
					if (i_5_ == 2 && Class186.anInt1906 > 0 || FileSystem.anInt455 == 1) {
						Class120_Sub12_Sub28.method1349((byte) 103);
					}
					if (i_5_ == 1 && Class186.anInt1906 > 0 || FileSystem.anInt455 == 2) {
						Class191.method2508((byte) 72);
					}
				} else {
					if (i_5_ != 1) {
						final int i_9_ = Queue.anInt1767;
						final int i_10_ = Class191.anInt2113;
						if (i_9_ < -10 + Class126.anInt1209 || i_9_ > 10 + Class120_Sub24.anInt2724 + Class126.anInt1209 || i_10_ < -10 + Class120_Sub16.anInt2600 || 10 + Class120_Sub14_Sub10.anInt3537 + Class120_Sub16.anInt2600 < i_10_) {
							Class15.menuOpen = false;
							Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
						}
					}
					if (i_5_ == 1) {
						final int i_11_ = Class126.anInt1209;
						final int i_12_ = Class120_Sub16.anInt2600;
						final int i_13_ = Class50.anInt449;
						final int i_14_ = Class120_Sub12_Sub36.anInt3424;
						final int i_15_ = Class120_Sub24.anInt2724;
						int i_16_ = -1;
						for (int i_17_ = 0; Class186.anInt1906 > i_17_; i_17_++) {
							if (!Class186.aBoolean1899) {
								final int i_18_ = (Class186.anInt1906 + -1 + -i_17_) * 15 + i_12_ - -31;
								if (i_11_ < i_13_ && i_15_ + i_11_ > i_13_ && i_18_ - 13 < i_14_ && 3 + i_18_ > i_14_) {
									i_16_ = i_17_;
								}
							} else {
								final int i_19_ = 15 * (-i_17_ + Class186.anInt1906 + -1) + 33 + i_12_;
								if (i_11_ < i_13_ && i_15_ + i_11_ > i_13_ && i_19_ + -13 < i_14_ && i_19_ + 3 > i_14_) {
									i_16_ = i_17_;
								}
							}
						}
						if (i_16_ != -1) {
							GameShell.method31((byte) 96, i_16_);
						}
						Class15.menuOpen = false;
						Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pe.F(").append(i).append(')').toString());
		}
	}

	public CursorType() {
		/* empty */
	}

	final LDSprite getCursor() {
		LDSprite class120_sub14_sub19_sub2_20_ = (LDSprite) Class120_Sub12_Sub27.aClass21_3342.get(graphic);
		if (class120_sub14_sub19_sub2_20_ != null) {
			return class120_sub14_sub19_sub2_20_;
		}
		class120_sub14_sub19_sub2_20_ = Class120_Sub12_Sub26.method1340(Class83.aClass50_794, graphic, 0);
		if (class120_sub14_sub19_sub2_20_ != null) {
			Class120_Sub12_Sub27.aClass21_3342.put(class120_sub14_sub19_sub2_20_, graphic);
		}
		return class120_sub14_sub19_sub2_20_;
	}

	static final CursorType list(final int i_110_) {
		CursorType class130_111_ = (CursorType) OutputStream_Sub1.aClass21_30.get(i_110_);
		if (class130_111_ != null) {
			return class130_111_;
		}
		System.out.println(Class120_Sub1.aClass50_2413.getFileAmount(33));
		final byte[] is = Class120_Sub1.aClass50_2413.getFile(33, i_110_);
		class130_111_ = new CursorType();
		if (is != null) {
			class130_111_.method1916(-24927, i_110_, new Buffer(is));
		}
		OutputStream_Sub1.aClass21_30.put(class130_111_, i_110_);
		return class130_111_;
	}
}
