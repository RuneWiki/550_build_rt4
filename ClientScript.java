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
	static NodeCache recentUse;
	static int anInt3558 = 0;

	static final void percentToZoom(final int percent) {
		Class120_Sub2.anInt2422 = -1;
		if (percent == 37) {
			WorldMapHandler.wantedZoom = 3.0F;
		} else if (percent == 50) {
			WorldMapHandler.wantedZoom = 4.0F;
		} else if (percent == 75) {
			WorldMapHandler.wantedZoom = 6.0F;
		} else if (percent == 100) {
			WorldMapHandler.wantedZoom = 8.0F;
		} else if (percent == 200) {
			WorldMapHandler.wantedZoom = 16.0F;
		}
		Class120_Sub2.anInt2422 = -1;
	}

	public ClientScript() {
		/* empty */
	}

	static final ClientScript list(final int id) {
		ClientScript clientScript = (ClientScript) recentUse.get(id);
		if (clientScript != null) {
			return clientScript;
		}
		final byte[] is = IsaacCipher.scriptsJs5.getFile(id, 0);
		if (is == null || is.length <= 1) {
			return null;
		}
		clientScript = decode(is);
		recentUse.put(clientScript, id);
		return clientScript;
	}

	static final ClientScript decode(final byte[] data) {
		final ClientScript clientScript = new ClientScript();
		final Buffer buffer = new Buffer(data);
		buffer.pos = buffer.buf.length - 2;
		final int i_23_ = buffer.getUShort();
		final int i_24_ = -12 + buffer.buf.length + -2 - i_23_;
		buffer.pos = i_24_;
		final int opcodeCount = buffer.getInt();
		clientScript.intArgumentCount = buffer.getUShort();
		clientScript.stringArgumentCount = buffer.getUShort();
		clientScript.anInt3553 = buffer.getUShort();
		clientScript.anInt3547 = buffer.getUShort();
		final int i_26_ = buffer.getUByte();
		if (i_26_ > 0) {
			clientScript.aClass75Array3552 = new Hashtable[i_26_];
			for (int i_27_ = 0; i_26_ > i_27_; i_27_++) {
				int i_28_ = buffer.getUShort();
				final Hashtable hashtable = new Hashtable(Class120_Sub12_Sub17.getFarestBitValue(i_28_));
				clientScript.aClass75Array3552[i_27_] = hashtable;
				while (i_28_-- > 0) {
					final int i_29_ = buffer.getInt();
					final int i_30_ = buffer.getInt();
					hashtable.put(new IntegerNode(i_30_), i_29_);
				}
			}
		}
		int opcodePos = 0;
		buffer.pos = 0;
		clientScript.name = buffer.getFastJagexString();
		clientScript.stringValues = new String[opcodeCount];
		clientScript.opcodes = new int[opcodeCount];
		clientScript.intValues = new int[opcodeCount];
		while (buffer.pos < i_24_) {
			final int opcodeId = buffer.getUShort();
			if (opcodeId == 3) {
				clientScript.stringValues[opcodePos] = buffer.getJagexString().intern();
			} else if (opcodeId >= 100 || opcodeId == 21 || opcodeId == 38 || opcodeId == 39) {
				clientScript.intValues[opcodePos] = buffer.getUByte();
			} else {
				clientScript.intValues[opcodePos] = buffer.getInt();
			}
			clientScript.opcodes[opcodePos++] = opcodeId;
		}
		return clientScript;
	}
}
