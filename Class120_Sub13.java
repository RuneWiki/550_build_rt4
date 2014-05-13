/* Class120_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub13 extends Node {
	int anInt2571;
	static int anInt2572 = 0;
	static boolean[][] aBooleanArrayArray2573;
	static String aString2574 = "white:";
	byte aByte2575;
	static Class50 aClass50_2576;
	static AbstractGraphicsBuffer fullscreenGraphics;
	static String aString2578 = " from your ignore list first.";
	String aString2579;
	String aString2580;
	static Class193[] aClass193Array2581 = new Class193[29];

	static final boolean method1403(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final SceneGraphNode sceneGraphNode, final int i_7_, final boolean bool, final long l) {
		final boolean bool_8_ = Class120_Sub26.anIntArrayArrayArray2741 == Class24.anIntArrayArrayArray140;
		int i_9_ = 0;
		for (int i_10_ = i_0_; i_10_ < i_0_ + i_2_; i_10_++) {
			for (int i_11_ = i_1_; i_11_ < i_1_ + i_3_; i_11_++) {
				if (i_10_ < 0 || i_11_ < 0 || i_10_ >= Class186.anInt1900 || i_11_ >= Class120_Sub12_Sub38.anInt3440) {
					return false;
				}
				final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_10_][i_11_];
				if (class120_sub18 != null && class120_sub18.anInt2638 >= 5) {
					return false;
				}
			}
		}
		final Class28 class28 = new Class28();
		class28.bitPacked = l;
		class28.anInt177 = i;
		class28.anInt178 = i_4_;
		class28.anInt185 = i_5_;
		class28.anInt179 = i_6_;
		class28.aClass180_174 = sceneGraphNode;
		class28.anInt172 = i_7_;
		class28.anInt180 = i_0_;
		class28.anInt184 = i_1_;
		class28.anInt182 = i_0_ + i_2_ - 1;
		class28.anInt175 = i_1_ + i_3_ - 1;
		for (int i_12_ = i_0_; i_12_ < i_0_ + i_2_; i_12_++) {
			for (int i_13_ = i_1_; i_13_ < i_1_ + i_3_; i_13_++) {
				int i_14_ = 0;
				if (i_12_ > i_0_) {
					i_14_++;
				}
				if (i_12_ < i_0_ + i_2_ - 1) {
					i_14_ += 4;
				}
				if (i_13_ > i_1_) {
					i_14_ += 8;
				}
				if (i_13_ < i_1_ + i_3_ - 1) {
					i_14_ += 2;
				}
				for (int i_15_ = i; i_15_ >= 0; i_15_--) {
					if (Class120_Sub1.groundTiles[i_15_][i_12_][i_13_] == null) {
						Class120_Sub1.groundTiles[i_15_][i_12_][i_13_] = new GroundTile(i_15_, i_12_, i_13_);
					}
				}
				final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_12_][i_13_];
				class120_sub18.aClass28Array2625[class120_sub18.anInt2638] = class28;
				class120_sub18.anIntArray2641[class120_sub18.anInt2638] = i_14_;
				class120_sub18.anInt2635 |= i_14_;
				class120_sub18.anInt2638++;
				if (bool_8_ && Class35.anIntArrayArray300[i_12_][i_13_] != 0) {
					i_9_ = Class35.anIntArrayArray300[i_12_][i_13_];
				}
			}
		}
		if (bool_8_ && i_9_ != 0) {
			for (int i_16_ = i_0_; i_16_ < i_0_ + i_2_; i_16_++) {
				for (int i_17_ = i_1_; i_17_ < i_1_ + i_3_; i_17_++) {
					if (Class35.anIntArrayArray300[i_16_][i_17_] == 0) {
						Class35.anIntArrayArray300[i_16_][i_17_] = i_9_;
					}
				}
			}
		}
		if (bool) {
			Class111.aClass28Array1057[Class120_Sub14_Sub12.anInt3556++] = class28;
		}
		return true;
	}

	static final JagexInterface method1404(final int i, final byte i_18_, final int i_19_) {
		JagexInterface jagexInterface;
		try {
			final JagexInterface class189_20_ = Class74.getJagexInterface(i);
			if (i_18_ != 82) {
				fullscreenGraphics = null;
			}
			if (i_19_ == -1) {
				return class189_20_;
			}
			if (class189_20_ == null || class189_20_.aClass189Array2072 == null || i_19_ >= class189_20_.aClass189Array2072.length) {
				return null;
			}
			jagexInterface = class189_20_.aClass189Array2072[i_19_];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("l.A(").append(i).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
		return jagexInterface;
	}

	static final int method1405(int i, final boolean bool, int i_21_) {
		int i_22_;
		try {
			int i_23_ = 0;
			if (bool) {
				method1406(-75);
			}
			for (/**/; i_21_ > 0; i_21_--) {
				i_23_ = i & 0x1 | i_23_ << 1;
				i >>>= 1;
			}
			i_22_ = i_23_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("l.D(").append(i).append(',').append(bool).append(',').append(i_21_).append(')').toString());
		}
		return i_22_;
	}

	public static void method1406(final int i) {
		try {
			aClass50_2576 = null;
			aBooleanArrayArray2573 = null;
			if (i != -31470) {
				method1404(-57, (byte) 85, 16);
			}
			fullscreenGraphics = null;
			aString2574 = null;
			aString2578 = null;
			aClass193Array2581 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("l.B(").append(i).append(')').toString());
		}
	}

	public Class120_Sub13() {
		/* empty */
	}
}
