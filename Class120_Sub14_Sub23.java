/* Class120_Sub14_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub23 extends NodeSub {
	int[] anIntArray3648;
	static int anInt3649;
	String aString3650;
	int[] anIntArray3651;
	char[] aCharArray3652;
	char[] aCharArray3653;
	static int[] anIntArray3654;
	static String aString3655 = "You can't add yourself to your own friend list.";

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final void method1639(final int i, final int i_1_, final int i_2_, final int i_3_, final boolean bool, final int i_5_) {
		Class134.anInt1280 = i_5_;
		Class99.anInt951 = i_1_;
		ObjectContainer.anInt2621 = i_2_;
		SpotAnimType.anInt986 = i_3_;
		NpcType.anInt1660 = i;
		if (bool && ObjectContainer.anInt2621 >= 100) {
			FileSystemWorker.renderX = 128 * Class99.anInt951 + 64;
			GroundObjectNode.renderZ = 64 + 128 * Class134.anInt1280;
			Class120_Sub12_Sub10.renderY = Class22.getTileHeight(FileSystemWorker.renderX, GroundObjectNode.renderZ, Class173.gameLevel) - SpotAnimType.anInt986;
		}
		client.cameraType = 2;
	}

	final int method1640(final char c) {
		if (this.anIntArray3648 == null) {
			return -1;
		}
		for (int i_7_ = 0; this.anIntArray3648.length > i_7_; i_7_++) {
			if (this.aCharArray3653[i_7_] == c) {
				return this.anIntArray3648[i_7_];
			}
		}
		return -1;
	}

	final int method1643(final char c) {
		if (this.anIntArray3651 == null) {
			return -1;
		}
		for (int i_11_ = 0; this.anIntArray3651.length > i_11_; i_11_++) {
			if (this.aCharArray3652[i_11_] == c) {
				return this.anIntArray3651[i_11_];
			}
		}
		return -1;
	}

	final void method1644() {
		if (this.anIntArray3648 != null) {
			for (int i_12_ = 0; i_12_ < this.anIntArray3648.length; i_12_++) {
				this.anIntArray3648[i_12_] |= 32768;
			}
		}
		if (this.anIntArray3651 != null) {
			for (int i_13_ = 0; i_13_ < this.anIntArray3651.length; i_13_++) {
				this.anIntArray3651[i_13_] |= 32768;
			}
		}
	}

	public Class120_Sub14_Sub23() {
		/* empty */
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.aString3650 = buffer.getJagexString();
		} else if (code == 2) {
			final int i_18_ = buffer.getUByte();
			this.anIntArray3651 = new int[i_18_];
			this.aCharArray3652 = new char[i_18_];
			for (int i_19_ = 0; i_19_< i_18_; i_19_++) {
				this.anIntArray3651[i_19_] = buffer.getUShort();
				final byte i_20_ = buffer.getByte();
				this.aCharArray3652[i_19_] = i_20_ != 0 ? Class120_Sub12_Sub24.method1328(i_20_) : '\0';
			}
		} else if (code == 3) {
			final int i_15_ = buffer.getUByte();
			this.aCharArray3653 = new char[i_15_];
			this.anIntArray3648 = new int[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				this.anIntArray3648[i_16_] = buffer.getUShort();
				final byte i_17_ = buffer.getByte();
				this.aCharArray3653[i_16_] = i_17_ != 0 ? Class120_Sub12_Sub24.method1328(i_17_) : '\0';
			}
		}
	}
}
