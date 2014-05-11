/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Queue {
	static int anInt1767 = 0;
	static int anInt1768;
	NodeSub head = new NodeSub();
	private NodeSub current;

	final NodeSub peekFirst() {
		final NodeSub node = this.head.nextSub;
		if (node == this.head) {
			current = null;
			return null;
		}
		current = node.nextSub;
		return node;
	}

	final void insertLast(final NodeSub node) {
		if (node.previousSub != null) {
			node.unlinkSub();
		}
		node.nextSub = this.head;
		node.previousSub = this.head.previousSub;
		node.previousSub.nextSub = node;
		node.nextSub.previousSub = node;
	}

	final int getAmount() {
		int amount = 0;
		NodeSub next = this.head.nextSub;
		while (this.head != next) {
			next = next.nextSub;
			amount++;
		}
		return amount;
	}

	static final void method2250(final int[][] is, final byte i) {
		try {
			GameEntity.anIntArrayArray3009 = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uk.F(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final NodeSub removeFirst() {
		final NodeSub node = this.head.nextSub;
		if (this.head == node) {
			return null;
		}
		node.unlinkSub();
		return node;
	}

	final void clear() {
		for (;;) {
			final NodeSub node = this.head.nextSub;
			if (node == this.head) {
				current = null;
				return;
			}
			node.unlinkSub();
		}
	}

	static final int method2253(final int i, int i_3_, final int i_4_, final int i_5_) {
		int i_6_;
		try {
			i_3_ &= 0x3;
			if (i_3_ == 0) {
				return i_4_;
			}
			if (i_3_ == i_5_) {
				return i;
			}
			if (i_3_ == 2) {
				return -i_4_ + 7;
			}
			i_6_ = -i + 7;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uk.G(").append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
		return i_6_;
	}

	static final void method2254(final boolean bool, final int i, final int i_7_, final int i_8_, final int i_9_) {
		try {
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos = 0;
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(20);
			if (!bool) {
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(i_9_);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(i_8_);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_7_);
				Class120_Sub14_Sub4.anInt3466 = 0;
				Class154.anInt1440 = 1;
				Class120_Sub12_Sub35.anInt3410 = -3;
				Class107.anInt1027 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uk.A(").append(bool).append(',').append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(')').toString());
		}
	}

	final NodeSub peekNext() {
		final NodeSub node = current;
		if (this.head == node) {
			current = null;
			return null;
		}
		current = node.nextSub;
		return node;
	}

	public Queue() {
		this.head.previousSub = this.head;
		this.head.nextSub = this.head;
	}
}
