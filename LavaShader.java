/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.media.opengl.GL;

final class LavaShader implements ShaderInterface {
	private int anInt2175 = -1;
	private int anInt2176;
	private FloatBuffer aFloatBuffer2177;
	private static float[] aFloatArray2178 = new float[4];
	private int anInt2179 = -1;

	@Override
	public final int method4() {
		return 0;
	}

	@Override
	public final void method2() {
		if (anInt2175 >= 0) {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2175 + 1);
		}
	}

	private final void method552() {
		final GL gl = HDToolkit.gl;
		anInt2175 = gl.glGenLists(2);
		gl.glNewList(anInt2175, 4864);
		gl.glActiveTexture(33985);
		if (Class78.allows3DTextureMapping) {
			gl.glBindTexture(32879, Class78.anInt684);
		}
		gl.glTexEnvi(8960, 34161, 260);
		gl.glTexEnvi(8960, 34162, 7681);
		gl.glTexEnvi(8960, 34184, 34168);
		gl.glActiveTexture(33984);
		gl.glBindProgramARB(34336, anInt2176);//VERTEX_PROGRAM_ARB
		gl.glEnable(34336);//VERTEX_PROGRAM_ARB
		gl.glEndList();
		gl.glNewList(anInt2175 + 1, 4864);
		gl.glActiveTexture(33985);
		gl.glMatrixMode(5890);
		gl.glLoadIdentity();
		gl.glMatrixMode(5888);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glDisable(Class78.allows3DTextureMapping ? 32879 : 3553);
		gl.glActiveTexture(33984);
		gl.glBindProgramARB(34336, 0);
		gl.glDisable(34336);//VERTEX_PROGRAM_ARB
		gl.glDisable(34820);
		gl.glEndList();
	}

	private final void method553() {
		if (anInt2175 >= 0) {
			final GL gl = HDToolkit.gl;
			final int[] is = new int[1];
			gl.glBindProgramARB(34336, anInt2176);//VERTEX_PROGRAM_ARB
			//VERTEX_PROGRAM_ARB, PROGRAM_FORMAT_ASCII_ARB
			gl.glProgramStringARB(
					34336,
					34933,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND"
							.length(),
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
			gl.glGetIntegerv(34379, is, 0);//PROGRAM_ERROR_POSITION_ARB
			if (is[0] != -1) {
				return;
			}
		}
	}

	@Override
	public final void method5(final int i) {
		if (anInt2175 >= 0) {
			final GL gl = HDToolkit.gl;
			gl.glActiveTexture(33985);//GL_TEXTURE1
			if ((i & 0x80) == 0) {
				gl.glEnable(Class78.allows3DTextureMapping ? 32879 : 3553);//TEXTURE_3D : TEXTURE_2D
			} else {
				gl.glDisable(Class78.allows3DTextureMapping ? 32879 : 3553);//TEXTURE_3D : TEXTURE_2D
			}
			gl.glActiveTexture(33984);//GL_TEXTURE0
			if ((i & 0x40) == 0) {
				gl.glGetFloatv(2899, aFloatArray2178, 0);//LIGHT_MODEL_AMBIENT
				gl.glProgramLocalParameter4fvARB(34336, 66, aFloatArray2178, 0);//VERTEX_PROGRAM_ARB
			} else {
				gl.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);//VERTEX_PROGRAM_ARB
			}
			final int i_0_ = i & 0x3;
			if (i_0_ == 2) {
				gl.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_0_ == 3) {
				gl.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				gl.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}
	}

	@Override
	public final void method3() {
		if (anInt2175 >= 0) {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2175);
			gl.glActiveTexture(33985);//TEXTURE1
			gl.glMatrixMode(5890);//TEXTURE
			gl.glTranslatef(Projectile.renderXWrapper, Class120_Sub12_Sub27.renderYWrapper, Class69_Sub1.renderZWrapper);
			gl.glRotatef(-(Class145.renderYawWrapper * 360.0F) / 2047.0F, 0.0F, 1.0F, 0.0F);//yaw, jagex typo? should be 2048
			gl.glRotatef(-(Class120_Sub14_Sub13.renderPitchWrapper * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);//pitch
			gl.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);//roll
			gl.glMatrixMode(5888);//_MODELVIEW
			if (!Class78.allows3DTextureMapping) {
				gl.glBindTexture(3553, Class78.anIntArray682[(int) (HDToolkit.loopCycleWrapper * 64 * 0.005F) % 64]);//TEXTURE_2D
			}
			gl.glActiveTexture(33984);//TEXTURE0
			if (anInt2179 != HDToolkit.loopCycleWrapper) {
				int i = (HDToolkit.loopCycleWrapper & 0xff) * 256;
				for (int i_1_ = 0; i_1_ < 64; i_1_++) {
					aFloatBuffer2177.position(i);
					gl.glProgramLocalParameter4fvARB(34336, i_1_, aFloatBuffer2177);//VERTEX_PROGRAM_ARB
					i += 4;
				}
				if (Class78.allows3DTextureMapping) {
					gl.glProgramLocalParameter4fARB(34336, 65, HDToolkit.loopCycleWrapper * 0.005F, 0.0F, 0.0F, 1.0F);//VERTEX_PROGRAM_ARB
				} else {
					gl.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);//VERTEX_PROGRAM_ARB
				}
				anInt2179 = HDToolkit.loopCycleWrapper;
			}
		}
	}

	public LavaShader() {
		if (anInt2175 < 0 && HDToolkit.aBoolean550 && HDToolkit.maxTextureUnits >= 2) {
			final int[] is = new int[1];
			final GL gl = HDToolkit.gl;
			gl.glGenProgramsARB(1, is, 0);
			anInt2176 = is[0];
			final int[][] is_2_ = Huffman.method1887(256, -87, 4, 0, 64, 3, 0.4F, 8, false);
			final int[][] is_3_ = Huffman.method1887(256, 120, 4, 8, 64, 3, 0.4F, 8, false);
			final Buffer class120_sub7 = new Buffer(262144);
			for (int i = 0; i < 256; i++) {
				final int[] is_4_ = is_2_[i];
				final int[] is_5_ = is_3_[i];
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					if (HDToolkit.usingBigEndian) {
						class120_sub7.putFloatAsInt(is_4_[i_6_] / 4096.0F);
						class120_sub7.putFloatAsInt(is_5_[i_6_] / 4096.0F);
						class120_sub7.putFloatAsInt(1.0F);
						class120_sub7.putFloatAsInt(1.0F);
					} else {
						class120_sub7.putFloatAsLEInt(is_4_[i_6_] / 4096.0F);
						class120_sub7.putFloatAsLEInt(is_5_[i_6_] / 4096.0F);
						class120_sub7.putFloatAsLEInt(1.0F);
						class120_sub7.putFloatAsLEInt(1.0F);
					}
				}
			}
			final ByteBuffer bytebuffer = ByteBuffer.allocateDirect(class120_sub7.pos).order(ByteOrder.nativeOrder());
			bytebuffer.put(class120_sub7.buf, 0, class120_sub7.pos);
			bytebuffer.flip();
			aFloatBuffer2177 = bytebuffer.asFloatBuffer().asReadOnlyBuffer();
			method552();
			method553();
		}
	}
}
