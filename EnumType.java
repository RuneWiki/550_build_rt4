/* Class120_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class EnumType extends NodeSub {
	static int anInt3450;
	char inputType;
	private int defaulInteger;
	static FrameGroup[] aClass120_Sub14_Sub18Array3453 = new FrameGroup[14];
	static int worldLen;
	static int anInt3456;
	private String defaultString = "null";
	char returnType;
	private Hashtable aClass75_3459;
	static Class112 aClass112_3460;
	Hashtable params;
	static js5 aClass50_145;
	static NodeCache recentUse = new NodeCache(128);
	static long lastClickPacketSendTime;

	static {
		anInt3450 = 0;
		lastClickPacketSendTime = 0L;
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
		for (StringNode stringNode = (StringNode) params.getFirst(); stringNode != null; stringNode = (StringNode) params.getNext()) {
			final Class120_Sub21 class120_sub21 = new Class120_Sub21(stringNode.value, (int) stringNode.uid);
			aClass75_3459.put(class120_sub21, IsaacCipher.toHash(stringNode.value));
		}
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			returnType = Class120_Sub12_Sub24.method1328(buffer.getByte());
		} else if (code == 2) {
			inputType = Class120_Sub12_Sub24.method1328(buffer.getByte());
		} else if (code == 3) {
			defaultString = buffer.getJagexString();
		} else if (code == 4) {
			defaulInteger = buffer.getInt();
		} else if (code == 5 || code == 6) {
			final int paramCount = buffer.getUShort();
			params = new Hashtable(Class120_Sub12_Sub17.farthestBitValue(paramCount));
			for (int paramId = 0; paramId < paramCount; paramId++) {
				final int paramUid = buffer.getInt();
				Node node;
				if (code == 5) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, paramUid);
			}
		}
	}

	final boolean method1420(final int paramId) {
		if (params == null) {
			return false;
		}
		if (aClass75_3459 == null) {
			method1423();
		}
		final IntegerNode integerNode = (IntegerNode) aClass75_3459.get(paramId);
		if (integerNode == null) {
			return false;
		}
		return true;
	}

	static final void method1421(final boolean titleScreen) {
		if (titleScreen) {
			if (Class69.rootInterfaceId != -1) {
				Class120_Sub12_Sub32.uncacheJInterface(Class69.rootInterfaceId);
			}
			for (SubInterface subInterface = (SubInterface) Class120_Sub12_Sub13.subInterfaces.getFirst(); subInterface != null; subInterface = (SubInterface) Class120_Sub12_Sub13.subInterfaces.getNext()) {
				Class120_Sub19.removeSubInterface(subInterface, true);
			}
			Class69.rootInterfaceId = -1;
			Class120_Sub12_Sub13.subInterfaces = new Hashtable(8);
			Class43.createJInterfaceCache();
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
			if (client.cameraType == 2) {
				FileSystemWorker.renderX = Class99.anInt951 << 7;
				GroundObjectNode.renderZ = Class134.anInt1280 << 7;
			} else {
				InvType.updateLoginScreenCamera();
			}
			if (HDToolkit.glEnabled) {
				ModelParticleEmitter.instantScreenFade = true;
			}
			UnderlayType.setupLoadingScreenRegion();
			ProjectileNode.setGameState(28);
		} else {
			HintIcon.method725(client.spritesJs5);
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
		for (Class120_Sub21 class120_sub21 = (Class120_Sub21) aClass75_3459.get(IsaacCipher.toHash(string)); class120_sub21 != null; class120_sub21 = (Class120_Sub21) aClass75_3459.poll()) {
			if (class120_sub21.aString2666.equals(string)) {
				return true;
			}
		}
		return false;
	}

	static final void setup(final js5 js5) {
		aClass50_145 = js5;
	}

	static final EnumType list(final int id) {
		EnumType enumType = (EnumType) recentUse.get(id);
		if (enumType != null) {
			return enumType;
		}
		final byte[] data = aClass50_145.getFile(id >>> 8, id & 0xff);
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
