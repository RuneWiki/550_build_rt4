/* Class120_Sub14_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class FrameLoader extends NodeSub {
	static int anInt3609 = 0;
	SeqFrame[] seqFrames;
	static AbstractSprite aClass120_Sub14_Sub19_3611;
	static int anInt3612 = -1;

	static final void method1577(final Signlink signlink, final int i) {
		try {
			FileOnDisk fileOnDisk = null;
			Class120_Sub14_Sub14_Sub1.brightness = 3;
			GameShell.method32(true);
			Class120_Sub6.characterShadowsOn = true;
			Class108_Sub3.highDetailTextures = true;
			Class120_Sub12.aBoolean2564 = true;
			CursorType.anInt1242 = 127;
			Class120_Sub30_Sub1.manyGroundTextures = true;
			Hashtable.showGroundDecorations = true;
			Class120_Sub12_Sub6.highLightingDetail = true;
			Class191.flickeringEffectsOn = true;
			PacketBuffer.highWaterDetail = true;
			Class167.aBoolean1619 = true;
			Class120_Sub12_Sub18.lastFullscreenWidth = 0;
			Decimator.fogEnabled = true;
			Class74.sceneryShadowsType = 2;
			if (i == -7134) {
				Class111.anInt1061 = 127;
				Class120_Sub12_Sub12.lastFullscreenHeight = 0;
				Class36.antiAliasingSamples = 0;
				Class120_Sub12_Sub10.manyIdleAnimations = true;
				AbstractMouseWheelHandler.antiAliasingSamplesWrapper = 0;
				RuntimeException_Sub1.anInt2142 = 255;
				if (Class120_Sub14_Sub13.maxMemory < 96) {
					ParticleEngine.setParticles(0);
				} else {
					ParticleEngine.setParticles(2);
				}
				InterfaceClickMask.safeModeEnabled = false;
				Class120_Sub12_Sub19.currentDisplayMode = 0;
				Class186.hdrEnabled = false;
				Class140.anInt1343 = 0;
				Class38.cursorsEnabled = true;
				Class120_Sub19.anInt2657 = 0;
				Class134.aBoolean1277 = false;
				try {
					final SignlinkNode signlinkNode = signlink.openPreferencesFile("runescape");
					while (signlinkNode.status == 0) {
						PacketBuffer.sleepWrapper(1L);
					}
					if (signlinkNode.status == 1) {
						fileOnDisk = (FileOnDisk) signlinkNode.value;
						int i_0_ = 0;
						int i_1_;
						byte[] is;
						for (is = new byte[(int) fileOnDisk.getLength()]; i_0_ < is.length; i_0_ += i_1_) {
							i_1_ = fileOnDisk.read(is, i_0_, is.length - i_0_);
							if ((i_1_ ^ 0xffffffff) == 0) {
								throw new IOException("EOF");
							}
						}
						PacketBuffer.method1145(new Buffer(is), i ^ ~0x1318);
					}
				} catch (final Exception exception) {
					/* empty */
				}
				try {
					if (fileOnDisk != null) {
						fileOnDisk.close();
					}
				} catch (final Exception exception) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.H(").append(signlink != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final boolean method1578(final byte i, final int i_2_) {
		boolean bool;
		try {
			if (i != -39) {
				method1582((byte) 56);
			}
			bool = this.seqFrames[i_2_].aBoolean37;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.F(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return bool;
	}

	final boolean method1579(final int i, final int i_3_) {
		boolean bool;
		try {
			if (i != 3) {
				return true;
			}
			bool = this.seqFrames[i_3_].aBoolean42;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.A(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return bool;
	}

	static final FrameLoader list(final int i) {
		FrameLoader class120_sub14_sub18_17_ = (FrameLoader) SceneGraphNode.aClass21_1781.get(i);
		if (class120_sub14_sub18_17_ != null) {
			return class120_sub14_sub18_17_;
		}
		class120_sub14_sub18_17_ = Class120_Sub14_Sub22.method1633((byte) 62, i, Class132_Sub1.aClass50_2813, Class179.aClass50_1778, false);
		if (class120_sub14_sub18_17_ != null) {
			SceneGraphNode.aClass21_1781.put(class120_sub14_sub18_17_, i);
		}
		return class120_sub14_sub18_17_;
	}

	FrameLoader(final js5 framesJs5, final js5 labelsJs5, final int i, final boolean swap) {
		final Deque labelsDeque = new Deque();
		final int framesLength = framesJs5.getFileAmount(i);
		this.seqFrames = new SeqFrame[framesLength];
		final int[] fileIds = framesJs5.method433(true, i);
		for (int file = 0; file < fileIds.length; file++) {
			final byte[] frameBuffer = framesJs5.getFile(i, fileIds[file]);
			LabelGroup labelGroup = null;
			final int labelId = (frameBuffer[0] & 0xff) << 8 | 0xff & frameBuffer[1];
			for (LabelGroup firstLabel = (LabelGroup) labelsDeque.getFront(); firstLabel != null; firstLabel = (LabelGroup) labelsDeque.getNext()) {
				if (labelId == firstLabel.id) {
					labelGroup = firstLabel;
					break;
				}
			}
			if (labelGroup == null) {
				byte[] labelBuffer;
				if (swap) {
					labelBuffer = labelsJs5.method420(false, labelId, 0);
				} else {
					labelBuffer = labelsJs5.method420(false, 0, labelId);
				}
				labelGroup = new LabelGroup(labelId, labelBuffer);
				labelsDeque.addLast(labelGroup);
			}
			this.seqFrames[fileIds[file]] = new SeqFrame(frameBuffer, labelGroup);
		}
	}

	static final void method1580(NpcType npcType, final int i, final int i_11_, final int i_12_, final int i_13_) {
		try {
			if (Class186.menuOptionCount < 400) {
				if (npcType.childrenIDs != null) {
					npcType = npcType.handleVarp();
				}
				if (npcType != null && npcType.aBoolean1688) {
					if (i < 103) {
						aClass120_Sub14_Sub19_3611 = null;
					}
					String string = npcType.aString1705;
					if (npcType.anInt1674 != 0) {
						final String string_14_ = Buffer.gameId != 1 ? Class120_Sub12_Sub21_Sub1.aString3911 : Class120_Sub3.aString2424;
						string = new StringBuilder(string).append(Class81.method704(Class100.selfPlayer.combatLevel, (byte) -109, npcType.anInt1674)).append(" (").append(string_14_).append(npcType.anInt1674).append(")").toString();
					}
					if (Light.objSelected != 1) {
						if (Class88.spellSelected) {
							final ParamType class120_sub14_sub11 = IdentityKit.selectedSpellParam != -1 ? ParamType.list(IdentityKit.selectedSpellParam) : null;
							if ((0x2 & GroundTile.selectedSpellUseMask) != 0 && (class120_sub14_sub11 == null || npcType.method2206(-9059, class120_sub14_sub11.defaultInt, IdentityKit.selectedSpellParam) != class120_sub14_sub11.defaultInt)) {
								InvType.addMenuOption(Class101.aString963, new StringBuilder(Light.aString369).append(" -> <col=ffff00>").append(string).toString(), i_12_, i_13_, i_11_, (short) 42, Class150.selectedSpellTargetCursor);
							}
						} else {
							String[] strings = npcType.aStringArray1703;
							if (MouseHandler.showNumbersOnActions) {
								strings = Class120_Sub12_Sub36.addNumbers(strings);
							}
							if (strings != null) {
								for (int i_15_ = 4; i_15_ >= 0; i_15_--) {
									if (strings[i_15_] != null && (Buffer.gameId != 0 || !strings[i_15_].equalsIgnoreCase(Class65.aString591))) {
										short i_16_ = 0;
										int i_17_ = -1;
										if (i_15_ == npcType.anInt1673) {
											i_17_ = npcType.anInt1695;
										}
										if (npcType.anInt1655 == i_15_) {
											i_17_ = npcType.anInt1690;
										}
										if (i_15_ == 0) {
											i_16_ = (short) 39;
										}
										if (i_15_ == 1) {
											i_16_ = (short) 8;
										}
										if (i_15_ == 2) {
											i_16_ = (short) 36;
										}
										if (i_15_ == 3) {
											i_16_ = (short) 25;
										}
										if (i_15_ == 4) {
											i_16_ = (short) 59;
										}
										InvType.addMenuOption(strings[i_15_], new StringBuilder("<col=ffff00>").append(string).toString(), i_12_, i_13_, i_11_, i_16_, i_17_);
									}
								}
							}
							if (Buffer.gameId == 0 && strings != null) {
								for (int i_18_ = 4; i_18_ >= 0; i_18_--) {
									if (strings[i_18_] != null && strings[i_18_].equalsIgnoreCase(Class65.aString591)) {
										short i_19_ = 0;
										if (Class100.selfPlayer.combatLevel < npcType.anInt1674) {
											i_19_ = (short) 2000;
										}
										short i_20_ = 0;
										if (i_18_ == 0) {
											i_20_ = (short) 39;
										}
										if (i_18_ == 1) {
											i_20_ = (short) 8;
										}
										if (i_18_ == 2) {
											i_20_ = (short) 36;
										}
										if (i_18_ == 3) {
											i_20_ = (short) 25;
										}
										if (i_18_ == 4) {
											i_20_ = (short) 59;
										}
										if (i_20_ != 0) {
											i_20_ += i_19_;
										}
										InvType.addMenuOption(strings[i_18_], new StringBuilder("<col=ffff00>").append(string).toString(), i_12_, i_13_, i_11_, i_20_, npcType.anInt1668);
									}
								}
							}
							InvType.addMenuOption(Class11.aString81, new StringBuilder("<col=ffff00>").append(string).toString(), i_12_, i_13_, i_11_, (short) 1010, Class120_Sub12_Sub11.anInt3211);
						}
					} else {
						InvType.addMenuOption(AbstractGraphicsBuffer.aString1176, new StringBuilder(Class192.selectedObjName).append(" -> <col=ffff00>").append(string).toString(), i_12_, i_13_, i_11_, (short) 33, Class120_Sub12_Sub10.anInt3205);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.E(").append(npcType != null ? "{...}" : "null").append(',').append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(')').toString());
		}
	}

	static final int method1581(final int i, final int i_21_, int i_22_, final int i_23_) {
		if (Class158.aBoolean1478) {
			i_22_ = 1000000;
			Class158.aBoolean1478 = false;
		}
		final Class191 class191 = IdentityKit.aClass191ArrayArray1337[i_23_][i_21_];
		final float f = class191.aFloat2102 * (0.7F + 0.1F * i);
		final int i_25_ = class191.anInt2109;
		final float f_26_ = class191.aFloat2106;
		final float f_27_ = class191.aFloat2104;
		final int i_28_ = class191.anInt2111;
		int i_29_ = class191.anInt2118;
		if (!Decimator.fogEnabled) {
			i_29_ = 0;
		}
		final Class120_Sub14_Sub9 class120_sub14_sub9 = class191.aClass120_Sub14_Sub9_2117;
		final float f_30_ = class191.aFloat2114;
		final float f_31_ = class191.aFloat2108;
		final float f_32_ = class191.aFloat2116;
		if (i_25_ != Class120_Sub12_Sub17.anInt3257 || Class120_Sub12.aFloat2569 != f || Class125.aFloat2149 != f_26_ || Class132_Sub2.aFloat2821 != f_27_ || Light.anInt379 != i_28_ || i_29_ != Class43.anInt368 || class120_sub14_sub9 != Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 || Class101.aFloat965 != f_30_ || Class120_Sub2.aFloat2417 != f_32_ || Varp.aFloat622 != f_31_) {
			Class132.anInt1248 = Class9.anInt72;
			Class156.anInt1453 = Deque.anInt1007;
			Class120_Sub12_Sub39.aFloat3444 = Class147.aFloat1395;
			MouseRecorder.aFloat856 = Class66.aFloat600;
			Class120_Sub12_Sub1.aFloat3124 = Class108.aFloat1034;
			FileSystem.aFloat460 = Class120_Sub12_Sub23.aFloat3306;
			Class84.aClass120_Sub14_Sub9_798 = Class3.aClass120_Sub14_Sub9_54;
			Class120_Sub12_Sub30.anInt3376 = CollisionMap.anInt151;
			Class73.aFloat632 = Class101.aFloat962;
			Class24.aFloat144 = Class120_Sub12.aFloat2557;
			if (RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 == null || Class84.aClass120_Sub14_Sub9_798 == RuntimeException_Sub1.aClass120_Sub14_Sub9_2145) {
				RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = new Class120_Sub14_Sub9();
			}
			Class43.anInt368 = i_29_;
			Class132_Sub2.aFloat2821 = f_27_;
			Class120_Sub12.aFloat2569 = f;
			Class57.anInt500 = 0;
			Class120_Sub12_Sub17.anInt3257 = i_25_;
			Class120_Sub2.aFloat2417 = f_32_;
			Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = class120_sub14_sub9;
			Class125.aFloat2149 = f_26_;
			Varp.aFloat622 = f_31_;
			Light.anInt379 = i_28_;
			Class101.aFloat965 = f_30_;
		}
		if (65536 > Class57.anInt500) {
			Class57.anInt500 += i_22_ * 250;
			if (-65537 >= (Class57.anInt500 ^ 0xffffffff)) {
				Class120_Sub12.aFloat2557 = Class101.aFloat965;
				Class66.aFloat600 = Class125.aFloat2149;
				Class101.aFloat962 = Varp.aFloat622;
				Class3.aClass120_Sub14_Sub9_54 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204;
				CollisionMap.anInt151 = Class43.anInt368;
				Class108.aFloat1034 = Class120_Sub2.aFloat2417;
				Class120_Sub12_Sub23.aFloat3306 = Class120_Sub12.aFloat2569;
				Deque.anInt1007 = Light.anInt379;
				Class57.anInt500 = 65536;
				Class84.aClass120_Sub14_Sub9_798 = null;
				Class147.aFloat1395 = Class132_Sub2.aFloat2821;
				Class9.anInt72 = Class120_Sub12_Sub17.anInt3257;
			} else {
				final int i_33_ = 65536 - Class57.anInt500 >> 8;
				final float f_34_ = Class57.anInt500 / 65536.0F;
				final int i_35_ = Class57.anInt500 >> 8;
				CollisionMap.anInt151 = Class120_Sub12_Sub30.anInt3376 * i_33_ - -(Class43.anInt368 * i_35_) >> 8;
				Class9.anInt72 = (i_33_ * (0xff00ff & Class132.anInt1248) - -((Class120_Sub12_Sub17.anInt3257 & 0xff00ff) * i_35_) & ~0xff00ff) + (i_35_ * (0xff00 & Class120_Sub12_Sub17.anInt3257) + (Class132.anInt1248 & 0xff00) * i_33_ & 0xff0000) >> 8;
				final float f_36_ = (-Class57.anInt500 + 65536) / 65536.0F;
				Class120_Sub12_Sub23.aFloat3306 = f_34_ * Class120_Sub12.aFloat2569 + FileSystem.aFloat460 * f_36_;
				Class147.aFloat1395 = f_34_ * Class132_Sub2.aFloat2821 + Class120_Sub12_Sub39.aFloat3444 * f_36_;
				Class120_Sub12.aFloat2557 = f_36_ * Class24.aFloat144 + f_34_ * Class101.aFloat965;
				Class66.aFloat600 = f_34_ * Class125.aFloat2149 + MouseRecorder.aFloat856 * f_36_;
				Deque.anInt1007 = ((0xff00 & Class156.anInt1453) * i_33_ - -((Light.anInt379 & 0xff00) * i_35_) & 0xff0000) + ((Light.anInt379 & 0xff00ff) * i_35_ + i_33_ * (Class156.anInt1453 & 0xff00ff) & ~0xff00ff) >> 8;
				Class101.aFloat962 = f_36_ * Class73.aFloat632 + Varp.aFloat622 * f_34_;
				Class108.aFloat1034 = Class120_Sub2.aFloat2417 * f_34_ + Class120_Sub12_Sub1.aFloat3124 * f_36_;
				if (Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 != Class84.aClass120_Sub14_Sub9_798) {
					if (Class84.aClass120_Sub14_Sub9_798 != null && Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 != null) {
						Class3.aClass120_Sub14_Sub9_54 = RuntimeException_Sub1.aClass120_Sub14_Sub9_2145.method1495(Class84.aClass120_Sub14_Sub9_798, Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204, Class57.anInt500 / 65536.0F);
					} else {
						Class3.aClass120_Sub14_Sub9_54 = null;
					}
				}
			}
		}
		return Deque.anInt1007;
	}

	public static void method1582(final byte i) {
		try {
			aClass120_Sub14_Sub19_3611 = null;
			if (i != -49) {
				anInt3612 = -125;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.D(").append(i).append(')').toString());
		}
	}

	static final boolean method1583(final int i, final int i_37_, final LocType locType, final int i_38_, final int i_39_, final int i_40_, int i_41_) {
		boolean bool;
		try {
			final Class142 class142 = Class120_Sub12_Sub8.method1240((byte) 1, locType.anInt1826);
			if (class142.anInt1363 == -1) {
				return true;
			}
			if (!locType.aBoolean1862) {
				i_41_ = 0;
			} else {
				i_41_ += locType.anInt1869;
				i_41_ &= 0x3;
			}
			if (i_38_ != 4) {
				return true;
			}
			final LDIndexedSprite class107_sub1 = class142.method2011(-1, locType.aBoolean1872, i_41_);
			if (class107_sub1 == null) {
				return false;
			}
			int i_42_ = locType.anInt1841;
			int i_43_ = locType.anInt1827;
			if ((i_41_ & 0x1) == 1) {
				i_42_ = locType.anInt1827;
				i_43_ = locType.anInt1841;
			}
			int i_44_ = class107_sub1.trimWidth;
			int i_45_ = class107_sub1.trimHeight;
			if (class142.aBoolean1359) {
				i_44_ = 4 * i_42_;
				i_45_ = 4 * i_43_;
			}
			if (class142.anInt1360 == 0) {
				class107_sub1.method918(i_39_ * 4 + 48, 48 + (-i_37_ + 104 + -i_43_) * 4, i_44_, i_45_);
			} else {
				class107_sub1.method919(4 * i_39_ + 48, (-i_43_ + -i_37_ + 104) * 4 + 48, i_44_, i_45_, class142.anInt1360);
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("te.G(").append(i).append(',').append(i_37_).append(',').append(locType != null ? "{...}" : "null").append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(',').append(i_41_).append(')').toString());
		}
		return bool;
	}

	static final Class method1584(final int i, final String string) throws ClassNotFoundException {
		Class var_class;
		try {
			if (string.equals("B")) {
				return Byte.TYPE;
			}
			if (string.equals("I")) {
				return Integer.TYPE;
			}
			if (i != 0) {
				return null;
			}
			if (string.equals("S")) {
				return Short.TYPE;
			}
			if (string.equals("J")) {
				return Long.TYPE;
			}
			if (string.equals("Z")) {
				return Boolean.TYPE;
			}
			if (string.equals("F")) {
				return Float.TYPE;
			}
			if (string.equals("D")) {
				return Double.TYPE;
			}
			if (string.equals("C")) {
				return Character.TYPE;
			}
			var_class = Class.forName(string);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("te.B(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return var_class;
	}
}
