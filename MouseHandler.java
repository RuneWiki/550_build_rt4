/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	static int anInt1140;
	static byte aByte1141;
	static boolean showNumbersOnActions = false;

	static {
		anInt1140 = 0;
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.anInt1320 = 0;
				Class160.anInt1492 = mouseevent.getX();
				Class120_Sub12_Sub27.anInt3351 = mouseevent.getY();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseEntered(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	public MouseHandler() {
		/* empty */
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseClicked(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.anInt1320 = 0;
				Class160.anInt1492 = -1;
				Class120_Sub12_Sub27.anInt3351 = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseExited(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		try {
			do {
				if (Class120_Sub14_Sub4.mouseHandler != null) {
					Class136.anInt1320 = 0;
					Class42.anInt362 = 0;
					final int i = mouseevent.getModifiers();
					if ((0x10 & i) != 0) {
						break;
					}
				}
			} while (false);
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseReleased(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final Class128 method1026(final int i, final boolean bool) {
		Class128 class128;
		try {
			Class128 class128_0_ = (Class128) Class22.aClass21_131.method193(i, (byte) -85);
			if (class128_0_ != null) {
				return class128_0_;
			}
			final byte[] is = Class3.aClass50_55.method442(1, (byte) 124, i);
			class128_0_ = new Class128();
			if (is != null) {
				class128_0_.method1904(new Buffer(is), 0, i);
			}
			if (!bool) {
				method1028(-25);
			}
			Class22.aClass21_131.method185(-126, class128_0_, i);
			class128 = class128_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.C(").append(i).append(',').append(bool).append(')').toString());
		}
		return class128;
	}

	static final void method1027(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			Class120_Sub17 class120_sub17 = (Class120_Sub17) Canvas_Sub1.aClass75_15.method659(i_1_, -128);
			if (class120_sub17 == null) {
				class120_sub17 = new Class120_Sub17();
				Canvas_Sub1.aClass75_15.method655(class120_sub17, 121, i_1_);
			}
			if (class120_sub17.anIntArray2618.length <= i_2_) {
				final int[] is = new int[1 + i_2_];
				final int[] is_5_ = new int[i_2_ - -1];
				for (int i_6_ = 0; class120_sub17.anIntArray2618.length > i_6_; i_6_++) {
					is[i_6_] = class120_sub17.anIntArray2618[i_6_];
					is_5_[i_6_] = class120_sub17.anIntArray2619[i_6_];
				}
				for (int i_7_ = class120_sub17.anIntArray2618.length; i_7_ < i_2_; i_7_++) {
					is[i_7_] = -1;
					is_5_[i_7_] = 0;
				}
				class120_sub17.anIntArray2619 = is_5_;
				class120_sub17.anIntArray2618 = is;
			}
			if (i != 14378) {
				showNumbersOnActions = true;
			}
			class120_sub17.anIntArray2618[i_2_] = i_3_;
			class120_sub17.anIntArray2619[i_2_] = i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.B(").append(i).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.anInt1320 = 0;
				Class160.anInt1492 = mouseevent.getX();
				Class120_Sub12_Sub27.anInt3351 = mouseevent.getY();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseDragged(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class42.anInt362 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.focusLost(").append(focusevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		try {
			do {
				if (Class120_Sub14_Sub4.mouseHandler != null) {
					Class136.anInt1320 = 0;
					Class192.anInt2122 = mouseevent.getX();
					Class80.anInt751 = mouseevent.getY();
					Class186.aLong1897 = TimeUtil.getSafeTime();
					if (mouseevent.isMetaDown()) {
						GroundObject.anInt3627 = 2;
						Class42.anInt362 = 2;
					} else {
						GroundObject.anInt3627 = 1;
						Class42.anInt362 = 1;
					}
					final int i = mouseevent.getModifiers();
					if ((i & 0x4) == 0) {
						break;
					}
				}
			} while (false);
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mousePressed(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1028(final int i) {
		try {
			if (!Class154.aBoolean1439) {
				if (i < 20) {
					showNumbersOnActions = true;
				}
				Class154.aBoolean1439 = true;
				Class118.aBoolean1134 = true;
				if (!Class134.aBoolean1277) {
					Class120_Sub12_Sub4.aFloat3154 += (-Class120_Sub12_Sub4.aFloat3154 + -12.0F) / 2.0F;
				} else {
					Class120_Sub12_Sub21.aFloat3293 = -17 + (int) Class120_Sub12_Sub21.aFloat3293 & ~0xf;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.A(").append(i).append(')').toString());
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.anInt1320 = 0;
				Class160.anInt1492 = mouseevent.getX();
				Class120_Sub12_Sub27.anInt3351 = mouseevent.getY();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.mouseMoved(").append(mouseevent != null ? "{...}" : "null").append(')').toString());
		}
	}
}
