/* Class120_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub1 extends NodeSub {
	Class180_Sub4 aClass180_Sub4_3446;
	static int anInt3447 = 0;
	static int anInt3448;
	static String aString3449 = "Take";

	public static void method1412(final int i) {
		try {
			aString3449 = null;
			if (i != 0) {
				method1415(null, (byte) -112, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bb.E(").append(i).append(')').toString());
		}
	}

	static final void method1413(final int i, final int i_0_) {
		try {
			if (Class50.method434(-115, i_0_)) {
				final Class189[] class189s = Node.aClass189ArrayArray1150[i_0_];
				for (final Class189 class1892 : class189s) {
					final Class189 class189 = class1892;
					if (class189 != null) {
						class189.anInt2098 = 1;
						class189.anInt1946 = 0;
						class189.anInt1965 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bb.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method1414(final Class50 class50, final int i) {
		try {
			Class111.aClass50_1059 = class50;
			if (i != 40) {
				method1412(-18);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bb.A(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final void method1415(final int[] is, final byte i, final Object[] objects) {
		do {
			try {
				Class57.method495(-1 + is.length, objects, 0, -118, is);
				if (i <= 93) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bb.D(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(objects != null ? "{...}" : "null").append(')').toString());
			}
		} while (false);
	}

	static final void setGameState(final int state) {
		if (state != Class109.gameState) {
			if (Class109.gameState == 0) {
				Class132_Sub2.method1940((byte) -119);
			}
			final boolean bool = state == 5 || state == 10 || state == 28;
			if (state == 40) {
				Class120_Sub1.method1037((byte) -120);
			}
			if (state != 40 && Light.aClass46_381 != null) {
				Light.aClass46_381.method377(-19055);
				Light.aClass46_381 = null;
			}
			if (state == 25 || state == 28) {
				Class120_Sub12_Sub28.anInt3361 = 0;
				Class120_Sub12_Sub37.anInt3431 = 1;
				Class66.anInt599 = 0;
				Class145.anInt1379 = 1;
				Class181.anInt1791 = 0;
				Class120_Sub30_Sub1.method1739(true, (byte) -93);
			}
			if (state == 25 || state == 10) {
				Class120_Sub12_Sub14.tbrefresh();
			}
			if (state != 5) {
				Class79_Sub1.method693(256);
			} else {
				IsaacCipher.method900(111, Class7.aClass50_63);
			}
			final boolean bool_3_ = Class109.gameState == 5 || Class109.gameState == 10 || Class109.gameState == 28;
			if (bool_3_ == !bool) {
				if (!bool) {
					Class120_Sub12_Sub6.method1230(5, 2);
					Class178.aClass45_1772.method367((byte) 122, true);
				} else {
					Class157.anInt1466 = AbstractSprite.anInt3620;
					if (RuntimeException_Sub1.anInt2142 != 0) {
						Class120_Sub15.method1654(0, Class120_Sub12_Sub36.aClass50_3419, 2, (byte) -127, 255, AbstractSprite.anInt3620, false);
					} else {
						Class120_Sub12_Sub6.method1230(5, 2);
					}
					Class178.aClass45_1772.method367((byte) 124, false);
				}
			}
			if (HDToolkit.glEnabled && (state == 25 || state == 28 || state == 40)) {
				HDToolkit.method522();
			}
			Class109.gameState = state;
		}
	}

	Class120_Sub14_Sub1(final Class180_Sub4 class180_sub4) {
		this.aClass180_Sub4_3446 = class180_sub4;
	}
}
