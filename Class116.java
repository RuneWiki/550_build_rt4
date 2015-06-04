/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116 {
	static int anInt1113 = 0;
	static AbstractSprite aClass120_Sub14_Sub19_1114;
	static int anInt1115;
	static int anInt1118;
	static int[][] anIntArrayArray1119 = { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	static final void handleWorldMapLogic() {
		if (!(WorldMapHandler.currentZoom < WorldMapHandler.wantedZoom)) {
			if (WorldMapHandler.currentZoom > WorldMapHandler.wantedZoom) {
				WorldMapHandler.currentZoom -= WorldMapHandler.currentZoom / 30.0;
				if (WorldMapHandler.currentZoom < WorldMapHandler.wantedZoom) {
					WorldMapHandler.currentZoom = WorldMapHandler.wantedZoom;
				}
				Class127.fixWorldMapBounds();
			}
		} else {
			WorldMapHandler.currentZoom += WorldMapHandler.currentZoom / 30.0;
			if (WorldMapHandler.currentZoom > WorldMapHandler.wantedZoom) {
				WorldMapHandler.currentZoom = WorldMapHandler.wantedZoom;
			}
			Class127.fixWorldMapBounds();
		}
		if (CanvasWrapper.anInt20 != -1 && Class120_Sub2.anInt2422 != -1) {
			int i_0_ = -ModelParticleMagnet.anInt1646 + Class120_Sub2.anInt2422;
			int i_1_ = -ParticleEmitter.anInt2336 + CanvasWrapper.anInt20;
			if (i_0_ < 2 || i_0_ > 2) {
				i_0_ >>= 4;
			}
			ModelParticleMagnet.anInt1646 -= -i_0_;
			if (i_1_ < 2 || i_1_ > 2) {
				i_1_ >>= 4;
			}
			if (i_1_ == 0 && i_0_ == 0) {
				Class120_Sub2.anInt2422 = -1;
				CanvasWrapper.anInt20 = -1;
			}
			ParticleEmitter.anInt2336 += i_1_;
			Class127.fixWorldMapBounds();
		}
		if (Class96.clickedMouseFunctionBlinksLeft > 0) {
			Class136.clickedMouseFunctionCycle--;
			if (Class136.clickedMouseFunctionCycle == 0) {
				Class96.clickedMouseFunctionBlinksLeft--;
				Class136.clickedMouseFunctionCycle = 100;
			}
		} else {
			Class127.anInt1215 = -1;
			Class120_Sub12_Sub9.clickedMouseFunctionId = -1;
		}
		if (EmitterType.mouseInsideWorldMap && MapFunctionType.aClass105_653 != null) {
			for (Class120_Sub16 class120_sub16 = (Class120_Sub16) MapFunctionType.aClass105_653.getFront(); class120_sub16 != null; class120_sub16 = (Class120_Sub16) MapFunctionType.aClass105_653.getNext()) {
				final MapFunctionType mapFunctionType = MapFunctionType.list(class120_sub16.mapFunctionNode.id);
				if (EnumType.anInt3450 != 0 || !class120_sub16.inBounds(Queue.lastMouseX, ChunkAtmosphere.lastMouseY)) {
					if (class120_sub16.mapFunctionNode.focused) {
						class120_sub16.mapFunctionNode.focused = false;
						Class112.method989(16, class120_sub16.mapFunctionNode.id, mapFunctionType.anInt652);//On function unfocus
					}
				} else {
					if (!class120_sub16.mapFunctionNode.focused) {
						class120_sub16.mapFunctionNode.focused = true;
						Class112.method989(15, class120_sub16.mapFunctionNode.id, mapFunctionType.anInt652);//On function focus
					}
					if (class120_sub16.mapFunctionNode.focused) {
						Class112.method989(17, class120_sub16.mapFunctionNode.id, mapFunctionType.anInt652);//On function focusing
					}
				}
			}
		}
	}

}
