/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 {
	static int topMargin;
	static int actionsLen;
	int anInt1891;
	int anInt1892;
	int anInt1893;
	int anInt1894;
	int anInt1895;
	int anInt1896;
	static volatile long currentClickTime = 0L;
	SceneGraphNode aClass180_1898;
	static boolean usingSpriteMenu;
	static int anInt1900;
	SceneGraphNode aClass180_1901;
	static boolean hdrEnabled;
	static String aString1903;
	long bitPacked = 0L;
	int anInt1905;
	static int menuOptionCount;

	static {
		topMargin = 0;
		aString1903 = "scroll:";
		usingSpriteMenu = false;
		actionsLen = 0;
		hdrEnabled = false;
		menuOptionCount = 0;
	}

	static final void method2471() {
		Class154.anInt1441 = 0;
		Class120_Sub12_Sub23.anInt3307 = 0;
		Class180_Sub3.method2309();
		Class31.method262();
		Class120_Sub12_Sub36.method1389();
		for (int i_0_ = 0; Class120_Sub12_Sub23.anInt3307 > i_0_; i_0_++) {
			final int i_1_ = Class43.anIntArray366[i_0_];
			if (Class101_Sub2.loopCycle != Class120_Sub12_Sub11.npcList[i_1_].anInt2985) {
				if (Class120_Sub12_Sub11.npcList[i_1_].npcType.hasAmbientSound()) {
					Class120_Sub16.removeAmbientSoundNpc(Class120_Sub12_Sub11.npcList[i_1_]);
				}
				Class120_Sub12_Sub11.npcList[i_1_].setNpcType(null);
				Class120_Sub12_Sub11.npcList[i_1_] = null;
			}
		}
		if (Canvas_Sub1.inputStream.pos != AbstractMouseWheelHandler.packetSize) {
			throw new RuntimeException(new StringBuilder("gnp1 pos:").append(Canvas_Sub1.inputStream.pos).append(" psize:").append(AbstractMouseWheelHandler.packetSize).toString());
		}
		for (int i_2_ = 0; Class148.localNpcCount > i_2_; i_2_++) {
			if (Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_2_]] == null) {
				throw new RuntimeException(new StringBuilder("gnp2 pos:").append(i_2_).append(" size:").append(Class148.localNpcCount).toString());
			}
		}
	}

	static final void method2472(final int i, final js5 js5, final js5 class50_3_) {
		try {
			if (i == -12879) {
				SceneGroundObject.aClass50_2839 = js5;
				Class147.aClass50_1394 = class50_3_;
				Class7.anInt61 = Class147.aClass50_1394.getFileAmount(3);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vl.C(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(',').append(class50_3_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2473(final int i, final int i_4_, final int i_5_, int i_6_, int i_7_) {
		try {
			if (HDToolkit.glEnabled) {
				GraphicsHD.clipRect(i_6_, i_7_, i_5_ + i_6_, i + i_7_);
				GraphicsHD.fillRect(i_6_, i_7_, i_5_, i, 0);
			} else {
				GraphicsLD.clipRect(i_6_, i_7_, i_6_ + i_5_, i_7_ + i);
				GraphicsLD.fillRect(i_6_, i_7_, i_5_, i, 0);
			}
			if (Class90.anInt848 >= 100) {
				final float f = (float) Class79.anInt692 / (float) Class79.anInt700;
				if (i_4_ == -18418) {
					int i_8_ = i_5_;
					int i_9_ = i;
					if (f < 1.0F) {
						i_9_ = (int) (f * i_5_);
					} else {
						i_8_ = (int) (i / f);
					}
					i_6_ += (i_5_ + -i_8_) / 2;
					i_7_ += (-i_9_ + i) / 2;
					if (Class116.aClass120_Sub14_Sub19_1114 == null || i_5_ != Class116.aClass120_Sub14_Sub19_1114.width || i != Class116.aClass120_Sub14_Sub19_1114.height) {
						final LDSprite class120_sub14_sub19_sub2 = new LDSprite(i_5_, i);
						GraphicsLD.init2dCanvas(class120_sub14_sub19_sub2.pixels, i_5_, i);
						if (Class79.aClass120_Sub14_Sub22_691.anInt3635 != -1) {
							GraphicsLD.fillRect(0, 0, i_5_, i, Class79.aClass120_Sub14_Sub22_691.anInt3635);
						}
						Class79.method683(0, 0, Class79.anInt700, Class79.anInt692, 0, 0, i_8_, i_9_);
						Class79.method685();
						if (!HDToolkit.glEnabled) {
							Class116.aClass120_Sub14_Sub19_1114 = class120_sub14_sub19_sub2;
						} else {
							Class116.aClass120_Sub14_Sub19_1114 = new HDSprite(class120_sub14_sub19_sub2);
						}
						if (!HDToolkit.glEnabled) {
							ClanMember.fullscreenGraphics.init2dCanvas();
						} else {
							GraphicsLD.pixels = null;
						}
					}
					int i_10_ = 16711680;
					Class116.aClass120_Sub14_Sub19_1114.method1591(i_6_, i_7_);
					final int i_11_ = Class173.anInt1726 * i_8_ / Class79.anInt700;
					final int i_12_ = i_7_ + i_9_ * GroundTile.anInt2627 / Class79.anInt692;
					final int i_13_ = GroundObjectNode.anInt3628 * i_9_ / Class79.anInt692;
					if (Buffer.gameId == 1) {
						i_10_ = 16777215;
					}
					final int i_14_ = i_6_ - -(ParamType.anInt3538 * i_8_ / Class79.anInt700);
					if (HDToolkit.glEnabled) {
						GraphicsHD.fillRect(i_14_, i_12_, i_11_, i_13_, i_10_, 128);
						GraphicsHD.drawRect(i_14_, i_12_, i_11_, i_13_, i_10_);
					} else {
						GraphicsLD.fillRect(i_14_, i_12_, i_11_, i_13_, i_10_, 128);
						GraphicsLD.drawRect(i_14_, i_12_, i_11_, i_13_, i_10_);
					}
					if (Class96.anInt919 > 0) {
						int i_15_;
						if (Class136.anInt1321 > 50) {
							i_15_ = 500 + -(Class136.anInt1321 * 5);
						} else {
							i_15_ = Class136.anInt1321 * 5;
						}
						for (Class120_Sub14_Sub5 class120_sub14_sub5 = (Class120_Sub14_Sub5) Class79.aClass177_690.peekFirst(); class120_sub14_sub5 != null; class120_sub14_sub5 = (Class120_Sub14_Sub5) Class79.aClass177_690.peekNext()) {
							final Class73 class73 = Class73.list(class120_sub14_sub5.anInt3473);
							if (Class9.method116(class73, -1)) {
								if (class120_sub14_sub5.anInt3473 == Class127.anInt1215) {
									final int i_16_ = i_8_ * class120_sub14_sub5.anInt3480 / Class79.anInt700 + i_6_;
									final int i_17_ = i_7_ + i_9_ * class120_sub14_sub5.anInt3481 / Class79.anInt692;
									if (!HDToolkit.glEnabled) {
										GraphicsLD.fillRect(i_16_ - 2, i_17_ + -2, 4, 4, 16776960, i_15_);
									} else {
										GraphicsHD.fillRect(i_16_ + -2, i_17_ - 2, 4, 4, 16776960, i_15_);
									}
								} else if (Class120_Sub12_Sub9.anInt3195 != -1 && class73.anInt652 == Class120_Sub12_Sub9.anInt3195) {
									final int i_18_ = i_6_ - -(class120_sub14_sub5.anInt3480 * i_8_ / Class79.anInt700);
									final int i_19_ = i_7_ + i_9_ * class120_sub14_sub5.anInt3481 / Class79.anInt692;
									if (!HDToolkit.glEnabled) {
										GraphicsLD.fillRect(i_18_ + -2, -2 + i_19_, 4, 4, 16776960, i_15_);
									} else {
										GraphicsHD.fillRect(-2 + i_18_, -2 + i_19_, 4, 4, 16776960, i_15_);
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vl.A(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
	}

	public static void method2474(final int i) {
		try {
			if (i == 10262) {
				aString1903 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vl.B(").append(i).append(')').toString());
		}
	}

	public Class186() {
		/* empty */
	}
}
