/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class69 {
	static int anInt614;
	static boolean aBoolean615 = true;
	static int rootInterfaceId;
	static int anInt617 = 0;
	static String aString618;
	static Class50 aClass50_619;

	static {
		rootInterfaceId = -1;
		aString618 = "green:";
	}

	static final void method612(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		Class120_Sub12_Sub19.textCount = 0;
		for (int id = -1; Class148.localNpcCount + Class83.localPlayerCount > id; id++) {
			GameEntity entity;
			if (id == -1) {
				entity = Class100.selfPlayer;
			} else if (id < Class83.localPlayerCount) {
				entity = Class118.playersList[Class112.playerIndices[id]];
			} else {
				entity = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[id - Class83.localPlayerCount]];
			}
			if (entity != null && entity.isVisible()) {
				if (entity instanceof Npc) {
					NpcType npcType = ((Npc) entity).npcType;
					if (npcType.childrenIDs != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType == null) {
						continue;
					}
				}
				if (id >= Class83.localPlayerCount) {
					NpcType npcType = ((Npc) entity).npcType;
					if (npcType.childrenIDs != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType.headIcon >= 0 && npcType.headIcon < Class120_Sub14_Sub14_Sub1.prayerIconSprites.length) {
						int i_8_;
						if (npcType.anInt1691 == -1) {
							i_8_ = entity.method2328() + 15;
						} else {
							i_8_ = npcType.anInt1691 + 15;
						}
						Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, i_8_, entity);
						if (Class120_Sub12_Sub38.anInt3434 > -1) {
							Class120_Sub14_Sub14_Sub1.prayerIconSprites[npcType.headIcon].method1587(i - (-Class120_Sub12_Sub38.anInt3434 - -12), -30 + i_4_ + Class120_Sub15.anInt2588);
						}
					}
					final Class85[] class85s = Class187.aClass85Array1909;
					Class85[] class85s_10_;
					final int i_9_ = (class85s_10_ = class85s).length;
					for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
						final Class85 class85 = class85s_10_[i_11_];
						if (class85 != null && class85.anInt809 == 1 && class85.anInt808 == Class120_Sub12_Sub36.localNpcIndices[-Class83.localPlayerCount + id] && Class101_Sub2.loopCycle % 20 < 10) {
							int i_12_;
							if (npcType.anInt1691 == -1) {
								i_12_ = 15 + entity.method2328();
							} else {
								i_12_ = npcType.anInt1691 + 15;
							}
							Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, i_12_, entity);
							if (Class120_Sub12_Sub38.anInt3434 > -1) {
								Class180_Sub6.aClass120_Sub14_Sub19Array3073[class85.anInt805].method1587(i - -Class120_Sub12_Sub38.anInt3434 - 12, i_4_ + Class120_Sub15.anInt2588 + -28);
							}
						}
					}
				} else {
					int i_13_ = 30;
					final Player class180_sub5_sub1 = (Player) entity;
					if (class180_sub5_sub1.anInt3732 != -1 || (class180_sub5_sub1.anInt3746 ^ 0xffffffff) != 0) {
						Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, 15 + entity.method2328(), entity);
						if ((Class120_Sub12_Sub38.anInt3434 ^ 0xffffffff) < 0) {
							if ((class180_sub5_sub1.anInt3732 ^ 0xffffffff) != 0) {
								Class54.aClass120_Sub14_Sub19Array490[class180_sub5_sub1.anInt3732].method1587(i + Class120_Sub12_Sub38.anInt3434 + -12, Class120_Sub15.anInt2588 + i_4_ + -i_13_);
								i_13_ += 25;
							}
							if ((class180_sub5_sub1.anInt3746 ^ 0xffffffff) != 0) {
								Class120_Sub14_Sub14_Sub1.prayerIconSprites[class180_sub5_sub1.anInt3746].method1587(Class120_Sub12_Sub38.anInt3434 + i - 12, -i_13_ + i_4_ + Class120_Sub15.anInt2588);
								i_13_ += 25;
							}
						}
					}
					if (id >= 0) {
						final Class85[] class85s = Class187.aClass85Array1909;
						for (final Class85 class85 : class85s) {
							if (class85 != null && class85.anInt809 == 10 && Class112.playerIndices[id] == class85.anInt808) {
								Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, 15 + entity.method2328(), entity);
								if (Class120_Sub12_Sub38.anInt3434 > -1) {
									Class180_Sub6.aClass120_Sub14_Sub19Array3073[class85.anInt805].method1587(-12 + Class120_Sub12_Sub38.anInt3434 + i, i_4_ - -Class120_Sub15.anInt2588 + -i_13_);
								}
							}
						}
					}
				}
				if (entity.aString2975 != null && (id >= Class83.localPlayerCount || Class69_Sub3_Sub1.anInt3084 == 0 || Class69_Sub3_Sub1.anInt3084 == 3 || Class69_Sub3_Sub1.anInt3084 == 1 && SpotAnimType.method875(-111, ((Player) entity).name))) {
					Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, entity.method2328(), entity);
					if (Class120_Sub12_Sub38.anInt3434 > -1 && Class120_Sub12_Sub19.textCount < AbstractGraphicsBuffer.anInt1166) {
						AbstractGraphicsBuffer.anIntArray1162[Class120_Sub12_Sub19.textCount] = Class120_Sub12_Sub22.boldFont.method1459(entity.aString2975) / 2;
						AbstractGraphicsBuffer.anIntArray1158[Class120_Sub12_Sub19.textCount] = Class120_Sub12_Sub22.boldFont.anInt3497;
						AbstractGraphicsBuffer.anIntArray1161[Class120_Sub12_Sub19.textCount] = Class120_Sub12_Sub38.anInt3434;
						AbstractGraphicsBuffer.anIntArray1171[Class120_Sub12_Sub19.textCount] = Class120_Sub15.anInt2588;
						AbstractGraphicsBuffer.anIntArray1159[Class120_Sub12_Sub19.textCount] = entity.anInt2976;
						AbstractGraphicsBuffer.anIntArray1156[Class120_Sub12_Sub19.textCount] = entity.anInt2995;
						AbstractGraphicsBuffer.anIntArray1163[Class120_Sub12_Sub19.textCount] = entity.anInt3025;
						AbstractGraphicsBuffer.aStringArray1167[Class120_Sub12_Sub19.textCount] = entity.aString2975;
						Class120_Sub12_Sub19.textCount++;
					}
				}
				if (Class101_Sub2.loopCycle < entity.anInt2989) {
					AbstractSprite class120_sub14_sub19 = Class40.aClass120_Sub14_Sub19Array335[0];
					AbstractSprite class120_sub14_sub19_15_ = Class40.aClass120_Sub14_Sub19Array335[1];
					int i_16_;
					if (!(entity instanceof Npc)) {
						i_16_ = entity.method2328();
					} else {
						final Npc class180_sub5_sub2 = (Npc) entity;
						AbstractSprite[] class120_sub14_sub19s = (AbstractSprite[]) Class120_Sub12_Sub2.aClass21_3144.get(class180_sub5_sub2.npcType.anInt1666);
						if (class120_sub14_sub19s == null) {
							class120_sub14_sub19s = Class125.method1878(Class7.aClass50_63, (byte) 110, 0, class180_sub5_sub2.npcType.anInt1666);
							if (class120_sub14_sub19s != null) {
								Class120_Sub12_Sub2.aClass21_3144.put(class120_sub14_sub19s, class180_sub5_sub2.npcType.anInt1666);
							}
						}
						if (class120_sub14_sub19s != null && class120_sub14_sub19s.length == 2) {
							class120_sub14_sub19_15_ = class120_sub14_sub19s[1];
							class120_sub14_sub19 = class120_sub14_sub19s[0];
						}
						final NpcType npcType = class180_sub5_sub2.npcType;
						if (npcType.anInt1691 != -1) {
							i_16_ = npcType.anInt1691;
						} else {
							i_16_ = entity.method2328();
						}
					}
					Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, class120_sub14_sub19.height + i_16_ + 10, entity);
					if (Class120_Sub12_Sub38.anInt3434 > -1) {
						final int i_17_ = Class120_Sub12_Sub38.anInt3434 + i - (class120_sub14_sub19.width >> 1);
						final int i_18_ = -3 + Class120_Sub15.anInt2588 + i_4_;
						class120_sub14_sub19.method1587(i_17_, i_18_);
						final int i_19_ = entity.anInt3024 * class120_sub14_sub19.width / 255;
						final int i_20_ = class120_sub14_sub19.height;
						if (!HDToolkit.glEnabled) {
							GraphicsLD.method2166(i_17_, i_18_, i_19_ + i_17_, i_18_ - -i_20_);
						} else {
							GraphicsHD.method591(i_17_, i_18_, i_17_ + i_19_, i_20_ + i_18_);
						}
						class120_sub14_sub19_15_.method1587(i_17_, i_18_);
						if (HDToolkit.glEnabled) {
							GraphicsHD.clipRect(i, i_4_, i_3_ + i, i_1_ + i_4_);
						} else {
							GraphicsLD.clipRect(i, i_4_, i_3_ + i, i_1_ + i_4_);
						}
					}
				}
				for (int i_21_ = 0; i_21_ < 4; i_21_++) {
					if (entity.anIntArray3000[i_21_] > Class101_Sub2.loopCycle) {
						int i_22_;
						if (entity instanceof Npc) {
							final Npc class180_sub5_sub2 = (Npc) entity;
							final NpcType npcType = class180_sub5_sub2.npcType;
							if (npcType.anInt1691 == -1) {
								i_22_ = entity.method2328() / 2;
							} else {
								i_22_ = npcType.anInt1691 / 2;
							}
						} else {
							i_22_ = entity.method2328() / 2;
						}
						Class128.method1903(i_1_ >> 1, i_2_, i_0_, i_3_ >> 1, false, i_22_, entity);
						if ((Class120_Sub12_Sub38.anInt3434 ^ 0xffffffff) < 0) {
							if (i_21_ == 1) {
								Class120_Sub15.anInt2588 -= 20;
							}
							if (i_21_ == 2) {
								Class120_Sub15.anInt2588 -= 10;
								Class120_Sub12_Sub38.anInt3434 -= 15;
							}
							if (i_21_ == 3) {
								Class120_Sub12_Sub38.anInt3434 += 15;
								Class120_Sub15.anInt2588 -= 10;
							}
							Class69_Sub2.aClass120_Sub14_Sub19Array2238[entity.anIntArray2991[i_21_]].method1587(Class120_Sub12_Sub38.anInt3434 + i - 12, i_4_ - (-Class120_Sub15.anInt2588 + 12));
							Cache.aClass120_Sub14_Sub8_121.method1478(Integer.toString(entity.anIntArray2968[i_21_]), i - -Class120_Sub12_Sub38.anInt3434 + -1, 3 + i_4_ - -Class120_Sub15.anInt2588, 16777215, 0);
						}
					}
				}
			}
		}
		for (int i_23_ = 0; i_23_ < Class120_Sub12_Sub19.textCount; i_23_++) {
			int i_6_ = AbstractGraphicsBuffer.anIntArray1161[i_23_];
			int i_24_ = AbstractGraphicsBuffer.anIntArray1171[i_23_];
			final int i_25_ = AbstractGraphicsBuffer.anIntArray1162[i_23_];
			final int i_26_ = AbstractGraphicsBuffer.anIntArray1158[i_23_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_27_ = 0; i_23_ > i_27_; i_27_++) {
					if (AbstractGraphicsBuffer.anIntArray1171[i_27_] - AbstractGraphicsBuffer.anIntArray1158[i_27_] < i_24_ - -2 && -i_26_ + i_24_ < 2 + AbstractGraphicsBuffer.anIntArray1171[i_27_] && i_6_ + -i_25_ < AbstractGraphicsBuffer.anIntArray1162[i_27_] + AbstractGraphicsBuffer.anIntArray1161[i_27_] && i_6_ + i_25_ > AbstractGraphicsBuffer.anIntArray1161[i_27_] - AbstractGraphicsBuffer.anIntArray1162[i_27_] && i_24_ > -AbstractGraphicsBuffer.anIntArray1158[i_27_] + AbstractGraphicsBuffer.anIntArray1171[i_27_]) {
						bool = true;
						i_24_ = -AbstractGraphicsBuffer.anIntArray1158[i_27_] + AbstractGraphicsBuffer.anIntArray1171[i_27_];
					}
				}
			}
			Class120_Sub12_Sub38.anInt3434 = AbstractGraphicsBuffer.anIntArray1161[i_23_];
			Class120_Sub15.anInt2588 = AbstractGraphicsBuffer.anIntArray1171[i_23_] = i_24_;
			final String string = AbstractGraphicsBuffer.aStringArray1167[i_23_];
			if (Player.anInt3748 != 0) {
				Class120_Sub12_Sub22.boldFont.method1478(string, Class120_Sub12_Sub38.anInt3434 + i, Class120_Sub15.anInt2588 + i_4_, 16776960, 0);
			} else {
				int i_28_ = 16776960;
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] < 6) {
					i_28_ = SpotAnimType.anIntArray987[AbstractGraphicsBuffer.anIntArray1159[i_23_]];
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 6) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 7) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 < 10 ? 255 : 65535;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 8) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 < 10 ? 45056 : 8454016;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 9) {
					final int i_29_ = -AbstractGraphicsBuffer.anIntArray1163[i_23_] + 150;
					if (i_29_ < 50) {
						i_28_ = i_29_ * 1280 + 16711680;
					} else if (i_29_ >= 100) {
						if (i_29_ < 150) {
							i_28_ = 65280 - (500 + -(5 * i_29_));
						}
					} else {
						i_28_ = 16776960 + -((i_29_ + -50) * 327680);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 10) {
					final int i_30_ = -AbstractGraphicsBuffer.anIntArray1163[i_23_] + 150;
					if (i_30_ >= 50) {
						if (i_30_ < 100) {
							i_28_ = 16711935 + -((i_30_ + -50) * 327680);
						} else if (i_30_ < 150) {
							i_28_ = 500 + -(5 * i_30_) + (i_30_ - 100) * 327680 + 255;
						}
					} else {
						i_28_ = 16711680 - -(5 * i_30_);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1159[i_23_] == 11) {
					final int i_31_ = 150 + -AbstractGraphicsBuffer.anIntArray1163[i_23_];
					if (i_31_ >= 50) {
						if (i_31_ >= 100) {
							if (i_31_ < 150) {
								i_28_ = 32768000 + -(327680 * i_31_) + 16777215;
							}
						} else {
							i_28_ = 327685 * (i_31_ + -50) + 65280;
						}
					} else {
						i_28_ = -(327685 * i_31_) + 16777215;
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 0) {
					Class120_Sub12_Sub22.boldFont.method1478(string, i + Class120_Sub12_Sub38.anInt3434, i_4_ - -Class120_Sub15.anInt2588, i_28_, 0);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 1) {
					Class120_Sub12_Sub22.boldFont.method1469(string, Class120_Sub12_Sub38.anInt3434 + i, i_4_ - -Class120_Sub15.anInt2588, i_28_, 0, InterfaceChangeNode.anInt3490);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 2) {
					Class120_Sub12_Sub22.boldFont.method1463(string, Class120_Sub12_Sub38.anInt3434 + i, Class120_Sub15.anInt2588 + i_4_, i_28_, 0, InterfaceChangeNode.anInt3490);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 3) {
					Class120_Sub12_Sub22.boldFont.method1473(string, i - -Class120_Sub12_Sub38.anInt3434, Class120_Sub15.anInt2588 + i_4_, i_28_, 0, InterfaceChangeNode.anInt3490, 150 + -AbstractGraphicsBuffer.anIntArray1163[i_23_]);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 4) {
					final int i_32_ = (-AbstractGraphicsBuffer.anIntArray1163[i_23_] + 150) * (Class120_Sub12_Sub22.boldFont.method1459(string) - -100) / 150;
					if (!HDToolkit.glEnabled) {
						GraphicsLD.method2166(-50 + i - -Class120_Sub12_Sub38.anInt3434, i_4_, Class120_Sub12_Sub38.anInt3434 + i - -50, i_1_ + i_4_);
					} else {
						GraphicsHD.method591(Class120_Sub12_Sub38.anInt3434 + i - 50, i_4_, 50 + i - -Class120_Sub12_Sub38.anInt3434, i_4_ - -i_1_);
					}
					Class120_Sub12_Sub22.boldFont.method1466(string, -i_32_ + Class120_Sub12_Sub38.anInt3434 + i - -50, i_4_ - -Class120_Sub15.anInt2588, i_28_, 0);
					if (!HDToolkit.glEnabled) {
						GraphicsLD.clipRect(i, i_4_, i + i_3_, i_4_ - -i_1_);
					} else {
						GraphicsHD.clipRect(i, i_4_, i_3_ + i, i_4_ - -i_1_);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1156[i_23_] == 5) {
					int i_33_ = 0;
					final int i_34_ = 150 + -AbstractGraphicsBuffer.anIntArray1163[i_23_];
					if (!HDToolkit.glEnabled) {
						GraphicsLD.method2166(i, -Class120_Sub12_Sub22.boldFont.anInt3497 + Class120_Sub15.anInt2588 + i_4_ - 1, i_3_ + i, 5 + i_4_ - -Class120_Sub15.anInt2588);
					} else {
						GraphicsHD.method591(i, -1 + Class120_Sub15.anInt2588 + i_4_ - Class120_Sub12_Sub22.boldFont.anInt3497, i - -i_3_, Class120_Sub15.anInt2588 + i_4_ + 5);
					}
					if (i_34_ >= 25) {
						if (i_34_ > 125) {
							i_33_ = i_34_ - 125;
						}
					} else {
						i_33_ = i_34_ - 25;
					}
					Class120_Sub12_Sub22.boldFont.method1478(string, Class120_Sub12_Sub38.anInt3434 + i, i_33_ + Class120_Sub15.anInt2588 + i_4_, i_28_, 0);
					if (HDToolkit.glEnabled) {
						GraphicsHD.clipRect(i, i_4_, i + i_3_, i_4_ - -i_1_);
					} else {
						GraphicsLD.clipRect(i, i_4_, i - -i_3_, i_4_ + i_1_);
					}
				}
			}
		}
	}

	static final void method613(final byte i) {
		try {
			Class101_Sub2.gameShellTimer.method738(70);
			int i_35_ = 0;
			if (i != 53) {
				method613((byte) -2);
			}
			for (/**/; i_35_ < 32; i_35_++) {
				GameShell.mainRedrawCache[i_35_] = 0L;
			}
			for (i_35_ = 0; i_35_ < 32; i_35_++) {
				Class120_Sub12_Sub26.mainLoopTimeCache[i_35_] = 0L;
			}
			Class112.gameLoopCount = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hh.B(").append(i).append(')').toString());
		}
	}

	static final void method614(final int i, final int i_36_) {
		try {
			Class120_Sub15.aFloatArray2596[0] = Class120_Sub12_Sub3.method1207(i >> 16, 255) / 255.0F;
			Class120_Sub15.aFloatArray2596[2] = Class120_Sub12_Sub3.method1207(255, i) / 255.0F;
			if (i_36_ != 65535) {
				aString618 = null;
			}
			Class120_Sub15.aFloatArray2596[1] = Class120_Sub12_Sub3.method1207(255, i >> 8) / 255.0F;
			Class120_Sub12_Sub31.method1364(false, 3);
			Class120_Sub12_Sub31.method1364(false, 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hh.A(").append(i).append(',').append(i_36_).append(')').toString());
		}
	}

	public static void method615(final int i) {
		try {
			aString618 = null;
			aClass50_619 = null;
			if (i != 0) {
				method613((byte) -65);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hh.C(").append(i).append(')').toString());
		}
	}

	static final void method616(final int i, final int i_37_, final int i_38_, final int i_39_, final int i_40_) {
		try {
			if (i < -91) {
				Class139.anInt1334 = i_39_;
				Class120_Sub14_Sub11.anInt3544 = i_40_;
				Class120_Sub30_Sub2.anInt3699 = i_37_;
				Class32.anInt260 = i_38_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hh.D(").append(i).append(',').append(i_37_).append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(')').toString());
		}
	}
}
