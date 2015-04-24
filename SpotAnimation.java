/* Class180_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class SpotAnimation extends SceneGraphNode {
	int x;
	int y;
	static ObjectCache aClass21_2906 = new ObjectCache(100);
	int z;
	int level;
	static int renderYaw;
	private final int myId;
	private int delay;
	private boolean aBoolean2913;
	private int maxY = -32768;
	private ParticleEngine particleEngine;
	private SeqType seqType;
	int startCycle;
	static int[] anIntArray2918 = new int[14];
	private int frame;
	boolean finishedAnimating;
	static int[] anIntArray2921;

	static final void method2309() {
		Canvas_Sub1.inputStream.startBitAccess();
		final int i_0_ = Canvas_Sub1.inputStream.getBitValue(8);
		if (i_0_ < Class148.localNpcCount) {
			for (int i_1_ = i_0_; Class148.localNpcCount > i_1_; i_1_++) {
				Class43.anIntArray366[Class120_Sub12_Sub23.anInt3307++] = Class120_Sub12_Sub36.npcIndices[i_1_];
			}
		}
		if (i_0_ > Class148.localNpcCount) {
			throw new RuntimeException("gnpov1");
		}
		Class148.localNpcCount = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			final int i_3_ = Class120_Sub12_Sub36.npcIndices[i_2_];
			final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
			final int i_4_ = Canvas_Sub1.inputStream.getBitValue(1);
			if (i_4_ == 0) {
				Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = i_3_;
				class180_sub5_sub2.lastUpdateCycle = Class101_Sub2.loopCycle;
			} else {
				final int i_5_ = Canvas_Sub1.inputStream.getBitValue(2);
				if (i_5_ == 0) {
					Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.lastUpdateCycle = Class101_Sub2.loopCycle;
					Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
				} else if (i_5_ == 1) {
					Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.lastUpdateCycle = Class101_Sub2.loopCycle;
					final int i_6_ = Canvas_Sub1.inputStream.getBitValue(3);
					class180_sub5_sub2.move(i_6_, 1);
					final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
					if (i_7_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
					}
				} else if (i_5_ == 2) {
					Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.lastUpdateCycle = Class101_Sub2.loopCycle;
					if (Canvas_Sub1.inputStream.getBitValue(1) != 1) {
						final int i_8_ = Canvas_Sub1.inputStream.getBitValue(3);
						class180_sub5_sub2.move(i_8_, 0);
					} else {
						final int i_9_ = Canvas_Sub1.inputStream.getBitValue(3);
						class180_sub5_sub2.move(i_9_, 2);
						final int i_10_ = Canvas_Sub1.inputStream.getBitValue(3);
						class180_sub5_sub2.move(i_10_, 2);
					}
					final int i_11_ = Canvas_Sub1.inputStream.getBitValue(1);
					if (i_11_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
					}
				} else if (i_5_ == 3) {
					Class43.anIntArray366[Class120_Sub12_Sub23.anInt3307++] = i_3_;
				}
			}
		}
	}

	private final void method2310(final AbstractModelRenderer class180_sub7) {
		if (!HDToolkit.glEnabled) {
			final LDModelRenderer class180_sub7_sub1 = (LDModelRenderer) class180_sub7;
			if ((particleEngine == null || particleEngine.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
				particleEngine = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
			}
			if (particleEngine != null) {
				particleEngine.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
			}
		} else {
			final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class180_sub7;
			if ((particleEngine == null || particleEngine.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
				particleEngine = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
			}
			if (particleEngine != null) {
				particleEngine.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.xVertices, class180_sub7_sub2.yVertices, class180_sub7_sub2.zVertices);
			}
		}
		aBoolean2913 = true;
	}

	final void animate(final int del) {
		if (!this.finishedAnimating) {
			delay += del;
			while_12_: do {
				do {
					if (seqType.delays[frame] >= delay) {
						break while_12_;
					}
					delay -= seqType.delays[frame];
					frame++;
				} while (frame < seqType.frames.length);
				this.finishedAnimating = true;
			} while (false);
			if (!this.finishedAnimating) {
				Class120_Sub12_Sub23.method1323(seqType, this.x, this.z, frame, false);
			}
		}
	}

	static final void method2312(final Throwable throwable, final String string) {
		try {
			String string_13_ = "";
			if (throwable != null) {
				string_13_ = Class32.method272(throwable);
			}
			if (string != null) {
				if (throwable != null) {
					string_13_ = new StringBuilder(string_13_).append(" | ").toString();
				}
				string_13_ = new StringBuilder(string_13_).append(string).toString();
			}
			Class120_Sub14_Sub13.method1531(string_13_);
			string_13_ = AnimatedLocation.replaceAll(string_13_, ":", "%3a");
			string_13_ = AnimatedLocation.replaceAll(string_13_, "@", "%40");
			string_13_ = AnimatedLocation.replaceAll(string_13_, "&", "%26");
			string_13_ = AnimatedLocation.replaceAll(string_13_, "#", "%23");
			if (Class120_Sub12_Sub18.errorSignlink.gameApplet != null) {
				final SignlinkNode signlinkNode = Class120_Sub12_Sub18.errorSignlink.method1969(
						new URL(Class120_Sub12_Sub18.errorSignlink.gameApplet.getCodeBase(), new StringBuilder("clienterror.ws?c=").append(DisplayModeInfo.revision).append("&u=").append(WaterfallShader.selfNameAsLong).append("&v1=").append(Signlink.javaVendor).append("&v2=").append(Signlink.javaVersion)
								.append("&e=").append(string_13_).toString()));
				while (signlinkNode.status == 0) {
					PacketBuffer.sleepWrapper(1L);
				}
				if (signlinkNode.status == 1) {
					final DataInputStream datainputstream = (DataInputStream) signlinkNode.value;
					datainputstream.read();
					datainputstream.close();
				}
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	private final AbstractModelRenderer method2313() {
		final SpotAnimType spotAnimType = SpotAnimType.list(myId);
		AbstractModelRenderer abstractModel;
		if (this.finishedAnimating) {
			abstractModel = spotAnimType.constructModel(-1, 0, -1);
		} else {
			abstractModel = spotAnimType.constructModel(-1, delay, frame);
		}
		if (abstractModel == null) {
			return null;
		}
		return abstractModel;
	}

	@Override
	final void method2266(final int i, final int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		if (!aBoolean2913) {
			final AbstractModelRenderer class180_sub7 = method2313();
			if (class180_sub7 == null) {
				return;
			}
			method2310(class180_sub7);
		}
		if (particleEngine != null) {
			particleEngine.method944(i, i_16_, i_18_, i_17_, i_19_);
		}
	}

	@Override
	final void render(final int i, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final long l, final int i_27_, final ParticleEngine class108_sub2) {
		final AbstractModelRenderer class180_sub7 = method2313();
		if (class180_sub7 != null) {
			method2310(class180_sub7);
			class180_sub7.render(i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, l, i_27_, particleEngine);
			maxY = class180_sub7.getMaxY();
		}
	}

	static final Class28 method2315(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null) {
			return null;
		}
		for (int id = 0; id < class120_sub18.anInt2638; id++) {
			final Class28 class28 = class120_sub18.aClass28Array2625[id];
			if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == x && class28.anInt184 == z) {
				return class28;
			}
		}
		return null;
	}

	@Override
	final int getMaxY() {
		return maxY;
	}

	SpotAnimation(final int id, final int l, final int x_, final int z_, final int y_, final int startDelay, final int startLoopCycle) {
		aBoolean2913 = false;
		delay = 0;
		this.finishedAnimating = false;
		frame = 0;
		this.level = l;
		myId = id;
		this.x = x_;
		this.z = z_;
		this.y = y_;
		this.startCycle = startDelay + startLoopCycle;
		final int animationId = SpotAnimType.list(myId).animationId;
		if (animationId != -1) {
			this.finishedAnimating = false;
			seqType = SeqType.list(animationId);
		} else {
			this.finishedAnimating = true;
		}
		if (this.startCycle == startLoopCycle) {
			Class120_Sub12_Sub23.method1323(seqType, this.x, this.z, frame, false);
		}
	}
}
