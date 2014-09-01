/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	static int language;
	static int anInt67 = 0;
	static int anInt68;
	private long aLong69;
	static byte[][][] aByteArrayArrayArray70;
	static int compassId;
	static int anInt72;
	private final int anInt73;
	static boolean[] needInterfaceRedraw;
	private final NodeSub[] aClass120_Sub14Array75;
	private NodeSub aClass120_Sub14_76;
	static int anInt77;

	static {
		language = 0;
		anInt68 = -1;
		needInterfaceRedraw = new boolean[100];
		anInt77 = -1;
	}

	final NodeSub method113() {
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
		return null;
	}

	final NodeSub method114(final long l) {
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
		return null;
	}

	final void method115(final NodeSub nodeSub, final long l) {
		if (nodeSub.previousSub != null) {
			nodeSub.unlinkSub();
		}
		final NodeSub class120_sub14_4_ = aClass120_Sub14Array75[(int) (l & -1 + anInt73)];
		nodeSub.previousSub = class120_sub14_4_.previousSub;
		nodeSub.subUid = l;
		nodeSub.nextSub = class120_sub14_4_;
		nodeSub.previousSub.nextSub = nodeSub;
		nodeSub.nextSub.previousSub = nodeSub;
	}

	static final boolean method116(final MapFunctionType class73) {
		if (class73 == null) {
			return false;
		}
		if (!class73.aBoolean629) {
			return false;
		}
		if (!class73.method647()) {
			return false;
		}
		if (Class86.aClass75_823.get(class73.myId) != null) {
			return false;
		}
		if (Class81.aClass75_777.get(class73.anInt652) != null) {
			return false;
		}
		return true;
	}

	static final AbstractFont constructAbstractFont(final js5 spriteJs5, final js5 fontJs5, final int group, final int file) {
		if (!Class10.decodedSprites(spriteJs5, group, file)) {
			return null;
		}
		return ParticleManager.constructAbstractFont(fontJs5.getFile(group, file));
	}

	public static void method118() {
		needInterfaceRedraw = null;
		aByteArrayArrayArray70 = null;
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
