/* Class69_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class69_Sub3_Sub1 extends Class69_Sub3 {
	static Hashtable varpChanges = new Hashtable(16);
	static JagexInterface worldMapInterface = null;
	static int[] screenRedrawHeights = new int[100];
	static int[] cs2ArrayLengths = new int[5];
	static int cameraX;
	static int publicChatSetting = 0;
	static short[] aShortArray3085;

	static {
		aShortArray3085 = new short[256];
	}

	static final boolean updateTriggerid(final int i_0_) {
		OverlayFrequencyNode.triggerId = 1 + i_0_ & 0xffff;
		Class30.transmitNewId = true;
		return true;
	}

	static final void handleAccountCreation() {// Account creation
		if (Class154.accountCreationStep != 0) {
			try {
				if (SpotAnimationNode.anInt3466++ > 2000) {
					if (AbstractTimer.worldConnection != null) {
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
					if (AbstractIndexedSprite.anInt1027 < 1) {
						SpotAnimationNode.anInt3466 = 0;
						Class154.accountCreationStep = 1;
						AbstractIndexedSprite.anInt1027++;
						if (ModelParticleEmitter.worldPort != Class71.anInt625) {
							ModelParticleEmitter.worldPort = Class71.anInt625;
						} else {
							ModelParticleEmitter.worldPort = GameEntity.anInt3045;
						}
					} else {
						Class120_Sub12_Sub35.accountCreationServerResponse = -5;
						Class154.accountCreationStep = 0;
						return;
					}
				}
				if (Class154.accountCreationStep == 1) {
					Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.worldIpAddress, ModelParticleEmitter.worldPort);
					Class154.accountCreationStep = 2;
				}
				if (Class154.accountCreationStep == 2) {
					if (Class53_Sub1.worldConnectionNode.status == 2) {
						throw new IOException();
					}
					if (Class53_Sub1.worldConnectionNode.status != 1) {
						return;
					}
					AbstractTimer.worldConnection = new JagexSocket((Socket) Class53_Sub1.worldConnectionNode.value, NpcType.gameSignlink);
					Class53_Sub1.worldConnectionNode = null;
					AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
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
					if (returnCode != 21) {
						Class120_Sub12_Sub35.accountCreationServerResponse = returnCode;
						Class154.accountCreationStep = 0;
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
						return;
					}
					Class154.accountCreationStep = 3;
				}
				if (Class154.accountCreationStep == 3) {
					if (AbstractTimer.worldConnection.getAvailable() < 1) {
						return;
					}
					Js5Worker.alternativeAccountUsernames = new String[AbstractTimer.worldConnection.read()];
					Class154.accountCreationStep = 4;
				}
				if (Class154.accountCreationStep == 4 && AbstractTimer.worldConnection.getAvailable() >= Js5Worker.alternativeAccountUsernames.length * 8) {
					Canvas_Sub1.inputStream.pos = 0;
					AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, Js5Worker.alternativeAccountUsernames.length * 8);
					for (int id = 0; id < Js5Worker.alternativeAccountUsernames.length; id++) {
						Js5Worker.alternativeAccountUsernames[id] = Class174.longToString(Canvas_Sub1.inputStream.getLong());
					}
					Class154.accountCreationStep = 0;
					Class120_Sub12_Sub35.accountCreationServerResponse = 21;
					AbstractTimer.worldConnection.close();
					AbstractTimer.worldConnection = null;
				}
			} catch (final IOException ioexception) {
				if (AbstractTimer.worldConnection != null) {
					AbstractTimer.worldConnection.close();
					AbstractTimer.worldConnection = null;
				}
				if (AbstractIndexedSprite.anInt1027 >= 1) {
					Class154.accountCreationStep = 0;
					Class120_Sub12_Sub35.accountCreationServerResponse = -4;
				} else {
					SpotAnimationNode.anInt3466 = 0;
					Class154.accountCreationStep = 1;
					if (ModelParticleEmitter.worldPort != Class71.anInt625) {
						ModelParticleEmitter.worldPort = Class71.anInt625;
					} else {
						ModelParticleEmitter.worldPort = GameEntity.anInt3045;
					}
					AbstractIndexedSprite.anInt1027++;
				}
			}
		}
	}
}
