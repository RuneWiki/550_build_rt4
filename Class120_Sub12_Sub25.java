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
	static String settings = null;

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

	public static void method1330(final int i) {
		try {
			settings = null;
			if (i != 0) {
				method1334();
			}
			anIntArray3320 = null;
			aString3319 = null;
			aByteArrayArray3318 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qj.AA(").append(i).append(')').toString());
		}
	}

	static final void method1331() {
		final GL gl = HDToolkit.gl;
		gl.glDisableClientState(32886);
		HDToolkit.toggleLighting(false);
		gl.glDisable(2929);
		gl.glPushAttrib(128);
		gl.glFogf(2915, 3072.0F);
		HDToolkit.disableDepthMask();
		for (int i = 0; i < SceneGroundObject.aClass120_Sub9ArrayArray2844[0].length; i++) {
			final Class120_Sub9 class120_sub9 = SceneGroundObject.aClass120_Sub9ArrayArray2844[0][i];
			if (class120_sub9.anInt2520 >= 0 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class120_sub9.anInt2520), (byte) -123)) {
				gl.glColor4fv(World.method2196(class120_sub9.anInt2505), 0);
				final float f = 201.5F - (class120_sub9.aBoolean2516 ? 1.0F : 0.5F);
				class120_sub9.method1162(LabelGroup.groundTiles, f, true);
			}
		}
		gl.glEnableClientState(32886);
		HDToolkit.method532();
		gl.glEnable(2929);
		gl.glPopAttrib();
		HDToolkit.enableDepthMask();
	}

	static final void method1332() {
		Class173.method2225();
		for (int id = 0; id < 4; id++) {
			Class182.collisionMaps[id].resetFlags();
		}
		System.gc();
	}

	static final void method1333(String string, final boolean bool) {
		string = string.toLowerCase();
		int i_13_ = 0;
		short[] is = new short[16];
		for (int id = 0; id < Node.objCount; id++) {
			final ObjType objType = ObjType.list(id);
			if ((!bool || objType.stockmarket) && objType.certtemplate == -1 && objType.lenttemplate == -1 && objType.dummyobject == 0 && objType.name.toLowerCase().indexOf(string) != -1) {
				if (i_13_ >= 250) {
					Buffer.anInt2474 = -1;
					Class120_Sub12_Sub37.aShortArray3430 = null;
					return;
				}
				if (is.length <= i_13_) {
					final short[] is_15_ = new short[2 * is.length];
					for (int i_16_ = 0; i_13_ > i_16_; i_16_++) {
						is_15_[i_16_] = is[i_16_];
					}
					is = is_15_;
				}
				is[i_13_++] = (short) id;
			}
		}
		Buffer.anInt2474 = i_13_;
		ParticleNode.anInt1035 = 0;
		Class120_Sub12_Sub37.aShortArray3430 = is;
		final String[] strings = new String[Buffer.anInt2474];
		for (int i_17_ = 0; i_17_ < Buffer.anInt2474; i_17_++) {
			strings[i_17_] = ObjType.list(is[i_17_]).name;
		}
		Class28.method242(strings, Class120_Sub12_Sub37.aShortArray3430);
	}

	static final void method1334() {
		LocType.recentUse.clear();
		InterfaceClickMask.aClass21_2663.clear();
		Class167.aClass21_1618.clear();
		Class116.aClass21_1117.clear();
	}

	static final void handleLogin() {
		do {
			if (Class86.loginStep != 0 && Class86.loginStep != 5) {
				try {
					if (2000 < ++Class150.anInt1408) {
						if (AbstractTimer.worldConnection != null) {
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
						if (Class121.anInt1153 >= 1) {
							Class86.loginStep = 0;
							Class48.returnCode = -5;
							break;
						}
						if (Class158.anInt1479 != Class71.anInt625) {
							Class158.anInt1479 = Class71.anInt625;
						} else {
							Class158.anInt1479 = GameEntity.anInt3045;
						}
						Class121.anInt1153++;
						Class86.loginStep = 1;
						Class150.anInt1408 = 0;
					}
					if (Class86.loginStep == 1) {
						Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.aString3375, Class158.anInt1479);
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
						Class137.loginStream.pos = 0;
						if (Class109.gameState == 40) {
							Class137.loginStream.putByte(18);
						} else {
							Class137.loginStream.putByte(16);
						}
						Class137.loginStream.putShort(163 + Class120_Sub12_Sub11.outputStream.pos + settings.length() + 1);
						Class137.loginStream.putInt(550);
						Class137.loginStream.putByte(AbstractMouseWheelHandler.anInt116);
						Class137.loginStream.putByte(Class31.advertSuppressed ? 1 : 0);
						Class137.loginStream.putByte(1);
						Class137.loginStream.putByte(Class120_Sub12_Sub4.getDisplayMode());
						Class137.loginStream.putShort(Class69_Sub1.canvasWidth);
						Class137.loginStream.putShort(Class120_Sub12_Sub5.canvasHeight);
						Class137.loginStream.putByte(Class36.antiAliasingSamples);
						Class120_Sub12_Sub30.method1358(Class137.loginStream);
						Class137.loginStream.putJagexString(settings);
						Class137.loginStream.putInt(Class120_Sub12_Sub33.affiliateId);
						Class137.loginStream.putInt(Class120_Sub12_Sub18.method1288());
						MapFunctionNode.aBoolean3471 = true;
						Class137.loginStream.putShort(OverlayFrequencyNode.packetCounter);
						Class137.loginStream.putInt(AmbientSound.aClass50_2479.getIndexCrc());
						Class137.loginStream.putInt(Class79_Sub1.aClass50_2245.getIndexCrc());
						Class137.loginStream.putInt(Js5Worker.aClass50_397.getIndexCrc());
						Class137.loginStream.putInt(Class33.aClass50_275.getIndexCrc());
						Class137.loginStream.putInt(Class159.aClass50_1490.getIndexCrc());
						Class137.loginStream.putInt(Class65.aClass50_597.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub12_Sub36.aClass50_3419.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub12_Sub17.aClass50_3258.getIndexCrc());
						Class137.loginStream.putInt(Class7.aClass50_63.getIndexCrc());
						Class137.loginStream.putInt(NodeCache.aClass50_303.getIndexCrc());
						Class137.loginStream.putInt(ParticleNodeSub.aClass50_2400.getIndexCrc());
						Class137.loginStream.putInt(InterfaceListener.aClass50_2544.getIndexCrc());
						Class137.loginStream.putInt(IsaacCipher.aClass50_1019.getIndexCrc());
						Class137.loginStream.putInt(ClanMember.aClass50_2576.getIndexCrc());
						Class137.loginStream.putInt(Class132.aClass50_1251.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub22.aClass50_2679.getIndexCrc());
						Class137.loginStream.putInt(Class114.aClass50_1097.getIndexCrc());
						Class137.loginStream.putInt(Class169.aClass50_1649.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub12_Sub29.aClass50_3367.getIndexCrc());
						Class137.loginStream.putInt(Class127.aClass50_1213.getIndexCrc());
						Class137.loginStream.putInt(Class2.aClass50_50.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub2.aClass50_2415.getIndexCrc());
						Class137.loginStream.putInt(WaterfallShader.aClass50_2169.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub12_Sub24.aClass50_3309.getIndexCrc());
						Class137.loginStream.putInt(Class153.aClass50_1433.getIndexCrc());
						Class137.loginStream.putInt(AbstractMouseWheelHandler.aClass50_115.getIndexCrc());
						Class137.loginStream.putInt(Class120_Sub12_Sub15.aClass50_3242.getIndexCrc());
						Class137.loginStream.putInt(Class187.aClass50_1907.getIndexCrc());
						Class137.loginStream.putInt(Npc.aClass50_3753.getIndexCrc());
						Class137.loginStream.putBuffer(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						AbstractTimer.worldConnection.put(Class137.loginStream.buf, 0, Class137.loginStream.pos);
						Class120_Sub12_Sub11.outputStream.initIsaac(is);
						for (int i_20_ = 0; i_20_ < 4; i_20_++) {
							is[i_20_] += 50;
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
							} else if (returnCode != 23 || Class121.anInt1153 >= 1) {
								Class48.returnCode = returnCode;
								Class86.loginStep = 0;
								AbstractTimer.worldConnection.close();
								AbstractTimer.worldConnection = null;
							} else {
								Class86.loginStep = 1;
								Class150.anInt1408 = 0;
								Class121.anInt1153++;
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
							Class57.anInt504 = 180 + 60 * AbstractTimer.worldConnection.read();
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
							//if (VarBit.aBoolean167 && !OverlayType.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464) {
							Class86.staffLevel = Canvas_Sub1.inputStream.getUByte();
							Class120_Sub12_Sub9.anInt3199 = Canvas_Sub1.inputStream.getUByte();
							
							VarBit.aBoolean167 = Canvas_Sub1.inputStream.getUByte() == 1;
							UnderlayType.aBoolean1228 = Canvas_Sub1.inputStream.getUByte() == 1;
							Class120_Sub12_Sub18.aBoolean3275 = Canvas_Sub1.inputStream.getUByte() == 1;
							Class120_Sub14_Sub4.aBoolean3464 = Canvas_Sub1.inputStream.getUByte() == 1;
							
							Class127.recordMouseMovements = Canvas_Sub1.inputStream.getUByte() == 1;
							Class167.anInt1616 = Canvas_Sub1.inputStream.getUShort();
							Class120_Sub12_Sub21_Sub1.extendFriendsList = Canvas_Sub1.inputStream.getUByte() == 1;
							Class120_Sub12_Sub37.membersClient = Canvas_Sub1.inputStream.getUByte() == 1;
							LocType.setMembersClient1(Class120_Sub12_Sub37.membersClient);
							ObjType.setMembersClient2(Class120_Sub12_Sub37.membersClient);
							NpcType.setMembersClient3(Class120_Sub12_Sub37.membersClient);
							if (!Class31.advertSuppressed) {
								if (VarBit.aBoolean167 && !Class120_Sub12_Sub18.aBoolean3275 || Class120_Sub12_Sub21_Sub1.extendFriendsList) {
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
							Class23.packetType = Canvas_Sub1.inputStream.getUByteIsaac();
							AbstractMouseWheelHandler.packetSize = Canvas_Sub1.inputStream.getUShort();
							Class86.loginStep = 9;
						}
						if (Class86.loginStep == 9 && AbstractTimer.worldConnection.getAvailable() >= AbstractMouseWheelHandler.packetSize) {
							Canvas_Sub1.inputStream.pos = 0;
							AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, AbstractMouseWheelHandler.packetSize);
							Class48.returnCode = 2;
							Class86.loginStep = 0;
							Class24.method205();
							Class116.anInt1118 = -1;
							Class120_Sub29.receiveRegionData(false);
							Class23.packetType = -1;
						}
					}
				} catch (final IOException ioexception) {
					if (AbstractTimer.worldConnection != null) {
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
					if (Class121.anInt1153 < 1) {
						Class121.anInt1153++;
						Class86.loginStep = 1;
						if (Class71.anInt625 != Class158.anInt1479) {
							Class158.anInt1479 = Class71.anInt625;
						} else {
							Class158.anInt1479 = GameEntity.anInt3045;
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
