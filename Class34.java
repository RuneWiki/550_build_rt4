/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class34 {
	private static int anInt279 = 0;
	private static int anInt280 = 0;
	private static int anInt281;
	private static int anInt282 = -1;
	private static int anInt283;
	private static Deque aClass105_284;
	private static boolean aBoolean285;
	private static boolean aBoolean286;
	private static boolean aBoolean287;
	private static boolean aBoolean288;
	private static int anInt289;
	private static boolean aBoolean290;
	private static boolean aBoolean291;
	private static int[] anIntArray292;
	private static int anInt293;
	private static int anInt294;
	private static Class120_Sub2_Sub1 aClass120_Sub2_Sub1_295;

	static {
		anInt281 = -1;
		anInt283 = -1;
		aClass105_284 = new Deque();
		aBoolean290 = false;
		aBoolean286 = false;
		aBoolean287 = false;
		aBoolean288 = true;
		aBoolean285 = true;
		anIntArray292 = new int[2];
		anInt293 = -1;
		aBoolean291 = true;
		anInt289 = 0;
		anInt294 = -1;
	}

	private static final void method279() {
		int i = 0;
		int i_0_ = 0;
		boolean bool = true;
		boolean bool_1_ = false;
		for (Class120_Sub2 class120_sub2 = (Class120_Sub2) aClass105_284.getFront(); class120_sub2 != null; class120_sub2 = (Class120_Sub2) aClass105_284.getNext()) {
			final int i_2_ = class120_sub2.method1041();
			if (i_2_ > i) {
				i = i_2_;
			}
			bool |= class120_sub2.method1051();
			bool_1_ |= class120_sub2.method1054();
			i_0_ += class120_sub2.method1040();
		}
		int i_3_;
		if (i == 2) {
			i_3_ = bool ? Class163.anInt1575 : Class163.anInt1574;
		} else if (i == 1) {
			i_3_ = bool ? Class163.anInt1573 : Class163.anInt1572;
		} else {
			i_3_ = bool ? Class163.anInt1570 : Class163.anInt1569;
		}
		if (i_3_ != anInt293) {
			anInt293 = i_3_;
			aBoolean288 = true;
		}
		final int i_4_ = anInt289 > 2 ? 2 : anInt289;
		final int i_5_ = i_0_ > 2 ? 2 : i_0_;
		if (i_4_ != i_5_) {
			aBoolean291 = aBoolean288 = true;
		}
		if (bool_1_ != aBoolean290) {
			aBoolean287 = bool_1_;
			aBoolean285 = true;
		}
		anInt289 = i_0_;
	}

	static final boolean method280() {
		if (method290()) {
			return true;
		}
		if (!method286()) {
			return false;
		}
		if (!method284(aClass120_Sub2_Sub1_295)) {
			method282();
			return false;
		}
		return true;
	}

	static final void method281() {
		if (HDToolkit.aBoolean531 && HDToolkit.aBoolean513) {
			final GL gl = HDToolkit.gl;
			final int[] is = new int[1];
			gl.glGetIntegerv(36063, is, 0);
			if (is[0] >= 2) {
				gl.glGenTextures(2, anIntArray292, 0);
				anInt282 = Class12.method134();
			}
			for (Node node = aClass105_284.getFront(); node != null; node = aClass105_284.getNext()) {
				final Class120_Sub2 class120_sub2 = (Class120_Sub2) node;
				if (!class120_sub2.method1049()) {
					class120_sub2.unlink();
				}
			}
			if (aClass120_Sub2_Sub1_295 == null) {
				aClass120_Sub2_Sub1_295 = new Class120_Sub2_Sub1();
			}
			if (!aClass120_Sub2_Sub1_295.method1053() && !aClass120_Sub2_Sub1_295.method1049()) {
				aClass120_Sub2_Sub1_295.method1047();
			}
			method279();
		}
	}

	static final void method282() {
		if (aClass120_Sub2_Sub1_295.method1042()) {
			method285(aClass120_Sub2_Sub1_295, false);
		}
	}

	static final boolean method283(final int i, final int i_6_, final int i_7_, final int i_8_) {
		if (anInt282 == -1 || aClass105_284.isEmpty()) {
			aBoolean286 = false;
			return false;
		}
		anInt280 = i;
		anInt279 = i_6_;
		boolean bool = false;
		if (anInt283 != i_7_ || anInt281 != i_8_) {
			anInt283 = i_7_;
			anInt281 = i_8_;
			for (Node node = aClass105_284.getFront(); node != aClass105_284.head; node = node.next) {
				((Class120_Sub2) node).method1052(anInt283, anInt281);
			}
			aBoolean288 = true;
			aBoolean285 = true;
		}
		final GL gl = HDToolkit.gl;
		if (aBoolean285) {
			if (anInt294 != -1 && aBoolean287 != aBoolean290) {
				if (aBoolean290) {
					Class163.method2123(anInt294);
				} else {
					Class12.method138(anInt294);
				}
				anInt294 = -1;
			}
			if (anInt294 == -1) {
				aBoolean290 = aBoolean287;
				if (aBoolean290) {
					anInt294 = Class163.method2126();
				} else {
					anInt294 = Class12.method131();
				}
				aBoolean291 = true;
			}
			if (aBoolean290) {
				gl.glBindTexture(34037, anInt294);
				Class163.method2120(Class163.anInt1568, Class163.anInt1577, anInt283, anInt281, Class163.anInt1577, Class163.anInt1581, null);
			} else {
				gl.glBindRenderbufferEXT(36161, anInt294);
				gl.glRenderbufferStorageEXT(36161, 6402, anInt283, anInt281);
			}
			aBoolean285 = false;
			bool = true;
		}
		if (aBoolean288) {
			gl.glBindTexture(34037, anIntArray292[0]);
			Class163.method2121(anInt293, anInt283, anInt281);
			gl.glTexParameteri(3553, 10241, 9729);
			gl.glTexParameteri(3553, 10240, 9729);
			if (anInt289 > 1) {
				gl.glBindTexture(34037, anIntArray292[1]);
				Class163.method2121(anInt293, anInt283, anInt281);
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
			} else {
				gl.glBindTexture(34037, anIntArray292[1]);
				Class163.method2121(anInt293, 0, 0);
			}
			aBoolean288 = false;
			bool = true;
		}
		Class12.method140(anInt282);
		if (aBoolean291) {
			gl.glFramebufferTexture2DEXT(36160, 36064, 34037, anIntArray292[0], 0);
			gl.glFramebufferTexture2DEXT(36160, 36065, 34037, anInt289 > 1 ? anIntArray292[1] : 0, 0);
			if (aBoolean290) {
				gl.glFramebufferTexture2DEXT(36160, 36096, 34037, anInt294, 0);
			} else {
				gl.glFramebufferRenderbufferEXT(36160, 36096, 36161, anInt294);
			}
			gl.glDrawBuffer(36064);
			aBoolean291 = false;
			bool = true;
		}
		if (bool) {
			if (!Class12.method141()) {
				Class12.method139();
				aBoolean288 = true;
				aBoolean285 = true;
				aBoolean291 = true;
				aBoolean286 = false;
			} else {
				aBoolean286 = true;
			}
		}
		HDToolkit.setViewportOffset(-anInt280, anInt279 + anInt281 - HDToolkit.canvasHeight);
		return aBoolean286;
	}

	private static final boolean method284(final Class120_Sub2 class120_sub2) {
		if (anInt282 != -1) {
			if (class120_sub2.method1053() || class120_sub2.method1049()) {
				if (anInt283 != -1 && anInt281 != -1) {
					class120_sub2.method1052(anInt283, anInt281);
				}
				class120_sub2.aBoolean2418 = true;
				aClass105_284.addLast(class120_sub2);
				method279();
				return true;
			}
			class120_sub2.method1047();
		}
		return false;
	}

	private static final void method285(final Class120_Sub2 class120_sub2, final boolean bool) {
		if (bool) {
			class120_sub2.method1047();
		}
		class120_sub2.aBoolean2418 = false;
		class120_sub2.unlink();
		method279();
	}

	static final boolean method286() {
		if (anInt282 != -1 && aClass120_Sub2_Sub1_295.method1053()) {
			return true;
		}
		return false;
	}

	public static void method287() {
		aClass105_284 = null;
		anIntArray292 = null;
		aClass120_Sub2_Sub1_295 = null;
	}

	static final boolean method288() {
		if (anInt282 != -1) {
			return true;
		}
		return false;
	}

	static final void method289() {
		if (aBoolean286) {
			final GL gl = HDToolkit.gl;
			HDToolkit.method510();
			GraphicsHD.clipRect();
			gl.glDisable(3042);
			gl.glDisable(3008);
			HDToolkit.disableDepthMask();
			int i = 0;
			int i_9_ = 1;
			Class120_Sub2 class120_sub2;
			for (Class120_Sub2 class120_sub2_10_ = (Class120_Sub2) aClass105_284.getFront(); class120_sub2_10_ != null; class120_sub2_10_ = class120_sub2) {
				class120_sub2 = (Class120_Sub2) aClass105_284.getNext();
				final int i_11_ = class120_sub2_10_.method1040();
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					class120_sub2_10_.method1048(i_12_, anInt283, anInt281, anIntArray292[i], anInt294);
					if (class120_sub2 == null && i_12_ == i_11_ - 1) {
						anInt279 = HDToolkit.canvasHeight - anInt279;
						HDToolkit.setViewportOffset(0, 0);
						gl.glDrawBuffer(36064);
						Class12.method139();
						gl.glBegin(7);
						gl.glTexCoord2f(0.0F, 0.0F);
						gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						gl.glVertex2i(anInt280, anInt279 - anInt281);
						gl.glTexCoord2f(anInt283, 0.0F);
						gl.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						gl.glVertex2i(anInt280 + anInt283, anInt279 - anInt281);
						gl.glTexCoord2f(anInt283, anInt281);
						gl.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						gl.glVertex2i(anInt280 + anInt283, anInt279);
						gl.glTexCoord2f(0.0F, anInt281);
						gl.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						gl.glVertex2i(anInt280, anInt279);
						gl.glEnd();
					} else {
						gl.glDrawBuffer(36064 + i_9_);
						gl.glBegin(7);
						gl.glTexCoord2f(0.0F, 0.0F);
						gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						gl.glVertex2i(0, 0);
						gl.glTexCoord2f(anInt283, 0.0F);
						gl.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						gl.glVertex2i(anInt283, 0);
						gl.glTexCoord2f(anInt283, anInt281);
						gl.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						gl.glVertex2i(anInt283, anInt281);
						gl.glTexCoord2f(0.0F, anInt281);
						gl.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						gl.glVertex2i(0, anInt281);
						gl.glEnd();
					}
					class120_sub2_10_.method1043(i_12_);
					i_9_ = i_9_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			gl.glEnable(3008);
			gl.glEnable(3042);
			HDToolkit.enableDepthMask();
		}
	}

	static final boolean method290() {
		if (anInt282 != -1 && aClass120_Sub2_Sub1_295.method1042()) {
			return true;
		}
		return false;
	}

	static final void method291() {
		if (anInt282 != -1) {
			Class12.method135(anInt282);
			anInt282 = -1;
			HDToolkit.gl.glDeleteTextures(2, anIntArray292, 0);
			anIntArray292[0] = -1;
			anIntArray292[1] = -1;
		}
		if (anInt294 != -1) {
			if (aBoolean290) {
				Class163.method2123(anInt294);
			} else {
				Class12.method138(anInt294);
			}
			anInt294 = -1;
		}
		if (!aClass105_284.isEmpty()) {
			for (Node node = aClass105_284.getFront(); node != aClass105_284.head; node = node.next) {
				((Class120_Sub2) node).method1047();
			}
		}
		if (aClass120_Sub2_Sub1_295 != null && aClass120_Sub2_Sub1_295.method1053()) {
			aClass120_Sub2_Sub1_295.method1047();
		}
		aBoolean288 = true;
		aBoolean285 = true;
		aBoolean291 = true;
		anInt283 = anInt281 = -1;
	}
}
