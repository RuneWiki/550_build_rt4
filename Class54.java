/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54 {
	static int[] anIntArray488 = new int[2];
	static String aString489 = " from your friend list first.";
	static AbstractSprite[] aClass120_Sub14_Sub19Array490;
	static Class35 aClass35_491 = new Class35(128);

	static final boolean method477(final byte[] data) {
		final Buffer buffer = new Buffer(data);
		final int i_0_ = buffer.getUByte();
		if (i_0_ != 1) {
			return false;
		}
		final boolean bool_1_ = buffer.getUByte() == 1;
		if (bool_1_) {
			Class43.decodeWorldListInfo(buffer);
		}
		Class140.updateWorldPlayers(buffer);
		return true;
	}

	static final Class137 method478(final Class50 class50, final int i, final String string, final boolean bool) {
		Class137 class137;
		try {
			final int i_2_ = class50.method432(false, string);
			if (i_2_ == -1) {
				return new Class137(0);
			}
			final int[] is = class50.method433(true, i_2_);
			final Class137 class137_3_ = new Class137(is.length);
			int i_4_ = 0;
			if (i != -2) {
				return null;
			}
			int i_5_ = 0;
			while (class137_3_.anInt1325 > i_4_) {
				final Buffer class120_sub7 = new Buffer(class50.getFile(i_2_, is[i_5_++]));
				final int i_6_ = class120_sub7.getInt();
				final int i_7_ = class120_sub7.getUShort();
				final int i_8_ = class120_sub7.getUByte();
				if (!bool && i_8_ == 1) {
					class137_3_.anInt1325--;
				} else {
					class137_3_.anIntArray1322[i_4_] = i_6_;
					class137_3_.aClass120_Sub14_Sub5Array1324[i_4_] = new Class120_Sub14_Sub5();
					class137_3_.aClass120_Sub14_Sub5Array1324[i_4_].anInt3473 = i_7_;
					i_4_++;
				}
			}
			class137 = class137_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gd.A(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
		return class137;
	}

	static final void method479(final int i) {
		try {
			Class118.aClass107Array1138 = null;
			Class33.aClass120_Sub14_Sub8_Sub2_274 = null;
			Class82.aClass107Array785 = null;
			Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168 = null;
			Class120_Sub12_Sub30.crossSprites = null;
			Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286 = null;
			Class180_Sub6.aClass120_Sub14_Sub19Array3073 = null;
			Class120_Sub14_Sub14_Sub1.prayerIconSprites = null;
			Class120_Sub12_Sub22.boldFont = null;
			aClass120_Sub14_Sub19Array490 = null;
			Cache.aClass120_Sub14_Sub8_121 = null;
			Class157.aClass120_Sub14_Sub19_1474 = null;
			SeqType.aClass120_Sub14_Sub19Array335 = null;
			Class69_Sub2.aClass120_Sub14_Sub19Array2237 = null;
			Class101_Sub1.aClass120_Sub14_Sub19Array2274 = null;
			Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167 = null;
			Class69_Sub2.aClass120_Sub14_Sub19Array2238 = null;
			if (i != 0) {
				method480(46);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gd.B(").append(i).append(')').toString());
		}
	}

	static final void method480(final int i) {
		try {
			Class120_Sub30_Sub1.method1739(false, (byte) -93);
			System.gc();
			Class120_Sub14_Sub1.setGameState(25);
			if (i >= -30) {
				aString489 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gd.F(").append(i).append(')').toString());
		}
	}

	public static void method481(final int i) {
		try {
			aString489 = null;
			aClass35_491 = null;
			if (i < 124) {
				method477(null);
			}
			aClass120_Sub14_Sub19Array490 = null;
			anIntArray488 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gd.D(").append(i).append(')').toString());
		}
	}

	static final void method482(final int i, final int i_9_, final int i_10_, final int i_12_) {
		for (int i_13_ = 0; Class120_Sub1.anInt2414 > i_13_; i_13_++) {
			if (Class120_Sub16.anIntArray2608[i_13_] + Class160.anIntArray1495[i_13_] > i && Class160.anIntArray1495[i_13_] < i + i_12_ && i_9_ < Class120_Sub12_Sub38.anIntArray3441[i_13_] - -Class69_Sub3_Sub1.anIntArray3081[i_13_] && i_10_ + i_9_ > Class120_Sub12_Sub38.anIntArray3441[i_13_]) {
				Class120_Sub12_Sub33.aBooleanArray3391[i_13_] = true;
			}
		}
	}

	static final void method483(final Class50 class50, final byte i) {
		try {
			if (i < -97) {
				Class76.aClass50_678 = class50;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gd.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
