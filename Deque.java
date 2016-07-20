/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Deque {
	static int currentFogColor;
	Node head = new Node();
	private Node current;

	static final int highestOneBit(final int value) {
		int i_2_ = value >>> 1;
		i_2_ |= i_2_ >>> 1;
		i_2_ |= i_2_ >>> 2;
		i_2_ |= i_2_ >>> 4;
		i_2_ |= i_2_ >>> 8;
		i_2_ |= i_2_ >>> 16;
		return value & (i_2_ ^ 0xffffffff);
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

	static final WallLocation getWallLocation(final int x, final int z, final int level) {
		final GroundTile groundTile = SeqFrameBase.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		return groundTile.wallLocation;
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

	static final int method897(int i, final int i_9_, final int i_10_) {
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
		return i_9_;
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
