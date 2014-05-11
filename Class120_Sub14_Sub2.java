/* Class120_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub2 extends NodeSub {
	static int anInt3450;
	char aChar3451;
	private int anInt3452;
	static Class120_Sub14_Sub18[] aClass120_Sub14_Sub18Array3453 = new Class120_Sub14_Sub18[14];
	static int anInt3454;
	static String aString3455 = "M";
	static int anInt3456;
	private String aString3457 = "null";
	char aChar3458;
	private Class75 aClass75_3459;
	static Class112 aClass112_3460;
	Class75 aClass75_3461;
	static long aLong3462;

	static {
		anInt3450 = 0;
		aLong3462 = 0L;
	}

	final int method1417(final int i, final int i_0_) {
		int i_1_;
		try {
			if (this.aClass75_3461 == null) {
				return anInt3452;
			}
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) this.aClass75_3461.method659(i_0_, -127);
			if (class120_sub32 == null) {
				return anInt3452;
			}
			if (i != 0) {
				return 46;
			}
			i_1_ = class120_sub32.anInt2790;
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.L(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	private final void method1418(final int i) {
		try {
			aClass75_3459 = new Class75(this.aClass75_3461.method654(0));
			if (i == 14) {
				for (StringNode class120_sub25 = (StringNode) this.aClass75_3461.method657(i ^ 0x33e2); class120_sub25 != null; class120_sub25 = (StringNode) this.aClass75_3461.method658((byte) -116)) {
					final Class120_Sub21 class120_sub21 = new Class120_Sub21(class120_sub25.value, (int) class120_sub25.uid);
					aClass75_3459.method655(class120_sub21, 103, IsaacCipher.method907((byte) 121, class120_sub25.value));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.F(").append(i).append(')').toString());
		}
	}

	private final void method1419(final int i, final Buffer class120_sub7, final int i_2_) {
		try {
			if (i == 0) {
				if (i_2_ == 1) {
					this.aChar3458 = Class120_Sub12_Sub24.method1328(false, class120_sub7.getByte());
				} else if (i_2_ == 2) {
					this.aChar3451 = Class120_Sub12_Sub24.method1328(false, class120_sub7.getByte());
				} else if (i_2_ == 3) {
					aString3457 = class120_sub7.getJString();
				} else if (i_2_ == 4) {
					anInt3452 = class120_sub7.getInt();
				} else if (i_2_ == 5 || i_2_ == 6) {
					final int i_3_ = class120_sub7.getUShort();
					this.aClass75_3461 = new Class75(Class120_Sub12_Sub17.method1283(i_3_, (byte) 96));
					for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
						final int i_5_ = class120_sub7.getInt();
						Node node;
						if (i_2_ == 5) {
							node = new StringNode(class120_sub7.getJString());
						} else {
							node = new Class120_Sub32(class120_sub7.getInt());
						}
						this.aClass75_3461.method655(node, 95, i_5_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.J(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_2_).append(')').toString());
		}
	}

	final boolean method1420(final int i, final int i_6_) {
		boolean bool;
		try {
			if (this.aClass75_3461 == null) {
				return false;
			}
			if (aClass75_3459 == null) {
				method1423(1740484738);
			}
			if (i != -3) {
				method1417(26, 103);
			}
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass75_3459.method659(i_6_, 20);
			if (class120_sub32 == null) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.C(").append(i).append(',').append(i_6_).append(')').toString());
		}
		return bool;
	}

	static final void method1421(final boolean bool) {
		if (bool) {
			if ((Class69.anInt616 ^ 0xffffffff) != 0) {
				Class120_Sub12_Sub32.method1372(-1, Class69.anInt616);
			}
			for (Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method657(13292); class120_sub26 != null; class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method658((byte) -65)) {
				Class120_Sub19.method1675(class120_sub26, true);
			}
			Class69.anInt616 = -1;
			Class120_Sub12_Sub13.aClass75_3234 = new Class75(8);
			Class43.method342(-6086);
			Class69.anInt616 = GameShell.anInt3;
			Class101_Sub2.method846((byte) 44, false);
			Class132_Sub1.method1931(121);
			Class46.method376(true, Class69.anInt616);
		}
		Class192.anInt2123 = -1;
		Class120_Sub12_Sub6.method1225(Class107.defaultCursorId, -77);
		Class100.selfPlayer = new Player();
		Class100.selfPlayer.z = 3000;
		Class100.selfPlayer.x = 3000;
		if (HDToolkit.glEnabled || Buffer.gameId != 0) {
			if (client.anInt2200 != 2) {
				Class120_Sub14_Sub6.method1445((byte) 114);
			} else {
				Class83.anInt792 = Class99.anInt951 << 7;
				Class120_Sub14_Sub21.anInt3626 = Class134.anInt1280 << 7;
			}
			if (HDToolkit.glEnabled) {
				Class120_Sub8.method1159();
			}
			Class128.method1900(0);
			Class120_Sub14_Sub1.setGameState(28);
		} else {
			Class85.method725((byte) -55, Class7.aClass50_63);
			Class120_Sub14_Sub1.setGameState(10);
		}
	}

	final String method1422(final int i) {
		if (this.aClass75_3461 == null) {
			return aString3457;
		}
		final StringNode class120_sub25 = (StringNode) this.aClass75_3461.method659(i, -33);
		if (class120_sub25 == null) {
			return aString3457;
		}
		return class120_sub25.value;
	}

	private final void method1423(final int i) {
		try {
			aClass75_3459 = new Class75(this.aClass75_3461.method654(0));
			if (i == 1740484738) {
				for (Class120_Sub32 class120_sub32 = (Class120_Sub32) this.aClass75_3461.method657(13292); class120_sub32 != null; class120_sub32 = (Class120_Sub32) this.aClass75_3461.method658((byte) -87)) {
					final Class120_Sub32 class120_sub32_8_ = new Class120_Sub32((int) class120_sub32.uid);
					aClass75_3459.method655(class120_sub32_8_, 122, class120_sub32.anInt2790);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.I(").append(i).append(')').toString());
		}
	}

	public static void method1424(final int i) {
		try {
			if (i != 0) {
				method1428(null, null);
			}
			aClass112_3460 = null;
			aString3455 = null;
			aClass120_Sub14_Sub18Array3453 = null;
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.G(").append(i).append(')').toString());
		}
	}

	final void method1425(final boolean bool, final Buffer class120_sub7) {
		try {
			if (bool) {
				anInt3454 = 75;
			}
			for (;;) {
				final int i = class120_sub7.getUByte();
				if (i == 0) {
					break;
				}
				method1419(0, class120_sub7, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.K(").append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final DisplayModeInfo[] getDisplayModes(final Signlink signlink) {
		if (!signlink.canUseFullscreen()) {
			return new DisplayModeInfo[0];
		}
		final SignlinkNode signlinkNode = signlink.getDisplayModeInfo();
		while (signlinkNode.status == 0) {
			PacketBuffer.sleepWrapper(10L);
		}
		if (signlinkNode.status == 2) {
			return new DisplayModeInfo[0];
		}
		final int[] info = (int[]) signlinkNode.value;
		final DisplayModeInfo[] displayModes = new DisplayModeInfo[info.length >> 2];
		for (int id = 0; id < displayModes.length; id++) {
			final DisplayModeInfo displayModeInfo = new DisplayModeInfo();
			displayModes[id] = displayModeInfo;
			displayModeInfo.width = info[id << 2];
			displayModeInfo.height = info[(id << 2) + 1];
			displayModeInfo.bitDepth = info[(id << 2) + 2];
			displayModeInfo.refreshRate = info[(id << 2) + 3];
		}
		return displayModes;
	}

	public Class120_Sub14_Sub2() {
		/* empty */
	}

	final boolean method1427(final int i, final String string) {
		boolean bool;
		try {
			if (i != 25778) {
				this.aChar3458 = '&';
			}
			if (this.aClass75_3461 == null) {
				return false;
			}
			if (aClass75_3459 == null) {
				method1418(i ^ 0x64bc);
			}
			for (Class120_Sub21 class120_sub21 = (Class120_Sub21) aClass75_3459.method659(IsaacCipher.method907((byte) 75, string), 114); class120_sub21 != null; class120_sub21 = (Class120_Sub21) aClass75_3459.method661((byte) 102)) {
				if (class120_sub21.aString2666.equals(string)) {
					return true;
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.E(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	static final RuntimeException_Sub1 method1428(final Throwable throwable, final String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (!(throwable instanceof RuntimeException_Sub1)) {
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		} else {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			final StringBuffer stringbuffer = new StringBuffer();
			final RuntimeException_Sub1 runtimeexception_sub1_11_ = runtimeexception_sub1;
			runtimeexception_sub1_11_.aString2141 = stringbuffer.append(runtimeexception_sub1_11_.aString2141).append(' ').append(string).toString();
		}
		return runtimeexception_sub1;
	}
}
