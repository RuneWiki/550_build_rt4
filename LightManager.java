/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

//https://www.it.uu.se/edu/course/homepage/grafik1/vt05/assignments/source/a4/Lightsource.hh
final class LightManager {
	private static int anInt1177;
	private static int anInt1178;
	static Light[] lights;
	private static int anInt1180;
	private static int anInt1181;
	private static int[][][] anIntArrayArrayArray1182;
	private static boolean[] aBooleanArray1183;
	static int lightsPos = 0;
	private static int anInt1185;
	private static int[] anIntArray1186;
	private static int anInt1187;
	private static boolean[] lightEnabled;
	private static int anInt1189;
	private static int anInt1190;
	private static int[] anIntArray1191;
	private static float[] position = { 0.0F, 0.0F, 0.0F, 1.0F };

	static final void method1856(final int i, final int i_0_, final int i_1_) {
		anInt1187 = i;
		anInt1177 = i_0_;
		anInt1178 = i_1_;
		anIntArrayArrayArray1182 = new int[anInt1187][anInt1177][anInt1178];
	}

	static final void method1857() {
		lightsPos = 0;
		for (int i = 0; i < anInt1187; i++) {
			for (int i_2_ = 0; i_2_ < anInt1177; i_2_++) {
				for (int i_3_ = 0; i_3_ < anInt1178; i_3_++) {
					anIntArrayArrayArray1182[i][i_2_][i_3_] = 0;
				}
			}
		}
	}

	static final void method1858(final int i, final boolean bool) {
		for (int i_4_ = 0; i_4_ < lightsPos; i_4_++) {
			lights[i_4_].method350(bool, i);
		}
		anInt1180 = -1;
		anInt1185 = -1;
		anInt1190 = -1;
		anInt1181 = -1;
		anInt1189 = -1;
	}

	static final void method1859() {
		for (int i = 0; i < 4; i++) {
			anIntArray1186[i] = -1;
			disableLight(i);
		}
	}

	static final void addLight(final Light light) {
		if (lightsPos >= 255) {
			System.out.println("Number of lights added exceeds maximum!");
		} else {
			lights[lightsPos++] = light;
		}
	}

