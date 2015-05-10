/* Class143_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143_Sub1 extends Class143 implements Interface5 {
	private int anInt2190;
	private boolean aBoolean2191 = false;
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
		return client.aBoolean566;
	}

	final void method2022(final boolean bool) {
		aBoolean2191 = bool;
		method2025();
	}

	@Override
	public final int method24(final int i) {
		return method8(i).aByte1102 & 0xff;
	}

	@Override
	public final boolean method16(final int i) {
		return method8(i).aBoolean1096;
	}

	final void method2023(final int i) {
		for (Class120_Sub14_Sub17 class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.getFirst(); class120_sub14_sub17 != null; class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.getNext()) {
			if (class120_sub14_sub17.aBoolean3604) {
				class120_sub14_sub17.method1573(i);
				class120_sub14_sub17.aBoolean3604 = false;
			}
		}
	}

	@Override
	public final boolean method15(final int i) {
		return !method8(i).aBoolean1108;
	}

	@Override
	public final int method29(final int i) {
		return method8(i).aByte1104 & 0xff;
	}

	@Override
	public final int[] method23(final int i) {
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
		if (class120_sub14_sub17 == null) {
			return null;
		}
		return class120_sub14_sub17.method1570(this, aClass50_2196, aBoolean2191 || method8(i).aBoolean1100);
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
	public final LDSprite method26(final boolean bool, final float f, final int i, final int i_11_) {
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_11_);
		if (class120_sub14_sub17 == null || !class120_sub14_sub17.method1575(this, aClass50_2196)) {
			return null;
		}
		if (!bool) {
			return class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1525(f, i, this, aClass50_2196, i, false);
		}
		return class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1530(i, this, aClass50_2196, f, i, false);
	}

	@Override
	public final boolean method27(final int i_12_) {
		if (aBoolean2191 || method8(i_12_).aBoolean1100) {
			return true;
		}
		return false;
	}

	final void method2025() {
		aClass35_2198.clear();
		if (aClass35_2193 != null) {
			aClass35_2193.clear();
		}
		Class120_Sub14_Sub17.anIntArray3596 = null;
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
	public final int method20(final int i) {
		return method8(i).aShort1106 & 0xffff;
	}

	@Override
	public final boolean method22(final int i) {
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
		if (class120_sub14_sub17 == null) {
			return false;
		}
		return class120_sub14_sub17.method1575(this, aClass50_2196);
	}

	static final void method2027(final int interfaceX, final int interfaceY, final int interfaceWidth, final int interfaceHeight, final int i_19_, final int i_21_) {
		final HintIcon[] hintIcons = Class187.hintIcons;
		for (int id = 0; id < hintIcons.length; id++) {
			final HintIcon hintIcon = hintIcons[id];
			if (hintIcon != null && hintIcon.targetType == 2) {
				MapFunctionGroup.worldToScreen((hintIcon.x - GameEntity.currentBaseX << 7) + hintIcon.offX, hintIcon.y * 2, (hintIcon.z - Class181.currentBaseZ << 7) + hintIcon.offY, interfaceWidth >> 1, interfaceHeight >> 1, i_21_, i_19_);
				if (Class120_Sub12_Sub38.screenX > -1 && Class101_Sub2.loopCycle % 20 < 10) {
					AnimatedLocation.hintHeadIconsSprites[hintIcon.iconType].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - 28);
				}
			}
		}
	}

	final void method2028(final int i) {
		anInt2190 = i;
		aClass35_2198 = new NodeCache(anInt2190);
		if (!HDToolkit.glEnabled) {
			aClass35_2193 = null;
		} else {
			aClass35_2193 = new NodeCache(anInt2190);
		}
	}

	@Override
	public final boolean method17(final int i_28_) {
		return method8(i_28_).aBoolean1101;
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
	public final void method28(final int i_31_, final int i_32_) {
		Class120_Sub14_Sub13.method1532(method8(i_32_).aByte1103 & 0xff, 0xff & method8(i_32_).aByte1104);
		boolean bool = false;
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_32_);
		if (class120_sub14_sub17 != null) {
			bool = class120_sub14_sub17.method1576(this, aClass50_2196, i_31_);
		}
		if (!bool) {
			final Class120_Sub14_Sub15 class120_sub14_sub15 = method2030(i_32_);
			class120_sub14_sub15.method1559();
		}
	}

	@Override
	public final int method21(final int i_33_) {
		return method8(i_33_).aByte1105 & 0xff;
	}

	static final int method2029(final js5 js5, final js5 class50_35_) {
		int i_37_ = 0;
		if (class50_35_.method429(MagnetType.p11fullId)) {
			i_37_++;
		}
		if (class50_35_.method429(Class191.p12fullId)) {
			i_37_++;
		}
		if (class50_35_.method429(Class110.b12fullId)) {
			i_37_++;
		}
		if (js5.method429(MagnetType.p11fullId)) {
			i_37_++;
		}
		if (js5.method429(Class191.p12fullId)) {
			i_37_++;
		}
		if (js5.method429(Class110.b12fullId)) {
			i_37_++;
		}
		return i_37_;
	}

	@Override
	final Class120_Sub14_Sub13 method2016(final int i) {
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i);
		return class120_sub14_sub17 == null ? null : class120_sub14_sub17.aClass120_Sub14_Sub13_3602;
	}

	private final Class120_Sub14_Sub15 method2030(final int i_38_) {
		Class120_Sub14_Sub15 class120_sub14_sub15_39_ = (Class120_Sub14_Sub15) aClass35_2193.get(i_38_);
		if (class120_sub14_sub15_39_ != null) {
			return class120_sub14_sub15_39_;
		}
		class120_sub14_sub15_39_ = new Class120_Sub14_Sub15(method8(i_38_).aShort1106 & 0xffff);
		aClass35_2193.put(class120_sub14_sub15_39_, i_38_);
		return class120_sub14_sub15_39_;
	}

	@Override
	public final void method25(final int i_40_) {
		method28(aBoolean2191 || method8(i_40_).aBoolean1100 ? 64 : 128, i_40_);
	}

	@Override
	public final int[] method19(final float f, final int i_41_) {
		final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_41_);
		if (class120_sub14_sub17 == null) {
			return null;
		}
		class120_sub14_sub17.aBoolean3604 = true;
		return class120_sub14_sub17.method1572(this, aClass50_2196, f, aBoolean2191 || method8(i_41_).aBoolean1100);
	}

	@Override
	public final int method18(final int i) {
		return method8(i).aByte1103 & 0xff;
	}

	static final void method2032(final JagexInterface jagexInterface) {
		final int clientCode = jagexInterface.clientCode;
		if (clientCode == 324) {
			if (Class120_Sub12_Sub15.anInt3241 == -1) {
				ModelParticleMagnet.anInt1643 = jagexInterface.enabledSpriteId;
				Class120_Sub12_Sub15.anInt3241 = jagexInterface.disabledSpriteId;
			}
			if (!Normal.aClass144_159.isFemale) {
				jagexInterface.disabledSpriteId = ModelParticleMagnet.anInt1643;
			} else {
				jagexInterface.disabledSpriteId = Class120_Sub12_Sub15.anInt3241;
			}
		} else if (clientCode == 325) {
			if (Class120_Sub12_Sub15.anInt3241 == -1) {
				Class120_Sub12_Sub15.anInt3241 = jagexInterface.disabledSpriteId;
				ModelParticleMagnet.anInt1643 = jagexInterface.enabledSpriteId;
			}
			if (!Normal.aClass144_159.isFemale) {
				jagexInterface.disabledSpriteId = Class120_Sub12_Sub15.anInt3241;
			} else {
				jagexInterface.disabledSpriteId = ModelParticleMagnet.anInt1643;
			}
		} else if (clientCode == 327) {
			jagexInterface.rotateX = 150;
			jagexInterface.rotateY = (int) (Math.sin(Class101_Sub2.loopCycle / 40.0) * 256.0) & 0x7ff;
			jagexInterface.modelIdDisabled = -1;
			jagexInterface.modelTypeDisabled = 5;
		} else if (clientCode == 328) {
			if (TileParticleQueue.selfPlayer.name == null) {
				jagexInterface.modelIdDisabled = 0;
			} else {
				jagexInterface.rotateX = 150;
				jagexInterface.rotateY = 0x7ff & (int) (256.0 * Math.sin(Class101_Sub2.loopCycle / 40.0));
				jagexInterface.modelTypeDisabled = 5;
				jagexInterface.modelIdDisabled = 2047 + ((int) Varp.stringToLong(TileParticleQueue.selfPlayer.name) << 11);
				jagexInterface.currentFrame = TileParticleQueue.selfPlayer.idleAnimFrame;
				jagexInterface.disabledAnim = TileParticleQueue.selfPlayer.idleAnimId;
				jagexInterface.nextFrame = TileParticleQueue.selfPlayer.idleAnimNextFrame;
				jagexInterface.frameDelay = 0;
			}
		}
	}
}
