/* Class120_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class EnumType extends NodeSub {
	static int anInt3450;
	char aChar3451;
	private int defaulInteger;
	static FrameLoader[] aClass120_Sub14_Sub18Array3453 = new FrameLoader[14];
	static int worldLen;
	static String aString3455 = "M";
	static int anInt3456;
	private String defaultString = "null";
	char aChar3458;
	private Hashtable aClass75_3459;
	static Class112 aClass112_3460;
	Hashtable params;
	static NodeCache recentUse = new NodeCache(128);
	static long aLong3462;

	static {
		anInt3450 = 0;
		aLong3462 = 0L;
	}

	final int getIntegerParamValue(final int param) {
		if (params == null) {
			return defaulInteger;
		}
		final IntegerNode integerNode = (IntegerNode) params.get(param);
		if (integerNode == null) {
			return defaulInteger;
		}
		return integerNode.value;
	}

	private final void method1418() {
		aClass75_3459 = new Hashtable(params.getCapacity());
		for (StringNode class120_sub25 = (StringNode) params.getFirst(); class120_sub25 != null; class120_sub25 = (StringNode) params.getNext()) {
			final Class120_Sub21 class120_sub21 = new Class120_Sub21(class120_sub25.value, (int) class120_sub25.uid);
			aClass75_3459.put(class120_sub21, IsaacCipher.method907(class120_sub25.value));
		}
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			aChar3458 = Class120_Sub12_Sub24.method1328(buffer.getByte());
		} else if (code == 2) {
			aChar3451 = Class120_Sub12_Sub24.method1328(buffer.getByte());
		} else if (code == 3) {
			defaultString = buffer.getJagexString();
		} else if (code == 4) {
			defaulInteger = buffer.getInt();
		} else if (code == 5 || code == 6) {
			final int i_3_ = buffer.getUShort();
			params = new Hashtable(Class120_Sub12_Sub17.getFarestBitValue(i_3_));
			for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
				final int i_5_ = buffer.getInt();
				Node node;
				if (code == 5) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, i_5_);
			}
		}
	}

	final boolean method1420(final int i_6_) {
		if (params == null) {
			return false;
		}
		if (aClass75_3459 == null) {
			method1423();
		}
		final IntegerNode class120_sub32 = (IntegerNode) aClass75_3459.get(i_6_);
		if (class120_sub32 == null) {
			return false;
		}
		return true;
	}

	static final void method1421(final boolean titleScreen) {
		if (titleScreen) {
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
			Class101_Sub2.method846(false);
			Class132_Sub1.method1931();
			JagexSocket.executeOnloadScript(Class69.rootInterfaceId);
		}
		Class192.selectedSpellCursor = -1;
		Class120_Sub12_Sub6.setCursor(AbstractIndexedSprite.defaultCursorId);
		TileParticleQueue.selfPlayer = new Player();
		TileParticleQueue.selfPlayer.x = 3000;
		TileParticleQueue.selfPlayer.z = 3000;
		if (HDToolkit.glEnabled || Buffer.gameId != 0) {
			if (client.cameraType != 2) {
				InvType.method1445();
			} else {
				FileSystemWorker.renderX = Class99.anInt951 << 7;
				GroundObjectNode.renderZ = Class134.anInt1280 << 7;
			}
			if (HDToolkit.glEnabled) {
				Class158.aBoolean1478 = true;
			}
			UnderlayType.method1900();
			ProjectileNode.setGameState(28);
		} else {
			HintIcon.method725(Class7.aClass50_63);
			ProjectileNode.setGameState(10);
		}
	}

	final String getStringParamValue(final int param) {
		if (params == null) {
			return defaultString;
		}
		final StringNode stringNode = (StringNode) params.get(param);
		if (stringNode == null) {
			return defaultString;
		}
		return stringNode.value;
	}

	private final void method1423() {
		aClass75_3459 = new Hashtable(params.getCapacity());
		for (IntegerNode class120_sub32 = (IntegerNode) params.getFirst(); class120_sub32 != null; class120_sub32 = (IntegerNode) params.getNext()) {
			final IntegerNode class120_sub32_8_ = new IntegerNode((int) class120_sub32.uid);
			aClass75_3459.put(class120_sub32_8_, class120_sub32.value);
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

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
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

	public EnumType() {
		/* empty */
	}

	final boolean method1427(final String string) {
		if (params == null) {
			return false;
		}
		if (aClass75_3459 == null) {
			method1418();
		}
		for (Class120_Sub21 class120_sub21 = (Class120_Sub21) aClass75_3459.get(IsaacCipher.method907(string)); class120_sub21 != null; class120_sub21 = (Class120_Sub21) aClass75_3459.poll()) {
			if (class120_sub21.aString2666.equals(string)) {
				return true;
			}
		}
		return false;
	}

	static final EnumType list(final int id) {
		EnumType enumType = (EnumType) recentUse.get(id);
		if (enumType != null) {
			return enumType;
		}
		final byte[] data = Class24.aClass50_145.getFile(id >>> 8, id & 0xff);
		enumType = new EnumType();
		if (data != null) {
			enumType.decode(new Buffer(data));
		}
		recentUse.put(enumType, id);
		return enumType;
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
