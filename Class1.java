/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1 {
	short[] aShortArray33;
	private static short[] aShortArray34 = new short[500];
	short[] aShortArray35;
	short[] aShortArray36;
	boolean aBoolean37 = false;
	byte[] aByteArray38;
	private static byte[] aByteArray39 = new byte[500];
	short[] aShortArray40;
	private static short[] aShortArray41;
	boolean aBoolean42;
	int anInt43 = -1;
	private static short[] aShortArray44;
	private static short[] aShortArray45 = new short[500];
	private static short[] aShortArray46;
	short[] aShortArray47;
	Class120_Sub1 aClass120_Sub1_48;

	static {
		aShortArray41 = new short[500];
		aShortArray46 = new short[500];
		aShortArray44 = new short[500];
	}

	public static void method75() {
		aShortArray46 = null;
		aShortArray45 = null;
		aShortArray34 = null;
		aShortArray41 = null;
		aShortArray44 = null;
		aByteArray39 = null;
	}

	Class1(final byte[] is, final Class120_Sub1 class120_sub1) {
		this.aBoolean42 = false;
		this.aClass120_Sub1_48 = null;
		this.aClass120_Sub1_48 = class120_sub1;
		final Buffer class120_sub7 = new Buffer(is);
		final Buffer class120_sub7_0_ = new Buffer(is);
		class120_sub7.pos = 2;
		final int i = class120_sub7.getUByte();
		int i_1_ = 0;
		int i_2_ = -1;
		int i_3_ = -1;
		class120_sub7_0_.pos = class120_sub7.pos + i;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			final int i_5_ = this.aClass120_Sub1_48.anIntArray2402[i_4_];
			if (i_5_ == 0) {
				i_2_ = i_4_;
			}
			final int i_6_ = class120_sub7.getUByte();
			if (i_6_ > 0) {
				if (i_5_ == 0) {
					i_3_ = i_4_;
				}
				aShortArray46[i_1_] = (short) i_4_;
				short i_7_ = 0;
				if (i_5_ == 3) {
					i_7_ = (short) 128;
				}
				if ((i_6_ & 0x1) != 0) {
					aShortArray45[i_1_] = (short) class120_sub7_0_.getSmart();
				} else {
					aShortArray45[i_1_] = i_7_;
				}
				if ((i_6_ & 0x2) != 0) {
					aShortArray34[i_1_] = (short) class120_sub7_0_.getSmart();
				} else {
					aShortArray34[i_1_] = i_7_;
				}
				if ((i_6_ & 0x4) != 0) {
					aShortArray41[i_1_] = (short) class120_sub7_0_.getSmart();
				} else {
					aShortArray41[i_1_] = i_7_;
				}
				aByteArray39[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
				if (i_5_ == 2) {
					aShortArray45[i_1_] = (short) (((aShortArray45[i_1_] & 0xff) << 3) + (aShortArray45[i_1_] >> 8 & 0x7));
					aShortArray34[i_1_] = (short) (((aShortArray34[i_1_] & 0xff) << 3) + (aShortArray34[i_1_] >> 8 & 0x7));
					aShortArray41[i_1_] = (short) (((aShortArray41[i_1_] & 0xff) << 3) + (aShortArray41[i_1_] >> 8 & 0x7));
				}
				aShortArray44[i_1_] = (short) -1;
				if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
					if (i_2_ > i_3_) {
						aShortArray44[i_1_] = (short) i_2_;
						i_3_ = i_2_;
					}
				} else if (i_5_ == 5) {
					this.aBoolean37 = true;
				} else if (i_5_ == 7) {
					this.aBoolean42 = true;
				}
				i_1_++;
			}
		}
		if (class120_sub7_0_.pos != is.length) {
			throw new RuntimeException();
		}
		this.anInt43 = i_1_;
		this.aShortArray35 = new short[i_1_];
		this.aShortArray47 = new short[i_1_];
		this.aShortArray33 = new short[i_1_];
		this.aShortArray36 = new short[i_1_];
		this.aShortArray40 = new short[i_1_];
		this.aByteArray38 = new byte[i_1_];
		for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			this.aShortArray35[i_8_] = aShortArray46[i_8_];
			this.aShortArray47[i_8_] = aShortArray45[i_8_];
			this.aShortArray33[i_8_] = aShortArray34[i_8_];
			this.aShortArray36[i_8_] = aShortArray41[i_8_];
			this.aShortArray40[i_8_] = aShortArray44[i_8_];
			this.aByteArray38[i_8_] = aByteArray39[i_8_];
		}
	}
}
