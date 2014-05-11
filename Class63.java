/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class63 {
	private int[] anIntArray578;
	int anInt579;
	int anInt580;
	private int[] anIntArray581;
	int anInt582;
	private int anInt583 = 2;
	private int anInt584;
	private int anInt585;
	private int anInt586;
	private int anInt587;
	private int anInt588;

	final void method571() {
		anInt584 = 0;
		anInt585 = 0;
		anInt588 = 0;
		anInt586 = 0;
		anInt587 = 0;
	}

	final void method572(final Buffer class120_sub7) {
		this.anInt582 = class120_sub7.getUByte();
		this.anInt580 = class120_sub7.getInt();
		this.anInt579 = class120_sub7.getInt();
		method574(class120_sub7);
	}

	final int method573(final int i) {
		if (anInt587 >= anInt584) {
			anInt586 = anIntArray578[anInt585++] << 15;
			if (anInt585 >= anInt583) {
				anInt585 = anInt583 - 1;
			}
			anInt584 = (int) (anIntArray581[anInt585] / 65536.0 * i);
			if (anInt584 > anInt587) {
				anInt588 = ((anIntArray578[anInt585] << 15) - anInt586) / (anInt584 - anInt587);
			}
		}
		anInt586 += anInt588;
		anInt587++;
		return anInt586 - anInt588 >> 15;
	}

	final void method574(final Buffer class120_sub7) {
		anInt583 = class120_sub7.getUByte();
		anIntArray581 = new int[anInt583];
		anIntArray578 = new int[anInt583];
		for (int i = 0; i < anInt583; i++) {
			anIntArray581[i] = class120_sub7.getUShort();
			anIntArray578[i] = class120_sub7.getUShort();
		}
	}

	public Class63() {
		anIntArray581 = new int[2];
		anIntArray578 = new int[2];
		anIntArray581[0] = 0;
		anIntArray581[1] = 65535;
		anIntArray578[0] = 0;
		anIntArray578[1] = 65535;
	}
}
