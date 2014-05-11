/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class104 {
	private final int anInt1003;
	private final boolean aBoolean1004;
	private int anInt1005 = 0;
	private int anInt1006 = -1;

	final void method883(final ByteBuffer bytebuffer) {
		if (bytebuffer.limit() <= anInt1005) {
			final GL gl = HDToolkit.gl;
			gl.glBindBufferARB(34962, anInt1006);
			gl.glBufferSubDataARB(34962, 0, bytebuffer.limit(), bytebuffer);
		} else {
			method885(bytebuffer);
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		if (anInt1006 != -1) {
			Class113.method1000(anInt1006, anInt1005, anInt1003);
			anInt1006 = -1;
			anInt1005 = 0;
		}
		super.finalize();
	}

	final void method884(final ByteBuffer bytebuffer) {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34963, anInt1006);
		gl.glBufferDataARB(34963, bytebuffer.limit(), bytebuffer, aBoolean1004 ? 35040 : 35044);
		Class113.anInt1082 += bytebuffer.limit() - anInt1005;
		anInt1005 = bytebuffer.limit();
	}

	final void method885(final ByteBuffer bytebuffer) {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34962, anInt1006);
		gl.glBufferDataARB(34962, bytebuffer.limit(), bytebuffer, aBoolean1004 ? 35040 : 35044);
		Class113.anInt1082 += bytebuffer.limit() - anInt1005;
		anInt1005 = bytebuffer.limit();
	}

	public Class104() {
		this(false);
	}

	final void method886() {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34963, anInt1006);
	}

	final void method887() {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34962, anInt1006);
	}

	Class104(final boolean bool) {
		final GL gl = HDToolkit.gl;
		final int[] is = new int[1];
		gl.glGenBuffersARB(1, is, 0);
		aBoolean1004 = bool;
		anInt1006 = is[0];
		anInt1003 = Class113.anInt1083;
	}
}
