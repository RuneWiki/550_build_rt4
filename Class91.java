/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91 implements Runnable {
	static int anInt852 = 0;
	static String aString853 = "Allocating memory";
	static String aString854;
	static boolean frameResizable = false;
	static float aFloat856;
	Object anObject857;
	boolean aBoolean858 = true;
	int anInt859;
	int[] anIntArray860;
	int[] anIntArray861;

	static {
		aString854 = "K";
	}

	static final void method760(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			if (i_3_ > 65) {
				Class69_Sub1.anInt2229 = i_2_;
				Class180_Sub4.anInt2955 = i_4_;
				Class120_Sub12_Sub27.anInt3353 = i_1_;
				Class145.anInt1382 = i;
				Class120_Sub14_Sub13.anInt3571 = i_0_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jm.E(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	public static void method762(final byte i) {
		try {
			aString853 = null;
			if (i == -59) {
				aString854 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jm.C(").append(i).append(')').toString());
		}
	}

	@Override
	public final void run() {
		try {
			while (this.aBoolean858) {
				synchronized (this.anObject857) {
					if (this.anInt859 < 500) {
						this.anIntArray861[this.anInt859] = Queue.lastMouseX;
						this.anIntArray860[this.anInt859] = Class191.lastMouseY;
						this.anInt859++;
					}
				}
				PacketBuffer.sleepWrapper(50L);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "jm.run()");
		}
	}

	static final void method763(final int i, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_) {
		final JagexInterface jagexInterface = Class120_Sub13.method1404(i_10_, i_8_);
		if (jagexInterface != null && jagexInterface.anObjectArray1980 != null) {
			final Class120_Sub10 class120_sub10 = new Class120_Sub10();
			class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1980;
			class120_sub10.aClass189_2534 = jagexInterface;
			Class88.method744(true, class120_sub10);
		}
		Class88.aBoolean828 = true;
		Class192.anInt2123 = i_7_;
		Class139.anInt1330 = i_6_;
		JagexSocket.anInt420 = i_8_;
		Class150.anInt1417 = i_9_;
		AbstractMouseWheelHandler.anInt119 = i_10_;
		GroundTile.anInt2652 = i;
		InterfaceClickMask.redrawInterface(jagexInterface);
	}

	static final void method764(final int i, final int i_12_) {
		try {
			if (i_12_ != 3) {
				method762((byte) 113);
			}
			Class120_Sub12_Sub37.aClass21_3427.method192(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jm.A(").append(i).append(',').append(i_12_).append(')').toString());
		}
	}

	public Class91() {
		this.anObject857 = new Object();
		this.anIntArray861 = new int[500];
		this.anIntArray860 = new int[500];
		this.anInt859 = 0;
	}
}
