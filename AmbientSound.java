/* Class120_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AmbientSound extends Node {
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2478;
	static js5 aClass50_2479;
	int anInt2480 = 0;
	int entityZ;
	int[] anIntArray2482;
	int z;
	static boolean aBoolean2484 = false;
	int id;
	int anInt2486;
	int entityX;
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2488;
	int anInt2489;
	static int hitmarksId;
	boolean hasVarp;
	Npc npc;
	int hearDistance;
	int x;
	Player player;
	int anInt2496;
	LocType location;
	int level;
	int volume;

	final void refresh() {
		final int oldId = this.id;
		if (this.location == null) {
			if (this.npc != null) {
				final int i_1_ = WaterfallShader.method178(this.npc);
				if (oldId != i_1_) {
					this.id = i_1_;
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
				this.id = WaterfallShader.method179(this.player);
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
				this.id = -1;
				this.anInt2486 = 0;
			} else {
				this.id = locType.ambientSoundId;
				this.anInt2489 = locType.anInt1879;
				this.anInt2486 = locType.anInt1845;
				this.hearDistance = locType.ambientSoundHearDistance * 128;
				this.volume = locType.ambientSoundVolume;
				this.anIntArray2482 = locType.anIntArray1870;
			}
		}
		if (this.id != oldId && this.aClass120_Sub30_Sub4_2488 != null) {
			Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(this.aClass120_Sub30_Sub4_2488);
			this.aClass120_Sub30_Sub4_2488 = null;
		}
	}

	static final void addAmbientSound(final LocType locType, final int x, final Npc npc, final int z, final Player player, final int rotation, final int level) {
		final AmbientSound ambientSound = new AmbientSound();
		ambientSound.x = x * 128;
		ambientSound.z = z * 128;
		ambientSound.level = level;
		if (locType == null) {
			if (npc == null) {
				if (player != null) {
					ambientSound.player = player;
					ambientSound.entityX = (x + player.getSize()) * 128;
					ambientSound.entityZ = (z + player.getSize()) * 128;
					ambientSound.id = WaterfallShader.method179(player);
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
					ambientSound.entityX = (x + npcType.size) * 128;
					ambientSound.entityZ = (z + npcType.size) * 128;
					ambientSound.id = WaterfallShader.method178(npc);
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
			ambientSound.entityX = (x + xSize) * 128;
			ambientSound.entityZ = (z + zSize) * 128;
			ambientSound.id = locType.ambientSoundId;
			if (locType.transmogrificationIds != null) {
				ambientSound.hasVarp = true;
				ambientSound.refresh();
			}
			if (ambientSound.anIntArray2482 != null) {
				ambientSound.anInt2496 = (int) ((ambientSound.anInt2486 - ambientSound.anInt2489) * Math.random()) + ambientSound.anInt2489;
			}
			Class101_Sub1.locationAmbientSounds.addLast(ambientSound);
		}
	}

	static final void setCameraRotation(final int i, final int i_3_) {
		if (client.cameraType == 2) {
			UnderlayType.renderPitch = i;
			SpotAnimation.renderYaw = i_3_;
		}
		DummyOutputStream.cameraYaw = i_3_;
		Class120_Sub12_Sub21.cameraPitch = i;
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
