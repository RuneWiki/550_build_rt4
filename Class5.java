/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class5 implements ShaderInterface {
	private boolean aBoolean2151 = false;
	static short[] aShortArray2152;
	static int clickedInventoryIndex = 0;
	private int anInt2156 = -1;
	static int mapSceneGreenColorModifier;
	
	static {
		aShortArray2152 = new short[] { -10304, 9104, -1, -1, -1 };
	}

	static final void spawnGroundObject(final int x, final int z) {
		final Deque deque = ClientScript.groundObjects[Class173.gameLevel][x][z];
		if (deque == null) {
			AnimatedLocation.resetObjectPile(Class173.gameLevel, x, z);
		} else {
			int highestValue = -99999999;
			GroundObjectNode mainObject = null;
			for (GroundObjectNode object = (GroundObjectNode) deque.getFront(); object != null; object = (GroundObjectNode) deque.getNext()) {
				final ObjType objType = ObjType.list(object.sceneGroundObject.id);
				int cost = objType.cost;
				if (objType.stackable == 1) {
					cost *= object.sceneGroundObject.amount - -1;
				}
				if (highestValue< cost) {
					highestValue = cost;
					mainObject = object;
				}
			}
			if (mainObject == null) {
				AnimatedLocation.resetObjectPile(Class173.gameLevel, x, z);
			} else {
				deque.addFront(mainObject);
				SceneGroundObject thirdObject = null;
				SceneGroundObject secondObject = null;
				for (GroundObjectNode object = (GroundObjectNode) deque.getFront(); object != null; object = (GroundObjectNode) deque.getNext()) {
					final SceneGroundObject class180_sub1_6_ = object.sceneGroundObject;
					if (mainObject.sceneGroundObject.id != class180_sub1_6_.id) {
						if (secondObject == null) {
							secondObject = class180_sub1_6_;
						}
						if (secondObject.id != class180_sub1_6_.id && thirdObject == null) {
							thirdObject = class180_sub1_6_;
						}
					}
				}
				final long bitPacked = 0x60000000 + x + (z << 7);
				Class136.addObjectPile(Class173.gameLevel, x, z, Class22.getTileHeight(64 + x * 128, 64 + 128 * z, Class173.gameLevel), mainObject.sceneGroundObject, bitPacked, secondObject, thirdObject);
			}
		}
	}

	static final void method98(final int level) {
		Class190.renderFromLevel = level;
		for (int x = 0; x < WallDecoration.mapSizeX; x++) {
			for (int z = 0; z < Class120_Sub12_Sub38.mapSizeZ; z++) {
				if (SeqFrameBase.activeGroundTiles[level][x][z] == null) {
					SeqFrameBase.activeGroundTiles[level][x][z] = new GroundTile(level, x, z);
				}
			}
		}
	}

	@Override
	public final void method3() {
		//2714 5335 0
		final GL gl = HDToolkit.gl;
		HDToolkit.method521(1);
		if (Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297 != null && anInt2156 >= 0 && Class120_Sub12_Sub6.highLightingDetail) {
			gl.glCallList(anInt2156);
			gl.glActiveTexture(33985);
			Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297.method1494();
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glRotatef(-(360.0F * SkyboxType.renderYawWrapper) / 2048.0F, 0.0F, 1.0F, 0.0F);
			gl.glRotatef(-(360.0F * Class120_Sub14_Sub13.renderPitchWrapper) / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glScalef(-1.0F, 1.0F, 1.0F);
			gl.glMatrixMode(5888);
			gl.glActiveTexture(33984);
			aBoolean2151 = true;
		} else {
			gl.glTexEnvi(8960, 34184, 34167);
		}
	}

	@Override
	public final void method2() {
		final GL gl = HDToolkit.gl;
		if (aBoolean2151) {
			gl.glCallList(anInt2156 + 1);
			aBoolean2151 = false;
		} else {
			gl.glTexEnvi(8960, 34184, 5890);
		}
	}

	@Override
	public final int method4() {
		return 4;
	}

	@Override
	public final void method5(final int i) {
	}

	public Class5() {
		if (HDToolkit.aBoolean514) {
			final GL gl = HDToolkit.gl;
			anInt2156 = gl.glGenLists(2);
			gl.glNewList(anInt2156, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 34165);
			gl.glTexEnvi(8960, 34178, 34168);
			gl.glTexEnvi(8960, 34162, 7681);
			gl.glTexEnvi(8960, 34184, 34167);
			gl.glTexGeni(8192, 9472, 34066);
			gl.glTexGeni(8193, 9472, 34066);
			gl.glTexGeni(8194, 9472, 34066);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(34067);
			gl.glActiveTexture(33984);
			gl.glEndList();
			gl.glNewList(anInt2156 + 1, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34178, 34166);
			gl.glTexEnvi(8960, 34162, 8448);
			gl.glTexEnvi(8960, 34184, 5890);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			gl.glActiveTexture(33984);
			gl.glEndList();
		}
	}
}
