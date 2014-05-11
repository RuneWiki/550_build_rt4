/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

final class Class82 implements Runnable {
	volatile boolean aBoolean780;
	Signlink aClass135_781;
	volatile Class164[] aClass164Array782 = new Class164[2];
	static Class88 aClass88_783 = new Class88();
	volatile boolean aBoolean784;
	static Class107[] aClass107Array785;
	static Class21 aClass21_786 = new Class21(64);
	static String aString787 = "Face here";

	static final void addKeyboard(final Component component) {
		final Method method = Signlink.traversalKeyMethod;
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(Class169.keyboardHandler);
		component.addFocusListener(Class169.keyboardHandler);
	}

	@Override
	public final void run() {
		do {
			try {
				this.aBoolean784 = true;
				try {
					try {
						while (!this.aBoolean780) {
							for (int i = 0; i < 2; i++) {
								final Class164 class164 = this.aClass164Array782[i];
								if (class164 != null) {
									class164.method2133((byte) -120);
								}
							}
							PacketBuffer.sleepWrapper(10L);
						}
					} catch (final Exception exception) {
						Class180_Sub3.method2312(exception, null);
						this.aBoolean784 = false;
						break;
					}
					this.aBoolean784 = false;
				} catch (final RuntimeException runtimeexception) {
					this.aBoolean784 = false;
					throw runtimeexception;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, "im.run()");
			}
		} while (false);
	}

