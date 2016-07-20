/* Class120_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DeleteShadersNode extends Node {
	GLShader[] shaders;
	int target;

	DeleteShadersNode(final int target, final GLShader[] shaders) {
		this.target = target;
		this.shaders = shaders;
	}
}
