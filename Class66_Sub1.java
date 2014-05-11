/* Class66_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class66_Sub1 extends Class66 {
	private ByteBuffer aByteBuffer2228;

	@Override
	final byte[] method580(final int i) {
		final byte[] is = new byte[aByteBuffer2228.capacity()];
		if (i != -9747) {
			aByteBuffer2228 = null;
		}
		aByteBuffer2228.position(0);
		aByteBuffer2228.get(is);
		return is;
	}

	@Override
	final void method581(final int i, final byte[] is) {
		aByteBuffer2228 = ByteBuffer.allocateDirect(is.length);
		aByteBuffer2228.position(i);
		aByteBuffer2228.put(is);
	}
}
