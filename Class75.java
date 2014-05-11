/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75 {
	static boolean showGroundDecorations = true;
	private Node aClass120_670;
	private long aLong671;
	Node[] aClass120Array672;
	int anInt673;
	private Node aClass120_674;
	static int anInt675;
	private int anInt676 = 0;

	final int method654(final int i) {
		int i_0_;
		try {
			if (i != 0) {
				method657(66);
			}
			i_0_ = this.anInt673;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.F(").append(i).append(')').toString());
		}
		return i_0_;
	}

	final void method655(final Node node, final int i, final long l) {
		try {
			if (i >= 82) {
				if (node.previous != null) {
					node.unlink();
				}
				final Node class120_1_ = this.aClass120Array672[(int) (l & this.anInt673 + -1)];
				node.uid = l;
				node.next = class120_1_;
				node.previous = class120_1_.previous;
				node.previous.next = node;
				node.next.previous = node;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.I(").append(node != null ? "{...}" : "null").append(',').append(i).append(',').append(l).append(')').toString());
		}
	}

	final int method656(final int i) {
		int i_2_;
		try {
			int i_3_ = 0;
			for (int i_4_ = i; this.anInt673 > i_4_; i_4_++) {
				final Node node = this.aClass120Array672[i_4_];
				for (Node class120_5_ = node.next; node != class120_5_; class120_5_ = class120_5_.next) {
					i_3_++;
				}
			}
			i_2_ = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.B(").append(i).append(')').toString());
		}
		return i_2_;
	}

	final Node method657(final int i) {
		Node node;
		try {
			if (i != 13292) {
				method662((byte) -40);
			}
			anInt676 = 0;
			node = method658((byte) -119);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.G(").append(i).append(')').toString());
		}
		return node;
	}

	final Node method658(final byte i) {
		Node node;
		try {
			if (anInt676 > 0 && this.aClass120Array672[-1 + anInt676] != aClass120_674) {
				final Node class120_6_ = aClass120_674;
				aClass120_674 = class120_6_.next;
				return class120_6_;
			}
			if (i > -57) {
				return null;
			}
			while (anInt676 < this.anInt673) {
				final Node class120_7_ = this.aClass120Array672[anInt676++].next;
				if (class120_7_ != this.aClass120Array672[-1 + anInt676]) {
					aClass120_674 = class120_7_.next;
					return class120_7_;
				}
			}
			node = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.C(").append(i).append(')').toString());
		}
		return node;
	}

	final Node method659(final long l, final int i) {
		Node node;
		try {
			aLong671 = l;
			final Node class120_8_ = this.aClass120Array672[(int) (-1 + this.anInt673 & l)];
			for (aClass120_670 = class120_8_.next; class120_8_ != aClass120_670; aClass120_670 = aClass120_670.next) {
				if ((aClass120_670.uid ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
					final Node class120_9_ = aClass120_670;
					aClass120_670 = aClass120_670.next;
					return class120_9_;
				}
			}
			aClass120_670 = null;
			node = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.D(").append(l).append(',').append(i).append(')').toString());
		}
		return node;
	}

	final int method660(final int i, final Node[] class120s) {
		int i_10_;
		try {
			int i_11_ = i;
			for (int i_12_ = 0; this.anInt673 > i_12_; i_12_++) {
				final Node node = this.aClass120Array672[i_12_];
				for (Node class120_13_ = node.next; node != class120_13_; class120_13_ = class120_13_.next) {
					class120s[i_11_++] = class120_13_;
				}
			}
			i_10_ = i_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.E(").append(i).append(',').append(class120s != null ? "{...}" : "null").append(')').toString());
		}
		return i_10_;
	}

	Class75(final int i) {
		this.aClass120Array672 = new Node[i];
		this.anInt673 = i;
		for (int i_14_ = 0; i > i_14_; i_14_++) {
			final Node node = this.aClass120Array672[i_14_] = new Node();
			node.previous = node;
			node.next = node;
		}
	}

	final Node method661(final byte i) {
		Node node;
		try {
			if (aClass120_670 == null) {
				return null;
			}
			for (final Node class120_15_ = this.aClass120Array672[(int) (this.anInt673 + -1 & aLong671)]; class120_15_ != aClass120_670; aClass120_670 = aClass120_670.next) {
				if (aLong671 == aClass120_670.uid) {
					final Node class120_16_ = aClass120_670;
					aClass120_670 = aClass120_670.next;
					return class120_16_;
				}
			}
			aClass120_670 = null;
			if (i <= 85) {
				method654(53);
			}
			node = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.H(").append(i).append(')').toString());
		}
		return node;
	}

	final void method662(final byte i) {
		try {
			int i_17_ = 0;
			if (i < -91) {
				for (/**/; i_17_ < this.anInt673; i_17_++) {
					final Node node = this.aClass120Array672[i_17_];
					for (;;) {
						final Node class120_18_ = node.next;
						if (class120_18_ == node) {
							break;
						}
						class120_18_.unlink();
					}
				}
				aClass120_674 = null;
				aClass120_670 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ic.A(").append(i).append(')').toString());
		}
	}
}
