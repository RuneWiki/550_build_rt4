/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class23 {
	static int anInt134;
	static Font aFont135;
	static int anInt136;
	static int anInt137 = 0;
	static int packetType;

	static {
		anInt136 = 0;
		anInt134 = 0;
		packetType = 0;
	}

	static final void method200(final int i, final JagexInterface jagexInterface, final int i_0_, final int i_1_, final int i_3_, final AbstractSprite class120_sub14_sub19) {
		if (class120_sub14_sub19 != null) {
			final int i_4_ = (int) DummyOutputStream.aFloat28 + Class164.anInt1590 & 0x7ff;
			final int i_5_ = 10 + Math.max(jagexInterface.width / 2, jagexInterface.height / 2);
			final int i_6_ = i_3_ * i_3_ + i_1_ * i_1_;
			if (i_6_ <= i_5_ * i_5_) {
				int i_7_ = Rasterizer.sineTable[i_4_];
				i_7_ = 256 * i_7_ / (Class154.anInt1442 + 256);
				int i_8_ = Rasterizer.cosineTable[i_4_];
				i_8_ = 256 * i_8_ / (256 + Class154.anInt1442);
				final int i_9_ = i_1_ * i_8_ + i_3_ * i_7_ >> 16;
				final int i_10_ = i_8_ * i_3_ + -(i_1_ * i_7_) >> 16;
				if (!HDToolkit.glEnabled) {
					((LDSprite) class120_sub14_sub19).method1610(-(class120_sub14_sub19.trimWidth / 2) + i + jagexInterface.width / 2 - -i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.height / 2 + i_0_, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				} else {
					((HDSprite) class120_sub14_sub19).method1598(-(class120_sub14_sub19.trimWidth / 2) + jagexInterface.width / 2 + i + i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.height / 2 + i_0_, (HDSprite) jagexInterface.method2492(false));
				}
			}
		}
	}

	static final void method201(final boolean bool, final int i, final JagexInterface jagexInterface, final int i_11_, final int i_12_) {
		final int i_13_ = jagexInterface.height;
		if (jagexInterface.aByte2092 == 0) {
			jagexInterface.height = jagexInterface.originalHeight;
		} else if (jagexInterface.aByte2092 != 1) {
			if (jagexInterface.aByte2092 != 2) {
				if (jagexInterface.aByte2092 == 3) {
					if (jagexInterface.type != 2) {
						if (jagexInterface.type == 7) {
							jagexInterface.height = jagexInterface.originalHeight * 12 - -((-1 + jagexInterface.originalHeight) * jagexInterface.objSpritePadY);
						}
					} else {
						jagexInterface.height = jagexInterface.objSpritePadY * (jagexInterface.originalHeight + -1) + 32 * jagexInterface.originalHeight;
					}
				}
			} else {
				jagexInterface.height = i_11_ * jagexInterface.originalHeight >> 14;
			}
		} else {
			jagexInterface.height = i_11_ - jagexInterface.originalHeight;
		}
		final int i_14_ = jagexInterface.width;
		if (jagexInterface.aByte1963 == 0) {
			jagexInterface.width = jagexInterface.originalWidth;
		} else if (jagexInterface.aByte1963 == 1) {
			jagexInterface.width = i + -jagexInterface.originalWidth;
		} else if (jagexInterface.aByte1963 != 2) {
			if (jagexInterface.aByte1963 == 3) {
				if (jagexInterface.type != 2) {
					if (jagexInterface.type == 7) {
						jagexInterface.width = 115 * jagexInterface.originalWidth - -(jagexInterface.objSpritePadX * (-1 + jagexInterface.originalWidth));
					}
				} else {
					jagexInterface.width = (-1 + jagexInterface.originalWidth) * jagexInterface.objSpritePadX + 32 * jagexInterface.originalWidth;
				}
			}
		} else {
			jagexInterface.width = i * jagexInterface.originalWidth >> 14;
		}
		if (jagexInterface.aByte1963 == 4) {
			jagexInterface.width = jagexInterface.anInt1982 * jagexInterface.height / jagexInterface.anInt2085;
		}
		if (jagexInterface.aByte2092 == 4) {
			jagexInterface.height = jagexInterface.anInt2085 * jagexInterface.width / jagexInterface.anInt1982;
		}
		if (Class120_Sub30_Sub1.aBoolean3673 && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
			if (jagexInterface.height >= 5 || jagexInterface.width >= 5) {
				if (jagexInterface.height <= 0) {
					jagexInterface.height = 5;
				}
				if (jagexInterface.width <= 0) {
					jagexInterface.width = 5;
				}
			} else {
				jagexInterface.height = 5;
				jagexInterface.width = 5;
			}
		}
		if (jagexInterface.clientCode == 1337) {
			DummyInputStream.aClass189_26 = jagexInterface;
		}
		if (bool && jagexInterface.anObjectArray2089 != null && (i_14_ != jagexInterface.width || i_13_ != jagexInterface.height)) {
			final InterfaceListener class120_sub10 = new InterfaceListener();
			class120_sub10.objectData = jagexInterface.anObjectArray2089;
			class120_sub10.aClass189_2534 = jagexInterface;
			Class88.aClass105_829.addLast(class120_sub10);
		}
	}

	static final Class36 method202(final int i, final int i_15_, final int i_16_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_15_][i_16_];
		if (class120_sub18 == null || class120_sub18.aClass36_2650 == null) {
			return null;
		}
		return class120_sub18.aClass36_2650;
	}

	public static void method203(final int i) {
		try {
			aFont135 = null;
			if (i != 5) {
				method200(112, null, -82, 29, -44, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ce.E(").append(i).append(')').toString());
		}
	}

	static final void method204(final int i, final Npc class180_sub5_sub2, final byte i_17_, final int i_18_) {
		try {
			if (i_17_ != -118) {
				anInt136 = 103;
			}
			if (i == class180_sub5_sub2.anInt3006 && i != -1) {
				final SeqType seqType = SeqType.list(i);
				final int i_19_ = seqType.anInt337;
				if (i_19_ == 1) {
					class180_sub5_sub2.anInt2964 = 0;
					class180_sub5_sub2.anInt2993 = i_18_;
					class180_sub5_sub2.anInt3013 = 1;
					class180_sub5_sub2.anInt2999 = 0;
					class180_sub5_sub2.anInt3044 = 0;
					Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub2.z, class180_sub5_sub2.x, class180_sub5_sub2.anInt2964, false);
				}
				if (i_19_ == 2) {
					class180_sub5_sub2.anInt2999 = 0;
				}
			} else if (i == -1 || (class180_sub5_sub2.anInt3006 ^ 0xffffffff) == 0 || SeqType.list(i).anInt348 >= SeqType.list(class180_sub5_sub2.anInt3006).anInt348) {
				class180_sub5_sub2.anInt3013 = 1;
				class180_sub5_sub2.anInt3031 = class180_sub5_sub2.anInt2960;
				class180_sub5_sub2.anInt2999 = 0;
				class180_sub5_sub2.anInt2964 = 0;
				class180_sub5_sub2.anInt2993 = i_18_;
				class180_sub5_sub2.anInt3006 = i;
				class180_sub5_sub2.anInt3044 = 0;
				if (class180_sub5_sub2.anInt3006 != -1) {
					Class120_Sub12_Sub23.method1323(SeqType.list(class180_sub5_sub2.anInt3006), class180_sub5_sub2.z, class180_sub5_sub2.x, class180_sub5_sub2.anInt2964, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ce.D(").append(i).append(',').append(class180_sub5_sub2 != null ? "{...}" : "null").append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
	}
}
