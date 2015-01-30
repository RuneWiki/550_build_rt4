/* Class120_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub2 extends Node {
	static js5 aClass50_2415;
	static int[][] anIntArrayArray2416;
	static float aFloat2417;
	boolean aBoolean2418;
	static int anInt2419;
	static String[] aStringArray2420 = new String[1000];
	static int anInt2421;
	static int anInt2422;
	static String[] aStringArray2423;

	static {
		anInt2419 = 0;
		aStringArray2423 = new String[100];
		anInt2422 = -1;
	}

	final int method1040() {
		return 1;
	}

	int method1041() {
		return 0;
	}

	final boolean method1042() {
		return this.aBoolean2418;
	}

	abstract void method1043(int i);

	static final void method1045(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_6_, final int i_7_) {
		final int i_8_ = i_2_ - -i_7_;
		final int i_9_ = i_4_ - i_7_;
		final int i_10_ = i_3_ + i_7_;
		final int i_11_ = i_1_ + -i_7_;
		for (int i_12_ = i_2_; i_8_ > i_12_; i_12_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_12_], i, i_3_, i_1_);
		}
		for (int i_13_ = i_4_; i_9_ < i_13_; i_13_--) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_13_], i, i_3_, i_1_);
		}
		for (int i_14_ = i_8_; i_14_ <= i_9_; i_14_++) {
			final int[] is = GameEntity.anIntArrayArray3009[i_14_];
			AmbientSound.fillArray(is, i, i_3_, i_10_);
			AmbientSound.fillArray(is, i_6_, i_10_, i_11_);
			AmbientSound.fillArray(is, i, i_11_, i_1_);
		}
	}

	static final boolean method1046(final int i, final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		final int i_19_ = i_17_ * Class120_Sub12_Sub30.anInt3377 + i * MapFunctionType.anInt637 >> 16;
		final int i_20_ = i_17_ * MapFunctionType.anInt637 - i * Class120_Sub12_Sub30.anInt3377 >> 16;
		int i_21_ = i_15_ * Class69_Sub2.anInt2239 + i_20_ * ObjectContainer.anInt2616 >> 16;
		final int i_22_ = i_15_ * ObjectContainer.anInt2616 - i_20_ * Class69_Sub2.anInt2239 >> 16;
		if (i_21_ < 1) {
			i_21_ = 1;
		}
		final int i_23_ = (i_19_ << 9) / i_21_;
		final int i_24_ = (i_22_ << 9) / i_21_;
		int i_25_ = i_16_ * Class69_Sub2.anInt2239 + i_20_ * ObjectContainer.anInt2616 >> 16;
		final int i_26_ = i_16_ * ObjectContainer.anInt2616 - i_20_ * Class69_Sub2.anInt2239 >> 16;
		if (i_25_ < 1) {
			i_25_ = 1;
		}
		final int i_27_ = (i_19_ << 9) / i_25_;
		final int i_28_ = (i_26_ << 9) / i_25_;
		if (i_21_ < 50 && i_25_ < 50) {
			return false;
		}
		if (i_21_ > i_18_ && i_25_ > i_18_) {
			return false;
		}
		if (i_23_ < IntegerNode.anInt2792 && i_27_ < IntegerNode.anInt2792) {
			return false;
		}
		if (i_23_ > Class120_Sub12_Sub16.anInt3253 && i_27_ > Class120_Sub12_Sub16.anInt3253) {
			return false;
		}
		if (i_24_ < Class190.anInt2100 && i_28_ < Class190.anInt2100) {
			return false;
		}
		if (i_24_ > Class120_Sub30_Sub1.anInt3672 && i_28_ > Class120_Sub30_Sub1.anInt3672) {
			return false;
		}
		return true;
	}

	abstract void method1047();

	abstract void method1048(int i, int i_29_, int i_30_, int i_31_, int i_32_);

	abstract boolean method1049();

	public Class120_Sub2() {
		/* empty */
	}

	static final void method1050() {
		if (Class120_Sub12_Sub29.aClass164_3366 != null) {
			Class120_Sub12_Sub29.aClass164_3366.method2133();
		}
		if (Class120_Sub12_Sub3.aClass164_3150 != null) {
			Class120_Sub12_Sub3.aClass164_3150.method2133();
		}
	}

	final boolean method1051() {
		return false;
	}

	abstract void method1052(int i, int i_33_);

	abstract boolean method1053();

	final boolean method1054() {
		return false;
	}
}
