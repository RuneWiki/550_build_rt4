/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class35 {
	private NodeSub aClass120_Sub14_298 = new NodeSub();
	static boolean[] aBooleanArray299 = new boolean[112];
	static int[][] anIntArrayArray300;
	static int anInt301;
	private final Queue aClass177_302 = new Queue();
	static Class50 aClass50_303;
	private final Hashtable aClass75_304;
	private int anInt305;
	private final int anInt306;

	static final void addMouse(final Component component) {
		component.addMouseListener(Class120_Sub14_Sub4.mouseHandler);
		component.addMouseMotionListener(Class120_Sub14_Sub4.mouseHandler);
		component.addFocusListener(Class120_Sub14_Sub4.mouseHandler);
	}

	static final void method297(final int i) {
		try {
			Class73.aClass21_635.clear();
			Class11.aClass21_80.clear();
			Class180_Sub4.aClass21_2931.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.D(").append(i).append(')').toString());
		}
	}

	public static void method298(final int i) {
		try {
			aBooleanArray299 = null;
			aClass50_303 = null;
			anIntArrayArray300 = null;
			if (i != -51) {
				method300(-82, null, -71);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.C(").append(i).append(')').toString());
		}
	}

	final Node method299(final int i) {
		Node node;
		try {
			if (i < 11) {
				removeMouse(null);
			}
			node = aClass75_304.getFirst();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.G(").append(i).append(')').toString());
		}
		return node;
	}

	static final Class120_Sub22 method300(final int i, final Class50 class50, final int i_0_) {
		Class120_Sub22 class120_sub22;
		try {
			if (i_0_ != 112) {
				method300(81, null, -127);
			}
			final byte[] is = class50.method413(i, true);
			if (is == null) {
				return null;
			}
			class120_sub22 = new Class120_Sub22(is);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.F(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
		return class120_sub22;
	}

	final void method301(final long l, final int i, final NodeSub class120_sub14) {
		try {
			if (anInt305 != 0) {
				anInt305--;
			} else {
				NodeSub class120_sub14_1_ = aClass177_302.removeFirst();
				class120_sub14_1_.unlink();
				class120_sub14_1_.unlinkSub();
				if (aClass120_Sub14_298 == class120_sub14_1_) {
					class120_sub14_1_ = aClass177_302.removeFirst();
					class120_sub14_1_.unlink();
					class120_sub14_1_.unlinkSub();
				}
			}
			aClass75_304.put(class120_sub14, l);
			if (i > 28) {
				aClass177_302.insertLast(class120_sub14);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.E(").append(l).append(',').append(i).append(',').append(class120_sub14 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final NodeSub method302(final int i, final long l) {
		NodeSub class120_sub14;
		try {
			if (i != 17301) {
				return null;
			}
			final NodeSub class120_sub14_2_ = (NodeSub) aClass75_304.get(l);
			if (class120_sub14_2_ != null) {
				aClass177_302.insertLast(class120_sub14_2_);
			}
			class120_sub14 = class120_sub14_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.I(").append(i).append(',').append(l).append(')').toString());
		}
		return class120_sub14;
	}

	final Node method303(final int i) {
		Node node;
		try {
			if (i != -91) {
				method299(16);
			}
			node = aClass75_304.getNext();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.A(").append(i).append(')').toString());
		}
		return node;
	}

	static final void removeMouse(final Component component) {
		component.removeMouseListener(Class120_Sub14_Sub4.mouseHandler);
		component.removeMouseMotionListener(Class120_Sub14_Sub4.mouseHandler);
		component.removeFocusListener(Class120_Sub14_Sub4.mouseHandler);
		Class42.currentMousePress = 0;
	}

	static final String method305(final int i, final int i_3_) {
		String string;
		try {
			if (i > -8) {
				return null;
			}
			if ((i_3_ ^ 0xffffffff) > -100001) {
				return new StringBuilder("<col=ffff00>").append(i_3_).append("</col>").toString();
			}
			if ((i_3_ ^ 0xffffffff) > -10000001) {
				return new StringBuilder("<col=ffffff>").append(i_3_ / 1000).append(CursorType.aString1238).append("</col>").toString();
			}
			string = new StringBuilder("<col=00ff80>").append(i_3_ / 1000000).append(Class120_Sub14_Sub2.aString3455).append("</col>").toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.J(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return string;
	}

	final void method306(final byte i) {
		try {
			aClass177_302.clear();
			aClass75_304.clear();
			aClass120_Sub14_298 = new NodeSub();
			anInt305 = anInt306;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dj.H(").append(i).append(')').toString());
		}
	}

	Class35(final int i) {
		anInt305 = i;
		int i_4_;
		for (i_4_ = 1; i > i_4_ + i_4_; i_4_ += i_4_) {
			/* empty */
		}
		anInt306 = i;
		aClass75_304 = new Hashtable(i_4_);
	}
}
