/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

/*
 There are three hints for how frequently the user will be changing the buffer's data.
	STATIC: The user will set the data once.
	DYNAMIC: The user will set the data occasionally.
	STREAM: The user will be changing the data after every use. Or almost every use.
 */
final class VertexBuffer {
	private final int anInt1003;
	private final boolean useStreamDraw;
	private int anInt1005 = 0;
	private int bufferId = -1;

	final void method883(final ByteBuffer bytebuffer) {
		if (bytebuffer.limit() <= anInt1005) {
			final GL gl = HDToolkit.gl;
			gl.glBindBufferARB(34962, bufferId);//ARRAY_BUFFER
			gl.glBufferSubDataARB(34962, 0, bytebuffer.limit(), bytebuffer);//ARRAY_BUFFER
		} else {
			method885(bytebuffer);
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		if (bufferId != -1) {
			MemoryManager.method1000(bufferId, anInt1005, anInt1003);
			bufferId = -1;
			anInt1005 = 0;
		}
		super.finalize();
	}

	final void method884(final ByteBuffer bytebuffer) {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34963, bufferId);//ELEMENT_ARRAY_BUFFER
		gl.glBufferDataARB(34963, bytebuffer.limit(), bytebuffer, useStreamDraw ? 35040 : 35044);//ELEMENT_ARRAY_BUFFER, STREAM_DRAW : STATIC_DRAW
		MemoryManager.anInt1082 += bytebuffer.limit() - anInt1005;
		anInt1005 = bytebuffer.limit();
	}

	final void method885(final ByteBuffer bytebuffer) {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34962, bufferId);//ARRAY_BUFFER
		gl.glBufferDataARB(34962, bytebuffer.limit(), bytebuffer, useStreamDraw ? 35040 : 35044);//ARRAY_BUFFER, STREAM_DRAW : STATIC_DRAW
		MemoryManager.anInt1082 += bytebuffer.limit() - anInt1005;
		anInt1005 = bytebuffer.limit();
	}

	public VertexBuffer() {
		this(false);
	}

	final void bindElementArrayBuffer() {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34963, bufferId);//ELEMENT_ARRAY_BUFFER
	}

	final void bindArrayBuffer() {
		final GL gl = HDToolkit.gl;
		gl.glBindBufferARB(34962, bufferId);//ARRAY_BUFFER
	}

	VertexBuffer(final boolean bool) {
		final GL gl = HDToolkit.gl;
		final int[] ids = new int[1];
		gl.glGenBuffersARB(1, ids, 0);
		useStreamDraw = bool;
		bufferId = ids[0];
		anInt1003 = MemoryManager.anInt1083;
	}
}
