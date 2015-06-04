/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
	static js5 aClass50_1907;
	static int anInt1908;
	static HintIcon[] hintIcons = new HintIcon[8];

	static {
		anInt1908 = 0;
	}

	static final Class101_Sub1 method2475(final Buffer buffer) {
		return new Class101_Sub1(buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getMedium(), buffer.getMedium(), buffer.getUByte());
	}

	static final AbstractSprite getObjectSprite(final PlayerAppearance playerAppearance, final int objCount, final int outlineType, final int objId, final int shadow, final boolean drawCount) {
		final int uid1 = (drawCount ? 65536 : 0) + objId + (outlineType << 17) + (shadow << 19);
		final long uid = 3147483667L * objCount + 3849834839L * uid1;
		AbstractSprite cachedSprite = (AbstractSprite) SpotAnimation.objectSpriteCache.get(uid);
		if (cachedSprite != null) {
			return cachedSprite;
		}
		Rasterizer.aBoolean974 = false;
		cachedSprite = Class120_Sub12_Sub6.constructObjectSprite(playerAppearance, outlineType, objCount, shadow, objId, drawCount, false, false);
		if (cachedSprite != null && !Rasterizer.aBoolean974) {
			SpotAnimation.objectSpriteCache.put(cachedSprite, uid);
		}
		return cachedSprite;
	}

	static final void setDefaultChunksAtmosphere() {
		if (Identikit.chunksAtmosphere != null) {
			final ChunkAtmosphere class191 = new ChunkAtmosphere();
			for (int x = 0; x < 13; x++) {
				for (int z = 0; z < 13; z++) {
					Identikit.chunksAtmosphere[x][z] = class191;
				}
			}
		}
	}

	static final void method2479(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(3, i);
		class120_sub14_sub7.method1453();
	}
}
