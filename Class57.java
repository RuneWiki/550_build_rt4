/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class57 {
	static js5 aClass50_499;
	static int anInt500 = 0;
	static Class84 aClass84_501;
	static int worldLen2;
	static boolean[] interfaceLoaded;
	static int anInt504 = 0;

	static {
		aClass84_501 = new Class84();
	}

	public static void method491(final int i) {
		try {
			if (i >= -14) {
				anInt500 = 96;
			}
			aClass84_501 = null;
			aClass50_499 = null;
			interfaceLoaded = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gh.D(").append(i).append(')').toString());
		}
	}

	static final void method492() {
		final int i_0_ = Class24.method207();
		if (i_0_ != 0) {
			if (i_0_ != 1) {
				LocType.method2465((byte) (-4 + InterfaceChangeNode.anInt3490 & 0xff), true);
				IsaacCipher.method905(2);
			} else {
				LocType.method2465((byte) 0, true);
				IsaacCipher.method905(512);
				if (Class114.tileSettings != null) {
					InvType.method1447(false);
				}
			}
		} else {
			Class9.aByteArrayArrayArray70 = null;
			IsaacCipher.method905(0);
		}
		Class153.anInt1436 = Class173.gameLevel;
	}

	abstract AbstractObject method493(int i, AbstractObject class120_sub14_sub3);

	static final void method494(final int i, final int i_1_) {
		Class120_Sub30_Sub2.anInt3688 = IdentityKit.aClass191ArrayArray1337[i][i_1_].anInt2110;
		Queue.anInt1768 = IdentityKit.aClass191ArrayArray1337[i][i_1_].anInt2112;
		ProducingGraphicsBuffer.anInt2798 = IdentityKit.aClass191ArrayArray1337[i][i_1_].anInt2107;
		Class117.method1014(Class120_Sub30_Sub2.anInt3688, Queue.anInt1768, ProducingGraphicsBuffer.anInt2798);
	}
	
	static final void sortArray(final int len, final Object[] objects, final int off, final int[] is) {//TODO figure out what kinda algo it uses, etc?
		if (len > off) {
			final int i_5_ = (off + len) / 2;
			int i_6_ = off;
			final int i_7_ = is[i_5_];
			is[i_5_] = is[len];
			is[len] = i_7_;
			final Object object = objects[i_5_];
			objects[i_5_] = objects[len];
			objects[len] = object;
			for (int i_8_ = off; i_8_ < len; i_8_++) {
				if (i_7_ + (i_8_ & 0x1) > is[i_8_]) {
					final int i_9_ = is[i_8_];
					is[i_8_] = is[i_6_];
					is[i_6_] = i_9_;
					final Object object_10_ = objects[i_8_];
					objects[i_8_] = objects[i_6_];
					objects[i_6_++] = object_10_;
				}
			}
			is[len] = is[i_6_];
			is[i_6_] = i_7_;
			objects[len] = objects[i_6_];
			objects[i_6_] = object;
			sortArray(i_6_ - 1, objects, off, is);
			sortArray(len, objects, 1 + i_6_, is);
		}
	}
}
