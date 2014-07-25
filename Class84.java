/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class Class84 {
	static int anInt796 = -2;
	private Inflater anInflater797;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_798;
	static String aString799 = "Loaded interfaces";
	static int[] anIntArray800;
	static String[] ignoreNames = new String[100];

	static final void method716() {
		Class180_Sub6.aClass21_3071.clearSoftReference();
		LabelGroup.aClass21_2406.clearSoftReference();
		Class120_Sub12_Sub2.aClass21_3143.clearSoftReference();
	}

	public Class84() {
		this(-1, 1000000, 1000000);
	}

	static final void method717(final int i, final boolean bool, final int i_0_, final int i_1_, final int i_2_) {
		try {
			if (bool) {
				ignoreNames = null;
			}
			if (i_0_ >= i) {
				AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_2_], i_1_, i, i_0_);
			} else {
				AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_2_], i_1_, i_0_, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jb.F(").append(i).append(',').append(bool).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
	}

	static final void method718(final byte i) {
		try {
			if (i != -12) {
				aString799 = null;
			}
			for (Class120_Sub14_Sub1 class120_sub14_sub1 = (Class120_Sub14_Sub1) FileSystemRequest.aClass105_3928.getFront(); class120_sub14_sub1 != null; class120_sub14_sub1 = (Class120_Sub14_Sub1) FileSystemRequest.aClass105_3928.getNext()) {
				final Projectile class180_sub4 = class120_sub14_sub1.aClass180_Sub4_3446;
				if (class180_sub4.anInt2934 != Class173.gameLevel || Class101_Sub2.loopCycle > class180_sub4.anInt2922) {
					class120_sub14_sub1.unlink();
				} else if (class180_sub4.anInt2939 <= Class101_Sub2.loopCycle) {
					if (class180_sub4.anInt2929 > 0) {
						final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[-1 + class180_sub4.anInt2929];
						if (class180_sub5_sub2 != null && class180_sub5_sub2.x >= 0 && class180_sub5_sub2.x < 13312 && class180_sub5_sub2.z >= 0 && class180_sub5_sub2.z < 13312) {
							class180_sub4.method2319(Class22.getTileHeight(class180_sub4.anInt2934, class180_sub5_sub2.x, class180_sub5_sub2.z) - class180_sub4.anInt2943, class180_sub5_sub2.x, Class101_Sub2.loopCycle, class180_sub5_sub2.z);
						}
					}
					if (class180_sub4.anInt2929 < 0) {
						final int i_3_ = -class180_sub4.anInt2929 - 1;
						Player class180_sub5_sub1;
						if (Class167.anInt1616 == i_3_) {
							class180_sub5_sub1 = TileParticleQueue.selfPlayer;
						} else {
							class180_sub5_sub1 = Class118.playersList[i_3_];
						}
						if (class180_sub5_sub1 != null && class180_sub5_sub1.x >= 0 && class180_sub5_sub1.x < 13312 && class180_sub5_sub1.z >= 0 && class180_sub5_sub1.z < 13312) {
							class180_sub4.method2319(Class22.getTileHeight(class180_sub4.anInt2934, class180_sub5_sub1.x, class180_sub5_sub1.z) + -class180_sub4.anInt2943, class180_sub5_sub1.x, Class101_Sub2.loopCycle, class180_sub5_sub1.z);
						}
					}
					class180_sub4.method2317(Class120_Sub12_Sub22.redrawRate);
					Class120_Sub12_Sub5.method1218(Class173.gameLevel, (int) class180_sub4.aDouble2949, (int) class180_sub4.aDouble2953, (int) class180_sub4.aDouble2937, 60, class180_sub4, class180_sub4.anInt2944, -1L, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jb.C(").append(i).append(')').toString());
		}
	}

	public static void method719(final byte i) {
		try {
			anIntArray800 = null;
			ignoreNames = null;
			if (i >= 81) {
				aClass120_Sub14_Sub9_798 = null;
				aString799 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jb.E(").append(i).append(')').toString());
		}
	}

	static final void setHuffman(final Huffman huffman) {
		Class39.huffman = huffman;
	}

	final void method721(final Buffer class120_sub7, final byte i, final byte[] is) {
		try {
			if (class120_sub7.buf[class120_sub7.pos] != 31 || class120_sub7.buf[1 + class120_sub7.pos] != -117) {
				throw new RuntimeException("Invalid GZIP header!");
			}
			if (anInflater797 == null) {
				anInflater797 = new Inflater(true);
			}
			try {
				anInflater797.setInput(class120_sub7.buf, class120_sub7.pos + 10, class120_sub7.buf.length - (18 + class120_sub7.pos));
				anInflater797.inflate(is);
			} catch (final Exception exception) {
				anInflater797.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater797.reset();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jb.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
	}

	private Class84(final int i, final int i_4_, final int i_5_) {
		/* empty */
	}
}
