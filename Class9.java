/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	static int language;
	static int anInt67 = 0;
	static int anInt68;
	private long aLong69;
	static byte[][][] aByteArrayArrayArray70;
	static int anInt71;
	static int anInt72;
	private final int anInt73;
	static boolean[] aBooleanArray74;
	private final NodeSub[] aClass120_Sub14Array75;
	private NodeSub aClass120_Sub14_76;
	static int anInt77;

	static {
		language = 0;
		anInt68 = -1;
		aBooleanArray74 = new boolean[100];
		anInt77 = -1;
	}

	final NodeSub method113(final int i) {
		NodeSub class120_sub14;
		try {
			if (i != -5463) {
				aLong69 = 122L;
			}
			if (aClass120_Sub14_76 == null) {
				return null;
			}
			for (final NodeSub class120_sub14_0_ = aClass120_Sub14Array75[(int) (anInt73 + -1 & aLong69)]; class120_sub14_0_ != aClass120_Sub14_76; aClass120_Sub14_76 = aClass120_Sub14_76.nextSub) {
				if (aLong69 == aClass120_Sub14_76.subUid) {
					final NodeSub class120_sub14_1_ = aClass120_Sub14_76;
					aClass120_Sub14_76 = aClass120_Sub14_76.nextSub;
					return class120_sub14_1_;
				}
			}
			aClass120_Sub14_76 = null;
			class120_sub14 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.A(").append(i).append(')').toString());
		}
		return class120_sub14;
	}

	final NodeSub method114(final byte i, final long l) {
		NodeSub class120_sub14;
		try {
			if (i > -62) {
				return null;
			}
			aLong69 = l;
			final NodeSub class120_sub14_2_ = aClass120_Sub14Array75[(int) (l & anInt73 + -1)];
			for (aClass120_Sub14_76 = class120_sub14_2_.nextSub; class120_sub14_2_ != aClass120_Sub14_76; aClass120_Sub14_76 = aClass120_Sub14_76.nextSub) {
				if (l == aClass120_Sub14_76.subUid) {
					final NodeSub class120_sub14_3_ = aClass120_Sub14_76;
					aClass120_Sub14_76 = aClass120_Sub14_76.nextSub;
					return class120_sub14_3_;
				}
			}
			aClass120_Sub14_76 = null;
			class120_sub14 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.F(").append(i).append(',').append(l).append(')').toString());
		}
		return class120_sub14;
	}

	final void method115(final long l, final NodeSub class120_sub14, final int i) {
		try {
			if (i != 0) {
				method115(38L, null, -96);
			}
			if (class120_sub14.previousSub != null) {
				class120_sub14.unlinkSub();
			}
			final NodeSub class120_sub14_4_ = aClass120_Sub14Array75[(int) (l & -1 + anInt73)];
			class120_sub14.previousSub = class120_sub14_4_.previousSub;
			class120_sub14.subUid = l;
			class120_sub14.nextSub = class120_sub14_4_;
			class120_sub14.previousSub.nextSub = class120_sub14;
			class120_sub14.nextSub.previousSub = class120_sub14;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.E(").append(l).append(',').append(class120_sub14 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final boolean method116(final Class73 class73, final int i) {
		boolean bool;
		try {
			if (class73 == null) {
				return false;
			}
			if (!class73.aBoolean629) {
				return false;
			}
			if (!class73.method647(i)) {
				return false;
			}
			if (Class86.aClass75_823.get(class73.anInt658) != null) {
				return false;
			}
			if (Class81.aClass75_777.get(class73.anInt652) != null) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.D(").append(class73 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return bool;
	}

	static final Class120_Sub14_Sub8 method117(final Class50 class50, final Class50 class50_5_, final int i, final int i_6_, final int i_7_) {
		Class120_Sub14_Sub8 class120_sub14_sub8;
		try {
			if (i != 18265) {
				return null;
			}
			if (!Class10.method121(class50, i_6_, i_7_)) {
				return null;
			}
			class120_sub14_sub8 = Class108_Sub1.method937(-11537, class50_5_.getFile(i_6_, i_7_));
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.C(").append(class50 != null ? "{...}" : "null").append(',').append(class50_5_ != null ? "{...}" : "null").append(',').append(i).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
		return class120_sub14_sub8;
	}

	public static void method118(final int i) {
		try {
			aBooleanArray74 = null;
			aByteArrayArrayArray70 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ak.B(").append(i).append(')').toString());
		}
	}

	Class9(final int i) {
		anInt73 = i;
		aClass120_Sub14Array75 = new NodeSub[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			final NodeSub class120_sub14 = aClass120_Sub14Array75[i_8_] = new NodeSub();
			class120_sub14.nextSub = class120_sub14;
			class120_sub14.previousSub = class120_sub14;
		}
	}
}
