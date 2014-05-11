/* Class87_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NanoTimer extends AbstractTimer {
	private long aLong2248 = 0L;
	private long aLong2249 = 0L;
	private long aLong2250;
	private int anInt2251 = 0;
	private int anInt2252 = 1;
	private final long[] aLongArray2253 = new long[10];

	@Override
	final void method738(final int i) {
		aLong2250 = 0L;
		if (aLong2249 > aLong2248) {
			aLong2248 += aLong2249 - aLong2248;
		}
	}

	NanoTimer() {
		aLong2250 = 0L;
		aLong2248 = System.nanoTime();
		aLong2249 = System.nanoTime();
	}

	@Override
	final long method739(final int i) {
		if (i != 0) {
			method740((byte) -33);
		}
		return aLong2248;
	}

	private final long method740(final byte i) {
		final long l = System.nanoTime();
		final long l_0_ = -aLong2250 + l;
		aLong2250 = l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray2253[anInt2251] = l_0_;
			anInt2251 = (1 + anInt2251) % 10;
			if (anInt2252 < 1) {
				anInt2252++;
			}
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= anInt2252; i_2_++) {
			l_1_ += aLongArray2253[(10 + -i_2_ + anInt2251) % 10];
		}
		if (i < 126) {
			aLong2249 = -33L;
		}
		return l_1_ / anInt2252;
	}

	@Override
	final int sleep(final int i, final int i_4_) {
		PacketBuffer.sleepWrapper(i);
		final long l = i_4_ * 1000000L;
		aLong2248 += method740((byte) 127);
		if (aLong2249 <= aLong2248) {
			int i_5_ = 0;
			do {
				i_5_++;
				aLong2249 += l;
			} while (i_5_ < 10 && aLong2249 < aLong2248);
			if ((aLong2248 ^ 0xffffffffffffffffL) < (aLong2249 ^ 0xffffffffffffffffL)) {
				aLong2249 = aLong2248;
			}
			return i_5_;
		}
		PacketBuffer.sleepWrapper((-aLong2248 + aLong2249) / 1000000L);
		aLong2250 += aLong2249 - aLong2248;
		aLong2248 += -aLong2248 + aLong2249;
		aLong2249 += l;
		return 1;
	}
}
