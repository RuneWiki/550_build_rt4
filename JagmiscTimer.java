/* Class87_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class JagmiscTimer extends AbstractTimer {
	private long aLong2254;
	private long aLong2255 = 0L;
	private int anInt2256;
	private int anInt2257;
	private long aLong2258;
	private final long[] aLongArray2259;

	@Override
	final long getAverageExecuteTime() {
		return aLong2254;
	}

	private final long method741() {
		final long l = jagmisc.nanoTime();
		final long l_0_ = l - aLong2258;
		aLong2258 = l;
		long l_1_ = 0L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray2259[anInt2256] = l_0_;
			if (anInt2257 < 1) {
				anInt2257++;
			}
			anInt2256 = (1 + anInt2256) % 10;
		}
		for (int i_2_ = 1; anInt2257 >= i_2_; i_2_++) {
			l_1_ += aLongArray2259[(10 + -i_2_ + anInt2256) % 10];
		}
		return l_1_ / anInt2257;
	}

	JagmiscTimer() {
		aLong2254 = 0L;
		anInt2257 = 1;
		anInt2256 = 0;
		aLong2258 = 0L;
		aLongArray2259 = new long[10];
		aLong2255 = aLong2254 = jagmisc.nanoTime();
		if (aLong2254 == 0L) {
			throw new RuntimeException();
		}
	}

	@Override
	final int sleep(final int i, final int i_4_) {
		PacketBuffer.sleepWrapper(i);
		final long l = i_4_ * 1000000L;
		aLong2254 += method741();
		if ((aLong2254 ^ 0xffffffffffffffffL) > (aLong2255 ^ 0xffffffffffffffffL)) {
			PacketBuffer.sleepWrapper((aLong2255 - aLong2254) / 1000000L);
			aLong2258 += -aLong2254 + aLong2255;
			aLong2254 += aLong2255 + -aLong2254;
			aLong2255 += l;
			return 1;
		}
		int i_5_ = 0;
		do {
			aLong2255 += l;
		} while (++i_5_ < 10 && (aLong2255 ^ 0xffffffffffffffffL) > (aLong2254 ^ 0xffffffffffffffffL));
		if (aLong2255 < aLong2254) {
			aLong2255 = aLong2254;
		}
		return i_5_;
	}

	@Override
	final void method738() {
		aLong2258 = 0L;
		if ((aLong2255 ^ 0xffffffffffffffffL) < (aLong2254 ^ 0xffffffffffffffffL)) {
			aLong2254 += -aLong2254 + aLong2255;
		}
	}
}
