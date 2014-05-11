/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 {
	static volatile int anInt362;
	static boolean aBoolean363 = false;

	static {
		anInt362 = 0;
	}

	static final void method336(final byte i) {
		try {
			if (i <= 34) {
				method337((byte) 85);
			}
			final int i_0_ = Class179.aByteArrayArray1777.length;
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				if (Class179.aByteArrayArray1777[i_1_] != null) {
					int i_2_ = -1;
					for (int i_3_ = 0; i_3_ < Class120_Sub12_Sub29.anInt3362; i_3_++) {
						if (Class120_Sub12_Sub8.anIntArray3190[i_3_] == Class120_Sub12_Sub36.anIntArray3417[i_1_]) {
							i_2_ = i_3_;
							break;
						}
					}
					if ((i_2_ ^ 0xffffffff) == 0) {
						Class120_Sub12_Sub8.anIntArray3190[Class120_Sub12_Sub29.anInt3362] = Class120_Sub12_Sub36.anIntArray3417[i_1_];
						i_2_ = Class120_Sub12_Sub29.anInt3362++;
					}
					final Buffer class120_sub7 = new Buffer(Class179.aByteArrayArray1777[i_1_]);
					int i_4_ = 0;
					while (Class179.aByteArrayArray1777[i_1_].length > class120_sub7.pos && i_4_ < 511 && Class148.localNpcCount < 1023) {
						final int i_5_ = i_4_++ << 6 | i_2_;
						final int i_6_ = class120_sub7.getUShort();
						final int i_7_ = i_6_ >> 14;
						final int i_8_ = (0x1f82 & i_6_) >> 7;
						final int i_9_ = -GameEntity.currentBaseX + (Class120_Sub12_Sub36.anIntArray3417[i_1_] >> 8) * 64 + i_8_;
						final int i_10_ = 0x3f & i_6_;
						final int i_11_ = i_10_ + 64 * (Class120_Sub12_Sub36.anIntArray3417[i_1_] & 0xff) - Class181.currentBaseZ;
						final NpcType npcType = NpcType.list(class120_sub7.getUShort());
						if (Class120_Sub12_Sub11.npcList[i_5_] == null && (npcType.aByte1700 & 0x1) > 0 && Class120_Sub14_Sub4.anInt3469 == i_7_ && i_9_ >= 0 && npcType.size + i_9_ < 104 && i_11_ >= 0 && i_11_ - -npcType.size < 104) {
							Class120_Sub12_Sub11.npcList[i_5_] = new Npc();
							final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_5_];
							Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_5_;
							class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
							class180_sub5_sub2.method2346((byte) 90, npcType);
							class180_sub5_sub2.method2338(23751, class180_sub5_sub2.npcType.size);
							class180_sub5_sub2.anInt3019 = class180_sub5_sub2.anInt3032 = Class15.anIntArray101[class180_sub5_sub2.npcType.aByte1652];
							class180_sub5_sub2.anInt3010 = class180_sub5_sub2.npcType.anInt1672;
							if (class180_sub5_sub2.anInt3010 == 0) {
								class180_sub5_sub2.anInt3032 = 0;
							}
							class180_sub5_sub2.anInt2982 = class180_sub5_sub2.npcType.anInt1692;
							class180_sub5_sub2.method2323((byte) 74, i_11_, class180_sub5_sub2.getSize(), i_9_, true);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ek.A(").append(i).append(')').toString());
		}
	}

	static final AbstractSprite method337(final byte i) {
		AbstractSprite class120_sub14_sub19;
		try {
			final int i_12_ = Class120_Sub12_Sub39.spriteHeights[0] * Class120_Sub12_Sub11.spriteWidths[0];
			if (i != 104) {
				anInt362 = 112;
			}
			final byte[] is = Class145.spritePaletteIndicators[0];
			final int[] is_13_ = new int[i_12_];
			for (int i_14_ = 0; i_12_ > i_14_; i_14_++) {
				is_13_[i_14_] = Class132_Sub1.spritePalette[Class120_Sub12_Sub3.method1207(is[i_14_], 255)];
			}
			AbstractSprite class120_sub14_sub19_15_;
			if (HDToolkit.glEnabled) {
				class120_sub14_sub19_15_ = new HDSprite(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], Class120_Sub18.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], is_13_);
			} else {
				class120_sub14_sub19_15_ = new LDSprite(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], Class120_Sub18.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], is_13_);
			}
			Class53_Sub1.resetSpriteInfo();
			class120_sub14_sub19 = class120_sub14_sub19_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ek.B(").append(i).append(')').toString());
		}
		return class120_sub14_sub19;
	}
}
