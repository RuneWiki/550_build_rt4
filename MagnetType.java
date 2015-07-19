/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

final class MagnetType {
	private boolean invertDirectionLength = false;
	int localDirectionZ;
	private int rotation;
	static int anInt254;
	int effectType;
	static JagexInterface pressedInventoryComponent;
	int localDirectionX;
	int id;
	static int anInt259;
	static int anInt260;
	int localDirectionY;
	int directionLength;
	static int[] anIntArray263 = { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
	int constantStrength = 0;
	int rotCos;
	int visibility;
	int constantSpeed = 0;
	int strength;
	static int anInt269;
	static int p11fullId;
	long maxRange;
	static js5 aClass50_440;
	static ObjectCache recentUse = new ObjectCache(64);
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
			this.localDirectionX = buffer.getInt();
			this.localDirectionY = buffer.getInt();
			this.localDirectionZ = buffer.getInt();
		} else if (code == 4) {
			this.effectType = buffer.getUByte();
			this.strength = buffer.getInt();
		} else if (code == 6) {
			this.visibility = buffer.getUByte();
		} else if (code == 8) {
			this.constantSpeed = 1;
		} else if (code == 9) {
			this.constantStrength = 1;
		} else if (code == 10) {
			invertDirectionLength = true;
		}
	}

	static final String formatDate(final long millis) {
		Class90.gmtCalendar.setTime(new Date(millis));
		final int dayOfWeek = Class90.gmtCalendar.get(7);
		final int dayOfMonth = Class90.gmtCalendar.get(5);
		final int month = Class90.gmtCalendar.get(2);
		final int year = Class90.gmtCalendar.get(1);
		final int hourOfDay = Class90.gmtCalendar.get(11);
		final int minute = Class90.gmtCalendar.get(12);
		final int second = Class90.gmtCalendar.get(13);
		return Class69_Sub3.daysOfWeek[dayOfWeek - 1] + ", " + (dayOfMonth / 10) + (dayOfMonth % 10) + "-" + ReflectionCheckNode.months[month] + "-" + year + " " + (hourOfDay / 10) + (hourOfDay % 10) + ":" + (minute / 10) + (minute % 10) + ":" + (second / 10) + (second % 10) + " GMT";
	}

	final void postDecode() {
		this.rotCos = Rasterizer.cosTable[rotation];
		this.directionLength = (int) Math.sqrt(this.localDirectionX * this.localDirectionX + this.localDirectionY * this.localDirectionY + this.localDirectionZ * this.localDirectionZ);
		if (this.strength == 0) {
			this.strength = 1;
		}
		if (this.effectType == 0) {
			this.maxRange = 2147483647L;
		} else if (this.effectType == 1) {
			this.maxRange = this.directionLength * 8 / this.strength;
			this.maxRange *= this.maxRange;
		} else if (this.effectType == 2) {
			this.maxRange = this.directionLength * 8 / this.strength;
		}
		if (invertDirectionLength) {
			this.directionLength *= -1;
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
						shadowModel.addFace(shadowVerticesIds[layerId - 1][vId], shadowVerticesIds[layerId - 1][(1 + vId) % vertexCount], shadowVerticesIds[layerId][(vId + 1) % vertexCount], (byte) 1, triangleColor, triangleAlpha);
						shadowModel.addFace(shadowVerticesIds[layerId - 1][vId], shadowVerticesIds[layerId][(vId - -1) % vertexCount], shadowVerticesIds[layerId][vId], (byte) 1, triangleColor, triangleAlpha);
					} else {
						shadowModel.addFace(vertexId, shadowVerticesIds[0][(1 + vId) % vertexCount], shadowVerticesIds[0][vId], (byte) 1, triangleColor, triangleAlpha);
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
		FrameGroup frameLoader = null;
		if (seqType != null) {
			frame = seqType.frames[frame];
			frameLoader = FrameGroup.list(frame >> 16);
			frame &= 0xffff;
		}
		if (frameLoader == null) {
			cachedModel = cachedModel.method2381(true, true, true);
			cachedModel.scale((xBound2 - xBound1) / 2, 128, (zBound2 - zBound1) / 2);
			cachedModel.translate((xBound1 + xBound2) / 2, 0, (zBound1 + zBound2) / 2);
		} else {
			cachedModel = cachedModel.method2381(!frameLoader.method1578(frame), !frameLoader.method1579(frame), true);
			cachedModel.scale((xBound2 - xBound1) / 2, 128, (zBound2 - zBound1) / 2);
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

	public MagnetType() {
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

	static final MagnetType list(final int id) {
		MagnetType magnetType = (MagnetType) recentUse.get(id);
		if (magnetType != null) {
			return magnetType;
		}
		final byte[] data = aClass50_440.getFile(1, id);
		magnetType = new MagnetType();
		magnetType.id = id;
		if (data != null) {
			magnetType.decode(new Buffer(data));
		}
		magnetType.postDecode();
		if (magnetType.visibility == 2 && GroundTile.globalMagnets.get(id) == null) {
			GroundTile.globalMagnets.put(new IntegerNode(Class30.globalMagnetPos), id);
			Class154.globalMagnets[Class30.globalMagnetPos++] = magnetType;
		}
		recentUse.put(magnetType, id);
		return magnetType;
	}
}