	static final Class167_Sub1 method710(final byte i, final int i_0_) {
		Class167_Sub1 class167_sub1;
		try {
			if (i != -24) {
				aString787 = null;
			}
			if (!Class159.aBoolean1487 || Class120_Sub26.anInt2738 > i_0_ || Class120_Sub14_Sub2.anInt3454 < i_0_) {
				return null;
			}
			class167_sub1 = Class48.aClass167_Sub1Array435[-Class120_Sub26.anInt2738 + i_0_];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return class167_sub1;
	}

	static final void method711(final int i, final byte i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			if (Class90.anInt848 < 100) {
				Class81.method705((byte) -39);
			}
			if (HDToolkit.glEnabled) {
				GraphicsHD.method592(i_3_, i_2_, i_3_ - -i_4_, i + i_2_);
			} else {
				GraphicsLD.method2155(i_3_, i_2_, i_4_ + i_3_, i_2_ + i);
			}
			if (Class90.anInt848 < 100) {
				final int i_6_ = i_4_ / 2 + i_3_;
				final int i_7_ = -38 + i_2_ - -(i / 2);
				if (HDToolkit.glEnabled) {
					GraphicsHD.fillRect(i_3_, i_2_, i_4_, i, 0);
					GraphicsHD.drawRect(-152 + i_6_, i_7_, 304, 34, 9179409);
					GraphicsHD.fillRect(i_6_ - 150, i_7_ - -2, Class90.anInt848 * 3, 30, 9179409);
				} else {
					GraphicsLD.fillRect(i_3_, i_2_, i_4_, i, 0);
					GraphicsLD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
					GraphicsLD.fillRect(-150 + i_6_, i_7_ + 2, Class90.anInt848 * 3, 30, 9179409);
				}
				Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1478(Class36.aString313, i_6_, i_7_ - -20, 16777215, -1);
			} else {
				Class120_Sub14_Sub21.anInt3628 = (int) (i * 2 / Class79.aFloat696);
				Class120_Sub18.anInt2627 = Class169.anInt1646 + -(int) (i / Class79.aFloat696);
				Class120_Sub14_Sub11.anInt3538 = -(int) (i_4_ / Class79.aFloat696) + Class108_Sub1.anInt2336;
				Class173.anInt1726 = (int) (i_4_ * 2 / Class79.aFloat696);
				final int i_8_ = -(int) (i_4_ / Class79.aFloat696) + Class108_Sub1.anInt2336;
				final int i_9_ = Class169.anInt1646 - (int) (i / Class79.aFloat696);
				if (i_1_ >= -111) {
					method714((byte) -76);
				}
				final int i_10_ = (int) (i_4_ / Class79.aFloat696) + Class108_Sub1.anInt2336;
				final int i_11_ = (int) (i / Class79.aFloat696) + Class169.anInt1646;
				if (!HDToolkit.glEnabled) {
					Class79.method683(i_8_, i_9_, i_10_, i_11_, i_3_, i_2_, i_4_ + i_3_, 1 + i + i_2_);
					Class79.method685();
					final Class105 class105 = Class79.method679();
					Class101_Sub1.method842(class105, 0, 5938, 0);
				} else {
					if (Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 == null || i_4_ != Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.width || Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.height != i) {
						Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = null;
						Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = new LDSprite(i_4_, i);
					}
					GraphicsLD.init2dCanvas(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, i_4_, i);
					Class79.method683(i_8_, i_9_, i_10_, i_11_, 0, 0, i_4_, 1 + i);
					Class79.method685();
					final Class105 class105 = Class79.method679();
					Class101_Sub1.method842(class105, i_3_, 5938, i_2_);
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.method1608();
					GraphicsHD.method596(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, i_3_, i_2_, i_4_, i);
					GraphicsLD.pixels = null;
				}
				if (Class96.anInt919 > 0) {
					Class136.anInt1321--;
					if (Class136.anInt1321 == 0) {
						Class136.anInt1321 = 20;
						Class96.anInt919--;
					}
				}
				if (Class85.showFps) {
					final int i_12_ = i_4_ + i_3_ - 5;
					int i_13_ = 16776960;
					int i_14_ = i_2_ + i + -8;
					Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1482(new StringBuilder("Fps:").append(Class73.fps).toString(), i_12_, i_14_, 16776960, -1);
					final Runtime runtime = Runtime.getRuntime();
					i_14_ -= 15;
					final int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					if (-65537 > (i_15_ ^ 0xffffffff)) {
						i_13_ = 16711680;
					}
					Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1482(new StringBuilder("Mem:").append(i_15_).append("k").toString(), i_12_, i_14_, i_13_, -1);
					i_14_ -= 15;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.B(").append(i).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	static final void method712(final int i) {
		try {
			Class84.aClass120_Sub14_Sub9_798 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = Class3.aClass120_Sub14_Sub9_54 = RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.E(").append(i).append(')').toString());
		}
	}

	static final void method713(final int i, int i_16_, int i_17_, final int i_18_, final boolean bool) {
		try {
			if (bool) {
				aString787 = null;
			}
			if (Class32.anInt260 <= i && Class120_Sub14_Sub11.anInt3544 >= i) {
				i_16_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_16_, 1, Class139.anInt1334);
				i_17_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_17_, 1, Class139.anInt1334);
				Class108_Sub1.method939(i, i_18_, i_17_, (byte) -30, i_16_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.C(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(bool).append(')').toString());
		}
	}

	public static void method714(final byte i) {
		try {
			aClass21_786 = null;
			aClass107Array785 = null;
			aString787 = null;
			aClass88_783 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.F(").append(i).append(')').toString());
		}
	}

	static final void method715(final int i) {
		try {
			if (Class100.selfPlayer != null && Class100.selfPlayer.x - (64 * Class100.selfPlayer.getSize() + -64) >> 7 == Class120_Sub12_Sub26.anInt3327
					&& Class100.selfPlayer.z + -(Class100.selfPlayer.getSize() * 64) + 64 >> 7 == Class65.anInt592) {
				Class180_Sub1.aBoolean2848 = false;
				Class120_Sub12_Sub26.anInt3327 = 0;
			}
			for (int i_19_ = 0; i_19_ < 104; i_19_++) {
				for (int i_20_ = 0; i_20_ < 104; i_20_++) {
					Class120_Sub14_Sub14_Sub1.anIntArrayArray3933[i_19_][i_20_] = 0;
				}
			}
			if (i <= 65) {
				method710((byte) -122, -87);
			}
			for (int i_21_ = 0; Class83.localPlayerCount > i_21_; i_21_++) {
				final Player class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_21_]];
				if (class180_sub5_sub1 != null) {
					((GameEntity) class180_sub5_sub1).aBoolean2986 = false;
				}
			}
			for (int i_22_ = 0; Class148.localNpcCount > i_22_; i_22_++) {
				final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_22_]];
				if (class180_sub5_sub2 != null) {
					((GameEntity) class180_sub5_sub2).aBoolean2986 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("im.G(").append(i).append(')').toString());
		}
	}

	Class82() {
		this.aBoolean780 = false;
		this.aBoolean784 = false;
	}
}
