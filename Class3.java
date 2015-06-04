/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3 {
	static int anInt53;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_54;
	static SignlinkNode openUrlRequest;

	static final void executePlayerAction(final String name, final int action) {
		final String formattedName = Class120_Sub12_Sub23.method1326(Class120_Sub6.method1068(name));
		boolean foundPlayer = false;
		for (int id = 0; id < FileSystemWorker.localPlayerCount; id++) {
			final Player player = Class118.playersList[Class112.playerIndices[id]];
			if (player != null && player.name != null && player.name.equalsIgnoreCase(formattedName)) {
				foundPlayer = true;
				if (action == 1) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(212);
					Class120_Sub12_Sub11.outputStream.putShortA(Class112.playerIndices[id]);
					Class120_Sub12_Sub11.outputStream.putByteA(0);
				} else if (action == 4) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(105);
					Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[id]);
					Class120_Sub12_Sub11.outputStream.putByte(0);
				} else if (action == 5) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(96);
					Class120_Sub12_Sub11.outputStream.putByteA(0);
					Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[id]);
				} else if (action == 6) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(77);
					Class120_Sub12_Sub11.outputStream.putLEShort(Class112.playerIndices[id]);
					Class120_Sub12_Sub11.outputStream.putByteS(0);
				} else if (action == 7) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(52);
					Class120_Sub12_Sub11.outputStream.putShort(Class112.playerIndices[id]);
					Class120_Sub12_Sub11.outputStream.putByte(0);
				}
				break;
			}
		}
		if (!foundPlayer) {
			AbstractRequest.pushMessage(StringLibrary.aString3062 + formattedName, "", 0);
		}
	}

	static final void method82() {
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final int index = Class120_Sub12_Sub36.npcIndices[id];
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			if (npc != null) {
				Class120_Sub12_Sub9.method1245(npc, npc.npcType.size);
			}
		}
	}

	static final int method83(final int i, final int i_10_, final int i_12_) {
		return i_10_ >= i ? i_10_ > i_12_ ? i_12_ : i_10_ : i;
	}

	static final void method84(final int levelSize, final int xSize, final int zSize, final int tileVisibility, final boolean hasUnderWaterMap) {
		WallDecoration.anInt1900 = xSize;
		Class120_Sub12_Sub38.anInt3440 = zSize;
		Class120_Sub14_Sub13.anInt3563 = tileVisibility;
		Class86.surfaceGroundTiles = new GroundTile[levelSize][WallDecoration.anInt1900][Class120_Sub12_Sub38.anInt3440];
		Class120_Sub12_Sub33.surfaceTileHeightMap = new int[levelSize][WallDecoration.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		if (HDToolkit.glEnabled) {
			SceneGroundObject.surfaceHdTiles = new HDTile[4][];
		}
		if (hasUnderWaterMap) {
			Class120_Sub12_Sub38.underWaterGroundTiles = new GroundTile[1][WallDecoration.anInt1900][Class120_Sub12_Sub38.anInt3440];
			NodeCache.anIntArrayArray300 = new int[WallDecoration.anInt1900][Class120_Sub12_Sub38.anInt3440];
			Class24.underWaterTileHeightMap = new int[1][WallDecoration.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
			if (HDToolkit.glEnabled) {
				IntegerNode.underWaterHdTiles = new HDTile[1][];
			}
		} else {
			Class120_Sub12_Sub38.underWaterGroundTiles = null;
			NodeCache.anIntArrayArray300 = null;
			Class24.underWaterTileHeightMap = null;
			IntegerNode.underWaterHdTiles = null;
		}
		Class178.setRenderTiles(false);
		SceneGraphNode.aClass188Array1782 = new Class188[500];
		Class49.anInt438 = 0;
		AnimatedLocation.aClass188Array3076 = new Class188[500];
		CursorType.anInt1237 = 0;
		JagexSocket.anIntArrayArrayArray419 = new int[levelSize][WallDecoration.anInt1900 + 1][Class120_Sub12_Sub38.anInt3440 + 1];
		Class111.aClass28Array1057 = new Class28[5000];
		ClientScript.anInt3556 = 0;
		client.aClass28Array323 = new Class28[100];
		SpotAnimType.aBooleanArrayArray992 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 1];
		ClanMember.aBooleanArrayArray2573 = new boolean[Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2][Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563 + 2];
		Class114.aByteArrayArrayArray1094 = new byte[levelSize][WallDecoration.anInt1900][Class120_Sub12_Sub38.anInt3440];
	}

	static final void smoothCamera() {
		for (int i = 0; i < 5; i++) {
			Class120_Sub12_Sub12.aBooleanArray3223[i] = false;
		}
		AbstractGraphicsBuffer.anInt1157 = -1;
		client.cameraType = 5;
		Class120_Sub12_Sub31.anInt3384 = 0;
		Class101_Sub1.anInt2272 = 0;
		Class120_Sub12_Sub15.anInt3248 = -1;
	}

	static final int[] method86(final int i, final int i_17_, final int i_18_, final float f, final int i_19_, final int i_20_, final boolean bool) {
		final int[] is_22_ = new int[i_19_];
		final Class120_Sub12_Sub12 class120_sub12_sub12 = new Class120_Sub12_Sub12();
		class120_sub12_sub12.anInt3221 = (int) (4096.0F * f);
		class120_sub12_sub12.anInt3228 = i_17_;
		class120_sub12_sub12.aBoolean3226 = bool;
		class120_sub12_sub12.anInt3229 = i;
		class120_sub12_sub12.anInt3222 = i_18_;
		class120_sub12_sub12.anInt3225 = i_20_;
		class120_sub12_sub12.postDecode();
		Class22.method199(i_19_, 1);
		class120_sub12_sub12.method1261(is_22_, 0);
		return is_22_;
	}

	static final void sendAccountCreationName(final long nameAsLong) {
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class120_Sub12_Sub11.outputStream.putByte(21);
		Class120_Sub12_Sub11.outputStream.putLong(nameAsLong);
		Class120_Sub12_Sub35.accountCreationReturnCode = -3;
		SpotAnimationNode.anInt3466 = 0;
		AbstractIndexedSprite.anInt1027 = 0;
		Class154.accountCreationStep = 1;
	}
}
