/* Class17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class MouseWheelHandler extends AbstractMouseWheelHandler implements MouseWheelListener {
	private int rotation = 0;

	@Override
	final synchronized int getRotation() {
		final int rot = rotation;
		rotation = 0;
		return rot;
	}

	@Override
	public final synchronized void mouseWheelMoved(final MouseWheelEvent mousewheelevent) {
		rotation += mousewheelevent.getWheelRotation();
	}

	@Override
	final void removeListener(final Component component) {
		component.removeMouseWheelListener(this);
	}

	@Override
	final void addListener(final Component component) {
		component.addMouseWheelListener(this);
	}
}
