/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class TimeUtil {
	private static long oldTime;
	private static long timeDiff;

	private TimeUtil() {
		/* empty */
	}

	public static final synchronized long getSafeTime() {
		final long currentTime = System.currentTimeMillis();
		if (currentTime < oldTime) {
			timeDiff += oldTime - currentTime;
		}
		oldTime = currentTime;
		return currentTime + timeDiff;
	}
}
