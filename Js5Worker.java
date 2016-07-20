/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Js5Worker {
	static int maxTileZ;
	static js5 configJs5;
	static String[] alternativeAccountUsernames;
	private final Queue urgentQueue = new Queue();
	private final Queue aClass177_402 = new Queue();
	private final Queue prefetchQueue = new Queue();
	private final Queue aClass177_404 = new Queue();
	private int anInt405;
	private final Buffer outputBuffer = new Buffer(4);
	private long aLong407;
	private JagexSocket js5Connection;
	private Buffer inputBuffer;
	volatile int errorCount = 0;
	volatile int errorType = 0;
	private byte xorCode = 0;
	private Js5Request currentJs5Request;

	private final int getPrefetchSize() {
		return prefetchQueue.getAmount() + aClass177_404.getAmount();
	}

	final void sendDropConnection() {
		if (js5Connection != null) {
			try {
				outputBuffer.pos = 0;
				outputBuffer.putByte(7);
				outputBuffer.putMedium(0);
				js5Connection.put(outputBuffer.buf, 0, 4);
			} catch (final IOException ioexception) {
				try {
					js5Connection.close();
				} catch (final Exception exception) {
					/* empty */
				}
				js5Connection = null;
				this.errorCount++;
				this.errorType = -2;
			}
		}
	}

	static final void method356(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_5_, final int i_6_) {
		SphereType.method2076(i);
		int i_7_ = i + -i_1_;
		int i_8_ = i;
		int i_9_ = 0;
		int i_10_ = -i;
		if (i_7_ < 0) {
			i_7_ = 0;
		}
		int i_11_ = i_7_;
		if (Class120_Sub30_Sub2.anInt3699 <= i_6_ && i_6_ <= Identikit.anInt1334) {
			final int[] is = GameEntity.anIntArrayArray3009[i_6_];
			final int i_12_ = Class3.method83(MagnetType.anInt260, i_2_ - i, ParamType.anInt3544);
			final int i_13_ = Class3.method83(MagnetType.anInt260, i + i_2_, ParamType.anInt3544);
			final int i_14_ = Class3.method83(MagnetType.anInt260, -i_7_ + i_2_, ParamType.anInt3544);
			final int i_15_ = Class3.method83(MagnetType.anInt260, i_2_ + i_7_, ParamType.anInt3544);
			AmbientSound.fillArray(is, i_3_, i_12_, i_14_);
			AmbientSound.fillArray(is, i_5_, i_14_, i_15_);
			AmbientSound.fillArray(is, i_3_, i_15_, i_13_);
		}
		int i_16_ = -i_7_;
		int i_17_ = -1;
		int i_18_ = -1;
		while (i_9_ < i_8_) {
			i_17_ += 2;
			i_16_ += i_17_;
			i_18_ += 2;
			if (i_16_ >= 0 && i_11_ >= 1) {
				i_11_--;
				i_16_ -= i_11_ << 1;
				QuickChatCategoryType.anIntArray3654[i_11_] = i_9_;
			}
			i_9_++;
			i_10_ += i_18_;
			if (i_10_ >= 0) {
				i_8_--;
				i_10_ -= i_8_ << 1;
				final int i_19_ = i_6_ + -i_8_;
				final int i_20_ = i_6_ - -i_8_;
				if (Class120_Sub30_Sub2.anInt3699 <= i_20_ && i_19_ <= Identikit.anInt1334) {
					if (i_8_ >= i_7_) {
						final int i_21_ = Class3.method83(MagnetType.anInt260, i_2_ - -i_9_, ParamType.anInt3544);
						final int i_22_ = Class3.method83(MagnetType.anInt260, i_2_ - i_9_, ParamType.anInt3544);
						if (Identikit.anInt1334 >= i_20_) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_20_], i_3_, i_22_, i_21_);
						}
						if (i_19_ >= Class120_Sub30_Sub2.anInt3699) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_19_], i_3_, i_22_, i_21_);
						}
					} else {
						final int i_23_ = QuickChatCategoryType.anIntArray3654[i_8_];
						final int i_24_ = Class3.method83(MagnetType.anInt260, i_2_ - -i_9_, ParamType.anInt3544);
						final int i_25_ = Class3.method83(MagnetType.anInt260, i_2_ - i_9_, ParamType.anInt3544);
						final int i_26_ = Class3.method83(MagnetType.anInt260, i_2_ - -i_23_, ParamType.anInt3544);
						final int i_27_ = Class3.method83(MagnetType.anInt260, i_2_ - i_23_, ParamType.anInt3544);
						if (Identikit.anInt1334 >= i_20_) {
							final int[] is = GameEntity.anIntArrayArray3009[i_20_];
							AmbientSound.fillArray(is, i_3_, i_25_, i_27_);
							AmbientSound.fillArray(is, i_5_, i_27_, i_26_);
							AmbientSound.fillArray(is, i_3_, i_26_, i_24_);
						}
						if (Class120_Sub30_Sub2.anInt3699 <= i_19_) {
							final int[] is = GameEntity.anIntArrayArray3009[i_19_];
							AmbientSound.fillArray(is, i_3_, i_25_, i_27_);
							AmbientSound.fillArray(is, i_5_, i_27_, i_26_);
							AmbientSound.fillArray(is, i_3_, i_26_, i_24_);
						}
					}
				}
			}
			final int i_28_ = i_6_ + i_9_;
			final int i_29_ = i_6_ + -i_9_;
			if (Class120_Sub30_Sub2.anInt3699 <= i_28_ && Identikit.anInt1334 >= i_29_) {
				int i_30_ = i_8_ + i_2_;
				int i_31_ = -i_8_ + i_2_;
				if (i_30_ >= MagnetType.anInt260 && ParamType.anInt3544 >= i_31_) {
					i_30_ = Class3.method83(MagnetType.anInt260, i_30_, ParamType.anInt3544);
					i_31_ = Class3.method83(MagnetType.anInt260, i_31_, ParamType.anInt3544);
					if (i_9_ >= i_7_) {
						if (Identikit.anInt1334 >= i_28_) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_28_], i_3_, i_31_, i_30_);
						}
						if (Class120_Sub30_Sub2.anInt3699 <= i_29_) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_29_], i_3_, i_31_, i_30_);
						}
					} else {
						final int i_32_ = i_11_ >= i_9_ ? i_11_ : QuickChatCategoryType.anIntArray3654[i_9_];
						final int i_33_ = Class3.method83(MagnetType.anInt260, i_2_ - -i_32_, ParamType.anInt3544);
						final int i_34_ = Class3.method83(MagnetType.anInt260, i_2_ - i_32_, ParamType.anInt3544);
						if (Identikit.anInt1334 >= i_28_) {
							final int[] is = GameEntity.anIntArrayArray3009[i_28_];
							AmbientSound.fillArray(is, i_3_, i_31_, i_34_);
							AmbientSound.fillArray(is, i_5_, i_34_, i_33_);
							AmbientSound.fillArray(is, i_3_, i_33_, i_30_);
						}
						if (Class120_Sub30_Sub2.anInt3699 <= i_29_) {
							final int[] is = GameEntity.anIntArrayArray3009[i_29_];
							AmbientSound.fillArray(is, i_3_, i_31_, i_34_);
							AmbientSound.fillArray(is, i_5_, i_34_, i_33_);
							AmbientSound.fillArray(is, i_3_, i_33_, i_30_);
						}
					}
				}
			}
		}
	}

	final boolean method357() {
		return getUrgentSize() >= 20;
	}

	final void replaceStreamsWithDummy() {
		if (js5Connection != null) {
			js5Connection.replaceStreamsWithDummy();
		}
	}

	final void method361(final JagexSocket jagexSocket, final boolean bool) {
		if (js5Connection != null) {
			try {
				js5Connection.close();
			} catch (final Exception exception) {
				/* empty */
			}
			js5Connection = null;
		}
		js5Connection = jagexSocket;
		method370();
		method367(bool);
		currentJs5Request = null;
		inputBuffer.pos = 0;
		for (;;) {
			final Js5Request js5Request = (Js5Request) aClass177_402.removeFirst();
			if (js5Request == null) {
				break;
			}
			urgentQueue.insertLast(js5Request);
		}
		for (;;) {
			final Js5Request js5Request = (Js5Request) aClass177_404.removeFirst();
			if (js5Request == null) {
				break;
			}
			prefetchQueue.insertLast(js5Request);
		}
		if (xorCode != 0) {
			try {
				outputBuffer.pos = 0;
				outputBuffer.putByte(4);
				outputBuffer.putByte(xorCode);
				outputBuffer.putShort(0);
				js5Connection.put(outputBuffer.buf, 0, 4);
			} catch (final IOException ioexception) {
				try {
					js5Connection.close();
				} catch (final Exception exception) {
					/* empty */
				}
				js5Connection = null;
				this.errorCount++;
				this.errorType = -2;
			}
		}
		anInt405 = 0;
		aLong407 = TimeUtil.getSafeTime();
	}

	final Js5Request putRequest(final int archiveId, final int groupId, final byte i, final boolean bool) {
		final long uid = groupId + (archiveId << 16);
		final Js5Request js5Request = new Js5Request();
		js5Request.bufferOff = i;
		js5Request.aBoolean3573 = bool;
		js5Request.subUid = uid;
		if (bool) {
			if (getUrgentSize() >= 20) {
				throw new RuntimeException("Urgent list exceeded max limit of 20");
			}
			urgentQueue.insertLast(js5Request);
		} else {
			if (getPrefetchSize() >= 20) {
				throw new RuntimeException("Prefetch list exceeded max limit of 20");
			}
			prefetchQueue.insertLast(js5Request);
		}
		return js5Request;
	}

	static final boolean method363(final int i, final int i_40_, final int i_41_, final int i_42_) {
		if (!Class69_Sub1.method618(i, i_40_, i_41_)) {
			return false;
		}
		final int i_43_ = i_40_ << 7;
		final int i_44_ = i_41_ << 7;
		if (Class120_Sub12_Sub34.method1380(i_43_ + 1, SubInterface.activeTileHeightMap[i][i_40_][i_41_] + i_42_, i_44_ + 1) && Class120_Sub12_Sub34.method1380(i_43_ + 128 - 1, SubInterface.activeTileHeightMap[i][i_40_ + 1][i_41_] + i_42_, i_44_ + 1) && Class120_Sub12_Sub34.method1380(i_43_ + 128 - 1, SubInterface.activeTileHeightMap[i][i_40_ + 1][i_41_ + 1] + i_42_, i_44_ + 128 - 1) && Class120_Sub12_Sub34.method1380(i_43_ + 1, SubInterface.activeTileHeightMap[i][i_40_][i_41_ + 1] + i_42_, i_44_ + 128 - 1)) {
			return true;
		}
		return false;
	}

	final void closeConnection() {
		if (js5Connection != null) {
			js5Connection.close();
		}
	}

	final void crcError() {
		try {
			js5Connection.close();
		} catch (final Exception exception) {
			/* empty */
		}
		js5Connection = null;
		xorCode = (byte) (int) (1.0 + Math.random() * 255.0);
		this.errorType = -1;
		this.errorCount++;
	}

	final int getUrgentSize() {
		return urgentQueue.getAmount() + aClass177_402.getAmount();
	}

	final void method367(final boolean bool) {
		if (js5Connection != null) {
			try {
				outputBuffer.pos = 0;
				outputBuffer.putByte(bool ? 2 : 3);
				outputBuffer.putMedium(0);
				js5Connection.put(outputBuffer.buf, 0, 4);
			} catch (final IOException ioexception) {
				try {
					js5Connection.close();
				} catch (final Exception exception) {
					/* empty */
				}
				this.errorCount++;
				js5Connection = null;
				this.errorType = -2;
			}
		}
	}

	static final void method368(final byte[][] is, final int i_45_, final Light[] class44s, final int[][] is_46_, final byte[][] is_47_, final float[][] fs, final byte[][] is_48_, final float[][] fs_49_, final float[][] fs_50_, final int i_51_, final byte[][] is_52_) {
		for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
			final Light light = class44s[i_53_];
			if (light.level == i_51_) {
				final LightRenderer class133 = new LightRenderer();
				int i_54_ = (light.z >> 7) - light.anInt370;
				int i_55_ = 0;
				if (i_54_ < 0) {
					i_55_ -= i_54_;
					i_54_ = 0;
				}
				int i_56_ = light.anInt370 + (light.z >> 7);
				if (i_56_ > 103) {
					i_56_ = 103;
				}
				final int i_57_ = (light.x >> 7) - light.anInt370;
				for (int i_58_ = i_54_; i_58_ <= i_56_; i_58_++) {
					final int i_59_ = light.aShortArray372[i_55_];
					int i_60_ = (i_59_ >> 8) + i_57_;
					int i_61_ = (0xff & i_59_) + i_60_ + -1;
					if (i_60_ < 0) {
						i_60_ = 0;
					}
					if (i_61_ > 103) {
						i_61_ = 103;
					}
					for (int i_62_ = i_60_; i_61_ >= i_62_; i_62_++) {
						final int i_63_ = 0xff & is_47_[i_62_][i_58_];
						final int i_64_ = is_48_[i_62_][i_58_] & 0xff;
						boolean bool = false;
						if (i_63_ == 0) {
							if (i_64_ == 0) {
								continue;
							}
							final OverlayType class124 = OverlayType.list(i_64_ - 1);
							if (class124.color == -1) {
								continue;
							}
							if (is_52_[i_62_][i_58_] != 0) {
								final int[] is_65_ = Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_62_][i_58_]];
								class133.anInt1262 += -6 + (is_65_.length >> 1) * 3;
								class133.anInt1260 += is_65_.length >> 1;
								continue;
							}
						} else if (i_64_ != 0) {
							final OverlayType class124 = OverlayType.list(-1 + i_64_);
							if ((class124.color ^ 0xffffffff) != 0) {
								final byte i_66_ = is_52_[i_62_][i_58_];
								if (i_66_ != 0) {
									bool = true;
								}
							} else {
								final byte i_67_ = is_52_[i_62_][i_58_];
								if (i_67_ != 0) {
									final int[] is_68_ = InterfaceChangeNode.anIntArrayArray3488[i_67_];
									class133.anInt1262 += -6 + 3 * (is_68_.length >> 1);
									class133.anInt1260 += is_68_.length >> 1;
								}
								continue;
							}
						}
						final Class28 class28 = SpotAnimation.method2315(i_62_, i_58_, i_51_);
						if (class28 != null) {
							final int i_69_ = (int) (class28.bitPacked >> 14) & 0x3f;
							if (i_69_ == 9) {
								int[] is_70_ = null;
								final int i_71_ = 0x3 & (int) (class28.bitPacked >> 20);
								if ((i_71_ & 0x1) == 0) {
									boolean bool_72_ = i_62_ + -1 >= i_60_;
									if (!bool_72_ && i_56_ >= 1 + i_58_) {
										final int i_73_ = light.aShortArray372[i_55_ - -1];
										final int i_74_ = i_57_ + (i_73_ >> 8);
										final int i_75_ = (0xff & i_73_) + i_74_;
										bool_72_ = i_62_ > i_74_ && i_75_ > i_62_;
									}
									boolean bool_76_ = i_61_ >= 1 + i_62_;
									if (!bool_76_ && i_58_ - 1 >= i_54_) {
										final int i_77_ = light.aShortArray372[-1 + i_55_];
										final int i_78_ = i_57_ - -(i_77_ >> 8);
										final int i_79_ = i_78_ + (0xff & i_77_);
										bool_76_ = i_78_ < i_62_ && i_62_ < i_79_;
									}
									if (bool_72_ && bool_76_) {
										is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
									} else if (!bool_72_) {
										if (bool_76_) {
											is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
										}
									} else {
										is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
									}
								} else {
									boolean bool_80_ = i_60_ <= i_62_ + -1;
									if (!bool_80_ && i_54_ <= -1 + i_58_) {
										final int i_81_ = light.aShortArray372[-1 + i_55_];
										final int i_82_ = (i_81_ >> 8) + i_57_;
										final int i_83_ = i_82_ + (i_81_ & 0xff);
										bool_80_ = i_62_ > i_82_ && i_83_ > i_62_;
									}
									boolean bool_84_ = i_62_ + 1 <= i_61_;
									if (!bool_84_ && i_56_ >= i_58_ + 1) {
										final int i_85_ = light.aShortArray372[1 + i_55_];
										final int i_86_ = (i_85_ >> 8) + i_57_;
										final int i_87_ = (i_85_ & 0xff) + i_86_;
										bool_84_ = i_86_ < i_62_ && i_62_ < i_87_;
									}
									if (bool_80_ && bool_84_) {
										is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
									} else if (bool_80_) {
										is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
									} else if (bool_84_) {
										is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
									}
								}
								if (is_70_ != null) {
									class133.anInt1262 += (-2 + (is_70_.length >> 1)) * 3;
									class133.anInt1260 += is_70_.length >> 1;
								}
								continue;
							}
						}
						if (!bool) {
							final int[] is_88_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
							class133.anInt1262 += 3 * (-2 + (is_88_.length >> 1));
							class133.anInt1260 += is_88_.length >> 1;
						} else {
							final int[] is_89_ = Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_62_][i_58_]];
							final int[] is_90_ = InterfaceChangeNode.anIntArrayArray3488[is_52_[i_62_][i_58_]];
							class133.anInt1262 += (-2 + (is_89_.length >> 1)) * 3;
							class133.anInt1262 += 3 * (-2 + (is_90_.length >> 1));
							class133.anInt1260 += is_89_.length >> 1;
							class133.anInt1260 += is_90_.length >> 1;
						}
					}
					i_55_++;
				}
				class133.method1945();
				i_55_ = 0;
				if ((light.z >> 7) - light.anInt370 < 0) {
					i_55_ -= (light.z >> 7) - light.anInt370;
				}
				for (int i_91_ = i_54_; i_56_ >= i_91_; i_91_++) {
					final int i_92_ = light.aShortArray372[i_55_];
					int i_93_ = i_57_ - -(i_92_ >> 8);
					int i_94_ = (0xff & i_92_) + i_93_ - 1;
					if (i_93_ < 0) {
						i_93_ = 0;
					}
					if (i_94_ > 103) {
						i_94_ = 103;
					}
					for (int i_95_ = i_93_; i_94_ >= i_95_; i_95_++) {
						byte i_96_ = is[i_95_][i_91_];
						final int i_97_ = 0xff & is_47_[i_95_][i_91_];
						final int i_98_ = 0xff & is_48_[i_95_][i_91_];
						boolean bool = false;
						if (i_97_ == 0) {
							if (i_98_ == 0) {
								continue;
							}
							final OverlayType class124 = OverlayType.list(i_98_ - 1);
							if (class124.color == -1) {
								continue;
							}
							if (is_52_[i_95_][i_91_] != 0) {
								Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, fs_50_, is[i_95_][i_91_], is_46_);
								continue;
							}
						} else if (i_98_ != 0) {
							final OverlayType class124 = OverlayType.list(i_98_ - 1);
							if (class124.color == -1) {
								Class120_Sub12_Sub11.method1255(light, InterfaceChangeNode.anIntArrayArray3488[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, fs_50_, is[i_95_][i_91_], is_46_);
								continue;
							}
							final byte i_99_ = is_52_[i_95_][i_91_];
							if (i_99_ != 0) {
								bool = true;
							}
						}
						final Class28 class28 = SpotAnimation.method2315(i_95_, i_91_, i_51_);
						if (class28 != null) {
							final int i_100_ = 0x3f & (int) (class28.bitPacked >> 14);
							if (i_100_ == 9) {
								int[] is_101_ = null;
								final int i_102_ = (int) (class28.bitPacked >> 20) & 0x3;
								if ((0x1 & i_102_) == 0) {
									boolean bool_103_ = i_93_ <= i_95_ + -1;
									boolean bool_104_ = 1 + i_95_ <= i_94_;
									if (!bool_103_ && i_56_ >= i_91_ - -1) {
										final int i_105_ = light.aShortArray372[i_55_ + 1];
										final int i_106_ = (i_105_ >> 8) + i_57_;
										final int i_107_ = (0xff & i_105_) + i_106_;
										bool_103_ = i_106_ < i_95_ && i_95_ < i_107_;
									}
									if (!bool_104_ && -1 + i_91_ >= i_54_) {
										final int i_108_ = light.aShortArray372[i_55_ - 1];
										final int i_109_ = i_57_ - -(i_108_ >> 8);
										final int i_110_ = (0xff & i_108_) + i_109_;
										bool_104_ = i_109_ < i_95_ && i_95_ < i_110_;
									}
									if (!bool_103_ || !bool_104_) {
										if (!bool_103_) {
											if (bool_104_) {
												is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
												i_96_ = (byte) 3;
											}
										} else {
											is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
											i_96_ = (byte) 1;
										}
									} else {
										is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
									}
								} else {
									boolean bool_111_ = i_95_ + -1 >= i_93_;
									boolean bool_112_ = i_94_ >= i_95_ + 1;
									if (!bool_111_ && i_91_ + -1 >= i_54_) {
										final int i_113_ = light.aShortArray372[-1 + i_55_];
										final int i_114_ = i_57_ + (i_113_ >> 8);
										final int i_115_ = i_114_ + (i_113_ & 0xff);
										bool_111_ = i_114_ < i_95_ && i_95_ < i_115_;
									}
									if (!bool_112_ && i_56_ >= i_91_ - -1) {
										final int i_116_ = light.aShortArray372[i_55_ - -1];
										final int i_117_ = i_57_ - -(i_116_ >> 8);
										final int i_118_ = (0xff & i_116_) + i_117_;
										bool_112_ = i_95_ > i_117_ && i_95_ < i_118_;
									}
									if (!bool_111_ || !bool_112_) {
										if (!bool_111_) {
											if (bool_112_) {
												is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
												i_96_ = (byte) 2;
											}
										} else {
											is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
											i_96_ = (byte) 0;
										}
									} else {
										is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
									}
								}
								if (is_101_ != null) {
									Class120_Sub12_Sub11.method1255(light, is_101_, fs_49_, i_91_, i_95_, class133, fs, fs_50_, i_96_, is_46_);
								}
								continue;
							}
						}
						if (!bool) {
							Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[0], fs_49_, i_91_, i_95_, class133, fs, fs_50_, i_96_, is_46_);
						} else {
							Class120_Sub12_Sub11.method1255(light, InterfaceChangeNode.anIntArrayArray3488[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, fs_50_, is[i_95_][i_91_], is_46_);
							Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, fs_50_, is[i_95_][i_91_], is_46_);
						}
					}
					i_55_++;
				}
				if (class133.anInt1267 > 0 && class133.anInt1271 > 0) {
					class133.init();
					light.lightRenderer = class133;
				}
			}
		}
	}

	final boolean method369() {
		return getPrefetchSize() >= 20;
	}

	private final void method370() {
		if (js5Connection != null) {
			try {
				outputBuffer.pos = 0;
				outputBuffer.putByte(6);
				outputBuffer.putMedium(3);
				js5Connection.put(outputBuffer.buf, 0, 4);
			} catch (final IOException ioexception) {
				try {
					js5Connection.close();
				} catch (final Exception exception) {
					/* empty */
				}
				js5Connection = null;
				this.errorType = -2;
				this.errorCount++;
			}
		}
	}

	final boolean process() {
		if (js5Connection != null) {
			final long l = TimeUtil.getSafeTime();
			int i_120_ = (int) (l - aLong407);
			aLong407 = l;
			if (i_120_ > 200) {
				i_120_ = 200;
			}
			anInt405 += i_120_;
			if (anInt405 > 30000) {
				try {
					js5Connection.close();
				} catch (final Exception exception) {
					/* empty */
				}
				js5Connection = null;
			}
		}
		if (js5Connection == null) {
			if (getUrgentSize() != 0 || getPrefetchSize() != 0) {
				return false;
			}
			return true;
		}
		try {
			js5Connection.checkForError();
			for (Js5Request urgentRequest = (Js5Request) urgentQueue.peekFirst(); urgentRequest != null; urgentRequest = (Js5Request) urgentQueue.peekNext()) {
				outputBuffer.pos = 0;
				outputBuffer.putByte(1);
				outputBuffer.putMedium((int) urgentRequest.subUid);
				js5Connection.put(outputBuffer.buf, 0, 4);
				aClass177_402.insertLast(urgentRequest);
			}
			for (Js5Request prefetchRequest = (Js5Request) prefetchQueue.peekFirst(); prefetchRequest != null; prefetchRequest = (Js5Request) prefetchQueue.peekNext()) {
				outputBuffer.pos = 0;
				outputBuffer.putByte(0);
				outputBuffer.putMedium((int) prefetchRequest.subUid);
				js5Connection.put(outputBuffer.buf, 0, 4);
				aClass177_404.insertLast(prefetchRequest);
			}
			for (int loopId = 0; loopId < 100; loopId++) {
				final int available = js5Connection.getAvailable();
				if (available < 0) {
					throw new IOException();
				}
				if (available == 0) {
					break;
				}
				int i_124_ = 0;
				if (currentJs5Request != null) {
					if (currentJs5Request.bufferPos == 0) {
						i_124_ = 1;
					}
				} else {
					i_124_ = 8;
				}
				anInt405 = 0;
				if (i_124_ <= 0) {
					int i_125_ = 512 - currentJs5Request.bufferPos;
					final int i_126_ = currentJs5Request.buffer.buf.length - currentJs5Request.bufferOff;
					if (i_125_ > i_126_ - currentJs5Request.buffer.pos) {
						i_125_ = i_126_ - currentJs5Request.buffer.pos;
					}
					if (i_125_ > available) {
						i_125_ = available;
					}
					js5Connection.read(currentJs5Request.buffer.buf, currentJs5Request.buffer.pos, i_125_);
					if (xorCode != 0) {
						for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
							currentJs5Request.buffer.buf[currentJs5Request.buffer.pos + i_127_] ^= (byte) xorCode;
						}
					}
					currentJs5Request.buffer.pos += i_125_;
					currentJs5Request.bufferPos += i_125_;
					if (i_126_ == currentJs5Request.buffer.pos) {
						currentJs5Request.unlinkSub();
						currentJs5Request.aBoolean3576 = false;
						currentJs5Request = null;
					} else if (currentJs5Request.bufferPos == 512) {
						currentJs5Request.bufferPos = 0;
					}
				} else {
					int i_128_ = i_124_ - inputBuffer.pos;
					if (i_128_ > available) {
						i_128_ = available;
					}
					js5Connection.read(inputBuffer.buf, inputBuffer.pos, i_128_);
					if (xorCode != 0) {
						for (int i_129_ = 0; i_128_ > i_129_; i_129_++) {
							inputBuffer.buf[inputBuffer.pos + i_129_] ^= (byte) xorCode;
						}
					}
					inputBuffer.pos += i_128_;
					if (inputBuffer.pos >= i_124_) {
						if (currentJs5Request == null) {
							inputBuffer.pos = 0;
							final int archiveId = inputBuffer.getUByte();
							final int groupId = inputBuffer.getUShort();
							final int i_132_ = inputBuffer.getUByte();
							final int ctype = 0x7f & i_132_;
							final boolean bool_134_ = (i_132_ & 0x80) != 0;
							final int clen = inputBuffer.getInt();
							final long l = groupId + (archiveId << 16);
							Js5Request js5Request;
							if (bool_134_) {
								for (js5Request = (Js5Request) aClass177_404.peekFirst(); js5Request != null; js5Request = (Js5Request) aClass177_404.peekNext()) {
									if (js5Request.subUid == l) {
										break;
									}
								}
							} else {
								for (js5Request = (Js5Request) aClass177_402.peekFirst(); js5Request != null && l != js5Request.subUid; js5Request = (Js5Request) aClass177_402.peekNext()) {
									/* empty */
								}
							}
							if (js5Request == null) {
								throw new IOException();
							}
							currentJs5Request = js5Request;
							final int i_136_ = ctype != 0 ? 9 : 5;
							currentJs5Request.buffer = new Buffer(currentJs5Request.bufferOff + clen + i_136_);
							currentJs5Request.buffer.putByte(ctype);
							currentJs5Request.buffer.putInt(clen);
							currentJs5Request.bufferPos = 8;
							inputBuffer.pos = 0;
						} else if (currentJs5Request.bufferPos == 0) {
							if (inputBuffer.buf[0] == -1) {
								inputBuffer.pos = 0;
								currentJs5Request.bufferPos = 1;
							} else {
								currentJs5Request = null;
							}
						} else {
							System.out.println("Error processing incoming header!");
							throw new IOException();
						}
					}
				}
			}
		} catch (final IOException ioexception) {
			try {
				js5Connection.close();
			} catch (final Exception exception) {
				/* empty */
			}
			js5Connection = null;
			this.errorCount++;
			this.errorType = -2;
			if (getUrgentSize() == 0 && getPrefetchSize() == 0) {
				return true;
			}
			return false;
		}
		return true;
	}

	public Js5Worker() {
		inputBuffer = new Buffer(8);
	}
}
