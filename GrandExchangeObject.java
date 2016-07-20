/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GrandExchangeObject {
	int amount;
	static volatile int currentMouseX = -1;
	static int minTileX;
	static int anInt1494;
	static int[] screenRedrawXs = new int[100];
	private byte status;
	int soldAmount;
	int totalPrice;
	int price;
	int id;
	static int[] anIntArray1501;
	static String[] chatMessages;

	static {
		anInt1494 = 1;
		chatMessages = new String[100];
	}

	final int getOfferType() {//1 sell, 0 buy
		return (status & 0x8) != 8 ? 0 : 1;
	}

	final int getStatus() {
		return status & 0x7;
	}

	public GrandExchangeObject() {
		/* empty */
	}

	GrandExchangeObject(final Buffer buffer) {
		this.status = buffer.getByte();
		this.id = buffer.getUShort();
		this.price = buffer.getInt();
		this.amount = buffer.getInt();
		this.soldAmount = buffer.getInt();
		this.totalPrice = buffer.getInt();
	}
}
