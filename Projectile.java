/* Class180_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Projectile extends SceneGraphNode {
	int endCycle;
	static int[] spriteXOffsets;
	private ParticleEngine aClass108_Sub2_2924;
	private int currentFrame = 0;
	private final int startX;
	private int anInt2927;
	private boolean aBoolean2928;
	int lockonIndex;
	private double aDouble2930;
	static ObjectCache aClass21_2931;
	private final int anInt2932;
	static int mouseClickToTileLevel = 0;
	int level;
	private double aDouble2935;
	private int nextFrame = -1;
	double aDouble2937;
	private boolean aBoolean2938;
	int startCycle;
	private final int spotAnimId;
	private SeqType seqType;
	private double aDouble2942;
	int yOff;
	int anInt2944;
	private int currentFrameDelay = 0;
	private double aDouble2946;
	private final int startY;
	private final int anInt2948;
	double aDouble2949;
	private double aDouble2950;
	private final int startZ;
	private int maxY;
	double aDouble2953;
	static JagexInterface clickedInventoryComponent;
	static int renderXWrapper;

	static {
		aClass21_2931 = new ObjectCache(5);
	}

	final void method2317(final int i) {
		this.aDouble2953 += aDouble2942 * i;
		aBoolean2938 = true;
		if (anInt2948 != -1) {
			this.aDouble2937 += i * (aDouble2930 * 0.5 * i) + aDouble2946 * i;
			aDouble2946 += aDouble2930 * i;
		} else {
			this.aDouble2937 += i * aDouble2946;
		}
		this.aDouble2949 += i * aDouble2935;
		this.anInt2944 = 0x7ff & 1024 + (int) (325.949 * Math.atan2(aDouble2935, aDouble2942));
		anInt2927 = 0x7ff & (int) (325.949 * Math.atan2(aDouble2946, aDouble2950));
		if (seqType != null) {
			currentFrameDelay += i;
			while (seqType.delays[currentFrame] < currentFrameDelay) {
				currentFrameDelay -= seqType.delays[currentFrame];
				currentFrame++;
				if (seqType.frames.length <= currentFrame) {
					currentFrame -= seqType.loop;
					if (currentFrame < 0 || currentFrame >= seqType.frames.length) {
						currentFrame = 0;
					}
				}
				nextFrame = currentFrame + 1;
				if (nextFrame >= seqType.frames.length) {
					nextFrame -= seqType.loop;
					if (nextFrame < 0 || seqType.frames.length <= nextFrame) {
						nextFrame = -1;
					}
				}
			}
		}
	}

	@Override
	final void render(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final long l, final int i_8_, final ParticleEngine class108_sub2) {
		final AbstractModelRenderer class180_sub7 = method2322();
		if (class180_sub7 != null) {
			method2320(class180_sub7);
			class180_sub7.render(i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, l, i_8_, aClass108_Sub2_2924);
			maxY = class180_sub7.getMaxY();
		}
	}

	static final boolean setBuildArea(final int buildArea) {
		if (AbstractSprite.lastSetBuildArea == buildArea) {
			return false;
		}
		//104, 120, 136, 168
		Class120_Sub2.anIntArrayArray2416 = new int[104][104];
		Class179.anIntArrayArray1774 = new int[104][104];
		Class120_Sub12_Sub36.dynamicMapData = new int[4][13][13];
		FileSystemRequest.entityCountOnTile = new int[104][104];
		for (int i = 0; i < 4; i++) {
			WallLocation.collisionMaps[i] = new CollisionMap(104, 104);
		}
		Class114.tileSettings = new byte[4][104][104];
		Class9.aByteArrayArrayArray70 = new byte[4][104][104];
		ClientScript.groundObjects = new Deque[4][104][104];
		if (HDToolkit.glEnabled) {
			LightManager.init(4, 104, 104);
			ShadowManager.init(104, 104);
			Identikit.chunksAtmosphere = new ChunkAtmosphere[13][13];
		}
		AbstractSprite.lastSetBuildArea = buildArea;
		return true;
	}

	final void method2319(final int destX, final int destY, final int destZ, final int currentCycle) {
		if (!aBoolean2938) {
			final double deltaX = destX - startX;
			final double deltaZ = destZ - startZ;
			final double dist = Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
			this.aDouble2949 = startX + anInt2932 * deltaX / dist;
			this.aDouble2937 = startY;
			this.aDouble2953 = startZ + anInt2932 * deltaZ / dist;
		}
		final double d = (this.endCycle + 1) - currentCycle;
		aDouble2935 = (-this.aDouble2949 + destX) / d;
		aDouble2942 = (-this.aDouble2953 + destZ) / d;
		aDouble2950 = Math.sqrt(aDouble2935 * aDouble2935 + aDouble2942 * aDouble2942);
		if (anInt2948 == -1) {
			aDouble2946 = (-this.aDouble2937 + destY) / d;
		} else {
			if (!aBoolean2938) {
				aDouble2946 = -aDouble2950 * Math.tan(anInt2948 * 0.02454369);
			}
			aDouble2930 = 2.0 * (-(aDouble2946 * d) + (-this.aDouble2937 + destY)) / (d * d);
		}
	}

	private final void method2320(final AbstractModelRenderer class180_sub7) {
		if (HDToolkit.glEnabled) {
			final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class180_sub7;
			if ((aClass108_Sub2_2924 == null || aClass108_Sub2_2924.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
				aClass108_Sub2_2924 = new ParticleEngine(Class101_Sub2.clientClock, 1, 1);
			}
			if (aClass108_Sub2_2924 != null) {
				aClass108_Sub2_2924.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.xVertices, class180_sub7_sub2.yVertices, class180_sub7_sub2.zVertices);
			}
		} else {
			final LDModelRenderer class180_sub7_sub1 = (LDModelRenderer) class180_sub7;
			if ((aClass108_Sub2_2924 == null || aClass108_Sub2_2924.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
				aClass108_Sub2_2924 = new ParticleEngine(Class101_Sub2.clientClock, 1, 1);
			}
			if (aClass108_Sub2_2924 != null) {
				aClass108_Sub2_2924.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
			}
		}
		aBoolean2928 = true;
	}

	@Override
	final int getMaxY() {
		return maxY;
	}

	private final AbstractModelRenderer method2322() {
		final SpotAnimType spotAnimType = SpotAnimType.list(spotAnimId);
		final AbstractModelRenderer class180_sub7_17_ = spotAnimType.constructModel(nextFrame, currentFrameDelay, currentFrame);
		if (class180_sub7_17_ == null) {
			return null;
		}
		class180_sub7_17_.rotateX(anInt2927);
		return class180_sub7_17_;
	}

	Projectile(final int spotAnimationid, final int level, final int x, final int z, final int y, final int cycle1, final int cycle2, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		aBoolean2938 = false;
		aBoolean2928 = false;
		maxY = -32768;
		startZ = z;
		startY = y;
		aBoolean2938 = false;
		startX = x;
		this.startCycle = cycle1;
		anInt2932 = i_25_;
		this.level = level;
		this.endCycle = cycle2;
		this.lockonIndex = i_26_;
		spotAnimId = spotAnimationid;
		anInt2948 = i_24_;
		this.yOff = i_27_;
		final int animationid = SpotAnimType.list(spotAnimId).animationId;
		if (animationid == -1) {
			seqType = null;
		} else {
			seqType = SeqType.list(animationid);
		}
	}

	@Override
	final void preRender(final int rotation, final int i_29_, final int i_31_, final int i_30_, final int i_32_) {
		if (!aBoolean2928) {
			final AbstractModelRenderer class180_sub7 = method2322();
			if (class180_sub7 == null) {
				return;
			}
			method2320(class180_sub7);
		}
		if (aClass108_Sub2_2924 != null) {
			aClass108_Sub2_2924.method944(rotation, i_29_, i_31_, i_30_, i_32_);
		}
	}
}
