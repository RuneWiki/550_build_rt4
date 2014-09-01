/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54 {
	static int[] anIntArray488 = new int[2];
	static String aString489 = " from your friend list first.";
	static AbstractSprite[] aClass120_Sub14_Sub19Array490;
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

	static final Class137 method478(final js5 js5, final String string, final boolean bool) {
		final int groupId = js5.getGroupId(string);
		if (groupId == -1) {
			return new Class137(0);
		}
		final int[] fileIds = js5.getFileIds(groupId);
		final Class137 class137_3_ = new Class137(fileIds.length);
		int i_4_ = 0;
		int i_5_ = 0;
		while (i_4_ < class137_3_.anInt1325) {
			final Buffer class120_sub7 = new Buffer(js5.getFile(groupId, fileIds[i_5_++]));
			final int i_6_ = class120_sub7.getInt();
			final int i_7_ = class120_sub7.getUShort();
			final int i_8_ = class120_sub7.getUByte();
			if (!bool && i_8_ == 1) {
				class137_3_.anInt1325--;
			} else {
				class137_3_.anIntArray1322[i_4_] = i_6_;
				class137_3_.aClass120_Sub14_Sub5Array1324[i_4_] = new MapFunctionNode();
				class137_3_.aClass120_Sub14_Sub5Array1324[i_4_].id = i_7_;
				i_4_++;
			}
		}
		return class137_3_;
	}

	static final void method479() {
		Class118.aClass107Array1138 = null;
		Class33.smallFont2 = null;
		Class82.aClass107Array785 = null;
		Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168 = null;
		Class120_Sub12_Sub30.crossSprites = null;
		Class120_Sub12_Sub20.plainFont = null;
		AnimatedLocation.aClass120_Sub14_Sub19Array3073 = null;
		FileSystemRequest.prayerIconSprites = null;
		Class120_Sub12_Sub22.boldFont = null;
		aClass120_Sub14_Sub19Array490 = null;
		ObjectCache.smallFont = null;
		Class157.compassSprite = null;
		SeqType.aClass120_Sub14_Sub19Array335 = null;
		Class69_Sub2.aClass120_Sub14_Sub19Array2237 = null;
		Class101_Sub1.aClass120_Sub14_Sub19Array2274 = null;
		Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167 = null;
		Class69_Sub2.aClass120_Sub14_Sub19Array2238 = null;
	}

	static final void method480() {
		Class120_Sub30_Sub1.method1739();
		System.gc();
		ProjectileNode.setGameState(25);
	}

	public static void method481(final int i) {
		try {
			aString489 = null;
			EnumType.recentUse = null;
			if (i < 124) {
				method477(null);
			}
			aClass120_Sub14_Sub19Array490 = null;
			anIntArray488 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gd.D(").append(i).append(')').toString());
		}
	}

	static final void redrawScreen(final int x, final int y, final int widght, final int height) {
		for (int id = 0; LabelGroup.screenRedrawPos > id; id++) {
			if (Class120_Sub16.screenRedrawWidhts[id] + GrandExchangeObject.screenRedrawXs[id] > x && GrandExchangeObject.screenRedrawXs[id] < x + widght && y < Class120_Sub12_Sub38.screenRedrawYs[id] - -Class69_Sub3_Sub1.screenRedrawHeights[id] && height + y > Class120_Sub12_Sub38.screenRedrawYs[id]) {
				Class120_Sub12_Sub33.needScreenRedraw[id] = true;
			}
		}
	}

	static final void method483(final js5 js5, final byte i) {
		try {
			if (i < -97) {
				Class145.aClass50_678 = js5;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gd.E(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
