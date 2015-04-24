/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MapFunctionGroup {
	int[] coordinates;
	static int anInt1323 = 0;
	MapFunctionNode[] nodes;
	int length;
	static PacketBuffer loginStream = new PacketBuffer(5000);

	static final void method1980(final JagexInterface[] class189s, final int i) {
		for (int i_2_ = 0; i_2_ < class189s.length; i_2_++) {
			final JagexInterface jagexInterface = class189s[i_2_];
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
					Class88.method744(class120_sub10);
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
					Class88.method744(class120_sub10);
				}
			}
		}
	}

	static final void worldToScreen(int x, final int heightMod, int z, final int screenOffX, final int screenOffY, final int i_6_, final int i_9_) {
		if (x < 128 || z < 128 || x > 13056 || z > 13056) {
			Class120_Sub12_Sub38.screenX = -1;
			Class120_Sub15.screenY = -1;
		} else {
			int y = Class22.getTileHeight(x, z, Class173.gameLevel) - heightMod;
			x -= FileSystemWorker.renderX;
			y -= Class120_Sub12_Sub10.renderY;
			z -= GroundObjectNode.renderZ;
			final int pitchSin = Rasterizer.sinTable[UnderlayType.renderPitch];
			final int pitchCos = Rasterizer.cosTable[UnderlayType.renderPitch];
			final int yawSin = Rasterizer.sinTable[SpotAnimation.renderYaw];
			final int yawCos = Rasterizer.cosTable[SpotAnimation.renderYaw];
			int rot = x * yawCos + z * yawSin >> 16;
			z = z * yawCos - yawSin * x >> 16;
			x = rot;
			rot = y * pitchCos - z * pitchSin >> 16;
			z = y * pitchSin + z * pitchCos >> 16;
			y = rot;
			if (z < 50) {
				Class120_Sub15.screenY = -1;
				Class120_Sub12_Sub38.screenX = -1;
			} else if (HDToolkit.glEnabled) {
				//Both are linked from save variable.
				final int screenWidth1 = i_6_ * 512 >> 8;
				final int screenWidth2 = i_9_ * 512 >> 8;
				Class120_Sub12_Sub38.screenX = screenOffX + (x * screenWidth1) / z;
				Class120_Sub15.screenY = screenOffY + (y * screenWidth2) / z;
			} else {
				Class120_Sub12_Sub38.screenX = screenOffX + (x << 9) / z;
				Class120_Sub15.screenY = screenOffY + (y << 9) / z;
			}
		}
	}

	MapFunctionGroup(final int len) {
		this.length = len;
		this.coordinates = new int[this.length];
		this.nodes = new MapFunctionNode[this.length];
	}
}
