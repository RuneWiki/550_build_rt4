/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GrandExchangeObject {
	int amount;
	static volatile int currentMouseX = -1;
	static int anInt1493;
	static int anInt1494;
	static int[] screenRedrawXs = new int[100];
	private byte progress;
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

	final int method2097() {
		return (0x8 & progress) != 8 ? 0 : 1;
	}

	final int getProgress() {
		return progress & 0x7;
	}

	public GrandExchangeObject() {
		/* empty */
	}

	GrandExchangeObject(final Buffer buffer) {
		progress = buffer.getByte();
		this.id = buffer.getUShort();
		this.price = buffer.getInt();
		this.amount = buffer.getInt();
		this.soldAmount = buffer.getInt();
		this.totalPrice = buffer.getInt();
	}
}
