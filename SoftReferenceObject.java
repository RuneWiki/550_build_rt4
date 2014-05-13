/* Class120_Sub14_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class SoftReferenceObject extends AbstractObject {
	private final SoftReference softReference;

	@Override
	final boolean isSoftReference() {
		return true;
	}

	SoftReferenceObject(final Object object) {
		softReference = new SoftReference(object);
	}

	@Override
	final Object get() {
		return softReference.get();
	}
}
