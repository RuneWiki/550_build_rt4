/* Class120_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AmbientSound extends Node {
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2478;
	static js5 aClass50_2479;
	int anInt2480 = 0;
	int anInt2481;
	int[] anIntArray2482;
	int anInt2483;
	static boolean aBoolean2484 = false;
	int anInt2485;
	int anInt2486;
	int anInt2487;
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2488;
	int anInt2489;
	static int hitmarksId;
	boolean hasVarp;
	Npc npc;
	int hearDistance;
	int anInt2494;
	Player player;
	int anInt2496;
	LocType location;
	int anInt2498;
	int volume;

	final void refresh() {
		final int i_0_ = this.anInt2485;
		if (this.location == null) {
			if (this.npc != null) {
				final int i_1_ = WaterfallShader.method178(this.npc);
				if (i_0_ != i_1_) {
					this.anInt2485 = i_1_;
					NpcType npcType = this.npc.npcType;
					if (npcType.transmogrificationIds != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType != null) {
						this.hearDistance = 128 * npcType.ambientSoundHearDistance;
						this.volume = npcType.ambientSoundVolume;
					} else {
						this.volume = this.hearDistance = 0;
					}
				}
			} else if (this.player != null) {
				this.anInt2485 = WaterfallShader.method179(this.player);
				this.hearDistance = 128 * this.player.ambientSoundHearDistance;
				this.volume = this.player.ambientSoundVolume;
			}
		} else {
			final LocType locType = this.location.handleVarp();
			if (locType == null) {
				this.anInt2489 = 0;
				this.hearDistance = 0;
				this.anIntArray2482 = null;
				this.volume = 0;
				this.anInt2485 = -1;
				this.anInt2486 = 0;
			} else {
				this.anInt2485 = locType.ambientSoundId;
				this.anInt2489 = locType.anInt1879;
				this.anInt2486 = locType.anInt1845;
				this.hearDistance = locType.ambientSoundHearDistance * 128;
				this.volume = locType.ambientSoundVolume;
				this.anIntArray2482 = locType.anIntArray1870;
			}
		}
		if (this.anInt2485 != i_0_ && this.aClass120_Sub30_Sub4_2488 != null) {
			Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(this.aClass120_Sub30_Sub4_2488);
			this.aClass120_Sub30_Sub4_2488 = null;
		}
	}

	static final void addAmbientSound(final LocType locType, final int x, final Npc npc, final int z, final Player player, final int rotation, final int level) {
		final AmbientSound ambientSound = new AmbientSound();
		ambientSound.anInt2498 = level;
		ambientSound.anInt2483 = z * 128;
		ambientSound.anInt2494 = x * 128;
		if (locType == null) {
			if (npc == null) {
				if (player != null) {
					ambientSound.player = player;
					ambientSound.anInt2487 = (x + player.getSize()) * 128;
					ambientSound.anInt2481 = (z + player.getSize()) * 128;
					ambientSound.anInt2485 = WaterfallShader.method179(player);
					ambientSound.volume = player.ambientSoundVolume;
					ambientSound.hearDistance = player.ambientSoundHearDistance * 128;
					Npc.playerAmbientSounds.put(ambientSound, Varp.stringToLong(player.name));
				}
			} else {
				ambientSound.npc = npc;
				NpcType npcType = npc.npcType;
				if (npcType.transmogrificationIds != null) {
					ambientSound.hasVarp = true;
					npcType = npcType.handleVarp();
				}
				if (npcType != null) {
					ambientSound.anInt2487 = (x + npcType.size) * 128;
					ambientSound.anInt2481 = (z + npcType.size) * 128;
					ambientSound.anInt2485 = WaterfallShader.method178(npc);
					ambientSound.volume = npcType.ambientSoundVolume;
					ambientSound.hearDistance = npcType.ambientSoundHearDistance * 128;
				}
				Class120_Sub12_Sub10.npcAmbientSounds.addLast(ambientSound);
			}
		} else {
			ambientSound.anInt2486 = locType.anInt1845;
			ambientSound.anInt2489 = locType.anInt1879;
			ambientSound.anIntArray2482 = locType.anIntArray1870;
			ambientSound.volume = locType.ambientSoundVolume;
			int xSize = locType.sizeX;
			ambientSound.hearDistance = locType.ambientSoundHearDistance * 128;
			ambientSound.location = locType;
			int zSize = locType.sizeZ;
			if (rotation == 1 || rotation == 3) {
				xSize = locType.sizeZ;
				zSize = locType.sizeX;
			}
			ambientSound.anInt2487 = (x + xSize) * 128;
			ambientSound.anInt2485 = locType.ambientSoundId;
			ambientSound.anInt2481 = (z + zSize) * 128;
			if (locType.childrenIDs != null) {
				ambientSound.hasVarp = true;
				ambientSound.refresh();
			}
			if (ambientSound.anIntArray2482 != null) {
				ambientSound.anInt2496 = (int) ((ambientSound.anInt2486 - ambientSound.anInt2489) * Math.random()) + ambientSound.anInt2489;
			}
			Class101_Sub1.locationAmbientSounds.addLast(ambientSound);
		}
	}

	public static void method1157(final int i) {
		try {
			if (i != 0) {
				method1157(-41);
			}
			aClass50_2479 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gn.B(").append(i).append(')').toString());
		}
	}

	static final void method1158(final int i, final int i_3_) {
		if (client.cameraType == 2) {
			UnderlayType.renderPitch = i;
			SpotAnimation.renderYaw = i_3_;
		}
		DummyOutputStream.aFloat28 = i_3_;
		Class120_Sub12_Sub21.aFloat3293 = i;
		Class127.method1892();
		Class118.aBoolean1134 = true;
	}
	
	static final void fillArray(final int[] src, final int val, int i_5_, int i_6_) {
		final int i_7_ = -7 + --i_6_;
		i_5_--;
		while (i_5_ < i_7_) {
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
		}
		while (i_6_ > i_5_) {
			src[++i_5_] = val;
		}
	}
}
