/* Class120_Sub14_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub22 extends NodeSub {
	int anInt3632 = 12800;
	int anInt3633;
	int anInt3634;
	int backgroundColor;
	int anInt3636 = 12800;
	boolean aBoolean3638 = true;
	static short[] aShortArray3639;
	Deque aClass105_3641;
	int anInt3642;
	int zoom;
	int anInt3644 = 0;
	String configName;
	static int crossState = 0;
	String displayName;

	static final void method1629(final int bitPacked, final int componentIndex, final int actionId, final String menuOptionSuffix) {
		final JagexInterface jagexInterface = JagexInterface.getComponent(bitPacked, componentIndex);
		if (jagexInterface != null) {
			if (jagexInterface.onComponentClickListener != null) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.actionId = actionId;
				class120_sub10.jagexInterface = jagexInterface;
				class120_sub10.actionOption = menuOptionSuffix;
				class120_sub10.objectData = jagexInterface.onComponentClickListener;
				Class88.executeScript(class120_sub10);
			}
			boolean bool = true;
			if (jagexInterface.clientCode > 0) {
				bool = IntegerNode.method1833(jagexInterface);
			}
			if (bool && client.getClickMask(jagexInterface).method1678(actionId - 1)) {
				if (actionId == 1) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(94);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 2) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(201);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 3) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(30);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 4) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(61);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 5) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(66);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 6) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(7);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 7) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(108);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 8) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(255);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 9) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(97);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
				if (actionId == 10) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(10);
					Class120_Sub12_Sub11.outputStream.putInt(bitPacked);
					Class120_Sub12_Sub11.outputStream.putShort(componentIndex);
				}
			}
		}
	}

	final boolean method1630(final int i, final int i_4_, final int[] is, final int i_5_) {
		for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
			if (class120_sub4.method1061(i_5_, i, i_4_)) {
				class120_sub4.method1064(i, i_5_, is);
				return true;
			}
		}
		return false;
	}

	final boolean method1631(final int i_6_, final int i_7_) {
		for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
			if (class120_sub4.method1063(i_7_, i_6_)) {
				return true;
			}
		}
		return false;
	}

	final boolean method1632(final int[] is, final int i, final int i_9_) {
		for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
			if (class120_sub4.method1063(i, i_9_)) {
				class120_sub4.method1064(i, i_9_, is);
				return true;
			}
		}
		return false;
	}

	static final int method1634(final float[][] fs, int i, final int i_19_, final int[][] is, final float[][] fs_20_, final int[][] is_21_, final HDTile class120_sub9, final int i_22_, final int i_23_, final boolean bool, final float f, final float[][] fs_24_, final int i_25_, int i_26_, final int i_28_, final int i_29_, final int i_30_) {
		if (i_25_ != 1) {
			if (i_25_ != 2) {
				if (i_25_ == 3) {
					final int i_32_ = i_26_;
					i_26_ = 128 + -i;
					i = i_32_;
				}
			} else {
				i = 128 + -i;
				i_26_ = -i_26_ + 128;
			}
		} else {
			final int i_33_ = i_26_;
			i_26_ = i;
			i = 128 + -i_33_;
		}
		int i_34_;
		float f_35_;
		float f_36_;
		float f_37_;
		if (i_26_ != 0 || i != 0) {
			if (i_26_ != 128 || i != 0) {
				if (i_26_ == 128 && i == 128) {
					f_37_ = fs_24_[i_23_ - -1][1 + i_19_];
					f_35_ = fs_20_[i_23_ + 1][i_19_ - -1];
					f_36_ = fs[1 + i_23_][1 + i_19_];
					i_34_ = i_29_;
				} else if (i_26_ != 0 || i != 128) {
					f_35_ = fs_20_[i_23_][i_19_];
					f_37_ = fs_24_[i_23_][i_19_];
					f_36_ = fs[i_23_][i_19_];
					final float f_38_ = i_26_ / 128.0F;
					final float f_39_ = i / 128.0F;
					f_35_ += f_38_ * (fs_20_[i_23_ + 1][i_19_] - f_35_);
					f_37_ += f_38_ * (fs_24_[1 + i_23_][i_19_] - f_37_);
					f_36_ += (-f_36_ + fs[1 + i_23_][i_19_]) * f_38_;
					float f_40_ = fs[i_23_][1 + i_19_];
					float f_41_ = fs_20_[i_23_][1 + i_19_];
					float f_42_ = fs_24_[i_23_][i_19_ + 1];
					f_40_ += (fs[i_23_ - -1][1 + i_19_] - f_40_) * f_38_;
					f_36_ += f_39_ * (-f_36_ + f_40_);
					f_42_ += f_38_ * (fs_24_[i_23_ + 1][1 + i_19_] - f_42_);
					f_41_ += f_38_ * (fs_20_[i_23_ + 1][1 + i_19_] - f_41_);
					f_37_ += (f_42_ - f_37_) * f_39_;
					f_35_ += f_39_ * (-f_35_ + f_41_);
					final int i_43_ = InterfaceListener.method1171(i_30_, i_22_, i_26_);
					final int i_44_ = InterfaceListener.method1171(i_28_, i_29_, i_26_);
					i_34_ = InterfaceListener.method1171(i_43_, i_44_, i);
				} else {
					f_37_ = fs_24_[i_23_][i_19_ - -1];
					i_34_ = i_28_;
					f_36_ = fs[i_23_][i_19_ - -1];
					f_35_ = fs_20_[i_23_][i_19_ + 1];
				}
			} else {
				f_36_ = fs[1 + i_23_][i_19_];
				f_35_ = fs_20_[i_23_ - -1][i_19_];
				i_34_ = i_22_;
				f_37_ = fs_24_[i_23_ - -1][i_19_];
			}
		} else {
			i_34_ = i_30_;
			f_35_ = fs_20_[i_23_][i_19_];
			f_36_ = fs[i_23_][i_19_];
			f_37_ = fs_24_[i_23_][i_19_];
		}
		final int i_45_ = (i_19_ << 7) + i;
		final int i_46_ = (i_23_ << 7) + i_26_;
		final int i_47_ = Class11.method130(i_26_, i_23_, i, is, i_19_);
		return class120_sub9.method1166(i_46_, i_47_, i_45_, f_36_, f_35_, f_37_, !bool ? i_34_ : ~0xff & i_34_, is_21_ == null ? 0.0F : (-Class11.method130(i_26_, i_23_, i, is_21_, i_19_) + i_47_) / f);
	}

	final boolean method1635(final int i, final int i_48_, final int[] is) {
		for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
			if (class120_sub4.method1062(i, i_48_)) {
				class120_sub4.method1066(i_48_, i, is);
				return true;
			}
		}
		return false;
	}

	final void method1636() {
		this.anInt3636 = 12800;
		this.anInt3644 = 0;
		this.anInt3642 = 0;
		this.anInt3632 = 12800;
		for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
			if (this.anInt3642 < class120_sub4.anInt2431) {
				this.anInt3642 = class120_sub4.anInt2431;
			}
			if (this.anInt3632 > class120_sub4.anInt2438) {
				this.anInt3632 = class120_sub4.anInt2438;
			}
			if (class120_sub4.anInt2429 < this.anInt3636) {
				this.anInt3636 = class120_sub4.anInt2429;
			}
			if (this.anInt3644 < class120_sub4.anInt2432) {
				this.anInt3644 = class120_sub4.anInt2432;
			}
		}
	}

	Class120_Sub14_Sub22(final int i, final String string, final String string_50_, final int i_51_, final int i_52_, final boolean bool, final int i_53_) {
		this.anInt3642 = 0;
		this.backgroundColor = -1;
		this.zoom = -1;
		this.displayName = string_50_;
		this.aBoolean3638 = bool;
		this.configName = string;
		this.anInt3633 = i_51_;
		this.anInt3634 = i;
		this.backgroundColor = i_52_;
		this.zoom = i_53_;
		if (this.zoom == 255) {
			this.zoom = 0;
		}
		this.aClass105_3641 = new Deque();
	}
}
