/* Class120_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub2 extends NodeSub {
	static int anInt3450;
	char aChar3451;
	private int anInt3452;
	static Class120_Sub14_Sub18[] aClass120_Sub14_Sub18Array3453 = new Class120_Sub14_Sub18[14];
	static int worldLen;
	static String aString3455 = "M";
	static int anInt3456;
	private String aString3457 = "null";
	char aChar3458;
	private Hashtable aClass75_3459;
	static Class112 aClass112_3460;
	Hashtable aClass75_3461;
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
			final IntegerNode class120_sub32 = (IntegerNode) this.aClass75_3461.get(i_0_);
			if (class120_sub32 == null) {
				return anInt3452;
			}
			if (i != 0) {
				return 46;
			}
			i_1_ = class120_sub32.value;
		} catch (final RuntimeException runtimeexception) {
			throw method1428(runtimeexception, new StringBuilder("cj.L(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	private final void method1418(final int i) {
		try {
			aClass75_3459 = new Hashtable(this.aClass75_3461.getCapacity());
			if (i == 14) {
				for (StringNode class120_sub25 = (StringNode) this.aClass75_3461.getFirst(); class120_sub25 != null; class120_sub25 = (StringNode) this.aClass75_3461.getNext()) {
					final Class120_Sub21 class120_sub21 = new Class120_Sub21(class120_sub25.value, (int) class120_sub25.uid);
					aClass75_3459.put(class120_sub21, IsaacCipher.method907((byte) 121, class120_sub25.value));
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
					this.aClass75_3461 = new Hashtable(Class120_Sub12_Sub17.method1283(i_3_, (byte) 96));
					for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
						final int i_5_ = class120_sub7.getInt();
						Node node;
						if (i_2_ == 5) {
							node = new StringNode(class120_sub7.getJString());
						} else {
							node = new IntegerNode(class120_sub7.getInt());
						}
						this.aClass75_3461.put(node, i_5_);
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
			final IntegerNode class120_sub32 = (IntegerNode) aClass75_3459.get(i_6_);
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
			if (Class69.rootInterfaceId != -1) {
				Class120_Sub12_Sub32.uncacheJInterface(Class69.rootInterfaceId);
			}
			for (OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getFirst(); class120_sub26 != null; class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getNext()) {
				Class120_Sub19.removeOverridedInterface(class120_sub26, true);
			}
			Class69.rootInterfaceId = -1;
			Class120_Sub12_Sub13.overridedInterfaces = new Hashtable(8);
			Class43.method342();
			Class69.rootInterfaceId = GameShell.loginscreenId;
			Class101_Sub2.method846((byte) 44, false);
			Class132_Sub1.method1931();
			JagexSocket.method376(true, Class69.rootInterfaceId);
		}
		Class192.anInt2123 = -1;
		Class120_Sub12_Sub6.setCursor(Class107.defaultCursorId);
		Class100.selfPlayer = new Player();
		Class100.selfPlayer.x = 3000;
		Class100.selfPlayer.z = 3000;
		if (HDToolkit.glEnabled || Buffer.gameId != 0) {
			if (client.cameraType != 2) {
				Class120_Sub14_Sub6.method1445();
			} else {
				Class83.renderX = Class99.anInt951 << 7;
				GroundObjectNode.renderZ = Class134.anInt1280 << 7;
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
		final StringNode class120_sub25 = (StringNode) this.aClass75_3461.get(i);
		if (class120_sub25 == null) {
			return aString3457;
		}
		return class120_sub25.value;
	}

	private final void method1423(final int i) {
		try {
			aClass75_3459 = new Hashtable(this.aClass75_3461.getCapacity());
			if (i == 1740484738) {
				for (IntegerNode class120_sub32 = (IntegerNode) this.aClass75_3461.getFirst(); class120_sub32 != null; class120_sub32 = (IntegerNode) this.aClass75_3461.getNext()) {
					final IntegerNode class120_sub32_8_ = new IntegerNode((int) class120_sub32.uid);
					aClass75_3459.put(class120_sub32_8_, class120_sub32.value);
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
				worldLen = 75;
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
			for (Class120_Sub21 class120_sub21 = (Class120_Sub21) aClass75_3459.get(IsaacCipher.method907((byte) 75, string)); class120_sub21 != null; class120_sub21 = (Class120_Sub21) aClass75_3459.poll()) {
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
