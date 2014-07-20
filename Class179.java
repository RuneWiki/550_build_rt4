/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class179 {
	static SubScript[] subScripts;
	static int[][] anIntArrayArray1774;
	static int anInt1775 = 0;
	static client aClient1776;
	static byte[][] aByteArrayArray1777;
	static js5 aClass50_1778;
	static boolean aBoolean1779;

	static {
		subScripts = new SubScript[50];
		aBoolean1779 = true;
	}

	public static void method2259(final int i) {
		try {
			subScripts = null;
			aByteArrayArray1777 = null;
			if (i == 27440) {
				anIntArrayArray1774 = null;
				aClient1776 = null;
				aClass50_1778 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("va.F(").append(i).append(')').toString());
		}
	}

	static final void method2260(final boolean bool, final int i) {
		try {
			if (bool) {
				method2263(39);
			}
			Class120_Sub2.anInt2422 = -1;
			Class120_Sub2.anInt2422 = -1;
			Class169.anInt1646 = i;
			Class127.method1889((byte) 51);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("va.E(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	static final void method2261(final int i, final int i_0_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(i_0_, i);
			class120_sub14_sub7.method1453();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("va.B(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method2262(final int i) {
		try {
			final int i_1_ = Canvas_Sub1.inputStream.getBitValue(8);
			if (i == -16097) {
				if (FileSystemWorker.localPlayerCount > i_1_) {
					for (int i_2_ = i_1_; i_2_ < FileSystemWorker.localPlayerCount; i_2_++) {
						Class43.anIntArray366[Class120_Sub12_Sub23.anInt3307++] = Class112.playerIndices[i_2_];
					}
				}
				if (i_1_ > FileSystemWorker.localPlayerCount) {
					throw new RuntimeException("gppov1");
				}
				FileSystemWorker.localPlayerCount = 0;
				for (int i_3_ = 0; i_1_ > i_3_; i_3_++) {
					final int i_4_ = Class112.playerIndices[i_3_];
					final Player class180_sub5_sub1 = Class118.playersList[i_4_];
					final int i_5_ = Canvas_Sub1.inputStream.getBitValue(1);
					if (i_5_ == 0) {
						Class112.playerIndices[FileSystemWorker.localPlayerCount++] = i_4_;
						class180_sub5_sub1.anInt2985 = Class101_Sub2.loopCycle;
					} else {
						final int i_6_ = Canvas_Sub1.inputStream.getBitValue(2);
						if (i_6_ == 0) {
							Class112.playerIndices[FileSystemWorker.localPlayerCount++] = i_4_;
							class180_sub5_sub1.anInt2985 = Class101_Sub2.loopCycle;
							Class169.anIntArray1648[Class154.anInt1441++] = i_4_;
						} else if (i_6_ == 1) {
							Class112.playerIndices[FileSystemWorker.localPlayerCount++] = i_4_;
							class180_sub5_sub1.anInt2985 = Class101_Sub2.loopCycle;
							final int i_7_ = Canvas_Sub1.inputStream.getBitValue(3);
							class180_sub5_sub1.move(i_7_, 1);
							final int i_8_ = Canvas_Sub1.inputStream.getBitValue(1);
							if (i_8_ == 1) {
								Class169.anIntArray1648[Class154.anInt1441++] = i_4_;
							}
						} else if (i_6_ == 2) {
							Class112.playerIndices[FileSystemWorker.localPlayerCount++] = i_4_;
							class180_sub5_sub1.anInt2985 = Class101_Sub2.loopCycle;
							if (Canvas_Sub1.inputStream.getBitValue(1) == 1) {
								final int i_9_ = Canvas_Sub1.inputStream.getBitValue(3);
								class180_sub5_sub1.move(i_9_, 2);
								final int i_10_ = Canvas_Sub1.inputStream.getBitValue(3);
								class180_sub5_sub1.move(i_10_, 2);
							} else {
								final int i_11_ = Canvas_Sub1.inputStream.getBitValue(3);
								class180_sub5_sub1.move(i_11_, 0);
							}
							final int i_12_ = Canvas_Sub1.inputStream.getBitValue(1);
							if (i_12_ == 1) {
								Class169.anIntArray1648[Class154.anInt1441++] = i_4_;
							}
						} else if (i_6_ == 3) {
							Class43.anIntArray366[Class120_Sub12_Sub23.anInt3307++] = i_4_;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("va.D(").append(i).append(')').toString());
		}
	}

	static final void method2263(final int i_13_) {
		final ObjectContainer class120_sub17 = (ObjectContainer) ObjectContainer.objectContainerCache.get(i_13_);
		if (class120_sub17 != null) {
			for (int i_14_ = 0; i_14_ < class120_sub17.objectIds.length; i_14_++) {
				class120_sub17.objectIds[i_14_] = -1;
				class120_sub17.objectCounts[i_14_] = 0;
			}
		}
	}

	static final boolean method2264(final byte i, final int i_15_) {
		boolean bool;
		try {
			bool = i_15_ == (i_15_ & -i_15_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("va.A(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return bool;
	}
}
