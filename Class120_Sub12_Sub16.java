/* Class120_Sub12_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub16 extends Class120_Sub12 {
	static short aShort3250 = 1;
	static int[] friendsWorld = new int[200];
	static char[] validCharacters = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static int[] soundEffectIds = new int[50];
	private int anInt3256 = 585;

	@Override
	final void decode(final Buffer buffer, final int i_1_) {
		if (i_1_ == 0) {
			anInt3256 = buffer.getUShort();
		}
	}

	static final ClientScript method1277(final int i, final int i_2_, final int i_3_) {
		int i_5_ = i_2_ << 8 | i;
		ClientScript class120_sub14_sub12_6_ = (ClientScript) ClientScript.recentUse.get((long) i_5_ << 16);
		if (class120_sub14_sub12_6_ != null) {
			return class120_sub14_sub12_6_;
		}
		byte[] is = ClientScript.scriptsJs5.getFileSmart(ClientScript.scriptsJs5.method437(i_5_));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}
			class120_sub14_sub12_6_ = ClientScript.decode(is);
			class120_sub14_sub12_6_.triggerType = i;
			ClientScript.recentUse.put(class120_sub14_sub12_6_, (long) i_5_ << 16);
			return class120_sub14_sub12_6_;
		}
		i_5_ = i | i_3_ + 65536 << 8;
		class120_sub14_sub12_6_ = (ClientScript) ClientScript.recentUse.get((long) i_5_ << 16);
		if (class120_sub14_sub12_6_ != null) {
			return class120_sub14_sub12_6_;
		}
		is = ClientScript.scriptsJs5.getFileSmart(ClientScript.scriptsJs5.method437(i_5_));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}
			class120_sub14_sub12_6_ = ClientScript.decode(is);
			class120_sub14_sub12_6_.triggerType = i;
			ClientScript.recentUse.put(class120_sub14_sub12_6_, (long) i_5_ << 16);
			return class120_sub14_sub12_6_;
		}
		i_5_ = i | 0xffff00;
		class120_sub14_sub12_6_ = (ClientScript) ClientScript.recentUse.get((long) i_5_ << 16);
		if (class120_sub14_sub12_6_ != null) {
			return class120_sub14_sub12_6_;
		}
		is = ClientScript.scriptsJs5.getFileSmart(ClientScript.scriptsJs5.method437(i_5_));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}
			class120_sub14_sub12_6_ = ClientScript.decode(is);
			class120_sub14_sub12_6_.triggerType = i;
			ClientScript.recentUse.put(class120_sub14_sub12_6_, (long) i_5_ << 16);
			return class120_sub14_sub12_6_;
		}
		return null;
	}

	static final void method1278(final int x, final int y, final int z, final int speed, final int speed2) {
		InterfaceListener.anInt2546 = z;
		client.anInt1154 = y;
		Class101_Sub1.anInt2272 = speed;
		Class120_Sub12_Sub31.anInt3384 = speed2;
		Class109.anInt1042 = x;
		if (Class101_Sub1.anInt2272 >= 100) {
			final int i_12_ = Class109.anInt1042 * 128 + 64;
			final int i_13_ = InterfaceListener.anInt2546 * 128 + 64;
			final int i_14_ = Class22.getTileHeight(i_12_, i_13_, Class173.gameLevel) - client.anInt1154;
			final int i_15_ = i_12_ - FileSystemWorker.renderX;
			final int i_16_ = i_14_ - Class120_Sub12_Sub10.renderY;
			final int i_17_ = i_13_ - GroundObjectNode.renderZ;
			final int i_18_ = (int) Math.sqrt(i_17_ * i_17_ + i_15_ * i_15_);
			UnderlayType.renderPitch = (int) (Math.atan2(i_16_, i_18_) * 325.949) & 0x7ff;
			SpotAnimation.renderYaw = (int) (Math.atan2(i_15_, i_17_) * -325.949) & 0x7ff;
			if (UnderlayType.renderPitch < 128) {
				UnderlayType.renderPitch = 128;
			}
			if (UnderlayType.renderPitch > 383) {
				UnderlayType.renderPitch = 383;
			}
		}
		client.cameraType = 2;
	}

	@Override
	final int[] method1187(final int i_19_) {
		final int[] is_20_ = this.aClass30_2563.method258(i_19_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_21_ = Class150.anIntArray1405[i_19_];
			for (int i_22_ = 0; i_22_ < Class120_Sub12_Sub7.anInt3178; i_22_++) {
				final int i_23_ = Class90.anIntArray849[i_22_];
				if (anInt3256 < i_23_ && -anInt3256 + 4096 > i_23_ && i_21_ > -anInt3256 + 2048 && 2048 - -anInt3256 > i_21_) {
					int i_24_ = -i_23_ + 2048;
					i_24_ = i_24_ < 0 ? -i_24_ : i_24_;
					i_24_ <<= 12;
					i_24_ /= 2048 - anInt3256;
					is_20_[i_22_] = 4096 - i_24_;
				} else if (2048 - anInt3256 < i_23_ && anInt3256 + 2048 > i_23_) {
					int i_25_ = i_21_ - 2048;
					i_25_ = i_25_ >= 0 ? i_25_ : -i_25_;
					i_25_ -= anInt3256;
					i_25_ <<= 12;
					is_20_[i_22_] = i_25_ / (2048 - anInt3256);
				} else if (i_21_ < anInt3256 || i_21_ > -anInt3256 + 4096) {
					int i_26_ = i_23_ + -2048;
					i_26_ = i_26_ < 0 ? -i_26_ : i_26_;
					i_26_ -= anInt3256;
					i_26_ <<= 12;
					is_20_[i_22_] = i_26_ / (-anInt3256 + 2048);
				} else if (anInt3256 > i_23_ || i_23_ > -anInt3256 + 4096) {
					int i_27_ = -i_21_ + 2048;
					i_27_ = i_27_ < 0 ? -i_27_ : i_27_;
					i_27_ <<= 12;
					i_27_ /= 2048 + -anInt3256;
					is_20_[i_22_] = -i_27_ + 4096;
				} else {
					is_20_[i_22_] = 0;
				}
			}
		}
		return is_20_;
	}

	static final void updateLockedCamera() {
		int i_28_ = Class99.anInt951 * 128 + 64;
		int i_29_ = Class134.anInt1280 * 128 + 64;
		int i_30_ = Class22.getTileHeight(i_28_, i_29_, Class173.gameLevel) - SpotAnimType.anInt986;
		if (ObjectContainer.anInt2621 >= 100) {
			FileSystemWorker.renderX = Class99.anInt951 * 128 + 64;
			GroundObjectNode.renderZ = Class134.anInt1280 * 128 + 64;
			Class120_Sub12_Sub10.renderY = Class22.getTileHeight(FileSystemWorker.renderX, GroundObjectNode.renderZ, Class173.gameLevel) - SpotAnimType.anInt986;
		} else {
			if (GroundObjectNode.renderZ < i_29_) {
				GroundObjectNode.renderZ += (i_29_ - GroundObjectNode.renderZ) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (GroundObjectNode.renderZ > i_29_) {
					GroundObjectNode.renderZ = i_29_;
				}
			}
			if (i_28_ > FileSystemWorker.renderX) {
				FileSystemWorker.renderX += (i_28_ - FileSystemWorker.renderX) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (i_28_ < FileSystemWorker.renderX) {
					FileSystemWorker.renderX = i_28_;
				}
			}
			if (FileSystemWorker.renderX > i_28_) {
				FileSystemWorker.renderX -= (FileSystemWorker.renderX - i_28_) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (FileSystemWorker.renderX < i_28_) {
					FileSystemWorker.renderX = i_28_;
				}
			}
			if (Class120_Sub12_Sub10.renderY < i_30_) {
				Class120_Sub12_Sub10.renderY += (i_30_ - Class120_Sub12_Sub10.renderY) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (Class120_Sub12_Sub10.renderY > i_30_) {
					Class120_Sub12_Sub10.renderY = i_30_;
				}
			}
			if (i_29_ < GroundObjectNode.renderZ) {
				GroundObjectNode.renderZ -= (GroundObjectNode.renderZ - i_29_) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (GroundObjectNode.renderZ < i_29_) {
					GroundObjectNode.renderZ = i_29_;
				}
			}
			if (i_30_ < Class120_Sub12_Sub10.renderY) {
				Class120_Sub12_Sub10.renderY -= (Class120_Sub12_Sub10.renderY - i_30_) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (Class120_Sub12_Sub10.renderY < i_30_) {
					Class120_Sub12_Sub10.renderY = i_30_;
				}
			}
		}
		i_29_ = 128 * InterfaceListener.anInt2546 + 64;
		i_28_ = 64 + Class109.anInt1042 * 128;
		i_30_ = Class22.getTileHeight(i_28_, i_29_, Class173.gameLevel) - client.anInt1154;
		final int i_31_ = i_29_ - GroundObjectNode.renderZ;
		final int i_32_ = i_30_ - Class120_Sub12_Sub10.renderY;
		final int i_33_ = i_28_ - FileSystemWorker.renderX;
		final int i_34_ = (int) Math.sqrt(i_31_ * i_31_ + i_33_ * i_33_);
		int i_35_ = (int) (Math.atan2(i_32_, i_34_) * 325.949) & 0x7ff;
		if (i_35_ < 128) {
			i_35_ = 128;
		}
		if (i_35_ > 383) {
			i_35_ = 383;
		}
		final int i_36_ = (int) (Math.atan2(i_33_, i_31_) * -325.949) & 0x7ff;
		if (i_35_ > UnderlayType.renderPitch) {
			UnderlayType.renderPitch += (i_35_ - UnderlayType.renderPitch) * Class101_Sub1.anInt2272 / 1000 + Class120_Sub12_Sub31.anInt3384;
			if (UnderlayType.renderPitch > i_35_) {
				UnderlayType.renderPitch = i_35_;
			}
		}
		if (UnderlayType.renderPitch > i_35_) {
			UnderlayType.renderPitch -= (UnderlayType.renderPitch - i_35_) * Class101_Sub1.anInt2272 / 1000 + Class120_Sub12_Sub31.anInt3384;
			if (UnderlayType.renderPitch < i_35_) {
				UnderlayType.renderPitch = i_35_;
			}
		}
		int i_37_ = i_36_ - SpotAnimation.renderYaw;
		if (i_37_ > 1024) {
			i_37_ -= 2048;
		}
		if (i_37_ < -1024) {
			i_37_ += 2048;
		}
		if (i_37_ > 0) {
			SpotAnimation.renderYaw += Class101_Sub1.anInt2272 * i_37_ / 1000 + Class120_Sub12_Sub31.anInt3384;
			SpotAnimation.renderYaw &= 0x7ff;
		}
		if (i_37_ < 0) {
			SpotAnimation.renderYaw -= Class101_Sub1.anInt2272 * -i_37_ / 1000 + Class120_Sub12_Sub31.anInt3384;
			SpotAnimation.renderYaw &= 0x7ff;
		}
		int i_38_ = -SpotAnimation.renderYaw + i_36_;
		if (i_38_ > 1024) {
			i_38_ -= 2048;
		}
		if (i_38_ < -1024) {
			i_38_ += 2048;
		}
		if (i_38_ < 0 && i_37_ > 0 || i_38_ > 0 && i_37_ < 0) {
			SpotAnimation.renderYaw = i_36_;
		}
	}

	public Class120_Sub12_Sub16() {
		super(0, true);
	}
}
