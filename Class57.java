/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class57 {
	static js5 aClass50_499;
	static int anInt500 = 0;
	static GZIPDecompressor gzipDecompressor;
	static int worldLen2;
	static int delayAfterWorldChange = 0;

	static {
		gzipDecompressor = new GZIPDecompressor();
	}
	
	static final void method492() {
		final int i_0_ = Class24.method207();
		if (i_0_ == 0) {
			Class9.aByteArrayArrayArray70 = null;
			IsaacCipher.method905(0);
		} else if (i_0_ == 1) {
			LocType.method2465((byte) 0);
			IsaacCipher.method905(512);
			if (Class114.tileSettings != null) {
				InvType.method1447();
			}
		} else {
			LocType.method2465((byte) (InterfaceChangeNode.anInt3490 - 4 & 0xff));
			IsaacCipher.method905(2);
		}
		Class153.anInt1436 = Class173.gameLevel;
	}

	abstract AbstractObject method493(AbstractObject abstractObject);

	static final void setLightPosition(final int chunkX, final int chunkZ) {
		Class120_Sub30_Sub2.currentLightX = Identikit.chunksAtmosphere[chunkX][chunkZ].lightX;
		Queue.currentLightY = Identikit.chunksAtmosphere[chunkX][chunkZ].lightY;
		ProducingGraphicsBuffer.currentLightZ = Identikit.chunksAtmosphere[chunkX][chunkZ].lightZ;
		AtmosphereManager.setLightPosition(Class120_Sub30_Sub2.currentLightX, Queue.currentLightY, ProducingGraphicsBuffer.currentLightZ);
	}
	
}
