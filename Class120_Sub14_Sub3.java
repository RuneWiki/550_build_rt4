/* Class120_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub14_Sub3 extends NodeSub {
	static boolean aBoolean3463;

	abstract Object method1429(boolean bool);

	abstract boolean method1430(int i);

	static final int method1431(final int i, final int i_0_, final byte[] is) {
		int i_1_;
		try {
			if (i_0_ != 0) {
				method1431(-18, -34, null);
			}
			i_1_ = NodeSub.getCrc(is, 0, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cn.B(").append(i).append(',').append(i_0_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return i_1_;
	}

	static final InterfaceChangeNode putInterfaceChange(final int type, final int uid) {
		InterfaceChangeNode class120_sub14_sub7_4_ = (InterfaceChangeNode) Class120_Sub14_Sub10.aClass75_3534.method659((long) type << 32 | uid, -126);
		if (class120_sub14_sub7_4_ == null) {
			class120_sub14_sub7_4_ = new InterfaceChangeNode(type, uid);
			Class120_Sub14_Sub10.aClass75_3534.method655(class120_sub14_sub7_4_, 108, class120_sub14_sub7_4_.uid);
		}
		return class120_sub14_sub7_4_;
	}
}
