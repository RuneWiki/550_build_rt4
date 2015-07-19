/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148 {
	static int localNpcCount = 0;
	static WorldInfo[] worldsInfo;

	static final int encodeText(final Buffer buffer, final String string) {
		final int i_8_ = buffer.pos;
		final byte[] is = Class120_Sub6.method1075(string);
		buffer.putSmart(is.length);
		buffer.pos += client.huffman.method1885(buffer.pos, buffer.buf, is, 0, is.length);
		return buffer.pos - i_8_;
	}
}
