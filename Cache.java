/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Cache {
	static Class120_Sub14_Sub8 aClass120_Sub14_Sub8_121;
	static int anInt122 = -1;
	private final Hashtable hashtable;
	static int[] anIntArray124 = new int[14];
	private int capacity;
	private final Queue aClass177_126 = new Queue();
	private int defaultCapacity;

	final int getCount() {
		int i_0_ = 0;
		for (AbstractObject class120_sub14_sub3 = (AbstractObject) aClass177_126.peekFirst(); class120_sub14_sub3 != null; class120_sub14_sub3 = (AbstractObject) aClass177_126.peekNext()) {
			if (!class120_sub14_sub3.isSoftReference()) {
				i_0_++;
			}
		}
		return i_0_;
	}

	final void put(final Object object, final long l) {
		remove(l);
		if (capacity != 0) {
			capacity--;
		} else {
			final AbstractObject class120_sub14_sub3 = (AbstractObject) aClass177_126.removeFirst();
			class120_sub14_sub3.unlink();
			class120_sub14_sub3.unlinkSub();
		}
		final JavaObject class120_sub14_sub3_sub1 = new JavaObject(object);
		hashtable.put(class120_sub14_sub3_sub1, l);
		aClass177_126.insertLast(class120_sub14_sub3_sub1);
		class120_sub14_sub3_sub1.subUid = 0L;
	}

	final void clear() {
		aClass177_126.clear();
		hashtable.clear();
		capacity = defaultCapacity;
	}

	final void remove(final long l) {
		final AbstractObject class120_sub14_sub3 = (AbstractObject) hashtable.get(l);
		if (class120_sub14_sub3 != null) {
			class120_sub14_sub3.unlink();
			class120_sub14_sub3.unlinkSub();
			capacity++;
		}
	}

	public static void method188(final int i) {
		try {
			aClass120_Sub14_Sub8_121 = null;
			anIntArray124 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cc.J(").append(i).append(')').toString());
		}
	}

	static final void method189(final Class50 class50, final int i, final Class50 class50_1_) {
		try {
			Class83.aClass50_794 = class50_1_;
			Class120_Sub1.aClass50_2413 = class50;
			if (i != 0) {
				aClass120_Sub14_Sub8_121 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cc.K(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(class50_1_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void clearSoftReference() {
		for (AbstractObject class120_sub14_sub3 = (AbstractObject) aClass177_126.peekFirst(); class120_sub14_sub3 != null; class120_sub14_sub3 = (AbstractObject) aClass177_126.peekNext()) {
			if (class120_sub14_sub3.isSoftReference()) {
				class120_sub14_sub3.unlink();
				class120_sub14_sub3.unlinkSub();
				capacity++;
			}
		}
	}

	static final void method191(final int i) {
		try {
			Class173.method2225();
			Class132_Sub2.method1937((byte) 59);
			Class110.method976(-7603);
			Class120_Sub14_Sub9.aClass35_3517.method306((byte) -87);
			Class82.aClass88_783 = new Class88();
			((Class143_Sub1) Rasterizer.anInterface5_973).method2025(0);
			Class41.method333();
			LightManager.lights = new Light[255];
			LightManager.lightsPos = 0;
			Class180_Sub7_Sub2.method2436();
			Class47.method388();
			Class54.method479(0);
			Class120_Sub30_Sub1.method1739(false, (byte) -93);
			Class79_Sub1.method693(i ^ 0x2c82);
			Class82.method712(106);
			for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
				final Player class180_sub5_sub1 = Class118.playersList[i_2_];
				if (class180_sub5_sub1 != null) {
					class180_sub5_sub1.anObject3047 = null;
				}
			}
			if (HDToolkit.glEnabled) {
				Class47.method382(104, 104);
				Class108_Sub1.method933(Class186.aBoolean1902, i ^ 0x387be992);
				ParticleEngine.method964();
			}
			Class8.method109(Class7.aClass50_63, Class120_Sub13.aClass50_2576, (byte) 124);
			GameShell.method34(Class7.aClass50_63, (byte) 51);
			Class157.aClass120_Sub14_Sub19_1472 = null;
			Class120_Sub14_Sub18.aClass120_Sub14_Sub19_3611 = null;
			if (i != 11650) {
				method194(null, true, 13);
			}
			Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = null;
			Class173.aClass120_Sub14_Sub19_1725 = null;
			RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = null;
			if (Class109.gameState == 5) {
				IsaacCipher.method900(62, Class7.aClass50_63);
			}
			if (Class109.gameState == 10) {
				Class120_Sub14_Sub2.method1421(false);
			}
			if (Class109.gameState == 30) {
				Class120_Sub14_Sub1.setGameState(25);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cc.H(").append(i).append(')').toString());
		}
	}

	final void method192(final int i_3_) {
		if (Class125.aClass57_2147 != null) {
			for (AbstractObject class120_sub14_sub3 = (AbstractObject) aClass177_126.peekFirst(); class120_sub14_sub3 != null; class120_sub14_sub3 = (AbstractObject) aClass177_126.peekNext()) {
				if (!class120_sub14_sub3.isSoftReference()) {
					if (++class120_sub14_sub3.subUid > i_3_) {
						final AbstractObject class120_sub14_sub3_4_ = Class125.aClass57_2147.method493(-91, class120_sub14_sub3);
						hashtable.put(class120_sub14_sub3_4_, class120_sub14_sub3.uid);
						Class120_Sub12_Sub15.method1275(class120_sub14_sub3, (byte) 116, class120_sub14_sub3_4_);
						class120_sub14_sub3.unlink();
						class120_sub14_sub3.unlinkSub();
					}
				} else if (class120_sub14_sub3.get() == null) {
					class120_sub14_sub3.unlink();
					class120_sub14_sub3.unlinkSub();
					capacity++;
				}
			}
		}
	}

	Cache(final int i) {
		defaultCapacity = i;
		capacity = i;
		int i_5_;
		for (i_5_ = 1; i_5_ + i_5_ < i; i_5_ += i_5_) {
			/* empty */
		}
		hashtable = new Hashtable(i_5_);
	}

	final Object get(final long l) {
		final AbstractObject abstractObject = (AbstractObject) hashtable.get(l);
		if (abstractObject == null) {
			return null;
		}
		final Object value = abstractObject.get();
		if (value == null) {
			abstractObject.unlink();
			abstractObject.unlinkSub();
			capacity++;
			return null;
		}
		if (!abstractObject.isSoftReference()) {
			aClass177_126.insertLast(abstractObject);
			abstractObject.subUid = 0L;
		} else {
			final JavaObject class120_sub14_sub3_sub1 = new JavaObject(value);
			hashtable.put(class120_sub14_sub3_sub1, abstractObject.uid);
			aClass177_126.insertLast(class120_sub14_sub3_sub1);
			((AbstractObject) class120_sub14_sub3_sub1).subUid = 0L;
			abstractObject.unlink();
			abstractObject.unlinkSub();
		}
		return value;
	}

	static final void method194(final Class120_Sub10 class120_sub10, final boolean bool, final int i) {
		try {
			final Object[] objects = class120_sub10.anObjectArray2537;
			final int i_7_ = ((Integer) objects[0]).intValue();
			final Class120_Sub14_Sub12 class120_sub14_sub12 = Class28.method246(bool, i_7_);
			if (class120_sub14_sub12 != null) {
				Class79_Sub1.aStringArray2243 = new String[class120_sub14_sub12.anInt3555];
				int i_8_ = 0;
				Class100.anIntArray956 = new int[class120_sub14_sub12.anInt3557];
				int i_9_ = 0;
				for (int i_10_ = 1; objects.length > i_10_; i_10_++) {
					if (objects[i_10_] instanceof Integer) {
						int i_11_ = ((Integer) objects[i_10_]).intValue();
						if (i_11_ == -2147483647) {
							i_11_ = class120_sub10.anInt2543;
						}
						if ((i_11_ ^ 0xffffffff) == 2147483645) {
							i_11_ = class120_sub10.anInt2540;
						}
						if (i_11_ == -2147483645) {
							i_11_ = class120_sub10.aClass189_2534 != null ? class120_sub10.aClass189_2534.bitPacked : -1;
						}
						if (-2147483644 == i_11_) {
							i_11_ = class120_sub10.anInt2541;
						}
						if ((i_11_ ^ 0xffffffff) == 2147483642) {
							i_11_ = class120_sub10.aClass189_2534 == null ? -1 : class120_sub10.aClass189_2534.anInt2083;
						}
						if ((i_11_ ^ 0xffffffff) == 2147483641) {
							i_11_ = class120_sub10.aClass189_2532 != null ? class120_sub10.aClass189_2532.bitPacked : -1;
						}
						if (2147483640 == (i_11_ ^ 0xffffffff)) {
							i_11_ = class120_sub10.aClass189_2532 != null ? class120_sub10.aClass189_2532.anInt2083 : -1;
						}
						if (2147483639 == (i_11_ ^ 0xffffffff)) {
							i_11_ = class120_sub10.anInt2533;
						}
						if (i_11_ == -2147483639) {
							i_11_ = class120_sub10.anInt2535;
						}
						Class100.anIntArray956[i_8_++] = i_11_;
					} else if (objects[i_10_] instanceof String) {
						String string = (String) objects[i_10_];
						if (string.equals("event_opbase")) {
							string = class120_sub10.aString2539;
						}
						Class79_Sub1.aStringArray2243[i_9_++] = string;
					}
				}
				Class167_Sub1.method2194(i, 1006199388, class120_sub14_sub12);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cc.E(").append(class120_sub10 != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(')').toString());
		}
	}
}
