/* Class120_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub2 extends Node {
	static js5 spotAnimsJs5;
	static int[][] anIntArrayArray2416;
	static float aFloat2417;
	boolean aBoolean2418;
	static int anInt2419;
	static String[] aStringArray2420 = new String[1000];
	static int anInt2421;
	static int anInt2422;
	static String[] chatMessageClanName;

	static {
		anInt2419 = 0;
		chatMessageClanName = new String[100];
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

	static final boolean method1046(final int tilePosX, final int maxTileY, final int tileY, final int tilePosZ, final int far) {
		final int i_19_ = tilePosZ * Class120_Sub12_Sub30.renderYawSin + tilePosX * MapFunctionType.renderYawCos >> 16;
		final int i_20_ = tilePosZ * MapFunctionType.renderYawCos - tilePosX * Class120_Sub12_Sub30.renderYawSin >> 16;
		int i_21_ = maxTileY * Class69_Sub2.renderPitchSin + i_20_ * ObjectContainer.renderPitchCos >> 16;
		final int i_22_ = maxTileY * ObjectContainer.renderPitchCos - i_20_ * Class69_Sub2.renderPitchSin >> 16;
		if (i_21_ < 1) {
			i_21_ = 1;
		}
		final int i_23_ = (i_19_ << 9) / i_21_;
		final int i_24_ = (i_22_ << 9) / i_21_;
		int i_25_ = tileY * Class69_Sub2.renderPitchSin + i_20_ * ObjectContainer.renderPitchCos >> 16;
		final int i_26_ = tileY * ObjectContainer.renderPitchCos - i_20_ * Class69_Sub2.renderPitchSin >> 16;
		if (i_25_ < 1) {
			i_25_ = 1;
		}
		final int i_27_ = (i_19_ << 9) / i_25_;
		final int i_28_ = (i_26_ << 9) / i_25_;
		if (i_21_ < 50 && i_25_ < 50) {
			return false;
		}
		if (i_21_ > far && i_25_ > far) {
			return false;
		}
		if (i_23_ < Rasterizer.viewportLeft && i_27_ < Rasterizer.viewportLeft) {
			return false;
		}
		if (i_23_ > Rasterizer.viewportRight && i_27_ > Rasterizer.viewportRight) {
			return false;
		}
		if (i_24_ < Rasterizer.viewportTop && i_28_ < Rasterizer.viewportTop) {
			return false;
		}
		if (i_24_ > Rasterizer.viewportBottom && i_28_ > Rasterizer.viewportBottom) {
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
