import java.util.zip.CRC32;

/* Class53_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53_Sub1 extends Class53 {
	private final Js5Worker js5Worker;
	private FileSystemWorker fileSystemWorker;
	private final FileSystem masterIndexFileSystem;
	private final FileSystem indexFileSystem;
	private int anInt2210 = 0;
	private final int indexCrc;
	private final Hashtable aClass75_2212 = new Hashtable(16);
	private final int indexId;
	private byte[] aByteArray2215;
	private MasterIndexInfo masterIndexInfo;
	static SignlinkNode worldConnectionNode;
	private AbstractRequest aClass120_Sub14_Sub14_2218;
	static int minimapClickY;
	private final int indexVersion;
	private int anInt2221 = 0;
	private boolean aBoolean2222;
	private boolean aBoolean2223;
	private Deque aClass105_2224 = new Deque();
	private Deque aClass105_2225;
	private long aLong2226 = 0L;
	private final boolean aBoolean2227;
	private static CRC32 crc32 = new CRC32();

	final int method463() {
		if (masterIndexInfo == null) {
			return 0;
		}
		if (!aBoolean2222) {
			return masterIndexInfo.groupLength;
		}
		final Node node = aClass105_2225.getFront();
		if (node == null) {
			return 0;
		}
		return (int) node.uid;
	}

	static final void method464(final int type, final int x, final int z) {
		if (type == 0) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(230);
		}
		if (type == 1) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(207);
		}
		Class120_Sub12_Sub11.outputStream.putByteS(++client.flagCounter);
		Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
		Class120_Sub12_Sub11.outputStream.putShort(z + LightType.currentBaseZ);
		Class120_Sub12_Sub11.outputStream.putLEShortA(x + GameEntity.currentBaseX);
	}

	@Override
	final MasterIndexInfo method462() {
		if (masterIndexInfo != null) {
			return masterIndexInfo;
		}
		if (aClass120_Sub14_Sub14_2218 == null) {
			if (js5Worker.method357()) {
				return null;
			}
			aClass120_Sub14_Sub14_2218 = js5Worker.putRequest(255, indexId, (byte) 0, true);
		}
		if (aClass120_Sub14_Sub14_2218.aBoolean3576) {
			return null;
		}
		final byte[] data = aClass120_Sub14_Sub14_2218.getBuffer();
		if (!(aClass120_Sub14_Sub14_2218 instanceof FileSystemRequest)) {
			try {
				if (data == null) {
					throw new RuntimeException();
				}
				masterIndexInfo = new MasterIndexInfo(data, indexCrc);
			} catch (final RuntimeException runtimeexception) {
				js5Worker.crcError();
				masterIndexInfo = null;
				if (js5Worker.method357()) {
					aClass120_Sub14_Sub14_2218 = null;
				} else {
					aClass120_Sub14_Sub14_2218 = js5Worker.putRequest(255, indexId, (byte) 0, true);
				}
				return null;
			}
			if (masterIndexFileSystem != null) {
				fileSystemWorker.requestWrite(masterIndexFileSystem, data, indexId);
			}
		} else {
			try {
				if (data == null) {
					throw new RuntimeException();
				}
				masterIndexInfo = new MasterIndexInfo(data, indexCrc);
				if (indexVersion != masterIndexInfo.version) {
					throw new RuntimeException();
				}
			} catch (final RuntimeException runtimeexception) {
				masterIndexInfo = null;
				if (js5Worker.method357()) {
					aClass120_Sub14_Sub14_2218 = null;
				} else {
					aClass120_Sub14_Sub14_2218 = js5Worker.putRequest(255, indexId, (byte) 0, true);
				}
				return null;
			}
		}
		if (indexFileSystem != null) {
			anInt2210 = 0;
			aByteArray2215 = new byte[masterIndexInfo.anInt484];
		}
		aClass120_Sub14_Sub14_2218 = null;
		return masterIndexInfo;
	}

	static final int getMenuOptionCursor() {
		if (!SpotAnimationNode.shiftClickEnabled || !NodeCache.heldKeys[81] || WallDecoration.menuOptionCount <= 2) {
			return InterfaceChangeNode.menuOptionsCursorId[WallDecoration.menuOptionCount - 1];
		}
		return InterfaceChangeNode.menuOptionsCursorId[WallDecoration.menuOptionCount - 2];
	}

	final int getCompletion() {
		if (method462() == null) {
			if (aClass120_Sub14_Sub14_2218 == null) {
				return 0;
			}
			return aClass120_Sub14_Sub14_2218.getCompletion();
		}
		return 100;
	}

	@Override
	final void method459(final int id) {
		if (indexFileSystem != null) {
			for (Node node = aClass105_2224.getFront(); node != null; node = aClass105_2224.getNext()) {
				if (node.uid == id) {
					return;
				}
			}
			final Node node = new Node();
			node.uid = id;
			aClass105_2224.addLast(node);
		}
	}

	final void method469() {
		if (aClass105_2225 != null && method462() != null) {
			for (Node node = aClass105_2224.getFront(); node != null; node = aClass105_2224.getNext()) {
				final int i = (int) node.uid;
				if (i < 0 || masterIndexInfo.anInt484 <= i || masterIndexInfo.groupFileCount[i] == 0) {
					node.unlink();
				} else {
					if (aByteArray2215[i] == 0) {
						method475(i, 1);
					}
					if (aByteArray2215[i] == -1) {
						method475(i, 2);
					}
					if (aByteArray2215[i] == 1) {
						node.unlink();
					}
				}
			}
		}
	}

	final int method470() {
		return anInt2210;
	}

	final void method471() {
		if (indexFileSystem != null) {
			aBoolean2223 = true;
			if (aClass105_2225 == null) {
				aClass105_2225 = new Deque();
			}
		}
	}

	static final boolean bitPackedMatch(final int x, final int z, final int level, final long bitPacked) {// TODO
																										// think
																										// of
																										// new
																										// name
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return false;
		}
		if (groundTile.wallLocation != null && groundTile.wallLocation.bitPackedUid == bitPacked) {
			return true;
		}
		if (groundTile.wallDecoration != null && groundTile.wallDecoration.bitPacked == bitPacked) {
			return true;
		}
		if (groundTile.groundDecoration != null && groundTile.groundDecoration.bitPackedUid == bitPacked) {
			return true;
		}
		for (int i_11_ = 0; i_11_ < groundTile.anInt2638; i_11_++) {
			if (groundTile.aClass28Array2625[i_11_].bitPacked == bitPacked) {
				return true;
			}
		}
		return false;
	}

	static final void resetSpriteInfo() {
		Projectile.spriteXOffsets = null;
		Class132_Sub1.spritePalette = null;
		Class120_Sub12_Sub11.spriteWidths = null;
		Class120_Sub12_Sub39.spriteHeights = null;
		GroundTile.spriteYOffsets = null;
		Class145.spritePaletteIndicators = null;
	}

	@Override
	final byte[] method460(final int i_12_) {
		final AbstractRequest class120_sub14_sub14 = method475(i_12_, 0);
		if (class120_sub14_sub14 == null) {
			return null;
		}
		final byte[] is_13_ = class120_sub14_sub14.getBuffer();
		class120_sub14_sub14.unlink();
		return is_13_;
	}

	final int getGroupLength() {
		if (masterIndexInfo == null) {
			return 0;
		}
		return masterIndexInfo.groupLength;
	}

	@Override
	final int getCompletion(final int i) {
		final AbstractRequest abstractRequest = (AbstractRequest) aClass75_2212.get(i);
		if (abstractRequest != null) {
			return abstractRequest.getCompletion();
		}
		return 0;
	}

	private final AbstractRequest method475(final int i_17_, final int i_18_) {
		AbstractRequest class120_sub14_sub14_19_ = (AbstractRequest) aClass75_2212.get(i_17_);
		if (class120_sub14_sub14_19_ != null && i_18_ == 0 && !class120_sub14_sub14_19_.aBoolean3573 && class120_sub14_sub14_19_.aBoolean3576) {
			class120_sub14_sub14_19_.unlink();
			class120_sub14_sub14_19_ = null;
		}
		if (class120_sub14_sub14_19_ == null) {
			if (i_18_ == 0) {
				if (indexFileSystem == null || aByteArray2215[i_17_] == -1) {
					if (!js5Worker.method357()) {
						class120_sub14_sub14_19_ = js5Worker.putRequest(indexId, i_17_, (byte) 2, true);
					} else {
						return null;
					}
				} else {
					class120_sub14_sub14_19_ = fileSystemWorker.requestRead2(indexFileSystem, i_17_);
				}
			} else if (i_18_ == 1) {
				if (indexFileSystem == null) {
					throw new RuntimeException();
				}
				class120_sub14_sub14_19_ = fileSystemWorker.requestRead(indexFileSystem, i_17_);
			} else if (i_18_ == 2) {
				if (indexFileSystem == null) {
					throw new RuntimeException();
				}
				if (aByteArray2215[i_17_] != -1) {
					throw new RuntimeException();
				}
				if (js5Worker.method369()) {
					return null;
				}
				class120_sub14_sub14_19_ = js5Worker.putRequest(indexId, i_17_, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			aClass75_2212.put(class120_sub14_sub14_19_, i_17_);
		}
		if (class120_sub14_sub14_19_.aBoolean3576) {
			return null;
		}
		final byte[] is = class120_sub14_sub14_19_.getBuffer();
		if (!(class120_sub14_sub14_19_ instanceof FileSystemRequest)) {
			try {
				if (is == null || is.length <= 2) {
					throw new RuntimeException();
				}
				crc32.reset();
				crc32.update(is, 0, is.length - 2);
				final int crc = (int) crc32.getValue();
				if (masterIndexInfo.groupCrcs[i_17_] != crc) {
					throw new RuntimeException();
				}
				js5Worker.errorCount = 0;
				js5Worker.errorType = 0;
			} catch (final RuntimeException runtimeexception) {
				js5Worker.crcError();
				class120_sub14_sub14_19_.unlink();
				if (class120_sub14_sub14_19_.aBoolean3573 && !js5Worker.method357()) {
					final Js5Request class120_sub14_sub14_sub2 = js5Worker.putRequest(indexId, i_17_, (byte) 2, true);
					aClass75_2212.put(class120_sub14_sub14_sub2, i_17_);
				}
				return null;
			}
			is[-2 + is.length] = (byte) (masterIndexInfo.groupVersions[i_17_] >>> 8);
			is[is.length + -1] = (byte) masterIndexInfo.groupVersions[i_17_];
			if (indexFileSystem != null) {
				fileSystemWorker.requestWrite(indexFileSystem, is, i_17_);
				if (aByteArray2215[i_17_] != 1) {
					anInt2210++;
					aByteArray2215[i_17_] = (byte) 1;
				}
			}
			if (!class120_sub14_sub14_19_.aBoolean3573) {
				class120_sub14_sub14_19_.unlink();
			}
			return class120_sub14_sub14_19_;
		}
		AbstractRequest class120_sub14_sub14_21_;
		try {
			if (is == null || is.length <= 2) {
				throw new RuntimeException();
			}
			crc32.reset();
			crc32.update(is, 0, is.length - 2);
			final int crc = (int) crc32.getValue();
			if (crc != masterIndexInfo.groupCrcs[i_17_]) {
				throw new RuntimeException();
			}
			final int version = (is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8);
			if ((masterIndexInfo.groupVersions[i_17_] & 0xffff) != version) {
				throw new RuntimeException();
			}
			if (aByteArray2215[i_17_] != 1) {
				if (aByteArray2215[i_17_] != 0) {
					/* empty */
				}
				anInt2210++;
				aByteArray2215[i_17_] = (byte) 1;
			}
			if (!class120_sub14_sub14_19_.aBoolean3573) {
				class120_sub14_sub14_19_.unlink();
			}
			class120_sub14_sub14_21_ = class120_sub14_sub14_19_;
		} catch (final Exception exception) {
			aByteArray2215[i_17_] = (byte) -1;
			class120_sub14_sub14_19_.unlink();
			if (class120_sub14_sub14_19_.aBoolean3573 && !js5Worker.method357()) {
				final Js5Request class120_sub14_sub14_sub2 = js5Worker.putRequest(indexId, i_17_, (byte) 2, true);
				aClass75_2212.put(class120_sub14_sub14_sub2, i_17_);
			}
			return null;
		}
		return class120_sub14_sub14_21_;
	}

	final void method476() {
		if (aClass105_2225 != null) {
			if (method462() == null) {
				return;
			}
			if (!aBoolean2222) {
				if (!aBoolean2223) {
					aClass105_2225 = null;
				} else {
					boolean bool = true;
					for (Node node = aClass105_2225.getFront(); node != null; node = aClass105_2225.getNext()) {
						final int i_24_ = (int) node.uid;
						if (aByteArray2215[i_24_] != 1) {
							method475(i_24_, 2);
						}
						if (aByteArray2215[i_24_] != 1) {
							bool = false;
						} else {
							node.unlink();
						}
					}
					while (masterIndexInfo.groupFileCount.length > anInt2221) {
						if (masterIndexInfo.groupFileCount[anInt2221] == 0) {
							anInt2221++;
						} else {
							if (js5Worker.method369()) {
								bool = false;
								break;
							}
							if (aByteArray2215[anInt2221] != 1) {
								method475(anInt2221, 2);
							}
							if (aByteArray2215[anInt2221] != 1) {
								bool = false;
								final Node node = new Node();
								node.uid = anInt2221;
								aClass105_2225.addLast(node);
							}
							anInt2221++;
						}
					}
					if (bool) {
						aBoolean2223 = false;
						anInt2221 = 0;
					}
				}
			} else {
				boolean bool = true;
				for (Node node = aClass105_2225.getFront(); node != null; node = aClass105_2225.getNext()) {
					final int i_25_ = (int) node.uid;
					if (aByteArray2215[i_25_] == 0) {
						method475(i_25_, 1);
					}
					if (aByteArray2215[i_25_] == 0) {
						bool = false;
					} else {
						node.unlink();
					}
				}
				while (anInt2221 < masterIndexInfo.groupFileCount.length) {
					if (masterIndexInfo.groupFileCount[anInt2221] == 0) {
						anInt2221++;
					} else {
						if (fileSystemWorker.requestsAwaiting >= 250) {
							bool = false;
							break;
						}
						if (aByteArray2215[anInt2221] == 0) {
							method475(anInt2221, 1);
						}
						if (aByteArray2215[anInt2221] == 0) {
							bool = false;
							final Node node = new Node();
							node.uid = anInt2221;
							aClass105_2225.addLast(node);
						}
						anInt2221++;
					}
				}
				if (bool) {
					aBoolean2222 = false;
					anInt2221 = 0;
				}
			}
		}
		if (aBoolean2227 && (aLong2226 ^ 0xffffffffffffffffL) >= (TimeUtil.getSafeTime() ^ 0xffffffffffffffffL)) {
			for (AbstractRequest class120_sub14_sub14 = (AbstractRequest) aClass75_2212.getFirst(); class120_sub14_sub14 != null; class120_sub14_sub14 = (AbstractRequest) aClass75_2212.getNext()) {
				if (!class120_sub14_sub14.aBoolean3576) {
					if (class120_sub14_sub14.aBoolean3577) {
						if (!class120_sub14_sub14.aBoolean3573) {
							throw new RuntimeException();
						}
						class120_sub14_sub14.unlink();
					} else {
						class120_sub14_sub14.aBoolean3577 = true;
					}
				}
			}
			aLong2226 = TimeUtil.getSafeTime() + 1000L;
		}
	}

	Class53_Sub1(final int i, final FileSystem fileSystem, final FileSystem class51_26_, final Js5Worker jw, final FileSystemWorker fsWorker, final int i_27_, final int i_28_, final boolean bool) {
		indexFileSystem = fileSystem;
		indexId = i;
		if (indexFileSystem == null) {
			aBoolean2222 = false;
		} else {
			aBoolean2222 = true;
			aClass105_2225 = new Deque();
		}
		indexVersion = i_28_;
		aBoolean2227 = bool;
		indexCrc = i_27_;
		fileSystemWorker = fsWorker;
		masterIndexFileSystem = class51_26_;
		js5Worker = jw;
		if (masterIndexFileSystem != null) {
			aClass120_Sub14_Sub14_2218 = fileSystemWorker.requestRead2(masterIndexFileSystem, indexId);
		}
	}
}
