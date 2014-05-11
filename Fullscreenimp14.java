/* Display - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Fullscreenimp14 {
	private GraphicsDevice defaultGraphicsDevice;
	private DisplayMode displayMode;

	public void revert() {
		if (displayMode != null) {
			defaultGraphicsDevice.setDisplayMode(displayMode);
			if (!defaultGraphicsDevice.getDisplayMode().equals(displayMode)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			displayMode = null;
		}
		method295(null);
	}

	public void setDisplayMode(final Frame frame, final int height, final int width, final int bitDepth, int refreshRate) {
		displayMode = defaultGraphicsDevice.getDisplayMode();
		if (displayMode == null) {
			throw new NullPointerException();
		}
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method295(frame);
		if (refreshRate == 0) {
			boolean bool = false;
			final int currentRate = displayMode.getRefreshRate();
			final DisplayMode[] displaymodes = defaultGraphicsDevice.getDisplayModes();
			for (final DisplayMode displaymode : displaymodes) {
				if (width == displaymode.getWidth() && displaymode.getHeight() == height && bitDepth == displaymode.getBitDepth()) {
					final int dmRefreshRate = displaymode.getRefreshRate();
					if (!bool || Math.abs(dmRefreshRate - currentRate) < Math.abs(refreshRate - currentRate)) {
						refreshRate = dmRefreshRate;
						bool = true;
					}
				}
			}
			if (!bool) {
				refreshRate = currentRate;
			}
		}
		defaultGraphicsDevice.setDisplayMode(new DisplayMode(width, height, bitDepth, refreshRate));
	}

	public Fullscreenimp14() throws Exception {
		final GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		defaultGraphicsDevice = graphicsenvironment.getDefaultScreenDevice();
		if (!defaultGraphicsDevice.isFullScreenSupported()) {
			final GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			int i = 0;
			for (final GraphicsDevice[] graphicsdevices_7_ = graphicsdevices; i < graphicsdevices_7_.length; i++) {
				final GraphicsDevice graphicsdevice = graphicsdevices_7_[i];
				if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
					defaultGraphicsDevice = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	public int[] getDisplayModesInfo() {
		final DisplayMode[] displaymodes = defaultGraphicsDevice.getDisplayModes();
		final int[] info = new int[displaymodes.length << 2];
		for (int mode = 0; mode < displaymodes.length; mode++) {
			info[mode << 2] = displaymodes[mode].getWidth();
			info[(mode << 2) + 1] = displaymodes[mode].getHeight();
			info[(mode << 2) + 2] = displaymodes[mode].getBitDepth();
			info[(mode << 2) + 3] = displaymodes[mode].getRefreshRate();
		}
		return info;
	}

	private void method295(final Frame frame) {
		boolean bool = false;
		try {
			final Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			final boolean bool_9_ = ((Boolean) field.get(defaultGraphicsDevice)).booleanValue();
			if (bool_9_) {
				field.set(defaultGraphicsDevice, Boolean.FALSE);
				bool = true;
			}
		} catch (final Throwable throwable) {
			/* empty */
		}
		try {
			defaultGraphicsDevice.setFullScreenWindow(frame);
		} catch (final RuntimeException runtimeexception) {
			if (bool) {
				try {
					final Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(defaultGraphicsDevice, Boolean.TRUE);
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
			throw runtimeexception;
		}
		if (bool) {
			try {
				final Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
				field.set(defaultGraphicsDevice, Boolean.TRUE);
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}
}
