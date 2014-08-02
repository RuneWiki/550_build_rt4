/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	static String aString60 = "glow2:";
	static int anInt61;
	static int[] mapFunctionLocIds = new int[1000];
	static js5 aClass50_63;

	public static void method105(final int i) {
		try {
			mapFunctionLocIds = null;
			if (i != 128) {
				method105(79);
			}
			aClass50_63 = null;
			aString60 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ah.C(").append(i).append(')').toString());
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
					ambientSound.anInt2485 = Class20.method179(player);
					ambientSound.volume = player.ambientSoundVolume;
					ambientSound.hearDistance = player.ambientSoundHearDistance * 128;
					Npc.playerAmbientSounds.put(ambientSound, Varp.stringToLong(player.name));
				}
			} else {
				ambientSound.npc = npc;
				NpcType npcType = npc.npcType;
				if (npcType.childrenIDs != null) {
					ambientSound.hasVarp = true;
					npcType = npcType.handleVarp();
				}
				if (npcType != null) {
					ambientSound.anInt2487 = (x + npcType.size) * 128;
					ambientSound.anInt2481 = (z + npcType.size) * 128;
					ambientSound.anInt2485 = Class20.method178(npc);
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

	static final String decodeText(final Buffer buffer) {
		return Class120_Sub14_Sub15.decodeText(buffer, 32767);
	}

	static final void method108(final int i, final int i_6_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(i_6_, i);
			class120_sub14_sub7.method1453();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ah.A(").append(i).append(',').append(i_6_).append(')').toString());
		}
	}
}
