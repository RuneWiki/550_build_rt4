/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class31 {
	static int anInt240;
	static js5 aClass50_241;
	static int[] anIntArray243;
	static int anInt244 = 0;
	static GameShell gameApplet = null;
	static LDIndexedSprite aClass107_Sub1_246;
	static int spriteTrimWidth;
	static int anInt248;
	static boolean advertSuppressed = false;
	static int anInt250 = 0;

	static {
		aClass107_Sub1_246 = null;
	}

	static final void method262() {
		while (Canvas_Sub1.inputStream.getBitsLeft(AbstractMouseWheelHandler.packetSize) >= 27) {
			final int index = Canvas_Sub1.inputStream.getBitValue(15);
			if (index == 32767) {
				break;
			}
			boolean newNpc = false;
			if (Class120_Sub12_Sub11.npcList[index] == null) {
				newNpc = true;
				Class120_Sub12_Sub11.npcList[index] = new Npc();
			}
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = index;
			npc.anInt2985 = Class101_Sub2.loopCycle;
			if (npc.npcType != null && npc.npcType.hasAmbientSound()) {
				Class120_Sub16.removeAmbientSoundNpc(npc);
			}
			int i_1_ = Canvas_Sub1.inputStream.getBitValue(5);
			if (i_1_ > 15) {
				i_1_ -= 32;
			}
			final int i_2_ = Class15.anIntArray101[Canvas_Sub1.inputStream.getBitValue(3)];
			if (newNpc) {
				npc.anInt3019 = npc.anInt3032 = i_2_;
			}
			int i_3_ = Canvas_Sub1.inputStream.getBitValue(5);
			npc.setNpcType(NpcType.list(Canvas_Sub1.inputStream.getBitValue(14)));
			final int i_4_ = Canvas_Sub1.inputStream.getBitValue(1);
			if (i_3_ > 15) {
				i_3_ -= 32;
			}
			if (i_4_ == 1) {
				Class169.anIntArray1648[Class154.anInt1441++] = index;
			}
			final int i_5_ = Canvas_Sub1.inputStream.getBitValue(1);
			npc.setSize(npc.npcType.size);
			npc.anInt2982 = npc.npcType.anInt1692;
			npc.anInt3010 = npc.npcType.anInt1672;
			if (npc.anInt3010 == 0) {
				npc.anInt3032 = 0;
			}
			npc.method2323(i_3_ + TileParticleQueue.selfPlayer.walkQueueX[0], TileParticleQueue.selfPlayer.walkQueueZ[0] - -i_1_, npc.getSize(), i_5_ == 1);
			if (npc.npcType.hasAmbientSound()) {
				Class7.addAmbientSound(null, npc.walkQueueX[0], npc, npc.walkQueueZ[0], null, 0, Class173.gameLevel);
			}
		}
		Canvas_Sub1.inputStream.endBitAccess();
	}

	static final int method263(final boolean bool) {
		final long l = TimeUtil.getSafeTime();
		for (Class120_Sub3 class120_sub3 = bool ? (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.getFirst() : (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.getNext(); class120_sub3 != null; class120_sub3 = (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.getNext()) {
			if (l > (0x3fffffffffffffffL & class120_sub3.aLong2425)) {
				if ((class120_sub3.aLong2425 & 0x4000000000000000L ^ 0xffffffffffffffffL) == -1L) {
					class120_sub3.unlink();
				} else {
					final int i_7_ = (int) class120_sub3.uid;
					Class2.permanentVariable[i_7_] = Class30.anIntArray239[i_7_];
					class120_sub3.unlink();
					return i_7_;
				}
			}
		}
		return -1;
	}

	static final void method264(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			if (i == -1 && i_13_ >= 1 && i_10_ >= 1 && i_13_ <= 102 && i_10_ <= 102) {
				if (!Class143_Sub1.method2021() && (0x2 & Class114.tileSettings[0][i_13_][i_10_]) == 0) {
					int i_15_ = i_8_;
					if ((0x8 & Class114.tileSettings[i_8_][i_13_][i_10_]) != 0) {
						i_15_ = 0;
					}
					if (i_15_ != Class120_Sub14_Sub4.anInt3469) {
						return;
					}
				}
				int i_16_ = i_8_;
				if (i_16_ < 3 && (Class114.tileSettings[1][i_13_][i_10_] & 0x2) == 2) {
					i_16_++;
				}
				Class88.method743((byte) -116, i_8_, i_16_, i_10_, Class182.collisionMaps[i_8_], i_11_, i_13_);
				if (i_12_ >= 0) {
					final boolean bool = Hashtable.showGroundDecorations;
					Hashtable.showGroundDecorations = true;
					Class93.method771(i_9_, i_8_, i_12_, i_16_, i_13_, 4, false, i_10_, Class182.collisionMaps[i_8_], false, i_14_);
					Hashtable.showGroundDecorations = bool;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("db.E(").append(i).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')')
					.toString());
		}
	}

	static final int method265(final String string) {
		return CanvasWrapper.method65(string, 10, true);
	}

	public static void method266(final boolean bool) {
		try {
			aClass50_241 = null;
			aClass107_Sub1_246 = null;
			anIntArray243 = null;
			if (bool) {
				method265(null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("db.A(").append(bool).append(')').toString());
		}
	}

	static final void removePlayerAmbientSound(final Player player) {
		final AmbientSound ambientSound = (AmbientSound) Npc.playerAmbientSounds.get(Varp.stringToLong(player.name));
		if (ambientSound != null) {
			if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
				Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2488);
				ambientSound.aClass120_Sub30_Sub4_2488 = null;
			}
			ambientSound.unlink();
		}
	}
}
