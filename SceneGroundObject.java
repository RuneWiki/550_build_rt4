/* Class180_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SceneGroundObject extends SceneGraphNode {
	static int spriteTrimHeight;
	private int maxY = -32768;
	static int componentPressedCycles;
	static HDTile[][] surfaceHdTiles;
	int amount;
	int id;
	static boolean packetSetFlagPosition;
	
	static {
		packetSetFlagPosition = true;
	}

	@Override
	final int getMaxY() {
		return maxY;
	}

	@Override
	final void render(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final long l, final int i_7_, final ParticleEngine class108_sub2) {
		final AbstractModelRenderer class180_sub7 = ObjType.list(this.id).method2105(0, this.amount, -1, null, null, 0);
		if (class180_sub7 != null) {
			class180_sub7.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, class108_sub2);
			maxY = class180_sub7.getMaxY();
		}
	}

	static final void method2276() {
		ParticleEngine.process(Class101_Sub2.clientClock);
		if (Class69.rootInterfaceId != -1) {
			AbstractGraphicsBuffer.animateInterface(Class69.rootInterfaceId);
		}
		for (int id = 0; id < SeqFrameBase.screenRedrawPos; id++) {
			if (MasterIndexInfo.needInterfaceRedrawWrapper[id]) {
				Class120_Sub12_Sub33.needScreenRedraw[id] = true;
			}
			Class9.needInterfaceRedraw[id] = MasterIndexInfo.needInterfaceRedrawWrapper[id];
			MasterIndexInfo.needInterfaceRedrawWrapper[id] = false;
		}
		GZIPDecompressor.anInt796 = Class101_Sub2.clientClock;
		StructType.mouseOverInventoryInterface = null;
		LookupTable.gameScreenDrawX = -1;
		if (HDToolkit.glEnabled) {
			Class167.clearDepthBuffer = true;
		}
		StructType.gameScreenDrawY = -1;
		if (Class69.rootInterfaceId != -1) {
			SeqFrameBase.screenRedrawPos = 0;
			LookupTable.method486();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect();
		} else {
			GraphicsLD.clipRect();
		}
		Class120_Sub12_Sub22.redrawRate = 0;
	}

	@Override
	final void preRender(final int rotation, final int i_9_, final int i_11_, final int i_10_, final int i_12_) {
		/* empty */
	}

}
