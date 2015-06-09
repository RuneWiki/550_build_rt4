/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SeqType {
	int myId;
	boolean[] aBooleanArray327;
	int shieldDisplayed = -1;
	private int[] interfaceFrames;
	boolean tween = false;
	static int fourthPacketType = 0;
	int weaponDisplayed;
	static AbstractSprite[] hitBarDefaultSprites;
	int walkProperties;
	int resetInPlay = 2;
	int[] delays;
	int resetCycle;
	boolean aBoolean340;
	boolean aBoolean341;
	int[] frames;
	int speedupType;
	boolean aBoolean344;
	static String loginPassword = "";
	int loop;//orig
	int[][] anIntArrayArray347;
	int priority;//orig
	static js5 aClass50_2286;
	static ObjectCache recentUse = new ObjectCache(64);
	static int anInt349;

	final AbstractModelRenderer method320(final AbstractModelRenderer class180_sub7, int i, int i_0_, int i_1_, final int i_2_) {
		final int i_4_ = this.delays[i_0_];
		i_0_ = this.frames[i_0_];
		final FrameGroup class120_sub14_sub18 = FrameGroup.list(i_0_ >> 16);
		i_0_ &= 0xffff;
		if (class120_sub14_sub18 == null) {
			return class180_sub7.method2376(true, true, true);
		}
		FrameGroup class120_sub14_sub18_5_ = null;
		i_1_ &= 0x3;
		if ((this.tween || Class164.forceTweenEnabled) && i != -1 && this.frames.length > i) {
			i = this.frames[i];
			class120_sub14_sub18_5_ = FrameGroup.list(i >> 16);
			i &= 0xffff;
		}
		AbstractModelRenderer class180_sub7_6_;
		if (class120_sub14_sub18_5_ != null) {
			class180_sub7_6_ = class180_sub7.method2376(!class120_sub14_sub18.method1578(i_0_) & !class120_sub14_sub18_5_.method1578(i), !class120_sub14_sub18.method1579(i_0_) & !class120_sub14_sub18_5_.method1579(i), !this.aBoolean341);
		} else {
			class180_sub7_6_ = class180_sub7.method2376(!class120_sub14_sub18.method1578(i_0_), !class120_sub14_sub18.method1579(i_0_), !this.aBoolean341);
		}
		if (this.aBoolean341 && HDToolkit.glEnabled) {
			if (i_1_ != 1) {
				if (i_1_ == 2) {
					((HDModelRenderer) class180_sub7_6_).method2409();
				} else if (i_1_ == 3) {
					((HDModelRenderer) class180_sub7_6_).method2422();
				}
			} else {
				((HDModelRenderer) class180_sub7_6_).method2408();
			}
		} else if (i_1_ != 1) {
			if (i_1_ != 2) {
				if (i_1_ == 3) {
					class180_sub7_6_.rotate90();
				}
			} else {
				class180_sub7_6_.rotate180();
			}
		} else {
			class180_sub7_6_.rotate270();
		}
		class180_sub7_6_.method2380(class120_sub14_sub18, i_0_, class120_sub14_sub18_5_, i, i_2_ + -1, i_4_, this.aBoolean341);
		if (this.aBoolean341 && HDToolkit.glEnabled) {
			if (i_1_ != 1) {
				if (i_1_ == 2) {
					((HDModelRenderer) class180_sub7_6_).method2409();
				} else if (i_1_ == 3) {
					((HDModelRenderer) class180_sub7_6_).method2408();
				}
			} else {
				((HDModelRenderer) class180_sub7_6_).method2422();
			}
		} else if (i_1_ != 1) {
			if (i_1_ != 2) {
				if (i_1_ == 3) {
					class180_sub7_6_.rotate270();
				}
			} else {
				class180_sub7_6_.rotate180();
			}
		} else {
			class180_sub7_6_.rotate90();
		}
		return class180_sub7_6_;
	}

	static final void method321(int i, int i_7_, final int i_8_, final int i_9_) {
		if (Class120_Sub30_Sub2.anInt3699 <= i_9_ && i_9_ <= Identikit.anInt1334) {
			i = Class3.method83(MagnetType.anInt260, i, ParamType.anInt3544);
			i_7_ = Class3.method83(MagnetType.anInt260, i_7_, ParamType.anInt3544);
			GZIPDecompressor.method717(i, i_7_, i_8_, i_9_);
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final AbstractModelRenderer method323(final AbstractModelRenderer class180_sub7, final int i, int i_10_, final int i_11_) {
		final int i_13_ = this.delays[i_11_];
		int i_14_ = this.frames[i_11_];
		final FrameGroup class120_sub14_sub18 = FrameGroup.list(i_14_ >> 16);
		i_14_ &= 0xffff;
		if (class120_sub14_sub18 == null) {
			return class180_sub7.method2376(true, true, true);
		}
		FrameGroup class120_sub14_sub18_15_ = null;
		if ((this.tween || Class164.forceTweenEnabled) && i_10_ != -1 && i_10_ < this.frames.length) {
			i_10_ = this.frames[i_10_];
			class120_sub14_sub18_15_ = FrameGroup.list(i_10_ >> 16);
			i_10_ &= 0xffff;
		}
		FrameGroup class120_sub14_sub18_16_ = null;
		int i_17_ = 0;
		int i_18_ = 0;
		FrameGroup class120_sub14_sub18_19_ = null;
		if (interfaceFrames != null) {
			if (i_11_ < interfaceFrames.length) {
				i_18_ = interfaceFrames[i_11_];
				if (i_18_ != 65535) {
					class120_sub14_sub18_16_ = FrameGroup.list(i_18_ >> 16);
					i_18_ &= 0xffff;
				}
			}
			if ((this.tween || Class164.forceTweenEnabled) && i_10_ != -1 && i_10_ < interfaceFrames.length) {
				i_17_ = interfaceFrames[i_10_];
				if (i_17_ != 65535) {
					class120_sub14_sub18_19_ = FrameGroup.list(i_17_ >> 16);
					i_17_ &= 0xffff;
				}
			}
		}
		boolean bool_20_ = !class120_sub14_sub18.method1578(i_14_);
		boolean bool_21_ = !class120_sub14_sub18.method1579(i_14_);
		if (class120_sub14_sub18_16_ != null) {
			bool_20_ = bool_20_ & !class120_sub14_sub18_16_.method1578(i_18_);
			bool_21_ = bool_21_ & !class120_sub14_sub18_16_.method1579(i_18_);
		}
		if (class120_sub14_sub18_15_ != null) {
			bool_20_ = bool_20_ & !class120_sub14_sub18_15_.method1578(i_10_);
			bool_21_ = bool_21_ & !class120_sub14_sub18_15_.method1579(i_10_);
		}
		if (class120_sub14_sub18_19_ != null) {
			bool_20_ = bool_20_ & !class120_sub14_sub18_19_.method1578(i_17_);
			bool_21_ = bool_21_ & !class120_sub14_sub18_19_.method1579(i_17_);
		}
		final AbstractModelRenderer class180_sub7_22_ = class180_sub7.method2376(bool_20_, bool_21_, !this.aBoolean341);
		class180_sub7_22_.method2380(class120_sub14_sub18, i_14_, class120_sub14_sub18_15_, i_10_, i - 1, i_13_, this.aBoolean341);
		if (class120_sub14_sub18_16_ != null) {
			class180_sub7_22_.method2380(class120_sub14_sub18_16_, i_18_, class120_sub14_sub18_19_, i_17_, i - 1, i_13_, this.aBoolean341);
		}
		return class180_sub7_22_;
	}

	final AbstractModelRenderer method324(final AbstractModelRenderer class180_sub7, int frameId, final int delay, int nextFrameId) {
		final int i_27_ = this.delays[frameId];
		frameId = this.frames[frameId];
		final FrameGroup class120_sub14_sub18 = FrameGroup.list(frameId >> 16);
		frameId &= 0xffff;
		if (class120_sub14_sub18 == null) {
			return class180_sub7.method2381(true, true, true);
		}
		FrameGroup class120_sub14_sub18_28_ = null;
		if ((this.tween || Class164.forceTweenEnabled) && nextFrameId != -1 && nextFrameId < this.frames.length) {
			nextFrameId = this.frames[nextFrameId];
			class120_sub14_sub18_28_ = FrameGroup.list(nextFrameId >> 16);
			nextFrameId &= 0xffff;
		}
		AbstractModelRenderer class180_sub7_29_;
		if (class120_sub14_sub18_28_ == null) {
			class180_sub7_29_ = class180_sub7.method2381(!class120_sub14_sub18.method1578(frameId), !class120_sub14_sub18.method1579(frameId), !this.aBoolean341);
		} else {
			class180_sub7_29_ = class180_sub7.method2381(!class120_sub14_sub18.method1578(frameId) & !class120_sub14_sub18_28_.method1578(nextFrameId), !class120_sub14_sub18.method1579(frameId) & !class120_sub14_sub18_28_.method1579(nextFrameId), !this.aBoolean341);
		}
		class180_sub7_29_.method2380(class120_sub14_sub18, frameId, class120_sub14_sub18_28_, nextFrameId, delay - 1, i_27_, this.aBoolean341);
		return class180_sub7_29_;
	}

	static final void method325(final int i, final int i_30_, final int i_31_, final int i_32_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(8, i_32_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3492 = i;
		class120_sub14_sub7.anInt3486 = i_30_;
		class120_sub14_sub7.anInt3484 = i_31_;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			final int len = buffer.getUShort();
			this.delays = new int[len];
			for (int id = 0; id < len; id++) {
				this.delays[id] = buffer.getUShort();
			}
			this.frames = new int[len];
			for (int id = 0; id < len; id++) {
				this.frames[id] = buffer.getUShort();
			}
			for (int id = 0; id < len; id++) {
				this.frames[id] = (buffer.getUShort() << 16) + this.frames[id];
			}
		} else if (code == 2) {
			this.loop = buffer.getUShort();
		} else if (code == 3) {
			this.aBooleanArray327 = new boolean[256];
			final int len = buffer.getUByte();
			for (int id = 0; id < len; id++) {
				this.aBooleanArray327[buffer.getUByte()] = true;
			}
		} else if (code == 4) {
			this.aBoolean344 = true;
		} else if (code == 5) {
			this.priority = buffer.getUByte();
		} else if (code == 6) {
			this.shieldDisplayed = buffer.getUShort();
		} else if (code == 7) {
			this.weaponDisplayed = buffer.getUShort();
		} else if (code == 8) {
			this.resetCycle = buffer.getUByte();
		} else if (code == 9) {
			this.speedupType = buffer.getUByte();
		} else if (code == 10) {
			this.walkProperties = buffer.getUByte();
		} else if (code == 11) {
			this.resetInPlay = buffer.getUByte();
		} else if (code == 12) {
			final int len = buffer.getUByte();
			interfaceFrames = new int[len];
			for (int id = 0; id < len; id++) {
				interfaceFrames[id] = buffer.getUShort();
			}
			for (int id = 0; id < len; id++) {
				interfaceFrames[id] = (buffer.getUShort() << 16) + interfaceFrames[id];
			}
		} else if (code == 13) {
			final int i_39_ = buffer.getUShort();
			this.anIntArrayArray347 = new int[i_39_][];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				final int i_41_ = buffer.getUByte();
				if (i_41_ > 0) {
					this.anIntArrayArray347[i_40_] = new int[i_41_];
					this.anIntArrayArray347[i_40_][0] = buffer.getMedium();
					for (int i_42_ = 1; i_41_ > i_42_; i_42_++) {
						this.anIntArrayArray347[i_40_][i_42_] = buffer.getUShort();
					}
				}
			}
		} else if (code == 14) {
			this.aBoolean341 = true;
		} else if (code == 15) {
			this.tween = true;
		} else if (code == 16) {
			this.aBoolean340 = true;
		}
	}

	final AbstractModelRenderer method327(int i, final int i_48_, int i_50_, int i_51_, final AbstractModelRenderer class180_sub7) {
		final int i_53_ = this.delays[i_50_];
		i_50_ = this.frames[i_50_];
		final FrameGroup class120_sub14_sub18 = FrameGroup.list(i_50_ >> 16);
		i_50_ &= 0xffff;
		if (class120_sub14_sub18 == null) {
			return class180_sub7.method2378(true, true, true);
		}
		i_51_ &= 0x3;
		FrameGroup class120_sub14_sub18_54_ = null;
		if ((this.tween || Class164.forceTweenEnabled) && (i ^ 0xffffffff) != 0 && i < this.frames.length) {
			i = this.frames[i];
			class120_sub14_sub18_54_ = FrameGroup.list(i >> 16);
			i &= 0xffff;
		}
		AbstractModelRenderer class180_sub7_55_;
		if (class120_sub14_sub18_54_ != null) {
			class180_sub7_55_ = class180_sub7.method2378(!class120_sub14_sub18.method1578(i_50_) & !class120_sub14_sub18_54_.method1578(i), !class120_sub14_sub18.method1579(i_50_) & !class120_sub14_sub18_54_.method1579(i), !this.aBoolean341);
		} else {
			class180_sub7_55_ = class180_sub7.method2378(!class120_sub14_sub18.method1578(i_50_), !class120_sub14_sub18.method1579(i_50_), !this.aBoolean341);
		}
		if (!HDToolkit.glEnabled || !this.aBoolean341) {
			if (i_51_ != 1) {
				if (i_51_ == 2) {
					class180_sub7_55_.rotate180();
				} else if (i_51_ == 3) {
					class180_sub7_55_.rotate90();
				}
			} else {
				class180_sub7_55_.rotate270();
			}
		} else if (i_51_ == 1) {
			((HDModelRenderer) class180_sub7_55_).method2408();
		} else if (i_51_ != 2) {
			if (i_51_ == 3) {
				((HDModelRenderer) class180_sub7_55_).method2422();
			}
		} else {
			((HDModelRenderer) class180_sub7_55_).method2409();
		}
		class180_sub7_55_.method2380(class120_sub14_sub18, i_50_, class120_sub14_sub18_54_, i, -1 + i_48_, i_53_, this.aBoolean341);
		if (!HDToolkit.glEnabled || !this.aBoolean341) {
			if (i_51_ != 1) {
				if (i_51_ == 2) {
					class180_sub7_55_.rotate180();
				} else if (i_51_ == 3) {
					class180_sub7_55_.rotate270();
				}
			} else {
				class180_sub7_55_.rotate90();
			}
		} else if (i_51_ == 1) {
			((HDModelRenderer) class180_sub7_55_).method2422();
		} else if (i_51_ == 2) {
			((HDModelRenderer) class180_sub7_55_).method2409();
		} else if (i_51_ == 3) {
			((HDModelRenderer) class180_sub7_55_).method2408();
		}
		return class180_sub7_55_;
	}

	final void postDecode() {
		if (this.speedupType == -1) {
			if (this.aBooleanArray327 != null) {
				this.speedupType = 2;
			} else {
				this.speedupType = 0;
			}
		}
		if (this.walkProperties == -1) {
			if (this.aBooleanArray327 != null) {
				this.walkProperties = 2;
			} else {
				this.walkProperties = 0;
			}
		}
	}

	static final SeqType list(final int id) {
		SeqType seqType = (SeqType) recentUse.get(id);
		if (seqType != null) {
			return seqType;
		}
		final byte[] data = aClass50_2286.getFile(id >>> 7, id & 0x7f);
		seqType = new SeqType();
		seqType.myId = id;
		if (data != null) {
			seqType.decode(new Buffer(data));
		}
		seqType.postDecode();
		recentUse.put(seqType, id);
		return seqType;
	}

	public SeqType() {
		this.walkProperties = -1;
		this.aBoolean340 = false;
		this.speedupType = -1;
		this.weaponDisplayed = -1;
		this.resetCycle = 99;
		this.aBoolean341 = false;
		this.loop = -1;
		this.aBoolean344 = false;
		this.priority = 5;
	}
}
