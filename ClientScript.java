/* Class120_Sub14_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClientScript extends NodeSub {
	int anInt3546;
	int anInt3547;
	int[] intValues;
	static Deque[][][] groundObjects;
	int[] opcodes;
	String[] stringValues;
	Hashtable[] aClass75Array3552;
	int anInt3553;
	String name;
	int stringArgumentCount;
	static int anInt3556 = 0;
	int intArgumentCount;
	static int anInt3558 = 0;

	static final void method1522(final int i) {
		Class120_Sub2.anInt2422 = -1;
		if (i != 37) {
			if (i != 50) {
				if (i == 75) {
					Class79.aFloat698 = 6.0F;
				} else if (i != 100) {
					if (i == 200) {
						Class79.aFloat698 = 16.0F;
					}
				} else {
					Class79.aFloat698 = 8.0F;
				}
			} else {
				Class79.aFloat698 = 4.0F;
			}
		} else {
			Class79.aFloat698 = 3.0F;
		}
		Class120_Sub2.anInt2422 = -1;
	}

	public static void method1523(final int i) {
		try {
			if (i != 37) {
				anInt3556 = -109;
			}
			groundObjects = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jl.A(").append(i).append(')').toString());
		}
	}

	public ClientScript() {
		/* empty */
	}

	static final ClientScript list(final int id) {
		ClientScript class120_sub14_sub12_4_ = (ClientScript) Class128.aClass35_1219.get(id);
		if (class120_sub14_sub12_4_ != null) {
			return class120_sub14_sub12_4_;
		}
		final byte[] is = IsaacCipher.aClass50_1019.getFile(id, 0);
		if (is == null || is.length <= 1) {
			return null;
		}
		class120_sub14_sub12_4_ = ClientScript.decode(is);
		Class128.aClass35_1219.put(class120_sub14_sub12_4_, id);
		return class120_sub14_sub12_4_;
	}

	static final ClientScript decode(final byte[] data) {
		final ClientScript clientScript = new ClientScript();
		final Buffer buffer = new Buffer(data);
		buffer.pos = buffer.buf.length - 2;
		final int i_23_ = buffer.getUShort();
		final int i_24_ = -12 + buffer.buf.length + -2 - i_23_;
		buffer.pos = i_24_;
		final int i_25_ = buffer.getInt();
		clientScript.intArgumentCount = buffer.getUShort();
		clientScript.stringArgumentCount = buffer.getUShort();
		clientScript.anInt3553 = buffer.getUShort();
		clientScript.anInt3547 = buffer.getUShort();
		final int i_26_ = buffer.getUByte();
		if (i_26_ > 0) {
			clientScript.aClass75Array3552 = new Hashtable[i_26_];
			for (int i_27_ = 0; i_26_ > i_27_; i_27_++) {
				int i_28_ = buffer.getUShort();
				final Hashtable hashtable = new Hashtable(Class120_Sub12_Sub17.method1283(i_28_));
				clientScript.aClass75Array3552[i_27_] = hashtable;
				while (i_28_-- > 0) {
					final int i_29_ = buffer.getInt();
					final int i_30_ = buffer.getInt();
					hashtable.put(new IntegerNode(i_30_), i_29_);
				}
			}
		}
		int i_31_ = 0;
		buffer.pos = 0;
		clientScript.name = buffer.getFastJString();
		clientScript.stringValues = new String[i_25_];
		clientScript.opcodes = new int[i_25_];
		clientScript.intValues = new int[i_25_];
		while (buffer.pos < i_24_) {
			final int i_32_ = buffer.getUShort();
			if (i_32_ == 3) {
				clientScript.stringValues[i_31_] = buffer.getJString().intern();
			} else if (i_32_ >= 100 || i_32_ == 21 || i_32_ == 38 || i_32_ == 39) {
				clientScript.intValues[i_31_] = buffer.getUByte();
			} else {
				clientScript.intValues[i_31_] = buffer.getInt();
			}
			clientScript.opcodes[i_31_++] = i_32_;
		}
		return clientScript;
	}
}
