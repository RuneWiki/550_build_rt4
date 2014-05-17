/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class52 {
	int[] anIntArray465;
	static boolean aBoolean466;
	static boolean[] aBooleanArray467 = new boolean[100];
	int[][] anIntArrayArray468;
	static Class50 aClass50_469;
	int[] anIntArray470;
	int anInt471;
	int anInt472;
	Class56 aClass56_473;
	int[][] anIntArrayArray474;
	int[] anIntArray475;
	static Class50 aClass50_476;
	static int anInt477;
	static int anInt478;
	Class56[] aClass56Array479;
	int[] anIntArray480;
	int indexCrc;
	int[] anIntArray482;
	int[] anIntArray483;
	int anInt484;

	static {
		aBoolean466 = false;
	}

	static final AbstractTimer constructTimer() {
		JagmiscTimer class87_sub2;
		try {
			class87_sub2 = new JagmiscTimer();
		} catch (final Throwable throwable) {
			AbstractTimer abstractTimer;
			try {
				abstractTimer = (AbstractTimer) Class.forName("NanoTimer").newInstance();
			} catch (final Throwable throwable_0_) {
				return new MillisTimer();
			}
			return abstractTimer;
		}
		return class87_sub2;
	}

	static final void method453(final int i, final byte i_1_) {
		if (i_1_ >= 103) {
			Class120_Sub14_Sub11.aClass21_3541.clear();
			Class120_Sub14_Sub11.aClass21_3541 = new Cache(i);
		}
	}

	public static void method454(final boolean bool) {
		aClass50_476 = null;
		if (bool) {
			aClass50_469 = null;
			aBooleanArray467 = null;
		}
	}

	private final void method455(final byte[] is, final int i) {
		final Buffer class120_sub7 = new Buffer(Class71.method639(true, is));
		final int i_2_ = class120_sub7.getUByte();
		if (i_2_ != 5 && i_2_ != 6) {
			throw new RuntimeException();
		}
		if (i_2_ >= 6) {
			this.anInt471 = class120_sub7.getInt();
		} else {
			this.anInt471 = 0;
		}
		int i_3_ = 0;
		final int i_4_ = class120_sub7.getUByte();
		this.anInt472 = class120_sub7.getUShort();
		int i_5_ = -1;
		this.anIntArray482 = new int[this.anInt472];
		for (int i_6_ = 0; i_6_ < this.anInt472; i_6_++) {
			this.anIntArray482[i_6_] = i_3_ += class120_sub7.getUShort();
			if (i_5_ < this.anIntArray482[i_6_]) {
				i_5_ = this.anIntArray482[i_6_];
			}
		}
		this.anInt484 = 1 + i_5_;
		this.anIntArray475 = new int[this.anInt484];
		this.anIntArray470 = new int[this.anInt484];
		this.anIntArrayArray468 = new int[this.anInt484][];
		this.anIntArray465 = new int[this.anInt484];
		this.anIntArray483 = new int[this.anInt484];
		if (i_4_ != 0) {
			this.anIntArray480 = new int[this.anInt484];
			for (int i_7_ = 0; i_7_ < this.anInt484; i_7_++) {
				this.anIntArray480[i_7_] = -1;
			}
			for (int i_8_ = 0; i_8_ < this.anInt472; i_8_++) {
				this.anIntArray480[this.anIntArray482[i_8_]] = class120_sub7.getInt();
			}
			this.aClass56_473 = new Class56(this.anIntArray480);
		}
		for (int i_9_ = 0; this.anInt472 > i_9_; i_9_++) {
			this.anIntArray470[this.anIntArray482[i_9_]] = class120_sub7.getInt();
		}
		for (int i_10_ = 0; this.anInt472 > i_10_; i_10_++) {
			this.anIntArray483[this.anIntArray482[i_10_]] = class120_sub7.getInt();
		}
		for (int i_11_ = 0; this.anInt472 > i_11_; i_11_++) {
			this.anIntArray475[this.anIntArray482[i_11_]] = class120_sub7.getUShort();
		}
		int i_12_ = 0;
		if (i >= -86) {
			constructTimer();
		}
		for (/**/; this.anInt472 > i_12_; i_12_++) {
			i_3_ = 0;
			int i_13_ = -1;
			final int i_14_ = this.anIntArray482[i_12_];
			final int i_15_ = this.anIntArray475[i_14_];
			this.anIntArrayArray468[i_14_] = new int[i_15_];
			for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
				final int i_17_ = this.anIntArrayArray468[i_14_][i_16_] = i_3_ += class120_sub7.getUShort();
				if (i_17_ > i_13_) {
					i_13_ = i_17_;
				}
			}
			this.anIntArray465[i_14_] = i_13_ - -1;
			if (1 + i_13_ == i_15_) {
				this.anIntArrayArray468[i_14_] = null;
			}
		}
		if (i_4_ != 0) {
			this.anIntArrayArray474 = new int[1 + i_5_][];
			this.aClass56Array479 = new Class56[1 + i_5_];
			for (i_12_ = 0; i_12_ < this.anInt472; i_12_++) {
				final int i_18_ = this.anIntArray482[i_12_];
				final int i_19_ = this.anIntArray475[i_18_];
				this.anIntArrayArray474[i_18_] = new int[this.anIntArray465[i_18_]];
				for (int i_20_ = 0; this.anIntArray465[i_18_] > i_20_; i_20_++) {
					this.anIntArrayArray474[i_18_][i_20_] = -1;
				}
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					int i_22_;
					if (this.anIntArrayArray468[i_18_] != null) {
						i_22_ = this.anIntArrayArray468[i_18_][i_21_];
					} else {
						i_22_ = i_21_;
					}
					this.anIntArrayArray474[i_18_][i_22_] = class120_sub7.getInt();
				}
				this.aClass56Array479[i_18_] = new Class56(this.anIntArrayArray474[i_18_]);
			}
		}
	}

	Class52(final byte[] is, final int i) {
		this.indexCrc = AbstractObject.getCrc(is, is.length);
		if (this.indexCrc != i) {
			throw new RuntimeException();
		}
		method455(is, -113);
	}
}
