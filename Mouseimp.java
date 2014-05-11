/* Sensor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

class Mouseimp {
	private Robot aRobot1444;
	private Component aComponent1445;

	void method2081(Component component, final boolean bool) {
		if (!bool) {
			if (component == null) {
				throw new NullPointerException();
			}
		} else {
			component = null;
		}
		if (component != aComponent1445) {
			if (aComponent1445 != null) {
				aComponent1445.setCursor(null);
				aComponent1445 = null;
			}
			if (component != null) {
				component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
				aComponent1445 = component;
			}
		}
	}

	Mouseimp() throws Exception {
		aRobot1444 = new Robot();
	}

	void setCursor(final Point point, final Component component, final int width, final int height, final int[] pixels) {
		if (pixels == null) {
			component.setCursor(null);
		} else {
			final BufferedImage bufferedimage = new BufferedImage(width, height, 2);
			bufferedimage.setRGB(0, 0, width, height, pixels, 0, width);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		}
	}

	void moveMouse(final int x, final int y) {
		aRobot1444.mouseMove(x, y);
	}
}
