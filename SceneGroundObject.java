/* Class180_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SceneGroundObject extends SceneGraphNode {
	static Class50 aClass50_2839;
	static int spriteTrimHeight;
	static Cache aClass21_2841;
	private int anInt2842 = -32768;
	static int anInt2843;
	static Class120_Sub9[][] aClass120_Sub9ArrayArray2844;
	int amount;
	int id;
	static String aString2847 = "Loaded wordpack";
	static boolean aBoolean2848;
	static String aString2849;

	static {
		aClass21_2841 = new Cache(64);
		aBoolean2848 = true;
		aString2849 = "Please remove ";
	}

	@Override
	final int getMaxY() {
		return anInt2842;
	}

	@Override
	final void method2265(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final long l, final int i_7_, final ParticleEngine class108_sub2) {
		final Class180_Sub7 class180_sub7 = ObjType.list(this.id).method2105(0, this.amount, -1, null, null, 0);
		if (class180_sub7 != null) {
			class180_sub7.method2265(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, class108_sub2);
			anInt2842 = class180_sub7.getMaxY();
		}
	}

	static final void method2275(final byte i) {
		try {
			if (i != 29) {
				method2276(43);
			}
			Class154.aClass21_1438.clearSoftReference();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("he.B(").append(i).append(')').toString());
		}
	}

	static final void method2276(final int i) {
		try {
			ParticleEngine.method959(Class101_Sub2.loopCycle);
			if (Class69.rootInterfaceId != -1) {
				AbstractGraphicsBuffer.method1846(Class69.rootInterfaceId);
			}
			for (int i_8_ = 0; i_8_ < Class120_Sub1.anInt2414; i_8_++) {
				if (Class52.aBooleanArray467[i_8_]) {
					Class120_Sub12_Sub33.aBooleanArray3391[i_8_] = true;
				}
				Class9.aBooleanArray74[i_8_] = Class52.aBooleanArray467[i_8_];
				Class52.aBooleanArray467[i_8_] = false;
			}
			if (i != 7878) {
				aClass50_2839 = null;
			}
			Class84.anInt796 = Class101_Sub2.loopCycle;
			Class120_Sub14_Sub16.aClass189_3588 = null;
			Class56.anInt497 = -1;
			if (HDToolkit.glEnabled) {
				Class167.aBoolean1620 = true;
			}
			Class120_Sub14_Sub16.anInt3590 = -1;
			if ((Class69.rootInterfaceId ^ 0xffffffff) != 0) {
				Class120_Sub1.anInt2414 = 0;
				Class56.method486();
			}
			if (HDToolkit.glEnabled) {
				GraphicsHD.method597();
			} else {
				GraphicsLD.method2175();
			}
			Class120_Sub12_Sub22.redrawRate = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("he.D(").append(i).append(')').toString());
		}
	}

	public static void method2277(final int i) {
		try {
			aClass21_2841 = null;
			aString2849 = null;
			aString2847 = null;
			if (i == 28072) {
				aClass50_2839 = null;
				aClass120_Sub9ArrayArray2844 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("he.C(").append(i).append(')').toString());
		}
	}

	@Override
	final void method2266(final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		/* empty */
	}

	static final void method2278(final int i, final byte i_13_) {
		try {
			if (i_13_ == -123) {
				Class120_Sub14_Sub11.aClass21_3541.method192(i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("he.A(").append(i).append(',').append(i_13_).append(')').toString());
		}
	}
}
