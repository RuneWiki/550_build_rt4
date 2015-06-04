/* Class120_Sub14_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class QuickChatMessageType extends NodeSub {
	private int[] anIntArray3528;
	private int[][] anIntArrayArray3529;
	static Frame fullscreenFrame;
	boolean aBoolean3531 = true;
	static LDSprite landScapeAsLDSprite;
	static int[] anIntArray3533 = new int[14];
	static Hashtable interfaceChangeCache = new Hashtable(16);
	int[] anIntArray3535;
	private String[] text;
	static js5 aClass50_1011;
	static js5 aClass50_143;
	static NodeCache recentUse = new NodeCache(64);
	static int menuHeight;

	static final void method1499(final Class28 class28) {
		for (int i = class28.anInt180; i <= class28.anInt182; i++) {
			for (int i_0_ = class28.anInt184; i_0_ <= class28.anInt175; i_0_++) {
				final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[class28.anInt177][i][i_0_];
				if (class120_sub18 != null) {
					for (int i_1_ = 0; i_1_ < class120_sub18.anInt2638; i_1_++) {
						if (class120_sub18.aClass28Array2625[i_1_] == class28) {
							class120_sub18.anInt2638--;
							for (int i_2_ = i_1_; i_2_ < class120_sub18.anInt2638; i_2_++) {
								class120_sub18.aClass28Array2625[i_2_] = class120_sub18.aClass28Array2625[i_2_ + 1];
								class120_sub18.anIntArray2641[i_2_] = class120_sub18.anIntArray2641[i_2_ + 1];
							}
							class120_sub18.aClass28Array2625[class120_sub18.anInt2638] = null;
							break;
						}
					}
					class120_sub18.anInt2635 = 0;
					for (int i_3_ = 0; i_3_ < class120_sub18.anInt2638; i_3_++) {
						class120_sub18.anInt2635 |= class120_sub18.anIntArray2641[i_3_];
					}
				}
			}
		}
	}

	final int method1500() {
		if (anIntArray3528 == null) {
			return 0;
		}
		return anIntArray3528.length;
	}

	final int method1501(final int i, final int i_6_) {
		if (anIntArray3528 == null || i_6_ < 0 || i_6_ > anIntArray3528.length) {
			return -1;
		}
		if (anIntArrayArray3529[i_6_] == null || i < 0 || i > anIntArrayArray3529[i_6_].length) {
			return -1;
		}
		return anIntArrayArray3529[i_6_][i];
	}

	final int method1502(final int i) {
		if (anIntArray3528 == null || i < 0 || i > anIntArray3528.length) {
			return -1;
		}
		return anIntArray3528[i];
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			text = EntityRenderData.splitString(buffer.getJagexString(), '<');
		} else if (code == 2) {
			final int i_14_ = buffer.getUByte();
			this.anIntArray3535 = new int[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				this.anIntArray3535[i_15_] = buffer.getUShort();
			}
		} else if (code == 3) {
			final int i_10_ = buffer.getUByte();
			anIntArrayArray3529 = new int[i_10_][];
			anIntArray3528 = new int[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				final int i_12_ = buffer.getUShort();
				anIntArray3528[i_11_] = i_12_;
				anIntArrayArray3529[i_11_] = new int[Class140.anIntArray1341[i_12_]];
				for (int i_13_ = 0; i_13_< Class140.anIntArray1341[i_12_]; i_13_++) {
					anIntArrayArray3529[i_11_][i_13_] = buffer.getUShort();
				}
			}
		} else if (code == 4) {
			this.aBoolean3531 = false;
		}
	}

	static final boolean method1504(final char c) {
		if (c >= ' ' && c <= '~') {
			return true;
		}
		if (c >= '\u00a0' && c <= '\u00ff') {
			return true;
		}
		if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || c == '\u0153' || c == '\u0178') {
			return true;
		}
		return false;
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final String method1506(final Buffer buffer) {
		final StringBuffer stringbuffer = new StringBuffer(80);
		if (anIntArray3528 != null) {
			for (int i_17_ = 0; i_17_ < anIntArray3528.length; i_17_++) {
				stringbuffer.append(text[i_17_]);
				stringbuffer.append(Class101_Sub4.method849(buffer.method1098(DummyInputStream.anIntArray24[anIntArray3528[i_17_]]), anIntArray3528[i_17_], anIntArrayArray3529[i_17_]));
			}
		}
		stringbuffer.append(text[text.length - 1]);
		return stringbuffer.toString();
	}

	final void method1507() {
		if (this.anIntArray3535 != null) {
			for (int i_18_ = 0; this.anIntArray3535.length > i_18_; i_18_++) {
				this.anIntArray3535[i_18_] |= 0x8000;
			}
		}
	}

	final void method1508(final Buffer class120_sub7, final int[] is) {
		if (anIntArray3528 != null) {
			for (int i_19_ = 0; i_19_ < anIntArray3528.length && i_19_ < is.length; i_19_++) {
				final int i_20_ = MagnetType.anIntArray263[method1502(i_19_)];
				if (i_20_ > 0) {
					class120_sub7.method1108(is[i_19_], i_20_);
				}
			}
		}
	}

	final String method1510() {
		final StringBuffer stringbuffer = new StringBuffer(80);
		if (text == null) {
			return "";
		}
		stringbuffer.append(text[0]);
		for (int id = 1; id < text.length; id++) {
			stringbuffer.append("...");
			stringbuffer.append(text[id]);
		}
		return stringbuffer.toString();
	}

	static final void setup(final js5 js5, final Interface1 interface1, final js5 class50_45_) {
		aClass50_143 = class50_45_;
		aClass50_1011 = js5;
		Class120_Sub21.anInterface1_2668 = interface1;
		if (aClass50_143 != null) {
			MagnetType.anInt269 = aClass50_143.getFileAmount(1);
		}
		if (aClass50_1011 != null) {
			Class192.anInt2120 = aClass50_1011.getFileAmount(1);
		}
	}

	static final QuickChatMessageType list(final int id) {
		QuickChatMessageType quickChatMessageType = (QuickChatMessageType) recentUse.get(id);
		if (quickChatMessageType != null) {
			return quickChatMessageType;
		}
		byte[] is;
		if (id >= 32768) {
			is = aClass50_1011.getFile(1, id & 0x7fff);
		} else {
			is = aClass50_143.getFile(1, id);
		}
		quickChatMessageType = new QuickChatMessageType();
		if (is != null) {
			quickChatMessageType.decode(new Buffer(is));
		}
		if (id >= 32768) {
			quickChatMessageType.method1507();
		}
		recentUse.put(quickChatMessageType, id);
		return quickChatMessageType;
	}

	public QuickChatMessageType() {
		/* empty */
	}
}
