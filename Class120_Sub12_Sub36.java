/* Class120_Sub12_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub36 extends Class120_Sub12 {
	static int[] npcIndices;
	static int[] anIntArray3416;
	static int[] anIntArray3417;
	static js5 aClass50_3418;
	static js5 aClass50_3419;
	static int[][][] anIntArrayArrayArray3420;
	static byte[][] aByteArrayArray3421;
	static int[] anIntArray3422;
	static int anInt3423 = 0;
	static int lastClickY;

	static {
		npcIndices = new int[1024];
		anIntArray3422 = new int[100];
		lastClickY = 0;
		anIntArray3416 = new int[128];
	}

	public Class120_Sub12_Sub36() {
		super(1, false);
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_1_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[] is_2_ = is_1_[0];
			final int[] is_3_ = is_1_[1];
			final int[] is_4_ = is_1_[2];
			for (int i_5_ = 0; Class120_Sub12_Sub7.anInt3178 > i_5_; i_5_++) {
				method1392((byte) -51, i, i_5_);
				final int[][] is_6_ = method1179(0, WorldInfo.anInt1420);
				is_2_[i_5_] = is_6_[0][Class120_Sub12_Sub14.anInt3240];
				is_3_[i_5_] = is_6_[1][Class120_Sub12_Sub14.anInt3240];
				is_4_[i_5_] = is_6_[2][Class120_Sub12_Sub14.anInt3240];
			}
		}
		return is_1_;
	}

	static final void method1389() {
		for (int id = 0; id < Class154.anInt1441; id++) {
			final int index = Class169.anIntArray1648[id];
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			int mask = Canvas_Sub1.inputStream.getUByte();
			if ((mask & 0x1) != 0) {
				mask += Canvas_Sub1.inputStream.getUByte() << 8;
			}
			if ((mask & 0x40) != 0) {
				final int damage = Canvas_Sub1.inputStream.getUByteC();
				final int type = Canvas_Sub1.inputStream.getUByteS();
				npc.addHit(damage, type, Class101_Sub2.loopCycle);
				npc.hpBarCycle = 300 + Class101_Sub2.loopCycle;
				npc.hpBarRatio = Canvas_Sub1.inputStream.getUByteC();
			}
			if ((mask & 0x100) != 0) {
				final int i_12_ = Canvas_Sub1.inputStream.getUByteA();
				final int[] is = new int[i_12_];
				final int[] is_13_ = new int[i_12_];
				final int[] is_14_ = new int[i_12_];
				for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
					int i_16_ = Canvas_Sub1.inputStream.getULEShort();
					if (i_16_ == 65535) {
						i_16_ = -1;
					}
					is_14_[i_15_] = i_16_;
					is[i_15_] = Canvas_Sub1.inputStream.getUByteC();
					is_13_[i_15_] = Canvas_Sub1.inputStream.getULEShortA();
				}
				Class120_Sub12_Sub4.method1213(npc, is_14_, is_13_, is);
			}
			if ((mask & 0x10) != 0) {
				final int damage = Canvas_Sub1.inputStream.getUByteA();
				final int type = Canvas_Sub1.inputStream.getUByteS();
				npc.addHit(damage, type, Class101_Sub2.loopCycle);
			}
			if ((mask & 0x2) != 0) {
				if (npc.npcType.hasAmbientSound()) {
					Class120_Sub16.removeAmbientSoundNpc(npc);
				}
				npc.setNpcType(NpcType.list(Canvas_Sub1.inputStream.getUShortA()));
				npc.setSize(npc.npcType.size);
				npc.anInt3010 = npc.npcType.anInt1672;
				npc.entityRenderDataId = npc.npcType.anInt1692;
				if (npc.npcType.hasAmbientSound()) {
					AmbientSound.addAmbientSound(null, npc.walkQueueX[0], npc, npc.walkQueueZ[0], null, 0, Class173.gameLevel);
				}
			}
			if ((mask & 0x200) != 0) {
				npc.faceX = Canvas_Sub1.inputStream.getULEShortA();
				npc.faceZ = Canvas_Sub1.inputStream.getUShort();
			}
			if ((mask & 0x20) != 0) {
				int i_19_ = Canvas_Sub1.inputStream.getUShort();
				if (i_19_ == 65535) {
					i_19_ = -1;
				}
				final int i_20_ = Canvas_Sub1.inputStream.getUByteS();
				Class23.method204(npc, i_19_, i_20_);
			}
			if ((mask & 0x4) != 0) {
				int spotanimId = Canvas_Sub1.inputStream.getUShortA();
				final int bitPacked = Canvas_Sub1.inputStream.getInt();
				boolean bool = true;
				if (spotanimId == 65535) {
					spotanimId = -1;
				}
				if (spotanimId != -1 && npc.spotAnimId != -1 && SeqType.list(SpotAnimType.list(spotanimId).animationId).priority < SeqType.list(SpotAnimType.list(npc.spotAnimId).animationId).priority) {
					bool = false;
				}
				if (bool) {
					npc.anInt2963 = 0;
					npc.spotAnimFrame = 0;
					npc.spotAnimNextFrame = 1;
					npc.spotAnimDelay = (0xffff & bitPacked) + Class101_Sub2.loopCycle;
					if (npc.spotAnimDelay > Class101_Sub2.loopCycle) {
						npc.spotAnimFrame = -1;
					}
					npc.spotAnimHeight = bitPacked >> 16;
					npc.spotAnimId = spotanimId;
					if (npc.spotAnimId != -1 && Class101_Sub2.loopCycle == npc.spotAnimDelay) {
						final int spotanimAnimationId = SpotAnimType.list(npc.spotAnimId).animationId;
						if (spotanimAnimationId != -1) {
							final SeqType seqType = SeqType.list(spotanimAnimationId);
							if (seqType != null && seqType.frames != null) {
								Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, 0, false);
							}
						}
					}
				}
			}
			if ((mask & 0x8) != 0) {
				npc.facingEntityIndex = Canvas_Sub1.inputStream.getULEShort();
				if (npc.facingEntityIndex == 65535) {
					npc.facingEntityIndex = -1;
				}
			}
			if ((mask & 0x80) != 0) {
				npc.textSpoken = Canvas_Sub1.inputStream.getJagexString();
				npc.textCycle = 100;
			}
		}
	}

	static final String[] addNumbers(final String[] strings) {
		final String[] strings_26_ = new String[5];
		for (int i_27_ = 0; i_27_ < 5; i_27_++) {
			strings_26_[i_27_] = new StringBuilder(String.valueOf(i_27_)).append(": ").toString();
			if (strings != null && strings[i_27_] != null) {
				strings_26_[i_27_] = new StringBuilder(strings_26_[i_27_]).append(strings[i_27_]).toString();
			}
		}
		return strings_26_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_28_) {
		if (i_28_ == 0) {
			this.aBoolean2558 = buffer.getUByte() == 1;
		}
	}

	private final void method1392(final byte i, final int i_29_, final int i_30_) {
		try {
			final int i_31_ = Class90.anIntArray849[i_30_];
			final int i_32_ = Class150.anIntArray1405[i_29_];
			final float f = (float) Math.atan2(-2048 + i_31_, i_32_ - 2048);
			if (-Math.PI <= f && -2.356194490192345 >= f) {
				Class120_Sub12_Sub14.anInt3240 = i_30_;
				WorldInfo.anInt1420 = i_29_;
			} else if (-Math.PI / 2 >= f && f >= -2.356194490192345) {
				WorldInfo.anInt1420 = i_30_;
				Class120_Sub12_Sub14.anInt3240 = i_29_;
			} else if (!(-Math.PI / 4 >= f) || !(f >= -Math.PI / 2)) {
				if (0.0F >= f && f >= -Math.PI / 4) {
					WorldInfo.anInt1420 = Class120_Sub12_Sub2.anInt3145 - i_29_;
					Class120_Sub12_Sub14.anInt3240 = i_30_;
				} else if (!(f >= 0.0F) || !(f <= Math.PI / 4)) {
					if (!(f >= Math.PI / 4) || !(f <= Math.PI / 2)) {
						if (f >= Math.PI / 2 && f <= 2.356194490192345) {
							Class120_Sub12_Sub14.anInt3240 = i_29_;
							WorldInfo.anInt1420 = Class120_Sub12_Sub2.anInt3145 + -i_30_;
						} else if (2.356194490192345 <= f && Math.PI >= f) {
							WorldInfo.anInt1420 = i_29_;
							Class120_Sub12_Sub14.anInt3240 = -i_30_ + Class120_Sub12_Sub7.anInt3178;
						}
					} else {
						Class120_Sub12_Sub14.anInt3240 = -i_29_ + Class120_Sub12_Sub7.anInt3178;
						WorldInfo.anInt1420 = Class120_Sub12_Sub2.anInt3145 - i_30_;
					}
				} else {
					Class120_Sub12_Sub14.anInt3240 = Class120_Sub12_Sub7.anInt3178 + -i_30_;
					WorldInfo.anInt1420 = Class120_Sub12_Sub2.anInt3145 + -i_29_;
				}
			} else {
				Class120_Sub12_Sub14.anInt3240 = Class120_Sub12_Sub7.anInt3178 - i_29_;
				WorldInfo.anInt1420 = i_30_;
			}
			Class120_Sub12_Sub14.anInt3240 &= Class32.anInt259;
			if (i == -51) {
				WorldInfo.anInt1420 &= Class120_Sub29.anInt2774;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("uc.T(").append(i).append(',').append(i_29_).append(',').append(i_30_).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i_33_) {
		final int[] is_34_ = this.aClass30_2563.method258(i_33_);
		if (this.aClass30_2563.aBoolean238) {
			for (int i_35_ = 0; Class120_Sub12_Sub7.anInt3178 > i_35_; i_35_++) {
				method1392((byte) -51, i_33_, i_35_);
				final int[] is_36_ = method1192(WorldInfo.anInt1420, 0);
				is_34_[i_35_] = is_36_[Class120_Sub12_Sub14.anInt3240];
			}
		}
		return is_34_;
	}
}
