/* Class66_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class JByteBuffer extends AbstractBuffer {
	private ByteBuffer byteBuffer;

	@Override
	final byte[] get() {
		final byte[] buffer = new byte[byteBuffer.capacity()];
		byteBuffer.position(0);
		byteBuffer.get(buffer);
		return buffer;
	}

	@Override
	final void put(final byte[] buffer) {
		byteBuffer = ByteBuffer.allocateDirect(buffer.length);
		byteBuffer.position(0);
		byteBuffer.put(buffer);
	}
}
