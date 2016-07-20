/* Class120_Sub14_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class QuickChatCategoryType extends NodeSub {
	int[] anIntArray3648;
	static int activeMusicGroupId;
	String name;
	int[] anIntArray3651;
	char[] aCharArray3652;
	char[] aCharArray3653;
	static NodeCache recentUse;
	static js5 aClass50_2277;
	static js5 aClass50_1456;
	static int[] anIntArray3654;
	
	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final void method1639(final int x, final int y, final int z, final int speed, final int speed2, final boolean instant) {
		Class134.anInt1280 = z;
		Class99.anInt951 = x;
		ObjectContainer.anInt2621 = speed;
		SpotAnimType.anInt986 = y;
		NpcType.anInt1660 = speed2;
		if (instant && ObjectContainer.anInt2621 >= 100) {
			FileSystemWorker.renderX = Class99.anInt951 * 128 + 64;
			GroundObjectNode.renderZ = Class134.anInt1280 * 128 + 64;
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

	public QuickChatCategoryType() {
		/* empty */
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.name = buffer.getJagexString();
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

	static final QuickChatCategoryType list(final int id) {
		QuickChatCategoryType quickChatCategoryType = (QuickChatCategoryType) QuickChatCategoryType.recentUse.get(id);
		if (quickChatCategoryType != null) {
			return quickChatCategoryType;
		}
		byte[] is;
		if (id >= 32768) {
			is = aClass50_2277.getFile(0, id & 0x7fff);
		} else {
			is = aClass50_1456.getFile(0, id);
		}
		quickChatCategoryType = new QuickChatCategoryType();
		if (is != null) {
			quickChatCategoryType.decode(new Buffer(is));
		}
		if (id >= 32768) {
			quickChatCategoryType.method1644();
		}
		QuickChatCategoryType.recentUse.put(quickChatCategoryType, id);
		return quickChatCategoryType;
	}

	static final void setup(final js5 js5, final js5 class50_27_) {
		aClass50_2277 = class50_27_;
		aClass50_1456 = js5;
	}
}
