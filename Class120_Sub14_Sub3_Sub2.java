/* Class120_Sub14_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class120_Sub14_Sub3_Sub2 extends Class120_Sub14_Sub3 {
	private final SoftReference aSoftReference3919;

	@Override
	final boolean method1430(final int i) {
		if (i != -1249071392) {
			return false;
		}
		return true;
	}

	Class120_Sub14_Sub3_Sub2(final Object object) {
		aSoftReference3919 = new SoftReference(object);
	}

	@Override
	final Object method1429(final boolean bool) {
		if (bool) {
			method1429(false);
		}
		return aSoftReference3919.get();
	}
}
