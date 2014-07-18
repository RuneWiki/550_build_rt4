/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Deque {
	static int anInt1007;
	Node head = new Node();
	private Node current;

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
			
			throw EnumType.method1428(runtimeexception, new StringBuilder("ll.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	final void clear() {
		for (;;) {
			final Node node = this.head.next;
			if (this.head == node) {
				break;
			}
			node.unlink();
		}
		current = null;
	}

	final void addFront(final Node node) {
		if (node.previous != null) {
			node.unlink();
		}
		node.previous = this.head;
		node.next = this.head.next;
		node.previous.next = node;
		node.next.previous = node;
	}

	final Node removeFront() {
		final Node node = this.head.next;
		if (node == this.head) {
			return null;
		}
		node.unlink();
		return node;
	}

	final boolean isEmpty() {
		return this.head.next == this.head;
	}

	final Node getFront() {
		final Node node = this.head.next;
		if (node == this.head) {
			current = null;
			return null;
		}
		current = node.next;
		return node;
	}

	static final Class182 method894(final int i, final int i_5_, final int i_6_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_5_][i_6_];
		if (class120_sub18 == null) {
			return null;
		}
		return class120_sub18.aClass182_2628;
	}

	final void addLast(final Node node) {
		if (node.previous != null) {
			node.unlink();
		}
		node.previous = this.head.previous;
		node.next = this.head;
		node.previous.next = node;
		node.next.previous = node;
	}

	final Node getLast() {
		final Node node = this.head.previous;
		if (node == this.head) {
			current = null;
			return null;
		}
		current = node.previous;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ll.L(").append(i).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(')').toString());
		}
		return i_11_;
	}

	final Node getPrevious() {
		final Node node = current;
		if (node == this.head) {
			current = null;
			return null;
		}
		current = node.previous;
		return node;
	}

	final Node getNext() {
		final Node node = current;
		if (this.head == node) {
			current = null;
			return null;
		}
		current = node.next;
		return node;
	}

	public Deque() {
		this.head.next = this.head;
		this.head.previous = this.head;
	}
}
