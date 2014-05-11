/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105 {
	static int anInt1007;
	Node aClass120_1008 = new Node();
	private Node aClass120_1009;

	static final int method888(final int i, final byte i_0_) {
		int i_1_;
		try {
			int i_2_ = i >>> 1;
			i_2_ |= i_2_ >>> 1;
			if (i_0_ <= 95) {
				method894(-41, 11, 79);
			}
			i_2_ |= i_2_ >>> 2;
			i_2_ |= i_2_ >>> 4;
			i_2_ |= i_2_ >>> 8;
			i_2_ |= i_2_ >>> 16;
			i_1_ = i & (i_2_ ^ 0xffffffff);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	final void method889(final int i) {
		try {
			if (i == 1986850152) {
				for (;;) {
					final Node node = this.aClass120_1008.next;
					if (this.aClass120_1008 == node) {
						break;
					}
					node.unlink();
				}
				aClass120_1009 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.E(").append(i).append(')').toString());
		}
	}

	final void method890(final Node node, final byte i) {
		try {
			if (node.previous != null) {
				node.unlink();
			}
			if (i > -75) {
				this.aClass120_1008 = null;
			}
			node.previous = this.aClass120_1008;
			node.next = this.aClass120_1008.next;
			node.previous.next = node;
			node.next.previous = node;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.F(").append(node != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final Node method891(final boolean bool) {
		Node node;
		try {
			final Node class120_3_ = this.aClass120_1008.next;
			if (class120_3_ == this.aClass120_1008) {
				return null;
			}
			if (bool) {
				return null;
			}
			class120_3_.unlink();
			node = class120_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.B(").append(bool).append(')').toString());
		}
		return node;
	}

	final boolean method892(final int i) {
		boolean bool;
		try {
			if (i != -29937) {
				return false;
			}
			bool = this.aClass120_1008.next == this.aClass120_1008;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.G(").append(i).append(')').toString());
		}
		return bool;
	}

	final Node method893(final int i) {
		Node node;
		try {
			final Node class120_4_ = this.aClass120_1008.next;
			if (i != 1253231568) {
				return null;
			}
			if (class120_4_ == this.aClass120_1008) {
				aClass120_1009 = null;
				return null;
			}
			aClass120_1009 = class120_4_.next;
			node = class120_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.A(").append(i).append(')').toString());
		}
		return node;
	}

	static final Class182 method894(final int i, final int i_5_, final int i_6_) {
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_5_][i_6_];
		if (class120_sub18 == null) {
			return null;
		}
		return class120_sub18.aClass182_2628;
	}

	final void method895(final byte i, final Node node) {
		try {
			if (node.previous != null) {
				node.unlink();
			}
			node.previous = this.aClass120_1008.previous;
			node.next = this.aClass120_1008;
			node.previous.next = node;
			node.next.previous = node;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.K(").append(i).append(',').append(node != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Node method896(final byte i) {
		Node node;
		try {
			final Node class120_7_ = this.aClass120_1008.previous;
			if (class120_7_ == this.aClass120_1008) {
				aClass120_1009 = null;
				return null;
			}
			aClass120_1009 = class120_7_.previous;
			node = class120_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.H(").append(i).append(')').toString());
		}
		return node;
	}

	static final int method897(int i, final int i_8_, final int i_9_, final int i_10_) {
		int i_11_;
		try {
			i &= 0x3;
			if (i == 0) {
				return i_10_;
			}
			if (i == 1) {
				return -i_9_ + 7;
			}
			if (i == 2) {
				return -i_10_ + 7;
			}
			if (i_8_ != 7) {
				return 111;
			}
			i_11_ = i_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.L(").append(i).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(')').toString());
		}
		return i_11_;
	}

	final Node method898(final boolean bool) {
		Node node;
		try {
			if (bool) {
				this.aClass120_1008 = null;
			}
			final Node class120_12_ = aClass120_1009;
			if (class120_12_ == this.aClass120_1008) {
				aClass120_1009 = null;
				return null;
			}
			aClass120_1009 = class120_12_.previous;
			node = class120_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.D(").append(bool).append(')').toString());
		}
		return node;
	}

	final Node method899(final int i) {
		Node node;
		try {
			if (i <= 3) {
				this.aClass120_1008 = null;
			}
			final Node class120_13_ = aClass120_1009;
			if (this.aClass120_1008 == class120_13_) {
				aClass120_1009 = null;
				return null;
			}
			aClass120_1009 = class120_13_.next;
			node = class120_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ll.J(").append(i).append(')').toString());
		}
		return node;
	}

	public Class105() {
		this.aClass120_1008.next = this.aClass120_1008;
		this.aClass120_1008.previous = this.aClass120_1008;
	}
}
