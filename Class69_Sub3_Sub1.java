/* Class69_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class69_Sub3_Sub1 extends Class69_Sub3 {
	static Class75 aClass75_3079 = new Class75(16);
	static Class189 aClass189_3080 = null;
	static int[] anIntArray3081 = new int[100];
	static int[] anIntArray3082;
	static int anInt3083;
	static int anInt3084 = 0;
	static short[] aShortArray3085;

	static {
		anIntArray3082 = new int[5];
		aShortArray3085 = new short[256];
	}

	public static void method629(final int i) {
		try {
			aClass75_3079 = null;
			aShortArray3085 = null;
			if (i >= -27) {
				aClass75_3079 = null;
			}
			aClass189_3080 = null;
			anIntArray3081 = null;
			anIntArray3082 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("un.F(").append(i).append(')').toString());
		}
	}

	static final boolean updateInterfaceCounter(final int i_0_) {
		Class120_Sub14_Sub20.interfaceCounter = 1 + i_0_ & 0xffff;
		Class30.interfaceCounterUpdated = true;
		return true;
	}

	static final void method631(final byte i) {
		do {
			try {
				if (Class154.anInt1440 != 0) {
					try {
						if (++Class120_Sub14_Sub4.anInt3466 > 2000) {
							if (AbstractTimer.aClass46_825 != null) {
								AbstractTimer.aClass46_825.method377(-19055);
								AbstractTimer.aClass46_825 = null;
							}
							if (Class107.anInt1027 < 1) {
								Class120_Sub14_Sub4.anInt3466 = 0;
								Class154.anInt1440 = 1;
								Class107.anInt1027++;
								if (Class158.anInt1479 != Class71.anInt625) {
									Class158.anInt1479 = Class71.anInt625;
								} else {
									Class158.anInt1479 = GameEntity.anInt3045;
								}
							} else {
								Class120_Sub12_Sub35.anInt3410 = -5;
								Class154.anInt1440 = 0;
								break;
							}
						}
						if (Class154.anInt1440 == 1) {
							Class53_Sub1.aClass185_2217 = NpcType.gameSignlink.method1976(19, Class120_Sub12_Sub30.aString3375, Class158.anInt1479);
							Class154.anInt1440 = 2;
						}
						if (Class154.anInt1440 == 2) {
							if (Class53_Sub1.aClass185_2217.status == 2) {
								throw new IOException();
							}
							if (Class53_Sub1.aClass185_2217.status != 1) {
								break;
							}
							AbstractTimer.aClass46_825 = new Class46((Socket) Class53_Sub1.aClass185_2217.value, NpcType.gameSignlink);
							Class53_Sub1.aClass185_2217 = null;
							AbstractTimer.aClass46_825.method381(0, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.buf, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos, 30000);
							if (Class120_Sub12_Sub3.aClass164_3150 != null) {
								Class120_Sub12_Sub3.aClass164_3150.method2131(2);
							}
							if (Class120_Sub12_Sub29.aClass164_3366 != null) {
								Class120_Sub12_Sub29.aClass164_3366.method2131(2);
							}
							final int i_1_ = AbstractTimer.aClass46_825.read();
							if (Class120_Sub12_Sub3.aClass164_3150 != null) {
								Class120_Sub12_Sub3.aClass164_3150.method2131(2);
							}
							if (Class120_Sub12_Sub29.aClass164_3366 != null) {
								Class120_Sub12_Sub29.aClass164_3366.method2131(2);
							}
							if (i_1_ != 21) {
								Class120_Sub12_Sub35.anInt3410 = i_1_;
								Class154.anInt1440 = 0;
								AbstractTimer.aClass46_825.method377(-19055);
								AbstractTimer.aClass46_825 = null;
								break;
							}
							Class154.anInt1440 = 3;
						}
						if (Class154.anInt1440 == 3) {
							if (AbstractTimer.aClass46_825.method375((byte) 96) < 1) {
								break;
							}
							Class45.aStringArray399 = new String[AbstractTimer.aClass46_825.read()];
							Class154.anInt1440 = 4;
						}
						if (Class154.anInt1440 == 4 && AbstractTimer.aClass46_825.method375((byte) 81) >= 8 * Class45.aStringArray399.length) {
							Canvas_Sub1.aClass120_Sub7_Sub1_16.pos = 0;
							AbstractTimer.aClass46_825.method373(0, Canvas_Sub1.aClass120_Sub7_Sub1_16.buf, Class45.aStringArray399.length * 8, (byte) 77);
							for (int i_2_ = 0; i_2_ < Class45.aStringArray399.length; i_2_++) {
								Class45.aStringArray399[i_2_] = Class174.method2234(0, Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114));
							}
							Class154.anInt1440 = 0;
							Class120_Sub12_Sub35.anInt3410 = 21;
							AbstractTimer.aClass46_825.method377(-19055);
							AbstractTimer.aClass46_825 = null;
						}
					} catch (final IOException ioexception) {
						if (AbstractTimer.aClass46_825 != null) {
							AbstractTimer.aClass46_825.method377(-19055);
							AbstractTimer.aClass46_825 = null;
						}
						if (Class107.anInt1027 >= 1) {
							Class154.anInt1440 = 0;
							Class120_Sub12_Sub35.anInt3410 = -4;
						} else {
							Class120_Sub14_Sub4.anInt3466 = 0;
							Class154.anInt1440 = 1;
							if (Class158.anInt1479 != Class71.anInt625) {
								Class158.anInt1479 = Class71.anInt625;
							} else {
								Class158.anInt1479 = GameEntity.anInt3045;
							}
							Class107.anInt1027++;
							break;
						}
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("un.G(").append(i).append(')').toString());
			}
		} while (false);
	}
}
