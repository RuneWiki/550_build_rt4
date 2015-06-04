/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LookupTable {
	static int[] mapFileIds;
	private final int[] identTable;
	static int gameScreenDrawX = -1;
	static int weight = 0;

	static final void method486() {
		AbstractIndexedSprite.aClass189Array1022 = null;
		Class43.method343(Class69.rootInterfaceId, 0, 0, 0, Class120_Sub12_Sub5.canvasHeight, 0, Class69_Sub1.canvasWidth, -1);
		if (AbstractIndexedSprite.aClass189Array1022 != null) {
			MapSceneType.method2008(AbstractIndexedSprite.aClass189Array1022, Class120_Sub12_Sub38.anInt3438, -1412584499, Normal.aClass189_161.redrawId, Class120_Sub12_Sub5.canvasHeight, Class69_Sub1.canvasWidth, 0, Class111.anInt1065, 0);
			AbstractIndexedSprite.aClass189Array1022 = null;
		}
	}

	final int lookupIdentifier(final int neededHash) {
		final int i_1_ = (identTable.length >> 1) - 1;
		int pos = neededHash & i_1_;
		for (;;) {
			final int hash = identTable[pos + pos + 1];
			if (hash == -1) {
				return -1;
			}
			if (identTable[pos + pos] == neededHash) {
				return hash;
			}
			pos = i_1_ & pos + 1;
		}
	}

	static final int method488() {
		return 6;
	}

	static final void clearInterfaceChanges() {
		QuickChatMessageType.interfaceChangeCache.clear();
		AbstractMouseWheelHandler.aClass177_114.clear();
		Class88.aClass177_831.clear();
	}

	LookupTable(final int[] hashes) {
		int size;
		for (size = 1; hashes.length + (hashes.length >> 1) >= size; size <<= 1) {
			/* empty */
		}
		identTable = new int[size + size];
		for (int id = 0; id < size + size; id++) {
			identTable[id] = -1;
		}
		for (int id = 0; id < hashes.length; id++) {
			int pos;
			for (pos = hashes[id] & size - 1; identTable[pos + pos + 1] != -1; pos = size - 1 & pos + 1) {
				/* empty */
			}
			identTable[pos + pos] = hashes[id];
			identTable[pos + pos + 1] = id;
		}
	}
}
