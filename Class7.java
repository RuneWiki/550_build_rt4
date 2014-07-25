/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	static String aString60 = "glow2:";
	static int anInt61;
	static int[] anIntArray62 = new int[1000];
	static js5 aClass50_63;

	public static void method105(final int i) {
		try {
			anIntArray62 = null;
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
					ambientSound.anInt2499 = player.anInt3739;
					ambientSound.anInt2493 = player.anInt3735 * 128;
					Npc.playerAmbientSounds.put(ambientSound, Varp.stringToLong(player.name));
				}
			} else {
				ambientSound.npc = npc;
				NpcType npcType = npc.npcType;
				if (npcType.childrenIDs != null) {
					ambientSound.aBoolean2491 = true;
					npcType = npcType.handleVarp();
				}
				if (npcType != null) {
					ambientSound.anInt2487 = (npcType.size + x) * 128;
					ambientSound.anInt2481 = (npcType.size + z) * 128;
					ambientSound.anInt2485 = Class20.method178(npc);
					ambientSound.anInt2499 = npcType.anInt1658;
					ambientSound.anInt2493 = npcType.anInt1677 * 128;
				}
				Class120_Sub12_Sub10.npcAmbientSounds.addLast(ambientSound);
			}
		} else {
			ambientSound.anInt2486 = locType.anInt1845;
			ambientSound.anInt2489 = locType.anInt1879;
			ambientSound.anIntArray2482 = locType.anIntArray1870;
			ambientSound.anInt2499 = locType.anInt1839;
			int i_4_ = locType.sizeX;
			ambientSound.anInt2493 = locType.anInt1832 * 128;
			ambientSound.location = locType;
			int i_5_ = locType.sizeZ;
			if (rotation == 1 || rotation == 3) {
				i_4_ = locType.sizeZ;
				i_5_ = locType.sizeX;
			}
			ambientSound.anInt2487 = 128 * (i_4_ + x);
			ambientSound.anInt2485 = locType.anInt1833;
			ambientSound.anInt2481 = 128 * (i_5_ + z);
			if (locType.childrenIDs != null) {
				ambientSound.aBoolean2491 = true;
				ambientSound.method1156();
			}
			if (ambientSound.anIntArray2482 != null) {
				ambientSound.anInt2496 = (int) ((-ambientSound.anInt2489 + ambientSound.anInt2486) * Math.random()) + ambientSound.anInt2489;
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
