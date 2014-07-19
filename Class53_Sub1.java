/* Class53_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53_Sub1 extends Class53 {
	private final Class45 aClass45_2205;
	static String aString2206 = "flash2:";
	private Class83 aClass83_2207;
	private final FileSystem aClass51_2208;
	private final FileSystem aClass51_2209;
	private int anInt2210 = 0;
	private final int anInt2211;
	private final Hashtable aClass75_2212 = new Hashtable(16);
	static String aString2213 = "red:";
	private final int anInt2214;
	private byte[] aByteArray2215;
	private Class52 aClass52_2216;
	static SignlinkNode worldConnectionNode;
	private Class120_Sub14_Sub14 aClass120_Sub14_Sub14_2218;
	static int anInt2219;
	private final int anInt2220;
	private int anInt2221 = 0;
	private boolean aBoolean2222;
	private boolean aBoolean2223;
	private Deque aClass105_2224 = new Deque();
	private Deque aClass105_2225;
	private long aLong2226 = 0L;
	private final boolean aBoolean2227;

	final int method463(final int i) {
		int i_0_;
		try {
			if (aClass52_2216 == null) {
				return 0;
			}
			if (!aBoolean2222) {
				return aClass52_2216.anInt472;
			}
			if (i != 1) {
				return -10;
			}
			final Node node = aClass105_2225.getFront();
			if (node == null) {
				return 0;
			}
			i_0_ = (int) node.uid;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.I(").append(i).append(')').toString());
		}
		return i_0_;
	}

	static final void method464(final int i, final int i_1_, final int i_3_) {
		if (i_1_ == 0) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(230);
		}
		if (i_1_ == 1) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(207);
		}
		Class120_Sub12_Sub11.outputStream.putByteS(++client.aByte2201);
		Class120_Sub12_Sub11.outputStream.putByte(!NodeCache.aBooleanArray299[82] ? 0 : 1);
		Class120_Sub12_Sub11.outputStream.putShort(Class181.currentBaseZ + i_3_);
		Class120_Sub12_Sub11.outputStream.putLEShortA(i + GameEntity.currentBaseX);
	}

	static final int method465(final int i, final int i_4_) {
		int i_5_;
		try {
			if (i < 17) {
				aString2213 = null;
			}
			i_5_ = i_4_ >>> 8;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.O(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return i_5_;
	}

	@Override
	final Class52 method462() {
		if (aClass52_2216 != null) {
			return aClass52_2216;
		}
		if (aClass120_Sub14_Sub14_2218 == null) {
			if (aClass45_2205.method357()) {
				return null;
			}
			aClass120_Sub14_Sub14_2218 = aClass45_2205.method362((byte) 0, 255, true, anInt2214);
		}
		if (aClass120_Sub14_Sub14_2218.aBoolean3576) {
			return null;
		}
		final byte[] is = aClass120_Sub14_Sub14_2218.getBuffer();
		if (!(aClass120_Sub14_Sub14_2218 instanceof Class120_Sub14_Sub14_Sub1)) {
			try {
				if (is == null) {
					throw new RuntimeException();
				}
				aClass52_2216 = new Class52(is, anInt2211);
			} catch (final RuntimeException runtimeexception) {
				aClass45_2205.method365(-30223);
				aClass52_2216 = null;
				if (aClass45_2205.method357()) {
					aClass120_Sub14_Sub14_2218 = null;
				} else {
					aClass120_Sub14_Sub14_2218 = aClass45_2205.method362((byte) 0, 255, true, anInt2214);
				}
				return null;
			}
			if (aClass51_2208 != null) {
				aClass83_2207.a((byte) -124, aClass51_2208, is, anInt2214);
			}
		} else {
			try {
				if (is == null) {
					throw new RuntimeException();
				}
				aClass52_2216 = new Class52(is, anInt2211);
				if (anInt2220 != aClass52_2216.anInt471) {
					throw new RuntimeException();
				}
			} catch (final RuntimeException runtimeexception) {
				aClass52_2216 = null;
				if (aClass45_2205.method357()) {
					aClass120_Sub14_Sub14_2218 = null;
				} else {
					aClass120_Sub14_Sub14_2218 = aClass45_2205.method362((byte) 0, 255, true, anInt2214);
				}
				return null;
			}
		}
		if (aClass51_2209 != null) {
			anInt2210 = 0;
			aByteArray2215 = new byte[aClass52_2216.anInt484];
		}
		aClass120_Sub14_Sub14_2218 = null;
		return aClass52_2216;
	}

	static final int getMenuOptionCursor() {
		if (!Class120_Sub14_Sub4.aBoolean3470 || !NodeCache.aBooleanArray299[81] || Class186.menuOptionCount <= 2) {
			return InterfaceChangeNode.menuOptionsCursorId[Class186.menuOptionCount - 1];
		}
		return InterfaceChangeNode.menuOptionsCursorId[Class186.menuOptionCount - 2];
	}

	final int method467(final byte i) {
		int i_7_;
		try {
			if (method462() == null) {
				if (aClass120_Sub14_Sub14_2218 == null) {
					return 0;
				}
				return aClass120_Sub14_Sub14_2218.method1537();
			}
			i_7_ = 100;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.P(").append(i).append(')').toString());
		}
		return i_7_;
	}

	@Override
	final void method459(final int i, final int i_8_) {
		try {
			if (i_8_ >= -2) {
				method471(16);
			}
			if (aClass51_2209 != null) {
				for (Node node = aClass105_2224.getFront(); node != null; node = aClass105_2224.getNext()) {
					if ((i ^ 0xffffffffffffffffL) == (node.uid ^ 0xffffffffffffffffL)) {
						return;
					}
				}
				final Node node = new Node();
				node.uid = i;
				aClass105_2224.addLast(node);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.B(").append(i).append(',').append(i_8_).append(')').toString());
		}
	}

	public static void method468(final byte i) {
		try {
			if (i == -82) {
				aString2213 = null;
				worldConnectionNode = null;
				aString2206 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.N(").append(i).append(')').toString());
		}
	}

	final void method469(final boolean bool) {
		try {
			if (aClass105_2225 != null && method462() != null) {
				Node node = aClass105_2224.getFront();
				if (!bool) {
					for (/**/; node != null; node = aClass105_2224.getNext()) {
						final int i = (int) node.uid;
						if (i < 0 || aClass52_2216.anInt484 <= i || aClass52_2216.anIntArray475[i] == 0) {
							node.unlink();
						} else {
							if (aByteArray2215[i] == 0) {
								method475(-1, i, 1);
							}
							if (aByteArray2215[i] == -1) {
								method475(-1, i, 2);
							}
							if (aByteArray2215[i] == 1) {
								node.unlink();
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.H(").append(bool).append(')').toString());
		}
	}

	final int method470(final boolean bool) {
		int i;
		try {
			if (!bool) {
				aBoolean2222 = true;
			}
			i = anInt2210;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.S(").append(bool).append(')').toString());
		}
		return i;
	}

	final void method471(final int i) {
		try {
			if (aClass51_2209 != null) {
				aBoolean2223 = true;
				if (aClass105_2225 == null) {
					aClass105_2225 = new Deque();
				}
				if (i != -94271416) {
					method469(false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.L(").append(i).append(')').toString());
		}
	}

	static final boolean bitPackedMatch(final int i, final int i_9_, final int i_10_, final long l) {//TODO think of new name
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_9_][i_10_];
		if (class120_sub18 == null) {
			return false;
		}
		if (class120_sub18.aClass182_2628 != null && class120_sub18.aClass182_2628.bitPacked == l) {
			return true;
		}
		if (class120_sub18.aClass186_2639 != null && class120_sub18.aClass186_2639.bitPacked == l) {
			return true;
		}
		if (class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.bitPacked == l) {
			return true;
		}
		for (int i_11_ = 0; i_11_ < class120_sub18.anInt2638; i_11_++) {
			if (class120_sub18.aClass28Array2625[i_11_].bitPacked == l) {
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
	final byte[] method460(final int i, final int i_12_) {
		byte[] is;
		try {
			final Class120_Sub14_Sub14 class120_sub14_sub14 = method475(-1, i_12_, 0);
			if (class120_sub14_sub14 == null) {
				return null;
			}
			if (i != -94271416) {
				aString2206 = null;
			}
			final byte[] is_13_ = class120_sub14_sub14.getBuffer();
			class120_sub14_sub14.unlink();
			is = is_13_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.D(").append(i).append(',').append(i_12_).append(')').toString());
		}
		return is;
	}

	final int method474(final int i) {
		int i_14_;
		try {
			if (i != 0) {
				aClass105_2224 = null;
			}
			if (aClass52_2216 == null) {
				return 0;
			}
			i_14_ = aClass52_2216.anInt472;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.M(").append(i).append(')').toString());
		}
		return i_14_;
	}

	@Override
	final int method458(final int i, final int i_15_) {
		int i_16_;
		try {
			final Class120_Sub14_Sub14 class120_sub14_sub14 = (Class120_Sub14_Sub14) aClass75_2212.get(i);
			if (class120_sub14_sub14 != null) {
				return class120_sub14_sub14.method1537();
			}
			if (i_15_ != -1) {
				aClass83_2207 = null;
			}
			i_16_ = 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.F(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return i_16_;
	}

	private final Class120_Sub14_Sub14 method475(final int i, final int i_17_, final int i_18_) {
		Class120_Sub14_Sub14 class120_sub14_sub14;
		try {
			Class120_Sub14_Sub14 class120_sub14_sub14_19_ = (Class120_Sub14_Sub14) aClass75_2212.get(i_17_);
			if (class120_sub14_sub14_19_ != null && i_18_ == 0 && !class120_sub14_sub14_19_.aBoolean3573 && class120_sub14_sub14_19_.aBoolean3576) {
				class120_sub14_sub14_19_.unlink();
				class120_sub14_sub14_19_ = null;
			}
			if (i != -1) {
				return null;
			}
			if (class120_sub14_sub14_19_ == null) {
				if (i_18_ == 0) {
					if (aClass51_2209 == null || (aByteArray2215[i_17_] ^ 0xffffffff) == 0) {
						if (!aClass45_2205.method357()) {
							class120_sub14_sub14_19_ = aClass45_2205.method362((byte) 2, anInt2214, true, i_17_);
						} else {
							return null;
						}
					} else {
						class120_sub14_sub14_19_ = aClass83_2207.a((byte) -117, aClass51_2209, i_17_);
					}
				} else if (i_18_ == 1) {
					if (aClass51_2209 == null) {
						throw new RuntimeException();
					}
					class120_sub14_sub14_19_ = aClass83_2207.a(-10260, aClass51_2209, i_17_);
				} else if (i_18_ == 2) {
					if (aClass51_2209 == null) {
						throw new RuntimeException();
					}
					if (aByteArray2215[i_17_] != -1) {
						throw new RuntimeException();
					}
					if (aClass45_2205.method369(true)) {
						return null;
					}
					class120_sub14_sub14_19_ = aClass45_2205.method362((byte) 2, anInt2214, false, i_17_);
				} else {
					throw new RuntimeException();
				}
				aClass75_2212.put(class120_sub14_sub14_19_, i_17_);
			}
			if (class120_sub14_sub14_19_.aBoolean3576) {
				return null;
			}
			final byte[] is = class120_sub14_sub14_19_.getBuffer();
			if (!(class120_sub14_sub14_19_ instanceof Class120_Sub14_Sub14_Sub1)) {
				try {
					if (is == null || is.length <= 2) {
						throw new RuntimeException();
					}
					Class120_Sub14_Sub24.aCRC32_3658.reset();
					Class120_Sub14_Sub24.aCRC32_3658.update(is, 0, -2 + is.length);
					final int i_20_ = (int) Class120_Sub14_Sub24.aCRC32_3658.getValue();
					if (aClass52_2216.anIntArray470[i_17_] != i_20_) {
						throw new RuntimeException();
					}
					aClass45_2205.anInt410 = 0;
					aClass45_2205.anInt411 = 0;
				} catch (final RuntimeException runtimeexception) {
					aClass45_2205.method365(-30223);
					class120_sub14_sub14_19_.unlink();
					if (class120_sub14_sub14_19_.aBoolean3573 && !aClass45_2205.method357()) {
						final Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = aClass45_2205.method362((byte) 2, anInt2214, true, i_17_);
						aClass75_2212.put(class120_sub14_sub14_sub2, i_17_);
					}
					return null;
				}
				is[-2 + is.length] = (byte) (aClass52_2216.anIntArray483[i_17_] >>> 8);
				is[is.length + -1] = (byte) aClass52_2216.anIntArray483[i_17_];
				if (aClass51_2209 != null) {
					aClass83_2207.a((byte) -127, aClass51_2209, is, i_17_);
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
			Class120_Sub14_Sub14 class120_sub14_sub14_21_;
			try {
				if (is == null || is.length <= 2) {
					throw new RuntimeException();
				}
				Class120_Sub14_Sub24.aCRC32_3658.reset();
				Class120_Sub14_Sub24.aCRC32_3658.update(is, 0, is.length - 2);
				final int i_22_ = (int) Class120_Sub14_Sub24.aCRC32_3658.getValue();
				if (i_22_ != aClass52_2216.anIntArray470[i_17_]) {
					throw new RuntimeException();
				}
				final int i_23_ = (is[-1 + is.length] & 0xff) + ((0xff & is[-2 + is.length]) << 8);
				if ((aClass52_2216.anIntArray483[i_17_] & 0xffff) != i_23_) {
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
				if (class120_sub14_sub14_19_.aBoolean3573 && !aClass45_2205.method357()) {
					final Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = aClass45_2205.method362((byte) 2, anInt2214, true, i_17_);
					aClass75_2212.put(class120_sub14_sub14_sub2, i_17_);
				}
				return null;
			}
			class120_sub14_sub14 = class120_sub14_sub14_21_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.U(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
		return class120_sub14_sub14;
	}

	final void method476(final int i) {
		try {
			if (i == -2) {
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
									method475(-1, i_24_, 2);
								}
								if (aByteArray2215[i_24_] != 1) {
									bool = false;
								} else {
									node.unlink();
								}
							}
							while (aClass52_2216.anIntArray475.length > anInt2221) {
								if (aClass52_2216.anIntArray475[anInt2221] == 0) {
									anInt2221++;
								} else {
									if (aClass45_2205.method369(true)) {
										bool = false;
										break;
									}
									if (aByteArray2215[anInt2221] != 1) {
										method475(i ^ 0x1, anInt2221, 2);
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
								method475(-1, i_25_, 1);
							}
							if (aByteArray2215[i_25_] == 0) {
								bool = false;
							} else {
								node.unlink();
							}
						}
						while (anInt2221 < aClass52_2216.anIntArray475.length) {
							if (aClass52_2216.anIntArray475[anInt2221] == 0) {
								anInt2221++;
							} else {
								if (aClass83_2207.anInt793 >= 250) {
									bool = false;
									break;
								}
								if (aByteArray2215[anInt2221] == 0) {
									method475(i + 1, anInt2221, 1);
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
					for (Class120_Sub14_Sub14 class120_sub14_sub14 = (Class120_Sub14_Sub14) aClass75_2212.getFirst(); class120_sub14_sub14 != null; class120_sub14_sub14 = (Class120_Sub14_Sub14) aClass75_2212.getNext()) {
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
					aLong2226 = TimeUtil.getSafeTime() - -1000L;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wb.Q(").append(i).append(')').toString());
		}
	}

	Class53_Sub1(final int i, final FileSystem fileSystem, final FileSystem class51_26_, final Class45 class45, final Class83 class83, final int i_27_, final int i_28_, final boolean bool) {
		aClass51_2209 = fileSystem;
		anInt2214 = i;
		if (aClass51_2209 == null) {
			aBoolean2222 = false;
		} else {
			aBoolean2222 = true;
			aClass105_2225 = new Deque();
		}
		anInt2220 = i_28_;
		aBoolean2227 = bool;
		anInt2211 = i_27_;
		aClass83_2207 = class83;
		aClass51_2208 = class51_26_;
		aClass45_2205 = class45;
		if (aClass51_2208 != null) {
			aClass120_Sub14_Sub14_2218 = aClass83_2207.a((byte) -125, aClass51_2208, anInt2214);
		}
	}
}
