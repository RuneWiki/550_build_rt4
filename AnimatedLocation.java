/* Class180_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AnimatedLocation extends SceneGraphNode {
	private int anInt3048;
	private final int anInt3049;
	private int anInt3050;
	private final int anInt3051;
	private int currentFrame;
	private final int anInt3053;
	private boolean aBoolean3054 = false;
	private final int anInt3055;
	private int nextFrame;
	private ParticleEngine aClass108_Sub2_3058;
	private int anInt3059;
	private final int anInt3060;
	private int anInt3061;
	private boolean aBoolean3063;
	private final int locId;
	private LDIndexedSprite aClass107_Sub1_3065;
	private boolean aBoolean3066;
	private int anInt3067;
	private int anInt3068;
	private final int anInt3069;
	private SeqType seqType;
	private int anInt3072;
	static AbstractSprite[] hintHeadIconsSprites;
	static int anInt3074 = 0;
	static int[] anIntArray3075 = new int[2];
	static Class188[] aClass188Array3076;

	@Override
	final void method2266(final int i, final int i_0_, final int i_2_, final int i_1_, final int i_3_) {
		SceneGraphNode sceneGraphNode = null;
		if (HDToolkit.glEnabled) {
			sceneGraphNode = method2350(true);
		} else {
			method2353(i_3_, i_2_);
		}
		if (!aBoolean3063) {
			if (sceneGraphNode == null) {
				sceneGraphNode = method2357();
			}
			if (sceneGraphNode == null) {
				return;
			}
			method2359(sceneGraphNode);
		}
		if (aClass108_Sub2_3058 != null) {
			aClass108_Sub2_3058.method944(i, i_0_, i_2_, i_1_, i_3_);
		}
	}

	@Override
	final void render(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final long l, final int i_11_, final ParticleEngine class108_sub2) {
		final SceneGraphNode sceneGraphNode = method2357();
		if (sceneGraphNode != null) {
			method2359(sceneGraphNode);
			sceneGraphNode.render(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, l, i_11_, aClass108_Sub2_3058);
		}
	}

	private final SceneGraphNode method2350(final boolean bool) {
		final boolean bool_12_ = OverridedJInterface.activeTileHeightMap != Class120_Sub12_Sub33.surfaceTileHeightMap;
		LocType locType = LocType.list(locId);
		if (locType.transmogrificationIds != null) {
			locType = locType.handleVarp();
		}
		if (locType == null) {
			if (HDToolkit.glEnabled && !bool_12_) {
				method2354();
			}
			anInt3072 = currentFrame;
			anInt3050 = -1;
			return null;
		}
		if (!aBoolean3054 && locType.myId != anInt3050) {
			method2352(-1);
		}
		final int i_13_ = 0x3 & anInt3055;
		int i_14_;
		int i_15_;
		if (i_13_ != 1 && i_13_ != 3) {
			i_14_ = locType.sizeX;
			i_15_ = locType.sizeZ;
		} else {
			i_14_ = locType.sizeZ;
			i_15_ = locType.sizeX;
		}
		final int i_16_ = (i_15_ >> 1) + anInt3069;
		final int i_17_ = anInt3049 + (1 + i_14_ >> 1);
		final int i_18_ = anInt3049 + (i_14_ >> 1);
		final int i_19_ = anInt3069 - -(1 + i_15_ >> 1);
		method2353(128 * i_16_, 128 * i_18_);
		final boolean bool_20_ = !bool_12_ && locType.aBoolean1823 && (anInt3050 != locType.myId || (currentFrame != anInt3072 || seqType != null && (seqType.aBoolean340 || Class164.forceTweenEnabled) && currentFrame != nextFrame) && Class74.sceneryShadowsType >= 2);
		if (bool && !bool_20_) {
			anInt3072 = currentFrame;
			anInt3050 = locType.myId;
			return null;
		}
		int[][] is = null;
		final int i_21_ = (anInt3049 << 7) + (i_14_ << 6);
		final int i_22_ = (anInt3069 << 7) + (i_15_ << 6);
		final int[][] is_23_ = OverridedJInterface.activeTileHeightMap[anInt3060];
		if (!bool_12_) {
			if (anInt3060 < 3) {
				is = OverridedJInterface.activeTileHeightMap[anInt3060 + 1];
			}
		} else {
			is = Class120_Sub12_Sub33.surfaceTileHeightMap[0];
		}
		final int i_24_ = is_23_[i_18_][i_16_] + is_23_[i_17_][i_16_] - -is_23_[i_18_][i_19_] - -is_23_[i_17_][i_19_] >> 2;
		if (HDToolkit.glEnabled && bool_20_) {
			ShadowManager.method387(aClass107_Sub1_3065, anInt3059, anInt3061, anInt3068);
		}
		final boolean bool_25_ = aClass107_Sub1_3065 == null;
		Class88 class88;
		if (seqType != null) {
			class88 = locType.method2461(i_21_, is_23_, currentFrame, i_22_, i_24_, bool_20_, anInt3055, anInt3051, anInt3048, is, seqType, bool_25_ ? Class31.aClass107_Sub1_246 : aClass107_Sub1_3065, nextFrame);
		} else {
			class88 = locType.method2453(i_21_, false, anInt3051, i_24_, is_23_, is, bool_20_, anInt3055, i_22_, bool_25_ ? Class31.aClass107_Sub1_246 : aClass107_Sub1_3065);
		}
		if (class88 == null) {
			anInt3072 = currentFrame;
			anInt3050 = locType.myId;
			return null;
		}
		if (HDToolkit.glEnabled && bool_20_) {
			int averageY = 0;
			if (bool_25_) {
				Class31.aClass107_Sub1_246 = class88.aClass107_Sub1_830;
			}
			if (anInt3060 != 0) {
				final int[][] is_27_ = OverridedJInterface.activeTileHeightMap[0];
				averageY = i_24_ + -(is_27_[i_18_][i_16_] - -is_27_[i_17_][i_16_] - -is_27_[i_18_][i_19_] - -is_27_[i_17_][i_19_] >> 2);
			}
			final LDIndexedSprite class107_sub1 = class88.aClass107_Sub1_830;
			if (aBoolean3066 && ShadowManager.method391(class107_sub1, i_21_, averageY, i_22_)) {
				aBoolean3066 = false;
			}
			if (!aBoolean3066) {
				ShadowManager.method389(class107_sub1, i_21_, averageY, i_22_);
				if (bool_25_) {
					Class31.aClass107_Sub1_246 = null;
				}
				anInt3068 = i_22_;
				aClass107_Sub1_3065 = class107_sub1;
				anInt3061 = averageY;
				anInt3059 = i_21_;
			}
		}
		anInt3050 = locType.myId;
		anInt3072 = currentFrame;
		return class88.aClass180_826;
	}

	private final void method2352(final int i_28_) {
		int animationId = i_28_;
		boolean randomizeFrame = false;
		if (animationId == -1) {
			LocType locType = LocType.list(locId);
			LocType class184_30_ = locType;
			if (locType.transmogrificationIds != null) {
				locType = locType.handleVarp();
			}
			if (locType == null) {
				return;
			}
			if (locType == class184_30_) {
				class184_30_ = null;
			}
			if (locType.randomAnimationIds != null) {
				if (seqType != null && locType.method2468(seqType.myId)) {
					return;
				}
				animationId = locType.getRandomAnimationId();
				if (anInt3050 != locType.myId) {
					randomizeFrame = locType.aBoolean1864;
				}
			} else if (locType.animationId == -1) {
				if (class184_30_ == null || class184_30_.randomAnimationIds == null) {
					if (class184_30_ != null && class184_30_.animationId != -1 && anInt3050 != class184_30_.myId) {
						randomizeFrame = class184_30_.aBoolean1864;
						animationId = class184_30_.animationId;
					}
				} else {
					if (seqType != null && class184_30_.method2468(seqType.myId)) {
						return;
					}
					animationId = class184_30_.getRandomAnimationId();
					if (class184_30_.myId != anInt3050) {
						randomizeFrame = class184_30_.aBoolean1864;
					}
				}
			} else if (anInt3050 != locType.myId) {
				randomizeFrame = locType.aBoolean1864;
				animationId = locType.animationId;
			}
		}
		if (animationId == -1) {
			seqType = null;
		} else {
			if (seqType != null && seqType.myId == animationId) {
				if (seqType.resetInPlay == 0) {
					return;
				}
			} else {
				seqType = SeqType.list(animationId);
			}
			if (randomizeFrame) {
				currentFrame = (int) (Math.random() * seqType.frames.length);
				anInt3048 = 1 + (int) (seqType.delays[currentFrame] * Math.random());
			} else {
				currentFrame = 0;
				anInt3048 = 1;
			}
			nextFrame = currentFrame + 1;
			if (nextFrame < 0 || nextFrame >= seqType.frames.length) {
				nextFrame = -1;
			}
			anInt3067 = Class101_Sub2.loopCycle - anInt3048;
		}
	}

	private final void method2353(final int i, final int i_32_) {
		int i_33_;
		while_11_: for (;;) {
			if (seqType == null) {
				if (aBoolean3054) {
					return;
				}
				method2352(-1);
				if (seqType == null) {
					return;
				}
			}
			i_33_ = Class101_Sub2.loopCycle - anInt3067;
			if (i_33_ > 100 && seqType.loop > 0) {
				int i_34_;
				for (i_34_ = -seqType.loop + seqType.frames.length; currentFrame < i_34_ && seqType.delays[currentFrame] < i_33_; currentFrame++) {
					i_33_ -= seqType.delays[currentFrame];
				}
				if (currentFrame >= i_34_) {
					int i_35_ = 0;
					for (int i_36_ = i_34_; seqType.frames.length > i_36_; i_36_++) {
						i_35_ += seqType.delays[i_36_];
					}
					i_33_ %= i_35_;
				}
				nextFrame = currentFrame - -1;
				if (seqType.frames.length <= nextFrame) {
					nextFrame -= seqType.loop;
					if (nextFrame < 0 || nextFrame >= seqType.frames.length) {
						nextFrame = -1;
					}
				}
			}
			for (;;) {
				if (seqType.delays[currentFrame] >= i_33_) {
					break while_11_;
				}
				Class120_Sub12_Sub23.method1323(seqType, i_32_, i, currentFrame, false);
				i_33_ -= seqType.delays[currentFrame];
				currentFrame++;
				if (seqType.frames.length <= currentFrame) {
					currentFrame -= seqType.loop;
					if (currentFrame < 0 || seqType.frames.length <= currentFrame) {
						seqType = null;
						break;
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
		anInt3048 = i_33_;
		anInt3067 = Class101_Sub2.loopCycle - i_33_;
	}

	final void method2354() {
		if (aClass107_Sub1_3065 != null) {
			ShadowManager.method387(aClass107_Sub1_3065, anInt3059, anInt3061, anInt3068);
			aClass107_Sub1_3065 = null;
		}
	}

	static final void clearAmbientSounds(final boolean entityToo) {
		for (AmbientSound locationAmbientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getFront(); locationAmbientSound != null; locationAmbientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getNext()) {
			if (locationAmbientSound.aClass120_Sub30_Sub4_2488 != null) {
				Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(locationAmbientSound.aClass120_Sub30_Sub4_2488);
				locationAmbientSound.aClass120_Sub30_Sub4_2488 = null;
			}
			if (locationAmbientSound.aClass120_Sub30_Sub4_2478 != null) {
				Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(locationAmbientSound.aClass120_Sub30_Sub4_2478);
				locationAmbientSound.aClass120_Sub30_Sub4_2478 = null;
			}
			locationAmbientSound.unlink();
		}
		if (entityToo) {
			for (AmbientSound npcAmbientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); npcAmbientSound != null; npcAmbientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
				if (npcAmbientSound.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(npcAmbientSound.aClass120_Sub30_Sub4_2488);
					npcAmbientSound.aClass120_Sub30_Sub4_2488 = null;
				}
				npcAmbientSound.unlink();
			}
			for (AmbientSound playerAmbientSound = (AmbientSound) Npc.playerAmbientSounds.getFirst(); playerAmbientSound != null; playerAmbientSound = (AmbientSound) Npc.playerAmbientSounds.getNext()) {
				if (playerAmbientSound.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(playerAmbientSound.aClass120_Sub30_Sub4_2488);
					playerAmbientSound.aClass120_Sub30_Sub4_2488 = null;
				}
				playerAmbientSound.unlink();
			}
		}
	}

	static final ObjectPile resetObjectPile(final int level, final int x, final int z) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		final ObjectPile objectPile = groundTile.objectPile;
		groundTile.objectPile = null;
		return objectPile;
	}

	final SceneGraphNode method2357() {
		return method2350(false);
	}

	static final String replaceAll(String text, final String from, final String to) {
		for (int toReplaceIndex = text.indexOf(from); toReplaceIndex != -1; toReplaceIndex = text.indexOf(from, toReplaceIndex + to.length())) {
			text = new StringBuilder(text.substring(0, toReplaceIndex)).append(to).append(text.substring(toReplaceIndex + from.length())).toString();
		}
		return text;
	}

	@Override
	final int getMaxY() {
		return anInt3053;
	}

	private final void method2359(final SceneGraphNode sceneGraphNode) {
		if (!HDToolkit.glEnabled) {
			final LDModelRenderer class180_sub7_sub1 = (LDModelRenderer) sceneGraphNode;
			if ((aClass108_Sub2_3058 == null || aClass108_Sub2_3058.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
				LocType locType = LocType.list(locId);
				if (locType.transmogrificationIds != null) {
					locType = locType.handleVarp();
				}
				if (locType != null) {
					aClass108_Sub2_3058 = new ParticleEngine(Class101_Sub2.loopCycle, locType.sizeX, locType.sizeZ);
				}
			}
			if (aClass108_Sub2_3058 != null) {
				aClass108_Sub2_3058.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
			}
		} else {
			final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) sceneGraphNode;
			if ((aClass108_Sub2_3058 == null || aClass108_Sub2_3058.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
				LocType locType = LocType.list(locId);
				if (locType.transmogrificationIds != null) {
					locType = locType.handleVarp();
				}
				if (locType != null) {
					aClass108_Sub2_3058 = new ParticleEngine(Class101_Sub2.loopCycle, locType.sizeX, locType.sizeZ);
				}
			}
			if (aClass108_Sub2_3058 != null) {
				aClass108_Sub2_3058.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.xVertices, class180_sub7_sub2.yVertices, class180_sub7_sub2.zVertices);
			}
		}
		aBoolean3063 = true;
	}

	@Override
	protected final void finalize() {
		if (aClass108_Sub2_3058 != null) {
			aClass108_Sub2_3058.method953();
		}
	}

	AnimatedLocation(final int i, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final boolean bool, final SceneGraphNode sceneGraphNode) {
		anInt3053 = -32768;
		anInt3059 = 0;
		anInt3061 = 0;
		anInt3050 = -1;
		aBoolean3063 = false;
		aBoolean3066 = true;
		aClass107_Sub1_3065 = null;
		anInt3072 = -1;
		anInt3068 = 0;
		anInt3051 = i_42_;
		anInt3049 = i_45_;
		anInt3069 = i_46_;
		anInt3060 = i_44_;
		anInt3055 = i_43_;
		locId = i;
		if (sceneGraphNode != null) {
			aBoolean3054 = true;
			if (!(sceneGraphNode instanceof AnimatedLocation)) {
				if (HDToolkit.glEnabled) {
					LocType locType = LocType.list(locId);
					if (locType.transmogrificationIds != null) {
						locType = locType.handleVarp();
					}
					if (locType != null) {
						Buffer.method1094(locType, anInt3049, 0, anInt3055, anInt3060, 0, anInt3069, anInt3051);
					}
				}
			} else {
				final AnimatedLocation class180_sub6_48_ = (AnimatedLocation) sceneGraphNode;
				if (HDToolkit.glEnabled) {
					class180_sub6_48_.method2354();
				}
				anInt3048 = class180_sub6_48_.anInt3048;
				currentFrame = class180_sub6_48_.currentFrame;
				anInt3067 = class180_sub6_48_.anInt3067;
				nextFrame = class180_sub6_48_.nextFrame;
				seqType = class180_sub6_48_.seqType;
			}
		}
		if (aBoolean3054) {
			method2352(i_47_);
		}
		if (HDToolkit.glEnabled && sceneGraphNode != null) {
			method2350(true);
		}
	}
}
