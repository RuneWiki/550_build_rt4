/* Class108_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class ParticleNodeSub extends ParticleNode {
	static int worldPos = 1;
	static boolean highDetailTextures = true;
	ParticleNodeSub nextSub;
	ParticleNodeSub previousSub;
	static js5 binaryJs5;
	static int[][] anIntArrayArray2401 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	public ParticleNodeSub() {
		/* empty */
	}

	final void unlinkSub() {
		if (this.previousSub != null) {
			this.previousSub.nextSub = this.nextSub;
			this.nextSub.previousSub = this.previousSub;
			this.nextSub = null;
			this.previousSub = null;
		}
	}
}
