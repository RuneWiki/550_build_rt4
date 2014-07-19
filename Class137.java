/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 {
	int[] anIntArray1322;
	static int anInt1323 = 0;
	Class120_Sub14_Sub5[] aClass120_Sub14_Sub5Array1324;
	int anInt1325;
	static PacketBuffer loginStream = new PacketBuffer(5000);

	static final void method1980(final JagexInterface[] class189s, final int i) {
		JagexInterface[] class189s_1_;
		final int i_0_ = (class189s_1_ = class189s).length;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			final JagexInterface jagexInterface = class189s_1_[i_2_];
			if (jagexInterface != null) {
				if (jagexInterface.type == 0) {
					if (jagexInterface.components != null) {
						method1980(jagexInterface.components, i);
					}
					final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
					if (class120_sub26 != null) {
						InterfaceClickMask.method1689(i, class120_sub26.interfaceId);
					}
				}
				if (i == 0 && jagexInterface.anObjectArray2013 != null) {
					final InterfaceListener class120_sub10 = new InterfaceListener();
					class120_sub10.aClass189_2534 = jagexInterface;
					class120_sub10.objectData = jagexInterface.anObjectArray2013;
					Class88.method744(true, class120_sub10);
				}
				if (i == 1 && jagexInterface.anObjectArray1932 != null) {
					if (jagexInterface.componentIndex >= 0) {
						final JagexInterface class189_3_ = Class74.getJagexInterface(jagexInterface.bitPacked);
						if (class189_3_ == null || class189_3_.components == null || class189_3_.components.length <= jagexInterface.componentIndex || jagexInterface != class189_3_.components[jagexInterface.componentIndex]) {
							continue;
						}
					}
					final InterfaceListener class120_sub10 = new InterfaceListener();
					class120_sub10.objectData = jagexInterface.anObjectArray1932;
					class120_sub10.aClass189_2534 = jagexInterface;
					Class88.method744(true, class120_sub10);
				}
			}
		}
	}

	public static void method1981(final byte i) {
		try {
			loginStream = null;
			if (i != -97) {
				loginStream = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("po.A(").append(i).append(')').toString());
		}
	}

	static final void method1982(final int i_4_, final int yOff, final int i_6_, int x, int z, final int i_9_, final int i_10_) {
		if (x < 128 || z < 128 || x > 13056 || z > 13056) {
			Class120_Sub12_Sub38.anInt3434 = -1;
			Class120_Sub15.anInt2588 = -1;
		} else {
			int y = Class22.getTileHeight(Class173.gameLevel, x, z) - yOff;
			x -= Class83.renderX;
			y -= Class120_Sub12_Sub10.renderY;
			z -= GroundObjectNode.renderZ;
			final int i_12_ = Rasterizer.sineTable[OverlayType.renderPitch];
			final int i_13_ = Rasterizer.cosineTable[OverlayType.renderPitch];
			final int i_14_ = Rasterizer.sineTable[Class180_Sub3.renderYaw];
			final int i_15_ = Rasterizer.cosineTable[Class180_Sub3.renderYaw];
			int i_16_ = z * i_14_ + x * i_15_ >> 16;
			z = z * i_15_ - i_14_ * x >> 16;
			x = i_16_;
			i_16_ = -(z * i_12_) + i_13_ * y >> 16;
			z = i_12_ * y + z * i_13_ >> 16;
			y = i_16_;
			if (z < 50) {
				Class120_Sub15.anInt2588 = -1;
				Class120_Sub12_Sub38.anInt3434 = -1;
			} else if (HDToolkit.glEnabled) {
				final int i_17_ = i_6_ * 512 >> 8;
				Class120_Sub12_Sub38.anInt3434 = i_10_ + i_17_ * x / z;
				final int i_18_ = i_9_ * 512 >> 8;
				Class120_Sub15.anInt2588 = i_4_ - -(i_18_ * y / z);
			} else {
				Class120_Sub12_Sub38.anInt3434 = i_10_ - -((x << 9) / z);
				Class120_Sub15.anInt2588 = i_4_ + (y << 9) / z;
			}
		}
	}

	Class137(final int i) {
		this.anInt1325 = i;
		this.anIntArray1322 = new int[this.anInt1325];
		this.aClass120_Sub14_Sub5Array1324 = new Class120_Sub14_Sub5[this.anInt1325];
	}
}
