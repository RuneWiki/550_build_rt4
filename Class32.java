/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

final class Class32 {
	private boolean aBoolean251 = false;
	int anInt252;
	private int rotation;
	static int anInt254;
	int anInt255;
	static JagexInterface aClass189_256;
	int anInt257;
	int anInt258;
	static int anInt259;
	static int anInt260;
	int anInt261;
	int anInt262;
	static int[] anIntArray263 = { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
	int anInt264 = 0;
	int anInt265;
	int anInt266;
	int anInt267 = 0;
	int anInt268;
	static int anInt269;
	static int p11fullId;
	long aLong271;
	static int anInt272;

	static {
		anInt260 = 0;
		anInt269 = 0;
		anInt272 = 0;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			rotation = buffer.getUShort();
		} else if (code == 2) {
			buffer.getUByte();
		} else if (code == 3) {
			this.anInt257 = buffer.getInt();
			this.anInt261 = buffer.getInt();
			this.anInt252 = buffer.getInt();
		} else if (code == 4) {
			this.anInt255 = buffer.getUByte();
			this.anInt268 = buffer.getInt();
		} else if (code == 6) {
			this.anInt266 = buffer.getUByte();
		} else if (code == 8) {
			this.anInt267 = 1;
		} else if (code == 9) {
			this.anInt264 = 1;
		} else if (code == 10) {
			aBoolean251 = true;
		}
	}

	static final String method270(final long l) {
		Class90.aCalendar844.setTime(new Date(l));
		final int i_1_ = Class90.aCalendar844.get(7);
		final int i_2_ = Class90.aCalendar844.get(5);
		final int i_3_ = Class90.aCalendar844.get(2);
		final int i_4_ = Class90.aCalendar844.get(1);
		final int i_5_ = Class90.aCalendar844.get(11);
		final int i_6_ = Class90.aCalendar844.get(12);
		final int i_7_ = Class90.aCalendar844.get(13);
		return new StringBuilder(Class69_Sub3.aStringArray2242[i_1_ - 1]).append(", ").append(i_2_ / 10).append(i_2_ % 10).append("-").append(ReflectionCheckNode.aStringArray2759[i_3_]).append("-").append(i_4_).append(" ").append(i_5_ / 10).append(i_5_ % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).append(" GMT").toString();
	}

	final void postDecode() {
		this.anInt265 = Rasterizer.cosTable[rotation];
		this.anInt262 = (int) Math.sqrt(this.anInt252 * this.anInt252 + this.anInt257 * this.anInt257 + this.anInt261 * this.anInt261);
		if (this.anInt268 == 0) {
			this.anInt268 = 1;
		}
		if (this.anInt255 == 0) {
			this.aLong271 = 2147483647L;
		} else if (this.anInt255 == 1) {
			this.aLong271 = this.anInt262 * 8 / this.anInt268;
			this.aLong271 *= this.aLong271;
		} else if (this.anInt255 == 2) {
			this.aLong271 = this.anInt262 * 8 / this.anInt268;
		}
		if (aBoolean251) {
			this.anInt262 *= -1;
		}
	}

	static final String method272(Throwable throwable) throws IOException {
		String string;
		if (!(throwable instanceof RuntimeException_Sub1)) {
			string = "";
		} else {
			final RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder(runtimeexception_sub1.aString2141).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable2146;
		}
		final StringWriter stringwriter = new StringWriter();
		final PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		final String string_8_ = stringwriter.toString();
		final BufferedReader bufferedreader = new BufferedReader(new StringReader(string_8_));
		final String string_9_ = bufferedreader.readLine();
		for (;;) {
			final String string_10_ = bufferedreader.readLine();
			if (string_10_ == null) {
				break;
			}
			final int i = string_10_.indexOf('(');
			final int i_11_ = string_10_.indexOf(')', 1 + i);
			String string_12_;
			if ((i ^ 0xffffffff) != 0) {
				string_12_ = string_10_.substring(0, i);
			} else {
				string_12_ = string_10_;
			}
			string_12_ = string_12_.trim();
			string_12_ = string_12_.substring(string_12_.lastIndexOf(' ') - -1);
			string_12_ = string_12_.substring(1 + string_12_.lastIndexOf('\t'));
			string = new StringBuilder(string).append(string_12_).toString();
			if ((i ^ 0xffffffff) != 0 && (i_11_ ^ 0xffffffff) != 0) {
				final int i_13_ = string_10_.indexOf(".java:", i);
				if (i_13_ >= 0) {
					string = new StringBuilder(string).append(string_10_.substring(5 + i_13_, i_11_)).toString();
				}
			}
			string = new StringBuilder(string).append(' ').toString();
		}
		string = new StringBuilder(string).append("| ").append(string_9_).toString();
		return string;
	}

