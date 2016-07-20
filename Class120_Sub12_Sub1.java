/* Class120_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.util.Random;

final class Class120_Sub12_Sub1 extends Class120_Sub12 {
	static float aFloat3124;
	private int anInt3125 = 409;
	private int anInt3126;
	private int anInt3127;
	private int anInt3128;
	private int anInt3129;
	private int anInt3130;
	static int sleepModifier2 = 20;
	static String aString3132 = "Walk here";
	private int anInt3133 = 1024;
	private int anInt3134;
	private int anInt3135;
	private int anInt3136;
	
	static final void redrawScreen(final int x, final int y, final int width, final int height) {
		for (int id = 0; id < SeqFrameBase.screenRedrawPos; id++) {
			if (x < GrandExchangeObject.screenRedrawXs[id] + Class120_Sub16.screenRedrawWidhts[id] && x + width > GrandExchangeObject.screenRedrawXs[id] && Class120_Sub12_Sub38.screenRedrawYs[id] + Class69_Sub3_Sub1.screenRedrawHeights[id] > y && y + height > Class120_Sub12_Sub38.screenRedrawYs[id]) {
				MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
			}
		}
	}

	@Override
	final int[] method1187(final int i_5_) {
		final int[] is_6_ = this.aClass30_2563.method258(i_5_);
		if (this.aClass30_2563.aBoolean238) {
			int i_7_ = 0;
			final int[][] is_8_ = this.aClass30_2563.method257();
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			boolean bool = true;
			int i_13_ = 0;
			boolean bool_14_ = true;
			final int i_15_ = anInt3135 * Class120_Sub12_Sub7.anInt3178 >> 12;
			int i_16_ = 0;
			final int i_17_ = anInt3125 * Class120_Sub12_Sub2.anInt3145 >> 12;
			final int i_18_ = Class120_Sub12_Sub7.anInt3178 * anInt3136 >> 12;
			final int i_19_ = anInt3134 * Class120_Sub12_Sub2.anInt3145 >> 12;
			if (i_19_ <= 1) {
				return is_8_[i_5_];
			}
			anInt3130 = Class120_Sub12_Sub7.anInt3178 / 8 * anInt3133 >> 12;
			final int i_20_ = 1 - -(Class120_Sub12_Sub7.anInt3178 / i_15_);
			final Random random = new Random(anInt3126);
			int[][] is_21_ = new int[i_20_][3];
			int[][] is_22_ = new int[i_20_][3];
			for (;;) {
				int i_23_ = i_15_ - -Class28.method244(random, -i_15_ + i_18_);
				int i_24_ = Class28.method244(random, -i_17_ + i_19_) + i_17_;
				int i_25_ = i_10_ + i_23_;
				if (i_25_ > Class120_Sub12_Sub7.anInt3178) {
					i_23_ = -i_10_ + Class120_Sub12_Sub7.anInt3178;
					i_25_ = Class120_Sub12_Sub7.anInt3178;
				}
				int i_26_;
				if (bool) {
					i_26_ = 0;
				} else {
					int i_27_ = i_12_;
					final int[] is_28_ = is_22_[i_12_];
					i_26_ = is_28_[2];
					int i_29_ = 0;
					int i_30_ = i_7_ + i_25_;
					if (i_30_ < 0) {
						i_30_ += Class120_Sub12_Sub7.anInt3178;
					}
					if (Class120_Sub12_Sub7.anInt3178 < i_30_) {
						i_30_ -= Class120_Sub12_Sub7.anInt3178;
					}
					for (;;) {
						final int[] is_31_ = is_22_[i_27_];
						if (is_31_[0] <= i_30_ && i_30_ <= is_31_[1]) {
							break;
						}
						if (++i_27_ >= i_13_) {
							i_27_ = 0;
						}
						i_29_++;
					}
					if (i_27_ != i_12_) {
						int i_32_ = i_10_ - -i_7_;
						if (i_32_ < 0) {
							i_32_ += Class120_Sub12_Sub7.anInt3178;
						}
						if (i_32_ > Class120_Sub12_Sub7.anInt3178) {
							i_32_ -= Class120_Sub12_Sub7.anInt3178;
						}
						for (int i_33_ = 1; i_29_ >= i_33_; i_33_++) {
							final int[] is_34_ = is_22_[(i_33_ + i_12_) % i_13_];
							i_26_ = Math.max(i_26_, is_34_[2]);
						}
						for (int i_35_ = 0; i_35_ <= i_29_; i_35_++) {
							final int[] is_36_ = is_22_[(i_35_ + i_12_) % i_13_];
							final int i_37_ = is_36_[2];
							if (i_37_ != i_26_) {
								final int i_38_ = is_36_[1];
								final int i_39_ = is_36_[0];
								int i_40_;
								int i_41_;
								if (i_32_ >= i_30_) {
									if (i_39_ != 0) {
										i_40_ = Math.max(i_32_, i_39_);
										i_41_ = Class120_Sub12_Sub7.anInt3178;
									} else {
										i_41_ = Math.min(i_30_, i_38_);
										i_40_ = 0;
									}
								} else {
									i_40_ = Math.max(i_32_, i_39_);
									i_41_ = Math.min(i_30_, i_38_);
								}
								method1198(-i_37_ + i_26_, i_41_ + -i_40_, i_11_ + i_40_, i_37_, random, is_8_);
							}
						}
					}
					i_12_ = i_27_;
				}
				if (Class120_Sub12_Sub2.anInt3145 < i_24_ + i_26_) {
					i_24_ = -i_26_ + Class120_Sub12_Sub2.anInt3145;
				} else {
					bool_14_ = false;
				}
				if (i_25_ != Class120_Sub12_Sub7.anInt3178) {
					final int[] is_42_ = is_21_[i_16_++];
					is_42_[1] = i_25_;
					is_42_[2] = i_24_ + i_26_;
					is_42_[0] = i_10_;
					method1198(i_24_, i_23_, i_9_ + i_10_, i_26_, random, is_8_);
					i_10_ = i_25_;
				} else {
					method1198(i_24_, i_23_, i_9_ + i_10_, i_26_, random, is_8_);
					if (bool_14_) {
						break;
					}
					bool = false;
					final int[] is_43_ = is_21_[i_16_++];
					bool_14_ = true;
					is_43_[1] = i_25_;
					i_11_ = i_9_;
					i_13_ = i_16_;
					is_43_[0] = i_10_;
					is_43_[2] = i_24_ + i_26_;
					i_9_ = Class28.method244(random, Class120_Sub12_Sub7.anInt3178);
					final int[][] is_44_ = is_22_;
					i_12_ = 0;
					i_7_ = i_9_ + -i_11_;
					is_22_ = is_21_;
					int i_45_ = i_7_;
					is_21_ = is_44_;
					if (i_45_ < 0) {
						i_45_ += Class120_Sub12_Sub7.anInt3178;
					}
					i_16_ = 0;
					if (Class120_Sub12_Sub7.anInt3178 < i_45_) {
						i_45_ -= Class120_Sub12_Sub7.anInt3178;
					}
					for (;;) {
						final int[] is_46_ = is_22_[i_12_];
						if (i_45_ >= is_46_[0] && is_46_[1] >= i_45_) {
							break;
						}
						if (i_13_ <= ++i_12_) {
							i_12_ = 0;
						}
					}
					i_10_ = 0;
				}
			}
		}
		return is_6_;
	}

	@Override
	final void postDecode() {
		/* empty */
	}

	static final Frame goFullscreen(int bitDepth, final int width, final int height, final int refreshRate, final Signlink signlink) {
		if (!signlink.canUseFullscreen()) {
			return null;
		}
		if (bitDepth == 0) {		
			final DisplayModeInfo[] displayModes = EnumType.getDisplayModes(signlink);
			if (displayModes == null) {
				return null;
			}
			boolean chosen = false;
			for (int dmId = 0; dmId < displayModes.length; dmId++) {
				final DisplayModeInfo displayModeInfo = displayModes[dmId];
				if (width == displayModeInfo.width && height == displayModeInfo.height && (refreshRate == 0 || refreshRate == displayModeInfo.refreshRate) && (!chosen || bitDepth < displayModeInfo.bitDepth)) {
					chosen = true;
					bitDepth = displayModeInfo.bitDepth;
				}
			}
			if (!chosen) {
				return null;
			}
		}
		final SignlinkNode signlinkNode = signlink.createFullscreenFrame(refreshRate, width, height, bitDepth);
		while (signlinkNode.status == 0) {
			PacketBuffer.sleepWrapper(10L);
		}
		final Frame frame = (Frame) signlinkNode.value;
		if (frame == null) {
			return null;
		}
		if (signlinkNode.status == 2) {
			Class150.revertFrame(signlink, frame);
			return null;
		}
		return frame;
	}

	private final void method1198(final int i, final int i_55_, int i_56_, final int i_57_, final Random random, final int[][] is) {
		final int i_59_ = anInt3129 > 0 ? 4096 + -Class28.method244(random, anInt3129) : 4096;
		final int i_60_ = anInt3130 * anInt3127 >> 12;
		final int i_61_ = anInt3130 + -((i_60_ ^ 0xffffffff) < -1 ? Class28.method244(random, i_60_) : 0);
		if (Class120_Sub12_Sub7.anInt3178 <= i_56_) {
			i_56_ -= Class120_Sub12_Sub7.anInt3178;
		}
		if (i_61_ > 0) {
			if (i > 0 && i_55_ > 0) {
				final int i_62_ = i_55_ / 2;
				final int i_63_ = i / 2;
				final int i_64_ = i_62_ >= i_61_ ? i_61_ : i_62_;
				final int i_65_ = i_61_ > i_63_ ? i_63_ : i_61_;
				final int i_66_ = i_56_ + i_64_;
				final int i_67_ = -(i_64_ * 2) + i_55_;
				for (int i_68_ = 0; i_68_ < i; i_68_++) {
					final int[] is_69_ = is[i_68_ - -i_57_];
					if (i_65_ > i_68_) {
						final int i_70_ = i_68_ * i_59_ / i_65_;
						if (anInt3128 != 0) {
							for (int i_71_ = 0; i_71_ < i_64_; i_71_++) {
								final int i_72_ = i_59_ * i_71_ / i_64_;
								is_69_[Class120_Sub12_Sub3.method1207(i_71_ + i_56_, MagnetType.anInt259)] = is_69_[Class120_Sub12_Sub3.method1207(-1 + -i_71_ + i_55_ + i_56_, MagnetType.anInt259)] = i_70_ <= i_72_ ? i_70_ : i_72_;
							}
						} else {
							for (int i_73_ = 0; i_64_ > i_73_; i_73_++) {
								final int i_74_ = i_59_ * i_73_ / i_64_;
								is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, i_73_ + i_56_)] = is_69_[Class120_Sub12_Sub3.method1207(i_56_ + i_55_ - (i_73_ + 1), MagnetType.anInt259)] = i_74_ * i_70_ >> 12;
							}
						}
						if (i_66_ - -i_67_ > Class120_Sub12_Sub7.anInt3178) {
							final int i_75_ = -i_66_ + Class120_Sub12_Sub7.anInt3178;
							ArrayUtils.fillArray(is_69_, i_66_, i_75_, i_70_);
							ArrayUtils.fillArray(is_69_, 0, i_67_ + -i_75_, i_70_);
						} else {
							ArrayUtils.fillArray(is_69_, i_66_, i_67_, i_70_);
						}
					} else {
						final int i_76_ = i + -i_68_ - 1;
						if (i_65_ > i_76_) {
							final int i_77_ = i_76_ * i_59_ / i_65_;
							if (anInt3128 != 0) {
								for (int i_78_ = 0; i_64_ > i_78_; i_78_++) {
									final int i_79_ = i_59_ * i_78_ / i_64_;
									is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, i_78_ + i_56_)] = is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, -i_78_ + i_56_ - -i_55_ - 1)] = i_77_ > i_79_ ? i_79_ : i_77_;
								}
							} else {
								for (int i_80_ = 0; i_80_ < i_64_; i_80_++) {
									final int i_81_ = i_80_ * i_59_ / i_64_;
									is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, i_56_ - -i_80_)] = is_69_[Class120_Sub12_Sub3.method1207(-1 + -i_80_ + i_55_ + i_56_, MagnetType.anInt259)] = i_77_ * i_81_ >> 12;
								}
							}
							if (Class120_Sub12_Sub7.anInt3178 < i_67_ + i_66_) {
								final int i_82_ = -i_66_ + Class120_Sub12_Sub7.anInt3178;
								ArrayUtils.fillArray(is_69_, i_66_, i_82_, i_77_);
								ArrayUtils.fillArray(is_69_, 0, i_67_ + -i_82_, i_77_);
							} else {
								ArrayUtils.fillArray(is_69_, i_66_, i_67_, i_77_);
							}
						} else {
							for (int i_83_ = 0; i_83_ < i_64_; i_83_++) {
								is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, i_56_ - -i_83_)] = is_69_[Class120_Sub12_Sub3.method1207(MagnetType.anInt259, -i_83_ + i_55_ + i_56_ + -1)] = i_59_ * i_83_ / i_64_;
							}
							if (i_66_ - -i_67_ <= Class120_Sub12_Sub7.anInt3178) {
								ArrayUtils.fillArray(is_69_, i_66_, i_67_, i_59_);
							} else {
								final int i_84_ = -i_66_ + Class120_Sub12_Sub7.anInt3178;
								ArrayUtils.fillArray(is_69_, i_66_, i_84_, i_59_);
								ArrayUtils.fillArray(is_69_, 0, -i_84_ + i_67_, i_59_);
							}
						}
					}
				}
			}
		} else if (Class120_Sub12_Sub7.anInt3178 >= i_55_ + i_56_) {
			for (int i_85_ = 0; i > i_85_; i_85_++) {
				ArrayUtils.fillArray(is[i_85_ + i_57_], i_56_, i_55_, i_59_);
			}
		} else {
			final int i_86_ = Class120_Sub12_Sub7.anInt3178 - i_56_;
			for (int i_87_ = 0; i_87_ < i; i_87_++) {
				final int[] is_88_ = is[i_87_ + i_57_];
				ArrayUtils.fillArray(is_88_, i_56_, i_86_, i_59_);
				ArrayUtils.fillArray(is_88_, 0, -i_86_ + i_55_, i_59_);
			}
		}
	}

	static final int method1200(final int i) {
		if (i == 0xFF00FF) {
			return -1;
		}
		return InterfaceClickMask.method1688(i);
	}

	public Class120_Sub12_Sub1() {
		super(0, true);
		anInt3129 = 1024;
		anInt3134 = 819;
		anInt3128 = 0;
		anInt3127 = 1024;
		anInt3135 = 1024;
		anInt3126 = 0;
		anInt3136 = 2048;
	}

	@Override
	final void decode(final Buffer buffer, final int i_94_) {
		while_111_: do {
			while_110_: do {
				while_109_: do {
					while_108_: do {
						while_107_: do {
							while_106_: do {
								while_105_: do {
									do {
										if (i_94_ != 0) {
											if (i_94_ != 1) {
												if (i_94_ != 2) {
													if (i_94_ != 3) {
														if (i_94_ != 4) {
															if (i_94_ != 5) {
																if (i_94_ != 6) {
																	if (i_94_ != 7) {
																		if (i_94_ == 8) {
																			break while_110_;
																		}
																		break while_111_;
																	}
																} else {
																	break while_108_;
																}
																break while_109_;
															}
														} else {
															break while_106_;
														}
														break while_107_;
													}
												} else {
													break;
												}
												break while_105_;
											}
										} else {
											anInt3126 = buffer.getUByte();
											break while_111_;
										}
										anInt3135 = buffer.getUShort();
										break while_111_;
									} while (false);
									anInt3136 = buffer.getUShort();
									break while_111_;
								} while (false);
								anInt3125 = buffer.getUShort();
								break while_111_;
							} while (false);
							anInt3134 = buffer.getUShort();
							break while_111_;
						} while (false);
						anInt3133 = buffer.getUShort();
						break while_111_;
					} while (false);
					anInt3128 = buffer.getUByte();
					break while_111_;
				} while (false);
				anInt3127 = buffer.getUShort();
				break while_111_;
			} while (false);
			anInt3129 = buffer.getUShort();
		} while (false);
	}
}
