/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Queue {
	static int lastMouseX = 0;
	static int currentLightY;
	NodeSub head = new NodeSub();
	private NodeSub current;

	final NodeSub peekFirst() {
		final NodeSub nodeSub = this.head.nextSub;
		if (nodeSub == this.head) {
			current = null;
			return null;
		}
		current = nodeSub.nextSub;
		return nodeSub;
	}

	final void insertLast(final NodeSub nodeSub) {
		if (nodeSub.previousSub != null) {
			nodeSub.unlinkSub();
		}
		nodeSub.nextSub = this.head;
		nodeSub.previousSub = this.head.previousSub;
		nodeSub.previousSub.nextSub = nodeSub;
		nodeSub.nextSub.previousSub = nodeSub;
	}

	final int getAmount() {
		int amount = 0;
		NodeSub nodeSub = this.head.nextSub;
		while (this.head != nodeSub) {
			nodeSub = nodeSub.nextSub;
			amount++;
		}
		return amount;
	}

	final NodeSub removeFirst() {
		final NodeSub nodeSub = this.head.nextSub;
		if (this.head == nodeSub) {
			return null;
		}
		nodeSub.unlinkSub();
		return nodeSub;
	}

	final void clear() {
		for (;;) {
			final NodeSub nodeSub = this.head.nextSub;
			if (nodeSub == this.head) {
				break;
			}
			nodeSub.unlinkSub();
		}
		current = null;
	}

	static final int method2253(final int i, int i_3_, final int i_4_) {
		i_3_ &= 0x3;
		if (i_3_ == 0) {
			return i_4_;
		}
		if (i_3_ == 1) {
			return i;
		}
		if (i_3_ == 2) {
			return 7 - i_4_;
		}
		return 7 - i;
	}

	static final void sendBirthInformation(final int day, final int month, final int year, final int country) {
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class120_Sub12_Sub11.outputStream.putByte(20);
		Class120_Sub12_Sub11.outputStream.putByte(day);
		Class120_Sub12_Sub11.outputStream.putByte(month);
		Class120_Sub12_Sub11.outputStream.putShort(year);
		Class120_Sub12_Sub11.outputStream.putShort(country);
		SpotAnimationNode.anInt3466 = 0;
		Class154.accountCreationStep = 1;
		Class120_Sub12_Sub35.accountCreationReturnCode = -3;
		AbstractIndexedSprite.anInt1027 = 0;
	}

	final NodeSub peekNext() {
		final NodeSub nodeSub = current;
		if (this.head == nodeSub) {
			current = null;
			return null;
		}
		current = nodeSub.nextSub;
		return nodeSub;
	}

	public Queue() {
		this.head.previousSub = this.head;
		this.head.nextSub = this.head;
	}
}
