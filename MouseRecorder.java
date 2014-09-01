/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MouseRecorder implements Runnable {
	static int anInt852 = 0;
	static String aString853 = "Allocating memory";
	static String aString854;
	static boolean frameResizable = false;
	static float aFloat856;
	Object lock;
	boolean running = true;
	int cacheIndex;
	int[] mouseYCache;
	int[] mouseXCache;

	static {
		aString854 = "K";
	}

	static final void setupShaderRenderValues(final int x, final int y, final int z, final int yaw, final int pitch) {
		Projectile.renderXWrapper = x;
		Class120_Sub12_Sub27.renderYWrapper = y;
		Class69_Sub1.renderZWrapper = z;
		Class145.renderYawWrapper = yaw;
		Class120_Sub14_Sub13.renderPitchWrapper = pitch;
	}

	public static void method762(final byte i) {
		try {
			aString853 = null;
			if (i == -59) {
				aString854 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jm.C(").append(i).append(')').toString());
		}
	}

	@Override
	public final void run() {
		while (this.running) {
			synchronized (this.lock) {
				if (this.cacheIndex < 500) {
					this.mouseXCache[this.cacheIndex] = Queue.lastMouseX;
					this.mouseYCache[this.cacheIndex] = Class191.lastMouseY;
					this.cacheIndex++;
				}
			}
			PacketBuffer.sleepWrapper(50L);
		}
	}

	static final void selectSpell(final int i, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_) {
		final JagexInterface jagexInterface = JagexInterface.getComponent(i_10_, i_8_);
		if (jagexInterface != null && jagexInterface.onSpellSelectionListener != null) {
			final InterfaceListener class120_sub10 = new InterfaceListener();
			class120_sub10.objectData = jagexInterface.onSpellSelectionListener;
			class120_sub10.aClass189_2534 = jagexInterface;
			Class88.method744(class120_sub10);
		}
		Class88.spellSelected = true;
		Class192.selectedSpellCursor = i_7_;
		IdentityKit.selectedSpellParam = i_6_;
		JagexSocket.anInt420 = i_8_;
		Class150.selectedSpellTargetCursor = i_9_;
		AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked = i_10_;
		GroundTile.selectedSpellUseMask = i;
		InterfaceClickMask.redrawInterface(jagexInterface);
	}

	public MouseRecorder() {
		this.lock = new Object();
		this.mouseXCache = new int[500];
		this.mouseYCache = new int[500];
		this.cacheIndex = 0;
	}
}
