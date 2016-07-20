/* Class87_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class NanoTimer extends AbstractTimer {
	private long averageExecuteTime = 0L;
	private long nextSleepTime = 0L;
	private long oldTime;
	private int oldTimesPos = 0;
	private int divisor = 1;
	private long[] oldTimes = new long[10];

	@Override
	void method738() {
		oldTime = 0L;
		if (nextSleepTime > averageExecuteTime) {
			averageExecuteTime += nextSleepTime - averageExecuteTime;
		}
	}

	NanoTimer() {
		oldTime = 0L;
		averageExecuteTime = System.nanoTime();
		nextSleepTime = System.nanoTime();
	}

	@Override
	long getAverageExecuteTime() {
		return averageExecuteTime;
	}

	private long calcAverageExecuteTime() {
		long thisNanoTime = System.nanoTime();
		long timeDelta = thisNanoTime - oldTime;
		oldTime = thisNanoTime;
		if (timeDelta > -5000000000L && timeDelta < 5000000000L) {
			oldTimes[oldTimesPos] = timeDelta;
			oldTimesPos = (oldTimesPos + 1) % 10;
			if (divisor < 1) {
				divisor++;
			}
		}
		long oldTimesSum = 0L;
		for (int id = 1; id <= divisor; id++) {
			oldTimesSum += oldTimes[(10 - id + oldTimesPos) % 10];
		}
		return oldTimesSum / divisor;
	}

	@Override
	int sleep(int minSleepMs, int maxSleepMs) {
		PacketBuffer.sleepWrapper(minSleepMs);
		long maxSleepNs = maxSleepMs * 1000000L;
		averageExecuteTime += calcAverageExecuteTime();
		if (nextSleepTime > averageExecuteTime) {
			PacketBuffer.sleepWrapper((nextSleepTime - averageExecuteTime) / 1000000L);
			oldTime += nextSleepTime - averageExecuteTime;
			averageExecuteTime += nextSleepTime - averageExecuteTime;
			nextSleepTime += maxSleepNs;
			return 1;
		}
		int loopTimes = 0;
		do {
			loopTimes++;
			nextSleepTime += maxSleepNs;
		} while (loopTimes < 10 && nextSleepTime < averageExecuteTime);
		if (nextSleepTime < averageExecuteTime) {
			nextSleepTime = averageExecuteTime;
		}
		return loopTimes;
	}
}
