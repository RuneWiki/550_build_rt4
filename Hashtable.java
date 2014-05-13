/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Hashtable {
	static boolean showGroundDecorations = true;
	private Node next;
	private long uid;
	Node[] table;
	int capacity;
	private Node lastIterated;
	static int anInt675;
	private int current = 0;

	final int getCapacity() {
		return capacity;
	}

	final void put(final Node node, final long uid) {
		if (node.previous != null) {
			node.unlink();
		}
		final Node previous = this.table[(int) (uid & this.capacity - 1)];
		node.uid = uid;
		node.next = previous;
		node.previous = previous.previous;
		node.previous.next = node;
		node.next.previous = node;
	}

	final int getCount() {
		int count = 0;
		for (int id = 0; this.capacity > id; id++) {
			final Node currentNode = this.table[id];
			for (Node nextNode = currentNode.next; currentNode != nextNode; nextNode = nextNode.next) {
				count++;
			}
		}
		return count;
	}

	final Node getFirst() {
		current = 0;
		return getNext();
	}

	final Node getNext() {
		if (current > 0 && this.table[current - 1] != lastIterated) {
			final Node lastNode = lastIterated;
			lastIterated = lastNode.next;
			return lastNode;
		}
		while (current < this.capacity) {
			final Node nextNode = this.table[current++].next;
			if (nextNode != this.table[-1 + current]) {
				lastIterated = nextNode.next;
				return nextNode;
			}
		}
		return null;
	}

	final Node get(final long uid) {
		this.uid = uid;
		final Node previousNode = this.table[(int) (this.capacity - 1 & uid)];
		for (next = previousNode.next; previousNode != next; next = next.next) {
			if (next.uid == uid) {
				final Node nextNode = next;
				next = next.next;
				return nextNode;
			}
		}
		next = null;
		return null;
	}

	final int method660(final Node[] nodes) {
		int pos = 0;
		for (int i_12_ = 0; this.capacity > i_12_; i_12_++) {
			final Node currentNode = this.table[i_12_];
			for (Node nextNode = currentNode.next; currentNode != nextNode; nextNode = nextNode.next) {
				nodes[pos++] = nextNode;
			}
		}
		return pos;
	}

	Hashtable(final int i) {
		this.table = new Node[i];
		this.capacity = i;
		for (int id = 0; i > id; id++) {
			final Node node = this.table[id] = new Node();
			node.previous = node;
			node.next = node;
		}
	}

	final Node poll() {
		if (next == null) {
			return null;
		}
		for (final Node class120_15_ = this.table[(int) (this.capacity - 1 & uid)]; class120_15_ != next; next = next.next) {
			if (uid == next.uid) {
				final Node nextNode = next;
				next = next.next;
				return nextNode;
			}
		}
		next = null;
		return null;
	}

	final void clear() {
		for (int id = 0; id < this.capacity; id++) {
			final Node currentNode = this.table[id];
			for (;;) {
				final Node nextNode = currentNode.next;
				if (nextNode == currentNode) {
					break;
				}
				nextNode.unlink();
			}
		}
		lastIterated = null;
		next = null;
	}
}
