/* Class180_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SceneGroundObject extends SceneGraphNode {
	static js5 aClass50_2839;
	static int spriteTrimHeight;
	static ObjectCache aClass21_2841;
	private int maxY = -32768;
	static int anInt2843;
	static Class120_Sub9[][] aClass120_Sub9ArrayArray2844;
	int amount;
	int id;
	static String aString2847 = "Loaded wordpack";
	static boolean packetSetFlagPosition;
	static String aString2849;

	static {
		aClass21_2841 = new ObjectCache(64);
		packetSetFlagPosition = true;
		aString2849 = "Please remove ";
	}

	@Override
	final int getMaxY() {
		return maxY;
	}

	@Override
	final void render(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final long l, final int i_7_, final ParticleEngine class108_sub2) {
		final AbstractModelRenderer class180_sub7 = ObjType.list(this.id).method2105(0, this.amount, -1, null, null, 0);
		if (class180_sub7 != null) {
			class180_sub7.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, class108_sub2);
			maxY = class180_sub7.getMaxY();
		}
	}

	static final void method2276() {
		ParticleEngine.process(Class101_Sub2.loopCycle);
		if (Class69.rootInterfaceId != -1) {
			AbstractGraphicsBuffer.animateInterface(Class69.rootInterfaceId);
		}
		for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
			if (MasterIndexInfo.needInterfaceRedrawWrapper[id]) {
				Class120_Sub12_Sub33.needScreenRedraw[id] = true;
			}
			Class9.needInterfaceRedraw[id] = MasterIndexInfo.needInterfaceRedrawWrapper[id];
			MasterIndexInfo.needInterfaceRedrawWrapper[id] = false;
		}
		GZIPDecompressor.anInt796 = Class101_Sub2.loopCycle;
		StructType.aClass189_3588 = null;
		LookupTable.anInt497 = -1;
		if (HDToolkit.glEnabled) {
			Class167.aBoolean1620 = true;
		}
		StructType.anInt3590 = -1;
		if (Class69.rootInterfaceId != -1) {
			LabelGroup.screenRedrawPos = 0;
			LookupTable.method486();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.method597();
		} else {
			GraphicsLD.method2175();
		}
		Class120_Sub12_Sub22.redrawRate = 0;
	}

	public static void method2277() {
		aClass21_2841 = null;
		aString2849 = null;
		aString2847 = null;
		aClass50_2839 = null;
		aClass120_Sub9ArrayArray2844 = null;
	}

	@Override
	final void method2266(final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		/* empty */
	}

}
