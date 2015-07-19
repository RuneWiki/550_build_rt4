/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static int[] anIntArray224;
	private final int anInt225;
	static boolean aBoolean226 = false;
	private Class120_Sub19[] aClass120_Sub19Array227;
	private int anInt228 = 0;
	static boolean packetCounterUpdated;
	private int[][] anIntArrayArray230;
	private final int anInt232;
	static Class120_Sub30_Sub2 aClass120_Sub30_Sub2_234;
	private int anInt235 = -1;
	static int globalMagnetPos;
	private Deque aClass105_237 = new Deque();
	boolean aBoolean238 = false;
	static int[] anIntArray239;

	static {
		anIntArray224 = new int[4096];
		for (int i = 0; i < 4096; i++) {
			anIntArray224[i] = GroundTile.method1670(i);
		}
		packetCounterUpdated = false;
		globalMagnetPos = 0;
		anIntArray239 = new int[2500];
	}

	final int[][] method257() {
		if (anInt225 != anInt232) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int i_0_ = 0; i_0_ < anInt225; i_0_++) {
			aClass120_Sub19Array227[i_0_] = DummyOutputStream.aClass120_Sub19_27;
		}
		return anIntArrayArray230;
	}

	final int[] method258(final int i) {
		if (anInt225 != anInt232) {
			if (anInt225 != 1) {
				Class120_Sub19 class120_sub19 = aClass120_Sub19Array227[i];
				if (class120_sub19 == null) {
					this.aBoolean238 = true;
					if (anInt225 > anInt228) {
						class120_sub19 = new Class120_Sub19(i, anInt228);
						anInt228++;
					} else {
						final Class120_Sub19 class120_sub19_2_ = (Class120_Sub19) aClass105_237.getLast();
						class120_sub19 = new Class120_Sub19(i, class120_sub19_2_.anInt2654);
						aClass120_Sub19Array227[class120_sub19_2_.anInt2656] = null;
						class120_sub19_2_.unlink();
					}
					aClass120_Sub19Array227[i] = class120_sub19;
				} else {
					this.aBoolean238 = false;
				}
				aClass105_237.addFront(class120_sub19);
				return anIntArrayArray230[class120_sub19.anInt2654];
			}
			this.aBoolean238 = i != anInt235;
			anInt235 = i;
			return anIntArrayArray230[0];
		}
		this.aBoolean238 = aClass120_Sub19Array227[i] == null;
		aClass120_Sub19Array227[i] = DummyOutputStream.aClass120_Sub19_27;
		return anIntArrayArray230[i];
	}

	static final void method259(final boolean bool, final int x, final int z, final int level, final int redrawRate, final AmbientSound ambientSound) {
		if (ambientSound.id != -1 || ambientSound.anIntArray2482 != null) {
			int distance = 0;
			final int volume = ambientSound.volume * CursorType.ambientSoundsVolume >> 8;
			if (x > ambientSound.entityX) {
				distance += x - ambientSound.entityX;
			} else if (ambientSound.x > x) {
				distance += ambientSound.x - x;
			}
			if (z > ambientSound.entityZ) {
				distance += z - ambientSound.entityZ;
			} else if (ambientSound.z > z) {
				distance += ambientSound.z - z;
			}
			if (ambientSound.hearDistance == 0 || ambientSound.hearDistance < distance - 64 || CursorType.ambientSoundsVolume == 0 || ambientSound.level != level) {
				if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2488);
					ambientSound.aClass120_Sub30_Sub4_2488 = null;
				}
				if (ambientSound.aClass120_Sub30_Sub4_2478 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2478);
					ambientSound.aClass120_Sub30_Sub4_2478 = null;
				}
			} else if (!bool) {
				distance -= 64;
				if (distance < 0) {
					distance = 0;
				}
				int i_8_ = (ambientSound.hearDistance - distance) * volume / ambientSound.hearDistance;
				if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
					ambientSound.aClass120_Sub30_Sub4_2488.setVolume(i_8_);
				} else if (ambientSound.id >= 0) {
					final SoundEffect class6 = SoundEffect.list(Class159.aClass50_1490, ambientSound.id, 0);
					if (class6 != null) {
						final Class120_Sub5_Sub1 class120_sub5_sub1 = class6.method104().method1067(ObjectPile.aClass172_1809);
						final Class120_Sub30_Sub4 class120_sub30_sub4 = Class120_Sub30_Sub4.method1821(class120_sub5_sub1, 100, i_8_);
						class120_sub30_sub4.method1795(-1);
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1787(class120_sub30_sub4);
						ambientSound.aClass120_Sub30_Sub4_2488 = class120_sub30_sub4;
					}
				}
				if (ambientSound.aClass120_Sub30_Sub4_2478 == null) {
					if (ambientSound.anIntArray2482 != null && ((ambientSound.anInt2496 -= redrawRate) ^ 0xffffffff) >= -1) {
						final int i_9_ = (int) (ambientSound.anIntArray2482.length * Math.random());
						final SoundEffect class6 = SoundEffect.list(Class159.aClass50_1490, ambientSound.anIntArray2482[i_9_], 0);
						if (class6 != null) {
							final Class120_Sub5_Sub1 class120_sub5_sub1 = class6.method104().method1067(ObjectPile.aClass172_1809);
							final Class120_Sub30_Sub4 class120_sub30_sub4 = Class120_Sub30_Sub4.method1821(class120_sub5_sub1, 100, i_8_);
							class120_sub30_sub4.method1795(0);
							Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1787(class120_sub30_sub4);
							ambientSound.anInt2496 = (int) (Math.random() * (-ambientSound.anInt2489 + ambientSound.anInt2486)) + ambientSound.anInt2489;
							ambientSound.aClass120_Sub30_Sub4_2478 = class120_sub30_sub4;
						}
					}
				} else {
					ambientSound.aClass120_Sub30_Sub4_2478.setVolume(i_8_);
					if (!ambientSound.aClass120_Sub30_Sub4_2478.hasPrevious()) {
						ambientSound.aClass120_Sub30_Sub4_2478 = null;
					}
				}
			}
		}
	}

	final void method261() {
		for (int i_10_ = 0; i_10_ < anInt225; i_10_++) {
			anIntArrayArray230[i_10_] = null;
		}
		anIntArrayArray230 = null;
		aClass120_Sub19Array227 = null;
		aClass105_237.clear();
		aClass105_237 = null;
	}

	Class30(final int i, final int i_11_, final int i_12_) {
		anInt232 = i_11_;
		aClass120_Sub19Array227 = new Class120_Sub19[anInt232];
		anInt225 = i;
		anIntArrayArray230 = new int[anInt225][i_12_];
	}
}
