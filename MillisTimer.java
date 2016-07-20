/* Class87_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MillisTimer extends AbstractTimer {
	private long aLong2260;
	private final long[] aLongArray2261 = new long[10];
	private int anInt2262;
	private long aLong2263;
	private int anInt2264 = 1;
	private long aLong2265;

	@Override
	final long getAverageExecuteTime() {
		return aLong2265;
	}

	private final long method742() {
		final long l = 1000000L * TimeUtil.getSafeTime();
		final long l_0_ = l - aLong2263;
		long l_1_ = 0;
		aLong2263 = l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray2261[anInt2262] = l_0_;
			if (anInt2264 < 10) {
				anInt2264++;
			}
			anInt2262 = (anInt2262 + 1) % 10;
		}
		for (int i_2_ = 1; i_2_ <= anInt2264; i_2_++) {
			l_1_ += aLongArray2261[(anInt2262 + -i_2_ - -10) % 10];
		}
		return l_1_ / anInt2264;
	}

	@Override
	final void method738() {
		if (aLong2260 > aLong2265) {
			aLong2265 += -aLong2265 + aLong2260;
		}
		aLong2263 = 0L;
	}

	@Override
	final int sleep(final int i, final int i_4_) {
		PacketBuffer.sleepWrapper(i);
		aLong2265 += method742();
		final long l = 1000000L * i_4_;
		if (aLong2260 > aLong2265) {
			PacketBuffer.sleepWrapper((-aLong2265 + aLong2260) / 1000000L);
			aLong2263 += aLong2260 + -aLong2265;
			aLong2265 += aLong2260 + -aLong2265;
			aLong2260 += l;
			return 1;
		}
		int i_5_ = 0;
		do {
			i_5_++;
			aLong2260 += l;
		} while (i_5_ < 10 && aLong2260 < aLong2265);
		if (aLong2260 < aLong2265) {
			aLong2260 = aLong2265;
		}
		return i_5_;
	}

	MillisTimer() {
		aLong2263 = 0L;
		anInt2262 = 0;
		aLong2265 = 0L;
		aLong2260 = 0L;
	}
}
