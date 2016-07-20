/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54 {
	static int[] anIntArray488 = new int[2];
	static AbstractSprite[] pkIconSprites;
	
	static final boolean decodedWorldInformation(final byte[] data) {
		final Buffer buffer = new Buffer(data);
		final int exist = buffer.getUByte();
		if (exist != 1) {
			return false;
		}
		final boolean decodeInformation = buffer.getUByte() == 1;
		if (decodeInformation) {
			Class43.decodeWorldListInfo(buffer);
		}
		Class140.decodeWorldPlayers(buffer);
		return true;
	}

	static final MapFunctionGroup createMapFunctionGroup(final js5 js5, final String groupName, final boolean membersClient) {
		final int groupId = js5.getGroupId(groupName);
		if (groupId == -1) {
			return new MapFunctionGroup(0);
		}
		final int[] fileIds = js5.getFileIds(groupId);
		final MapFunctionGroup mapFunctionGroup = new MapFunctionGroup(fileIds.length);
		int fileId = 0;
		for (int id = 0; id < mapFunctionGroup.length; id++) {
			final Buffer buffer = new Buffer(js5.getFile(groupId, fileIds[fileId++]));
			final int coords = buffer.getInt();
			final int functionId = buffer.getUShort();
			final int members = buffer.getUByte();
			if (!membersClient && members == 1) {
				mapFunctionGroup.length--;
			} else {
				mapFunctionGroup.coordinates[id] = coords;
				mapFunctionGroup.nodes[id] = new MapFunctionNode();
				mapFunctionGroup.nodes[id].id = functionId;
			}
		}
		return mapFunctionGroup;
	}

	static final void method479() {
		Class118.scrollBarSprites = null;
		Class33.smallFont2 = null;
		Class82.nameIconSprites = null;
		Class120_Sub12_Sub6.mapDotSprites = null;
		Class120_Sub12_Sub30.crossSprites = null;
		Class120_Sub12_Sub20.plainFont = null;
		AnimatedLocation.hintHeadIconsSprites = null;
		FileSystemRequest.prayerIconSprites = null;
		Class120_Sub12_Sub22.boldFont = null;
		pkIconSprites = null;
		ObjectCache.smallFont = null;
		Class157.compassSprite = null;
		SeqType.hitBarDefaultSprites = null;
		Class69_Sub2.hintMapEdgeSprites = null;
		Class101_Sub1.mapFlagSprites = null;
		Class120_Sub12_Sub5.hintMapMarkerSprites = null;
		Class69_Sub2.hitMarkSprites = null;
	}

	static final void method480() {
		Class120_Sub30_Sub1.method1739();
		System.gc();
		ProjectileNode.setGameState(25);
	}

	static final void redrawScreen(final int x, final int y, final int widght, final int height) {
		for (int id = 0; SeqFrameBase.screenRedrawPos > id; id++) {
			if (Class120_Sub16.screenRedrawWidhts[id] + GrandExchangeObject.screenRedrawXs[id] > x && GrandExchangeObject.screenRedrawXs[id] < x + widght && y < Class120_Sub12_Sub38.screenRedrawYs[id] - -Class69_Sub3_Sub1.screenRedrawHeights[id] && height + y > Class120_Sub12_Sub38.screenRedrawYs[id]) {
				Class120_Sub12_Sub33.needScreenRedraw[id] = true;
			}
		}
	}
}
