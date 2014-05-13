/* Class120_Sub14_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class120_Sub14_Sub24 extends NodeSub {
	int anInt3656;
	int anInt3657;
	static CRC32 aCRC32_3658 = new CRC32();
	Class169 aClass169_3659;
	int anInt3660;
	int anInt3661;
	int anInt3662;
	int anInt3663;
	int anInt3664;
	static String aString3665;
	static int anInt3666 = 0;
	int anInt3667;

	static {
		aString3665 = "Loading sprites - ";
	}

	public static void method1646(final int i) {
		try {
			aString3665 = null;
			if (i != 0) {
				aString3665 = null;
			}
			aCRC32_3658 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wn.E(").append(i).append(')').toString());
		}
	}

	static final void method1647(final int i, final int i_0_, final int i_1_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(i, i_0_);
			class120_sub14_sub7.method1454((byte) -121);
			class120_sub14_sub7.anInt3484 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wn.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final void method1648(final byte i) {
		try {
			for (int i_2_ = -1; i_2_ < Class83.localPlayerCount; i_2_++) {
				int i_3_;
				if (i_2_ == -1) {
					i_3_ = 2047;
				} else {
					i_3_ = Class112.playerIndices[i_2_];
				}
				final Player class180_sub5_sub1 = Class118.playersList[i_3_];
				if (class180_sub5_sub1 != null && class180_sub5_sub1.anInt3025 > 0) {
					final Player class180_sub5_sub1_4_ = class180_sub5_sub1;
					class180_sub5_sub1_4_.anInt3025 = ((GameEntity) class180_sub5_sub1_4_).anInt3025 - 1;
					if (class180_sub5_sub1.anInt3025 == 0) {
						class180_sub5_sub1.aString2975 = null;
					}
				}
			}
			if (i == 127) {
				for (int i_5_ = 0; Class148.localNpcCount > i_5_; i_5_++) {
					final int i_6_ = Class120_Sub12_Sub36.localNpcIndices[i_5_];
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_6_];
					if (class180_sub5_sub2 != null && class180_sub5_sub2.anInt3025 > 0) {
						final Npc class180_sub5_sub2_7_ = class180_sub5_sub2;
						class180_sub5_sub2_7_.anInt3025 = ((GameEntity) class180_sub5_sub2_7_).anInt3025 - 1;
						if (class180_sub5_sub2.anInt3025 == 0) {
							class180_sub5_sub2.aString2975 = null;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wn.B(").append(i).append(')').toString());
		}
	}

	static final void method1649(final int i, final int i_8_, final int i_9_, final int i_10_, final SceneGraphNode sceneGraphNode, final long l, final boolean bool) {
		if (sceneGraphNode != null) {
			final Class36 class36 = new Class36();
			class36.aClass180_309 = sceneGraphNode;
			class36.anInt311 = i_8_ * 128 + 64;
			class36.anInt310 = i_9_ * 128 + 64;
			class36.anInt312 = i_10_;
			class36.bitPacked = l;
			class36.aBoolean314 = bool;
			if (Class120_Sub1.groundTiles[i][i_8_][i_9_] == null) {
				Class120_Sub1.groundTiles[i][i_8_][i_9_] = new GroundTile(i, i_8_, i_9_);
			}
			Class120_Sub1.groundTiles[i][i_8_][i_9_].aClass36_2650 = class36;
		}
	}

	final void method1650(final int i, final int i_11_, final int i_12_, final int i_13_) {
		try {
			this.anInt3663 = i_11_;
			if (i == -30263) {
				this.anInt3656 = i_13_;
				this.anInt3657 = i_12_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wn.D(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(')').toString());
		}
	}

	Class120_Sub14_Sub24(final Class169 class169, final ParticleEngine class108_sub2) {
		this.aClass169_3659 = class169;
	}
}
