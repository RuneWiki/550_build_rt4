/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectCache {
	static Class120_Sub14_Sub8 smallFont;
	static int anInt122 = -1;
	private final Hashtable hashtable;
	static int[] anIntArray124 = new int[14];
	private int capacity;
	private final Queue aClass177_126 = new Queue();
	private int defaultCapacity;

	final int getCount() {
		int count = 0;
		for (AbstractObject class120_sub14_sub3 = (AbstractObject) aClass177_126.peekFirst(); class120_sub14_sub3 != null; class120_sub14_sub3 = (AbstractObject) aClass177_126.peekNext()) {
			if (!class120_sub14_sub3.isSoftReference()) {
				count++;
			}
		}
		return count;
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
			smallFont = null;
			anIntArray124 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("cc.J(").append(i).append(')').toString());
		}
	}

	static final void method189(final js5 js5, final js5 class50_1_) {
		FileSystemWorker.aClass50_794 = class50_1_;
		LabelGroup.aClass50_2413 = js5;
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

	static final void method191() {
		Class173.method2225();
		Class132_Sub2.resetMinimapLandscape();
		Class110.method976();
		Class120_Sub14_Sub9.aClass35_3517.clear();
		Class82.aClass88_783 = new Class88();
		((Class143_Sub1) Rasterizer.anInterface5_973).method2025(0);
		Class41.method333();
		LightManager.lights = new Light[255];
		LightManager.lightsPos = 0;
		HDModel.method2436();
		Class47.method388();
		Class54.method479(0);
		Class120_Sub30_Sub1.method1739(false);
		Class79_Sub1.resetTitleScreen();
		Class82.method712(106);
		for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
			final Player class180_sub5_sub1 = Class118.playersList[i_2_];
			if (class180_sub5_sub1 != null) {
				class180_sub5_sub1.anObject3047 = null;
			}
		}
		if (HDToolkit.glEnabled) {
			Class47.method382(104, 104);
			ParticleManager.method933(Class186.hdrEnabled);
			ParticleEngine.method964();
		}
		Class8.constructFonts(Class7.aClass50_63, ClanMember.aClass50_2576);
		GameShell.constructSprites(Class7.aClass50_63);
		Class157.aClass120_Sub14_Sub19_1472 = null;
		FrameLoader.aClass120_Sub14_Sub19_3611 = null;
		Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = null;
		Class173.aClass120_Sub14_Sub19_1725 = null;
		RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = null;
		if (Class109.gameState == 5) {
			IsaacCipher.drawTitleScreenSprites(Class7.aClass50_63);
		}
		if (Class109.gameState == 10) {
			EnumType.method1421(false);
		}
		if (Class109.gameState == 30) {
			Class120_Sub14_Sub1.setGameState(25);
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

	ObjectCache(final int i) {
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

	static final void method194(final InterfaceListener listener, final int i) {
		final Object[] objects = listener.objectData;
		final int i_7_ = ((Integer) objects[0]).intValue();
		final ClientScript class120_sub14_sub12 = ClientScript.list(i_7_);
		if (class120_sub14_sub12 != null) {
			Class79_Sub1.stringArguments = new String[class120_sub14_sub12.stringArgumentCount];
			int i_8_ = 0;
			TileParticleQueue.intArguments = new int[class120_sub14_sub12.intArgumentCount];
			int i_9_ = 0;
			for (int i_10_ = 1; objects.length > i_10_; i_10_++) {
				if (objects[i_10_] instanceof Integer) {
					int i_11_ = ((Integer) objects[i_10_]).intValue();
					if (i_11_ == -2147483647) {
						i_11_ = listener.anInt2543;
					}
					if ((i_11_ ^ 0xffffffff) == 2147483645) {
						i_11_ = listener.anInt2540;
					}
					if (i_11_ == -2147483645) {
						i_11_ = listener.aClass189_2534 != null ? listener.aClass189_2534.bitPacked : -1;
					}
					if (-2147483644 == i_11_) {
						i_11_ = listener.anInt2541;
					}
					if ((i_11_ ^ 0xffffffff) == 2147483642) {
						i_11_ = listener.aClass189_2534 == null ? -1 : listener.aClass189_2534.componentIndex;
					}
					if ((i_11_ ^ 0xffffffff) == 2147483641) {
						i_11_ = listener.aClass189_2532 != null ? listener.aClass189_2532.bitPacked : -1;
					}
					if (2147483640 == (i_11_ ^ 0xffffffff)) {
						i_11_ = listener.aClass189_2532 != null ? listener.aClass189_2532.componentIndex : -1;
					}
					if (2147483639 == (i_11_ ^ 0xffffffff)) {
						i_11_ = listener.anInt2533;
					}
					if (i_11_ == -2147483639) {
						i_11_ = listener.anInt2535;
					}
					TileParticleQueue.intArguments[i_8_++] = i_11_;
				} else if (objects[i_10_] instanceof String) {
					String string = (String) objects[i_10_];
					if (string.equals("event_opbase")) {
						string = listener.aString2539;
					}
					Class79_Sub1.stringArguments[i_9_++] = string;
				}
			}
			World.method2194(class120_sub14_sub12, i);
		}
	}
}
