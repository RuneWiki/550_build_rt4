/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class49 {
	static int anInt438;
	boolean aBoolean439 = false;
	static js5 aClass50_440;
	static JagexInterface activeYellowBoxComponent;
	int anInt442;
	ByteBuffer aByteBuffer443;
	int anInt444 = 0;
	VertexBuffer aClass104_445;

	static final int method408() {
		if (Class173.anInt1724 == 0) {
			return 0;
		}
		return Class157.shaders[Class173.anInt1724].method4();
	}

	static final void method409(final Class120_Sub30 class120_sub30) {
		class120_sub30.aBoolean2784 = false;
		if (class120_sub30.aClass120_Sub5_2782 != null) {
			class120_sub30.aClass120_Sub5_2782.anInt2442 = 0;
		}
		for (Class120_Sub30 class120_sub30_1_ = class120_sub30.method1736(); class120_sub30_1_ != null; class120_sub30_1_ = class120_sub30.method1735()) {
			method409(class120_sub30_1_);
		}
	}

	public Class49() {
		this.anInt442 = 0;
	}
}
