/* Class120_Sub12_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

import javax.media.opengl.GL;

final class Class120_Sub12_Sub25 extends Class120_Sub12 {
	static int anInt3312 = 0;
	private int anInt3313 = 1;
	private int anInt3314;
	static int hitbardefaultId;
	static int anInt3316 = -1;
	private int anInt3317 = 204;
	static byte[][] aByteArrayArray3318;
	static String aString3319 = "Please remove ";
	static int[] anIntArray3320 = new int[2000];
	static String params = null;

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			for (int i_2_ = 0; Class120_Sub12_Sub7.anInt3178 > i_2_; i_2_++) {
				final int i_3_ = Class90.anIntArray849[i_2_];
				int i_4_ = i_3_ * anInt3313 >> 12;
				final int i_5_ = Class150.anIntArray1405[i_0_];
				final int i_6_ = i_5_ * anInt3314 >> 12;
				final int i_7_ = anInt3313 * (i_3_ % (4096 / anInt3313));
				final int i_8_ = i_5_ % (4096 / anInt3314) * anInt3314;
				if (i_8_ < anInt3317) {
					for (i_4_ -= i_6_; i_4_ < 0; i_4_ += 4) {
						/* empty */
					}
					for (/**/; i_4_ > 3; i_4_ -= 4) {
						/* empty */
					}
					if (i_4_ != 1) {
						is_1_[i_2_] = 0;
						continue;
					}
					if (i_7_ < anInt3317) {
						is_1_[i_2_] = 0;
						continue;
					}
				}
				if (i_7_ < anInt3317) {
					for (i_4_ -= i_6_; i_4_ < 0; i_4_ += 4) {
						/* empty */
					}
					for (/**/; i_4_ > 3; i_4_ -= 4) {
						/* empty */
					}
					if (i_4_ > 0) {
						is_1_[i_2_] = 0;
						continue;
					}
				}
				is_1_[i_2_] = 4096;
			}
		}
		return is_1_;
	}

	public Class120_Sub12_Sub25() {
		super(0, true);
		anInt3314 = 1;
	}

	@Override
	final void decode(final Buffer buffer, final int i_10_) {
		do {
			while_178_: do {
				do {
					if (i_10_ != 0) {
						if (i_10_ != 1) {
							if (i_10_ == 2) {
								break;
							}
							break while_178_;
						}
					} else {
						anInt3313 = buffer.getUByte();
						break while_178_;
					}
					anInt3314 = buffer.getUByte();
					break while_178_;
				} while (false);
				anInt3317 = buffer.getUShort();
			} while (false);
		} while (false);
	}

	static final void method1331() {
		final GL gl = HDToolkit.gl;
		gl.glDisableClientState(32886);//GL_COLOR_ARRAY
		HDToolkit.toggleLighting(false);
		gl.glDisable(2929);//GL_DEPTH_TEST
		gl.glPushAttrib(128);//GL_FOG_BIT
		gl.glFogf(2915, 3072.0F);//GL_FOG_START
		HDToolkit.disableDepthMask();
		for (int i = 0; i < SceneGroundObject.surfaceHdTiles[0].length; i++) {
			final HDTile class120_sub9 = SceneGroundObject.surfaceHdTiles[0][i];
			if (class120_sub9.textureId >= 0 && Class120_Sub12_Sub29.isWaterShader(Rasterizer.anInterface5_973.getShaderId(class120_sub9.textureId))) {
				gl.glColor4fv(World.method2196(class120_sub9.underwaterColor), 0);
				final float f = 201.5F - (class120_sub9.blend ? 1.0F : 0.5F);
				class120_sub9.method1162(SeqFrameBase.activeGroundTiles, f, true);
			}
		}
		gl.glEnableClientState(32886);//GL_COLOR_ARRAY
		HDToolkit.method532();
		gl.glEnable(2929);//GL_DEPTH_TEST
		gl.glPopAttrib();
		HDToolkit.enableDepthMask();
	}

	static final void method1332() {
		Class173.method2225();
		for (int id = 0; id < 4; id++) {
			WallLocation.collisionMaps[id].resetFlags();
		}
		System.gc();
	}

	static final void searchObjects(String name, final boolean geSearch) {
		name = name.toLowerCase();
		short[] results = new short[16];
		int resultsPos = 0;
		for (int id = 0; id < Node.objCount; id++) {
			final ObjType objType = ObjType.list(id);
			if ((!geSearch || objType.stockmarket) && objType.certtemplate == -1 && objType.lenttemplate == -1 && objType.dummyobject == 0 && objType.name.toLowerCase().indexOf(name) != -1) {
				if (resultsPos >= 250) {
					Buffer.searchResultCount = -1;
					Class120_Sub12_Sub37.searchResults = null;
					return;
				}
				if (results.length <= resultsPos) {
					final short[] newArray = new short[results.length * 2];
					for (int i = 0; i < resultsPos; i++) {
						newArray[i] = results[i];
					}
					results = newArray;
				}
				results[resultsPos++] = (short) id;
			}
		}
		Buffer.searchResultCount = resultsPos;
		ParticleNode.searchResultsPos = 0;
		Class120_Sub12_Sub37.searchResults = results;
		final String[] objectNames = new String[Buffer.searchResultCount];
		for (int id = 0; id < Buffer.searchResultCount; id++) {
			objectNames[id] = ObjType.list(results[id]).name;
		}
		ArrayUtils.quicksort(objectNames, Class120_Sub12_Sub37.searchResults);
	}

	static final void clearLocCache() {
		LocType.recentUse.clear();
		LocType.aClass21_2663.clear();
		LocType.aClass21_1618.clear();
		LocType.aClass21_1117.clear();
	}

	static final void handleLogin() {
		do {
			if (Class86.loginStep != 0 && Class86.loginStep != 5) {
				try {
					if (Class150.anInt1408++ > 2000) {
						if (AbstractTimer.worldConnection != null) {
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
						if (client.anInt1153 >= 1) {
							Class86.loginStep = 0;
							Class48.returnCode = -5;
							break;
						}
						if (ModelParticleEmitter.worldPort != Class71.anInt625) {
							ModelParticleEmitter.worldPort = Class71.anInt625;
						} else {
							ModelParticleEmitter.worldPort = GameEntity.anInt3045;
						}
						client.anInt1153++;
						Class86.loginStep = 1;
						Class150.anInt1408 = 0;
					}
					if (Class86.loginStep == 1) {
						Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.worldIpAddress, ModelParticleEmitter.worldPort);
						Class86.loginStep = 2;
					}
					if (Class86.loginStep == 2) {
						if (Class53_Sub1.worldConnectionNode.status == 2) {
							throw new IOException();
						}
						if (Class53_Sub1.worldConnectionNode.status != 1) {
							break;
						}
						AbstractTimer.worldConnection = new JagexSocket((Socket) Class53_Sub1.worldConnectionNode.value, NpcType.gameSignlink);
						Class53_Sub1.worldConnectionNode = null;
						final long l = WaterfallShader.selfNameAsLong = Varp.stringToLong(Class74.loginName);
						final int nameCode = (int) (l >> 16 & 0x1fL);
						Class120_Sub12_Sub11.outputStream.pos = 0;
						Class120_Sub12_Sub11.outputStream.putByte(14);
						Class120_Sub12_Sub11.outputStream.putByte(nameCode);
						AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, 2);
						if (Class120_Sub12_Sub3.aClass164_3150 != null) {
							Class120_Sub12_Sub3.aClass164_3150.method2131();
						}
						if (Class120_Sub12_Sub29.aClass164_3366 != null) {
							Class120_Sub12_Sub29.aClass164_3366.method2131();
						}
						final int returnCode = AbstractTimer.worldConnection.read();
						if (Class120_Sub12_Sub3.aClass164_3150 != null) {
							Class120_Sub12_Sub3.aClass164_3150.method2131();
						}
						if (Class120_Sub12_Sub29.aClass164_3366 != null) {
							Class120_Sub12_Sub29.aClass164_3366.method2131();
						}
						if (returnCode != 0) {
							Class48.returnCode = returnCode;
							Class86.loginStep = 0;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
							break;
						}
						Class86.loginStep = 3;
					}
					if (Class86.loginStep == 3) {
						if (AbstractTimer.worldConnection.getAvailable() < 8) {
							break;
						}
						final int[] is = new int[4];
						AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 8);
						Canvas_Sub1.inputStream.pos = 0;
						Class164.serverSessionKey = Canvas_Sub1.inputStream.getLong();
						is[0] = (int) (9.9999999E7 * Math.random());
						is[1] = (int) (9.9999999E7 * Math.random());
						is[2] = (int) (Class164.serverSessionKey >> 32);
						is[3] = (int) Class164.serverSessionKey;
						Class120_Sub12_Sub11.outputStream.pos = 0;
						Class120_Sub12_Sub11.outputStream.putByte(10);
						Class120_Sub12_Sub11.outputStream.putInt(is[0]);
						Class120_Sub12_Sub11.outputStream.putInt(is[1]);
						Class120_Sub12_Sub11.outputStream.putInt(is[2]);
						Class120_Sub12_Sub11.outputStream.putInt(is[3]);
						Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(Class74.loginName));
						Class120_Sub12_Sub11.outputStream.putJagexString(SeqType.loginPassword);
						Class120_Sub12_Sub11.outputStream.encryptRsa(JagexSocket.aBigInteger415, KeyboardHandler.aBigInteger1505);
						MapFunctionGroup.loginStream.pos = 0;
						if (Class109.gameState == 40) {
							MapFunctionGroup.loginStream.putByte(18);
						} else {
							MapFunctionGroup.loginStream.putByte(16);
						}
						MapFunctionGroup.loginStream.putShort(163 + Class120_Sub12_Sub11.outputStream.pos + params.length() + 1);
						MapFunctionGroup.loginStream.putInt(550);
						MapFunctionGroup.loginStream.putByte(AbstractMouseWheelHandler.anInt116);
						MapFunctionGroup.loginStream.putByte(Class31.advertSuppressed ? 1 : 0);
						MapFunctionGroup.loginStream.putByte(1);
						MapFunctionGroup.loginStream.putByte(Class120_Sub12_Sub4.determinateDisplayMode());
						MapFunctionGroup.loginStream.putShort(Class69_Sub1.canvasWidth);
						MapFunctionGroup.loginStream.putShort(Class120_Sub12_Sub5.canvasHeight);
						MapFunctionGroup.loginStream.putByte(GroundDecoration.antiAliasingSamples);
						Class120_Sub12_Sub30.randomFileRead(MapFunctionGroup.loginStream);
						MapFunctionGroup.loginStream.putJagexString(params);
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub33.affiliateId);
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub18.getGameSettingsBitpacked());
						MapFunctionNode.serverUpdatedPreferences = true;
						MapFunctionGroup.loginStream.putShort(OverlayFrequencyNode.triggerId);
						MapFunctionGroup.loginStream.putInt(AmbientSound.framesJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class79_Sub1.frameBasesJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Js5Worker.configJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class33.interfaceJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class159.aClass50_1490.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class65.mapsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub36.musicJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub17.modelsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(client.spritesJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(NodeCache.texturesJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(ParticleNodeSub.binaryJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(InterfaceListener.aClass50_2544.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(ClientScript.scriptsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(ClanMember.fontMetricsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class132.vorbisJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub22.aClass50_2679.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class114.locationsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(ModelParticleMagnet.enumsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub29.npcsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class127.objectsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class2.seqsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub2.spotAnimsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(WaterfallShader.varBitJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub24.worldMapJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(SphereType.quickChatJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(AbstractMouseWheelHandler.globalQuickChatJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class120_Sub12_Sub15.textureMaterialJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Class187.particlesJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putInt(Npc.defaultsJs5.getIndexCrc());
						MapFunctionGroup.loginStream.putBuffer(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						AbstractTimer.worldConnection.put(MapFunctionGroup.loginStream.buf, 0, MapFunctionGroup.loginStream.pos);
						Class120_Sub12_Sub11.outputStream.initIsaac(is);
						for (int id = 0; id < 4; id++) {
							is[id] += 50;
						}
						Canvas_Sub1.inputStream.initIsaac(is);
						Class86.loginStep = 4;
					}
					if (Class86.loginStep == 4) {
						if (AbstractTimer.worldConnection.getAvailable() < 1) {
							break;
						}
						final int returnCode = AbstractTimer.worldConnection.read();
						if (returnCode == 21) {
							Class86.loginStep = 7;
						} else if (returnCode == 29) {
							Class86.loginStep = 10;
						} else if (returnCode == 1) {
							Class48.returnCode = returnCode;
							Class86.loginStep = 5;
							break;
						} else if (returnCode == 2) {
							Class86.loginStep = 8;
						} else {
							if (returnCode == 15) {
								Class48.returnCode = returnCode;
								Class86.loginStep = 0;
							} else if (returnCode != 23 || client.anInt1153 >= 1) {
								Class48.returnCode = returnCode;
								Class86.loginStep = 0;
								AbstractTimer.worldConnection.close();
								AbstractTimer.worldConnection = null;
							} else {
								Class86.loginStep = 1;
								Class150.anInt1408 = 0;
								client.anInt1153++;
								AbstractTimer.worldConnection.close();
								AbstractTimer.worldConnection = null;
							}
							break;
						}
					}
					if (Class86.loginStep == 6) {
						Class120_Sub12_Sub11.outputStream.pos = 0;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(17);
						AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						Class86.loginStep = 4;
					} else if (Class86.loginStep == 7) {
						if (AbstractTimer.worldConnection.getAvailable() >= 1) {
							Class57.delayAfterWorldChange = 180 + 60 * AbstractTimer.worldConnection.read();
							Class86.loginStep = 0;
							Class48.returnCode = 21;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
					} else if (Class86.loginStep == 10) {
						if (AbstractTimer.worldConnection.getAvailable() >= 1) {
							Class120_Sub22.anInt2672 = AbstractTimer.worldConnection.read();
							Class48.returnCode = 29;
							Class86.loginStep = 0;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
					} else {
						if (Class86.loginStep == 8) {
							if (AbstractTimer.worldConnection.getAvailable() < 14) {
								break;
							}
							AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 14);
							Canvas_Sub1.inputStream.pos = 0;
							
							Class86.staffLevel = Canvas_Sub1.inputStream.getUByte();
							Class120_Sub12_Sub9.playerModTrial = Canvas_Sub1.inputStream.getUByte();
							
							VarBit.quickChatParam2 = Canvas_Sub1.inputStream.getUByte() == 1;
							UnderlayType.quickChatParam3 = Canvas_Sub1.inputStream.getUByte() == 1;
							Class120_Sub12_Sub18.aBoolean3275 = Canvas_Sub1.inputStream.getUByte() == 1;
							SpotAnimationNode.quickChatParam1 = Canvas_Sub1.inputStream.getUByte() == 1;
							
							Class127.recordMouseMovements = Canvas_Sub1.inputStream.getUByte() == 1;
							Class167.selfPlayerIndex = Canvas_Sub1.inputStream.getUShort();
							Class120_Sub12_Sub21_Sub1.membersAccount = Canvas_Sub1.inputStream.getUByte() == 1;
							Class120_Sub12_Sub37.membersClient = Canvas_Sub1.inputStream.getUByte() == 1;
							LocType.setMembersClient1(Class120_Sub12_Sub37.membersClient);
							ObjType.setMembersClient2(Class120_Sub12_Sub37.membersClient);
							NpcType.setMembersClient3(Class120_Sub12_Sub37.membersClient);
							if (!Class31.advertSuppressed) {
								if (VarBit.quickChatParam2 && !Class120_Sub12_Sub18.aBoolean3275 || Class120_Sub12_Sub21_Sub1.membersAccount) {
									try {
										JSHelper.call(NpcType.gameSignlink.gameApplet, "zap");
									} catch (final Throwable throwable) {
										/* empty */
									}
								} else {
									try {
										JSHelper.call(NpcType.gameSignlink.gameApplet, "unzap");
									} catch (final Throwable throwable) {
										/* empty */
									}
								}
							}
							try {
								JSHelper.call(NpcType.gameSignlink.gameApplet, "loggedin");
							} catch (final Throwable throwable) {
								/* empty */
							}
							client.packetType = Canvas_Sub1.inputStream.getUByteIsaac();
							AbstractMouseWheelHandler.packetSize = Canvas_Sub1.inputStream.getUShort();
							Class86.loginStep = 9;
						}
						if (Class86.loginStep == 9 && AbstractTimer.worldConnection.getAvailable() >= AbstractMouseWheelHandler.packetSize) {
							Canvas_Sub1.inputStream.pos = 0;
							AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, AbstractMouseWheelHandler.packetSize);
							Class48.returnCode = 2;
							Class86.loginStep = 0;
							Class24.method205();
							Class116.currentRegionX = -1;
							Class120_Sub29.receiveRegionData(false);
							client.packetType = -1;
						}
					}
				} catch (final IOException ioexception) {
					if (AbstractTimer.worldConnection != null) {
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
					if (client.anInt1153 < 1) {
						client.anInt1153++;
						Class86.loginStep = 1;
						if (Class71.anInt625 != ModelParticleEmitter.worldPort) {
							ModelParticleEmitter.worldPort = Class71.anInt625;
						} else {
							ModelParticleEmitter.worldPort = GameEntity.anInt3045;
						}
						Class150.anInt1408 = 0;
					} else {
						Class86.loginStep = 0;
						Class48.returnCode = -4;
						break;
					}
				}
			}
			break;
		} while (false);
	}
}
