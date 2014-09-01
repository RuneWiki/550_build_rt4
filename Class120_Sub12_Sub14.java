/* Class120_Sub12_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub14 extends Class120_Sub12 {
	private Class101[] aClass101Array3237;
	static int[] anIntArray3239;
	static int anInt3240 = 0;

	static final void tbrefresh() {
		if (!Class31.advertSuppressed && AbstractIndexedSprite.modeWhere != 2) {
			try {
				JSHelper.call(Class179.aClient1776, "tbrefresh");
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			method1272(this.aClass30_2563.method257());
		}
		return is_1_;
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_3_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int i_4_ = Class120_Sub12_Sub7.anInt3178;
			final int i_5_ = Class120_Sub12_Sub2.anInt3145;
			final int[][] is_6_ = new int[i_5_][i_4_];
			final int[][][] is_7_ = this.aClass109_2559.method973(0);
			method1272(is_6_);
			for (int i_8_ = 0; i_8_ < Class120_Sub12_Sub2.anInt3145; i_8_++) {
				final int[][] is_9_ = is_7_[i_8_];
				final int[] is_10_ = is_9_[1];
				final int[] is_11_ = is_9_[2];
				final int[] is_12_ = is_6_[i_8_];
				final int[] is_13_ = is_9_[0];
				for (int i_14_ = 0; i_14_ < Class120_Sub12_Sub7.anInt3178; i_14_++) {
					final int i_15_ = is_12_[i_14_];
					is_11_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ << 4, 4080);
					is_10_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ >> 4, 4080);
					is_13_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ >> 12, 4080);
				}
			}
		}
		return is_3_;
	}

	static final void method1269(final int size) {
		int playerCount = FileSystemWorker.localPlayerCount;
		if (size == 0) {
			playerCount = 1;
		}
		for (int id = 0; id < playerCount; id++) {
			Player player;
			if (size == 0) {
				player = TileParticleQueue.selfPlayer;
			} else {
				player = Class118.playersList[Class112.playerIndices[id]];
			}
			if (player != null && player.isVisible()) {
				final int playerSize = player.getSize();
				if (size == 0 || size == playerSize) {
					if (playerSize != 1) {
						if (((playerSize & 0x1) != 0 || (player.x & 0x7f) == 0 && (0x7f & player.z) == 0) && ((0x1 & playerSize) != 1 || (0x7f & player.x) == 64 && (player.z & 0x7f) == 64)) {
							int i_20_ = player.x - playerSize * 64 >> 7;
							int i_21_ = player.z - playerSize * 64 >> 7;
							int i_22_ = i_20_ + player.getSize();
							if (i_22_ > 104) {
								i_22_ = 104;
							}
							if (i_20_ < 0) {
								i_20_ = 0;
							}
							int i_23_ = i_21_ + player.getSize();
							if (i_21_ < 0) {
								i_21_ = 0;
							}
							if (i_23_ > 104) {
								i_23_ = 104;
							}
							for (int i_24_ = i_20_; i_24_ < i_22_; i_24_++) {
								for (int i_25_ = i_21_; i_25_ < i_23_; i_25_++) {
									FileSystemRequest.anIntArrayArray3933[i_24_][i_25_]++;
								}
							}
						}
					} else if ((player.x & 0x7f) == 64 && (player.z & 0x7f) == 64) {
						final int i_26_ = player.x >> 7;
						final int i_27_ = player.z >> 7;
						if (i_26_ >= 0 && i_26_ < 104 && i_27_ >= 0 && i_27_ < 104) {
							FileSystemRequest.anIntArrayArray3933[i_26_][i_27_]++;
						}
					}
				}
			}
		}
		for (int i_28_ = 0; i_28_ < playerCount; i_28_++) {
			Player class180_sub5_sub1;
			long l;
			if (size == 0) {
				l = 8791798054912L;
				class180_sub5_sub1 = TileParticleQueue.selfPlayer;
			} else {
				class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_28_]];
				l = (long) Class112.playerIndices[i_28_] << 32;
			}
			if (class180_sub5_sub1 != null && class180_sub5_sub1.isVisible()) {
				final int i_29_ = class180_sub5_sub1.getSize();
				if (size == 0 || size == i_29_) {
					class180_sub5_sub1.playerLimitReached = false;
					class180_sub5_sub1.aBoolean2992 = true;
					if ((Class120_Sub12_Sub10.manyIdleAnimations && FileSystemWorker.localPlayerCount > 200 || FileSystemWorker.localPlayerCount > 50) && size != 0 && class180_sub5_sub1.anInt3004 == class180_sub5_sub1.method2336().anInt218) {
						class180_sub5_sub1.playerLimitReached = true;
					}
					if (i_29_ == 1) {
						if ((class180_sub5_sub1.x & 0x7f) == 64 && (class180_sub5_sub1.z & 0x7f) == 64) {
							final int i_30_ = class180_sub5_sub1.x >> 7;
							final int i_31_ = class180_sub5_sub1.z >> 7;
							if (i_30_ < 0 || i_30_ >= 104 || i_31_ < 0 || i_31_ >= 104) {
								continue;
							}
							if (FileSystemRequest.anIntArrayArray3933[i_30_][i_31_] > 1) {
								FileSystemRequest.anIntArrayArray3933[i_30_][i_31_]--;
								continue;
							}
						}
					} else if ((0x1 & i_29_) == 0 && (0x7f & class180_sub5_sub1.x) == 0 && (0x7f & class180_sub5_sub1.z) == 0 || (0x1 & i_29_) == 1 && (class180_sub5_sub1.x & 0x7f) == 64 && (class180_sub5_sub1.z & 0x7f) == 0) {
						int i_32_ = class180_sub5_sub1.z + -(i_29_ * 64) >> 7;
						int i_33_ = class180_sub5_sub1.x + -(64 * i_29_) >> 7;
						int i_34_ = i_29_ + i_33_;
						if (i_33_ < 0) {
							i_33_ = 0;
						}
						if (i_34_ > 104) {
							i_34_ = 104;
						}
						boolean bool = true;
						int i_35_ = i_29_ + i_32_;
						if (i_32_ < 0) {
							i_32_ = 0;
						}
						if (i_35_ > 104) {
							i_35_ = 104;
						}
						for (int i_36_ = i_33_; i_36_ < i_34_; i_36_++) {
							for (int i_37_ = i_32_; i_37_ < i_35_; i_37_++) {
								if (FileSystemRequest.anIntArrayArray3933[i_36_][i_37_] <= 1) {
									bool = false;
									break;
								}
							}
						}
						if (bool) {
							for (int i_38_ = i_33_; i_34_ > i_38_; i_38_++) {
								for (int i_39_ = i_32_; i_35_ > i_39_; i_39_++) {
									FileSystemRequest.anIntArrayArray3933[i_38_][i_39_]--;
								}
							}
							continue;
						}
					}
					if (class180_sub5_sub1.anObject3047 == null || Class101_Sub2.loopCycle < class180_sub5_sub1.anInt3042 || class180_sub5_sub1.anInt3012 <= Class101_Sub2.loopCycle) {
						class180_sub5_sub1.aBoolean2992 = false;
						class180_sub5_sub1.y = Class22.getTileHeight(class180_sub5_sub1.x, class180_sub5_sub1.z, Class173.gameLevel);
						Class120_Sub12_Sub5.method1218(Class173.gameLevel, class180_sub5_sub1.x, class180_sub5_sub1.z, class180_sub5_sub1.y, 64 * (i_29_ - 1) - -60, class180_sub5_sub1, class180_sub5_sub1.anInt3032, l, class180_sub5_sub1.aBoolean3002);
					} else {
						class180_sub5_sub1.playerLimitReached = false;
						class180_sub5_sub1.aBoolean2992 = false;
						class180_sub5_sub1.y = Class22.getTileHeight(class180_sub5_sub1.x, class180_sub5_sub1.z, Class173.gameLevel);
						Class26.method230(Class173.gameLevel, class180_sub5_sub1.x, class180_sub5_sub1.z, class180_sub5_sub1.y, class180_sub5_sub1, class180_sub5_sub1.anInt3032, l, class180_sub5_sub1.anInt3043, class180_sub5_sub1.anInt3020, class180_sub5_sub1.anInt3041, class180_sub5_sub1.anInt3038);
					}
				}
			}
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_40_) {
		if (i_40_ == 0) {
			aClass101Array3237 = new Class101[buffer.getUByte()];
			while_200_: for (int i_41_ = 0; i_41_ < aClass101Array3237.length; i_41_++) {
				final int i_42_ = buffer.getUByte();
				final int i_43_ = i_42_;
				while_198_: do {
					do {
						if (i_43_ != 0) {
							if (i_43_ != 1) {
								if (i_43_ != 2) {
									if (i_43_ != 3) {
										continue while_200_;
									}
								} else {
									break;
								}
								break while_198_;
							}
						} else {
							aClass101Array3237[i_41_] = Class120_Sub12_Sub29.method1357(buffer, 116);
							continue while_200_;
						}
						aClass101Array3237[i_41_] = Class120_Sub12_Sub30.method1362(buffer);
						continue while_200_;
					} while (false);
					aClass101Array3237[i_41_] = Class120_Sub12_Sub29.method1356(buffer, 0);
					continue while_200_;
				} while (false);
				aClass101Array3237[i_41_] = Class187.method2475(buffer, true);
			}
		} else if (i_40_ == 1) {
			this.aBoolean2558 = buffer.getUByte() == 1;
		}
	}

	public Class120_Sub12_Sub14() {
		super(0, true);
	}

	static final Class120_Sub9[] method1270(final int[][][] is, final byte[][] is_44_, final float[][] fs, final int[][] is_45_, final int[][] is_46_, final float[][] fs_47_, final byte[][] is_48_, final int[][] is_49_, final byte[][] is_50_, final int i, final float[][] fs_51_,
			final int[][] is_52_, final byte[][][] is_53_, final byte[][] is_54_, final boolean bool, final int[][] is_55_) {
		Class120_Sub9[] class120_sub9s;
		try {
			final int[][] is_56_ = new int[105][105];
			int i_57_ = 1;
			if (bool) {
				return null;
			}
			for (/**/; i_57_ <= 103; i_57_++) {
				for (int i_58_ = 1; i_58_ <= 103; i_58_++) {
					int i_59_ = 0;
					if (is != null) {
						final int i_60_ = is[i][i_57_ >> 3][i_58_ >> 3];
						i_59_ = 0x3 & i_60_ >> 1;
					}
					int i_61_;
					if (i_59_ != 0) {
						if (i_59_ != 1) {
							if (i_59_ == 2) {
								i_61_ = is_54_[i_57_ - 1][-1 + i_58_];
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_][-1 + i_58_];
								}
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_ - 1][i_58_];
								}
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_][i_58_];
								}
							} else {
								i_61_ = is_54_[i_57_ + -1][i_58_];
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_ - 1][-1 + i_58_];
								}
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_][i_58_];
								}
								if (i_61_ == 0) {
									i_61_ = is_54_[i_57_][-1 + i_58_];
								}
							}
						} else {
							i_61_ = is_54_[i_57_][i_58_ - 1];
							if (i_61_ == 0) {
								i_61_ = is_54_[i_57_][i_58_];
							}
							if (i_61_ == 0) {
								i_61_ = is_54_[i_57_ - 1][-1 + i_58_];
							}
							if (i_61_ == 0) {
								i_61_ = is_54_[-1 + i_57_][i_58_];
							}
						}
					} else {
						i_61_ = is_54_[i_57_][i_58_];
						if (i_61_ == 0) {
							i_61_ = is_54_[i_57_ + -1][i_58_];
						}
						if (i_61_ == 0) {
							i_61_ = is_54_[i_57_][i_58_ + -1];
						}
						if (i_61_ == 0) {
							i_61_ = is_54_[i_57_ - 1][-1 + i_58_];
						}
					}
					if (i_61_ != 0) {
						final UnderlayType overlayType = UnderlayType.list(-1 + (i_61_ & 0xff));
						is_56_[i_57_][i_58_] = (overlayType.anInt1227 + 1 << 16) + overlayType.anInt1225;
					}
				}
			}
			final Hashtable hashtable = new Hashtable(128);
			for (int i_62_ = 1; i_62_ <= 102; i_62_++) {
				for (int i_63_ = 1; i_63_ <= 102; i_63_++) {
					if (is_54_[i_62_][i_63_] != 0) {
						int[] is_64_;
						if (is_44_[i_62_][i_63_] == 0) {
							is_64_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
						} else {
							is_64_ = InterfaceChangeNode.anIntArrayArray3488[is_48_[i_62_][i_63_]];
							if (is_64_.length == 0) {
								continue;
							}
						}
						final int i_65_ = is_56_[i_62_][i_63_];
						final int i_66_ = is_56_[1 + i_62_][i_63_];
						int i_67_ = 0;
						if (is_45_ != null) {
							i_67_ = is_45_[i_62_][i_63_] & 0xffffff;
						}
						final int i_68_ = is_56_[1 + i_62_][1 + i_63_];
						final long l = (long) i_65_ << 32 | i_67_;
						final long l_69_ = (long) i_66_ << 32 | i_67_;
						final int i_70_ = is_56_[i_62_][1 + i_63_];
						final long l_71_ = (long) i_70_ << 32 | i_67_;
						final long l_72_ = (long) i_68_ << 32 | i_67_;
						final int i_73_ = is_64_.length / 2;
						Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.get(l);
						if (class120_sub9 == null) {
							class120_sub9 = new Class120_Sub9((i_65_ >> 16) - 1, i_65_ & 0xffff, false, is_52_ != null, i_67_);
							hashtable.put(class120_sub9, l);
						}
						class120_sub9.anInt2507 += i_73_;
						class120_sub9.anInt2519++;
						if ((l_69_ ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL)) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_69_);
							if (class120_sub9 == null) {
								class120_sub9 = new Class120_Sub9(-1 + (i_66_ >> 16), 0xffff & i_66_, false, is_52_ != null, i_67_);
								hashtable.put(class120_sub9, l_69_);
							}
							class120_sub9.anInt2507 += i_73_;
							class120_sub9.anInt2519++;
						}
						if ((l_72_ ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL) && l_72_ != l_69_) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_72_);
							if (class120_sub9 == null) {
								class120_sub9 = new Class120_Sub9(-1 + (i_68_ >> 16), i_68_ & 0xffff, false, is_52_ != null, i_67_);
								hashtable.put(class120_sub9, l_72_);
							}
							class120_sub9.anInt2519++;
							class120_sub9.anInt2507 += i_73_;
						}
						if ((l ^ 0xffffffffffffffffL) != (l_71_ ^ 0xffffffffffffffffL) && l_69_ != l_71_ && (l_71_ ^ 0xffffffffffffffffL) != (l_72_ ^ 0xffffffffffffffffL)) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_71_);
							if (class120_sub9 == null) {
								class120_sub9 = new Class120_Sub9((i_70_ >> 16) + -1, 0xffff & i_70_, false, is_52_ != null, i_67_);
								hashtable.put(class120_sub9, l_71_);
							}
							class120_sub9.anInt2507 += i_73_;
							class120_sub9.anInt2519++;
						}
					}
				}
			}
			for (Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (Class120_Sub9) hashtable.getNext()) {
				class120_sub9.method1167();
			}
			for (int i_74_ = 1; i_74_ <= 102; i_74_++) {
				for (int i_75_ = 1; i_75_ <= 102; i_75_++) {
					final int i_76_ = is_54_[i_74_][i_75_];
					if (i_76_ != 0) {
						int i_77_ = 0;
						int i_78_;
						if ((is_53_[i][i_74_][i_75_] & 0x8) == 0) {
							if ((is_53_[1][i_74_][i_75_] & 0x2) != 2 || i <= 0) {
								i_78_ = i;
							} else {
								i_78_ = i - 1;
							}
						} else {
							i_78_ = 0;
						}
						int i_79_ = 128;
						if (is_45_ != null) {
							i_77_ = is_45_[i_74_][i_75_] & 0xffffff;
							i_79_ = is_45_[i_74_][i_75_] >>> 24 << 3;
						}
						boolean[] bools = null;
						int[] is_80_;
						byte i_81_;
						if (is_44_[i_74_][i_75_] == 0) {
							int i_82_ = 0;
							is_80_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
							i_82_ = i_82_ + (is_54_[i_74_ + -1][i_75_ - 1] == i_76_ ? 1 : -1);
							int i_83_ = 0;
							int i_84_ = 0;
							i_84_ = i_84_ + (i_76_ == is_54_[i_74_ + 1][i_75_ - 1] ? 1 : -1);
							int i_85_ = 0;
							i_85_ = i_85_ + (is_54_[i_74_ - 1][1 + i_75_] != i_76_ ? -1 : 1);
							if (is_54_[i_74_][-1 + i_75_] == i_76_) {
								i_82_++;
								i_84_++;
							} else {
								i_84_--;
								i_82_--;
							}
							i_83_ = i_83_ + (is_54_[i_74_ + 1][i_75_ - -1] == i_76_ ? 1 : -1);
							if (i_76_ == is_54_[i_74_ + 1][i_75_]) {
								i_84_++;
								i_83_++;
							} else {
								i_84_--;
								i_83_--;
							}
							if (is_54_[i_74_][i_75_ - -1] == i_76_) {
								i_83_++;
								i_85_++;
							} else {
								i_85_--;
								i_83_--;
							}
							if (i_76_ == is_54_[-1 + i_74_][i_75_]) {
								i_85_++;
								i_82_++;
							} else {
								i_85_--;
								i_82_--;
							}
							int i_86_ = -i_83_ + i_82_;
							int i_87_ = -i_85_ + i_84_;
							if (i_87_ < 0) {
								i_87_ = -i_87_;
							}
							if (i_86_ < 0) {
								i_86_ = -i_86_;
							}
							i_81_ = (byte) (i_86_ >= i_87_ ? 0 : 1);
							is_50_[i_74_][i_75_] = i_81_;
						} else {
							is_80_ = InterfaceChangeNode.anIntArrayArray3488[is_48_[i_74_][i_75_]];
							i_81_ = is_50_[i_74_][i_75_];
							bools = Class92.aBooleanArrayArray865[is_48_[i_74_][i_75_]];
							if (is_80_.length == 0) {
								continue;
							}
						}
						final int i_88_ = is_56_[i_74_][i_75_];
						final int i_89_ = is_56_[i_74_ + 1][i_75_];
						final int i_90_ = is_56_[i_74_ + 1][i_75_ + 1];
						final int i_91_ = is_56_[i_74_][i_75_ + 1];
						final long l = i_77_ | (long) i_88_ << 32;
						final long l_92_ = i_77_ | (long) i_90_ << 32;
						final long l_93_ = (long) i_91_ << 32 | i_77_;
						final long l_94_ = i_77_ | (long) i_89_ << 32;
						final int i_95_ = is_46_[i_74_][i_75_];
						final int i_96_ = is_46_[i_74_ - -1][i_75_];
						final int i_97_ = is_46_[1 + i_74_][1 + i_75_];
						final int i_98_ = is_49_[i_74_][i_75_];
						final int i_99_ = is_46_[i_74_][1 + i_75_];
						final int i_100_ = is_49_[1 + i_74_][i_75_];
						final int i_101_ = is_49_[i_74_ + 1][i_75_ + 1];
						final int i_102_ = is_49_[i_74_][1 + i_75_];
						final int i_103_ = (i_88_ >> 16) + -1;
						final int i_104_ = (i_91_ >> 16) + -1;
						final int i_105_ = (i_90_ >> 16) - 1;
						Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.get(l);
						final int i_106_ = -1 + (i_89_ >> 16);
						Class96.method786(i_88_ <= i_91_, i_75_, i_88_ <= i_89_, fs_47_, fs_51_, class120_sub9, (byte) -39, is_55_, FileSystem.method443(i_102_, i_103_, 13080, i_99_), FileSystem.method443(i_101_, i_103_, 13080, i_97_), i_81_, i_78_, i_88_ <= i_90_, i_79_, fs,
								FileSystem.method443(i_100_, i_103_, 13080, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_103_, 13080, i_95_), is_80_, i_88_ <= i_88_);
						if (l_94_ != l) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_94_);
							Class96.method786(i_91_ >= i_89_, i_75_, i_89_ >= i_89_, fs_47_, fs_51_, class120_sub9, (byte) -39, is_55_, FileSystem.method443(i_102_, i_106_, 13080, i_99_), FileSystem.method443(i_101_, i_106_, 13080, i_97_), i_81_, i_78_, i_89_ <= i_90_, i_79_, fs,
									FileSystem.method443(i_100_, i_106_, 13080, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_106_, 13080, i_95_), is_80_, i_89_ <= i_88_);
						}
						if (l != l_92_ && (l_92_ ^ 0xffffffffffffffffL) != (l_94_ ^ 0xffffffffffffffffL)) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_92_);
							Class96.method786(i_90_ <= i_91_, i_75_, i_90_ <= i_89_, fs_47_, fs_51_, class120_sub9, (byte) -39, is_55_, FileSystem.method443(i_102_, i_105_, 13080, i_99_), FileSystem.method443(i_101_, i_105_, 13080, i_97_), i_81_, i_78_, i_90_ <= i_90_, i_79_, fs,
									FileSystem.method443(i_100_, i_105_, 13080, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_105_, 13080, i_95_), is_80_, i_90_ <= i_88_);
						}
						if (l_93_ != l && l_93_ != l_94_ && (l_92_ ^ 0xffffffffffffffffL) != (l_93_ ^ 0xffffffffffffffffL)) {
							class120_sub9 = (Class120_Sub9) hashtable.get(l_93_);
							Class96.method786(i_91_ <= i_91_, i_75_, i_89_ >= i_91_, fs_47_, fs_51_, class120_sub9, (byte) -39, is_55_, FileSystem.method443(i_102_, i_104_, 13080, i_99_), FileSystem.method443(i_101_, i_104_, 13080, i_97_), i_81_, i_78_, i_91_ <= i_90_, i_79_, fs,
									FileSystem.method443(i_100_, i_104_, 13080, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_104_, 13080, i_95_), is_80_, i_91_ <= i_88_);
						}
					}
				}
			}
			for (Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (Class120_Sub9) hashtable.getNext()) {
				if (class120_sub9.anInt2527 == 0) {
					class120_sub9.unlink();
				} else {
					class120_sub9.method1161();
				}
			}
			final int i_107_ = hashtable.getCount();
			final Class120_Sub9[] class120_sub9s_108_ = new Class120_Sub9[i_107_];
			hashtable.method660(class120_sub9s_108_);
			final long[] ls = new long[i_107_];
			for (int i_109_ = 0; i_109_ < i_107_; i_109_++) {
				ls[i_109_] = class120_sub9s_108_[i_109_].uid;
			}
			Class24.method209(-4391, ls, class120_sub9s_108_);
			class120_sub9s = class120_sub9s_108_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "km.U(");
		}
		return class120_sub9s;
	}

	private final void method1272(final int[][] is) {
		final int i_112_ = Class120_Sub12_Sub7.anInt3178;
		final int i_113_ = Class120_Sub12_Sub2.anInt3145;
		GameEntity.anIntArrayArray3009 = is;
		Class69.method616(0, 0, Class120_Sub29.anInt2774, Class32.anInt259);
		if (aClass101Array3237 != null) {
			for (final Class101 class101 : aClass101Array3237) {
				final int i_115_ = class101.anInt964;
				final int i_116_ = class101.anInt960;
				if (i_116_ < 0) {
					if (i_115_ >= 0) {
						class101.method837(i_112_, i_113_);
					}
				} else if (i_115_ < 0) {
					class101.method834(i_112_, i_113_);
				} else {
					class101.method833(i_112_, i_113_);
				}
			}
		}
	}

	public static void method1273(final int i) {
		try {
			anIntArray3239 = null;
			MapFunctionType.recentUse = null;
			if (i != 1) {
				method1273(-45);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("km.V(").append(i).append(')').toString());
		}
	}
}