	static final void method1861(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_) {
		if (Class120_Sub12_Sub6.highLightingDetail && (anInt1180 != i_7_ || anInt1185 != i_8_ || anInt1190 != i_9_ || anInt1181 != i_8_ || anInt1189 != i_9_)) {
			for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				aBooleanArray1183[i_10_] = false;
			}
			int i_11_ = 0;
			int i_12_ = anIntArrayArrayArray1182[i_7_][i_8_][i_9_];
			while_93_: while (i_12_ != 0) {
				final int i_13_ = (i_12_ & 0xff) - 1;
				i_12_ >>>= 8;
				for (int i_14_ = 0; i_14_ < 4; i_14_++) {
					if (i_13_ == anIntArray1186[i_14_]) {
						aBooleanArray1183[i_14_] = true;
						continue while_93_;
					}
				}
				anIntArray1191[i_11_++] = i_13_;
			}
			for (int i_15_ = 0; i_15_ < i_11_; i_15_++) {
				for (int i_16_ = 0; i_16_ < 4; i_16_++) {
					if (!aBooleanArray1183[i_16_]) {
						anIntArray1186[i_16_] = anIntArray1191[i_15_];
						aBooleanArray1183[i_16_] = true;
						updateLight(i_16_, lights[anIntArray1191[i_15_]], i, i_5_, i_6_);
						break;
					}
				}
			}
			for (int i_17_ = 0; i_17_ < 4; i_17_++) {
				if (!aBooleanArray1183[i_17_]) {
					anIntArray1186[i_17_] = -1;
					disableLight(i_17_);
				}
			}
			anInt1180 = i_7_;
			anInt1185 = i_8_;
			anInt1190 = i_9_;
			anInt1181 = i_8_;
			anInt1189 = i_9_;
		}
	}

	static final void method1862(final int xOff, final int yOff, final int zOff, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_) {
		if (Class120_Sub12_Sub6.highLightingDetail && (anInt1180 != i_20_ || anInt1185 != i_21_ || anInt1190 != i_22_ || anInt1181 != i_23_ || anInt1189 != i_24_)) {
			for (int i_25_ = 0; i_25_ < 4; i_25_++) {
				aBooleanArray1183[i_25_] = false;
			}
			int i_26_ = 0;
			int i_27_ = 0;
			while_95_: for (int i_28_ = i_21_; i_28_ <= i_23_; i_28_++) {
				for (int i_29_ = i_22_; i_29_ <= i_24_; i_29_++) {
					int i_30_ = anIntArrayArrayArray1182[i_20_][i_28_][i_29_];
					while_94_: while (i_30_ != 0) {
						final int i_31_ = (i_30_ & 0xff) - 1;
						i_30_ >>>= 8;
						for (int i_32_ = 0; i_32_ < i_27_; i_32_++) {
							if (i_31_ == anIntArray1191[i_32_]) {
								continue while_94_;
							}
						}
						for (int i_33_ = 0; i_33_ < 4; i_33_++) {
							if (i_31_ == anIntArray1186[i_33_]) {
								if (!aBooleanArray1183[i_33_]) {
									aBooleanArray1183[i_33_] = true;
									if (++i_26_ == 4) {
										break while_95_;
									}
								}
								continue while_94_;
							}
						}
						anIntArray1191[i_27_++] = i_31_;
						if (++i_26_ == 4) {
							break while_95_;
						}
					}
				}
			}
			for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
				for (int lightId = 0; lightId < 4; lightId++) {
					if (!aBooleanArray1183[lightId]) {
						anIntArray1186[lightId] = anIntArray1191[i_34_];
						aBooleanArray1183[lightId] = true;
						updateLight(lightId, lights[anIntArray1191[i_34_]], xOff, yOff, zOff);
						break;
					}
				}
			}
			for (int i_36_ = 0; i_36_ < 4; i_36_++) {
				if (!aBooleanArray1183[i_36_]) {
					anIntArray1186[i_36_] = -1;
					disableLight(i_36_);
				}
			}
			anInt1180 = i_20_;
			anInt1185 = i_21_;
			anInt1190 = i_22_;
			anInt1181 = i_23_;
			anInt1189 = i_24_;
		}
	}

	static final void method1863(final int i, final int i_37_, final GroundTile[][][] class120_sub18s) {
		if (Class120_Sub12_Sub6.highLightingDetail) {
			final GL gl = HDToolkit.gl;
			Class120_Sub14_Sub13.method1532(0, 0);
			HDToolkit.method511(0);
			HDToolkit.method509();
			HDToolkit.bindTexture2D(HDToolkit.anInt507);
			gl.glDepthMask(false);
			HDToolkit.toggleLighting(false);
			gl.glBlendFunc(774, 1);
			gl.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
			gl.glTexEnvi(8960, 34176, 34166);
			gl.glTexEnvi(8960, 34192, 770);
			for (int i_38_ = 0; i_38_ < lightsPos; i_38_++) {
				final Light light = lights[i_38_];
				int i_39_ = light.anInt384;
				if (light.aBoolean385) {
					i_39_--;
				}
				if (light.aClass133_380 != null) {
					int i_40_ = 0;
					int i_41_ = (light.z >> 7) - light.anInt370;
					int i_42_ = (light.z >> 7) + light.anInt370;
					if (i_42_ >= Js5Worker.anInt396) {
						i_42_ = Js5Worker.anInt396 - 1;
					}
					if (i_41_ < Class31.anInt248) {
						i_40_ += Class31.anInt248 - i_41_;
						i_41_ = Class31.anInt248;
					}
					while_96_: for (int i_43_ = i_41_; i_43_ <= i_42_; i_43_++) {
						final int i_44_ = light.aShortArray372[i_40_++];
						int i_45_ = (light.x >> 7) - light.anInt370 + (i_44_ >> 8);
						int i_46_ = i_45_ + (i_44_ & 0xff) - 1;
						if (i_45_ < GrandExchangeObject.anInt1493) {
							i_45_ = GrandExchangeObject.anInt1493;
						}
						if (i_46_ >= Class53.anInt487) {
							i_46_ = Class53.anInt487 - 1;
						}
						for (int i_47_ = i_45_; i_47_ <= i_46_; i_47_++) {
							GroundTile class120_sub18 = null;
							if (i_39_ >= 0) {
								class120_sub18 = class120_sub18s[i_39_][i_47_][i_43_];
							}
							if (i_39_ < 0 || class120_sub18 != null && class120_sub18.aBoolean2647) {
								HDToolkit.method527(201.5F - light.anInt384 * 50.0F - 1.5F);
								gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, light.aFloat394 }, 0);
								light.aClass133_380.method1946();
								break while_96_;
							}
						}
					}
				}
			}
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glBlendFunc(770, 771);
			gl.glDepthMask(true);
			gl.glFogfv(2918, AtmosphereManager.fogColor, 0);
			gl.glEnableClientState(32888);
			HDToolkit.method532();
		}
	}

	static final void method1864(final int i, final int i_48_, final int i_49_, final int i_50_, final int i_51_) {
		if (Class120_Sub12_Sub6.highLightingDetail) {
			int i_52_ = 0;
			while_98_: for (/**/; i_52_ < 4; i_52_++) {
				if (anIntArray1186[i_52_] != -1) {
					int i_53_ = anIntArrayArrayArray1182[i][i_48_][i_49_];
					while (i_53_ != 0) {
						final int i_54_ = (i_53_ & 0xff) - 1;
						i_53_ >>>= 8;
						if (i_54_ == anIntArray1186[i_52_]) {
							continue while_98_;
						}
					}
					i_53_ = anIntArrayArrayArray1182[i][i_50_][i_51_];
					while (i_53_ != 0) {
						final int i_55_ = (i_53_ & 0xff) - 1;
						i_53_ >>>= 8;
						if (i_55_ == anIntArray1186[i_52_]) {
							continue while_98_;
						}
					}
				}
				anIntArray1186[i_52_] = -1;
				disableLight(i_52_);
			}
		}
	}

	static final void method1865() {
		final GL gl = HDToolkit.gl;
		for (int id = 0; id < 4; id++) {
			final int lightId = 16388 + id;
			gl.glLightfv(lightId, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);//LIGHT*, AMBIENT
			gl.glLightf(lightId, 4616, 0.0F);//LIGHT*, LINEAR_ATTENUATION
			gl.glLightf(lightId, 4615, 0.0F);//LIGHT*, CONSTANT_ATTENUATION
		}
		for (int id = 0; id < 4; id++) {
			anIntArray1186[id] = -1;
			disableLight(id);
		}
	}

	static final void method1866(final int i, final int i_57_, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final int i_62_) {
		if (Class120_Sub12_Sub6.highLightingDetail) {
			if (i == 1 && i_61_ > 0) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ - 1, i_62_);
			} else if (i == 4 && i_61_ < anInt1177 - 1) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ + 1, i_62_);
			} else if (i == 8 && i_62_ > 0) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_, i_62_ - 1);
			} else if (i == 2 && i_62_ < anInt1178 - 1) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_, i_62_ + 1);
			} else if (i == 16 && i_61_ > 0 && i_62_ < anInt1178 - 1) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ - 1, i_62_ + 1);
			} else if (i == 32 && i_61_ < anInt1177 - 1 && i_62_ < anInt1178 - 1) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ + 1, i_62_ + 1);
			} else if (i == 128 && i_61_ > 0 && i_62_ > 0) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ - 1, i_62_ - 1);
			} else if (i == 64 && i_61_ < anInt1177 - 1 && i_62_ > 0) {
				method1861(i_57_, i_58_, i_59_, i_60_, i_61_ + 1, i_62_ - 1);
			}
		}
	}

	static final void method1867() {
		lights = new Light[255];
		anIntArray1186 = new int[4];
		lightEnabled = new boolean[4];
		anIntArray1191 = new int[4];
		aBooleanArray1183 = new boolean[4];
		anIntArrayArrayArray1182 = new int[anInt1187][anInt1177][anInt1178];
	}

	public static void method1868() {
		lights = null;
		anIntArrayArrayArray1182 = null;
		anIntArray1186 = null;
		lightEnabled = null;
		position = null;
		anIntArray1191 = null;
		aBooleanArray1183 = null;
	}

	static final void method1869() {
		for (int id = 0; id < lightsPos; id++) {
			final Light light = lights[id];
			int i_63_ = light.anInt384;
			if (light.aBoolean371) {
				i_63_ = 0;
			}
			int i_64_ = light.anInt384;
			if (light.aBoolean382) {
				i_64_ = 3;
			}
			for (int i_65_ = i_63_; i_65_ <= i_64_; i_65_++) {
				int i_66_ = 0;
				int i_67_ = (light.z >> 7) - light.anInt370;
				if (i_67_ < 0) {
					i_66_ -= i_67_;
					i_67_ = 0;
				}
				int i_68_ = (light.z >> 7) + light.anInt370;
				if (i_68_ > anInt1178 - 1) {
					i_68_ = anInt1178 - 1;
				}
				for (int i_69_ = i_67_; i_69_ <= i_68_; i_69_++) {
					final int i_70_ = light.aShortArray372[i_66_++];
					int i_71_ = (light.x >> 7) - light.anInt370 + (i_70_ >> 8);
					int i_72_ = i_71_ + (i_70_ & 0xff) - 1;
					if (i_71_ < 0) {
						i_71_ = 0;
					}
					if (i_72_ > anInt1177 - 1) {
						i_72_ = anInt1177 - 1;
					}
					for (int i_73_ = i_71_; i_73_ <= i_72_; i_73_++) {
						final int i_74_ = anIntArrayArrayArray1182[i_65_][i_73_][i_69_];
						if ((i_74_ & 0xff) == 0) {
							anIntArrayArrayArray1182[i_65_][i_73_][i_69_] = i_74_ | id + 1;
						} else if ((i_74_ & 0xff00) == 0) {
							anIntArrayArrayArray1182[i_65_][i_73_][i_69_] = i_74_ | id + 1 << 8;
						} else if ((i_74_ & 0xff0000) == 0) {
							anIntArrayArrayArray1182[i_65_][i_73_][i_69_] = i_74_ | id + 1 << 16;
						} else if ((i_74_ & ~0xffffff) == 0) {
							anIntArrayArrayArray1182[i_65_][i_73_][i_69_] = i_74_ | id + 1 << 24;
						}
					}
				}
			}
		}
	}

	static final void method1870() {
		lights = null;
		anIntArray1186 = null;
		lightEnabled = null;
		anIntArray1191 = null;
		aBooleanArray1183 = null;
		anIntArrayArrayArray1182 = null;
	}

	private static final void disableLight(final int id) {
		if (lightEnabled[id]) {
			lightEnabled[id] = false;
			final int lightId = id + 16384 + 4;
			final GL gl = HDToolkit.gl;
			gl.glDisable(lightId);
		}
	}

	private static final void updateLight(final int id, final Light light, final int xOff, final int yOff, final int zOff) {
		final int lightId = id + 16384 + 4;//16384 - 16391
		final GL gl = HDToolkit.gl;
		if (!lightEnabled[id]) {
			gl.glEnable(lightId);
			lightEnabled[id] = true;
		}
		gl.glLightf(lightId, 4617, light.quadraticAttenuation);//LIGHT*, QUADRATIC_ATTENUATION
		gl.glLightfv(lightId, 4609, light.diffuse, 0);//LIGHT*, DIFFUSE
		position[0] = light.x - xOff;
		position[1] = light.y - yOff;
		position[2] = light.z - zOff;
		gl.glLightfv(lightId, 4611, position, 0);//LIGHT*, POSITION
	}
}
