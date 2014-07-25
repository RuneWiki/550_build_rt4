/* Class120_Sub30_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub30_Sub3 extends Class120_Sub30 {
	private final Deque aClass105_3711 = new Deque();
	private final Deque aClass105_3712 = new Deque();
	private int anInt3713 = 0;
	private int anInt3714 = -1;

	@Override
	final synchronized void method1734(final int[] is, int i, int i_0_) {
		do {
			if (anInt3714 < 0) {
				method1786(is, i, i_0_);
				break;
			}
			if (anInt3713 + i_0_ < anInt3714) {
				anInt3713 += i_0_;
				method1786(is, i, i_0_);
				break;
			}
			final int i_1_ = anInt3714 - anInt3713;
			method1786(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			anInt3713 += i_1_;
			method1782();
			final Class120_Sub33 class120_sub33 = (Class120_Sub33) aClass105_3712.getFront();
			synchronized (class120_sub33) {
				final int i_2_ = class120_sub33.method1835(this);
				if (i_2_ < 0) {
					class120_sub33.anInt2794 = 0;
					method1781(class120_sub33);
				} else {
					class120_sub33.anInt2794 = i_2_;
					method1785(class120_sub33.next, class120_sub33);
				}
			}
		} while (i_0_ != 0);
	}

	private final void method1781(final Class120_Sub33 class120_sub33) {
		class120_sub33.unlink();
		class120_sub33.method1834();
		final Node node = aClass105_3712.head.next;
		if (node == aClass105_3712.head) {
			anInt3714 = -1;
		} else {
			anInt3714 = ((Class120_Sub33) node).anInt2794;
		}
	}

	private final void method1782() {
		if (anInt3713 > 0) {
			for (Class120_Sub33 class120_sub33 = (Class120_Sub33) aClass105_3712.getFront(); class120_sub33 != null; class120_sub33 = (Class120_Sub33) aClass105_3712.getNext()) {
				class120_sub33.anInt2794 -= anInt3713;
			}
			anInt3714 -= anInt3713;
			anInt3713 = 0;
		}
	}

	final synchronized void method1783(final Class120_Sub30 class120_sub30) {
		class120_sub30.unlink();
	}

	@Override
	final synchronized void method1731(int i) {
		do {
			if (anInt3714 < 0) {
				method1784(i);
				break;
			}
			if (anInt3713 + i < anInt3714) {
				anInt3713 += i;
				method1784(i);
				break;
			}
			final int i_3_ = anInt3714 - anInt3713;
			method1784(i_3_);
			i -= i_3_;
			anInt3713 += i_3_;
			method1782();
			final Class120_Sub33 class120_sub33 = (Class120_Sub33) aClass105_3712.getFront();
			synchronized (class120_sub33) {
				final int i_4_ = class120_sub33.method1835(this);
				if (i_4_ < 0) {
					class120_sub33.anInt2794 = 0;
					method1781(class120_sub33);
				} else {
					class120_sub33.anInt2794 = i_4_;
					method1785(class120_sub33.next, class120_sub33);
				}
			}
		} while (i != 0);
	}

	private final void method1784(final int i) {
		for (Class120_Sub30 class120_sub30 = (Class120_Sub30) aClass105_3711.getFront(); class120_sub30 != null; class120_sub30 = (Class120_Sub30) aClass105_3711.getNext()) {
			class120_sub30.method1731(i);
		}
	}

	@Override
	final Class120_Sub30 method1735() {
		return (Class120_Sub30) aClass105_3711.getNext();
	}

	private final void method1785(Node node, final Class120_Sub33 class120_sub33) {
		for (/**/; node != aClass105_3712.head && ((Class120_Sub33) node).anInt2794 <= class120_sub33.anInt2794; node = node.next) {
			/* empty */
		}
		InterfaceClickMask.method1679(node, class120_sub33);
		anInt3714 = ((Class120_Sub33) aClass105_3712.head.next).anInt2794;
	}

	@Override
	final int method1732() {
		return 0;
	}

	private final void method1786(final int[] is, final int i, final int i_5_) {
		for (Class120_Sub30 class120_sub30 = (Class120_Sub30) aClass105_3711.getFront(); class120_sub30 != null; class120_sub30 = (Class120_Sub30) aClass105_3711.getNext()) {
			class120_sub30.method1737(is, i, i_5_);
		}
	}

	@Override
	final Class120_Sub30 method1736() {
		return (Class120_Sub30) aClass105_3711.getFront();
	}

	final synchronized void method1787(final Class120_Sub30 class120_sub30) {
		aClass105_3711.addFront(class120_sub30);
	}

	public Class120_Sub30_Sub3() {
		/* empty */
	}
}
