/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModelParticleMagnet {
	static int anInt1643 = -1;
	static int mapflagId;
	static KeyboardHandler keyboardHandler = new KeyboardHandler();
	static int anInt1646;
	int vertexId;
	static int[] toUpdateEntityIndex = new int[2048];
	static js5 enumsJs5;
	MagnetType magnetType;
	ModelParticleMagnet(final int magnetId, final int vertexId) {
		this.magnetType = MagnetType.list(magnetId);
		this.vertexId = vertexId;
	}

	ModelParticleMagnet(final MagnetType magnetType, final int vertexId) {
		this.vertexId = vertexId;
		this.magnetType = magnetType;
	}
}
