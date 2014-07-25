/* Class120_Sub14_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;

import javax.media.opengl.GL;

final class Class120_Sub14_Sub17 extends NodeSub {
	private final boolean aBoolean3591;
	private int anInt3592;
	private int[] anIntArray3593;
	private int anInt3594;
	private final int anInt3595;
	static int[] anIntArray3596;
	private final int anInt3597;
	private final boolean aBoolean3598;
	private final int anInt3599;
	private int anInt3600;
	private int anInt3601;
	Class120_Sub14_Sub13 aClass120_Sub14_Sub13_3602;
	private final boolean aBoolean3603;
	boolean aBoolean3604;
	private int anInt3605 = 0;
	private final boolean aBoolean3606;
	private float aFloat3607;
	private final boolean aBoolean3608;

	private static final void method1569(final int i, final int i_0_, int width, int height, final int i_3_, final int i_4_, final float[] fs) {
		if (width == 0 || width == -2147483648 || !Class179.method2264(width)) {
			throw new InvalidParameterException("width must be power of 2");
		}
		if (height == 0 || height == -2147483648 || !Class179.method2264(height)) {
			throw new InvalidParameterException("height must be power of 2");
		}
		int i_5_;
		if (i_3_ == 6406) {
			i_5_ = 1;
		} else if (i_3_ == 6409) {
			i_5_ = 1;
		} else if (i_3_ == 32841) {
			i_5_ = 1;
		} else if (i_3_ == 6410) {
			i_5_ = 2;
		} else if (i_3_ == 6407) {
			i_5_ = 3;
		} else if (i_3_ == 6408) {
			i_5_ = 4;
		} else {
			throw new InvalidParameterException("Invalid external format");
		}
		final GL gl = HDToolkit.gl;
		int i_6_ = 0;
		int i_7_ = width < height ? width : height;
		int i_8_ = width >> 1;
		int i_9_ = height >> 1;
		float[] fs_10_ = fs;
		float[] fs_11_ = new float[i_8_ * i_9_ * i_5_];
		for (;;) {
			gl.glTexImage2D(i, i_6_, i_0_, width, height, 0, i_3_, 5126, FloatBuffer.wrap(fs_10_));
			if (i_7_ <= 1) {
				break;
			}
			final int i_12_ = width * i_5_;
			for (int i_13_ = 0; i_13_ < i_5_; i_13_++) {
				int i_14_ = i_13_;
				int i_15_ = i_13_;
				int i_16_ = i_15_ + i_12_;
				for (int i_17_ = 0; i_17_ < i_9_; i_17_++) {
					for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
						float f = fs_10_[i_15_];
						i_15_ += i_5_;
						f += fs_10_[i_15_];
						i_15_ += i_5_;
						f += fs_10_[i_16_];
						i_16_ += i_5_;
						f += fs_10_[i_16_];
						i_16_ += i_5_;
						fs_11_[i_14_] = f * 0.25F;
						i_14_ += i_5_;
					}
					i_15_ += i_12_;
					i_16_ += i_12_;
				}
			}
			final float[] fs_19_ = fs_11_;
			fs_11_ = fs_10_;
			fs_10_ = fs_19_;
			width = i_8_;
			height = i_9_;
			i_8_ >>= 1;
			i_9_ >>= 1;
			i_7_ >>= 1;
			i_6_++;
		}
	}

	final int[] method1570(final Interface3 interface3, final js5 js5, final boolean bool) {
		if (!this.aClass120_Sub14_Sub13_3602.method1529(interface3, js5)) {
			return null;
		}
		final int i = bool ? 64 : 128;
		return this.aClass120_Sub14_Sub13_3602.method1533(1.0, aBoolean3591, 30319, js5, interface3, i, false, i);
	}

	private static final void method1571(final int i, final int i_20_, int width, int height, final int i_23_, final int i_24_, final int[] is) {
		if (width == 0 || width == -2147483648 || !Class179.method2264(width)) {
			throw new InvalidParameterException("width must be power of 2");
		}
		if (height == 0 || height == -2147483648 || !Class179.method2264(height)) {
			throw new InvalidParameterException("height must be power of 2");
		}
		if (i_23_ != 32993 && i_23_ != 6408) {
			throw new InvalidParameterException("Invalid external format");
		}
		final GL gl = HDToolkit.gl;
		int i_25_ = 0;
		int i_26_ = width < height ? width : height;
		int i_27_ = width >> 1;
		int i_28_ = height >> 1;
		int[] is_29_ = is;
		int[] is_30_ = new int[i_27_ * i_28_];
		for (;;) {
			gl.glTexImage2D(i, i_25_, i_20_, width, height, 0, i_23_, i_24_, IntBuffer.wrap(is_29_));
			if (i_26_ <= 1) {
				break;
			}
			int i_31_ = 0;
			int i_32_ = 0;
			int i_33_ = i_32_ + width;
			for (int i_34_ = 0; i_34_ < i_28_; i_34_++) {
				for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
					final int i_36_ = is_29_[i_32_++];
					final int i_37_ = is_29_[i_32_++];
					final int i_38_ = is_29_[i_33_++];
					final int i_39_ = is_29_[i_33_++];
					int i_40_ = i_36_ >> 24 & 0xff;
					int i_41_ = i_36_ >> 16 & 0xff;
					int i_42_ = i_36_ >> 8 & 0xff;
					int i_43_ = i_36_ & 0xff;
					i_40_ += i_37_ >> 24 & 0xff;
					i_41_ += i_37_ >> 16 & 0xff;
					i_42_ += i_37_ >> 8 & 0xff;
					i_43_ += i_37_ & 0xff;
					i_40_ += i_38_ >> 24 & 0xff;
					i_41_ += i_38_ >> 16 & 0xff;
					i_42_ += i_38_ >> 8 & 0xff;
					i_43_ += i_38_ & 0xff;
					i_40_ += i_39_ >> 24 & 0xff;
					i_41_ += i_39_ >> 16 & 0xff;
					i_42_ += i_39_ >> 8 & 0xff;
					i_43_ += i_39_ & 0xff;
					is_30_[i_31_++] = (i_40_ & 0x3fc) << 22 | (i_41_ & 0x3fc) << 14 | (i_42_ & 0x3fc) << 6 | (i_43_ & 0x3fc) >> 2;
				}
				i_32_ += width;
				i_33_ += width;
			}
			final int[] is_44_ = is_30_;
			is_30_ = is_29_;
			is_29_ = is_44_;
			width = i_27_;
			height = i_28_;
			i_27_ >>= 1;
			i_28_ >>= 1;
			i_26_ >>= 1;
			i_25_++;
		}
	}

	final int[] method1572(final Interface3 interface3, final js5 js5, final float f, final boolean bool) {
		if (anIntArray3593 == null || aFloat3607 != f) {
			if (!this.aClass120_Sub14_Sub13_3602.method1529(interface3, js5)) {
				return null;
			}
			anInt3600 = bool ? 64 : 128;
			anIntArray3593 = this.aClass120_Sub14_Sub13_3602.method1533(f, aBoolean3591, 30319, js5, interface3, anInt3600, true, anInt3600);
			aFloat3607 = f;
			if (aBoolean3606) {
				final int[] is = new int[anInt3600];
				final int[] is_45_ = new int[anInt3600];
				final int[] is_46_ = new int[anInt3600];
				final int[] is_47_ = new int[anInt3600 * anInt3600];
				final int i = anInt3600;
				final int i_48_ = anInt3600;
				final int i_49_ = i - 1;
				final int i_50_ = i_48_ - 1;
				final int i_51_ = i * i_48_;
				int i_53_;
				int i_52_ = i_53_ = 1 * i;
				for (int i_54_ = 2; i_54_ >= 0; i_54_--) {
					for (int i_55_ = i_49_; i_55_ >= 0; i_55_--) {
						final int i_56_ = anIntArray3593[--i_53_];
						is[i_55_] += i_56_ >> 16 & 0xff;
						is_45_[i_55_] += i_56_ >> 8 & 0xff;
						is_46_[i_55_] += i_56_ & 0xff;
					}
					if (i_53_ == 0) {
						i_53_ = i_51_;
					}
				}
				int i_57_ = i_51_;
				for (int i_58_ = i_50_; i_58_ >= 0; i_58_--) {
					int i_59_ = 1;
					int i_60_ = 1;
					int i_62_;
					int i_63_;
					int i_61_ = i_62_ = i_63_ = 0;
					for (int i_64_ = 2; i_64_ >= 0; i_64_--) {
						i_60_--;
						i_61_ += is[i_60_];
						i_63_ += is_45_[i_60_];
						i_62_ += is_46_[i_60_];
						if (i_60_ == 0) {
							i_60_ = i;
						}
					}
					for (int i_65_ = i_49_; i_65_ >= 0; i_65_--) {
						i_60_--;
						i_59_--;
						final int i_66_ = i_61_ / 9;
						final int i_67_ = i_63_ / 9;
						final int i_68_ = i_62_ / 9;
						is_47_[--i_57_] = i_66_ << 16 | i_67_ << 8 | i_68_;
						i_61_ += is[i_60_] - is[i_59_];
						i_62_ += is_46_[i_60_] - is_46_[i_59_];
						i_63_ += is_45_[i_60_] - is_45_[i_59_];
						if (i_60_ == 0) {
							i_60_ = i;
						}
						if (i_59_ == 0) {
							i_59_ = i;
						}
					}
					for (int i_69_ = i_49_; i_69_ >= 0; i_69_--) {
						final int i_70_ = anIntArray3593[--i_53_];
						final int i_71_ = anIntArray3593[--i_52_];
						is[i_69_] += (i_70_ >> 16 & 0xff) - (i_71_ >> 16 & 0xff);
						is_45_[i_69_] += (i_70_ >> 8 & 0xff) - (i_71_ >> 8 & 0xff);
						is_46_[i_69_] += (i_70_ & 0xff) - (i_71_ & 0xff);
					}
					if (i_53_ == 0) {
						i_53_ = i_51_;
					}
					if (i_52_ == 0) {
						i_52_ = i_51_;
					}
				}
				anIntArray3593 = is_47_;
			}
		}
		return anIntArray3593;
	}

	@Override
	protected final void finalize() throws Throwable {
		if (anInt3592 != -1) {
			Class113.method999(anInt3592, anInt3605, anInt3601);
			anInt3592 = -1;
			anInt3605 = 0;
		}
		super.finalize();
	}

	final void method1573(final int i) {
		if (anIntArray3593 != null && (anInt3599 != 0 || anInt3595 != 0)) {
			if (anIntArray3596 == null || anIntArray3596.length < anIntArray3593.length) {
				anIntArray3596 = new int[anIntArray3593.length];
			}
			final int i_72_ = anIntArray3593.length;
			final int i_73_ = i * anInt3595;
			final int i_74_ = anInt3600 - 1;
			final int i_75_ = anInt3600 * i * anInt3599;
			final int i_76_ = i_72_ - 1;
			for (int i_77_ = 0; i_77_ < i_72_; i_77_ += anInt3600) {
				final int i_78_ = i_77_ + i_75_ & i_76_;
				for (int i_79_ = 0; i_79_ < anInt3600; i_79_++) {
					final int i_80_ = i_77_ + i_79_;
					final int i_81_ = i_78_ + (i_79_ + i_73_ & i_74_);
					anIntArray3596[i_80_] = anIntArray3593[i_81_];
				}
			}
			final int[] is = anIntArray3593;
			anIntArray3593 = anIntArray3596;
			anIntArray3596 = is;
		}
	}

	public static void method1574() {
		anIntArray3596 = null;
	}

	final boolean method1575(final Interface3 interface3, final js5 js5) {
		return this.aClass120_Sub14_Sub13_3602.method1529(interface3, js5);
	}

	final boolean method1576(final Interface3 interface3, final js5 js5, int i) {
		if (!this.aClass120_Sub14_Sub13_3602.method1529(interface3, js5)) {
			return false;
		}
		final GL gl = HDToolkit.gl;
		final int i_82_ = Class49.method408();
		if ((i_82_ & 0x1) == 0) {
			if (anInt3592 == -1 || anInt3600 != i) {
				if (anInt3592 == -1) {
					final int[] is = new int[1];
					gl.glGenTextures(1, is, 0);
					anInt3592 = is[0];
					anInt3601 = Class113.anInt1083;
				}
				HDToolkit.method514(anInt3592);
				if (aBoolean3603 && Class34.method290()) {
					final float[] fs = this.aClass120_Sub14_Sub13_3602.method1528(i, (byte) -107, aBoolean3591, interface3, js5, i);
					if (anInt3597 == 2) {
						method1569(Class163.anInt1567, Class163.anInt1573, i, i, Class163.anInt1570, Class163.anInt1580, fs);
						gl.glTexParameteri(3553, 10241, 9987);
						gl.glTexParameteri(3553, 10240, 9729);
						Class113.anInt1081 += fs.length * 4 / 3 - anInt3605;
						anInt3605 = fs.length * 4 / 3;
					} else {
						gl.glTexImage2D(3553, 0, 34842, i, i, 0, 6408, 5126, FloatBuffer.wrap(fs));
						gl.glTexParameteri(3553, 10241, 9729);
						gl.glTexParameteri(3553, 10240, 9729);
						Class113.anInt1081 += fs.length - anInt3605;
						anInt3605 = fs.length;
					}
				} else {
					final int i_83_ = HDToolkit.usingBigEndian ? 33639 : 5121;
					int[] is = this.aClass120_Sub14_Sub13_3602.method1526(i, (byte) 58, i, js5, 0.7, interface3, aBoolean3591);
					if (anInt3597 == 2) {
						method1571(Class163.anInt1567, Class163.anInt1570, i, i, Class163.anInt1571, i_83_, is);
						gl.glTexParameteri(3553, 10241, 9987);
						gl.glTexParameteri(3553, 10240, 9729);
						Class113.anInt1081 += is.length * 4 / 3 - anInt3605;
						anInt3605 = is.length * 4 / 3;
					} else if (anInt3597 == 1) {
						int i_84_ = 0;
						for (;;) {
							gl.glTexImage2D(3553, i_84_++, 6408, i, i, 0, 32993, i_83_, IntBuffer.wrap(is));
							i >>= 1;
							if (i == 0) {
								break;
							}
							is = this.aClass120_Sub14_Sub13_3602.method1526(i, (byte) -120, i, js5, 0.7, interface3, aBoolean3591);
						}
						gl.glTexParameteri(3553, 10241, 9987);
						gl.glTexParameteri(3553, 10240, 9729);
						Class113.anInt1081 += is.length * 4 / 3 - anInt3605;
						anInt3605 = is.length * 4 / 3;
					} else {
						gl.glTexImage2D(3553, 0, 6408, i, i, 0, 32993, i_83_, IntBuffer.wrap(is));
						gl.glTexParameteri(3553, 10241, 9729);
						gl.glTexParameteri(3553, 10240, 9729);
						Class113.anInt1081 += is.length - anInt3605;
						anInt3605 = is.length;
					}
				}
				gl.glTexParameteri(3553, 10242, aBoolean3608 ? 10497 : 33071);
				gl.glTexParameteri(3553, 10243, aBoolean3598 ? 10497 : 33071);
				anInt3600 = i;
			} else {
				HDToolkit.method514(anInt3592);
			}
		}
		if ((i_82_ & 0x2) == 0) {
			HDToolkit.method511(anInt3594);
		}
		if ((i_82_ & 0x4) == 0) {
			HDToolkit.method521(0);
		}
		if ((i_82_ & 0x8) == 0) {
			if (anInt3599 != 0 || anInt3595 != 0) {
				final float f = (float) (HDToolkit.anInt542 * anInt3599) / (float) anInt3600;
				final float f_85_ = (float) (HDToolkit.anInt542 * anInt3595) / (float) anInt3600;
				HDToolkit.method523(f_85_, f, 0.0F);
			} else {
				HDToolkit.method509();
			}
		}
		return true;
	}

	Class120_Sub14_Sub17(final Buffer class120_sub7) {
		anInt3592 = -1;
		this.aBoolean3604 = false;
		this.aClass120_Sub14_Sub13_3602 = new Class120_Sub14_Sub13(class120_sub7);
		aBoolean3606 = class120_sub7.getUByte() == 1;
		aBoolean3591 = class120_sub7.getUByte() == 1;
		aBoolean3608 = class120_sub7.getUByte() == 1;
		aBoolean3598 = class120_sub7.getUByte() == 1;
		final int i = class120_sub7.getUByte() & 0x3;
		anInt3595 = class120_sub7.getByte();
		anInt3599 = class120_sub7.getByte();
		final int i_86_ = class120_sub7.getUByte();
		class120_sub7.getUByte();
		aBoolean3603 = class120_sub7.getUByte() == 1;
		anInt3597 = i_86_ >> 4 & 0xf;
		if (i == 1) {
			anInt3594 = 2;
		} else if (i == 2) {
			anInt3594 = 3;
		} else if (i == 3) {
			anInt3594 = 4;
		} else {
			anInt3594 = 0;
		}
	}
}
