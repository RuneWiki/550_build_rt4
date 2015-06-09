import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

/* Class120_Sub12_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub20 extends Class120_Sub12 {
	private int[][] anIntArrayArray3283;
	static int anInt3284;
	private int[] anIntArray3285;
	static AbstractFont plainFont;
	private short[] aShortArray3287 = new short[257];
	private int anInt3288 = 0;
	private int[] anIntArray3289;

	static final void method1296() {
		SeqType.recentUse.clear();
		FrameGroup.recentUse.clear();
	}

	private final int[] method1297(final int i) {
		if (i < 0) {
			return anIntArray3285;
		}
		if (anIntArrayArray3283.length <= i) {
			return anIntArray3289;
		}
		return anIntArrayArray3283[i];
	}

	@Override
	final int[] method1187(final int i_1_) {
		final int[] is_2_ = this.aClass30_2563.method258(i_1_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_3_ = method1192(i_1_, 0);
			for (int i_4_ = 0; i_4_ < Class120_Sub12_Sub7.anInt3178; i_4_++) {
				int i_5_ = is_3_[i_4_] >> 4;
				if (i_5_ < 0) {
					i_5_ = 0;
				}
				if (i_5_ > 256) {
					i_5_ = 256;
				}
				is_2_[i_4_] = aShortArray3287[i_5_];
			}
		}
		return is_2_;
	}

	private final void method1298() {
		while_197_: do {
			int i_6_ = anInt3288;
			do {
				if (i_6_ != 2) {
					if (i_6_ != 1) {
						break;
					}
				} else {
					for (i_6_ = 0; i_6_ < 257; i_6_++) {
						final int i_7_ = i_6_ << 4;
						int i_8_;
						for (i_8_ = 1; i_8_ < anIntArrayArray3283.length - 1 && i_7_ >= anIntArrayArray3283[i_8_][0]; i_8_++) {
							/* empty */
						}
						final int[] is = anIntArrayArray3283[i_8_];
						final int[] is_9_ = anIntArrayArray3283[i_8_ - 1];
						final int i_10_ = method1297(i_8_ - 2)[1];
						final int i_11_ = is[1];
						final int i_12_ = is_9_[1];
						final int i_13_ = i_12_;
						final int i_14_ = i_11_ - i_10_;
						final int i_15_ = method1297(1 + i_8_)[1];
						final int i_16_ = (-is_9_[0] + i_7_ << 12) / (is[0] - is_9_[0]);
						final int i_17_ = -i_10_ + -i_11_ + i_15_ + i_12_;
						final int i_18_ = -i_12_ + i_10_ - i_17_;
						final int i_19_ = i_16_ * i_16_ >> 12;
						final int i_20_ = i_16_ * i_14_ >> 12;
						final int i_21_ = (i_16_ * i_17_ >> 12) * i_19_ >> 12;
						final int i_22_ = i_19_ * i_18_ >> 12;
						int i_23_ = i_21_ - -i_22_ + i_20_ + i_13_;
						if (i_23_ <= -32768) {
							i_23_ = -32767;
						}
						if ((i_23_ ^ 0xffffffff) <= -32769) {
							i_23_ = 32767;
						}
						aShortArray3287[i_6_] = (short) i_23_;
					}
					break while_197_;
				}
				for (i_6_ = 0; i_6_ < 257; i_6_++) {
					final int i_24_ = i_6_ << 4;
					int i_25_;
					for (i_25_ = 1; -1 + anIntArrayArray3283.length > i_25_ && anIntArrayArray3283[i_25_][0] <= i_24_; i_25_++) {
						/* empty */
					}
					final int[] is = anIntArrayArray3283[-1 + i_25_];
					final int[] is_26_ = anIntArrayArray3283[i_25_];
					final int i_27_ = (-is[0] + i_24_ << 12) / (is_26_[0] + -is[0]);
					final int i_28_ = 4096 + -FileSystemWorker.anIntArray789[0xff & i_27_ >> 5] >> 1;
					final int i_29_ = 4096 + -i_28_;
					int i_30_ = i_28_ * is_26_[1] + i_29_ * is[1] >> 12;
					if (i_30_ <= -32768) {
						i_30_ = -32767;
					}
					if (-32769 >= (i_30_ ^ 0xffffffff)) {
						i_30_ = 32767;
					}
					aShortArray3287[i_6_] = (short) i_30_;
				}
				break while_197_;
			} while (false);
			for (i_6_ = 0; i_6_ < 257; i_6_++) {
				final int i_31_ = i_6_ << 4;
				int i_32_;
				for (i_32_ = 1; anIntArrayArray3283.length - 1 > i_32_ && i_31_ >= anIntArrayArray3283[i_32_][0]; i_32_++) {
					/* empty */
				}
				final int[] is = anIntArrayArray3283[-1 + i_32_];
				final int[] is_33_ = anIntArrayArray3283[i_32_];
				final int i_34_ = (i_31_ - is[0] << 12) / (-is[0] + is_33_[0]);
				final int i_35_ = -i_34_ + 4096;
				int i_36_ = is_33_[1] * i_34_ + i_35_ * is[1] >> 12;
				if (i_36_ <= -32768) {
					i_36_ = -32767;
				}
				if (i_36_ >= 32768) {
					i_36_ = 32767;
				}
				aShortArray3287[i_6_] = (short) i_36_;
			}
		} while (false);
	}

	private final void method1299() {
		final int[] is = anIntArrayArray3283[0];
		final int[] is_37_ = anIntArrayArray3283[1];
		final int[] is_38_ = anIntArrayArray3283[anIntArrayArray3283.length + -1];
		final int[] is_39_ = anIntArrayArray3283[anIntArrayArray3283.length - 2];
		anIntArray3289 = new int[] { is_39_[0] + is_39_[0] - is_38_[0], is_39_[1] + is_39_[1] - is_38_[1] };
		anIntArray3285 = new int[] { is[0] - (-is[0] + is_37_[0]), is[1] + -is_37_[1] + is[1] };
	}

	static final void executeCommand(final String command) {
		if (Class86.staffLevel >= 2) {
			if (command.equalsIgnoreCase("::gc")) {
				Class120_Sub12_Sub21.method1311();
				for (int id = 0; id < 10; id++) {
					System.gc();
				}
				final Runtime runtime = Runtime.getRuntime();
				final int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				AbstractRequest.pushMessage("mem=" + usedMemory + "k", null, 0);
			}
			if (command.equalsIgnoreCase("::mm")) {
				/*Class120_Sub12_Sub21.method1311(); //It doesn't make sense if you clean memory then print before cleanup?
				for (int i_42_ = 0; i_42_ < 10; i_42_++) {
					System.gc();
				}*/
				final Runtime runtime = Runtime.getRuntime();
				int usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				AbstractRequest.pushMessage("Memory before cleanup=" + usedMemory + "k", null, 0);
				SpotAnimType.method880();
				Class120_Sub12_Sub21.method1311();
				for (int i_44_ = 0; i_44_ < 10; i_44_++) {
					System.gc();
				}
				usedMemory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				AbstractRequest.pushMessage("Memory after cleanup=" + usedMemory + "k", null, 0);
			}
			if (command.equalsIgnoreCase("::pcachesize")) {
				AbstractRequest.pushMessage("Number of player models in cache:" + Class48.getPlayersCacheSize(), null, 0);
			}
			if (HDToolkit.glEnabled && command.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + MemoryManager.geometryMemory);
				System.out.println("oncard_2d:" + MemoryManager.memory2d);
				System.out.println("oncard_texture:" + MemoryManager.textureMemory);
			}
			if (command.equalsIgnoreCase("::clientdrop")) {
				TileParticleQueue.dropClient();
			}
			if (command.equalsIgnoreCase("::clientjs5drop")) {
				Class178.js5Worker.closeConnection();
			}
			if (command.equalsIgnoreCase("::serverjs5drop")) {
				Class178.js5Worker.sendDropConnection();
			}
			if (command.equalsIgnoreCase("::breakcon")) {
				NpcType.gameSignlink.closeSocketIn(5000);
				AbstractTimer.worldConnection.replaceStreamsWithDummy();
				Class178.js5Worker.replaceStreamsWithDummy();
			}
			if (command.equalsIgnoreCase("::replacecanvas")) {
				LongNode.canvasReplaceRecommended = true;
			}
			if (command.equalsIgnoreCase("::rebuild")) {
				ProjectileNode.setGameState(25);
			}
			if (command.equalsIgnoreCase("::fpson")) {
				HintIcon.showFps = true;
			}
			if (command.equalsIgnoreCase("::test")) {
				int id = 600;
				int idk = 1;
				int delay = 0;
				int volume = 255;
				Class48.method404(id, delay, idk, volume);
				System.out.println("hello");
			}
			if (command.equalsIgnoreCase("::fpsoff")) {
				HintIcon.showFps = false;
			}
			if (command.equalsIgnoreCase("::wm0")) {
				AbstractSprite.changeDisplayMode(0, -1, -1, false);
			}
			if (command.equalsIgnoreCase("::wm1")) {
				AbstractSprite.changeDisplayMode(1, -1, -1, false);
			}
			if (command.equalsIgnoreCase("::wm2")) {
				AbstractSprite.changeDisplayMode(2, -1, -1, false);
			}
			if (command.equalsIgnoreCase("::wm3")) {
				AbstractSprite.changeDisplayMode(3, 1024, 768, false);
			}
			if (command.startsWith("::setba")) {
				Class140.anInt1343 = Class31.stringToBase10(command.substring(8));
				Class120_Sub6.savePreferences(NpcType.gameSignlink);
				MapFunctionNode.aBoolean3471 = false;
			}
			if (command.startsWith("::setparticles")) {
				ParticleEngine.setParticles(Class31.stringToBase10(command.substring(15)));
				Class120_Sub6.savePreferences(NpcType.gameSignlink);
				MapFunctionNode.aBoolean3471 = false;
			}
			if (command.startsWith("::fps ")) {
				Class190.setFps(Class31.stringToBase10(command.substring(6)));
			}
			if (command.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (command.startsWith("::rect_debug")) {
				Class15.rectDebugType = Class31.stringToBase10(command.substring(12).trim());
				AbstractRequest.pushMessage("rect_debug=" + Class15.rectDebugType, null, 0);
			}
			if (command.equalsIgnoreCase("::qa_op_test")) {
				Class120_Sub30_Sub1.qaOpTestEnabled = true;
			}
			if (command.startsWith("::hdr") && HDToolkit.glEnabled && !ParticleEmitter.setHdr(!Class34.method290())) {
				AbstractRequest.pushMessage("Failed to enable hdr", null, 0);
			}
			if (command.equalsIgnoreCase("::tween")) {
				if (Class164.forceTweenEnabled) {
					Class164.forceTweenEnabled = false;
					AbstractRequest.pushMessage("Forced tweening disabled.", null, 0);
				} else {
					Class164.forceTweenEnabled = true;
					AbstractRequest.pushMessage("Forced tweening ENABLED!", null, 0);
				}
			}
			if (command.equalsIgnoreCase("::shiftclick")) {
				if (SpotAnimationNode.shiftClickEnabled) {
					System.out.println("Shift-click disabled.");
					SpotAnimationNode.shiftClickEnabled = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					SpotAnimationNode.shiftClickEnabled = true;
				}
			}
			if (command.equalsIgnoreCase("::getcgcoord")) {
				AbstractRequest.pushMessage("x:" + (TileParticleQueue.selfPlayer.x >> 7) + " z:" + (TileParticleQueue.selfPlayer.z >> 7) + " groundh:" + OverridedJInterface.activeTileHeightMap[Class173.gameLevel][TileParticleQueue.selfPlayer.x >> 7][TileParticleQueue.selfPlayer.z >> 7], null, 0);
			}
			if (command.equalsIgnoreCase("::getheight")) {
				AbstractRequest.pushMessage("Height: " + OverridedJInterface.activeTileHeightMap[Class173.gameLevel][TileParticleQueue.selfPlayer.x >> 7][TileParticleQueue.selfPlayer.z >> 7], null, 0);
			}
		}
		Class120_Sub12_Sub11.outputStream.putByteIsaac(216);
		Class120_Sub12_Sub11.outputStream.putByte(command.length() - 1);
		Class120_Sub12_Sub11.outputStream.putJagexString(command.substring(2));
	}

	@Override
	final void postDecode() {
		if (anIntArrayArray3283 == null) {
			anIntArrayArray3283 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (anIntArrayArray3283.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (anInt3288 == 2) {
			method1299();
		}
		PacketBuffer.method1147();
		method1298();
	}

	@Override
	final void decode(final Buffer buffer, final int i_45_) {
		if (i_45_ == 0) {
			anInt3288 = buffer.getUByte();
			anIntArrayArray3283 = new int[buffer.getUByte()][2];
			for (int i_46_ = 0; i_46_ < anIntArrayArray3283.length; i_46_++) {
				anIntArrayArray3283[i_46_][0] = buffer.getUShort();
				anIntArrayArray3283[i_46_][1] = buffer.getUShort();
			}
		}
	}

	static final void method1302(final int level, final int x, final int z) {
		Class120_Sub12_Sub7.aBoolean3181 = true;
		Projectile.anInt2933 = level;
		ParticleEmitter.anInt2320 = x;
		Class187.anInt1908 = z;
		ObjectCache.anInt122 = -1;
		WaterfallShader.anInt2174 = -1;
	}

	public Class120_Sub12_Sub20() {
		super(1, true);
	}

	static final LDIndexedSprite constructLDIndexedSprite() {
		final LDIndexedSprite ldIndexedSprite = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], Class145.spritePaletteIndicators[0], Class132_Sub1.spritePalette);
		Class53_Sub1.resetSpriteInfo();
		return ldIndexedSprite;
	}
}
