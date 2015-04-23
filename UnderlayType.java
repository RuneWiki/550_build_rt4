/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class UnderlayType {
	int anInt1218;
	static NodeCache aClass35_1219;
	boolean aBoolean1220;
	static short[][] aShortArrayArray1221 = {
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992,
					-12924, -12904 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992,
					-12924, -12904 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992,
					-12924, -12904 } };
	int anInt1222;
	static int renderPitch;
	private int groundRgb = 0;
	int anInt1225;
	int anInt1226;
	int anInt1227;
	static boolean aBoolean1228;
	int anInt1229;
	static js5 configClient;
	static ObjectCache recentUse = new ObjectCache(64);

	static {
		aClass35_1219 = new NodeCache(128);
		aBoolean1228 = false;
	}

	static final byte[] method1899(final int i) {
		OverlayFrequencyNode class120_sub14_sub20 = (OverlayFrequencyNode) Class181.aClass35_1784.get(i);
		if (class120_sub14_sub20 == null) {
			final byte[] is_1_ = new byte[512];
			final Random random = new Random(i);
			for (int i_2_ = 0; i_2_ < 255; i_2_++) {
				is_1_[i_2_] = (byte) i_2_;
			}
			for (int i_3_ = 0; i_3_ < 255; i_3_++) {
				final int i_4_ = 255 - i_3_;
				final int i_5_ = Class28.method244(random, i_4_);
				final byte i_6_ = is_1_[i_5_];
				is_1_[i_5_] = is_1_[i_4_];
				is_1_[i_4_] = is_1_[511 - i_3_] = i_6_;
			}
			class120_sub14_sub20 = new OverlayFrequencyNode(is_1_);
			Class181.aClass35_1784.put(class120_sub14_sub20, i);
		}
		return class120_sub14_sub20.aByteArray3623;
	}

	static final void method1900() {
		Projectile.method2318(Class140.anInt1343);
		final int i_7_ = (FileSystemWorker.renderX >> 10) + (GameEntity.currentBaseX >> 3);
		final int i_8_ = (GroundObjectNode.renderZ >> 10) + (Class181.currentBaseZ >> 3);
		int i_11_ = 18;
		RuntimeException_Sub1.aByteArrayArray2140 = new byte[i_11_][];
		LookupTable.anIntArray495 = new int[i_11_];
		Class120_Sub12_Sub36.aByteArrayArray3421 = new byte[i_11_][];
		ProducingGraphicsBuffer.anIntArray2796 = new int[i_11_];
		Class28.anIntArray183 = new int[i_11_];
		Class179.aByteArrayArray1777 = new byte[i_11_][];
		Class111.anIntArray1063 = new int[i_11_];
		Class101_Sub1.aByteArrayArray2271 = new byte[i_11_][];
		Class120_Sub12_Sub36.anIntArray3417 = new int[i_11_];
		Class125.anIntArrayArray2150 = new int[i_11_][4];
		Class76.anIntArray680 = new int[i_11_];
		Class134.aByteArrayArray1287 = new byte[i_11_][];
		i_11_ = 0;
		for (int i_12_ = (i_7_ - 6) / 8; i_12_ <= (i_7_ + 6) / 8; i_12_++) {
			for (int i_13_ = (i_8_ - 6) / 8; i_13_ <= (i_8_ + 6) / 8; i_13_++) {
				final int i_14_ = (i_12_ << 8) + i_13_;
				Class120_Sub12_Sub36.anIntArray3417[i_11_] = i_14_;
				LookupTable.anIntArray495[i_11_] = Class65.aClass50_597.getGroupId(new StringBuilder("m").append(i_12_).append("_").append(i_13_).toString());
				Class28.anIntArray183[i_11_] = Class65.aClass50_597.getGroupId(new StringBuilder("l").append(i_12_).append("_").append(i_13_).toString());
				ProducingGraphicsBuffer.anIntArray2796[i_11_] = Class65.aClass50_597.getGroupId(new StringBuilder("n").append(i_12_).append("_").append(i_13_).toString());
				Class111.anIntArray1063[i_11_] = Class65.aClass50_597.getGroupId(new StringBuilder("um").append(i_12_).append("_").append(i_13_).toString());
				Class76.anIntArray680[i_11_] = Class65.aClass50_597.getGroupId(new StringBuilder("ul").append(i_12_).append("_").append(i_13_).toString());
				if (ProducingGraphicsBuffer.anIntArray2796[i_11_] == -1) {
					LookupTable.anIntArray495[i_11_] = -1;
					Class28.anIntArray183[i_11_] = -1;
					Class111.anIntArray1063[i_11_] = -1;
					Class76.anIntArray680[i_11_] = -1;
				}
				i_11_++;
			}
		}
		for (int i_15_ = i_11_; i_15_ < ProducingGraphicsBuffer.anIntArray2796.length; i_15_++) {
			ProducingGraphicsBuffer.anIntArray2796[i_15_] = -1;
			LookupTable.anIntArray495[i_15_] = -1;
			Class28.anIntArray183[i_15_] = -1;
			Class111.anIntArray1063[i_15_] = -1;
			Class76.anIntArray680[i_15_] = -1;
		}
		Class2.method76(true, i_7_, false, 8, 8, i_8_, 0);
	}

	static final void method1901(final int i, final int i_16_, final int i_17_, final int i_18_, final boolean bool, final int i_19_) {
		try {
			if (i == i_19_) {
				Class159.method2096(i_19_, i_17_, i_18_, i_16_);
			} else {
				if (Class32.anInt260 > -i_19_ + i_16_ || ParamType.anInt3544 < i_16_ - -i_19_ || i_18_ + -i < Class120_Sub30_Sub2.anInt3699 || IdentityKit.anInt1334 < i_18_ - -i) {
					Node.method1031(i_18_, i, i_17_, i_19_, i_16_, -43);
				} else {
					Class69_Sub3.method628(-593542495, i, i_16_, i_17_, i_18_, i_19_);
				}
				if (!bool) {
					method1900();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pa.F(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(bool).append(',').append(i_19_).append(')').toString());
		}
	}

	public static void method1902(final byte i) {
		try {
			aClass35_1219 = null;
			aShortArrayArray1221 = null;
			if (i != -110) {
				renderPitch = 115;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pa.D(").append(i).append(')').toString());
		}
	}

	static final void worldToScreenEntity(final GameEntity gameEntity, final int xOff, final int height, final int zOff, final int i_20_, final int i_21_) {
		MapFunctionGroup.worldToScreen(gameEntity.x, height, gameEntity.z, xOff, zOff, i_20_, i_21_);
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

	static final void drawOverlay(final int x, final int y, final int width, final int height) {
		if (Class120_Sub14_Sub22.crossState == 1) {
			Class120_Sub12_Sub30.crossSprites[Class120_Sub12_Sub7.crossIndex / 100].drawSprite(Class120_Sub12_Sub35.crossX - 8, IsaacCipher.crossY - 8);
		}
		if (Class120_Sub14_Sub22.crossState == 2) {
			Class120_Sub12_Sub30.crossSprites[Class120_Sub12_Sub7.crossIndex / 100 + 4].drawSprite(Class120_Sub12_Sub35.crossX - 8, IsaacCipher.crossY - 8);
		}
		FileSystem.checkPlayerLocation();
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			groundRgb = buffer.getMedium();
			calculateHSL(groundRgb);
		} else if (code == 2) {
			this.anInt1227 = buffer.getUShort();
			if (this.anInt1227 == 65535) {
				this.anInt1227 = -1;
			}
		} else if (code == 3) {
			this.anInt1225 = buffer.getUShort();
		} else if (code == 4) {
			this.aBoolean1220 = false;
		}
	}

	private final void calculateHSL(final int rgb) {
		final double d = (rgb >> 16 & 0xff) / 256.0;
		final double d_32_ = ((rgb & 0xff18) >> 8) / 256.0;
		final double d_33_ = (rgb & 0xff) / 256.0;
		double d_34_ = d;
		if (d_34_ > d_32_) {
			d_34_ = d_32_;
		}
		if (d_34_ > d_33_) {
			d_34_ = d_33_;
		}
		double d_35_ = d;
		if (d_35_ < d_32_) {
			d_35_ = d_32_;
		}
		double d_36_ = 0.0;
		if (d_35_ < d_33_) {
			d_35_ = d_33_;
		}
		double d_37_ = 0.0;
		final double d_38_ = (d_34_ + d_35_) / 2.0;
		this.anInt1229 = (int) (d_38_ * 256.0);
		if (this.anInt1229 >= 0) {
			if (this.anInt1229 > 255) {
				this.anInt1229 = 255;
			}
		} else {
			this.anInt1229 = 0;
		}
		if (d_35_ != d_34_) {
			if (0.5 > d_38_) {
				d_37_ = (d_35_ - d_34_) / (d_35_ + d_34_);
			}
			if (d_35_ == d) {
				d_36_ = (-d_33_ + d_32_) / (d_35_ - d_34_);
			} else if (d_32_ != d_35_) {
				if (d_35_ == d_33_) {
					d_36_ = 4.0 + (d - d_32_) / (-d_34_ + d_35_);
				}
			} else {
				d_36_ = 2.0 + (-d + d_33_) / (-d_34_ + d_35_);
			}
			if (d_38_ >= 0.5) {
				d_37_ = (d_35_ - d_34_) / (-d_34_ + (2.0 - d_35_));
			}
		}
		this.anInt1222 = (int) (d_37_ * 256.0);
		if (d_38_ > 0.5) {
			this.anInt1226 = (int) (512.0 * ((-d_38_ + 1.0) * d_37_));
		} else {
			this.anInt1226 = (int) (512.0 * (d_37_ * d_38_));
		}
		if (this.anInt1226 < 1) {
			this.anInt1226 = 1;
		}
		d_36_ /= 6.0;
		this.anInt1218 = (int) (this.anInt1226 * d_36_);
		if (this.anInt1222 >= 0) {
			if (this.anInt1222 > 255) {
				this.anInt1222 = 255;
			}
		} else {
			this.anInt1222 = 0;
		}
	}

	static final UnderlayType list(final int id) {
		UnderlayType undarlayType = (UnderlayType) recentUse.get(id);
		if (undarlayType != null) {
			return undarlayType;
		}
		final byte[] data = configClient.getFile(1, id);
		undarlayType = new UnderlayType();
		if (data != null) {
			undarlayType.decode(new Buffer(data));
		}
		recentUse.put(undarlayType, id);
		return undarlayType;
	}

	static final void method1909(final AbstractFont font, final boolean bool) {
		if (HDToolkit.glEnabled || bool) {
			final int i = Class120_Sub12_Sub5.canvasHeight;
			final int i_40_ = 956 * i / 503;
			KeyboardHandler.titlebgSprite.method1588((Class69_Sub1.canvasWidth - i_40_) / 2, 0, i_40_, i);
			Class120_Sub12_Sub27.logoSprite.method910(Class69_Sub1.canvasWidth / 2 + -(Class120_Sub12_Sub27.logoSprite.width / 2), 18);
		}
		font.method1478(Buffer.gameId != 1 ? TextRepository.aString3272 : ParticleNodeSub.aString2396, Class69_Sub1.canvasWidth / 2, Class120_Sub12_Sub5.canvasHeight / 2 + -26, 16777215, -1);
		final int i = Class120_Sub12_Sub5.canvasHeight / 2 + -18;
		if (!HDToolkit.glEnabled) {
			GraphicsLD.drawRect(Class69_Sub1.canvasWidth / 2 - 152, i, 304, 34, 9179409);
			GraphicsLD.drawRect(Class69_Sub1.canvasWidth / 2 - 151, 1 + i, 302, 32, 0);
			GraphicsLD.fillRect(Class69_Sub1.canvasWidth / 2 - 150, 2 + i, OverridedJInterface.loadingBarPercent * 3, 30, 9179409);
			GraphicsLD.fillRect(OverridedJInterface.loadingBarPercent * 3 + Class69_Sub1.canvasWidth / 2 - 150, i + 2, 300 - (3 * OverridedJInterface.loadingBarPercent), 30, 0);
		} else {
			GraphicsHD.drawRect(Class69_Sub1.canvasWidth / 2 - 152, i, 304, 34, 9179409);
			GraphicsHD.drawRect(Class69_Sub1.canvasWidth / 2 - 151, i + 1, 302, 32, 0);
			GraphicsHD.fillRect(Class69_Sub1.canvasWidth / 2 - 150, i + 2, 3 * OverridedJInterface.loadingBarPercent, 30, 9179409);
			GraphicsHD.fillRect(Class69_Sub1.canvasWidth / 2 - 150 + 3 * OverridedJInterface.loadingBarPercent, i + 2, 300 - (OverridedJInterface.loadingBarPercent * 3), 30, 0);
		}
		font.method1478(Class134.loadingText, Class69_Sub1.canvasWidth / 2, 4 + Class120_Sub12_Sub5.canvasHeight / 2, 16777215, -1);
	}

	public UnderlayType() {
		this.aBoolean1220 = true;
		this.anInt1227 = -1;
		this.anInt1225 = 128;
	}
}
