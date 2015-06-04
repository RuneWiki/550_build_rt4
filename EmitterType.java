/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//Big thanks to http://www.rune-server.org/members/method/
final class EmitterType {
	int decelerationType = 0;
	boolean activeFirst;
	int startRedVariance;
	int alphaFadeStep;
	int minSize;
	int startBlueVariance;
	int minStartAlpha;
	int texture;
	int minStartGreen;
	int minLevel;
	private int alphaFacePct = 100;
	int fadeRedStep;
	int fadeColor;
	int fadeGreenStep;
	int alphaFadeStart;
	private int speedChangePct;
	int endSpeed;
	int maxParticleRate;
	int colorFadeStart;
	boolean uniformColorVariance;
	int minStartRed;
	int maxLifetime;
	int minSpeed;
	int startupUpdates;
	int decelerationRate;
	static boolean mouseInsideWorldMap;
	int[] globalMagnets;
	short minAngleH;
	int fadeBlueStep;
	int minSetting;
	private int minStartColor;
	private int maxStartBlue;
	private int maxStartAlpha;
	boolean disableHDLighting;
	static volatile int currentClickY = 0;
	int speedChangeStart;
	short maxAngleH;
	boolean checkHeight;
	int ageMark;
	int minLifetime;
	int[] globalMagnetIndices;
	int minStartBlue;
	short minAngleV;
	boolean periodic;
	static byte[] aByteArray761;
	private int maxStartColor;
	short maxAngleV;
	private int colorFadePct;
	int untextured;
	private int maxStartGreen;
	int startGreenVariance;
	int minParticleRate;
	int maxLevel;
	private int maxStartRed;
	private int[] localMagnets;
	int lifetime;
	int[] generalMagnets;
	int startAlphaVariance;
	int speedStep;
	int maxSpeed;
	static js5 aClass50_619;
	static ObjectCache recentUse = new ObjectCache(64);

	static {
		mouseInsideWorldMap = false;
		aByteArray761 = new byte[520];
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

	static final void method699(final int drawX, final int drawY) {
		if (FileSystem.anInt459 > 0) {
			Class111.method981(FileSystem.anInt459);
			FileSystem.anInt459 = 0;
		}
		int i_3_ = 0;
		int yPixelPointer = GraphicsLD.width * drawY;
		int i_6_ = 0;
		for (int y = 1; y < 255; y++) {
			int i_8_ = (256 - y) * Class120_Sub15.anIntArray2597[y] / 256;
			if (i_8_ < 0) {
				i_8_ = 0;
			}
			i_3_ += i_8_;
			for (int x = i_8_; x < 128; x++) {
				final int i_10_ = GraphicsLD.pixels[drawX + yPixelPointer++];
				int i_11_ = Light.anIntArray392[i_3_++];
				if (i_11_ == 0) {
					Class92.torchFlamesSprite.pixels[i_6_++] = i_10_;
				} else {
					int i_12_ = i_11_ + 18;
					if (i_12_ > 255) {
						i_12_ = 255;
					}
					int i_13_ = 238 - i_11_;
					if (i_13_ > 255) {
						i_13_ = 255;
					}
					i_11_ = client.anIntArray679[i_11_];
					Class92.torchFlamesSprite.pixels[i_6_++] = Class120_Sub12_Sub3.method1207(-16711936, i_13_ * Class120_Sub12_Sub3.method1207(16711935, i_10_) + Class120_Sub12_Sub3.method1207(16711935, i_11_) * i_12_) - -Class120_Sub12_Sub3.method1207(16711680, i_13_ * Class120_Sub12_Sub3.method1207(i_10_, 65280) + Class120_Sub12_Sub3.method1207(i_11_, 65280) * i_12_) >> 8;
				}
			}
			for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
				Class92.torchFlamesSprite.pixels[i_6_++] = GraphicsLD.pixels[drawX + yPixelPointer++];
			}
			yPixelPointer += GraphicsLD.width - 128;
		}
		if (!HDToolkit.glEnabled) {
			Class92.torchFlamesSprite.method1591(drawX, drawY);
		} else {
			GraphicsHD.drawPixels(Class92.torchFlamesSprite.pixels, drawX, drawY, Class92.torchFlamesSprite.width, Class92.torchFlamesSprite.height);
		}
	}

