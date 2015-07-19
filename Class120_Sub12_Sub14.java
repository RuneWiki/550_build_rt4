/* Class120_Sub12_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub14 extends Class120_Sub12 {
	private Class101[] aClass101Array3237;
	static int[] anIntArray3239;
	static int anInt3240 = 0;

	static final void tbrefresh() {
		if (!Class31.advertSuppressed && AbstractIndexedSprite.modeWhere != 2) {
			try {
				JSHelper.call(Class179.clientInstance, "tbrefresh");
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			method1272(this.aClass30_2563.method257());
		}
		return is_1_;
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_3_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int i_4_ = Class120_Sub12_Sub7.anInt3178;
			final int i_5_ = Class120_Sub12_Sub2.anInt3145;
			final int[][] is_6_ = new int[i_5_][i_4_];
			final int[][][] is_7_ = this.aClass109_2559.method973();
			method1272(is_6_);
			for (int i_8_ = 0; i_8_ < Class120_Sub12_Sub2.anInt3145; i_8_++) {
				final int[][] is_9_ = is_7_[i_8_];
				final int[] is_10_ = is_9_[1];
				final int[] is_11_ = is_9_[2];
				final int[] is_12_ = is_6_[i_8_];
				final int[] is_13_ = is_9_[0];
				for (int i_14_ = 0; i_14_ < Class120_Sub12_Sub7.anInt3178; i_14_++) {
					final int i_15_ = is_12_[i_14_];
					is_11_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ << 4, 4080);
					is_10_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ >> 4, 4080);
					is_13_[i_14_] = Class120_Sub12_Sub3.method1207(i_15_ >> 12, 4080);
				}
			}
		}
		return is_3_;
	}

	static final void renderPlayers(final int size) {
		int playerCount = FileSystemWorker.localPlayerCount;
		if (size == 0) {
			playerCount = 1;
		}
		for (int id = 0; id < playerCount; id++) {
			Player player;
			if (size == 0) {
				player = TileParticleQueue.selfPlayer;
			} else {
				player = Class118.playersList[Class112.playerIndices[id]];
			}
			if (player != null && player.isVisible()) {
				final int playerSize = player.getSize();
				if (size == 0 || size == playerSize) {
					if (playerSize != 1) {
						if (((playerSize & 0x1) != 0 || (player.x & 0x7f) == 0 && (player.z & 0x7f) == 0) && ((0x1 & playerSize) != 1 || (player.x & 0x7f) == 64 && (player.z & 0x7f) == 64)) {
							int startRenderX = player.x - playerSize * 64 >> 7;
							int startRenderZ = player.z - playerSize * 64 >> 7;
							int endRenderX = startRenderX + player.getSize();
							int endRenderZ = startRenderZ + player.getSize();
							if (startRenderX < 0) {
								startRenderX = 0;
							}
							if (endRenderX > 104) {
								endRenderX = 104;
							}
							if (startRenderZ < 0) {
								startRenderZ = 0;
							}
							if (endRenderZ > 104) {
								endRenderZ = 104;
							}
							for (int x = startRenderX; x < endRenderX; x++) {
								for (int z = startRenderZ; z < endRenderZ; z++) {
									FileSystemRequest.entityCountOnTile[x][z]++;
								}
							}
						}
					} else if ((player.x & 0x7f) == 64 && (player.z & 0x7f) == 64) {
						final int renderX = player.x >> 7;
						final int renderZ = player.z >> 7;
						if (renderX >= 0 && renderX < 104 && renderZ >= 0 && renderZ < 104) {
							FileSystemRequest.entityCountOnTile[renderX][renderZ]++;
						}
					}
				}
			}
		}
		for (int id = 0; id < playerCount; id++) {
			Player player;
			long uid;
			if (size == 0) {
				uid = 8791798054912L;
				player = TileParticleQueue.selfPlayer;
			} else {
				player = Class118.playersList[Class112.playerIndices[id]];
				uid = (long) Class112.playerIndices[id] << 32;
			}
			if (player != null && player.isVisible()) {
				final int playerSize = player.getSize();
				if (size == 0 || size == playerSize) {
					player.playerLimitReached = false;
					player.aBoolean2992 = true;
					if ((Class120_Sub12_Sub10.manyIdleAnimations && FileSystemWorker.localPlayerCount > 200 || FileSystemWorker.localPlayerCount > 50) && size != 0 && player.idleAnimId == player.getEntityRenderData().idleAnimationId) {
						player.playerLimitReached = true;
					}
					if (playerSize == 1) {
						if ((player.x & 0x7f) == 64 && (player.z & 0x7f) == 64) {
							final int renderX = player.x >> 7;
							final int renderZ = player.z >> 7;
							if (renderX < 0 || renderX >= 104 || renderZ < 0 || renderZ >= 104) {
								continue;
							}
							if (FileSystemRequest.entityCountOnTile[renderX][renderZ] > 1) {
								FileSystemRequest.entityCountOnTile[renderX][renderZ]--;
								continue;
							}
						}
					} else if ((0x1 & playerSize) == 0 && (0x7f & player.x) == 0 && (0x7f & player.z) == 0 || (0x1 & playerSize) == 1 && (player.x & 0x7f) == 64 && (player.z & 0x7f) == 0) {
						int startRenderX = player.z - playerSize * 64 >> 7;
						int startRenderZ = player.x - playerSize * 64 >> 7;
						int endRenderX = playerSize + startRenderX;
						int endRenderZ = playerSize + startRenderZ;
						if (startRenderX < 0) {
							startRenderX = 0;
						}
						if (endRenderX > 104) {
							endRenderX = 104;
						}
						if (startRenderZ < 0) {
							startRenderZ = 0;
						}
						if (endRenderZ > 104) {
							endRenderZ = 104;
						}
						boolean hasEntityOnTop = true;
						for (int x = startRenderZ; x < endRenderZ; x++) {
							for (int z = startRenderX; z < endRenderX; z++) {
								if (FileSystemRequest.entityCountOnTile[x][z] <= 1) {
									hasEntityOnTop = false;
									break;
								}
							}
						}
						if (hasEntityOnTop) {
							for (int x = startRenderZ; x < endRenderZ; x++) {
								for (int z = startRenderX; z < endRenderX; z++) {
									FileSystemRequest.entityCountOnTile[x][z]--;
								}
							}
							continue;
						}
					}
					if (player.anObject3047 == null || Class101_Sub2.loopCycle < player.anInt3042 || player.anInt3012 <= Class101_Sub2.loopCycle) {
						player.aBoolean2992 = false;
						player.y = Class22.getTileHeight(player.x, player.z, Class173.gameLevel);
						Class120_Sub12_Sub5.method1218(Class173.gameLevel, player.x, player.z, player.y, 64 * (playerSize - 1) - -60, player, player.faceDegrees, uid, player.aBoolean3002);
					} else {
						player.playerLimitReached = false;
						player.aBoolean2992 = false;
						player.y = Class22.getTileHeight(player.x, player.z, Class173.gameLevel);
						Normal.method230(Class173.gameLevel, player.x, player.z, player.y, player, player.faceDegrees, uid, player.anInt3043, player.anInt3020, player.anInt3041, player.anInt3038);
					}
				}
			}
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_40_) {
		if (i_40_ == 0) {
			aClass101Array3237 = new Class101[buffer.getUByte()];
			while_200_: for (int i_41_ = 0; i_41_ < aClass101Array3237.length; i_41_++) {
				final int i_42_ = buffer.getUByte();
				final int i_43_ = i_42_;
				while_198_: do {
					do {
						if (i_43_ != 0) {
							if (i_43_ != 1) {
								if (i_43_ != 2) {
									if (i_43_ != 3) {
										continue while_200_;
									}
								} else {
									break;
								}
								break while_198_;
							}
						} else {
							aClass101Array3237[i_41_] = Class120_Sub12_Sub29.method1357(buffer);
							continue while_200_;
						}
						aClass101Array3237[i_41_] = Class120_Sub12_Sub30.method1362(buffer);
						continue while_200_;
					} while (false);
					aClass101Array3237[i_41_] = Class120_Sub12_Sub29.method1356(buffer);
					continue while_200_;
				} while (false);
				aClass101Array3237[i_41_] = Class187.method2475(buffer);
			}
		} else if (i_40_ == 1) {
			this.aBoolean2558 = buffer.getUByte() == 1;
		}
	}

	public Class120_Sub12_Sub14() {
		super(0, true);
	}

	static final HDTile[] constructUnderlayHDTiles(final int[][][] dynamicMapTiles, final byte[][] overlayIds, final float[][] fs, final int[][] is_45_, final int[][] is_46_, final float[][] fs_47_, final byte[][] is_48_, final int[][] is_49_, final byte[][] is_50_, final int i, final float[][] fs_51_, final int[][] is_52_, final byte[][][] is_53_, final byte[][] underlayIds, final int[][] heightMap) {
		final int[][] textureInformation = new int[105][105];
		for (int x = 1; x <= 103; x++) {
			for (int z = 1; z <= 103; z++) {
				int tileRotation = 0;
				if (dynamicMapTiles != null) {
					final int bitPacked = dynamicMapTiles[i][x >> 3][z >> 3];
					tileRotation = bitPacked >> 1 & 0x3;
				}
				int underlayId;
				if (tileRotation == 0) {
					underlayId = underlayIds[x][z];
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x][z - 1];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z - 1];
					}
				} else if (tileRotation == 1) {
					underlayId = underlayIds[x][z];
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x][z - 1];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z - 1];
					}
				} else if (tileRotation == 2) {
					underlayId = underlayIds[x - 1][z - 1];
					if (underlayId == 0) {
						underlayId = underlayIds[x][z - 1];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x][z];
					}
				} else {
					underlayId = underlayIds[x - 1][z];
					if (underlayId == 0) {
						underlayId = underlayIds[x - 1][z - 1];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x][z];
					}
					if (underlayId == 0) {
						underlayId = underlayIds[x][z - 1];
					}
				}
				if (underlayId != 0) {
					final UnderlayType overlayType = UnderlayType.list((underlayId & 0xff) - 1);
					textureInformation[x][z] = (overlayType.textureId + 1 << 16) + overlayType.textureSize;
				}
			}
		}
		final Hashtable hashtable = new Hashtable(128);
		for (int x = 1; x <= 102; x++) {
			for (int z = 1; z <= 102; z++) {
				if (underlayIds[x][z] != 0) {
					int[] is_64_;
					if (overlayIds[x][z] == 0) {
						is_64_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
					} else {
						is_64_ = InterfaceChangeNode.anIntArrayArray3488[is_48_[x][z]];
						if (is_64_.length == 0) {
							continue;
						}
					}
					int i_67_ = 0;
					if (is_45_ != null) {
						i_67_ = is_45_[x][z] & 0xffffff;
					}
					final int textInf = textureInformation[x][z];
					final int eastTextInf = textureInformation[x + 1][z];
					final int northTextInf = textureInformation[x][z + 1];
					final int northEastTextInf = textureInformation[x + 1][z + 1];
					final long l = (long) textInf << 32 | i_67_;
					final long l_69_ = (long) eastTextInf << 32 | i_67_;
					final long l_71_ = (long) northTextInf << 32 | i_67_;
					final long l_72_ = (long) northEastTextInf << 32 | i_67_;
					final int i_73_ = is_64_.length / 2;
					HDTile class120_sub9 = (HDTile) hashtable.get(l);
					if (class120_sub9 == null) {
						class120_sub9 = new HDTile((textInf >> 16) - 1, textInf & 0xffff, false, is_52_ != null, i_67_);
						hashtable.put(class120_sub9, l);
					}
					class120_sub9.anInt2507 += i_73_;
					class120_sub9.anInt2519++;
					if (l_69_ != l) {
						class120_sub9 = (HDTile) hashtable.get(l_69_);
						if (class120_sub9 == null) {
							class120_sub9 = new HDTile(-1 + (eastTextInf >> 16), 0xffff & eastTextInf, false, is_52_ != null, i_67_);
							hashtable.put(class120_sub9, l_69_);
						}
						class120_sub9.anInt2507 += i_73_;
						class120_sub9.anInt2519++;
					}
					if (l_72_ != l && l_72_ != l_69_) {
						class120_sub9 = (HDTile) hashtable.get(l_72_);
						if (class120_sub9 == null) {
							class120_sub9 = new HDTile(-1 + (northEastTextInf >> 16), northEastTextInf & 0xffff, false, is_52_ != null, i_67_);
							hashtable.put(class120_sub9, l_72_);
						}
						class120_sub9.anInt2519++;
						class120_sub9.anInt2507 += i_73_;
					}
					if (l != l_71_ && l_69_ != l_71_ && l_71_ != l_72_) {
						class120_sub9 = (HDTile) hashtable.get(l_71_);
						if (class120_sub9 == null) {
							class120_sub9 = new HDTile((northTextInf >> 16) + -1, 0xffff & northTextInf, false, is_52_ != null, i_67_);
							hashtable.put(class120_sub9, l_71_);
						}
						class120_sub9.anInt2507 += i_73_;
						class120_sub9.anInt2519++;
					}
				}
			}
		}
		for (HDTile class120_sub9 = (HDTile) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (HDTile) hashtable.getNext()) {
			class120_sub9.method1167();
		}
		for (int i_74_ = 1; i_74_ <= 102; i_74_++) {
			for (int i_75_ = 1; i_75_ <= 102; i_75_++) {
				final int i_76_ = underlayIds[i_74_][i_75_];
				if (i_76_ != 0) {
					int i_77_ = 0;
					int i_78_;
					if ((is_53_[i][i_74_][i_75_] & 0x8) == 0) {
						if ((is_53_[1][i_74_][i_75_] & 0x2) != 2 || i <= 0) {
							i_78_ = i;
						} else {
							i_78_ = i - 1;
						}
					} else {
						i_78_ = 0;
					}
					int i_79_ = 128;
					if (is_45_ != null) {
						i_77_ = is_45_[i_74_][i_75_] & 0xffffff;
						i_79_ = is_45_[i_74_][i_75_] >>> 24 << 3;
					}
					boolean[] bools = null;
					int[] is_80_;
					byte i_81_;
					if (overlayIds[i_74_][i_75_] == 0) {
						int i_82_ = 0;
						is_80_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
						i_82_ = i_82_ + (underlayIds[i_74_ + -1][i_75_ - 1] == i_76_ ? 1 : -1);
						int i_83_ = 0;
						int i_84_ = 0;
						i_84_ = i_84_ + (i_76_ == underlayIds[i_74_ + 1][i_75_ - 1] ? 1 : -1);
						int i_85_ = 0;
						i_85_ = i_85_ + (underlayIds[i_74_ - 1][1 + i_75_] != i_76_ ? -1 : 1);
						if (underlayIds[i_74_][-1 + i_75_] == i_76_) {
							i_82_++;
							i_84_++;
						} else {
							i_84_--;
							i_82_--;
						}
						i_83_ = i_83_ + (underlayIds[i_74_ + 1][i_75_ - -1] == i_76_ ? 1 : -1);
						if (i_76_ == underlayIds[i_74_ + 1][i_75_]) {
							i_84_++;
							i_83_++;
						} else {
							i_84_--;
							i_83_--;
						}
						if (underlayIds[i_74_][i_75_ - -1] == i_76_) {
							i_83_++;
							i_85_++;
						} else {
							i_85_--;
							i_83_--;
						}
						if (i_76_ == underlayIds[-1 + i_74_][i_75_]) {
							i_85_++;
							i_82_++;
						} else {
							i_85_--;
							i_82_--;
						}
						int i_86_ = -i_83_ + i_82_;
						int i_87_ = -i_85_ + i_84_;
						if (i_87_ < 0) {
							i_87_ = -i_87_;
						}
						if (i_86_ < 0) {
							i_86_ = -i_86_;
						}
						i_81_ = (byte) (i_86_ >= i_87_ ? 0 : 1);
						is_50_[i_74_][i_75_] = i_81_;
					} else {
						is_80_ = InterfaceChangeNode.anIntArrayArray3488[is_48_[i_74_][i_75_]];
						i_81_ = is_50_[i_74_][i_75_];
						bools = Class92.aBooleanArrayArray865[is_48_[i_74_][i_75_]];
						if (is_80_.length == 0) {
							continue;
						}
					}
					final int i_88_ = textureInformation[i_74_][i_75_];
					final int i_89_ = textureInformation[i_74_ + 1][i_75_];
					final int i_90_ = textureInformation[i_74_ + 1][i_75_ + 1];
					final int i_91_ = textureInformation[i_74_][i_75_ + 1];
					final long l = i_77_ | (long) i_88_ << 32;
					final long l_92_ = i_77_ | (long) i_90_ << 32;
					final long l_93_ = (long) i_91_ << 32 | i_77_;
					final long l_94_ = i_77_ | (long) i_89_ << 32;
					final int i_95_ = is_46_[i_74_][i_75_];
					final int i_96_ = is_46_[i_74_ - -1][i_75_];
					final int i_97_ = is_46_[1 + i_74_][1 + i_75_];
					final int i_98_ = is_49_[i_74_][i_75_];
					final int i_99_ = is_46_[i_74_][1 + i_75_];
					final int i_100_ = is_49_[1 + i_74_][i_75_];
					final int i_101_ = is_49_[i_74_ + 1][i_75_ + 1];
					final int i_102_ = is_49_[i_74_][1 + i_75_];
					final int i_103_ = (i_88_ >> 16) + -1;
					final int i_104_ = (i_91_ >> 16) + -1;
					final int i_105_ = (i_90_ >> 16) - 1;
					HDTile class120_sub9 = (HDTile) hashtable.get(l);
					final int i_106_ = -1 + (i_89_ >> 16);
					Class96.method786(i_88_ <= i_91_, i_75_, i_88_ <= i_89_, fs_47_, fs_51_, class120_sub9, heightMap, FileSystem.method443(i_102_, i_103_, i_99_), FileSystem.method443(i_101_, i_103_, i_97_), i_81_, i_78_, i_88_ <= i_90_, i_79_, fs, FileSystem.method443(i_100_, i_103_, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_103_, i_95_), is_80_, i_88_ <= i_88_);
					if (l_94_ != l) {
						class120_sub9 = (HDTile) hashtable.get(l_94_);
						Class96.method786(i_91_ >= i_89_, i_75_, i_89_ >= i_89_, fs_47_, fs_51_, class120_sub9, heightMap, FileSystem.method443(i_102_, i_106_, i_99_), FileSystem.method443(i_101_, i_106_, i_97_), i_81_, i_78_, i_89_ <= i_90_, i_79_, fs, FileSystem.method443(i_100_, i_106_, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_106_, i_95_), is_80_, i_89_ <= i_88_);
					}
					if (l != l_92_ && l_92_ != l_94_) {
						class120_sub9 = (HDTile) hashtable.get(l_92_);
						Class96.method786(i_90_ <= i_91_, i_75_, i_90_ <= i_89_, fs_47_, fs_51_, class120_sub9, heightMap, FileSystem.method443(i_102_, i_105_, i_99_), FileSystem.method443(i_101_, i_105_, i_97_), i_81_, i_78_, i_90_ <= i_90_, i_79_, fs, FileSystem.method443(i_100_, i_105_, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_105_, i_95_), is_80_, i_90_ <= i_88_);
					}
					if (l_93_ != l && l_93_ != l_94_ && l_92_ != l_93_) {
						class120_sub9 = (HDTile) hashtable.get(l_93_);
						Class96.method786(i_91_ <= i_91_, i_75_, i_89_ >= i_91_, fs_47_, fs_51_, class120_sub9, heightMap, FileSystem.method443(i_102_, i_104_, i_99_), FileSystem.method443(i_101_, i_104_, i_97_), i_81_, i_78_, i_91_ <= i_90_, i_79_, fs, FileSystem.method443(i_100_, i_104_, i_96_), i_74_, bools, is_52_, FileSystem.method443(i_98_, i_104_, i_95_), is_80_, i_91_ <= i_88_);
					}
				}
			}
		}
		for (HDTile class120_sub9 = (HDTile) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (HDTile) hashtable.getNext()) {
			if (class120_sub9.anInt2527 == 0) {
				class120_sub9.unlink();
			} else {
				class120_sub9.method1161();
			}
		}
		final int i_107_ = hashtable.getCount();
		final HDTile[] class120_sub9s_108_ = new HDTile[i_107_];
		final long[] ls = new long[i_107_];
		hashtable.method660(class120_sub9s_108_);
		for (int i_109_ = 0; i_109_ < i_107_; i_109_++) {
			ls[i_109_] = class120_sub9s_108_[i_109_].uid;
		}
		ArrayUtils.quicksort(class120_sub9s_108_, ls);
		return class120_sub9s_108_;
	}

	private final void method1272(final int[][] is) {
		final int i_112_ = Class120_Sub12_Sub7.anInt3178;
		final int i_113_ = Class120_Sub12_Sub2.anInt3145;
		GameEntity.anIntArrayArray3009 = is;
		Class69.method616(0, 0, Class120_Sub29.anInt2774, MagnetType.anInt259);
		if (aClass101Array3237 != null) {
			for (final Class101 class101 : aClass101Array3237) {
				final int i_115_ = class101.anInt964;
				final int i_116_ = class101.anInt960;
				if (i_116_ < 0) {
					if (i_115_ >= 0) {
						class101.method837(i_112_, i_113_);
					}
				} else if (i_115_ < 0) {
					class101.method834(i_112_, i_113_);
				} else {
					class101.method833(i_112_, i_113_);
				}
			}
		}
	}

}
