/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class IdentityKit {
	private short[] originalModelColors;
	private short[] modifiedModelColors;
	private short[] originalModelTextures;
	static int selectedSpellParam;
	boolean noInterface = false;
	private short[] modifiedModelTextures;
	private int[] models;
	static int anInt1334 = 100;
	private final int[] headModels = { -1, -1, -1, -1, -1 };
	int partId = -1;
	static ObjectCache recentUse = new ObjectCache(64);
	static Class191[][] aClass191ArrayArray1337;

	public static void method1983(final int i) {
		try {
			aClass191ArrayArray1337 = null;
			if (i != 0) {
				method1984(null, -107, -88, -101);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qa.A(").append(i).append(')').toString());
		}
	}

	static final void method1984(final Player class180_sub5_sub1, final int i_0_, final int i_1_, final int i_2_) {
		if (TileParticleQueue.selfPlayer != class180_sub5_sub1 && Class186.menuOptionCount < 400) {
			String string;
			if (class180_sub5_sub1.anInt3737 == 0) {
				boolean bool = true;
				if ((TileParticleQueue.selfPlayer.anInt3738 ^ 0xffffffff) != 0 && (class180_sub5_sub1.anInt3738 ^ 0xffffffff) != 0) {
					final int i_3_ = class180_sub5_sub1.combatLevel >= TileParticleQueue.selfPlayer.combatLevel ? class180_sub5_sub1.combatLevel : TileParticleQueue.selfPlayer.combatLevel;
					final int i_4_ = TileParticleQueue.selfPlayer.anInt3738 >= class180_sub5_sub1.anInt3738 ? class180_sub5_sub1.anInt3738 : TileParticleQueue.selfPlayer.anInt3738;
					final int i_5_ = 10 * i_3_ / 100 + 5 - -i_4_;
					int i_6_ = -class180_sub5_sub1.combatLevel + TileParticleQueue.selfPlayer.combatLevel;
					if (i_6_ < 0) {
						i_6_ = -i_6_;
					}
					if (i_5_ < i_6_) {
						bool = false;
					}
				}
				final String string_7_ = Buffer.gameId != 1 ? Class120_Sub12_Sub21_Sub1.aString3911 : Class120_Sub3.aString2424;
				if (class180_sub5_sub1.anInt3733 <= class180_sub5_sub1.combatLevel) {
					string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(!bool ? "<col=ffffff>" : Class81.method704(TileParticleQueue.selfPlayer.combatLevel, (byte) -109, class180_sub5_sub1.combatLevel)).append(" (").append(string_7_).append(class180_sub5_sub1.combatLevel).append(")").toString();
				} else {
					string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(bool ? Class81.method704(TileParticleQueue.selfPlayer.combatLevel, (byte) -109, class180_sub5_sub1.combatLevel) : "<col=ffffff>").append(" (").append(string_7_).append(class180_sub5_sub1.combatLevel).append("+").append(-class180_sub5_sub1.combatLevel + class180_sub5_sub1.anInt3733).append(")").toString();
				}
			} else {
				string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(" (").append(Class174.aString1733).append(class180_sub5_sub1.anInt3737).append(")").toString();
			}
			if (Light.objSelected == 1) {
				InvType.addMenuOption(AbstractGraphicsBuffer.aString1176, new StringBuilder(Class192.selectedObjName).append(" -> <col=ffffff>").append(string).toString(), i_1_, i_2_, i_0_, (short) 21, Class120_Sub12_Sub10.anInt3205);
			} else if (Class88.spellSelected) {
				if ((0x8 & GroundTile.selectedSpellUseMask) != 0) {
						InvType.addMenuOption(Class101.aString963, new StringBuilder(Light.aString369).append(" -> <col=ffffff>").append(string).toString(), i_1_, i_2_, i_0_, (short) 5, Class150.selectedSpellTargetCursor);
					}
				} else {
					for (int i_8_ = 7; i_8_ >= 0; i_8_--) {
						if (Buffer.playerOptions[i_8_] != null) {
							short i_9_ = 0;
							if (Buffer.gameId == 0 && Buffer.playerOptions[i_8_].equalsIgnoreCase(Class65.aString591)) {
								if (TileParticleQueue.selfPlayer.combatLevel < class180_sub5_sub1.combatLevel) {
									i_9_ = (short) 2000;
								}
								if (TileParticleQueue.selfPlayer.team != 0 && class180_sub5_sub1.team != 0) {
									if (class180_sub5_sub1.team == TileParticleQueue.selfPlayer.team) {
										i_9_ = (short) 2000;
									} else {
										i_9_ = (short) 0;
									}
								}
							} else if (InterfaceListener.playerOptionsOnTop[i_8_]) {
								i_9_ = (short) 2000;
							}
							short i_10_ = JagexInterface.aShortArray2042[i_8_];
							i_10_ += i_9_;
							InvType.addMenuOption(Buffer.playerOptions[i_8_], new StringBuilder("<col=ffffff>").append(string).toString(), i_1_, i_2_, i_0_, i_10_, AbstractRequest.playerOptionsIcon[i_8_]);
						}
					}
				}
				for (int i_11_ = 0; Class186.menuOptionCount > i_11_; i_11_++) {
					if (Class120_Sub29.aShortArray2777[i_11_] == 26) {
						Class120_Sub12_Sub29.menuOptionSufix[i_11_] = new StringBuilder("<col=ffffff>").append(string).toString();
						break;
					}
				}
			}
	}

	final Class180_Sub2 method1985() {
		final Class180_Sub2[] class180_sub2s = new Class180_Sub2[5];
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < 5; i_13_++) {
			if (headModels[i_13_] != -1) {
				class180_sub2s[i_12_++] = Class180_Sub2.method2291(SceneGroundObject.aClass50_2839, headModels[i_13_], 0);
			}
		}
		final Class180_Sub2 class180_sub2_14_ = new Class180_Sub2(class180_sub2s, i_12_);
		if (originalModelColors != null) {
			for (int i_15_ = 0; originalModelColors.length > i_15_; i_15_++) {
				class180_sub2_14_.recolor(originalModelColors[i_15_], modifiedModelColors[i_15_]);
			}
		}
		if (originalModelTextures != null) {
			for (int i_16_ = 0; i_16_ < originalModelTextures.length; i_16_++) {
				class180_sub2_14_.retexture(originalModelTextures[i_16_], modifiedModelTextures[i_16_]);
			}
		}
		return class180_sub2_14_;
	}

	final Class180_Sub2 method1986(final byte i) {
		Class180_Sub2 class180_sub2;
		try {
			if (models == null) {
				return null;
			}
			final Class180_Sub2[] class180_sub2s = new Class180_Sub2[models.length];
			if (i < 85) {
				decode(null, -112);
			}
			for (int i_17_ = 0; models.length > i_17_; i_17_++) {
				class180_sub2s[i_17_] = Class180_Sub2.method2291(SceneGroundObject.aClass50_2839, models[i_17_], 0);
			}
			Class180_Sub2 class180_sub2_18_;
			if (class180_sub2s.length != 1) {
				class180_sub2_18_ = new Class180_Sub2(class180_sub2s, class180_sub2s.length);
			} else {
				class180_sub2_18_ = class180_sub2s[0];
			}
			if (originalModelColors != null) {
				for (int i_19_ = 0; originalModelColors.length > i_19_; i_19_++) {
					class180_sub2_18_.recolor(originalModelColors[i_19_], modifiedModelColors[i_19_]);
				}
			}
			if (originalModelTextures != null) {
				for (int i_20_ = 0; originalModelTextures.length > i_20_; i_20_++) {
					class180_sub2_18_.retexture(originalModelTextures[i_20_], modifiedModelTextures[i_20_]);
				}
			}
			class180_sub2 = class180_sub2_18_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qa.B(").append(i).append(')').toString());
		}
		return class180_sub2;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.partId = buffer.getUByte();
		}
		if (code == 2) {
			final int modelLen = buffer.getUByte();
			models = new int[modelLen];
			for (int id = 0; id < modelLen; id++) {
				models[id] = buffer.getUShort();
			}
		}
		if (code == 3) {
			this.noInterface = true;
		}
		if (code == 40) {
			final int colorLen = buffer.getUByte();
			modifiedModelColors = new short[colorLen];
			originalModelColors = new short[colorLen];
			for (int id = 0; id < colorLen; id++) {
				originalModelColors[id] = (short) buffer.getUShort();
				modifiedModelColors[id] = (short) buffer.getUShort();
			}
		}
		if (code == 41) {
			final int textureLen = buffer.getUByte();
			modifiedModelTextures = new short[textureLen];
			originalModelTextures = new short[textureLen];
			for (int id = 0; id < textureLen; id++) {
				originalModelTextures[id] = (short) buffer.getUShort();
				modifiedModelTextures[id] = (short) buffer.getUShort();
			}
		}
		if (code >= 60 && code < 70) {
			headModels[code - 60] = buffer.getUShort();
		}
	}

	static final byte[] method1988(final Object object, final boolean newBuffer) {
		if (object == null) {
			return null;
		}
		if (object instanceof byte[]) {
			final byte[] data = (byte[]) object;
			if (newBuffer) {
				return ObjectPile.copyBuffer(data);
			}
			return data;
		}
		if (object instanceof AbstractBuffer) {
			final AbstractBuffer abstractBuffer = (AbstractBuffer) object;
			return abstractBuffer.get();
		}
		throw new IllegalArgumentException();
	}

	static final void method1989(final GroundTile class120_sub18, boolean bool) {
		AbstractTimer.aClass105_824.addLast(class120_sub18);
		for (;;) {
			final GroundTile class120_sub18_27_ = (GroundTile) AbstractTimer.aClass105_824.removeFront();
			if (class120_sub18_27_ == null) {
				break;
			}
			if (class120_sub18_27_.aBoolean2624) {
				final int i = class120_sub18_27_.anInt2632;
				final int i_28_ = class120_sub18_27_.anInt2629;
				final int i_29_ = class120_sub18_27_.anInt2636;
				final int i_30_ = class120_sub18_27_.anInt2642;
				final GroundTile[][] class120_sub18s = LabelGroup.groundTiles[i_29_];
				float f = 0.0F;
				if (HDToolkit.glEnabled) {
					if (Class24.anIntArrayArrayArray140 == OverridedJInterface.tileHeightMap) {
						final int i_31_ = NodeCache.anIntArrayArray300[i][i_28_];
						final int i_32_ = i_31_ & 0xffffff;
						if (i_32_ != Class120_Sub12_Sub19.anInt3281) {
							Class120_Sub12_Sub19.anInt3281 = i_32_;
							Class69.method614(i_32_);
							AtmosphereManager.setFogColor(Class29.method251());
						}
						final int i_33_ = i_31_ >>> 24 << 2;
						if (i_33_ != FrameLoader.anInt3612) {
							FrameLoader.anInt3612 = i_33_;
							Canvas_Sub1.method64(i_33_);
						}
						final int i_34_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_ + 1] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_ + 1] >> 2;
						Class120_Sub14_Sub13.method1532(3, -i_34_);
						f = 201.5F;
						HDToolkit.method527(f);
					} else {
						f = 201.5F - 50.0F * (i_30_ + 1);
						HDToolkit.method527(f);
					}
				}
				if (class120_sub18_27_.aBoolean2647) {
					if (bool) {
						if (i_29_ > 0) {
							final GroundTile class120_sub18_35_ = LabelGroup.groundTiles[i_29_ - 1][i][i_28_];
							if (class120_sub18_35_ != null && class120_sub18_35_.aBoolean2624) {
								continue;
							}
						}
						if (i <= Class120_Sub12_Sub26.anInt3332 && i > GrandExchangeObject.anInt1493) {
							final GroundTile class120_sub18_36_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_36_ != null && class120_sub18_36_.aBoolean2624 && (class120_sub18_36_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x1) == 0)) {
								continue;
							}
						}
						if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
							final GroundTile class120_sub18_37_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_37_ != null && class120_sub18_37_.aBoolean2624 && (class120_sub18_37_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x4) == 0)) {
								continue;
							}
						}
						if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
							final GroundTile class120_sub18_38_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_38_ != null && class120_sub18_38_.aBoolean2624 && (class120_sub18_38_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x8) == 0)) {
								continue;
							}
						}
						if (i_28_ >= Class112.anInt1080 && i_28_ < Js5Worker.anInt396 - 1) {
							final GroundTile class120_sub18_39_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_39_ != null && class120_sub18_39_.aBoolean2624 && (class120_sub18_39_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x2) == 0)) {
								continue;
							}
						}
					} else {
						bool = true;
					}
					class120_sub18_27_.aBoolean2647 = false;
					if (class120_sub18_27_.aClass120_Sub18_2644 != null) {
						final GroundTile class120_sub18_40_ = class120_sub18_27_.aClass120_Sub18_2644;
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(201.5F - 50.0F * (class120_sub18_40_.anInt2642 + 1));
						}
						if (class120_sub18_40_.aClass141_2626 != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class132_Sub2.method1942(class120_sub18_40_.aClass141_2626, 0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							} else {
								Class132_Sub2.method1942(class120_sub18_40_.aClass141_2626, 0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
							}
						} else if (class120_sub18_40_.aClass168_2640 != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class157.method2088(class120_sub18_40_.aClass168_2640, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							} else {
								Class157.method2088(class120_sub18_40_.aClass168_2640, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
							}
						}
						final Class182 class182 = class120_sub18_40_.aClass182_2628;
						if (class182 != null) {
							if (HDToolkit.glEnabled) {
								if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								} else {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							}
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						for (int i_41_ = 0; i_41_ < class120_sub18_40_.anInt2638; i_41_++) {
							final Class28 class28 = class120_sub18_40_.aClass28Array2625[i_41_];
							if (class28 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class28.aClass180_174.method2265(class28.anInt172, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					boolean bool_42_ = false;
					if (class120_sub18_27_.aClass141_2626 != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							if (class120_sub18_27_.aClass141_2626.anInt1351 != 12345678 || Class120_Sub12_Sub7.aBoolean3181 && i_29_ <= Projectile.anInt2933) {
								Class132_Sub2.method1942(class120_sub18_27_.aClass141_2626, i_30_, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							}
						} else {
							Class132_Sub2.method1942(class120_sub18_27_.aClass141_2626, i_30_, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
						}
					} else if (class120_sub18_27_.aClass168_2640 != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							Class157.method2088(class120_sub18_27_.aClass168_2640, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
						} else {
							Class157.method2088(class120_sub18_27_.aClass168_2640, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
						}
					}
					if (bool_42_) {
						final Class36 class36 = class120_sub18_27_.aClass36_2650;
						if (class36 != null && (class36.bitPacked & 0x80000000L) != 0L) {
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class36.aClass180_309.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class36.anInt311 - DisplayModeInfo.anInt1713, class36.anInt312 - PlayerAppearance.anInt1367, class36.anInt310 - Class145.anInt1381, class36.bitPacked,
									i_29_, null);
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
					}
					int i_43_ = 0;
					int i_44_ = 0;
					final Class182 class182 = class120_sub18_27_.aClass182_2628;
					final Class186 class186 = class120_sub18_27_.aClass186_2639;
					if (class182 != null || class186 != null) {
						if (Class120_Sub12_Sub26.anInt3332 == i) {
							i_43_++;
						} else if (Class120_Sub12_Sub26.anInt3332 < i) {
							i_43_ += 2;
						}
						if (Class112.anInt1080 == i_28_) {
							i_43_ += 3;
						} else if (Class112.anInt1080 > i_28_) {
							i_43_ += 6;
						}
						i_44_ = Class120_Sub15.anIntArray2591[i_43_];
						class120_sub18_27_.anInt2646 = FileSystem.anIntArray453[i_43_];
					}
					if (class182 != null) {
						if ((class182.anInt1799 & IntegerNode.anIntArray2791[i_43_]) != 0) {
							if (class182.anInt1799 == 16) {
								class120_sub18_27_.anInt2633 = 3;
								class120_sub18_27_.anInt2637 = Class157.anIntArray1461[i_43_];
								class120_sub18_27_.anInt2648 = 3 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 32) {
								class120_sub18_27_.anInt2633 = 6;
								class120_sub18_27_.anInt2637 = Class120_Sub12_Sub12.anIntArray3220[i_43_];
								class120_sub18_27_.anInt2648 = 6 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 64) {
								class120_sub18_27_.anInt2633 = 12;
								class120_sub18_27_.anInt2637 = Class121.anIntArray1152[i_43_];
								class120_sub18_27_.anInt2648 = 12 - class120_sub18_27_.anInt2637;
							} else {
								class120_sub18_27_.anInt2633 = 9;
								class120_sub18_27_.anInt2637 = Class2.anIntArray51[i_43_];
								class120_sub18_27_.anInt2648 = 9 - class120_sub18_27_.anInt2637;
							}
						} else {
							class120_sub18_27_.anInt2633 = 0;
						}
						if ((class182.anInt1799 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						if ((class182.anInt1792 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1796.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
					}
					if (class186 != null && !Js5Worker.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f - 0.5F);
						}
						if ((class186.anInt1895 & i_44_) != 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class186.anInt1893 - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.anInt1894 - PlayerAppearance.anInt1367, class186.anInt1891
									- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
						} else if (class186.anInt1895 == 256) {
							final int i_45_ = class186.anInt1893 - DisplayModeInfo.anInt1713;
							final int i_46_ = class186.anInt1894 - PlayerAppearance.anInt1367;
							final int i_47_ = class186.anInt1891 - Class145.anInt1381;
							final int i_48_ = class186.anInt1896;
							int i_49_;
							if (i_48_ == 1 || i_48_ == 2) {
								i_49_ = -i_45_;
							} else {
								i_49_ = i_45_;
							}
							int i_50_;
							if (i_48_ == 2 || i_48_ == 3) {
								i_50_ = -i_47_;
							} else {
								i_50_ = i_47_;
							}
							if (i_50_ < i_49_) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_45_ + class186.anInt1905, i_46_, i_47_ + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.aClass180_1898 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1898.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_45_, i_46_, i_47_, class186.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					if (bool_42_) {
						final Class36 class36 = class120_sub18_27_.aClass36_2650;
						if (class36 != null && (class36.bitPacked & 0x80000000L) == 0L) {
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class36.aClass180_309.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class36.anInt311 - DisplayModeInfo.anInt1713, class36.anInt312 - PlayerAppearance.anInt1367, class36.anInt310 - Class145.anInt1381, class36.bitPacked,
									i_29_, null);
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
						final ObjectPile objectPile = class120_sub18_27_.objectPile;
						if (objectPile != null && objectPile.yLocationModifier == 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							if (objectPile.secondItemModel != null) {
								objectPile.secondItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.thirdItemModel != null) {
								objectPile.thirdItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.mainItemModel != null) {
								objectPile.mainItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
						}
					}
					final int i_51_ = class120_sub18_27_.anInt2635;
					if (i_51_ != 0) {
						if (i < Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x4) != 0) {
							final GroundTile class120_sub18_52_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_52_ != null && class120_sub18_52_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_52_);
							}
						}
						if (i_28_ < Class112.anInt1080 && (i_51_ & 0x2) != 0) {
							final GroundTile class120_sub18_53_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_53_ != null && class120_sub18_53_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_53_);
							}
						}
						if (i > Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x1) != 0) {
							final GroundTile class120_sub18_54_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_54_ != null && class120_sub18_54_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_54_);
							}
						}
						if (i_28_ > Class112.anInt1080 && (i_51_ & 0x8) != 0) {
							final GroundTile class120_sub18_55_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_55_ != null && class120_sub18_55_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_55_);
							}
						}
					}
				}
				if (class120_sub18_27_.anInt2633 != 0) {
					boolean bool_56_ = true;
					for (int i_57_ = 0; i_57_ < class120_sub18_27_.anInt2638; i_57_++) {
						if (class120_sub18_27_.aClass28Array2625[i_57_].anInt173 != Class120_Sub12_Sub9.anInt3193 && (class120_sub18_27_.anIntArray2641[i_57_] & class120_sub18_27_.anInt2633) == class120_sub18_27_.anInt2637) {
							bool_56_ = false;
							break;
						}
					}
					if (bool_56_) {
						final Class182 class182 = class120_sub18_27_.aClass182_2628;
						if (!GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							do {
								if (HDToolkit.glEnabled) {
									if ((class182.bitPacked & 0xfc000L) == 16384L) {
										int i_58_ = class182.anInt1797 - DisplayModeInfo.anInt1713;
										int i_59_ = class182.anInt1795 - Class145.anInt1381;
										final int i_60_ = (int) (class182.bitPacked >> 20 & 0x3L);
										if (i_60_ == 0) {
											i_58_ -= 64;
											i_59_ += 64;
											if (i_59_ < i_58_ && i > 0 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 1) {
											i_58_ += 64;
											i_59_ += 64;
											if (i_59_ < -i_58_ && i < Class186.anInt1900 - 1 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 2) {
											i_58_ += 64;
											i_59_ -= 64;
											if (i_59_ > i_58_ && i < Class186.anInt1900 - 1 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ - 1);
												break;
											}
										} else if (i_60_ == 3) {
											i_58_ -= 64;
											i_59_ -= 64;
											if (i_59_ > -i_58_ && i > 0 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ - 1);
												break;
											}
										}
									}
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							} while (false);
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						class120_sub18_27_.anInt2633 = 0;
					}
				}
				if (class120_sub18_27_.aBoolean2631) {
					try {
						final int i_61_ = class120_sub18_27_.anInt2638;
						class120_sub18_27_.aBoolean2631 = false;
						int i_62_ = 0;
						while_84_: for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
							final Class28 class28 = class120_sub18_27_.aClass28Array2625[i_63_];
							if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
								for (int i_64_ = class28.anInt180; i_64_ <= class28.anInt182; i_64_++) {
									for (int i_65_ = class28.anInt184; i_65_ <= class28.anInt175; i_65_++) {
										final GroundTile class120_sub18_66_ = class120_sub18s[i_64_][i_65_];
										if (class120_sub18_66_.aBoolean2647) {
											class120_sub18_27_.aBoolean2631 = true;
											continue while_84_;
										}
										if (class120_sub18_66_.anInt2633 != 0) {
											int i_67_ = 0;
											if (i_64_ > class28.anInt180) {
												i_67_++;
											}
											if (i_64_ < class28.anInt182) {
												i_67_ += 4;
											}
											if (i_65_ > class28.anInt184) {
												i_67_ += 8;
											}
											if (i_65_ < class28.anInt175) {
												i_67_ += 2;
											}
											if ((i_67_ & class120_sub18_66_.anInt2633) == class120_sub18_27_.anInt2648) {
												class120_sub18_27_.aBoolean2631 = true;
												continue while_84_;
											}
										}
									}
								}
								Class39.aClass28Array323[i_62_++] = class28;
								int i_68_ = Class120_Sub12_Sub26.anInt3332 - class28.anInt180;
								final int i_69_ = class28.anInt182 - Class120_Sub12_Sub26.anInt3332;
								if (i_69_ > i_68_) {
									i_68_ = i_69_;
								}
								final int i_70_ = Class112.anInt1080 - class28.anInt184;
								final int i_71_ = class28.anInt175 - Class112.anInt1080;
								if (i_71_ > i_70_) {
									class28.anInt171 = i_68_ + i_71_;
								} else {
									class28.anInt171 = i_68_ + i_70_;
								}
							}
						}
						while (i_62_ > 0) {
							int i_72_ = -50;
							int i_73_ = -1;
							for (int i_74_ = 0; i_74_ < i_62_; i_74_++) {
								final Class28 class28 = Class39.aClass28Array323[i_74_];
								if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
									if (class28.anInt171 > i_72_) {
										i_72_ = class28.anInt171;
										i_73_ = i_74_;
									} else if (class28.anInt171 == i_72_) {
										final int i_75_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_76_ = class28.anInt185 - Class145.anInt1381;
										final int i_77_ = Class39.aClass28Array323[i_73_].anInt178 - DisplayModeInfo.anInt1713;
										final int i_78_ = Class39.aClass28Array323[i_73_].anInt185 - Class145.anInt1381;
										if (i_75_ * i_75_ + i_76_ * i_76_ > i_77_ * i_77_ + i_78_ * i_78_) {
											i_73_ = i_74_;
										}
									}
								}
							}
							if (i_73_ == -1) {
								break;
							}
							final Class28 class28 = Class39.aClass28Array323[i_73_];
							class28.anInt173 = Class120_Sub12_Sub9.anInt3193;
							if (!HintIcon.method723(i_30_, class28.anInt180, class28.anInt182, class28.anInt184, class28.anInt175, class28.aClass180_174.getMaxY())) {
								if (HDToolkit.glEnabled) {
									if ((class28.bitPacked & 0xfc000L) == 147456L) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
										final int i_79_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_80_ = class28.anInt185 - Class145.anInt1381;
										final int i_81_ = (int) (class28.bitPacked >> 20 & 0x3L);
										if (i_81_ == 1 || i_81_ == 3) {
											if (i_80_ > -i_79_) {
												LightManager.method1864(i_29_, i, i_28_ - 1, i - 1, i_28_);
											} else {
												LightManager.method1864(i_29_, i, i_28_ + 1, i + 1, i_28_);
											}
										} else if (i_80_ > i_79_) {
											LightManager.method1864(i_29_, i, i_28_ - 1, i + 1, i_28_);
										} else {
											LightManager.method1864(i_29_, i, i_28_ + 1, i - 1, i_28_);
										}
									} else {
										LightManager.method1862(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, class28.anInt180, class28.anInt184, class28.anInt182, class28.anInt175);
									}
								}
								class28.aClass180_174.method2265(class28.anInt172, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
							for (int i_82_ = class28.anInt180; i_82_ <= class28.anInt182; i_82_++) {
								for (int i_83_ = class28.anInt184; i_83_ <= class28.anInt175; i_83_++) {
									final GroundTile class120_sub18_84_ = class120_sub18s[i_82_][i_83_];
									if (class120_sub18_84_.anInt2633 != 0) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									} else if ((i_82_ != i || i_83_ != i_28_) && class120_sub18_84_.aBoolean2624) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									}
								}
							}
						}
						if (class120_sub18_27_.aBoolean2631) {
							continue;
						}
					} catch (final Exception exception) {
						class120_sub18_27_.aBoolean2631 = false;
					}
				}
				if (class120_sub18_27_.tileParticle != null) {
					if (HDToolkit.glEnabled) {
						final GL gl = HDToolkit.gl;
						HDToolkit.method527(f);
						ParticleEngine.method956(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381);
						final int i_85_ = class120_sub18_27_.anInt2632 * 128 + 64 - DisplayModeInfo.anInt1713;
						final int i_86_ = OverridedJInterface.tileHeightMap[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - PlayerAppearance.anInt1367;
						final int i_87_ = class120_sub18_27_.anInt2629 * 128 + 64 - Class145.anInt1381;
						int i_88_;
						if (i_29_ < 3) {
							i_88_ = OverridedJInterface.tileHeightMap[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - OverridedJInterface.tileHeightMap[i_29_ + 1][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629];
						} else {
							i_88_ = 1024;
						}
						final int i_89_ = i_87_ * MapFunctionType.anInt637 - i_85_ * Class120_Sub12_Sub30.anInt3377 >> 16;
						final int i_90_ = i_86_ * Class69_Sub2.anInt2239 + i_89_ * ObjectContainer.anInt2616 >> 16;
						final int i_91_ = i_90_ + (91 * ObjectContainer.anInt2616 + 0 * Class69_Sub2.anInt2239 >> 16);
						int i_92_ = i_90_ + (-91 * ObjectContainer.anInt2616 - i_88_ * Class69_Sub2.anInt2239 >> 16);
						if (i_92_ < i_91_ - 1597) {
							i_92_ = i_91_ - 1597;
						}
						final int i_93_ = i_91_ - i_92_ + 2;
						Particle class108_sub3_sub1 = null;
						ParticleManager class108_sub1 = null;
						int i_94_ = -1;
						Particle class108_sub3_sub1_95_ = (Particle) class120_sub18_27_.tileParticle.peekFirst();
						for (/**/; true; class108_sub3_sub1_95_ = (Particle) class120_sub18_27_.tileParticle.peekNext()) {
							if (class108_sub3_sub1_95_ != null) {
								if (class108_sub3_sub1_95_.aClass108_Sub1_3099 == null || class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass108_Sub2_2340.aBoolean2356) {
									class108_sub3_sub1_95_.unlink();
									continue;
								}
								if ((byte) (int) (class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass108_Sub2_2340.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.tileParticle = null;
									break;
								}
								if (class108_sub3_sub1 == null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub1.aClass80_2323.anInt721;
									continue;
								}
							}
							if (class108_sub3_sub1 != null && (class108_sub3_sub1_95_ == null || class108_sub3_sub1_95_.aClass108_Sub1_3099 != class108_sub1 || class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass80_2323.anInt721 != i_94_)) {
								for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
									ParticleEngine.anIntArray2389[i_96_] = 0;
								}
								for (int i_97_ = 0; i_97_ < 32; i_97_++) {
									ParticleEngine.anIntArray2390[i_97_] = 0;
								}
								ParticleEngine.anInt2380 = 0;
								for (Particle class108_sub3_sub1_98_ = class108_sub3_sub1; class108_sub3_sub1_98_ != class108_sub3_sub1_95_; class108_sub3_sub1_98_ = (Particle) class108_sub3_sub1_98_.nextSub) {
									if (class108_sub3_sub1_98_.aClass108_Sub1_3099 != null) {
										final int i_99_ = (class108_sub3_sub1_98_.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
										final int i_100_ = (class108_sub3_sub1_98_.anInt3088 >> 12) - PlayerAppearance.anInt1367;
										int i_101_ = (class108_sub3_sub1_98_.anInt3090 >> 12) - Class145.anInt1381;
										i_101_ = i_101_ * MapFunctionType.anInt637 - i_99_ * Class120_Sub12_Sub30.anInt3377 >> 16;
										i_101_ = (i_100_ * Class69_Sub2.anInt2239 + i_101_ * ObjectContainer.anInt2616 >> 16) - i_92_;
										if (ParticleEngine.anIntArray2389[i_101_] < 32) {
											ParticleEngine.aShortArrayArray2378[i_101_][ParticleEngine.anIntArray2389[i_101_]++] = class108_sub3_sub1_98_.aShort3094;
										} else {
											if (ParticleEngine.anIntArray2389[i_101_] == 32) {
												if (ParticleEngine.anInt2380 == 32) {
													if (ParticleEngine.aBoolean2362) {
														System.out.println("Overflowed world-based radix sort");
													}
													break;
												}
												ParticleEngine.anIntArray2389[i_101_] += 1 + ParticleEngine.anInt2380++;
											}
											final int i_102_ = ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1];
											if (i_102_ < 768) {
												ParticleEngine.aShortArrayArray2387[ParticleEngine.anIntArray2389[i_101_] - 32 - 1][ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1]++] = class108_sub3_sub1_98_.aShort3094;
											}
										}
									}
									if (class108_sub3_sub1_98_.nextSub == class120_sub18_27_.tileParticle.head) {
										break;
									}
								}
								boolean bool_103_ = false;
								if (ParticleEngine.aBoolean2347 && class108_sub1.aClass80_2323.anInt724 != -1) {
									Rasterizer.anInterface5_973.method25(64, class108_sub1.aClass80_2323.anInt724);
									bool_103_ = true;
								} else {
									HDToolkit.method514(-1);
								}
								float f_104_ = i_94_ * ParticleEngine.aFloat2393;
								if (f_104_ > 64.0F) {
									f_104_ = 64.0F;
								}
								gl.glPointSize(f_104_);
								class108_sub1.aClass108_Sub2_2340.method950(gl, i_93_, bool_103_, class108_sub1.aClass80_2323.aBoolean750);
								if (class108_sub3_sub1_95_ != null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass80_2323.anInt721;
								}
							}
							if (class108_sub3_sub1_95_ == null) {
								break;
							}
						}
						ParticleEngine.method957();
					} else {
						final int xOff = ParticleEngine.anInt2364 + Rasterizer.anInt967;
						final int yOff = ParticleEngine.anInt2358 + Rasterizer.anInt970;
						final ParticleNodeSub class108_sub3 = class120_sub18_27_.tileParticle.head;
						for (ParticleNodeSub class108_sub3_107_ = class108_sub3.nextSub; class108_sub3_107_ != class108_sub3; class108_sub3_107_ = class108_sub3_107_.nextSub) {
							final Particle class108_sub3_sub1 = (Particle) class108_sub3_107_;
							if (class108_sub3_sub1.aClass108_Sub1_3099 != null && !class108_sub3_sub1.aClass108_Sub1_3099.aClass108_Sub2_2340.aBoolean2356) {
								if ((byte) (int) (class108_sub3_sub1.aClass108_Sub1_3099.aClass108_Sub2_2340.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.tileParticle = null;
									break;
								}
								int x = (class108_sub3_sub1.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
								int y = (class108_sub3_sub1.anInt3088 >> 12) - PlayerAppearance.anInt1367;
								int z = (class108_sub3_sub1.anInt3090 >> 12) - Class145.anInt1381;
								int i_111_ = z * Class120_Sub12_Sub30.anInt3377 + x * MapFunctionType.anInt637 >> 16;
								z = z * MapFunctionType.anInt637 - x * Class120_Sub12_Sub30.anInt3377 >> 16;
								x = i_111_;
								i_111_ = y * ObjectContainer.anInt2616 - z * Class69_Sub2.anInt2239 >> 16;
								z = y * Class69_Sub2.anInt2239 + z * ObjectContainer.anInt2616 >> 16;
								y = i_111_;
								if (z >= 50) {
									final int renderX = xOff + (x << 9) / z;
									final int renderY = yOff + (y << 9) / z;
									int size = z * 400;
									if (size == 0) {
										size = 1;
									}
									GraphicsLD.method2152(renderX, renderY, (class108_sub3_sub1.aClass108_Sub1_3099.aClass80_2323.anInt721 << 16) / size, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
								}
							}
						}
					}
				}
				if (class120_sub18_27_.aBoolean2624 && class120_sub18_27_.anInt2633 == 0) {
					if (i <= Class120_Sub12_Sub26.anInt3332 && i > GrandExchangeObject.anInt1493) {
						final GroundTile class120_sub18_115_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_115_ != null && class120_sub18_115_.aBoolean2624) {
							continue;
						}
					}
					if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
						final GroundTile class120_sub18_116_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_116_ != null && class120_sub18_116_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
						final GroundTile class120_sub18_117_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_117_ != null && class120_sub18_117_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ >= Class112.anInt1080 && i_28_ < Js5Worker.anInt396 - 1) {
						final GroundTile class120_sub18_118_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_118_ != null && class120_sub18_118_.aBoolean2624) {
							continue;
						}
					}
					class120_sub18_27_.aBoolean2624 = false;
					ObjectContainer.anInt2615--;
					final ObjectPile objectPile = class120_sub18_27_.objectPile;
					if (objectPile != null && objectPile.yLocationModifier != 0) {
						if (HDToolkit.glEnabled) {
							LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
						}
						if (objectPile.secondItemModel != null) {
							objectPile.secondItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.thirdItemModel != null) {
							objectPile.thirdItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.mainItemModel != null) {
							objectPile.mainItemModel.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
					}
					if (class120_sub18_27_.anInt2646 != 0) {
						final Class186 class186 = class120_sub18_27_.aClass186_2639;
						if (class186 != null && !Js5Worker.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
							if ((class186.anInt1895 & class120_sub18_27_.anInt2646) != 0) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class186.anInt1893 - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.anInt1894 - PlayerAppearance.anInt1367, class186.anInt1891
										- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.anInt1895 == 256) {
								final int i_119_ = class186.anInt1893 - DisplayModeInfo.anInt1713;
								final int i_120_ = class186.anInt1894 - PlayerAppearance.anInt1367;
								final int i_121_ = class186.anInt1891 - Class145.anInt1381;
								final int i_122_ = class186.anInt1896;
								int i_123_;
								if (i_122_ == 1 || i_122_ == 2) {
									i_123_ = -i_119_;
								} else {
									i_123_ = i_119_;
								}
								int i_124_;
								if (i_122_ == 2 || i_122_ == 3) {
									i_124_ = -i_121_;
								} else {
									i_124_ = i_121_;
								}
								if (i_124_ >= i_123_) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_119_ + class186.anInt1905, i_120_, i_121_ + class186.anInt1892, class186.bitPacked, i_29_, null);
								} else if (class186.aClass180_1898 != null) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1898.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_119_, i_120_, i_121_, class186.bitPacked, i_29_, null);
								}
							}
						}
						final Class182 class182 = class120_sub18_27_.aClass182_2628;
						if (class182 != null) {
							if ((class182.anInt1792 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1792, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1796.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
										class182.bitPacked, i_29_, null);
							}
							if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
										class182.bitPacked, i_29_, null);
							}
						}
					}
					if (i_29_ < Class142.anInt1361 - 1) {
						final GroundTile class120_sub18_125_ = LabelGroup.groundTiles[i_29_ + 1][i][i_28_];
						if (class120_sub18_125_ != null && class120_sub18_125_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_125_);
						}
					}
					if (i < Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_126_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_126_ != null && class120_sub18_126_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_126_);
						}
					}
					if (i_28_ < Class112.anInt1080) {
						final GroundTile class120_sub18_127_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_127_ != null && class120_sub18_127_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_127_);
						}
					}
					if (i > Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_128_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_128_ != null && class120_sub18_128_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_128_);
						}
					}
					if (i_28_ > Class112.anInt1080) {
						final GroundTile class120_sub18_129_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_129_ != null && class120_sub18_129_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_129_);
						}
					}
				}
			}
		}
	}

	final boolean method1990(final byte i) {
		boolean bool;
		try {
			if (models == null) {
				return true;
			}
			boolean bool_130_ = true;
			if (i >= -102) {
				method1989(null, false);
			}
			for (int i_131_ = 0; i_131_ < models.length; i_131_++) {
				if (!SceneGroundObject.aClass50_2839.fileExists(models[i_131_], 0)) {
					bool_130_ = false;
				}
			}
			bool = bool_130_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qa.H(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void animateInterfaces(final JagexInterface[] class189s, final int parent) {
		for (final JagexInterface jagexInterface : class189s) {
			if (jagexInterface != null && jagexInterface.parent == parent && (!jagexInterface.newFormat || !client.isHidden(jagexInterface))) {
				if (jagexInterface.type == 0) {
					if (!jagexInterface.newFormat && client.isHidden(jagexInterface) && CursorType.aClass189_1243 != jagexInterface) {
						continue;
					}
					animateInterfaces(class189s, jagexInterface.bitPacked);
					if (jagexInterface.components != null) {
						animateInterfaces(jagexInterface.components, jagexInterface.bitPacked);
					}
					final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
					if (class120_sub26 != null) {
						AbstractGraphicsBuffer.animateInterface(class120_sub26.interfaceId);
					}
				}
				if (jagexInterface.type == 6) {
					if (jagexInterface.disabledAnim != -1 || jagexInterface.enabledAnim != -1) {
						final boolean enabled = Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -122);
						int animation;
						if (enabled) {
							animation = jagexInterface.enabledAnim;
						} else {
							animation = jagexInterface.disabledAnim;
						}
						if (animation != -1) {
							final SeqType seqType = SeqType.list(animation);
							if (seqType != null) {
								jagexInterface.frameDelay += Class120_Sub12_Sub22.redrawRate;
								while (jagexInterface.frameDelay > seqType.delays[jagexInterface.currentFrame]) {
									jagexInterface.frameDelay -= seqType.delays[jagexInterface.currentFrame];
									jagexInterface.currentFrame++;
									if (jagexInterface.currentFrame >= seqType.frames.length) {
										jagexInterface.currentFrame -= seqType.padding;
										if (jagexInterface.currentFrame < 0 || jagexInterface.currentFrame >= seqType.frames.length) {
											jagexInterface.currentFrame = 0;
										}
									}
									jagexInterface.nextFrame = jagexInterface.currentFrame + 1;
									if (jagexInterface.nextFrame >= seqType.frames.length) {
										jagexInterface.nextFrame -= seqType.padding;
										if (jagexInterface.nextFrame < 0 || jagexInterface.nextFrame >= seqType.frames.length) {
											jagexInterface.nextFrame = -1;
										}
									}
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							}
						}
					}
					if (jagexInterface.rotateSpeed != 0 && !jagexInterface.newFormat) {
						int i_135_ = jagexInterface.rotateSpeed >> 16;
						i_135_ *= Class120_Sub12_Sub22.redrawRate;
						int i_136_ = jagexInterface.rotateSpeed << 16 >> 16;
						jagexInterface.rotateX = i_135_ + jagexInterface.rotateX & 0x7ff;
						i_136_ *= Class120_Sub12_Sub22.redrawRate;
						jagexInterface.rotateY = i_136_ + jagexInterface.rotateY & 0x7ff;
						InterfaceClickMask.redrawInterface(jagexInterface);
					}
				}
			}
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final boolean method1993(final int i) {
		boolean bool;
		try {
			if (i != -32390) {
				method1988(null, false);
			}
			boolean bool_137_ = true;
			for (int i_138_ = 0; i_138_ < 5; i_138_++) {
				if (headModels[i_138_] != -1 && !SceneGroundObject.aClass50_2839.fileExists(headModels[i_138_], 0)) {
					bool_137_ = false;
				}
			}
			bool = bool_137_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qa.K(").append(i).append(')').toString());
		}
		return bool;
	}

	static final IdentityKit list(final int id) {
		IdentityKit identityKit = (IdentityKit) recentUse.get(id);
		if (identityKit != null) {
			return identityKit;
		}
		final byte[] data = Class147.aClass50_1394.getFile(3, id);
		identityKit = new IdentityKit();
		if (data != null) {
			identityKit.decode(new Buffer(data));
		}
		recentUse.put(identityKit, id);
		return identityKit;
	}

	public IdentityKit() {
		/* empty */
	}
}
