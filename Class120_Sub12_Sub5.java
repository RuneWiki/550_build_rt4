/* Class120_Sub12_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub5 extends Class120_Sub12 {
	private int anInt3160;
	private int anInt3161 = 3216;
	private int anInt3162;
	static boolean errorPinging = false;
	static FileSystem masterIndexFileSystem;
	static int canvasHeight;
	private final int[] anIntArray3166;
	static AbstractSprite[] hintMapMarkerSprites;

	static final boolean isLetterOrNumber(final char c) {
		return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static final boolean method1218(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final SceneGraphNode sceneGraphNode, final int i_5_, final long l, final boolean bool) {
		if (sceneGraphNode == null) {
			return true;
		}
		int i_6_ = i_1_ - i_4_;
		int i_7_ = i_2_ - i_4_;
		int i_8_ = i_1_ + i_4_;
		int i_9_ = i_2_ + i_4_;
		if (bool) {
			if (i_5_ > 640 && i_5_ < 1408) {
				i_9_ += 128;
			}
			if (i_5_ > 1152 && i_5_ < 1920) {
				i_8_ += 128;
			}
			if (i_5_ > 1664 || i_5_ < 384) {
				i_7_ -= 128;
			}
			if (i_5_ > 128 && i_5_ < 896) {
				i_6_ -= 128;
			}
		}
		i_6_ /= 128;
		i_7_ /= 128;
		i_8_ /= 128;
		i_9_ /= 128;
		return ClanMember.method1403(i, i_6_, i_7_, i_8_ - i_6_ + 1, i_9_ - i_7_ + 1, i_1_, i_2_, i_3_, sceneGraphNode, i_5_, true, l);
	}

	static final void method1219() {
		if (Class120_Sub12_Sub15.landscapeSpriteLevel != Class173.gameLevel) {
			if (Class38.method315(Class173.gameLevel)) {
				Class120_Sub12_Sub15.landscapeSpriteLevel = Class173.gameLevel;
			}
		}
	}

	static final boolean method1220() {
		try {
			if (Class120_Sub12_Sub25.anInt3312 != 2) {
				return false;
			}
			if (Js5Request.aClass120_Sub31_3941 == null) {
				Js5Request.aClass120_Sub31_3941 = Class120_Sub31.list(MasterIndexInfo.aClass50_476, QuickChatCategoryType.anInt3649, SeqType.anInt349);
				if (Js5Request.aClass120_Sub31_3941 == null) {
					return false;
				}
			}
			if (Normal.aClass90_163 == null) {
				Normal.aClass90_163 = new Class90(Class120_Sub29.aClass50_2770, MasterIndexInfo.aClass50_469);
			}
			if (!Class30.aClass120_Sub30_Sub2_234.method1780(22050, Js5Request.aClass120_Sub31_3941, Class57.aClass50_499, Normal.aClass90_163)) {
				return false;
			}
			Class30.aClass120_Sub30_Sub2_234.method1778();
			Class30.aClass120_Sub30_Sub2_234.method1748(Js5Request.anInt3940);
			Class30.aClass120_Sub30_Sub2_234.method1773(Js5Request.aClass120_Sub31_3941, StringNode.aBoolean2734);
			Normal.aClass90_163 = null;
			Js5Request.aClass120_Sub31_3941 = null;
			MasterIndexInfo.aClass50_476 = null;
			Class120_Sub12_Sub25.anInt3312 = 0;
			return true;
		} catch (final Exception exception) {
			exception.printStackTrace();
			Class30.aClass120_Sub30_Sub2_234.method1770();
			Normal.aClass90_163 = null;
			Class120_Sub12_Sub25.anInt3312 = 0;
			MasterIndexInfo.aClass50_476 = null;
			Js5Request.aClass120_Sub31_3941 = null;
			return false;
		}
	}

	public Class120_Sub12_Sub5() {
		super(1, true);
		anInt3160 = 3216;
		anInt3162 = 4096;
		anIntArray3166 = new int[3];
	}

	@Override
	final void decode(final Buffer buffer, final int i_12_) {
		while_120_: do {
			do {
				if (i_12_ != 0) {
					if (i_12_ != 1) {
						if (i_12_ == 2) {
							break;
						}
						break while_120_;
					}
				} else {
					anInt3162 = buffer.getUShort();
					break while_120_;
				}
				anInt3161 = buffer.getUShort();
				break while_120_;
			} while (false);
			anInt3160 = buffer.getUShort();
		} while (false);
	}

	@Override
	final void postDecode() {
		method1223();
	}

	@Override
	final int[] method1187(final int i_13_) {
		final int[] is_14_ = this.aClass30_2563.method258(i_13_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_15_ = Class120_Sub12_Sub26.anInt3331 * anInt3162 >> 12;
			final int[] is_16_ = method1192(i_13_ + -1 & Class120_Sub29.anInt2774, 0);
			final int[] is_17_ = method1192(i_13_, 0);
			final int[] is_18_ = method1192(Class120_Sub29.anInt2774 & i_13_ - -1, 0);
			for (int i_19_ = 0; i_19_ < Class120_Sub12_Sub7.anInt3178; i_19_++) {
				final int i_20_ = i_15_ * (is_17_[MagnetType.anInt259 & i_19_ + -1] + -is_17_[MagnetType.anInt259 & i_19_ + 1]) >> 12;
				int i_21_ = i_20_ >> 4;
				final int i_22_ = (is_18_[i_19_] + -is_16_[i_19_]) * i_15_ >> 12;
				if (i_21_ < 0) {
					i_21_ = -i_21_;
				}
				int i_23_ = i_22_ >> 4;
				if (i_23_ < 0) {
					i_23_ = -i_23_;
				}
				if (i_23_ > 255) {
					i_23_ = 255;
				}
				if (i_21_ > 255) {
					i_21_ = 255;
				}
				final int i_24_ = 0xff & Class15.aByteArray100[i_21_ - -((i_23_ - -1) * i_23_ >> 1)];
				int i_25_ = i_20_ * i_24_ >> 8;
				int i_26_ = i_24_ * i_22_ >> 8;
				i_25_ = anIntArray3166[0] * i_25_ >> 12;
				int i_27_ = i_24_ * 4096 >> 8;
				i_26_ = anIntArray3166[1] * i_26_ >> 12;
				i_27_ = anIntArray3166[2] * i_27_ >> 12;
				is_14_[i_19_] = i_27_ + i_26_ + i_25_;
			}
		}
		return is_14_;
	}

	static final void updateCamera(final long l) {
		if (!Class134.updateCameraFromCs2) {
			Class120_Sub12_Sub21.cameraPitch += l * Class120_Sub12_Sub4.cameraPitchWrapper / 40.0F;
			DummyOutputStream.cameraYaw += l * Class120_Sub15.cameraYawWrapper / 40.0F;
		}
		final int playerX = TileParticleQueue.selfPlayer.x;
		final int playerZ = TileParticleQueue.selfPlayer.z;
		if (Class69_Sub3_Sub1.cameraX - playerX < -500 || Class69_Sub3_Sub1.cameraX - playerX > 500 || InterfaceListener.cameraZ - playerZ < -500 || InterfaceListener.cameraZ - playerZ > 500) {
			Class69_Sub3_Sub1.cameraX = playerX;
			InterfaceListener.cameraZ = playerZ;
		}
		if (Class69_Sub3_Sub1.cameraX != playerX) {
			final int xDelta = playerX - Class69_Sub3_Sub1.cameraX;
			int xStep = (int) (l * xDelta / 320L);
			if (xDelta > 0) {
				if (xStep != 0) {
					if (xStep > xDelta) {
						xStep = xDelta;
					}
				} else {
					xStep = 1;
				}
			} else if (xStep == 0) {
				xStep = -1;
			} else if (xDelta > xStep) {
				xStep = xDelta;
			}
			Class69_Sub3_Sub1.cameraX += xStep;
		}
		if (InterfaceListener.cameraZ != playerZ) {
			final int zDelta = playerZ - InterfaceListener.cameraZ;
			int zStep = (int) (l * zDelta / 320L);
			if (zDelta > 0) {
				if (zStep != 0) {
					if (zStep > zDelta) {
						zStep = zDelta;
					}
				} else {
					zStep = 1;
				}
			} else if (zStep == 0) {
				zStep = -1;
			} else if (zDelta > zStep) {
				zStep = zDelta;
			}
			InterfaceListener.cameraZ += zStep;
		}
		Class127.fixCameraBounds();
	}

	private final void method1223() {
		final double d = Math.cos(anInt3160 / 4096.0F);
		anIntArray3166[0] = (int) (4096.0 * (Math.sin(anInt3161 / 4096.0F) * d));
		anIntArray3166[1] = (int) (Math.cos(anInt3161 / 4096.0F) * d * 4096.0);
		anIntArray3166[2] = (int) (4096.0 * Math.sin(anInt3160 / 4096.0F));
		final int i_34_ = anIntArray3166[0] * anIntArray3166[0] >> 12;
		final int i_35_ = anIntArray3166[2] * anIntArray3166[2] >> 12;
		final int i_36_ = anIntArray3166[1] * anIntArray3166[1] >> 12;
		final int i_37_ = (int) (4096.0 * Math.sqrt(i_35_ + i_34_ + i_36_ >> 12));
		if (i_37_ != 0) {
			anIntArray3166[0] = (anIntArray3166[0] << 12) / i_37_;
			anIntArray3166[2] = (anIntArray3166[2] << 12) / i_37_;
			anIntArray3166[1] = (anIntArray3166[1] << 12) / i_37_;
		}
	}
}
