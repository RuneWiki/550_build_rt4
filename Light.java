/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Light {
	static String aString369 = null;
	int anInt370;
	boolean aBoolean371;
	short[] aShortArray372;
	int z;
	int colorRgb;
	int y;
	int anInt376;
	float[] diffuse;
	private int flickeringType;
	static int anInt379;
	Class133 aClass133_380;
	static JagexSocket aClass46_381;
	boolean aBoolean382;
	int anInt384;
	boolean aBoolean385;
	private int anInt386;
	float quadraticAttenuation;
	private int anInt388;
	private int anInt389;
	private int anInt390;
	static int anInt391 = 0;
	static int[] anIntArray392;
	static int objSelected = 0;
	float aFloat394;
	int x;

	final void method347(final int i, final int i_1_, final int i_2_, final int i_3_) {
		flickeringType = i_2_;
		anInt386 = i_3_;
		anInt388 = i_1_;
		anInt389 = i;
	}

	private final void method348() {
		int i_4_ = anInt376;
		if (i_4_ == 2) {
			anInt389 = 2048;
			anInt388 = 0;
			flickeringType = 1;
			anInt386 = 2048;
		} else if (i_4_ == 3) {
			anInt388 = 0;
			anInt386 = 4096;
			flickeringType = 1;
			anInt389 = 2048;
		} else if (i_4_ == 4) {
			anInt388 = 0;
			anInt389 = 2048;
			flickeringType = 4;
			anInt386 = 2048;
		} else if (i_4_ == 5) {
			flickeringType = 4;
			anInt389 = 2048;
			anInt386 = 8192;
			anInt388 = 0;
		} else if (i_4_ == 12) {
			anInt389 = 2048;
			flickeringType = 2;
			anInt386 = 2048;
			anInt388 = 0;
		} else if (i_4_ == 13) {
			anInt386 = 8192;
			anInt389 = 2048;
			flickeringType = 2;
			anInt388 = 0;
		} else if (i_4_ == 10) {
			anInt389 = 512;
			flickeringType = 3;
			anInt388 = 1536;
			anInt386 = 2048;
		} else if (i_4_ == 11) {
			flickeringType = 3;
			anInt386 = 4096;
			anInt389 = 512;
			anInt388 = 1536;
		} else if (i_4_ == 6) {
			anInt389 = 768;
			anInt388 = 1280;
			flickeringType = 3;
			anInt386 = 2048;
		} else if (i_4_ == 7) {
			anInt389 = 768;
			anInt388 = 1280;
			anInt386 = 4096;
			flickeringType = 3;
		} else if (i_4_ == 8) {
			anInt386 = 2048;
			flickeringType = 3;
			anInt389 = 1024;
			anInt388 = 1024;
		} else if (i_4_ == 9) {
			anInt386 = 4096;
			anInt388 = 1024;
			anInt389 = 1024;
			flickeringType = 3;
		} else if (i_4_ == 14) {
			anInt386 = 2048;
			anInt388 = 1280;
			flickeringType = 1;
			anInt389 = 768;
		} else if (i_4_ == 15) {
			anInt389 = 512;
			anInt386 = 4096;
			anInt388 = 1536;
			flickeringType = 1;
		} else if (i_4_ == 16) {
			anInt386 = 8192;
			anInt388 = 1792;
			flickeringType = 1;
			anInt389 = 256;
		} else {
			anInt386 = 2048;
			anInt388 = 0;
			anInt389 = 2048;
			flickeringType = 0;
		}
	}

	private final void method349() {
		final int i_5_ = 64 + (this.anInt370 << 7);
		this.quadraticAttenuation = 1.0F / (i_5_ * i_5_);
	}

	final void method350(boolean bool, final int i) {
		final int i_7_ = anInt390 + (anInt386 * i / 50) & 0x7ff;
		int type = flickeringType;
		int i_9_ = 0;
		if (type == 1) {
			i_9_ = 1024 + (Rasterizer.sineTable[i_7_] >> 6);
		} else if (type == 2) {
			i_9_ = i_7_;
		} else if (type == 3) {
			i_9_ = JavaObject.anIntArray3916[i_7_] >> 1;
		} else if (type == 4) {
			i_9_ = i_7_ >> 10 << 11;
		} else if (type == 5) {
			i_9_ = (i_7_ < 1024 ? i_7_ : -i_7_ + 2048) << 1;
		} else {
			i_9_ = 2048;
		}
		if (bool) {
			i_9_ = 2048;
		}
		this.aFloat394 = ((i_9_ * anInt389 >> 11) + anInt388) / 2048.0F;
		float f = this.aFloat394 / 255.0F;
		this.diffuse[0] = (0xff & this.colorRgb >> 16) * f;
		this.diffuse[1] = (0xff & this.colorRgb >> 8) * f;
		this.diffuse[2] = (0xff & this.colorRgb) * f;
	}

	static final boolean isIgnored(final String name) {
		if (name == null) {
			return false;
		}
		for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
			if (name.equalsIgnoreCase(GZIPDecompressor.ignoreNames[id])) {
				return true;
			}
		}
		return false;
	}

	public static void method352() {
		aString369 = null;
		anIntArray392 = null;
		InvType.recentUse = null;
		aClass46_381 = null;
	}

	static final boolean isShowingVideoAd() {
		if (Class48.jsEnabled) {
			boolean bool_11_ = false;
			try {
				bool_11_ = !((Boolean) JSHelper.call(NpcType.gameSignlink.gameApplet, "showingVideoAd")).booleanValue();
			} catch (final Throwable throwable) {
				/* empty */
			}
			return bool_11_;
		}
		return true;
	}

	protected Light() {
		this.diffuse = new float[4];
		this.aBoolean385 = false;
		if (JavaObject.anIntArray3916 == null) {
			Js5Request.method1550();
		}
		method348();
	}

	Light(final Buffer buffer) {
		this.diffuse = new float[4];
		this.aBoolean385 = false;
		if (JavaObject.anIntArray3916 == null) {
			Js5Request.method1550();
		}
		this.anInt384 = buffer.getUByte();
		this.aBoolean371 = (0x10 & this.anInt384) != 0;
		this.aBoolean382 = (0x8 & this.anInt384) != 0;
		this.anInt384 = this.anInt384 & 0x7;
		this.x = buffer.getUShort();
		this.z = buffer.getUShort();
		this.y = buffer.getUShort();
		this.anInt370 = buffer.getUByte();
		method349();
		this.aShortArray372 = new short[this.anInt370 * 2 + 1];
		for (int i = 0; i < this.aShortArray372.length; i++) {
			this.aShortArray372[i] = (short) buffer.getUShort();
		}
		this.colorRgb = Rasterizer.palette[buffer.getUShort()];
		final int i = buffer.getUByte();
		this.anInt376 = 0x1f & i;
		anInt390 = 0x700 & i << 3;
		if (this.anInt376 != 31) {
			method348();
		}
	}
}
