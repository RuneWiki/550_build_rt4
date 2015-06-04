/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModelParticleMagnet {
	static int anInt1643 = -1;
	static int mapflagId;
	static KeyboardHandler keyboardHandler = new KeyboardHandler();
	static int anInt1646;
	int anInt1647;
	static int[] toUpdateEntityIndex = new int[2048];
	static js5 aClass50_1649;
	MagnetType magnetType;
	static short aShort1651 = 256;

	ModelParticleMagnet(final int magnetId, final int i_0_) {
		this.magnetType = MagnetType.list(magnetId);
		this.anInt1647 = i_0_;
	}

	ModelParticleMagnet(final MagnetType magnetType, final int i) {
		this.anInt1647 = i;
		this.magnetType = magnetType;
	}
}
