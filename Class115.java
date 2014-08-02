/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 {
	int anInt1109;
	static int anInt1110;
	int anInt1111;
	int anInt1112;

	static final void method1007(int i, final int i_0_, int i_1_, final int i_2_, final int i_3_, final byte[][][] is, final int[] is_4_, final int[] is_5_, final int[] is_6_, final int[] is_7_, final int[] is_8_, final int i_9_, final byte i_10_, final int i_11_, final int i_12_) {
		if (i < 0) {
			i = 0;
		} else if (i >= Class186.anInt1900 * 128) {
			i = Class186.anInt1900 * 128 - 1;
		}
		if (i_1_ < 0) {
			i_1_ = 0;
		} else if (i_1_ >= Class120_Sub12_Sub38.anInt3440 * 128) {
			i_1_ = Class120_Sub12_Sub38.anInt3440 * 128 - 1;
		}
		Class69_Sub2.anInt2239 = Rasterizer.sineTable[i_2_];
		ObjectContainer.anInt2616 = Rasterizer.cosineTable[i_2_];
		Class120_Sub12_Sub30.anInt3377 = Rasterizer.sineTable[i_3_];
		MapFunctionType.anInt637 = Rasterizer.cosineTable[i_3_];
		DisplayModeInfo.anInt1713 = i;
		PlayerAppearance.anInt1367 = i_0_;
		Class145.anInt1381 = i_1_;
		Class120_Sub12_Sub26.anInt3332 = i / 128;
		Class112.anInt1080 = i_1_ / 128;
		GrandExchangeObject.anInt1493 = Class120_Sub12_Sub26.anInt3332 - Class120_Sub14_Sub13.anInt3563;
		if (GrandExchangeObject.anInt1493 < 0) {
			GrandExchangeObject.anInt1493 = 0;
		}
		Class31.anInt248 = Class112.anInt1080 - Class120_Sub14_Sub13.anInt3563;
		if (Class31.anInt248 < 0) {
			Class31.anInt248 = 0;
		}
		Class53.anInt487 = Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
		if (Class53.anInt487 > Class186.anInt1900) {
			Class53.anInt487 = Class186.anInt1900;
		}
		Js5Worker.anInt396 = Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
		if (Js5Worker.anInt396 > Class120_Sub12_Sub38.anInt3440) {
			Js5Worker.anInt396 = Class120_Sub12_Sub38.anInt3440;
		}
		int i_13_;
		if (HDToolkit.glEnabled) {
			i_13_ = 3584;
		} else {
			i_13_ = 3500;
		}
		for (int i_14_ = 0; i_14_ < Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2; i_14_++) {
			for (int i_15_ = 0; i_15_ < Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2; i_15_++) {
				final int i_16_ = (i_14_ - Class120_Sub14_Sub13.anInt3563 << 7) - (DisplayModeInfo.anInt1713 & 0x7f);
				final int i_17_ = (i_15_ - Class120_Sub14_Sub13.anInt3563 << 7) - (Class145.anInt1381 & 0x7f);
				final int i_18_ = Class120_Sub12_Sub26.anInt3332 - Class120_Sub14_Sub13.anInt3563 + i_14_;
				final int i_19_ = Class112.anInt1080 - Class120_Sub14_Sub13.anInt3563 + i_15_;
				if (i_18_ >= 0 && i_19_ >= 0 && i_18_ < Class186.anInt1900 && i_19_ < Class120_Sub12_Sub38.anInt3440) {
					int i_20_;
					if (Class24.anIntArrayArrayArray140 != null) {
						i_20_ = Class24.anIntArrayArrayArray140[0][i_18_][i_19_] - PlayerAppearance.anInt1367 + 128;
					} else {
						i_20_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i_18_][i_19_] - PlayerAppearance.anInt1367 + 128;
					}
					final int i_21_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[3][i_18_][i_19_] - PlayerAppearance.anInt1367 - 1000;
					ClanMember.aBooleanArrayArray2573[i_14_][i_15_] = Class120_Sub2.method1046(i_16_, i_21_, i_20_, i_17_, i_13_);
				} else {
					ClanMember.aBooleanArrayArray2573[i_14_][i_15_] = false;
				}
			}
		}
		for (int i_22_ = 0; i_22_ < Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1; i_22_++) {
			for (int i_23_ = 0; i_23_ < Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1; i_23_++) {
				SpotAnimType.aBooleanArrayArray992[i_22_][i_23_] = ClanMember.aBooleanArrayArray2573[i_22_][i_23_] || ClanMember.aBooleanArrayArray2573[i_22_ + 1][i_23_] || ClanMember.aBooleanArrayArray2573[i_22_][i_23_ + 1] || ClanMember.aBooleanArrayArray2573[i_22_ + 1][i_23_ + 1];
			}
		}
		Class61.anIntArray562 = is_4_;
		Class31.anIntArray243 = is_5_;
		SpotAnimation.anIntArray2921 = is_6_;
		IsaacCipher.anIntArray1015 = is_7_;
		Class89.anIntArray838 = is_8_;
		JagexInterface.method2500();
		if (Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 != null) {
			Class178.method2257(true);
			StructType.method1561(i, i_0_, i_1_, null, 0, (byte) 0, i_11_, i_12_);
			if (HDToolkit.glEnabled) {
				ParamType.aBoolean3545 = false;
				Class120_Sub14_Sub13.method1532(0, 0);
				AtmosphereManager.setFogColor(null);
				LightManager.method1859();
			}
			Class178.method2257(false);
		}
		StructType.method1561(i, i_0_, i_1_, is, i_9_, i_10_, i_11_, i_12_);
	}

	static final LDSprite[] constructLDSprites(final js5 js5, final int group, final int file) {
		if (!Class10.decodedSprites(js5, group, file)) {
			return null;
		}
		return LabelGroup.constructLDSprites();
	}

	public Class115() {
		/* empty */
	}
}
