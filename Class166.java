/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	static int anInt1612 = 0;
	static final void method2178(final js5 js5, final boolean bool, final js5 class50_0_) {
		Class69_Sub2.aBoolean2234 = bool;
		Class120_Sub12_Sub36.aClass50_3418 = class50_0_;
		Class120_Sub6.aClass50_2450 = js5;
	}

	static final void method2180(final GameEntity class180_sub5, final boolean bool) {
		try {
			if (bool) {
				final int i = -Class101_Sub2.loopCycle + class180_sub5.anInt3035;
				final int i_1_ = class180_sub5.anInt2967 * 128 - -(class180_sub5.getSize() * 64);
				final int i_2_ = class180_sub5.anInt3034 * 128 - -(64 * class180_sub5.getSize());
				if (class180_sub5.anInt3008 == 0) {
					class180_sub5.anInt3019 = 1024;
				}
				class180_sub5.z += (i_2_ - class180_sub5.z) / i;
				class180_sub5.x += (i_1_ - class180_sub5.x) / i;
				if (class180_sub5.anInt3008 == 1) {
					class180_sub5.anInt3019 = 1536;
				}
				class180_sub5.anInt3037 = 0;
				if (class180_sub5.anInt3008 == 2) {
					class180_sub5.anInt3019 = 0;
				}
				if (class180_sub5.anInt3008 == 3) {
					class180_sub5.anInt3019 = 512;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tl.A(").append(class180_sub5 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	static final void kickUser(final String string) {
		if (Class120_Sub28.clanMembers != null) {
			int i_4_ = 0;
			final long nameAsLong = Varp.stringToLong(string);
			if (0L != nameAsLong) {
				for (/**/; Class120_Sub28.clanMembers.length > i_4_ && nameAsLong != Class120_Sub28.clanMembers[i_4_].uid; i_4_++) {
					/* empty */
				}
				if (Class120_Sub28.clanMembers.length > i_4_ && Class120_Sub28.clanMembers[i_4_] != null) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(75);
					Class120_Sub12_Sub11.outputStream.putLong(Class120_Sub28.clanMembers[i_4_].uid);
				}
			}
		}
	}
}
