/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class5 implements ShaderInterface {
	private boolean aBoolean2151 = false;
	static short[] aShortArray2152;
	static String aString2153 = "Close";
	static int anInt2154 = 0;
	static int anInt2155;
	private int anInt2156 = -1;
	static int anInt2157;
	static boolean aBoolean2158;

	static {
		aShortArray2152 = new short[] { -10304, 9104, -1, -1, -1 };
		aBoolean2158 = false;
	}

	static final void method97(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ == -14327) {
				final Deque deque = Class120_Sub14_Sub12.groundObjects[Class173.gameLevel][i][i_0_];
				if (deque == null) {
					Class180_Sub6.method2356(Class173.gameLevel, i, i_0_);
				} else {
					int i_2_ = -99999999;
					GroundObject class120_sub14_sub21 = (GroundObject) deque.getFront();
					GroundObject class120_sub14_sub21_3_ = null;
					for (/**/; class120_sub14_sub21 != null; class120_sub14_sub21 = (GroundObject) deque.getNext()) {
						final ObjType objType = ObjType.list(class120_sub14_sub21.aClass180_Sub1_3630.id);
						int i_4_ = objType.cost;
						if (objType.stackable == 1) {
							i_4_ *= class120_sub14_sub21.aClass180_Sub1_3630.amount - -1;
						}
						if (i_4_ > i_2_) {
							i_2_ = i_4_;
							class120_sub14_sub21_3_ = class120_sub14_sub21;
						}
					}
					if (class120_sub14_sub21_3_ == null) {
						Class180_Sub6.method2356(Class173.gameLevel, i, i_0_);
					} else {
						deque.addFront(class120_sub14_sub21_3_);
						class120_sub14_sub21 = (GroundObject) deque.getFront();
						Class180_Sub1 class180_sub1 = null;
						Class180_Sub1 class180_sub1_5_ = null;
						for (/**/; class120_sub14_sub21 != null; class120_sub14_sub21 = (GroundObject) deque.getNext()) {
							final Class180_Sub1 class180_sub1_6_ = class120_sub14_sub21.aClass180_Sub1_3630;
							if (class120_sub14_sub21_3_.aClass180_Sub1_3630.id != class180_sub1_6_.id) {
								if (class180_sub1_5_ == null) {
									class180_sub1_5_ = class180_sub1_6_;
								}
								if (class180_sub1_5_.id != class180_sub1_6_.id && class180_sub1 == null) {
									class180_sub1 = class180_sub1_6_;
								}
							}
						}
						final long l = 1610612736 + i + (i_0_ << 7);
						Class136.method1978(Class173.gameLevel, i, i_0_, Class22.method197(64 + 128 * i_0_, true, 64 + i * 128, Class173.gameLevel), class120_sub14_sub21_3_.aClass180_Sub1_3630, l, class180_sub1_5_, class180_sub1);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ae.G(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final void method98(final int i) {
		Class190.anInt2101 = i;
		for (int i_7_ = 0; i_7_ < Class186.anInt1900; i_7_++) {
			for (int i_8_ = 0; i_8_ < Class120_Sub12_Sub38.anInt3440; i_8_++) {
				if (Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_7_][i_8_] == null) {
					Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_7_][i_8_] = new Class120_Sub18(i, i_7_, i_8_);
				}
			}
		}
	}

	@Override
	public final void method3() {
		try {
			final GL gl = HDToolkit.gl;
			HDToolkit.method521(1);
			if (Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297 != null && anInt2156 >= 0 && Class120_Sub12_Sub6.highLightingDetail) {
				gl.glCallList(anInt2156);
				gl.glActiveTexture(33985);
				Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297.method1494();
				gl.glMatrixMode(5890);
				gl.glLoadIdentity();
				gl.glRotatef(-(360.0F * Class145.anInt1382) / 2048.0F, 0.0F, 1.0F, 0.0F);
				gl.glRotatef(-(360.0F * Class120_Sub14_Sub13.anInt3571) / 2048.0F, 1.0F, 0.0F, 0.0F);
				gl.glScalef(-1.0F, 1.0F, 1.0F);
				gl.glMatrixMode(5888);
				gl.glActiveTexture(33984);
				aBoolean2151 = true;
			} else {
				gl.glTexEnvi(8960, 34184, 34167);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ae.B()");
		}
	}

	@Override
	public final void method2() {
		try {
			final GL gl = HDToolkit.gl;
			if (aBoolean2151) {
				gl.glCallList(anInt2156 + 1);
				aBoolean2151 = false;
			} else {
				gl.glTexEnvi(8960, 34184, 5890);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ae.A()");
		}
	}

	@Override
	public final int method4() {
		int i;
		try {
			anInt2155++;
			i = 4;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ae.C()");
		}
		return i;
	}

	@Override
	public final void method5(final int i) {
		/* empty */
	}

	static final void method99(final int i) {
		try {
			if (i != 1610612736) {
				method100(-79);
			}
			OutputStream_Sub1.aClass21_30.method190(false);
			Class120_Sub12_Sub27.aClass21_3342.method190(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ae.H(").append(i).append(')').toString());
		}
	}

	public Class5() {
		if (HDToolkit.aBoolean514) {
			final GL gl = HDToolkit.gl;
			anInt2156 = gl.glGenLists(2);
			gl.glNewList(anInt2156, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 34165);
			gl.glTexEnvi(8960, 34178, 34168);
			gl.glTexEnvi(8960, 34162, 7681);
			gl.glTexEnvi(8960, 34184, 34167);
			gl.glTexGeni(8192, 9472, 34066);
			gl.glTexGeni(8193, 9472, 34066);
			gl.glTexGeni(8194, 9472, 34066);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(34067);
			gl.glActiveTexture(33984);
			gl.glEndList();
			gl.glNewList(anInt2156 - -1, 4864);
			gl.glActiveTexture(33985);
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34178, 34166);
			gl.glTexEnvi(8960, 34162, 8448);
			gl.glTexEnvi(8960, 34184, 5890);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			gl.glActiveTexture(33984);
			gl.glEndList();
		}
	}

	public static void method100(final int i) {
		try {
			aString2153 = null;
			if (i != -22938) {
				method99(55);
			}
			aShortArray2152 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ae.E(").append(i).append(')').toString());
		}
	}
}
