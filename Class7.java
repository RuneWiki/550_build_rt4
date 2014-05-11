/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	static String aString60 = "glow2:";
	static int anInt61;
	static int[] anIntArray62 = new int[1000];
	static Class50 aClass50_63;

	public static void method105(final int i) {
		try {
			anIntArray62 = null;
			if (i != 128) {
				method105(79);
			}
			aClass50_63 = null;
			aString60 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ah.C(").append(i).append(')').toString());
		}
	}

	static final void method106(final int i, final Class184 class184, final int i_0_, final Npc class180_sub5_sub2, final int i_1_, final Player class180_sub5_sub1, final int i_2_, final int i_3_) {
		try {
			final Class120_Sub8 class120_sub8 = new Class120_Sub8();
			class120_sub8.anInt2498 = i_3_;
			class120_sub8.anInt2483 = i_1_ * 128;
			class120_sub8.anInt2494 = i_0_ * i;
			if (class184 == null) {
				if (class180_sub5_sub2 == null) {
					if (class180_sub5_sub1 != null) {
						class120_sub8.aClass180_Sub5_Sub1_2495 = class180_sub5_sub1;
						class120_sub8.anInt2487 = 128 * (i_0_ - -class180_sub5_sub1.getSize());
						class120_sub8.anInt2481 = (class180_sub5_sub1.getSize() + i_1_) * 128;
						class120_sub8.anInt2485 = Class20.method179(class180_sub5_sub1, (byte) -94);
						class120_sub8.anInt2499 = class180_sub5_sub1.anInt3739;
						class120_sub8.anInt2493 = class180_sub5_sub1.anInt3735 * 128;
						Npc.aClass75_3750.method655(class120_sub8, 111, Class70.method636(-118, class180_sub5_sub1.aString3745));
					}
				} else {
					class120_sub8.aClass180_Sub5_Sub2_2492 = class180_sub5_sub2;
					NpcType npcType = class180_sub5_sub2.npcType;
					if (npcType.childrenIDs != null) {
						class120_sub8.aBoolean2491 = true;
						npcType = npcType.handleVarp();
					}
					if (npcType != null) {
						class120_sub8.anInt2487 = 128 * (npcType.size + i_0_);
						class120_sub8.anInt2481 = (npcType.size + i_1_) * 128;
						class120_sub8.anInt2485 = Class20.method178((byte) -54, class180_sub5_sub2);
						class120_sub8.anInt2499 = npcType.anInt1658;
						class120_sub8.anInt2493 = 128 * npcType.anInt1677;
					}
					Class120_Sub12_Sub10.aClass105_3201.method895((byte) -101, class120_sub8);
				}
			} else {
				class120_sub8.anInt2486 = class184.anInt1845;
				class120_sub8.anInt2489 = class184.anInt1879;
				class120_sub8.anIntArray2482 = class184.anIntArray1870;
				class120_sub8.anInt2499 = class184.anInt1839;
				int i_4_ = class184.anInt1841;
				class120_sub8.anInt2493 = class184.anInt1832 * 128;
				class120_sub8.aClass184_2497 = class184;
				int i_5_ = class184.anInt1827;
				if (i_2_ == 1 || i_2_ == 3) {
					i_4_ = class184.anInt1827;
					i_5_ = class184.anInt1841;
				}
				class120_sub8.anInt2487 = 128 * (i_4_ + i_0_);
				class120_sub8.anInt2485 = class184.anInt1833;
				class120_sub8.anInt2481 = 128 * (i_5_ + i_1_);
				if (class184.anIntArray1852 != null) {
					class120_sub8.aBoolean2491 = true;
					class120_sub8.method1156(-110);
				}
				if (class120_sub8.anIntArray2482 != null) {
					class120_sub8.anInt2496 = (int) ((-class120_sub8.anInt2489 + class120_sub8.anInt2486) * Math.random()) + class120_sub8.anInt2489;
				}
				Class101_Sub1.aClass105_2266.method895((byte) 51, class120_sub8);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("ah.D(").append(i).append(',').append(class184 != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(class180_sub5_sub2 != null ? "{...}" : "null").append(',').append(i_1_).append(',').append(class180_sub5_sub1 != null ? "{...}" : "null")
							.append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
	}

	static final String method107(final int i, final Buffer class120_sub7) {
		String string;
		try {
			if (i != 32767) {
				aClass50_63 = null;
			}
			string = Class120_Sub14_Sub15.method1557(true, 32767, class120_sub7);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ah.B(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return string;
	}

	static final void method108(final int i, final int i_6_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(i_6_, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ah.A(").append(i).append(',').append(i_6_).append(')').toString());
		}
	}
}
