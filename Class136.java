/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class136 {
	static int[] anIntArray1315 = new int[100];
	static String aString1316;
	static boolean aBoolean1317 = false;
	static int defaultWorldId;
	static Random aRandom1319;
	static volatile int mouseIdleCycle;
	static int anInt1321;

	static {
		aString1316 = "glow3:";
		defaultWorldId = 1;
		aRandom1319 = new Random();
		mouseIdleCycle = 0;
	}

	static final String longToString(long l) {
		if (-1L <= (l ^ 0xffffffffffffffffL) || -6582952005840035282L >= (l ^ 0xffffffffffffffffL)) {
			return null;
		}
		if ((l % 37L ^ 0xffffffffffffffffL) == -1L) {
			return null;
		}
		int i = 0;
		for (long l_0_ = l; 0L != l_0_; l_0_ /= 37L) {
			i++;
		}
		final StringBuffer stringbuffer = new StringBuffer(i);
		while (-1L != (l ^ 0xffffffffffffffffL)) {
			final long l_1_ = l;
			l /= 37L;
			char c = Class120_Sub12_Sub16.aCharArray3254[(int) (-(l * 37L) + l_1_)];
			if (c == '_') {
				c = '\u00a0';
				final int i_2_ = stringbuffer.length() - 1;
				stringbuffer.setCharAt(i_2_, Character.toUpperCase(stringbuffer.charAt(i_2_)));
			}
			stringbuffer.append(c);
		}
		stringbuffer.reverse();
		stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
		return stringbuffer.toString();
	}

	static final void addObjectPile(final int level, final int x, final int z, final int y, final SceneGraphNode sceneGraphNode, final long l, final SceneGraphNode class180_6_, final SceneGraphNode class180_7_) {
		final ObjectPile objectPile = new ObjectPile();
		objectPile.mainItemModel = sceneGraphNode;
		objectPile.renderX = x * 128 + 64;
		objectPile.renderZ = z * 128 + 64;
		objectPile.renderY = y;
		objectPile.bitPacked = l;
		objectPile.secondItemModel = class180_6_;
		objectPile.thirdItemModel = class180_7_;
		int locHeight = 0;
		final GroundTile groundTile = Class120_Sub1.groundTiles[level][x][z];
		if (groundTile != null) {
			for (int i_9_ = 0; i_9_ < groundTile.anInt2638; i_9_++) {
				final Class28 class28 = groundTile.aClass28Array2625[i_9_];
				if ((class28.bitPacked & 0x400000L) == 4194304L) {
					final int maxY = class28.aClass180_174.getMaxY();
					if (maxY != -32768 && maxY < locHeight) {
						locHeight = maxY;
					}
				}
			}
		}
		objectPile.yLocationModifier = -locHeight;
		if (Class120_Sub1.groundTiles[level][x][z] == null) {
			Class120_Sub1.groundTiles[level][x][z] = new GroundTile(level, x, z);
		}
		Class120_Sub1.groundTiles[level][x][z].objectPile = objectPile;
	}

	public static void method1979(final int i) {
		try {
			aString1316 = null;
			if (i != 64) {
				addObjectPile(-90, -53, -118, 99, null, -12L, null, null);
			}
			aRandom1319 = null;
			anIntArray1315 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pn.B(").append(i).append(')').toString());
		}
	}
}
