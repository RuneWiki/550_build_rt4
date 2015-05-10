/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	static int anInt1612 = 0;
	
	static final void method2178(final js5 js5, final boolean bool, final js5 class50_0_) {
		Class69_Sub2.locMemberClient = bool;
		Class120_Sub12_Sub36.aClass50_3418 = class50_0_;
		Class120_Sub6.aClass50_2450 = js5;
	}

	static final void method2180(final GameEntity gameEntity) {
		final int i = gameEntity.anInt3035 - Class101_Sub2.loopCycle;
		final int i_1_ = gameEntity.anInt2967 * 128 + (gameEntity.getSize() * 64);
		final int i_2_ = gameEntity.anInt3034 * 128 + (gameEntity.getSize() * 64);
		gameEntity.x += (i_1_ - gameEntity.x) / i;
		gameEntity.z += (i_2_ - gameEntity.z) / i;
		if (gameEntity.anInt3008 == 0) {
			gameEntity.newFaceDegrees = 1024;
		}
		if (gameEntity.anInt3008 == 1) {
			gameEntity.newFaceDegrees = 1536;
		}
		if (gameEntity.anInt3008 == 2) {
			gameEntity.newFaceDegrees = 0;
		}
		if (gameEntity.anInt3008 == 3) {
			gameEntity.newFaceDegrees = 512;
		}
		gameEntity.anInt3037 = 0;
	}

	static final void kickUser(final String string) {
		if (ReflectionCheckNode.clanMembers != null) {
			int i_4_ = 0;
			final long nameAsLong = Varp.stringToLong(string);
			if (0L != nameAsLong) {
				for (/**/; ReflectionCheckNode.clanMembers.length > i_4_ && nameAsLong != ReflectionCheckNode.clanMembers[i_4_].uid; i_4_++) {
					/* empty */
				}
				if (ReflectionCheckNode.clanMembers.length > i_4_ && ReflectionCheckNode.clanMembers[i_4_] != null) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(75);
					Class120_Sub12_Sub11.outputStream.putLong(ReflectionCheckNode.clanMembers[i_4_].uid);
				}
			}
		}
	}
}
