/* Class143_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143_Sub1 extends Class143 implements Interface5 {
	private int anInt2190;
	private boolean aBoolean2191 = false;
	static String aString2192 = "Your ignore list is full. Max of 100 users.";
	private NodeCache aClass35_2193;
	private final js5 aClass50_2194;
	static int[][][] anIntArrayArrayArray2195 = new int[2][][];
	private js5 aClass50_2196;
	static int anInt2197;
	private NodeCache aClass35_2198;

	static final boolean method2021() {
		if (HDToolkit.glEnabled) {
			return true;
		}
		return Class61.aBoolean566;
	}

	final void method2022(final boolean bool, final int i) {
		aBoolean2191 = bool;
		method2025(-126);
	}

	@Override
	public final int method24(final int i, final boolean bool) {
		int i_1_;
		try {
			if (bool) {
				return -41;
			}
			i_1_ = method8(i).aByte1102 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.I(").append(i).append(',').append(bool).append(')').toString());
		}
		return i_1_;
	}

	@Override
	public final boolean method16(final int i, final byte i_2_) {
		boolean bool;
		try {
			if (i_2_ != 26) {
				return true;
			}
			bool = method8(i).aBoolean1096;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.V(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return bool;
	}

	final void method2023(final int i, final int i_3_) {
		try {
			if (i_3_ > -2) {
				anInt2190 = -23;
			}
			for (Class120_Sub14_Sub17 class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.getFirst(); class120_sub14_sub17 != null; class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.getNext()) {
				if (class120_sub14_sub17.aBoolean3604) {
					class120_sub14_sub17.method1573(i);
					class120_sub14_sub17.aBoolean3604 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.N(").append(i).append(',').append(i_3_).append(')').toString());
		}
	}

	@Override
	public final boolean method15(final int i, final int i_4_) {
		boolean bool;
		try {
			if (i_4_ != 0) {
				return true;
			}
			bool = !method8(i).aBoolean1108;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.CA(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return bool;
	}

	@Override
	public final int method29(final int i, final int i_5_) {
		int i_6_;
		try {
			i_6_ = method8(i).aByte1104 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.T(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return i_6_;
	}

	@Override
	public final int[] method23(final int i, final byte i_7_) {
		int[] is;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
			if (class120_sub14_sub17 == null) {
				return null;
			}
			is = class120_sub14_sub17.method1570(this, aClass50_2196, aBoolean2191 || method8(i).aBoolean1100);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.E(").append(i).append(',').append(i_7_).append(')').toString());
		}
		return is;
	}

	private final Class120_Sub14_Sub17 method2024(final int i) {
		Class120_Sub14_Sub17 class120_sub14_sub17_9_ = (Class120_Sub14_Sub17) aClass35_2198.get(i);
		if (class120_sub14_sub17_9_ != null) {
			return class120_sub14_sub17_9_;
		}
		final byte[] is = aClass50_2194.getFile(i, 0);
		if (is == null) {
			return null;
		}
		class120_sub14_sub17_9_ = new Class120_Sub14_Sub17(new Buffer(is));
		aClass35_2198.put(class120_sub14_sub17_9_, i);
		return class120_sub14_sub17_9_;
	}

	@Override
	public final LDSprite method26(final boolean bool, final float f, final boolean bool_10_, final int i, final int i_11_) {
		LDTransparentSprite class120_sub14_sub19_sub2_sub1;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_11_);
			if (class120_sub14_sub17 == null || !class120_sub14_sub17.method1575(this, aClass50_2196)) {
				return null;
			}
			if (bool_10_) {
				return null;
			}
			if (!bool) {
				return class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1525(f, -37, i, this, aClass50_2196, i, false);
			}
			class120_sub14_sub19_sub2_sub1 = class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1530(i, this, aClass50_2196, -127, f, i, false);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.J(").append(bool).append(',').append(f).append(',').append(bool_10_).append(',').append(i).append(',').append(i_11_).append(')').toString());
		}
		return class120_sub14_sub19_sub2_sub1;
	}

	@Override
	public final boolean method27(final int i, final int i_12_) {
		boolean bool;
		try {
			if (aBoolean2191 || method8(i_12_).aBoolean1100) {
				return true;
			}
			if (i != 0) {
				aString2192 = null;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.R(").append(i).append(',').append(i_12_).append(')').toString());
		}
		return bool;
	}

	final void method2025(final int i) {
		try {
			aClass35_2198.clear();
			if (aClass35_2193 != null) {
				aClass35_2193.clear();
			}
			Class120_Sub14_Sub17.anIntArray3596 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.AA(").append(i).append(')').toString());
		}
	}

	static final Object method2026(final byte[] is, final boolean bool, final int i) {
		if (is == null) {
			return null;
		}
		if (is.length > i && !AmbientSound.aBoolean2484) {
			try {
				final AbstractBuffer abstractBuffer = (AbstractBuffer) Class.forName("JByteBuffer").newInstance();
				abstractBuffer.put(is);
				return abstractBuffer;
			} catch (final Throwable throwable) {
				AmbientSound.aBoolean2484 = true;
			}
		}
		if (!bool) {
			return is;
		}
		return ObjectPile.copyBuffer(is);
	}

	@Override
	public final int method20(final int i, final int i_15_) {
		int i_16_;
		try {
			if (i_15_ != 65535) {
				return -126;
			}
			i_16_ = method8(i).aShort1106 & 0xffff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.HA(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return i_16_;
	}

	@Override
	public final boolean method22(final int i, final boolean bool) {
		boolean bool_17_;
		try {
			if (!bool) {
				anIntArrayArrayArray2195 = null;
			}
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
			if (class120_sub14_sub17 == null) {
				return false;
			}
			bool_17_ = class120_sub14_sub17.method1575(this, aClass50_2196);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.H(").append(i).append(',').append(bool).append(')').toString());
		}
		return bool_17_;
	}

	static final void method2027(final int x, final int y, final int width, final int height, final int i_19_, final int i_21_) {
		final HintIcon[] class85s = Class187.hintIcons;
		for (int i_26_ = 0; i_26_ < class85s.length; i_26_++) {
			final HintIcon hintIcon = class85s[i_26_];
			if (hintIcon != null && hintIcon.targetType == 2) {
				Class137.method1982(height >> 1, 2 * hintIcon.y, i_21_, (hintIcon.x + -GameEntity.currentBaseX << 7) + hintIcon.anInt812, hintIcon.anInt815 + (-Class181.currentBaseZ + hintIcon.z << 7), i_19_, width >> 1);
				if ((Class120_Sub12_Sub38.anInt3434 ^ 0xffffffff) < 0 && Class101_Sub2.loopCycle % 20 < 10) {
					AnimatedLocation.aClass120_Sub14_Sub19Array3073[hintIcon.iconType].method1587(-12 + x + Class120_Sub12_Sub38.anInt3434, Class120_Sub15.anInt2588 + y - 28);
				}
			}
		}
	}

	final void method2028(final int i, final byte i_27_) {
		try {
			if (i_27_ == -111) {
				anInt2190 = i;
				aClass35_2198 = new NodeCache(anInt2190);
				if (!HDToolkit.glEnabled) {
					aClass35_2193 = null;
				} else {
					aClass35_2193 = new NodeCache(anInt2190);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.M(").append(i).append(',').append(i_27_).append(')').toString());
		}
	}

	@Override
	public final boolean method17(final int i, final int i_28_) {
		boolean bool;
		try {
			if (i != -1) {
				aBoolean2191 = true;
			}
			bool = method8(i_28_).aBoolean1101;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.Q(").append(i).append(',').append(i_28_).append(')').toString());
		}
		return bool;
	}

	Class143_Sub1(final js5 js5, final js5 class50_29_, final js5 class50_30_, final int i, final boolean bool) {
		super(class50_29_, js5, class50_30_);
		anInt2190 = 50;
		anInt2190 = i;
		aClass50_2196 = class50_30_;
		aClass50_2194 = js5;
		aBoolean2191 = bool;
		aClass35_2198 = new NodeCache(anInt2190);
		if (!HDToolkit.glEnabled) {
			aClass35_2193 = null;
		} else {
			aClass35_2193 = new NodeCache(anInt2190);
		}
	}

	@Override
	public final void method28(final byte i, final int i_31_, final int i_32_) {
		try {
			Class120_Sub14_Sub13.method1532(method8(i_32_).aByte1103 & 0xff, 0xff & method8(i_32_).aByte1104);
			if (i >= -86) {
				method29(51, 122);
			}
			boolean bool = false;
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_32_);
			if (class120_sub14_sub17 != null) {
				bool = class120_sub14_sub17.method1576(this, aClass50_2196, i_31_);
			}
			if (!bool) {
				final Class120_Sub14_Sub15 class120_sub14_sub15 = method2030(-926489461, i_32_);
				class120_sub14_sub15.method1559();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.K(").append(i).append(',').append(i_31_).append(',').append(i_32_).append(')').toString());
		}
	}

	@Override
	public final int method21(final byte i, final int i_33_) {
		int i_34_;
		try {
			if (i != -119) {
				return -42;
			}
			i_34_ = method8(i_33_).aByte1105 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.BA(").append(i).append(',').append(i_33_).append(')').toString());
		}
		return i_34_;
	}

	static final int method2029(final js5 js5, final js5 class50_35_, final int i) {
		int i_36_;
		try {
			int i_37_ = 0;
			if (class50_35_.method429(Class32.p11fullId)) {
				i_37_++;
			}
			if (class50_35_.method429(Class191.p12fullId)) {
				i_37_++;
			}
			if (class50_35_.method429(Class110.b12fullId)) {
				i_37_++;
			}
			if (js5.method429(Class32.p11fullId)) {
				i_37_++;
			}
			if (js5.method429(Class191.p12fullId)) {
				i_37_++;
			}
			if (i != -23185) {
				return -119;
			}
			if (js5.method429(Class110.b12fullId)) {
				i_37_++;
			}
			i_36_ = i_37_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.P(").append(js5 != null ? "{...}" : "null").append(',').append(class50_35_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_36_;
	}

	@Override
	final Class120_Sub14_Sub13 method2016(final int i, final boolean bool) {
		Class120_Sub14_Sub13 class120_sub14_sub13;
		try {
			if (!bool) {
				return null;
			}
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
			class120_sub14_sub13 = class120_sub14_sub17 == null ? null : class120_sub14_sub17.aClass120_Sub14_Sub13_3602;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.O(").append(i).append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub13;
	}

	private final Class120_Sub14_Sub15 method2030(final int i, final int i_38_) {
		Class120_Sub14_Sub15 class120_sub14_sub15_39_ = (Class120_Sub14_Sub15) aClass35_2193.get(i_38_);
		if (class120_sub14_sub15_39_ != null) {
			return class120_sub14_sub15_39_;
		}
		class120_sub14_sub15_39_ = new Class120_Sub14_Sub15(method8(i_38_).aShort1106 & 0xffff);
		aClass35_2193.put(class120_sub14_sub15_39_, i_38_);
		return class120_sub14_sub15_39_;
	}

	@Override
	public final void method25(final int i, final int i_40_) {
		try {
			method28((byte) -101, aBoolean2191 || method8(i_40_).aBoolean1100 ? 64 : 128, i_40_);
			if (i != 64) {
				aClass50_2196 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.U(").append(i).append(',').append(i_40_).append(')').toString());
		}
	}

	public static void method2031(final byte i) {
		try {
			anIntArrayArrayArray2195 = null;
			aString2192 = null;
			if (i < 61) {
				anInt2197 = -77;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.D(").append(i).append(')').toString());
		}
	}

	@Override
	public final int[] method19(final float f, final int i, final int i_41_) {
		int[] is;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_41_);
			if (i != 274092135) {
				aClass50_2196 = null;
			}
			if (class120_sub14_sub17 == null) {
				return null;
			}
			class120_sub14_sub17.aBoolean3604 = true;
			is = class120_sub14_sub17.method1572(this, aClass50_2196, f, aBoolean2191 || method8(i_41_).aBoolean1100);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.L(").append(f).append(',').append(i).append(',').append(i_41_).append(')').toString());
		}
		return is;
	}

	@Override
	public final int method18(final int i, final int i_42_) {
		int i_43_;
		try {
			if (i_42_ != 255) {
				aString2192 = null;
			}
			i_43_ = method8(i).aByte1103 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("c.GA(").append(i).append(',').append(i_42_).append(')').toString());
		}
		return i_43_;
	}

	static final void method2032(final JagexInterface jagexInterface) {
		final int i_44_ = jagexInterface.clientCode;
		if (i_44_ == 324) {
			if (Class120_Sub12_Sub15.anInt3241 == -1) {
				Class169.anInt1643 = jagexInterface.enabledSpriteId;
				Class120_Sub12_Sub15.anInt3241 = jagexInterface.disabledSpriteId;
			}
			if (!Class26.aClass144_159.isFemale) {
				jagexInterface.disabledSpriteId = Class169.anInt1643;
			} else {
				jagexInterface.disabledSpriteId = Class120_Sub12_Sub15.anInt3241;
			}
		} else {
			if (i_44_ == 325) {
				if (Class120_Sub12_Sub15.anInt3241 == -1) {
					Class120_Sub12_Sub15.anInt3241 = jagexInterface.disabledSpriteId;
					Class169.anInt1643 = jagexInterface.enabledSpriteId;
				}
				if (!Class26.aClass144_159.isFemale) {
					jagexInterface.disabledSpriteId = Class120_Sub12_Sub15.anInt3241;
				} else {
					jagexInterface.disabledSpriteId = Class169.anInt1643;
				}
			} else if (i_44_ == 327) {
				jagexInterface.rotateX = 150;
				jagexInterface.rotateY = (int) (Math.sin(Class101_Sub2.loopCycle / 40.0) * 256.0) & 0x7ff;
				jagexInterface.mediaIdDisabled = -1;
				jagexInterface.modelTypeDisabled = 5;
			} else if (i_44_ == 328) {
				if (TileParticleQueue.selfPlayer.name == null) {
					jagexInterface.mediaIdDisabled = 0;
				} else {
					jagexInterface.rotateX = 150;
					jagexInterface.rotateY = 0x7ff & (int) (256.0 * Math.sin(Class101_Sub2.loopCycle / 40.0));
					jagexInterface.modelTypeDisabled = 5;
					jagexInterface.mediaIdDisabled = 2047 + ((int) Varp.stringToLong(TileParticleQueue.selfPlayer.name) << 11);
					jagexInterface.currentFrame = TileParticleQueue.selfPlayer.anInt3046;
					jagexInterface.disabledAnim = TileParticleQueue.selfPlayer.anInt3004;
					jagexInterface.nextFrame = TileParticleQueue.selfPlayer.anInt3021;
					jagexInterface.frameDelay = 0;
				}
			}
		}
	}
}
