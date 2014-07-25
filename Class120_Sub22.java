/* Class120_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub22 extends Node {
	byte[] aByteArray2671;
	static int anInt2672 = -1;
	Class120_Sub5_Sub1[] aClass120_Sub5_Sub1Array2673;
	int anInt2674;
	static int systemUpdateCycle = 0;
	Class157[] aClass157Array2676;
	byte[] aByteArray2677;
	private int[] anIntArray2678;
	static js5 aClass50_2679;
	short[] aShortArray2680;
	byte[] aByteArray2681;

	static final void method1701(final Player player, final int mask, final int index) {
		if ((0x1 & mask) != 0) {
			final int damage = Canvas_Sub1.inputStream.getUSmart();
			final int type = Canvas_Sub1.inputStream.getUByte();
			player.addHit(damage, type, Class101_Sub2.loopCycle);
			player.hpBarCycle = 300 + Class101_Sub2.loopCycle;
			player.hpBarRatio = Canvas_Sub1.inputStream.getUByteC();
		}
		if ((0x2 & mask) != 0) {
			int animationId = Canvas_Sub1.inputStream.getUShort();
			if (animationId == 65535) {
				animationId = -1;
			}
			final int delay = Canvas_Sub1.inputStream.getUByte();
			Class192.method2517(player, animationId, delay);
		}
		if ((0x8 & mask) != 0) {
			final int dataLen = Canvas_Sub1.inputStream.getUByteC();
			final byte[] data = new byte[dataLen];
			final Buffer buffer = new Buffer(data);
			Canvas_Sub1.inputStream.getBufferA(data, 0, dataLen);
			StringNode.playerAppearanceBuffers[index] = buffer;
			player.decodeAppearance(buffer);
		}
		if ((0x4 & mask) != 0) {
			player.faceX = Canvas_Sub1.inputStream.getULEShort();
			player.faceZ = Canvas_Sub1.inputStream.getUShort();
		}
		if ((mask & 0x800) != 0) {
			final int i_7_ = Canvas_Sub1.inputStream.getUByteA();
			final int[] is = new int[i_7_];
			final int[] is_8_ = new int[i_7_];
			final int[] is_9_ = new int[i_7_];
			for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
				int i_11_ = Canvas_Sub1.inputStream.getUShort();
				if (i_11_ == 65535) {
					i_11_ = -1;
				}
				is[i_10_] = i_11_;
				is_8_[i_10_] = Canvas_Sub1.inputStream.getUByteS();
				is_9_[i_10_] = Canvas_Sub1.inputStream.getULEShortA();
			}
			Class120_Sub12_Sub32.method1370(player, is_9_, is_8_, is);
		}
		if ((mask & 0x10) != 0) {
			player.textSpoken = Canvas_Sub1.inputStream.getJagexString();
			if (player.textSpoken.charAt(0) != '~') {
				if (player == TileParticleQueue.selfPlayer) {
					AbstractRequest.method1540(player.getTitledName(), 2, player.textSpoken);
				}
			} else {
				player.textSpoken = player.textSpoken.substring(1);
				AbstractRequest.method1540(player.getTitledName(), 2, player.textSpoken);
			}
			player.anInt2995 = 0;
			player.anInt2976 = 0;
			player.textCycle = 150;
		}
		if ((0x20 & mask) != 0) {
			int i_12_ = Canvas_Sub1.inputStream.getUShortA();
			final int staffLevel = Canvas_Sub1.inputStream.getUByteA();
			final boolean bool = (i_12_ & 0x8000) != 0;
			final int i_14_ = Canvas_Sub1.inputStream.getUByteS();
			final int i_15_ = Canvas_Sub1.inputStream.pos;
			if (player.name != null && player.appearance != null) {
				final long nameAsLong = Varp.stringToLong(player.name);
				boolean ignore = false;
				if (staffLevel <= 1) {
					if (!bool && (VarBit.aBoolean167 && !OverlayType.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464)) {
						ignore = true;
					} else {
						for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
							if (nameAsLong == HintIcon.ignoreNamesAsLong[id]) {
								ignore = true;
								break;
							}
						}
					}
				}
				if (!ignore && Class69_Sub3.isInTutIsland == 0) {
					Class120_Sub12_Sub19.aClass120_Sub7_3278.pos = 0;
					int i_18_ = -1;
					Canvas_Sub1.inputStream.getBufferReverse(Class120_Sub12_Sub19.aClass120_Sub7_3278.buf, 0, i_14_);
					Class120_Sub12_Sub19.aClass120_Sub7_3278.pos = 0;
					String message;
					if (bool) {
						i_12_ &= 0x7fff;
						final Class22 class22 = Class22.decode(Class120_Sub12_Sub19.aClass120_Sub7_3278);
						i_18_ = class22.anInt129;
						message = class22.aClass120_Sub14_Sub10_128.method1506(Class120_Sub12_Sub19.aClass120_Sub7_3278);
					} else {
						message = Class120_Sub14_Sub8.method1472(method1705(Class7.decodeText(Class120_Sub12_Sub19.aClass120_Sub7_3278)));
					}
					i_12_ &= 0x7fff;
					final Class22 class22 = Class22.list(15);
					i_18_ = class22.anInt129;
					message = class22.aClass120_Sub14_Sub10_128.method1506(Class120_Sub12_Sub19.aClass120_Sub7_3278);
					player.textSpoken = message.trim();
					player.anInt2995 = i_12_ & 0xff;
					player.textCycle = 150;
					player.anInt2976 = i_12_ >> 8;
					if (staffLevel == 2) {
						Class120_Sub16.method1660(new StringBuilder("<img=1>").append(player.getTitledName()).toString(), i_18_, null, bool ? 17 : 1, message);
					} else if (staffLevel == 1) {
						Class120_Sub16.method1660(new StringBuilder("<img=0>").append(player.getTitledName()).toString(), i_18_, null, bool ? 17 : 1, message);
					} else {
						Class120_Sub16.method1660(player.getTitledName(), i_18_, null, bool ? 17 : 2, message);
					}
				}
			}
			Canvas_Sub1.inputStream.pos = i_15_ + i_14_;
		}
		if ((0x100 & mask) != 0) {
			int spotAnimId = Canvas_Sub1.inputStream.getULEShort();
			final int i_20_ = Canvas_Sub1.inputStream.getInt();
			boolean lowerPriority = true;
			if (spotAnimId== 65535) {
				spotAnimId = -1;
			}
			if (spotAnimId != -1 && player.spotAnimId != -1 && SeqType.list(SpotAnimType.list(spotAnimId).animationId).priority < SeqType.list(SpotAnimType.list(player.spotAnimId).animationId).priority) {
				lowerPriority = false;
			}
			if (lowerPriority) {
				player.anInt2971 = 1;
				player.anInt2965 = i_20_ >> 16;
				player.anInt2963 = 0;
				player.spotAnimFrameId = 0;
				player.anInt2979 = (0xffff & i_20_) + Class101_Sub2.loopCycle;
				if (Class101_Sub2.loopCycle < player.anInt2979) {
					player.spotAnimFrameId = -1;
				}
				player.spotAnimId = spotAnimId;
				if (player.spotAnimId != -1 && Class101_Sub2.loopCycle == player.anInt2979) {
					final int spotAnimAnimationId = SpotAnimType.list(player.spotAnimId).animationId;
					if (spotAnimAnimationId != -1) {
						final SeqType seqType = SeqType.list(spotAnimAnimationId);
						if (seqType != null && seqType.frames != null) {
							Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, 0, player == TileParticleQueue.selfPlayer);
						}
					}
				}
			}
		}
		if ((mask & 0x40) != 0) {
			player.facingEntityIndex = Canvas_Sub1.inputStream.getUShortA();
			if (player.facingEntityIndex == 65535) {
				player.facingEntityIndex = -1;
			}
		}
		if ((0x200 & mask) != 0) {
			player.anInt2967 = Canvas_Sub1.inputStream.getUByteA();
			player.anInt3034 = Canvas_Sub1.inputStream.getUByte();
			player.anInt3015 = Canvas_Sub1.inputStream.getUByteS();
			player.anInt3026 = Canvas_Sub1.inputStream.getUByteA();
			player.anInt3035 = Canvas_Sub1.inputStream.getULEShortA() + Class101_Sub2.loopCycle;
			player.anInt2961 = Canvas_Sub1.inputStream.getULEShortA() + Class101_Sub2.loopCycle;
			player.anInt3008 = Canvas_Sub1.inputStream.getUByteC();
			player.anInt2960 = 1;
			player.anInt3031 = 0;
		}
		if ((0x400 & mask) != 0) {
			final int damage = Canvas_Sub1.inputStream.getUSmart();
			final int type = Canvas_Sub1.inputStream.getUByte();
			player.addHit(damage, type, Class101_Sub2.loopCycle);
		}
	}

	final boolean method1702(final int[] is, final Class90 class90, final int i, final byte[] is_24_) {
		boolean bool;
		try {
			boolean bool_25_ = true;
			int i_26_ = 0;
			Class120_Sub5_Sub1 class120_sub5_sub1 = null;
			for (int i_27_ = 0; i_27_ < 128; i_27_++) {
				if (is_24_ == null || is_24_[i_27_] != 0) {
					int i_28_ = anIntArray2678[i_27_];
					if (i_28_ != 0) {
						if (i_28_ != i_26_) {
							i_26_ = i_28_;
							if ((--i_28_ & 0x1) != 0) {
								class120_sub5_sub1 = class90.method753(is, 47, i_28_ >> 2);
							} else {
								class120_sub5_sub1 = class90.method756(3414, is, i_28_ >> 2);
							}
							if (class120_sub5_sub1 == null) {
								bool_25_ = false;
							}
						}
						if (class120_sub5_sub1 != null) {
							this.aClass120_Sub5_Sub1Array2673[i_27_] = class120_sub5_sub1;
							anIntArray2678[i_27_] = 0;
						}
					}
				}
			}
			bool = bool_25_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qh.F(").append(is != null ? "{...}" : "null").append(',').append(class90 != null ? "{...}" : "null").append(',').append(i).append(',').append(is_24_ != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	public static void method1703(final int i) {
		try {
			aClass50_2679 = null;
			if (i > -37) {
				method1701(null, -2, 34);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qh.D(").append(i).append(')').toString());
		}
	}

	private static final char method1704(final char c) {
		if (c == '\u00b5' || c == '\u0192') {
			return c;
		}
		return Character.toTitleCase(c);
	}

	static final String method1705(final String string) {
		final int i = string.length();
		final char[] cs = new char[i];
		int i_31_ = 2;
		for (int i_32_ = 0; i > i_32_; i_32_++) {
			char c = string.charAt(i_32_);
			if (i_31_ != 0) {
				if (i_31_ == 2 || Character.isUpperCase(c)) {
					c = method1704(c);
				}
			} else {
				c = Character.toLowerCase(c);
			}
			if (Character.isLetter(c)) {
				i_31_ = 0;
			} else if (c != '.' && c != '?' && c != '!') {
				if (Character.isSpaceChar(c)) {
					if (i_31_ != 2) {
						i_31_ = 1;
					}
				} else {
					i_31_ = 1;
				}
			} else {
				i_31_ = 2;
			}
			cs[i_32_] = c;
		}
		return new String(cs);
	}

	final void method1706(final boolean bool) {
		try {
			if (!bool) {
				method1706(false);
			}
			anIntArray2678 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qh.B(").append(bool).append(')').toString());
		}
	}

	public Class120_Sub22() {
		/* empty */
	}

	Class120_Sub22(final byte[] is) {
		anIntArray2678 = new int[128];
		int i = 0;
		this.aByteArray2671 = new byte[128];
		this.aByteArray2681 = new byte[128];
		this.aByteArray2677 = new byte[128];
		this.aClass157Array2676 = new Class157[128];
		this.aShortArray2680 = new short[128];
		this.aClass120_Sub5_Sub1Array2673 = new Class120_Sub5_Sub1[128];
		Buffer class120_sub7;
		for (class120_sub7 = new Buffer(is); class120_sub7.buf[i + class120_sub7.pos] != 0; i++) {
			/* empty */
		}
		final byte[] is_33_ = new byte[i];
		for (int i_34_ = 0; i_34_ < i; i_34_++) {
			is_33_[i_34_] = class120_sub7.getByte();
		}
		i++;
		class120_sub7.pos++;
		int i_35_ = class120_sub7.pos;
		class120_sub7.pos += i;
		int i_36_;
		for (i_36_ = 0; class120_sub7.buf[class120_sub7.pos + i_36_] != 0; i_36_++) {
			/* empty */
		}
		final byte[] is_37_ = new byte[i_36_];
		for (int i_38_ = 0; i_36_ > i_38_; i_38_++) {
			is_37_[i_38_] = class120_sub7.getByte();
		}
		i_36_++;
		class120_sub7.pos++;
		int i_39_ = 0;
		int i_40_ = class120_sub7.pos;
		for (class120_sub7.pos += i_36_; class120_sub7.buf[class120_sub7.pos - -i_39_] != 0; i_39_++) {
			/* empty */
		}
		final byte[] is_41_ = new byte[i_39_];
		for (int i_42_ = 0; i_39_ > i_42_; i_42_++) {
			is_41_[i_42_] = class120_sub7.getByte();
		}
		i_39_++;
		class120_sub7.pos++;
		final byte[] is_43_ = new byte[i_39_];
		int i_44_;
		if (i_39_ > 1) {
			int i_45_ = 1;
			i_44_ = 2;
			is_43_[1] = (byte) 1;
			for (int i_46_ = 2; i_39_ > i_46_; i_46_++) {
				int i_47_ = class120_sub7.getUByte();
				if (i_47_ == 0) {
					i_45_ = i_44_++;
				} else {
					if (i_45_ >= i_47_) {
						i_47_--;
					}
					i_45_ = i_47_;
				}
				is_43_[i_46_] = (byte) i_45_;
			}
		} else {
			i_44_ = i_39_;
		}
		final Class157[] class157s = new Class157[i_44_];
		for (int i_48_ = 0; class157s.length > i_48_; i_48_++) {
			final Class157 class157 = class157s[i_48_] = new Class157();
			int i_49_ = class120_sub7.getUByte();
			if (i_49_ > 0) {
				class157.aByteArray1471 = new byte[i_49_ * 2];
			}
			i_49_ = class120_sub7.getUByte();
			if (i_49_ > 0) {
				class157.aByteArray1468 = new byte[i_49_ * 2 + 2];
				class157.aByteArray1468[1] = (byte) 64;
			}
		}
		int i_50_ = class120_sub7.getUByte();
		final byte[] is_51_ = i_50_ > 0 ? new byte[2 * i_50_] : null;
		i_50_ = class120_sub7.getUByte();
		int i_52_ = 0;
		final byte[] is_53_ = i_50_ <= 0 ? null : new byte[2 * i_50_];
		for (/**/; class120_sub7.buf[i_52_ + class120_sub7.pos] != 0; i_52_++) {
			/* empty */
		}
		final byte[] is_54_ = new byte[i_52_];
		for (int i_55_ = 0; i_52_ > i_55_; i_55_++) {
			is_54_[i_55_] = class120_sub7.getByte();
		}
		class120_sub7.pos++;
		i_52_++;
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < 128; i_57_++) {
			i_56_ += class120_sub7.getUByte();
			this.aShortArray2680[i_57_] = (short) i_56_;
		}
		i_56_ = 0;
		for (int i_58_ = 0; i_58_ < 128; i_58_++) {
			i_56_ += class120_sub7.getUByte();
			this.aShortArray2680[i_58_] += i_56_ << 8;
		}
		int i_59_ = 0;
		int i_60_ = 0;
		int i_61_ = 0;
		for (int i_62_ = 0; i_62_ < 128; i_62_++) {
			if (i_59_ == 0) {
				if (i_60_ >= is_54_.length) {
					i_59_ = -1;
				} else {
					i_59_ = is_54_[i_60_++];
				}
				i_61_ = class120_sub7.method1111();
			}
			this.aShortArray2680[i_62_] += Class120_Sub12_Sub3.method1207(32768, i_61_ - 1 << 14);
			anIntArray2678[i_62_] = i_61_;
			i_59_--;
		}
		i_59_ = 0;
		i_60_ = 0;
		int i_63_ = 0;
		for (int i_64_ = 0; i_64_ < 128; i_64_++) {
			if (anIntArray2678[i_64_] != 0) {
				if (i_59_ == 0) {
					i_63_ = class120_sub7.buf[i_35_++] + -1;
					if (i_60_ >= is_33_.length) {
						i_59_ = -1;
					} else {
						i_59_ = is_33_[i_60_++];
					}
				}
				this.aByteArray2671[i_64_] = (byte) i_63_;
				i_59_--;
			}
		}
		int i_65_ = 0;
		i_60_ = 0;
		i_59_ = 0;
		for (int i_66_ = 0; i_66_ < 128; i_66_++) {
			if (anIntArray2678[i_66_] != 0) {
				if (i_59_ == 0) {
					if (is_37_.length <= i_60_) {
						i_59_ = -1;
					} else {
						i_59_ = is_37_[i_60_++];
					}
					i_65_ = 16 + class120_sub7.buf[i_40_++] << 2;
				}
				this.aByteArray2677[i_66_] = (byte) i_65_;
				i_59_--;
			}
		}
		i_59_ = 0;
		i_60_ = 0;
		Class157 class157 = null;
		for (int i_67_ = 0; i_67_ < 128; i_67_++) {
			if (anIntArray2678[i_67_] != 0) {
				if (i_59_ == 0) {
					class157 = class157s[is_43_[i_60_]];
					if (is_41_.length > i_60_) {
						i_59_ = is_41_[i_60_++];
					} else {
						i_59_ = -1;
					}
				}
				i_59_--;
				this.aClass157Array2676[i_67_] = class157;
			}
		}
		i_59_ = 0;
		i_60_ = 0;
		int i_68_ = 0;
		for (int i_69_ = 0; i_69_ < 128; i_69_++) {
			if (i_59_ == 0) {
				if (is_54_.length <= i_60_) {
					i_59_ = -1;
				} else {
					i_59_ = is_54_[i_60_++];
				}
				if (anIntArray2678[i_69_] > 0) {
					i_68_ = class120_sub7.getUByte() - -1;
				}
			}
			this.aByteArray2681[i_69_] = (byte) i_68_;
			i_59_--;
		}
		this.anInt2674 = class120_sub7.getUByte() - -1;
		for (int i_70_ = 0; i_44_ > i_70_; i_70_++) {
			final Class157 class157_71_ = class157s[i_70_];
			if (class157_71_.aByteArray1471 != null) {
				for (int i_72_ = 1; class157_71_.aByteArray1471.length > i_72_; i_72_ += 2) {
					class157_71_.aByteArray1471[i_72_] = class120_sub7.getByte();
				}
			}
			if (class157_71_.aByteArray1468 != null) {
				for (int i_73_ = 3; class157_71_.aByteArray1468.length - 2 > i_73_; i_73_ += 2) {
					class157_71_.aByteArray1468[i_73_] = class120_sub7.getByte();
				}
			}
		}
		if (is_51_ != null) {
			for (int i_74_ = 1; i_74_ < is_51_.length; i_74_ += 2) {
				is_51_[i_74_] = class120_sub7.getByte();
			}
		}
		if (is_53_ != null) {
			for (int i_75_ = 1; is_53_.length > i_75_; i_75_ += 2) {
				is_53_[i_75_] = class120_sub7.getByte();
			}
		}
		for (int i_76_ = 0; i_76_ < i_44_; i_76_++) {
			final Class157 class157_77_ = class157s[i_76_];
			if (class157_77_.aByteArray1468 != null) {
				i_56_ = 0;
				for (int i_78_ = 2; class157_77_.aByteArray1468.length > i_78_; i_78_ += 2) {
					i_56_ = class120_sub7.getUByte() + 1 + i_56_;
					class157_77_.aByteArray1468[i_78_] = (byte) i_56_;
				}
			}
		}
		for (int i_79_ = 0; i_79_ < i_44_; i_79_++) {
			final Class157 class157_80_ = class157s[i_79_];
			if (class157_80_.aByteArray1471 != null) {
				i_56_ = 0;
				for (int i_81_ = 2; class157_80_.aByteArray1471.length > i_81_; i_81_ += 2) {
					i_56_ = class120_sub7.getUByte() + i_56_ + 1;
					class157_80_.aByteArray1471[i_81_] = (byte) i_56_;
				}
			}
		}
		if (is_51_ != null) {
			i_56_ = class120_sub7.getUByte();
			is_51_[0] = (byte) i_56_;
			for (int i_82_ = 2; is_51_.length > i_82_; i_82_ += 2) {
				i_56_ = 1 + i_56_ + class120_sub7.getUByte();
				is_51_[i_82_] = (byte) i_56_;
			}
			int i_83_ = is_51_[0];
			int i_84_ = is_51_[1];
			for (int i_85_ = 0; i_83_ > i_85_; i_85_++) {
				this.aByteArray2681[i_85_] = (byte) (32 + this.aByteArray2681[i_85_] * i_84_ >> 6);
			}
			for (int i_86_ = 2; is_51_.length > i_86_; i_86_ += 2) {
				final int i_87_ = is_51_[1 + i_86_];
				final int i_88_ = is_51_[i_86_];
				int i_89_ = (-i_83_ + i_88_) / 2 + i_84_ * (-i_83_ + i_88_);
				for (int i_90_ = i_83_; i_88_ > i_90_; i_90_++) {
					final int i_91_ = Canvas_Sub1.method62(-i_83_ + i_88_, i_89_);
					this.aByteArray2681[i_90_] = (byte) (32 + this.aByteArray2681[i_90_] * i_91_ >> 6);
					i_89_ += -i_84_ + i_87_;
				}
				i_84_ = i_87_;
				i_83_ = i_88_;
			}
			for (int i_92_ = i_83_; i_92_ < 128; i_92_++) {
				this.aByteArray2681[i_92_] = (byte) (i_84_ * this.aByteArray2681[i_92_] - -32 >> 6);
			}
		}
		if (is_53_ != null) {
			i_56_ = class120_sub7.getUByte();
			is_53_[0] = (byte) i_56_;
			for (int i_93_ = 2; i_93_ < is_53_.length; i_93_ += 2) {
				i_56_ -= -1 + -class120_sub7.getUByte();
				is_53_[i_93_] = (byte) i_56_;
			}
			int i_94_ = is_53_[1] << 1;
			int i_95_ = is_53_[0];
			for (int i_96_ = 0; i_96_ < i_95_; i_96_++) {
				int i_97_ = (0xff & this.aByteArray2677[i_96_]) - -i_94_;
				if (i_97_ < 0) {
					i_97_ = 0;
				}
				if (i_97_ > 128) {
					i_97_ = 128;
				}
				this.aByteArray2677[i_96_] = (byte) i_97_;
			}
			int i_98_ = 2;
			while (is_53_.length > i_98_) {
				final int i_99_ = is_53_[i_98_];
				final int i_100_ = is_53_[i_98_ + 1] << 1;
				i_98_ += 2;
				int i_101_ = i_94_ * (i_99_ - i_95_) + (-i_95_ + i_99_) / 2;
				for (int i_102_ = i_95_; i_99_ > i_102_; i_102_++) {
					final int i_103_ = Canvas_Sub1.method62(-i_95_ + i_99_, i_101_);
					i_101_ += -i_94_ + i_100_;
					int i_104_ = (0xff & this.aByteArray2677[i_102_]) - -i_103_;
					if (i_104_ < 0) {
						i_104_ = 0;
					}
					if (i_104_ > 128) {
						i_104_ = 128;
					}
					this.aByteArray2677[i_102_] = (byte) i_104_;
				}
				i_95_ = i_99_;
				i_94_ = i_100_;
			}
			for (int i_105_ = i_95_; i_105_ < 128; i_105_++) {
				int i_106_ = i_94_ + (0xff & this.aByteArray2677[i_105_]);
				if (i_106_ < 0) {
					i_106_ = 0;
				}
				if (i_106_ > 128) {
					i_106_ = 128;
				}
				this.aByteArray2677[i_105_] = (byte) i_106_;
			}
		}
		for (int i_107_ = 0; i_107_ < i_44_; i_107_++) {
			class157s[i_107_].anInt1463 = class120_sub7.getUByte();
		}
		for (int i_108_ = 0; i_44_ > i_108_; i_108_++) {
			final Class157 class157_109_ = class157s[i_108_];
			if (class157_109_.aByteArray1471 != null) {
				class157_109_.anInt1464 = class120_sub7.getUByte();
			}
			if (class157_109_.aByteArray1468 != null) {
				class157_109_.anInt1473 = class120_sub7.getUByte();
			}
			if (class157_109_.anInt1463 > 0) {
				class157_109_.anInt1459 = class120_sub7.getUByte();
			}
		}
		for (int i_110_ = 0; i_110_ < i_44_; i_110_++) {
			class157s[i_110_].anInt1470 = class120_sub7.getUByte();
		}
		for (int i_111_ = 0; i_111_ < i_44_; i_111_++) {
			final Class157 class157_112_ = class157s[i_111_];
			if (class157_112_.anInt1470 > 0) {
				class157_112_.anInt1460 = class120_sub7.getUByte();
			}
		}
		for (int i_113_ = 0; i_113_ < i_44_; i_113_++) {
			final Class157 class157_114_ = class157s[i_113_];
			if (class157_114_.anInt1460 > 0) {
				class157_114_.anInt1467 = class120_sub7.getUByte();
			}
		}
	}
}
