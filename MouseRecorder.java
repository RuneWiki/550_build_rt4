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
	int[] mouseCacheY;
	int[] mouseCacheX;

	static final void setupShaderRenderValues(final int x, final int y, final int z, final int yaw, final int pitch) {
		Projectile.renderXWrapper = x;
		Class120_Sub12_Sub27.renderYWrapper = y;
		Class69_Sub1.renderZWrapper = z;
		SkyboxType.renderYawWrapper = yaw;
		Class120_Sub14_Sub13.renderPitchWrapper = pitch;
	}

	@Override
	public final void run() {
		while (this.running) {
			synchronized (this.lock) {
				if (this.cacheIndex < 500) {
					this.mouseCacheX[this.cacheIndex] = Queue.lastMouseX;
					this.mouseCacheY[this.cacheIndex] = ChunkAtmosphere.lastMouseY;
					this.cacheIndex++;
				}
			}
			PacketBuffer.sleepWrapper(50L);
		}
	}

	static final void targetEnter(final int mask, final int param, final int cursor, final int componentIndex, final int targetCursor, final int bitPacked) {
		final JagexInterface jagexInterface = JagexInterface.getComponent(bitPacked, componentIndex);
		if (jagexInterface != null && jagexInterface.onTargetEnterListener != null) {
			final InterfaceListener class120_sub10 = new InterfaceListener();
			class120_sub10.objectData = jagexInterface.onTargetEnterListener;
			class120_sub10.jagexInterface = jagexInterface;
			Class88.executeScript(class120_sub10);
		}
		Class88.spellSelected = true;//TODO rename all to target.
		Class192.selectedSpellCursor = cursor;
		Identikit.selectedSpellParam = param;
		JagexSocket.selectedSpellComponextIndex = componentIndex;
		Class150.selectedSpellTargetCursor = targetCursor;
		AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked = bitPacked;
		GroundTile.selectedSpellUseMask = mask;
		InterfaceClickMask.redrawInterface(jagexInterface);
	}

	public MouseRecorder() {
		this.lock = new Object();
		this.mouseCacheX = new int[500];
		this.mouseCacheY = new int[500];
		this.cacheIndex = 0;
	}
}
