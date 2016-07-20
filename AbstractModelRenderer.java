/* Class180_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractModelRenderer extends SceneGraphNode {
	boolean haveActions = false;
	static int actionsLen;
	static boolean addActions;
	static int mouseXOffFromCenter = 0;
	static int mouseYOffFromCenter = 0;

	abstract void rotateY(int i);

	final void method2361(final FrameGroup animFrameGroup, final int animFrameId, final FrameGroup animNextFrameGroup, final int animNextFrameId, final int animDelay, final int animFrameDelay, final FrameGroup idleFrameGroup, final int idleFrameId, final FrameGroup idleNextFrameGroup, final int idleNextFrameId, final int idleDelay, final int idleFrameDelay, final boolean[] bools, final boolean bool) {
		if (animFrameId != -1) {
			if (bools == null || idleFrameId == -1) {
				method2380(animFrameGroup, animFrameId, animNextFrameGroup, animNextFrameId, animDelay, animFrameDelay, bool);
			} else if (hasLabels()) {
				final SeqFrame idleFrame = idleFrameGroup.seqFrames[idleFrameId];
				final SeqFrameBase animFrameBase = idleFrame.frameBase;
				SeqFrame idleNextFrame = null;
				if (idleNextFrameGroup != null) {
					idleNextFrame = idleNextFrameGroup.seqFrames[idleNextFrameId];
					if (idleNextFrame.frameBase != animFrameBase) {
						idleNextFrame = null;
					}
				}

				final SeqFrame animFrame = animFrameGroup.seqFrames[animFrameId];
				SeqFrame animNextFrame = null;
				if (animNextFrameGroup != null) {
					animNextFrame = animNextFrameGroup.seqFrames[animNextFrameId];
					if (animNextFrame.frameBase != animFrameBase) {
						animNextFrame = null;
					}
				}
				method2370(animFrameBase, animFrame, animNextFrame, animDelay, animFrameDelay, bools, false, bool, 65535, null);
				animate(0, new int[0], 0, 0, 0, bool);
				method2370(animFrameBase, idleFrame, idleNextFrame, idleDelay, idleFrameDelay, bools, true, bool, 65535, null);
				onFinishAnimating();
			}
		}
	}

	@Override
	final void preRender(final int rotation, final int i_13_, final int i_15_, final int i_14_, final int i_16_) {
		/* empty */
	}

	abstract void rotateZ(int i);

	abstract int getMaxZ();

	abstract void onFinishAnimating();

	abstract void rotate90();

	private static final int method2366(final int[][] is, final int i, final int i_17_) {
		final int i_18_ = i >> 7;
		final int i_19_ = i_17_ >> 7;
		if (i_18_ < 0 || i_19_ < 0 || i_18_ >= is.length || i_19_ >= is[0].length) {
			return 0;
		}
		final int i_20_ = i & 0x7f;
		final int i_21_ = i_17_ & 0x7f;
		final int i_22_ = is[i_18_][i_19_] * (128 - i_20_) + is[i_18_ + 1][i_19_] * i_20_ >> 7;
		final int i_23_ = is[i_18_][i_19_ + 1] * (128 - i_20_) + is[i_18_ + 1][i_19_ + 1] * i_20_ >> 7;
		return i_22_ * (128 - i_21_) + i_23_ * i_21_ >> 7;
	}

	abstract void method2367(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, long l);

	abstract void translate(int x, int y, int z);

	abstract void scale(int x, int y, int z);

	private final void method2370(final SeqFrameBase frameBase, final SeqFrame frame, final SeqFrame nextFrame, final int delay, final int frameDelay, final boolean[] animateLabels, final boolean condition, final boolean bool_36_, final int i_37_, final int[] is) {
		if (nextFrame == null || delay == 0) {
			for (int id = 0; id < frame.transformCount; id++) {
				final short type = frame.transformTypes[id];
				if (animateLabels == null || animateLabels[type] == condition || frameBase.types[type] == 0) {
					final short i_40_ = frame.aShortArray40[id];
					if (i_40_ != -1) {
						final int i_41_ = i_37_ & frameBase.anIntArray2405[i_40_];
						if (i_41_ != 65535) {
							method2382(0, frameBase.bases[i_40_], 0, 0, 0, bool_36_, i_41_, is);
						} else {
							animate(0, frameBase.bases[i_40_], 0, 0, 0, bool_36_);
						}
					}
					final int i_42_ = i_37_ & frameBase.anIntArray2405[type];
					if (i_42_ != 65535) {
						method2382(frameBase.types[type], frameBase.bases[type], frame.transformXs[id], frame.transformYs[id], frame.transformZs[id], bool_36_, i_42_, is);
					} else {
						animate(frameBase.types[type], frameBase.bases[type], frame.transformXs[id], frame.transformYs[id], frame.transformZs[id], bool_36_);
					}
				}
			}
		} else {
			int transformId = 0;
			int nextTransformId = 0;
			for (int id = 0; id < frameBase.length; id++) {
				boolean transform = false;
				if (transformId < frame.transformCount && frame.transformTypes[transformId] == id) {
					transform = true;
				}
				boolean transformNext = false;
				if (nextTransformId < nextFrame.transformCount && nextFrame.transformTypes[nextTransformId] == id) {
					transformNext = true;
				}
				if (transform || transformNext) {
					if (animateLabels != null && animateLabels[id] != condition && frameBase.types[id] != 0) {
						if (transform) {
							transformId++;
						}
						if (transformNext) {
							nextTransformId++;
						}
					} else {
						int i_48_ = 0;
						final int i_49_ = frameBase.types[id];
						if (i_49_ == 3) {
							i_48_ = 128;
						}
						int i_50_;
						int i_51_;
						int i_52_;
						short i_53_;
						byte i_54_;
						if (transform) {
							i_50_ = frame.transformXs[transformId];
							i_51_ = frame.transformYs[transformId];
							i_52_ = frame.transformZs[transformId];
							i_53_ = frame.aShortArray40[transformId];
							i_54_ = frame.aByteArray38[transformId];
							transformId++;
						} else {
							i_50_ = i_48_;
							i_51_ = i_48_;
							i_52_ = i_48_;
							i_53_ = (short) -1;
							i_54_ = (byte) 0;
						}
						int i_55_;
						int i_56_;
						int i_57_;
						short i_58_;
						byte i_59_;
						if (transformNext) {
							i_55_ = nextFrame.transformXs[nextTransformId];
							i_56_ = nextFrame.transformYs[nextTransformId];
							i_57_ = nextFrame.transformZs[nextTransformId];
							i_58_ = nextFrame.aShortArray40[nextTransformId];
							i_59_ = nextFrame.aByteArray38[nextTransformId];
							nextTransformId++;
						} else {
							i_55_ = i_48_;
							i_56_ = i_48_;
							i_57_ = i_48_;
							i_58_ = (short) -1;
							i_59_ = (byte) 0;
						}
						int i_60_;
						int i_61_;
						int i_62_;
						if ((i_54_ & 0x2) != 0 || (i_59_ & 0x1) != 0) {
							i_60_ = i_50_;
							i_61_ = i_51_;
							i_62_ = i_52_;
						} else if (i_49_ == 2) {
							int i_63_ = i_55_ - i_50_ & 0x7ff;
							int i_64_ = i_56_ - i_51_ & 0x7ff;
							int i_65_ = i_57_ - i_52_ & 0x7ff;
							if (i_63_ >= 1024) {
								i_63_ -= 2048;
							}
							if (i_64_ >= 1024) {
								i_64_ -= 2048;
							}
							if (i_65_ >= 1024) {
								i_65_ -= 2048;
							}
							i_60_ = i_50_ + i_63_ * delay / frameDelay & 0x7ff;
							i_61_ = i_51_ + i_64_ * delay / frameDelay & 0x7ff;
							i_62_ = i_52_ + i_65_ * delay / frameDelay & 0x7ff;
						} else if (i_49_ == 7) {
							int i_66_ = i_55_ - i_50_ & 0x3f;
							if (i_66_ >= 32) {
								i_66_ -= 64;
							}
							i_60_ = i_50_ + i_66_ * delay / frameDelay & 0x3f;
							i_61_ = i_51_ + (i_56_ - i_51_) * delay / frameDelay;
							i_62_ = i_52_ + (i_57_ - i_52_) * delay / frameDelay;
						} else {
							i_60_ = i_50_ + (i_55_ - i_50_) * delay / frameDelay;
							i_61_ = i_51_ + (i_56_ - i_51_) * delay / frameDelay;
							i_62_ = i_52_ + (i_57_ - i_52_) * delay / frameDelay;
						}
						if (i_53_ != -1) {
							final int i_67_ = i_37_ & frameBase.anIntArray2405[i_53_];
							if (i_67_ != 65535) {
								method2382(0, frameBase.bases[i_53_], 0, 0, 0, bool_36_, i_67_, is);
							} else {
								animate(0, frameBase.bases[i_53_], 0, 0, 0, bool_36_);
							}
						} else if (i_58_ != -1) {
							final int i_68_ = i_37_ & frameBase.anIntArray2405[i_58_];
							if (i_68_ != 65535) {
								method2382(0, frameBase.bases[i_58_], 0, 0, 0, bool_36_, i_68_, is);
							} else {
								animate(0, frameBase.bases[i_58_], 0, 0, 0, bool_36_);
							}
						}
						final int i_69_ = i_37_ & frameBase.anIntArray2405[id];
						if (i_69_ != 65535) {
							method2382(i_49_, frameBase.bases[id], i_60_, i_61_, i_62_, bool_36_, i_69_, is);
						} else {
							animate(i_49_, frameBase.bases[id], i_60_, i_61_, i_62_, bool_36_);
						}
					}
				}
			}
		}
	}

	@Override
	abstract int getMaxY();

	abstract int method2371();

	@Override
	abstract void render(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, long l, int i_77_, ParticleEngine class108_sub2);

	abstract void rotate270();

	abstract void rotate180();

	abstract int getMaxX();

	abstract boolean hasLabels();

	abstract AbstractModelRenderer method2376(boolean bool, boolean bool_78_, boolean bool_79_);

	abstract void rotateX(int i);

	abstract AbstractModelRenderer method2378(boolean bool, boolean bool_80_, boolean bool_81_);

	abstract void animate(int i, int i_82_, int i_83_, int i_84_);

	final void method2380(final FrameGroup animFrameGroup, final int animFrame, final FrameGroup animNextFrameGroup, final int animNextFrame, final int animDelay, final int animFrameDelay, final boolean bool) {
		if (animFrame != -1 && hasLabels()) {
			final SeqFrame seqFrame = animFrameGroup.seqFrames[animFrame];
			final SeqFrameBase frameBase = seqFrame.frameBase;
			SeqFrame nextSeqFrame = null;
			if (animNextFrameGroup != null) {
				nextSeqFrame = animNextFrameGroup.seqFrames[animNextFrame];
				if (nextSeqFrame.frameBase != frameBase) {
					nextSeqFrame = null;
				}
			}
			method2370(frameBase, seqFrame, nextSeqFrame, animDelay, animFrameDelay, null, false, bool, 65535, null);
			onFinishAnimating();
		}
	}

	abstract AbstractModelRenderer copy(boolean bool, boolean bool_90_, boolean bool_91_);

	abstract void method2382(int i, int[] is, int i_92_, int i_93_, int i_94_, boolean bool, int i_95_, int[] is_96_);

	abstract int getMinX();

	final void method2384(final FrameGroup frameLoader, final int frameId, final FrameGroup nextFrameLoader, final int nextFrame, final int i_99_, final int i_100_, final int i_101_, final boolean bool, final int[] is) {
		if (frameId != -1 && hasLabels()) {
			final SeqFrame seqFrame = frameLoader.seqFrames[frameId];
			final SeqFrameBase class120_sub1 = seqFrame.frameBase;
			SeqFrame class1_102_ = null;
			if (nextFrameLoader != null) {
				class1_102_ = nextFrameLoader.seqFrames[nextFrame];
				if (class1_102_.frameBase != class120_sub1) {
					class1_102_ = null;
				}
			}
			method2370(class120_sub1, seqFrame, class1_102_, i_99_, i_100_, null, false, bool, i_101_, is);
			onFinishAnimating();
		}
	}

	final void method2385(final int[][] is, final int i, final int i_103_, final int i_104_, final int i_105_, final int i_106_) {
		final int i_107_ = -i_105_ / 2;
		final int i_108_ = -i_106_ / 2;
		final int i_109_ = method2366(is, i + i_107_, i_104_ + i_108_);
		final int i_110_ = i_105_ / 2;
		final int i_111_ = -i_106_ / 2;
		final int i_112_ = method2366(is, i + i_110_, i_104_ + i_111_);
		final int i_113_ = -i_105_ / 2;
		final int i_114_ = i_106_ / 2;
		final int i_115_ = method2366(is, i + i_113_, i_104_ + i_114_);
		final int i_116_ = i_105_ / 2;
		final int i_117_ = i_106_ / 2;
		final int i_118_ = method2366(is, i + i_116_, i_104_ + i_117_);
		final int i_119_ = i_109_ < i_112_ ? i_109_ : i_112_;
		final int i_120_ = i_115_ < i_118_ ? i_115_ : i_118_;
		final int i_121_ = i_112_ < i_118_ ? i_112_ : i_118_;
		final int i_122_ = i_109_ < i_115_ ? i_109_ : i_115_;
		if (i_106_ != 0) {
			final int i_123_ = (int) (Math.atan2(i_119_ - i_120_, i_106_) * 325.95) & 0x7ff;
			if (i_123_ != 0) {
				rotateX(i_123_);
			}
		}
		if (i_105_ != 0) {
			final int i_124_ = (int) (Math.atan2(i_122_ - i_121_, i_105_) * 325.95) & 0x7ff;
			if (i_124_ != 0) {
				rotateZ(i_124_);
			}
		}
		int i_125_ = i_109_ + i_118_;
		if (i_112_ + i_115_ < i_125_) {
			i_125_ = i_112_ + i_115_;
		}
		i_125_ = (i_125_ >> 1) - i_103_;
		if (i_125_ != 0) {
			translate(0, i_125_, 0);
		}
	}

	abstract int getMinZ();

	abstract int getMinY();

	abstract void animate(int i, int[] is, int i_126_, int i_127_, int i_128_, boolean bool);

	public AbstractModelRenderer() {
		/* empty */
	}

	final void method2389(final FrameGroup frameGroup, final int frame) {
		if (frame != -1 && hasLabels()) {
			final SeqFrame seqFrame = frameGroup.seqFrames[frame];
			final SeqFrameBase frameBase = seqFrame.frameBase;
			for (int id = 0; id < seqFrame.transformCount; id++) {
				final short type = seqFrame.transformTypes[id];
				if (frameBase.aBooleanArray2407[type]) {
					if (seqFrame.aShortArray40[id] != -1) {
						animate(0, 0, 0, 0);
					}
					animate(frameBase.types[type], seqFrame.transformXs[id], seqFrame.transformYs[id], seqFrame.transformZs[id]);
				}
			}
			onFinishAnimating();
		}
	}
}
