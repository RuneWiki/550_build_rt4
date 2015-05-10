/* Class120_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub31 extends Node {
	byte[] aByteArray2785;
	Hashtable aClass75_2786;

	final void method1828() {
		if (this.aClass75_2786 == null) {
			this.aClass75_2786 = new Hashtable(16);
			final int[] is = new int[16];
			final int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			final Class62 class62 = new Class62(this.aByteArray2785);
			final int i = class62.method566();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class62.method561(i_1_);
				class62.method557(i_1_);
				class62.method568(i_1_);
			}
			while_16_: for (;;) {
				final int i_2_ = class62.method564();
				final int i_3_ = class62.anIntArray572[i_2_];
				while (class62.anIntArray572[i_2_] == i_3_) {
					class62.method561(i_2_);
					final int i_4_ = class62.method569(i_2_);
					if (i_4_ == 1) {
						class62.method558();
						class62.method568(i_2_);
						if (!class62.method563()) {
							break;
						}
						break while_16_;
					}
					final int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						final int i_6_ = i_4_ & 0xf;
						final int i_7_ = i_4_ >> 8 & 0x7f;
						final int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0) {
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						}
						if (i_7_ == 32) {
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
						}
					}
					if (i_5_ == 192) {
						final int i_9_ = i_4_ & 0xf;
						final int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						final int i_11_ = i_4_ & 0xf;
						final int i_12_ = i_4_ >> 8 & 0x7f;
						final int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							final int i_14_ = is_0_[i_11_];
							Class120_Sub11 class120_sub11 = (Class120_Sub11) this.aClass75_2786.get(i_14_);
							if (class120_sub11 == null) {
								class120_sub11 = new Class120_Sub11(new byte[128]);
								this.aClass75_2786.put(class120_sub11, i_14_);
							}
							class120_sub11.aByteArray2555[i_12_] = (byte) 1;
						}
					}
					class62.method557(i_2_);
					class62.method568(i_2_);
				}
			}
		}
	}

	private Class120_Sub31(final Buffer class120_sub7) {
		class120_sub7.pos = class120_sub7.buf.length - 3;
		final int ntracks = class120_sub7.getUByte();
		final int tickdiv = class120_sub7.getUShort();
		int i_16_ = 14 + ntracks * 10;
		class120_sub7.pos = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		while_14_: for (int i_25_ = 0; i_25_ < ntracks; i_25_++) {
			int i_26_ = -1;
			for (;;) {
				final int i_27_ = class120_sub7.getUByte();
				if (i_27_ != i_26_) {
					i_16_++;
				}
				i_26_ = i_27_ & 0xf;
				if (i_27_ == 7) {
					continue while_14_;
				}
				if (i_27_ == 23) {
					i_17_++;
				} else if (i_26_ == 0) {
					i_19_++;
				} else if (i_26_ == 1) {
					i_20_++;
				} else if (i_26_ == 2) {
					i_18_++;
				} else if (i_26_ == 3) {
					i_21_++;
				} else if (i_26_ == 4) {
					i_22_++;
				} else if (i_26_ == 5) {
					i_23_++;
				} else {
					if (i_26_ != 6) {
						break;
					}
					i_24_++;
				}
			}
			throw new RuntimeException();
		}
		i_16_ += 5 * i_17_;
		i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
		i_16_ += i_22_ + i_24_;
		final int i_28_ = class120_sub7.pos;
		final int i_29_ = ntracks + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_;
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
			class120_sub7.getVarLength();
		}
		i_16_ += class120_sub7.pos - i_28_;
		int i_31_ = class120_sub7.pos;
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
			i_44_ = i_44_ + class120_sub7.getUByte() & 0x7f;
			if (i_44_ == 0 || i_44_ == 32) {
				i_24_++;
			} else if (i_44_ == 1) {
				i_32_++;
			} else if (i_44_ == 33) {
				i_33_++;
			} else if (i_44_ == 7) {
				i_34_++;
			} else if (i_44_ == 39) {
				i_35_++;
			} else if (i_44_ == 10) {
				i_36_++;
			} else if (i_44_ == 42) {
				i_37_++;
			} else if (i_44_ == 99) {
				i_38_++;
			} else if (i_44_ == 98) {
				i_39_++;
			} else if (i_44_ == 101) {
				i_40_++;
			} else if (i_44_ == 100) {
				i_41_++;
			} else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121 || i_44_ == 123) {
				i_42_++;
			} else {
				i_43_++;
			}
		}
		int i_46_ = 0;
		int i_47_ = class120_sub7.pos;
		class120_sub7.pos += i_42_;
		int i_48_ = class120_sub7.pos;
		class120_sub7.pos += i_23_;
		int i_49_ = class120_sub7.pos;
		class120_sub7.pos += i_22_;
		int i_50_ = class120_sub7.pos;
		class120_sub7.pos += i_21_;
		int i_51_ = class120_sub7.pos;
		class120_sub7.pos += i_32_;
		int i_52_ = class120_sub7.pos;
		class120_sub7.pos += i_34_;
		int i_53_ = class120_sub7.pos;
		class120_sub7.pos += i_36_;
		int i_54_ = class120_sub7.pos;
		class120_sub7.pos += i_19_ + i_20_ + i_23_;
		int i_55_ = class120_sub7.pos;
		class120_sub7.pos += i_19_;
		int i_56_ = class120_sub7.pos;
		class120_sub7.pos += i_43_;
		int i_57_ = class120_sub7.pos;
		class120_sub7.pos += i_20_;
		int i_58_ = class120_sub7.pos;
		class120_sub7.pos += i_33_;
		int i_59_ = class120_sub7.pos;
		class120_sub7.pos += i_35_;
		int i_60_ = class120_sub7.pos;
		class120_sub7.pos += i_37_;
		int i_61_ = class120_sub7.pos;
		class120_sub7.pos += i_24_;
		int i_62_ = class120_sub7.pos;
		class120_sub7.pos += i_21_;
		int i_63_ = class120_sub7.pos;
		class120_sub7.pos += i_38_;
		int i_64_ = class120_sub7.pos;
		class120_sub7.pos += i_39_;
		int i_65_ = class120_sub7.pos;
		class120_sub7.pos += i_40_;
		int i_66_ = class120_sub7.pos;
		class120_sub7.pos += i_41_;
		int i_67_ = class120_sub7.pos;
		class120_sub7.pos += i_17_ * 3;
		this.aByteArray2785 = new byte[i_16_];
		final Buffer class120_sub7_68_ = new Buffer(this.aByteArray2785);
		class120_sub7_68_.putInt(1297377380);//header id
		class120_sub7_68_.putInt(6);//header len
		class120_sub7_68_.putShort(ntracks > 1 ? 1 : 0);//type
		/**
		 * 0 = single track file format 
		   1 = multiple track file format 
		 */
		class120_sub7_68_.putShort(ntracks);//num
		class120_sub7_68_.putShort(tickdiv);
		class120_sub7.pos = i_28_;
		int i_69_ = 0;
		int noteId = 0;
		int noteOnVelocity = 0;
		int noteOffVelocity = 0;
		int pitchBender = 0;
		int pressure = 0;
		int polyphonicPressure = 0;
		final int[] is = new int[128];
		i_44_ = 0;
		for (int i_76_ = 0; i_76_ < ntracks; i_76_++) {
			class120_sub7_68_.putInt(1297379947);//mtrk
			class120_sub7_68_.pos += 4;
			final int i_77_ = class120_sub7_68_.pos;
			int i_78_ = -1;
			while_15_: do {
				for (;;) {
					final int i_79_ = class120_sub7.getVarLength();
					class120_sub7_68_.putVarLength(i_79_);
					final int i_80_ = class120_sub7.buf[i_46_++] & 0xff;
					final boolean bool = i_80_ != i_78_;
					i_78_ = i_80_ & 0xf;
					if (i_80_ == 7) {
						if (bool) {
							class120_sub7_68_.putByte(255);
						}
						class120_sub7_68_.putByte(47);
						class120_sub7_68_.putByte(0);
						break while_15_;
					}
					if (i_80_ == 23) {
						if (bool) {
							class120_sub7_68_.putByte(255);
						}
						class120_sub7_68_.putByte(81);
						class120_sub7_68_.putByte(3);
						class120_sub7_68_.putByte(class120_sub7.buf[i_67_++]);
						class120_sub7_68_.putByte(class120_sub7.buf[i_67_++]);
						class120_sub7_68_.putByte(class120_sub7.buf[i_67_++]);
					} else {
						i_69_ ^= i_80_ >> 4;
		
						if (i_78_ == 0) {//Chan * Note on
							if (bool) {
								class120_sub7_68_.putByte(144 + i_69_);
							}
							noteId += class120_sub7.buf[i_54_++];
							noteOnVelocity += class120_sub7.buf[i_55_++];
							class120_sub7_68_.putByte(noteId & 0x7f);
							class120_sub7_68_.putByte(noteOnVelocity & 0x7f);
						} else if (i_78_ == 1) {//Chan * Note off
							if (bool) {
								class120_sub7_68_.putByte(128 + i_69_);
							}
							noteId += class120_sub7.buf[i_54_++];
							noteOffVelocity += class120_sub7.buf[i_57_++];
							class120_sub7_68_.putByte(noteId & 0x7f);
							class120_sub7_68_.putByte(noteOffVelocity & 0x7f);
						} else if (i_78_ == 2) {//Chan * Control/Mode Change
							if (bool) {
								class120_sub7_68_.putByte(176 + i_69_);
							}
							i_44_ = i_44_ + class120_sub7.buf[i_31_++] & 0x7f;
							class120_sub7_68_.putByte(i_44_);
							int i_81_;
							if (i_44_ == 0 || i_44_ == 32) {
								i_81_ = class120_sub7.buf[i_61_++];
							} else if (i_44_ == 1) {
								i_81_ = class120_sub7.buf[i_51_++];
							} else if (i_44_ == 33) {
								i_81_ = class120_sub7.buf[i_58_++];
							} else if (i_44_ == 7) {
								i_81_ = class120_sub7.buf[i_52_++];
							} else if (i_44_ == 39) {
								i_81_ = class120_sub7.buf[i_59_++];
							} else if (i_44_ == 10) {
								i_81_ = class120_sub7.buf[i_53_++];
							} else if (i_44_ == 42) {
								i_81_ = class120_sub7.buf[i_60_++];
							} else if (i_44_ == 99) {
								i_81_ = class120_sub7.buf[i_63_++];
							} else if (i_44_ == 98) {
								i_81_ = class120_sub7.buf[i_64_++];
							} else if (i_44_ == 101) {
								i_81_ = class120_sub7.buf[i_65_++];
							} else if (i_44_ == 100) {
								i_81_ = class120_sub7.buf[i_66_++];
							} else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121 || i_44_ == 123) {
								i_81_ = class120_sub7.buf[i_47_++];
							} else {
								i_81_ = class120_sub7.buf[i_56_++];
							}
							i_81_ += is[i_44_];
							is[i_44_] = i_81_;
							class120_sub7_68_.putByte(i_81_ & 0x7f);
						} else if (i_78_ == 3) {//Chan * Pitch Bend Change
							if (bool) {
								class120_sub7_68_.putByte(224 + i_69_);
							}
							pitchBender += class120_sub7.buf[i_62_++];
							pitchBender += class120_sub7.buf[i_50_++] << 7;
							class120_sub7_68_.putByte(pitchBender & 0x7f);
							class120_sub7_68_.putByte(pitchBender >> 7 & 0x7f);
						} else if (i_78_ == 4) {//Chan * Channel Aftertouch
							if (bool) {
								class120_sub7_68_.putByte(208 + i_69_);
							}
							pressure += class120_sub7.buf[i_49_++];
							class120_sub7_68_.putByte(pressure & 0x7f);
						} else if (i_78_ == 5) {//Chan * Polyphonic Aftertouch
							if (bool) {
								class120_sub7_68_.putByte(160 + i_69_);
							}
							noteId += class120_sub7.buf[i_54_++];
							polyphonicPressure += class120_sub7.buf[i_48_++];
							class120_sub7_68_.putByte(noteId & 0x7f);
							class120_sub7_68_.putByte(polyphonicPressure & 0x7f);
						} else {
							if (i_78_ != 6) {//Chan * Program Change
								break;
							}
							if (bool) {
								class120_sub7_68_.putByte(192 + i_69_);
							}
							class120_sub7_68_.putByte(class120_sub7.buf[i_61_++]);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class120_sub7_68_.method1112(class120_sub7_68_.pos - i_77_);
		}
	}

	final void method1829() {
		this.aClass75_2786 = null;
	}

	static final Class120_Sub31 list(final js5 js5, final int i, final int i_82_) {
		final byte[] is = js5.getFile(i, i_82_);
		if (is == null) {
			return null;
		}
		return new Class120_Sub31(new Buffer(is));
	}
}
