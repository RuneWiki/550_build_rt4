/* Class120_Sub14_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class120_Sub14_Sub15 extends NodeSub {
	private int anInt3579 = 0;
	static int[] masklookup = new int[32];
	private int textureId = -1;
	static volatile int keyboardIdleCycle;
	static int headiconspkId;
	static Deque aClass105_3584;
	static String gameLoadingText;
	private final int anInt3586;

	static {
		int i = 2;
		for (int i_0_ = 0; i_0_ < 32; i_0_++) {
			masklookup[i_0_] = i - 1;
			i += i;
		}
		keyboardIdleCycle = 0;
		gameLoadingText = null;
		aClass105_3584 = new Deque();
	}

	static final void postVarpChange(final int varpId) {
		Class90.redrawOldFormatOverridedInterfaces();
		ReflectionCheckNode.refreshLocationNpcAmbientSounds();
		final int setting = Varp.list(varpId).setting;
		if (setting != 0) {
			final int value = Class2.permanentVariable[varpId];
			if (setting == 5) {
				Class69.mouseButtons = value;
			}
			if (setting == 6) {
				Player.chatEffectsEnabled = value;
			}
			if (setting == 9) {
				JagexInterface.inserting = value;
			}
		}
	}

	static final void method1556(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		for (int i_9_ = i_6_; i_6_ + i_7_ >= i_9_; i_9_++) {
			for (int i_10_ = i; i_10_ <= i + i_5_; i_10_++) {
				if (i_10_ >= 0 && i_10_ < 104 && i_9_ >= 0 && i_9_ < 104) {
					Npc.aByteArrayArrayArray3754[i_4_][i_10_][i_9_] = (byte) 127;
				}
			}
		}
		for (int i_11_ = i_6_; i_7_ + i_6_ > i_11_; i_11_++) {
			for (int i_12_ = i; i_12_ < i_5_ + i; i_12_++) {
				if (i_12_ >= 0 && i_12_ < 104 && i_11_ >= 0 && i_11_ < 104) {
					OverridedJInterface.activeTileHeightMap[i_4_][i_12_][i_11_] = i_4_ > 0 ? OverridedJInterface.activeTileHeightMap[i_4_ + -1][i_12_][i_11_] : 0;
				}
			}
		}
		if (i > 0 && i < 104) {
			for (int i_13_ = 1 + i_6_; i_13_ < i_6_ - -i_7_; i_13_++) {
				if (i_13_ >= 0 && i_13_ < 104) {
					OverridedJInterface.activeTileHeightMap[i_4_][i][i_13_] = OverridedJInterface.activeTileHeightMap[i_4_][-1 + i][i_13_];
				}
			}
		}
		if (i_6_ > 0 && i_6_ < 104) {
			for (int i_14_ = i + 1; i - -i_5_ > i_14_; i_14_++) {
				if (i_14_ >= 0 && i_14_ < 104) {
					OverridedJInterface.activeTileHeightMap[i_4_][i_14_][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][i_14_][i_6_ - 1];
				}
			}
		}
		if (i >= 0 && i_6_ >= 0 && i < 104 && i_6_ < 104) {
			if (i_4_ != 0) {
				if (i <= 0 || OverridedJInterface.activeTileHeightMap[-1 + i_4_][-1 + i][i_6_] == OverridedJInterface.activeTileHeightMap[i_4_][i - 1][i_6_]) {
					if (i_6_ > 0 && OverridedJInterface.activeTileHeightMap[i_4_ + -1][i][i_6_ + -1] != OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_ + -1]) {
						OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_ - 1];
					} else if (i > 0 && i_6_ > 0 && OverridedJInterface.activeTileHeightMap[-1 + i_4_][-1 + i][-1 + i_6_] != OverridedJInterface.activeTileHeightMap[i_4_][-1 + i][i_6_ - 1]) {
						OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][-1 + i][i_6_ - 1];
					}
				} else {
					OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][i + -1][i_6_];
				}
			} else if (i > 0 && OverridedJInterface.activeTileHeightMap[i_4_][i - 1][i_6_] != 0) {
				OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][i - 1][i_6_];
			} else if (i_6_ <= 0 || OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_ - 1] == 0) {
				if (i > 0 && i_6_ > 0 && OverridedJInterface.activeTileHeightMap[i_4_][-1 + i][-1 + i_6_] != 0) {
					OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][-1 + i][i_6_ + -1];
				}
			} else {
				OverridedJInterface.activeTileHeightMap[i_4_][i][i_6_] = OverridedJInterface.activeTileHeightMap[i_4_][i][-1 + i_6_];
			}
		}
	}

	static final String decodeText(final Buffer buffer, final int maxLen) {
		try {
			int len = buffer.getUSmart();
			if (len > maxLen) {
				len = maxLen;
			}
			final byte[] buf = new byte[len];
			buffer.pos += client.huffman.method1886(0, buffer.pos, buffer.buf, buf, len);
			return DisplayModeInfo.bufferToString(buf, 0, len);
		} catch (final Exception exception) {
			return "Cabbage";
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		if (textureId != -1) {
			MemoryManager.method999(textureId, anInt3579, anInt3586);
			anInt3579 = 0;
			textureId = -1;
		}
		super.finalize();
	}

	static final int method1558(final int i, final int i_19_, final int i_20_) {
		final int i_22_ = i >> 31 & i_20_ + i_19_;
		return i_22_ + (i + (i >>> 31)) % i_20_;
	}

	final void method1559() {
		final int i_23_ = Class49.method408();
		if ((i_23_ & 0x1) == 0) {
			HDToolkit.bindTexture2D(textureId);
		}
		if ((i_23_ & 0x2) == 0) {
			HDToolkit.method511(0);
		}
		if ((i_23_ & 0x4) == 0) {
			HDToolkit.method521(0);
		}
	}

	Class120_Sub14_Sub15(final int i) {
		final GL gl = HDToolkit.gl;
		final int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		textureId = is[0];
		anInt3586 = MemoryManager.anInt1083;
		HDToolkit.bindTexture2D(textureId);
		final int palette = Rasterizer.palette[i];
		final byte[] is_25_ = { (byte) (palette >> 16), (byte) (palette >> 8), (byte) palette, -1 };
		final ByteBuffer bytebuffer = ByteBuffer.wrap(is_25_);
		gl.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, bytebuffer);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
		MemoryManager.textureMemory += bytebuffer.limit() - anInt3579;
		anInt3579 = bytebuffer.limit();
	}
}
