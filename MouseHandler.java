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
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			Class160.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
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
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			Class160.currentMouseX = -1;
			Class120_Sub12_Sub27.currentMouseY = -1;
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		do {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.mouseIdleCycle = 0;
				Class42.currentMousePress = 0;
				final int i = mouseevent.getModifiers();
				if ((0x10 & i) != 0) {
					break;
				}
			}
		} while (false);
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}

	static final Class128 method1026(final int i, final boolean bool) {
		Class128 class128;
		try {
			Class128 class128_0_ = (Class128) Class22.aClass21_131.get(i);
			if (class128_0_ != null) {
				return class128_0_;
			}
			final byte[] is = Class3.aClass50_55.getFile(1, i);
			class128_0_ = new Class128();
			if (is != null) {
				class128_0_.method1904(new Buffer(is), 0, i);
			}
			if (!bool) {
				method1028();
			}
			Class22.aClass21_131.put(class128_0_, i);
			class128 = class128_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nf.C(").append(i).append(',').append(bool).append(')').toString());
		}
		return class128;
	}

	static final void method1027(final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		Class120_Sub17 class120_sub17 = (Class120_Sub17) Canvas_Sub1.aClass75_15.get(i_1_);
		if (class120_sub17 == null) {
			class120_sub17 = new Class120_Sub17();
			Canvas_Sub1.aClass75_15.put(class120_sub17, i_1_);
		}
		if (class120_sub17.anIntArray2618.length <= i_2_) {
			final int[] is = new int[i_2_ + 1];
			final int[] is_5_ = new int[i_2_ + 1];
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
		class120_sub17.anIntArray2618[i_2_] = i_3_;
		class120_sub17.anIntArray2619[i_2_] = i_4_;
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			Class160.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class42.currentMousePress = 0;
		}
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		do {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.mouseIdleCycle = 0;
				Class192.currentClickX = mouseevent.getX();
				Class80.currentClickY = mouseevent.getY();
				Class186.currentClickTime = TimeUtil.getSafeTime();
				if (mouseevent.isMetaDown()) {
					GroundObjectNode.currentMouseClick = 2;
					Class42.currentMousePress = 2;
				} else {
					GroundObjectNode.currentMouseClick = 1;
					Class42.currentMousePress = 1;
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
	}

	static final void method1028() {
		if (!Class154.aBoolean1439) {
			Class154.aBoolean1439 = true;
			Class118.aBoolean1134 = true;
			if (!Class134.aBoolean1277) {
				Class120_Sub12_Sub4.aFloat3154 += (-Class120_Sub12_Sub4.aFloat3154 + -12.0F) / 2.0F;
			} else {
				Class120_Sub12_Sub21.aFloat3293 = -17 + (int) Class120_Sub12_Sub21.aFloat3293 & ~0xf;
			}
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			Class160.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
		}
	}
}
