/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class77 {
	
	static final Object method666(final Applet applet, final String string) throws Throwable {
		return JSObject.getWindow(applet).call(string, null);
	}

	static final Object method667(final Object[] objects, final Applet applet, final String string) throws Throwable {
		return JSObject.getWindow(applet).call(string, objects);
	}

	static final void method668(final String string, final Applet applet) throws Throwable {
		JSObject.getWindow(applet).eval(string);
	}
}
