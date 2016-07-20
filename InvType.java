/* Class120_Sub14_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InvType extends NodeSub {
	
	int size = 0;
	static js5 aClass50_1613;
	static NodeCache recentUse = new NodeCache(64);
	
	private final void decode(final Buffer buffer, final int code) {
		if (code == 2) {
			this.size = buffer.getUShort();
		}
	}

	static final void updateLoginScreenCamera() {
		if (AbstractGraphicsBuffer.anInt1157 != -1 && Class120_Sub12_Sub15.anInt3248 != -1) {
			final int i_3_ = ((Class120_Sub12_Sub6.maxLoginScreenCameraSpeed - JagexInterface.minLoginScreenCameraSpeed) * MagnetType.anInt272 >> 16) + JagexInterface.minLoginScreenCameraSpeed;
			final float[] renderCoordinates = new float[3];
			MagnetType.anInt272 += i_3_;
			if (MagnetType.anInt272 < 65535) {
				Class24.aBoolean139 = false;
				AbstractSprite.aBoolean3622 = false;
			} else {
				MagnetType.anInt272 = 65535;
				if (AbstractSprite.aBoolean3622) {
					Class24.aBoolean139 = false;
				} else {
					Class24.aBoolean139 = true;
				}
				AbstractSprite.aBoolean3622 = true;
			}
			final float f = MagnetType.anInt272 / 65535.0F;
			final int i_4_ = PlayerAppearance.anInt1372 * 2;
			for (int i_5_ = 0; i_5_ < 3; i_5_++) {
				final int i_6_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_][i_5_] * 3;
				final int i_7_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 1][i_5_] * 3;
				final int i_8_ = (Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 2][i_5_] + Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 2][i_5_] - Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 3][i_5_]) * 3;
				final int i_9_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_][i_5_];
				final int i_10_ = i_7_ - i_6_;
				final int i_11_ = i_6_ + i_8_ - i_7_ * 2;
				final int i_12_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 2][i_5_] - i_9_ + i_7_ - i_8_;
				renderCoordinates[i_5_] = i_9_ + (i_10_ + (i_11_ + i_12_ * f) * f) * f;
			}
			FileSystemWorker.renderX = (int) renderCoordinates[0] - (GameEntity.currentBaseX * 128);
			Class120_Sub12_Sub10.renderY = (int) renderCoordinates[1] * -1;
			GroundObjectNode.renderZ = (int) renderCoordinates[2] - (LightType.currentBaseZ * 128);
			final float[] renderRotation = new float[3];
			final int i_14_ = Class9.anInt67 * 2;
			for (int i_15_ = 0; i_15_ < 3; i_15_++) {
				final int i_16_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_][i_15_] * 3;
				final int i_17_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 1][i_15_] * 3;
				final int i_18_ = (Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 2][i_15_] + Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 2][i_15_] - Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 3][i_15_]) * 3;
				final int i_19_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_][i_15_];
				final int i_20_ = i_17_ - i_16_;
				final int i_22_ = i_18_ + i_16_ - i_17_ * 2;
				final int i_21_ = i_17_ + Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 2][i_15_] - i_19_ - i_18_;
				renderRotation[i_15_] = f * ((f * i_21_ + i_22_) * f + i_20_) + i_19_;
			}
			final float x = renderRotation[0] - renderCoordinates[0];
			final float y = (renderRotation[1] - renderCoordinates[1]) * -1.0F;
			final float z = renderRotation[2] - renderCoordinates[2];
			final double dist = Math.sqrt(x * x + z * z);
			Class120_Sub30_Sub1.aFloat3674 = (float) Math.atan2(y, dist);
			SeekableFile.aFloat2139 = -(float) Math.atan2(x, z);
			SpotAnimation.renderYaw = (int) (SeekableFile.aFloat2139 * 325.949) & 0x7ff;
			UnderlayType.renderPitch = (int) (Class120_Sub30_Sub1.aFloat3674 * 325.949) & 0x7ff;
		}
	}

	static final void addMenuOption(final String prefix, final String suffix, final long data1, final int data2, final int data3, final short code, final int cursor) {
		if (!Class15.menuOpen && WallDecoration.menuOptionCount < 500) {
			Class120_Sub12_Sub33.menuOptionPrefix[WallDecoration.menuOptionCount] = prefix;
			Class120_Sub12_Sub29.menuOptionSuffix[WallDecoration.menuOptionCount] = suffix;
			InterfaceChangeNode.menuOptionsCursorId[WallDecoration.menuOptionCount] = cursor == -1 ? Class192.selectedSpellCursor : cursor;
			Class120_Sub29.menuOptionsCode[WallDecoration.menuOptionCount] = code;
			Class120_Sub12.menuOptionsData1[WallDecoration.menuOptionCount] = data1;
			Class120_Sub12_Sub7.menuOptionsData2[WallDecoration.menuOptionCount] = data2;
			Class120_Sub29.menuOptionsData3[WallDecoration.menuOptionCount] = data3;
			WallDecoration.menuOptionCount++;
		}
	}

	static final void method1447() {
		int i = 0;
		for (int i_31_ = 0; i_31_ < 104; i_31_++) {
			for (int i_32_ = 0; i_32_ < 104; i_32_++) {
				if (LongNode.method1055(i, i_31_, true, i_32_, SeqFrameBase.activeGroundTiles)) {
					i++;
				}
				if (i >= 512) {
					return;
				}
			}
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

	static final void setup(final js5 js5) {
		aClass50_1613 = js5;
	}

	static final InvType list(final int id) {
		InvType invType = (InvType) recentUse.get(id);
		if (invType != null) {
			return invType;
		}
		final byte[] data = aClass50_1613.getFile(5, id);
		invType = new InvType();
		if (data != null) {
			invType.decode(new Buffer(data));
		}
		recentUse.put(invType, id);
		return invType;
	}

	public InvType() {
		/* empty */
	}

}
