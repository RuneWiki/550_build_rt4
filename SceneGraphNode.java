/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class SceneGraphNode {
	static Class137 aClass137_1780;
	static Cache aClass21_1781 = new Cache(100);
	static Class188[] aClass188Array1782;
	static int[] skillsLevel = new int[25];

	public SceneGraphNode() {
		/* empty */
	}

	abstract void method2265(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l, int i_7_, ParticleEngine class108_sub2);

	abstract void method2266(int i, int i_8_, int i_9_, int i_10_, int i_11_);

	void method2267(final SceneGraphNode class180_12_, final int i, final int i_13_, final int i_14_, final boolean bool) {
		/* empty */
	}

	boolean method2268() {
		boolean bool;
		try {
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "vc.DB()");
		}
		return bool;
	}

	SceneGraphNode method2269(final int i, final int i_15_, final int i_16_) {
		SceneGraphNode class180_17_;
		try {
			class180_17_ = this;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vc.IC(").append(i).append(',').append(i_15_).append(',').append(i_16_).append(')').toString());
		}
		return class180_17_;
	}

	public static void method2270(final byte i) {
		try {
			aClass137_1780 = null;
			if (i > -32) {
				method2271(-104, false, null, -23, null);
			}
			skillsLevel = null;
			aClass21_1781 = null;
			aClass188Array1782 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vc.RC(").append(i).append(')').toString());
		}
	}

	static final void method2271(final int i, final boolean bool, final Class120_Sub14_Sub5 class120_sub14_sub5, final int i_18_, final Class73 class73) {
		try {
			if (class73.anIntArray638 != null) {
				boolean bool_19_ = false;
				final int[] is = new int[class73.anIntArray638.length];
				for (int i_20_ = 0; is.length / 2 > i_20_; i_20_++) {
					final int i_21_ = class73.anIntArray638[i_20_ * 2] + class120_sub14_sub5.anInt3480;
					final int i_22_ = class120_sub14_sub5.anInt3481 + -class73.anIntArray638[1 + 2 * i_20_];
					final int i_23_ = is[i_20_ * 2] = Class79.anInt708 + (i_21_ + -Class79.anInt716) * (Class79.anInt709 - Class79.anInt708) / (Class79.anInt714 - Class79.anInt716);
					final int i_24_ = is[1 + 2 * i_20_] = Class79.anInt705 + (i_22_ + -Class79.anInt704) * (-Class79.anInt705 + Class79.anInt712) / (Class79.anInt701 - Class79.anInt704);
					if (Class79.anInt708 < i_23_ && i_23_ < Class79.anInt709 && Class79.anInt705 < i_24_ && i_24_ < Class79.anInt712) {
						bool_19_ = true;
					}
				}
				if (!bool_19_) {
					return;
				}
				Class59.method542(is, class73.anInt651, class73.anInt651 >>> 24);
				for (int i_25_ = 0; -1 + is.length / 2 > i_25_; i_25_++) {
					GraphicsLD.method2176(is[i_25_ * 2], is[1 + i_25_ * 2], is[2 * (1 + i_25_)], is[1 + (1 + i_25_) * 2], class73.anInt630, class73.anInt630 >>> 24);
				}
				GraphicsLD.method2176(is[is.length - 2], is[is.length + -1], is[0], is[1], class73.anInt630, class73.anInt630 >>> 24);
			} else if (class120_sub14_sub5.aBoolean3476) {
				return;
			}
			if (bool) {
				skillsLevel = null;
			}
			final Class120_Sub16 class120_sub16 = new Class120_Sub16(class120_sub14_sub5);
			LDIndexedSprite class107_sub1 = null;
			if ((class73.anInt644 ^ 0xffffffff) != 0) {
				if (!class120_sub14_sub5.aBoolean3472 || class73.anInt657 == -1) {
					class107_sub1 = (LDIndexedSprite) class73.method648(false, false, true);
				} else {
					class107_sub1 = (LDIndexedSprite) class73.method648(true, bool, true);
				}
				if (class107_sub1 != null) {
					if (Class96.anInt919 > 0 && ((Class127.anInt1215 ^ 0xffffffff) != 0 && class120_sub14_sub5.anInt3473 == Class127.anInt1215 || Class120_Sub12_Sub9.anInt3195 != -1 && class73.anInt652 == Class120_Sub12_Sub9.anInt3195)) {
						int i_26_;
						if (Class136.anInt1321 <= 50) {
							i_26_ = Class136.anInt1321 * 3;
						} else {
							i_26_ = 300 - 3 * Class136.anInt1321;
						}
						GraphicsLD.method2152(class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475, class107_sub1.width / 2 - -7, 16776960, i_26_);
						GraphicsLD.method2152(class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475, 5 + class107_sub1.width / 2, 16776960, i_26_);
						GraphicsLD.method2152(class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475, 3 + class107_sub1.width / 2, 16776960, i_26_);
						GraphicsLD.method2152(class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475, class107_sub1.width / 2 + 1, 16776960, i_26_);
						GraphicsLD.method2152(class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475, class107_sub1.width / 2, 16776960, i_26_);
					}
					class107_sub1.method910(-(class107_sub1.width >> 1) + class120_sub14_sub5.anInt3478, class120_sub14_sub5.anInt3475 - (class107_sub1.height >> 1));
					class120_sub16.anInt2604 = (class107_sub1.height >> 1) + i_18_ + class120_sub14_sub5.anInt3475;
					class120_sub16.anInt2602 = -(class107_sub1.width >> 1) + i + class120_sub14_sub5.anInt3478;
					class120_sub16.anInt2605 = (class107_sub1.width >> 1) + i + class120_sub14_sub5.anInt3478;
					class120_sub16.anInt2603 = i_18_ + class120_sub14_sub5.anInt3475 - (class107_sub1.height >> 1);
				}
			}
			if (class73.aString649 != null) {
				if (class107_sub1 != null) {
					Class120_Sub19.method1673(class120_sub14_sub5, i, 5 + (class107_sub1.height >> 1), i_18_, false, 0, class120_sub16, class73);
				} else {
					Class120_Sub19.method1673(class120_sub14_sub5, i, 0, i_18_, true, 0, class120_sub16, class73);
				}
			}
			if (class120_sub16.method1656(Queue.lastMouseX, -101, Class191.lastMouseY) && class73.aStringArray646 != null) {
				if (class73.aStringArray646[4] != null) {
					InvType.addMenuOption(class73.aStringArray646[4], class73.aString645, class120_sub14_sub5.anInt3473, class73.anInt652, 0, (short) 1011, -1);
				}
				if (class73.aStringArray646[3] != null) {
					InvType.addMenuOption(class73.aStringArray646[3], class73.aString645, class120_sub14_sub5.anInt3473, class73.anInt652, 0, (short) 1003, -1);
				}
				if (class73.aStringArray646[2] != null) {
					InvType.addMenuOption(class73.aStringArray646[2], class73.aString645, class120_sub14_sub5.anInt3473, class73.anInt652, 0, (short) 1008, -1);
				}
				if (class73.aStringArray646[1] != null) {
					InvType.addMenuOption(class73.aStringArray646[1], class73.aString645, class120_sub14_sub5.anInt3473, class73.anInt652, 0, (short) 1002, -1);
				}
				if (class73.aStringArray646[0] != null) {
					InvType.addMenuOption(class73.aStringArray646[0], class73.aString645, class120_sub14_sub5.anInt3473, class73.anInt652, 0, (short) 1012, -1);
				}
			}
			Class73.aClass105_653.addLast(class120_sub16);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vc.TC(").append(i).append(',').append(bool).append(',').append(class120_sub14_sub5 != null ? "{...}" : "null").append(',').append(i_18_).append(',').append(class73 != null ? "{...}" : "null").append(')')
					.toString());
		}
	}

	static final void method2272(final int i, final int i_27_, final JagexInterface jagexInterface, final int i_28_) {
		try {
			if (jagexInterface.aByte2051 == 0) {
				jagexInterface.x = jagexInterface.originalX;
			} else if (jagexInterface.aByte2051 == 1) {
				jagexInterface.x = jagexInterface.originalX + (-jagexInterface.width + i) / 2;
			} else if (jagexInterface.aByte2051 == 2) {
				jagexInterface.x = -jagexInterface.originalX + -jagexInterface.width + i;
			} else if (jagexInterface.aByte2051 == 3) {
				jagexInterface.x = jagexInterface.originalX * i >> 14;
			} else if (jagexInterface.aByte2051 == 4) {
				jagexInterface.x = (jagexInterface.originalX * i >> 14) + (i - jagexInterface.width) / 2;
			} else {
				jagexInterface.x = -(i * jagexInterface.originalX >> 14) + -jagexInterface.width + i;
			}
			if (jagexInterface.aByte2017 != 0) {
				if (jagexInterface.aByte2017 == 1) {
					jagexInterface.y = jagexInterface.originalY + (-jagexInterface.height + i_27_) / 2;
				} else if (jagexInterface.aByte2017 == 2) {
					jagexInterface.y = i_27_ + -jagexInterface.height - jagexInterface.originalY;
				} else if (jagexInterface.aByte2017 == 3) {
					jagexInterface.y = i_27_ * jagexInterface.originalY >> 14;
				} else if (jagexInterface.aByte2017 != 4) {
					jagexInterface.y = -(jagexInterface.originalY * i_27_ >> 14) + i_27_ + -jagexInterface.height;
				} else {
					jagexInterface.y = (jagexInterface.originalY * i_27_ >> 14) + (i_27_ - jagexInterface.height) / 2;
				}
			} else {
				jagexInterface.y = jagexInterface.originalY;
			}
			if (i_28_ >= 92 && Class120_Sub30_Sub1.aBoolean3673 && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
				if (jagexInterface.y < 0) {
					jagexInterface.y = 0;
				} else if (jagexInterface.height + jagexInterface.y > i_27_) {
					jagexInterface.y = -jagexInterface.height + i_27_;
				}
				if (jagexInterface.x < 0) {
					jagexInterface.x = 0;
				} else if (i < jagexInterface.x - -jagexInterface.width) {
					jagexInterface.x = i + -jagexInterface.width;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vc.QC(").append(i).append(',').append(i_27_).append(',').append(jagexInterface != null ? "{...}" : "null").append(',').append(i_28_).append(')').toString());
		}
	}

	abstract int getMaxY();

	static final void method2274(final js5 js5, final int i) {
		try {
			Class3.aClass50_55 = js5;
			if (i != 2) {
				method2271(-63, false, null, -6, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vc.SC(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
