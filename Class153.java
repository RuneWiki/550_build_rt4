/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class153 {
	int anInt1427;
	int anInt1428;
	int anInt1429;
	boolean aBoolean1430;
	int anInt1431;
	int anInt1432 = 16777215;
	static js5 aClass50_1433;
	int anInt1434;
	int anInt1435 = 8;
	static int anInt1436 = -1;

	static final AbstractIndexedSprite constructAbstractIndexedSprite(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return Class11.constructAbstractIndexedSprite();
	}

	static final void method2070(final byte i) {
		try {
			Class120_Sub14_Sub13.method1532(0, 0);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.C(").append(i).append(')').toString());
		}
	}

	public static void method2071(final byte i) {
		try {
			aClass50_1433 = null;
			if (i != 56) {
				anInt1436 = 102;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.G(").append(i).append(')').toString());
		}
	}

	static final Class186 method2072(final int i, final int i_1_, final int i_2_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_1_][i_2_];
		if (class120_sub18 == null) {
			return null;
		}
		final Class186 class186 = class120_sub18.aClass186_2639;
		class120_sub18.aClass186_2639 = null;
		return class186;
	}

	static final int method2073(final int i) {
		return i >> 11 & 0x7f;
	}

	private final void method2074(final int i, final int i_5_, final Buffer class120_sub7, final int i_6_) {
		try {
			if (i != -3) {
				constructAbstractIndexedSprite(null, 112);
			}
			if (i_6_ == 1) {
				this.anInt1435 = class120_sub7.getUShort();
			} else if (i_6_ != 2) {
				if (i_6_ == 3) {
					this.anInt1427 = class120_sub7.getShort();
					this.anInt1428 = class120_sub7.getShort();
					this.anInt1431 = class120_sub7.getShort();
				} else if (i_6_ != 4) {
					if (i_6_ == 5) {
						this.anInt1429 = class120_sub7.getUShort();
					} else if (i_6_ == 6) {
						this.anInt1432 = class120_sub7.getMedium();
					}
				} else {
					this.anInt1434 = class120_sub7.getUByte();
				}
			} else {
				this.aBoolean1430 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.E(").append(i).append(',').append(i_5_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_6_).append(')').toString());
		}
	}

	static final void method2075(final byte i, final js5 js5) {
		try {
			CanvasWrapper.aClass50_18 = js5;
			if (i != -46) {
				method2072(75, -8, -127);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.D(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2076(final int i, final byte i_7_) {
		try {
			if (Class120_Sub14_Sub23.anIntArray3654 == null || Class120_Sub14_Sub23.anIntArray3654.length < i) {
				Class120_Sub14_Sub23.anIntArray3654 = new int[i];
			}
			if (i_7_ != -14) {
				method2070((byte) 57);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.A(").append(i).append(',').append(i_7_).append(')').toString());
		}
	}

	final void method2077(final byte i, final int i_8_, final Buffer class120_sub7) {
		try {
			for (;;) {
				final int i_9_ = class120_sub7.getUByte();
				if (i_9_ == 0) {
					break;
				}
				method2074(i + -88, i_8_, class120_sub7, i_9_);
			}
			if (i != 85) {
				method2070((byte) 103);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sa.I(").append(i).append(',').append(i_8_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public Class153() {
		/* empty */
	}
}
