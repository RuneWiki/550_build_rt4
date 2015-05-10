/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MouseRecorder implements Runnable {
	static int anInt852 = 0;
	static boolean frameResizable = false;
	static float aFloat856;
	Object lock;
	boolean running = true;
	int cacheIndex;
	int[] mouseYCache;
	int[] mouseXCache;

	static final void setupShaderRenderValues(final int x, final int y, final int z, final int yaw, final int pitch) {
		Projectile.renderXWrapper = x;
		Class120_Sub12_Sub27.renderYWrapper = y;
		Class69_Sub1.renderZWrapper = z;
		Class145.renderYawWrapper = yaw;
		Class120_Sub14_Sub13.renderPitchWrapper = pitch;
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

	static final void selectSpell(final int mask, final int param, final int cursor, final int componentIndex, final int targetCursor, final int bitPacked) {
		final JagexInterface jagexInterface = JagexInterface.getComponent(bitPacked, componentIndex);
		if (jagexInterface != null && jagexInterface.onSpellSelectionListener != null) {
			final InterfaceListener class120_sub10 = new InterfaceListener();
			class120_sub10.objectData = jagexInterface.onSpellSelectionListener;
			class120_sub10.jagexInterface = jagexInterface;
			Class88.method744(class120_sub10);
		}
		Class88.spellSelected = true;
		Class192.selectedSpellCursor = cursor;
		IdentityKit.selectedSpellParam = param;
		JagexSocket.selectedSpellComponextIndex = componentIndex;
		Class150.selectedSpellTargetCursor = targetCursor;
		AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked = bitPacked;
		GroundTile.selectedSpellUseMask = mask;
		InterfaceClickMask.redrawInterface(jagexInterface);
	}

	public MouseRecorder() {
		this.lock = new Object();
		this.mouseXCache = new int[500];
		this.mouseYCache = new int[500];
		this.cacheIndex = 0;
	}
}
