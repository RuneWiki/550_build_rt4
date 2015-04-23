/* Class120_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub11 extends Node {
	static int anInt2549 = 0;
	static boolean draggingComponent;
	byte[] aByteArray2555;
	static short[] aShortArray2556 = { 960, 957, -21568, -21571, 22464 };

	static final long method1173(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null) {
			return 0L;
		}
		for (int i_2_ = 0; i_2_ < class120_sub18.anInt2638; i_2_++) {
			final Class28 class28 = class120_sub18.aClass28Array2625[i_2_];
			if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == x && class28.anInt184 == z) {
				return class28.bitPacked;
			}
		}
		return 0L;
	}

	static final Class120_Sub14_Sub23 list(final int i) {
		Class120_Sub14_Sub23 class120_sub14_sub23_4_ = (Class120_Sub14_Sub23) Class96.aClass35_901.get(i);
		if (class120_sub14_sub23_4_ != null) {
			return class120_sub14_sub23_4_;
		}
		byte[] is;
		if (i >= 32768) {
			is = Class101_Sub2.aClass50_2277.getFile(0, 0x7fff & i);
		} else {
			is = Class156.aClass50_1456.getFile(0, i);
		}
		class120_sub14_sub23_4_ = new Class120_Sub14_Sub23();
		if (is != null) {
			class120_sub14_sub23_4_.decode(new Buffer(is));
		}
		if (-32769 >= (i ^ 0xffffffff)) {
			class120_sub14_sub23_4_.method1644();
		}
		Class96.aClass35_901.put(class120_sub14_sub23_4_, i);
		return class120_sub14_sub23_4_;
	}

	public static void method1175(final byte i) {
		try {
			TextRepository.aString2550 = null;
			if (i == -58) {
				TextRepository.aString2553 = null;
				aShortArray2556 = null;
				TextRepository.aString2554 = null;
				TextRepository.aString2552 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("j.E(").append(i).append(')').toString());
		}
	}

	static final void processAmbientSounds(final int x, final int z, final int level, final int redrawRate) {//TODO refactor sounds that appear on distance.
		for (AmbientSound ambientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getFront(); ambientSound != null; ambientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getNext()) {
			Class30.method259(false, x, z, level, redrawRate, ambientSound);
		}
		for (AmbientSound ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); ambientSound != null; ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
			int i_9_ = 1;
			final EntityRenderData class29 = ambientSound.npc.getEntityRenderData();
			if (ambientSound.npc.idleAnimId == class29.anInt218) {
				i_9_ = 0;
			} else if (ambientSound.npc.idleAnimId == class29.anInt190 || ambientSound.npc.idleAnimId == class29.anInt188 || ambientSound.npc.idleAnimId == class29.anInt216 || ambientSound.npc.idleAnimId == class29.anInt223) {
				i_9_ = 2;
			} else if (ambientSound.npc.idleAnimId == class29.anInt212 || ambientSound.npc.idleAnimId == class29.anInt192 || ambientSound.npc.idleAnimId == class29.anInt219 || class29.anInt210 == ambientSound.npc.idleAnimId) {
				i_9_ = 3;
			}
			if (i_9_ != ambientSound.anInt2480) {
				final int i_10_ = WaterfallShader.method178(ambientSound.npc);
				if (ambientSound.anInt2485 != i_10_) {
					if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2488);
						ambientSound.aClass120_Sub30_Sub4_2488 = null;
					}
					ambientSound.anInt2485 = i_10_;
				}
				ambientSound.anInt2480 = i_9_;
			}
			ambientSound.anInt2494 = ambientSound.npc.x;
			ambientSound.anInt2487 = ambientSound.npc.x + (ambientSound.npc.getSize() * 64);
			ambientSound.anInt2483 = ambientSound.npc.z;
			ambientSound.anInt2481 = ambientSound.npc.z + (ambientSound.npc.getSize() * 64);
			Class30.method259(false, x, z, level, redrawRate, ambientSound);
		}
		for (AmbientSound ambientSound = (AmbientSound) Npc.playerAmbientSounds.getFirst(); ambientSound != null; ambientSound = (AmbientSound) Npc.playerAmbientSounds.getNext()) {
			int i_11_ = 1;
			final EntityRenderData class29 = ambientSound.player.getEntityRenderData();
			if (class29.anInt218 != ambientSound.player.idleAnimId) {
				if (class29.anInt190 != ambientSound.player.idleAnimId && class29.anInt188 != ambientSound.player.idleAnimId && ambientSound.player.idleAnimId != class29.anInt216 && ambientSound.player.idleAnimId != class29.anInt223) {
					if (ambientSound.player.idleAnimId == class29.anInt212 || ambientSound.player.idleAnimId == class29.anInt192 || ambientSound.player.idleAnimId == class29.anInt219 || ambientSound.player.idleAnimId == class29.anInt210) {
						i_11_ = 3;
					}
				} else {
					i_11_ = 2;
				}
			} else {
				i_11_ = 0;
			}
			if (ambientSound.anInt2480 != i_11_) {
				final int i_12_ = WaterfallShader.method179(ambientSound.player);
				if (ambientSound.anInt2485 != i_12_) {
					if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2488);
						ambientSound.aClass120_Sub30_Sub4_2488 = null;
					}
					ambientSound.anInt2485 = i_12_;
				}
				ambientSound.anInt2480 = i_11_;
			}
			ambientSound.anInt2494 = ambientSound.player.x;
			ambientSound.anInt2487 = ambientSound.player.x + (ambientSound.player.getSize() * 64);
			ambientSound.anInt2483 = ambientSound.player.z;
			ambientSound.anInt2481 = ambientSound.player.z + (ambientSound.player.getSize() * 64);
			Class30.method259(false, x, z, level, redrawRate, ambientSound);
		}
	}

	static final void method1177(final int i, final js5 js5) {
		try {
			Class24.aClass50_145 = js5;
			if (i != -12014) {
				aShortArray2556 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("j.B(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	Class120_Sub11(final byte[] is) {
		this.aByteArray2555 = is;
	}
}