	static final AbstractSprite constructAbstractSprite(final js5 js5, final int group, final int file) {
		if (!Class10.decodedSprites(js5, group, file)) {
			return null;
		}
		return Class42.constructAbstractSprite();
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.minAngleH = (short) buffer.getUShort();
			this.maxAngleH = (short) buffer.getUShort();
			this.minAngleV = (short) buffer.getUShort();
			this.maxAngleV = (short) buffer.getUShort();
		} else if (code == 2) {
			buffer.getUByte();
		} else if (code == 3) {
			this.minSpeed = buffer.getInt();
			this.maxSpeed = buffer.getInt();
		} else if (code == 4) {
			this.decelerationType = buffer.getUByte();
			this.decelerationRate = buffer.getByte();
		} else if (code == 5) {
			this.minSize = buffer.getUByte();
		} else if (code == 6) {
			minStartColor = buffer.getInt();
			maxStartColor = buffer.getInt();
		} else if (code == 7) {
			this.minLifetime = buffer.getUShort();
			this.maxLifetime = buffer.getUShort();
		} else if (code == 8) {
			this.minParticleRate = buffer.getUShort();
			this.maxParticleRate = buffer.getUShort();
		} else if (code == 9) {
			final int len = buffer.getUByte();
			localMagnets = new int[len];
			for (int id = 0; id < len; id++) {
				localMagnets[id] = buffer.getUShort();
			}
		} else if (code == 10) {
			final int len = buffer.getUByte();
			this.globalMagnets = new int[len];
			for (int id = 0; id < len; id++) {
				this.globalMagnets[id] = buffer.getUShort();
			}
		} else if (code == 12) {
			this.minLevel = buffer.getByte();
		} else if (code == 13) {
			this.maxLevel = buffer.getByte();
		} else if (code == 14) {
			this.startupUpdates = buffer.getUShort();
		} else if (code == 15) {
			this.texture = buffer.getUShort();
		} else if (code == 16) {
			this.activeFirst = buffer.getUByte() == 1;
			this.ageMark = buffer.getUShort();
			this.lifetime = buffer.getUShort();
			this.periodic = buffer.getUByte() == 1;
		} else if (code == 17) {
			this.untextured = buffer.getUShort();
		} else if (code == 18) {
			this.fadeColor = buffer.getInt();
		} else if (code == 19) {
			this.minSetting = buffer.getUByte();
		} else if (code == 20) {
			colorFadePct = buffer.getUByte();
		} else if (code == 21) {
			alphaFacePct = buffer.getUByte();
		} else if (code == 22) {
			this.endSpeed = buffer.getInt();
		} else if (code == 23) {
			speedChangePct = buffer.getUByte();
		} else if (code == 24) {
			this.uniformColorVariance = false;
		} else if (code == 25) {
			final int i_20_ = buffer.getUByte();
			this.generalMagnets = new int[i_20_];
			for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
				this.generalMagnets[i_21_] = buffer.getUShort();
			}
		} else if (code == 26) {
			this.disableHDLighting = false;
		}
	}

	final void postDecode() {
		if (this.minLevel > -2 || this.maxLevel > -2) {
			this.checkHeight = true;
		}
		this.minStartAlpha = minStartColor >> 24 & 0xff;
		this.minStartRed = minStartColor >> 16 & 0xff;
		this.minStartGreen = minStartColor >> 8 & 0xff;
		this.minStartBlue = minStartColor & 0xff;
		maxStartAlpha = maxStartColor >> 24 & 0xff;
		maxStartRed = maxStartColor >> 16 & 0xff;
		maxStartGreen = maxStartColor >> 8 & 0xff;
		maxStartBlue = maxStartColor & 0xff;
		this.startAlphaVariance = maxStartAlpha - this.minStartAlpha;
		this.startRedVariance = maxStartRed - this.minStartRed;
		this.startGreenVariance = maxStartGreen - this.minStartGreen;
		this.startBlueVariance = maxStartBlue - this.minStartBlue;
		if (this.endSpeed != -1) {
			this.speedChangeStart = speedChangePct * this.maxLifetime / 100;
			if (this.speedChangeStart == 0) {
				this.speedChangeStart = 1;
			}
			this.speedStep = (-this.minSpeed - (-this.minSpeed + this.maxSpeed) / 2 + this.endSpeed) / this.speedChangeStart;
		}
		if (this.fadeColor != 0) {
			this.alphaFadeStart = alphaFacePct * this.maxLifetime / 100;
			this.colorFadeStart = colorFadePct * this.maxLifetime / 100;
			if (this.alphaFadeStart == 0) {
				this.alphaFadeStart = 1;
			}
			if (this.colorFadeStart == 0) {
				this.colorFadeStart = 1;
			}
			this.fadeRedStep = (((0xffe5a4 & this.fadeColor) >> 16) + -this.minStartRed - this.startRedVariance / 2 << 8) / this.colorFadeStart;
			fadeRedStep = fadeRedStep + (this.fadeRedStep > 0 ? -4 : 4);
			this.fadeGreenStep = (((0xff61 & this.fadeColor) >> 8) - this.minStartGreen - this.startGreenVariance / 2 << 8) / this.colorFadeStart;
			fadeGreenStep = fadeGreenStep + (this.fadeGreenStep <= 0 ? 4 : -4);
			this.alphaFadeStep = (-(this.startAlphaVariance / 2) + -this.minStartAlpha + (this.fadeColor >> 24 & 0xff) << 8) / this.alphaFadeStart;
			alphaFadeStep = alphaFadeStep + (this.alphaFadeStep > 0 ? -4 : 4);
			this.fadeBlueStep = (-(this.startBlueVariance / 2) - this.minStartBlue + (this.fadeColor & 0xff) << 8) / this.colorFadeStart;
			fadeBlueStep = fadeBlueStep + (this.fadeBlueStep > 0 ? -4 : 4);
		}
	}

	static final EmitterType list(final int id) {
		EmitterType emitterType = (EmitterType) recentUse.get(id);
		if (emitterType != null) {
			return emitterType;
		}
		final byte[] data = aClass50_619.getFile(0, id);
		emitterType = new EmitterType();
		System.out.println("hello from emitterType - "+id+", "+(data==null));
		if (data != null) {
			emitterType.decode(new Buffer(data));
		}
		emitterType.postDecode();
		recentUse.put(emitterType, id);
		return emitterType;
	}

	public EmitterType() {
		this.texture = -1;
		this.endSpeed = -1;
		this.startupUpdates = 0;
		this.activeFirst = true;
		this.ageMark = -1;
		this.uniformColorVariance = true;
		this.untextured = -1;
		speedChangePct = 100;
		this.checkHeight = false;
		this.maxLevel = -2;
		this.disableHDLighting = true;
		colorFadePct = 100;
		this.periodic = true;
		this.lifetime = -1;
		this.minSetting = 0;
		this.minLevel = -2;
	}
}