	static final AbstractModelRenderer constructShadowModel(int shadowColor2, final SeqType seqType, int playerRotation, int entitySize, int colMod1, final AbstractModelRenderer playerModel, int frame, final int playerY, final int playerZ, boolean bool, int shadowColor1, final int colMod2, final int playerX) {
		final long uid = ((long) shadowColor1 << 32) + (colMod1 << 24) + (colMod2 << 16) + entitySize + ((long) shadowColor2 << 48);
		AbstractModelRenderer cachedModel = (AbstractModelRenderer) Class154.shadowModelCache.get(uid);
		if (cachedModel == null) {
			int vertexCount;
			if (entitySize == 1) {
				vertexCount = 9;
			} else if (entitySize == 2) {
				vertexCount = 12;
			} else if (entitySize == 3) {
				vertexCount = 15;
			} else if (entitySize == 4) {
				vertexCount = 18;
			} else {
				vertexCount = 21;
			}
			final int[] shadowLayerSizes = { 64, 96, 128};
			final int[][] shadowVerticesIds = new int[3][vertexCount];
			final Model shadowModel = new Model(3 * vertexCount + 1, 2 * vertexCount * 3 - vertexCount, 0);//Makes a polygon
			final int vertexId = shadowModel.addVertex(0, 0, 0);
			for (int layerId = 0; layerId < 3; layerId++) {
				final int shadowLayerSize = shadowLayerSizes[layerId];
				//final int i_32_ = shadowLayerSize[layerId];
				for (int vId = 0; vId < vertexCount; vId++) {
					final int rotation = (vId << 11) / vertexCount;
					final int shadowX = Rasterizer.sinTable[rotation] * shadowLayerSize + playerX >> 16;
					final int shadowZ = Rasterizer.cosTable[rotation] * shadowLayerSize + playerZ >> 16;//Used to be i_32_, but no need?
					shadowVerticesIds[layerId][vId] = shadowModel.addVertex(shadowX, 0, shadowZ);
				}
			}
			for (int layerId = 0; layerId < 3; layerId++) {
				final int factor = (256 * layerId + 128) / 3;
				final int f1 = 256 - factor;
				final byte triangleAlpha = (byte) (factor * colMod1 + f1 * colMod2 >> 8);//TODO finish this?
				final short triangleColor = (short) ((0xfc0000 & factor * (shadowColor2 & 0xfc00) + f1 * (0xfc00 & shadowColor1)) + (0x38000 & (shadowColor2 & 0x380) * factor + f1 * (0x380 & shadowColor1)) + (0x7f00 & (shadowColor1 & 0x7f) * f1 + factor * (0x7f & shadowColor2)) >> 8);
				for (int vId = 0; vId < vertexCount; vId++) {
					if (layerId != 0) {
						shadowModel.addTriangle(shadowVerticesIds[layerId - 1][vId], shadowVerticesIds[layerId - 1][(1 + vId) % vertexCount], shadowVerticesIds[layerId][(vId + 1) % vertexCount], (byte) 1, triangleColor, triangleAlpha);
						shadowModel.addTriangle(shadowVerticesIds[layerId - 1][vId], shadowVerticesIds[layerId][(vId - -1) % vertexCount], shadowVerticesIds[layerId][vId], (byte) 1, triangleColor, triangleAlpha);
					} else {
						shadowModel.addTriangle(vertexId, shadowVerticesIds[0][(1 + vId) % vertexCount], shadowVerticesIds[0][vId], (byte) 1, triangleColor, triangleAlpha);
					}
				}
			}
			cachedModel = shadowModel.toRenderer(64, 768, -50, -10, -50);
			Class154.shadowModelCache.put(cachedModel, uid);
		}
		final int i_43_ = 64 * entitySize - 1;
		int minX = -i_43_;
		int maxX = i_43_;
		int minZ = -i_43_;
		int maxZ = i_43_;
		if (bool) {
			if (playerRotation > 128 && playerRotation < 896) {
				minX -= 128;
			}
			if (playerRotation > 1664 || playerRotation < 384) {
				minZ -= 128;
			}
			if (playerRotation > 1152 && playerRotation < 1920) {
				maxX += 128;
			}
			if (playerRotation > 640 && playerRotation < 1408) {
				maxZ += 128;
			}
		}
		int xBound1 = playerModel.getMaxX();
		int xBound2 = playerModel.getMinX();
		int zBound1 = playerModel.getMaxZ();
		int zBound2 = playerModel.getMinZ();
		if (xBound1 < minX) {
			xBound1 = minX;
		}
		if (xBound2 > maxX) {
			xBound2 = maxX;
		}
		if (zBound1 < minZ) {
			zBound1 = minZ;
		}
		if (zBound2 > maxZ) {
			zBound2 = maxZ;
		}
		FrameLoader frameLoader = null;
		if (seqType != null) {
			frame = seqType.frames[frame];
			frameLoader = FrameLoader.list(frame >> 16);
			frame &= 0xffff;
		}
		if (frameLoader == null) {
			cachedModel = cachedModel.method2381(true, true, true);
			cachedModel.resize((xBound2 - xBound1) / 2, 128, (zBound2 - zBound1) / 2);
			cachedModel.translate((xBound1 + xBound2) / 2, 0, (zBound1 + zBound2) / 2);
		} else {
			cachedModel = cachedModel.method2381(!frameLoader.method1578(frame), !frameLoader.method1579(frame), true);
			cachedModel.resize((xBound2 - xBound1) / 2, 128, (zBound2 - zBound1) / 2);
			cachedModel.translate((xBound2 + xBound1) / 2, 0, (zBound1 + zBound2) / 2);
			cachedModel.method2389(frameLoader, frame);//animate
		}
		if (playerRotation != 0) {
			cachedModel.rotateY(playerRotation);
		}
		//Blend the shadow model to the ground.
		if (HDToolkit.glEnabled) {
			final HDModelRenderer modelRenderer = (HDModelRenderer) cachedModel;
			if (playerY != Class22.getTileHeight(playerX + xBound1, playerZ + zBound1, Class173.gameLevel) || Class22.getTileHeight(playerX + xBound2, playerZ + zBound2, Class173.gameLevel) != playerY) {
				for (int vertexId = 0; vertexId < modelRenderer.vertexCount; vertexId++) {
					modelRenderer.yVertices[vertexId] += Class22.getTileHeight(playerX + modelRenderer.xVertices[vertexId], playerZ + modelRenderer.zVertices[vertexId], Class173.gameLevel) - playerY;
				}
				modelRenderer.aClass49_3847.aBoolean439 = false;
				modelRenderer.modelBounds.boundsCalculated = false;
			}
		} else {
			final LDModelRenderer modelRenderer = (LDModelRenderer) cachedModel;
			if (playerY != Class22.getTileHeight(playerX + xBound1, playerZ + zBound1, Class173.gameLevel) || playerY != Class22.getTileHeight(playerX + xBound2, playerZ + zBound2, Class173.gameLevel)) {
				for (int vertexId = 0; vertexId < modelRenderer.vertexCount; vertexId++) {
					modelRenderer.yVertices[vertexId] += Class22.getTileHeight(playerX + modelRenderer.xVertices[vertexId], playerZ + modelRenderer.zVertices[vertexId], Class173.gameLevel) - playerY;
				}
				modelRenderer.boundsCalculated = false;
			}
		}
		return cachedModel;
	}

	public Class32() {
		/* empty */
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final Class32 list(final int id) {
		Class32 class32 = (Class32) SceneGroundObject.aClass21_2841.get(id);
		if (class32 != null) {
			return class32;
		}
		final byte[] is = Class49.aClass50_440.getFile(1, id);
		class32 = new Class32();
		class32.anInt258 = id;
		if (is != null) {
			class32.decode(new Buffer(is));
		}
		class32.postDecode();
		if (class32.anInt266 == 2 && GroundTile.aClass75_2643.get(id) == null) {
			GroundTile.aClass75_2643.put(new IntegerNode(Class30.anInt236), id);
			Class154.aClass32Array1437[Class30.anInt236++] = class32;
		}
		SceneGroundObject.aClass21_2841.put(class32, id);
		return class32;
	}
}
