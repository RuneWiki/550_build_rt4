/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SkillsConstants {
	static int[] skillsXpForLevel = new int[99];
	static boolean[] aBooleanArray1723 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
	
	static {
		int base = 0;
		
		for (int level = 0; level < 99; level++) {
			final int nextLevel = 1 + level;
			final int baseMod = (int) (Math.pow(2.0, nextLevel / 7.0) * 300.0 + nextLevel);
			base += baseMod;
			skillsXpForLevel[level] = base / 4;
		}
	}

}
