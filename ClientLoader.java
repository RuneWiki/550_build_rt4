/* ClientLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientLoader extends Applet {
	public static final boolean useRsa = false;
	public static final boolean USEISAAC = false;
	public static Properties props = new Properties();
	public JFrame frame;
	private final JPanel jp = new JPanel();
	public static String world;

	public static void main(final String[] strings) {
		new ClientLoader("1");
	}

	public ClientLoader(final String string) {
		try {
			world = string;
			frame = new JFrame("#iRS Client.");
			frame.setLayout(new BorderLayout());
			frame.setResizable(true);
			jp.setLayout(new BorderLayout());
			jp.add(this);
			jp.setPreferredSize(new Dimension(765, 503));
			frame.getContentPane().add(jp, "Center");
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			props.put("worldid", world);
			props.put("members", "1");
			props.put("modewhat", "0");
			props.put("modewhere", "0");
			props.put("safemode", "0");
			props.put("game", "0");
			props.put("js", "1");
			props.put("lang", "0");
			props.put("affid", "0");
			props.put("settings", "kKmok3kJqOeN6D3mDdihco3oPeYN2KFy6W5--vZUbNA");
			props.put("highmem", "0");
			final Signlink signlink = new Signlink(this, 32, "runescape", 29);
			GameShell.providesignlink(signlink);
			final client var_client = new client();
			var_client.init();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public String getParameter(final String string) {
		return (String) props.get(string);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL("http://127.0.0.1");
		} catch (final MalformedURLException malformedurlexception) {
			malformedurlexception.printStackTrace();
			return null;
		}
		return url;
	}
}
