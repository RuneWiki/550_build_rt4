/* Class101_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub3 extends Class101 {
	static String aString2285 = "Drop";
	private final int anInt2287;
	private final int anInt2288;
	private int anInt2289;
	static LDSprite aClass120_Sub14_Sub19_Sub2_2290;
	static boolean titleScreenSpritesDrawn;
	private final int anInt2292;

	public static void method847(final int i) {
		try {
			SeqType.aClass50_2286 = null;
			if (i == -1) {
				aClass120_Sub14_Sub19_Sub2_2290 = null;
				aString2285 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gg.I(").append(i).append(')').toString());
		}
	}

	@Override
	final void method833(final int i, final int i_0_) {
		final int i_2_ = anInt2287 * i >> 12;
		final int i_3_ = i_0_ * anInt2289 >> 12;
		final int i_4_ = anInt2288 * i >> 12;
		final int i_5_ = anInt2292 * i_0_ >> 12;
		GroundObjectNode.method1627(i_2_, this.anInt964, this.anInt960, this.anInt959, i_5_, i_4_, i_3_);
	}

	@Override
	final void method837(final int i, final int i_6_) {
		final int i_7_ = i * anInt2287 >> 12;
		final int i_8_ = anInt2288 * i >> 12;
		final int i_9_ = anInt2289 * i_6_ >> 12;
		final int i_10_ = i_6_ * anInt2292 >> 12;
		Class158.method2090(i_7_, this.anInt964, i_9_, this.anInt959, i_10_, i_8_);
	}

	static final void method848() {
		for (int id = -1; id < FileSystemWorker.localPlayerCount; id++) {
			int index;
			if (id == -1) {
				index = 2047;
			} else {
				index = Class112.playerIndices[id];
			}
			final Player player = Class118.playersList[index];
			if (player != null) {
				Class120_Sub12_Sub9.method1245(player, player.getSize());
			}
		}
	}

	Class101_Sub3(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		super(i_16_, i_17_, i_18_);
		anInt2288 = i_14_;
		anInt2292 = i_15_;
		anInt2287 = i;
		anInt2289 = i_13_;
	}

	@Override
	final void method834(final int i_19_, final int i_20_) {
		final int i_21_ = i_19_ * anInt2287 >> 12;
		final int i_22_ = i_19_ * anInt2288 >> 12;
		final int i_23_ = i_20_ * anInt2289 >> 12;
		final int i_24_ = anInt2292 * i_20_ >> 12;
		Class120_Sub12_Sub22.method1321(i_21_, i_24_, i_22_, i_23_, this.anInt960);
	}
}
