/* Class122_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class BasicGraphicsBuffer extends AbstractGraphicsBuffer {
	private Component component;

	@Override
	final void init(final Component component, final int width, final int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[width * height + 1];
		final DataBufferInt databufferint = new DataBufferInt(this.pixels, this.pixels.length);
		final DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		final WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.width, this.height), databufferint, null);
		this.image = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		this.component = component;
		init2dCanvas();
	}

	@Override
	final void drawClippedImage(final Graphics graphics, final int i_3_, final int i, final int i_2_, final int i_4_) {
		final Shape shape = graphics.getClip();
		graphics.clipRect(i_4_, i_2_, i, i_3_);
		graphics.drawImage(this.image, 0, 0, component);
		graphics.setClip(shape);
	}

	@Override
	final void drawImage(final Graphics graphics, final int x, final int y) {
		graphics.drawImage(this.image, x, y, component);
	}
}
