/* Class180_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class Class180_Sub3 extends SceneGraphNode {
	int anInt2904;
	int anInt2905;
	static ObjectCache aClass21_2906;
	int anInt2907;
	int anInt2908;
	static int renderYaw;
	private final int anInt2910;
	private int anInt2912;
	private boolean aBoolean2913;
	private int anInt2914 = -32768;
	private ParticleEngine aClass108_Sub2_2915;
	private SeqType aClass40_2916;
	int anInt2917;
	static int[] anIntArray2918 = new int[14];
	private int anInt2919;
	boolean aBoolean2920;
	static int[] anIntArray2921;

	static {
		aClass21_2906 = new ObjectCache(100);
	}

	static final void method2309() {
		Canvas_Sub1.inputStream.startBitAccess();
		final int i_0_ = Canvas_Sub1.inputStream.getBitValue(8);
		if (i_0_ < Class148.localNpcCount) {
			for (int i_1_ = i_0_; Class148.localNpcCount > i_1_; i_1_++) {
				Class43.anIntArray366[Class120_Sub12_Sub23.anInt3307++] = Class120_Sub12_Sub36.localNpcIndices[i_1_];
			}
		}
		if (i_0_ > Class148.localNpcCount) {
			throw new RuntimeException("gnpov1");
		}
		Class148.localNpcCount = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			final int i_3_ = Class120_Sub12_Sub36.localNpcIndices[i_2_];
			final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
			final int i_4_ = Canvas_Sub1.inputStream.getBitValue(1);
			if (i_4_ == 0) {
				Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_3_;
				class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
			} else {
				final int i_5_ = Canvas_Sub1.inputStream.getBitValue(2);
				if (i_5_ == 0) {
					Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
					Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
				} else if (i_5_ == 1) {
					Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
					final int i_6_ = Canvas_Sub1.inputStream.getBitValue(3);
					class180_sub5_sub2.move(i_6_, 1);
					final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
					if (i_7_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
					}
				} else if (i_5_ == 2) {
					Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_3_;
					class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
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

	private final void method2310(final int i, final Class180_Sub7 class180_sub7) {
		try {
			if (!HDToolkit.glEnabled) {
				final Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7;
				if ((aClass108_Sub2_2915 == null || aClass108_Sub2_2915.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
					aClass108_Sub2_2915 = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
				}
				if (aClass108_Sub2_2915 != null) {
					aClass108_Sub2_2915.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
				}
			} else {
				final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7;
				if ((aClass108_Sub2_2915 == null || aClass108_Sub2_2915.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
					aClass108_Sub2_2915 = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
				}
				if (aClass108_Sub2_2915 != null) {
					aClass108_Sub2_2915.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
				}
			}
			if (i != 1) {
				this.aBoolean2920 = false;
			}
			aBoolean2913 = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.E(").append(i).append(',').append(class180_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method2311(final int i, final byte i_12_) {
		try {
			if (!this.aBoolean2920) {
				anInt2912 += i;
				if (i_12_ == -46) {
					while_12_: do {
						do {
							if (aClass40_2916.delays[anInt2919] >= anInt2912) {
								break while_12_;
							}
							anInt2912 -= aClass40_2916.delays[anInt2919];
							anInt2919++;
						} while (anInt2919 < aClass40_2916.frames.length);
						this.aBoolean2920 = true;
					} while (false);
					if (!this.aBoolean2920) {
						Class120_Sub12_Sub23.method1323(aClass40_2916, this.anInt2904, this.anInt2907, anInt2919, false);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.F(").append(i).append(',').append(i_12_).append(')').toString());
		}
	}

	static final void method2312(final Throwable throwable, final String string) {
		try {
			String string_13_ = "";
			if (throwable != null) {
				string_13_ = Class32.method272(false, throwable);
			}
			if (string != null) {
				if (throwable != null) {
					string_13_ = new StringBuilder(string_13_).append(" | ").toString();
				}
				string_13_ = new StringBuilder(string_13_).append(string).toString();
			}
			Class120_Sub14_Sub13.method1531(string_13_);
			string_13_ = Class180_Sub6.method2358(string_13_, "%3a", ":");
			string_13_ = Class180_Sub6.method2358(string_13_, "%40", "@");
			string_13_ = Class180_Sub6.method2358(string_13_, "%26", "&");
			string_13_ = Class180_Sub6.method2358(string_13_, "%23", "#");
			if (Class120_Sub12_Sub18.errorSignlink.gameApplet != null) {
				final SignlinkNode signlinkNode = Class120_Sub12_Sub18.errorSignlink.method1969(
						new URL(Class120_Sub12_Sub18.errorSignlink.gameApplet.getCodeBase(), new StringBuilder("clienterror.ws?c=").append(DisplayModeInfo.revision).append("&u=").append(Class20.selfNameAsLong).append("&v1=").append(Signlink.javaVendor).append("&v2=").append(Signlink.javaVersion)
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

	private final Class180_Sub7 method2313(final int i) {
		Class180_Sub7 class180_sub7;
		try {
			if (i > -16) {
				method2312(null, null);
			}
			final SpotAnimType spotAnimType = SpotAnimType.list(anInt2910);
			Class180_Sub7 class180_sub7_14_;
			if (this.aBoolean2920) {
				class180_sub7_14_ = spotAnimType.method882(-1, 0, -1, (byte) 14);
			} else {
				class180_sub7_14_ = spotAnimType.method882(-1, anInt2912, anInt2919, (byte) 14);
			}
			if (class180_sub7_14_ == null) {
				return null;
			}
			class180_sub7 = class180_sub7_14_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.C(").append(i).append(')').toString());
		}
		return class180_sub7;
	}

	@Override
	final void method2266(final int i, final int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		try {
			if (!aBoolean2913) {
				final Class180_Sub7 class180_sub7 = method2313(-72);
				if (class180_sub7 == null) {
					return;
				}
				method2310(1, class180_sub7);
			}
			if (aClass108_Sub2_2915 != null) {
				aClass108_Sub2_2915.method944(i, i_16_, i_18_, i_17_, i_19_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.BB(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
	}

	@Override
	final void method2265(final int i, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final long l, final int i_27_, final ParticleEngine class108_sub2) {
		try {
			final Class180_Sub7 class180_sub7 = method2313(-72);
			if (class180_sub7 != null) {
				method2310(1, class180_sub7);
				class180_sub7.method2265(i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, l, i_27_, aClass108_Sub2_2915);
				anInt2914 = class180_sub7.getMaxY();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.T(").append(i).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(',').append(i_24_).append(',').append(i_25_).append(',').append(i_26_).append(',')
					.append(l).append(',').append(i_27_).append(',').append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final Class28 method2315(final int i, final int i_28_, final int i_29_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_28_][i_29_];
		if (class120_sub18 == null) {
			return null;
		}
		for (int i_30_ = 0; i_30_ < class120_sub18.anInt2638; i_30_++) {
			final Class28 class28 = class120_sub18.aClass28Array2625[i_30_];
			if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == i_28_ && class28.anInt184 == i_29_) {
				return class28;
			}
		}
		return null;
	}

	public static void method2316(final int i) {
		try {
			if (i >= -64) {
				aClass21_2906 = null;
			}
			anIntArray2921 = null;
			aClass21_2906 = null;
			anIntArray2918 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("o.A(").append(i).append(')').toString());
		}
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = anInt2914;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "o.MA()");
		}
		return i;
	}

	Class180_Sub3(final int i, final int i_31_, final int i_32_, final int i_33_, final int i_34_, final int i_35_, final int i_36_) {
		aBoolean2913 = false;
		anInt2912 = 0;
		this.aBoolean2920 = false;
		anInt2919 = 0;
		this.anInt2908 = i_31_;
		anInt2910 = i;
		this.anInt2904 = i_32_;
		this.anInt2907 = i_33_;
		this.anInt2905 = i_34_;
		this.anInt2917 = i_35_ + i_36_;
		final int i_37_ = SpotAnimType.list(anInt2910).animationId;
		if ((i_37_ ^ 0xffffffff) != 0) {
			this.aBoolean2920 = false;
			aClass40_2916 = SeqType.list(i_37_);
		} else {
			this.aBoolean2920 = true;
		}
		if (this.anInt2917 == i_36_) {
			Class120_Sub12_Sub23.method1323(aClass40_2916, this.anInt2904, this.anInt2907, anInt2919, false);
		}
	}
}
