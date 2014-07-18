/* Class120_Sub14_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub22 extends NodeSub {
	int anInt3632 = 12800;
	int anInt3633;
	int anInt3634;
	int anInt3635;
	int anInt3636 = 12800;
	static int anInt3637 = 2;
	boolean aBoolean3638 = true;
	static short[] aShortArray3639;
	static js5 aClass50_3640;
	Deque aClass105_3641;
	int anInt3642;
	int anInt3643;
	int anInt3644 = 0;
	String aString3645;
	static int crossState = 0;
	String aString3647;

	static final void method1629(final int i, final int i_0_, final int i_1_, final String string) {
		final JagexInterface jagexInterface = JagexInterface.getComponent(i, i_0_);
		if (jagexInterface != null) {
			if (jagexInterface.anObjectArray2006 != null) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.anInt2541 = i_1_;
				class120_sub10.aClass189_2534 = jagexInterface;
				class120_sub10.aString2539 = string;
				class120_sub10.objectData = jagexInterface.anObjectArray2006;
				Class88.method744(true, class120_sub10);
			}
			boolean bool = true;
			if (jagexInterface.clientCode > 0) {
				bool = IntegerNode.method1833((byte) -101, jagexInterface);
			}
			if (bool && client.getClickMask(jagexInterface).method1678(-1 + i_1_)) {
				if (i_1_ == 1) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(94);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 2) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(201);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 3) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(30);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 4) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(61);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 5) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(66);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 6) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(7);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 7) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(108);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 8) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(255);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 9) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(97);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
				if (i_1_ == 10) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(10);
					Class120_Sub12_Sub11.outputStream.putInt(i);
					Class120_Sub12_Sub11.outputStream.putShort(i_0_);
				}
			}
		}
	}

	final boolean method1630(final int i, final int i_3_, final int i_4_, final int[] is, final int i_5_) {
		boolean bool;
		try {
			if (i_3_ != -1) {
				return true;
			}
			for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
				if (class120_sub4.method1061((byte) -21, i_5_, i, i_4_)) {
					class120_sub4.method1064(i, i_5_, (byte) 94, is);
					return true;
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.I(").append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(is != null ? "{...}" : "null").append(',').append(i_5_).append(')').toString());
		}
		return bool;
	}

	final boolean method1631(final int i, final int i_6_, final int i_7_) {
		boolean bool;
		try {
			Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront();
			if (i != -129) {
				method1637(false);
			}
			for (/**/; class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
				if (class120_sub4.method1063(i_7_, (byte) 33, i_6_)) {
					return true;
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.G(").append(i).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
		return bool;
	}

	final boolean method1632(final int[] is, final int i, final byte i_8_, final int i_9_) {
		boolean bool;
		try {
			for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
				if (class120_sub4.method1063(i, (byte) 33, i_9_)) {
					class120_sub4.method1064(i, i_9_, (byte) -123, is);
					return true;
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.H(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_8_).append(',').append(i_9_).append(')').toString());
		}
		return bool;
	}

	static final FrameLoader method1633(final byte i, final int i_10_, final js5 js5, final js5 class50_11_, final boolean bool) {
		FrameLoader class120_sub14_sub18;
		do {
			FrameLoader class120_sub14_sub18_12_;
			try {
				boolean bool_13_ = true;
				final int[] is = js5.method433(true, i_10_);
				for (final int element : is) {
					final byte[] is_15_ = js5.method420(false, element, i_10_);
					if (is_15_ == null) {
						bool_13_ = false;
					} else {
						final int i_16_ = 0xff00 & is_15_[0] << 8 | is_15_[1] & 0xff;
						byte[] is_17_;
						if (!bool) {
							is_17_ = class50_11_.method420(false, 0, i_16_);
						} else {
							is_17_ = class50_11_.method420(false, i_16_, 0);
						}
						if (is_17_ == null) {
							bool_13_ = false;
						}
					}
				}
				if (!bool_13_) {
					return null;
				}
				FrameLoader class120_sub14_sub18_18_;
				try {
					class120_sub14_sub18_18_ = new FrameLoader(js5, class50_11_, i_10_, bool);
				} catch (final Exception exception) {
					class120_sub14_sub18 = null;
					break;
				}
				class120_sub14_sub18_12_ = class120_sub14_sub18_18_;
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("wg.F(").append(i).append(',').append(i_10_).append(',').append(js5 != null ? "{...}" : "null").append(',').append(class50_11_ != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
			}
			return class120_sub14_sub18_12_;
		} while (false);
		return class120_sub14_sub18;
	}

	static final int method1634(final float[][] fs, int i, final int i_19_, final int[][] is, final float[][] fs_20_, final int[][] is_21_, final Class120_Sub9 class120_sub9, final int i_22_, final int i_23_, final boolean bool, final float f, final float[][] fs_24_, final int i_25_, int i_26_,
			final int i_27_, final int i_28_, final int i_29_, final int i_30_) {
		int i_31_;
		try {
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
			if (i_27_ <= 20) {
				return 40;
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
						final int i_43_ = InterfaceListener.method1171(i_30_, i_22_, false, i_26_);
						final int i_44_ = InterfaceListener.method1171(i_28_, i_29_, false, i_26_);
						i_34_ = InterfaceListener.method1171(i_43_, i_44_, false, i);
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
			final int i_45_ = (i_19_ << 7) - -i;
			final int i_46_ = i_26_ + (i_23_ << 7);
			final int i_47_ = Class11.method130(i_26_, i_23_, i, is, i_19_, 13);
			i_31_ = class120_sub9.method1166(i_46_, i_47_, i_45_, f_36_, f_35_, f_37_, !bool ? i_34_ : ~0xff & i_34_, is_21_ == null ? 0.0F : (-Class11.method130(i_26_, i_23_, i, is_21_, i_19_, 13) + i_47_) / f);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "wg.E(");
		}
		return i_31_;
	}

	final boolean method1635(final int i, final int i_48_, final byte i_49_, final int[] is) {
		boolean bool;
		try {
			for (Class120_Sub4 class120_sub4 = (Class120_Sub4) this.aClass105_3641.getFront(); class120_sub4 != null; class120_sub4 = (Class120_Sub4) this.aClass105_3641.getNext()) {
				if (class120_sub4.method1062(i, i_48_, 0)) {
					class120_sub4.method1066(i_48_, i, is, -128);
					return true;
				}
			}
			if (i_49_ > -119) {
				aClass50_3640 = null;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.A(").append(i).append(',').append(i_48_).append(',').append(i_49_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	final void method1636(final int i) {
		try {
			this.anInt3636 = 12800;
			this.anInt3644 = 0;
			this.anInt3642 = 0;
			this.anInt3632 = i;
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
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.C(").append(i).append(')').toString());
		}
	}

	public static void method1637(final boolean bool) {
		try {
			aClass50_3640 = null;
			aShortArray3639 = null;
			if (bool) {
				method1634(null, 80, -114, null, null, null, null, -61, -72, false, -0.6714795F, null, 104, 23, -81, -122, 81, 12);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wg.B(").append(bool).append(')').toString());
		}
	}

	Class120_Sub14_Sub22(final int i, final String string, final String string_50_, final int i_51_, final int i_52_, final boolean bool, final int i_53_) {
		this.anInt3642 = 0;
		this.anInt3635 = -1;
		this.anInt3643 = -1;
		this.aString3647 = string_50_;
		this.aBoolean3638 = bool;
		this.aString3645 = string;
		this.anInt3633 = i_51_;
		this.anInt3634 = i;
		this.anInt3635 = i_52_;
		this.anInt3643 = i_53_;
		if (this.anInt3643 == 255) {
			this.anInt3643 = 0;
		}
		this.aClass105_3641 = new Deque();
	}
}
