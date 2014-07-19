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
	static String[] aStringArray1502;

	static {
		anInt1494 = 1;
		aStringArray1502 = new String[100];
	}

	final int method2097() {
		return (0x8 & progress) != 8 ? 0 : 1;
	}

	public static void method2098(final int i) {
		try {
			aStringArray1502 = null;
			screenRedrawXs = null;
			if (i != 1) {
				method2099(null, true, -14, null);
			}
			anIntArray1501 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("t.C(").append(i).append(')').toString());
		}
	}

	static final void method2099(final js5 js5, final boolean bool, final int i, final js5 class50_1_) {
		try {
			Class140.aBoolean1340 = bool;
			NpcType.aClass50_2099 = class50_1_;
			if (i == -9746) {
				Class28.aClass50_181 = js5;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("t.A(").append(js5 != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(',').append(class50_1_ != null ? "{...}" : "null").append(')').toString());
		}
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
		this.amount = buffer.getInt();//Not sure about these 2
		this.soldAmount = buffer.getInt();//Not sure about these 2
		this.totalPrice = buffer.getInt();
	}
}
