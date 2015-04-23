/* Class69_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class69_Sub3_Sub1 extends Class69_Sub3 {
	static Hashtable aClass75_3079 = new Hashtable(16);
	static JagexInterface aClass189_3080 = null;
	static int[] screenRedrawHeights = new int[100];
	static int[] anIntArray3082;
	static int playerRenderX;
	static int publicChatSetting = 0;
	static short[] aShortArray3085;

	static {
		anIntArray3082 = new int[5];
		aShortArray3085 = new short[256];
	}

	static final boolean updatePacketCounter(final int i_0_) {
		OverlayFrequencyNode.packetCounter = 1 + i_0_ & 0xffff;
		Class30.packetCounterUpdated = true;
		return true;
	}

	static final void method631() {
		do {
			if (Class154.anInt1440 != 0) {
				try {
					if (++SpotAnimationNode.anInt3466 > 2000) {
						if (AbstractTimer.worldConnection != null) {
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
						}
						if (AbstractIndexedSprite.anInt1027 < 1) {
							SpotAnimationNode.anInt3466 = 0;
							Class154.anInt1440 = 1;
							AbstractIndexedSprite.anInt1027++;
							if (ModelParticleEmitter.anInt1479 != Class71.anInt625) {
								ModelParticleEmitter.anInt1479 = Class71.anInt625;
							} else {
								ModelParticleEmitter.anInt1479 = GameEntity.anInt3045;
							}
						} else {
							Class120_Sub12_Sub35.anInt3410 = -5;
							Class154.anInt1440 = 0;
							break;
						}
					}
					if (Class154.anInt1440 == 1) {
						Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.aString3375, ModelParticleEmitter.anInt1479);
						Class154.anInt1440 = 2;
					}
					if (Class154.anInt1440 == 2) {
						if (Class53_Sub1.worldConnectionNode.status == 2) {
							throw new IOException();
						}
						if (Class53_Sub1.worldConnectionNode.status != 1) {
							break;
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
						final int i_1_ = AbstractTimer.worldConnection.read();
						if (Class120_Sub12_Sub3.aClass164_3150 != null) {
							Class120_Sub12_Sub3.aClass164_3150.method2131();
						}
						if (Class120_Sub12_Sub29.aClass164_3366 != null) {
							Class120_Sub12_Sub29.aClass164_3366.method2131();
						}
						if (i_1_ != 21) {
							Class120_Sub12_Sub35.anInt3410 = i_1_;
							Class154.anInt1440 = 0;
							AbstractTimer.worldConnection.close();
							AbstractTimer.worldConnection = null;
							break;
						}
						Class154.anInt1440 = 3;
					}
					if (Class154.anInt1440 == 3) {
						if (AbstractTimer.worldConnection.getAvailable() < 1) {
							break;
						}
						Js5Worker.aStringArray399 = new String[AbstractTimer.worldConnection.read()];
						Class154.anInt1440 = 4;
					}
					if (Class154.anInt1440 == 4 && AbstractTimer.worldConnection.getAvailable() >= 8 * Js5Worker.aStringArray399.length) {
						Canvas_Sub1.inputStream.pos = 0;
						AbstractTimer.worldConnection.read(Canvas_Sub1.inputStream.buf, 0, Js5Worker.aStringArray399.length * 8);
						for (int i_2_ = 0; i_2_ < Js5Worker.aStringArray399.length; i_2_++) {
							Js5Worker.aStringArray399[i_2_] = Class174.longToString(Canvas_Sub1.inputStream.getLong());
						}
						Class154.anInt1440 = 0;
						Class120_Sub12_Sub35.anInt3410 = 21;
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
				} catch (final IOException ioexception) {
					if (AbstractTimer.worldConnection != null) {
						AbstractTimer.worldConnection.close();
						AbstractTimer.worldConnection = null;
					}
					if (AbstractIndexedSprite.anInt1027 >= 1) {
						Class154.anInt1440 = 0;
						Class120_Sub12_Sub35.anInt3410 = -4;
					} else {
						SpotAnimationNode.anInt3466 = 0;
						Class154.anInt1440 = 1;
						if (ModelParticleEmitter.anInt1479 != Class71.anInt625) {
							ModelParticleEmitter.anInt1479 = Class71.anInt625;
						} else {
							ModelParticleEmitter.anInt1479 = GameEntity.anInt3045;
						}
						AbstractIndexedSprite.anInt1027++;
						break;
					}
				}
			}
			break;
		} while (false);
	}
}
