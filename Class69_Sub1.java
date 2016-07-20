/* Class69_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69_Sub1 extends Class69 {
	static int renderZWrapper;
	static Class120_Sub30_Sub2 aClass120_Sub30_Sub2_2230;
	static int canvasWidth;

	static final boolean method618(final int i, final int i_0_, final int i_1_) {
		final int i_2_ = JagexSocket.anIntArrayArrayArray419[i][i_0_][i_1_];
		if (i_2_ == -Class120_Sub12_Sub9.anInt3193) {
			return false;
		}
		if (i_2_ == Class120_Sub12_Sub9.anInt3193) {
			return true;
		}
		final int i_3_ = i_0_ << 7;
		final int i_4_ = i_1_ << 7;
		if (Class120_Sub12_Sub34.method1380(i_3_ + 1, SubInterface.activeTileHeightMap[i][i_0_][i_1_], i_4_ + 1) && Class120_Sub12_Sub34.method1380(i_3_ + 128 - 1, SubInterface.activeTileHeightMap[i][i_0_ + 1][i_1_], i_4_ + 1)
				&& Class120_Sub12_Sub34.method1380(i_3_ + 128 - 1, SubInterface.activeTileHeightMap[i][i_0_ + 1][i_1_ + 1], i_4_ + 128 - 1) && Class120_Sub12_Sub34.method1380(i_3_ + 1, SubInterface.activeTileHeightMap[i][i_0_][i_1_ + 1], i_4_ + 128 - 1)) {
			JagexSocket.anIntArrayArrayArray419[i][i_0_][i_1_] = Class120_Sub12_Sub9.anInt3193;
			return true;
		}
		JagexSocket.anIntArrayArrayArray419[i][i_0_][i_1_] = -Class120_Sub12_Sub9.anInt3193;
		return false;
	}
}
