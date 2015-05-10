/* Class120_Sub12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub7 extends Class120_Sub12 {
	static Deque spotAnimationDeque;
	static int anInt3178;
	static int crossIndex = 0;
	static int floorshadowsId;
	static boolean aBoolean3181 = false;
	static int[] menuOptionsData2 = new int[500];
	static int anInt3183 = -1;
	static int frameWidth;

	static {
		spotAnimationDeque = new Deque();
	}

	static final void method1231(final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		final int i_6_ = i_4_ + i_5_;
		final int i_7_ = i_2_ - i_4_;
		final int i_8_ = i_4_ + i_1_;
		for (int i_9_ = i_5_; i_9_ < i_6_; i_9_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_9_], i_0_, i_1_, i_3_);
		}
		for (int i_10_ = i_2_; i_7_ < i_10_; i_10_--) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_10_], i_0_, i_1_, i_3_);
		}
		final int i_11_ = i_3_ - i_4_;
		for (int i_12_ = i_6_; i_7_ >= i_12_; i_12_++) {
			final int[] is = GameEntity.anIntArrayArray3009[i_12_];
			AmbientSound.fillArray(is, i_0_, i_1_, i_8_);
			AmbientSound.fillArray(is, i_0_, i_11_, i_3_);
		}
	}

	static final int getFriendsIndex(final String string) {
		if (string == null) {
			return -1;
		}
		for (int id = 0; id < ProducingGraphicsBuffer.friendCount; id++) {
			if (string.equalsIgnoreCase(Class120_Sub16.friendsName[id])) {
				return id;
			}
		}
		return -1;
	}

	public Class120_Sub12_Sub7() {
		super(0, true);
	}

	@Override
	final int[] method1187(final int i_15_) {
		final int[] is_16_ = this.aClass30_2563.method258(i_15_);
		if (this.aClass30_2563.aBoolean238) {
			ArrayUtils.fillArray(is_16_, 0, anInt3178, Class150.anIntArray1405[i_15_]);
		}
		return is_16_;
	}

	static final int method1233(final int i, final boolean bool, final World class167_sub1, final boolean bool_17_, final World class167_sub1_18_, final int i_19_) {
		final int i_22_ = Js5Request.method1553(class167_sub1, class167_sub1_18_, i, bool);
		if (i_22_ != 0) {
			if (!bool) {
				return i_22_;
			}
			return -i_22_;
		}
		if (i_19_ == -1) {
			return 0;
		}
		final int i_23_ = Js5Request.method1553(class167_sub1, class167_sub1_18_, i_19_, bool_17_);
		if (!bool_17_) {
			return i_23_;
		}
		return -i_23_;
	}

}
