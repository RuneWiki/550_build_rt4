/* Class167_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class World extends Class167 {
	private static int[] anIntArray2832 = new int[3];
	static Class98 aClass98_2833;
	String activity;
	static int[] anIntArray2835;
	String ip;
	static String aString2837 = "Started 3d Library";
	int worldId;

	public static void method2192(final int i) {
		try {
			anIntArray2832 = null;
			aString2837 = null;
			aClass98_2833 = null;
			anIntArray2835 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gb.L(").append(i).append(')').toString());
		}
	}

	static final boolean method2193(final int i) {
		boolean bool;
		try {
			if (Class120_Sub12_Sub25.anInt3312 != 0) {
				return true;
			}
			if (i < 17) {
				anIntArray2835 = null;
			}
			bool = Class30.aClass120_Sub30_Sub2_234.method1766((byte) 70);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gb.K(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void method2194(ClientScript clientScript, final int i) {
		Buffer.subScriptAmount = 0;
		int intStackIndex = 0;
		int opcodeIndex = -1;
		int stringStackIndex = 0;
		int[] opcodes = clientScript.opcodes;
		int[] intValues = clientScript.intValues;
		int opcode = -1;
		try {
			int i_6_ = 0;
			while_218_: for (;;) {
				if (++i_6_ > i) {
					throw new RuntimeException("slow");
				}
				opcode = opcodes[++opcodeIndex];
				if (opcode < 100) {
					if (opcode == 0) {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = intValues[opcodeIndex];
						continue;
					}
					if (opcode == 1) {
						final int i_7_ = intValues[opcodeIndex];
						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class2.permanentVariable[i_7_];
						continue;
					}
					if (opcode == 2) {
						final int i_8_ = intValues[opcodeIndex];
						Class140.method1997(false, i_8_, ProducingGraphicsBuffer.intStack[--intStackIndex]);
						continue;
					}
					if (opcode == 3) {
						Class33.stringStack[stringStackIndex++] = clientScript.stringValues[opcodeIndex];
						continue;
					}
					if (opcode == 6) {
						opcodeIndex += intValues[opcodeIndex];
						continue;
					}
					if (opcode == 7) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[intStackIndex] != ProducingGraphicsBuffer.intStack[1 + intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 8) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[intStackIndex] == ProducingGraphicsBuffer.intStack[1 + intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 9) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[intStackIndex] < ProducingGraphicsBuffer.intStack[1 + intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 10) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[1 + intStackIndex] < ProducingGraphicsBuffer.intStack[intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 21) {
						if (Buffer.subScriptAmount != 0) {
							final SubScript subScript = Class179.subScripts[--Buffer.subScriptAmount];
							Class79_Sub1.stringArguments = subScript.stringArguments;
							clientScript = subScript.origClientScript;
							opcodeIndex = subScript.opcodeIndex;
							intValues = clientScript.intValues;
							Class100.intArguments = subScript.intArguments;
							opcodes = clientScript.opcodes;
						} else {
							return;
						}
						continue;
					}
					if (opcode == 25) {
						final int i_9_ = intValues[opcodeIndex];
						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class173.method2226((byte) -103, i_9_);
						continue;
					}
					if (opcode == 27) {
						final int i_10_ = intValues[opcodeIndex];
						Class101.method836(i_10_, 0, ProducingGraphicsBuffer.intStack[--intStackIndex]);
						continue;
					}
					if (opcode == 31) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[intStackIndex] <= ProducingGraphicsBuffer.intStack[1 + intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 32) {
						intStackIndex -= 2;
						if (ProducingGraphicsBuffer.intStack[1 + intStackIndex] <= ProducingGraphicsBuffer.intStack[intStackIndex]) {
							opcodeIndex += intValues[opcodeIndex];
						}
						continue;
					}
					if (opcode == 33) {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class100.intArguments[intValues[opcodeIndex]];
						continue;
					}
					if (opcode == 34) {
						Class100.intArguments[intValues[opcodeIndex]] = ProducingGraphicsBuffer.intStack[--intStackIndex];
						continue;
					}
					if (opcode == 35) {
						Class33.stringStack[stringStackIndex++] = Class79_Sub1.stringArguments[intValues[opcodeIndex]];
						continue;
					}
					if (opcode == 36) {
						Class79_Sub1.stringArguments[intValues[opcodeIndex]] = Class33.stringStack[--stringStackIndex];
						continue;
					}
					if (opcode == 37) {
						final int i_11_ = intValues[opcodeIndex];
						stringStackIndex -= i_11_;
						final String string = Class120_Sub12_Sub21_Sub1.method1317(false, Class33.stringStack, stringStackIndex, i_11_);
						Class33.stringStack[stringStackIndex++] = string;
						continue;
					}
					if (opcode == 38) {
						intStackIndex--;
						continue;
					}
					if (opcode == 39) {
						stringStackIndex--;
						continue;
					}
					if (opcode == 40) {
						final int scriptId = intValues[opcodeIndex];
						final ClientScript subClientScript = ClientScript.list(scriptId);
						
						final int[] is_14_ = new int[subClientScript.intArgumentCount];
						final String[] strings = new String[subClientScript.stringArgumentCount];
						for (int i_15_ = 0; subClientScript.anInt3553 > i_15_; i_15_++) {
							is_14_[i_15_] = ProducingGraphicsBuffer.intStack[i_15_ + -subClientScript.anInt3553 + intStackIndex];
						}
						for (int i_16_ = 0; i_16_ < subClientScript.anInt3547; i_16_++) {
							strings[i_16_] = Class33.stringStack[stringStackIndex + -subClientScript.anInt3547 - -i_16_];
						}
						
						intStackIndex -= subClientScript.anInt3553;
						stringStackIndex -= subClientScript.anInt3547;
						final SubScript subScript = new SubScript();
						subScript.intArguments = Class100.intArguments;
						subScript.stringArguments = Class79_Sub1.stringArguments;
						subScript.opcodeIndex = opcodeIndex;
						subScript.origClientScript = clientScript;
						if (Buffer.subScriptAmount >= Class179.subScripts.length) {
							throw new RuntimeException();
						}
						Class179.subScripts[Buffer.subScriptAmount++] = subScript;
						Class79_Sub1.stringArguments = strings;
						clientScript = subClientScript;
						opcodeIndex = -1;
						opcodes = clientScript.opcodes;
						Class100.intArguments = is_14_;
						intValues = clientScript.intValues;
						continue;
					}
					if (opcode == 42) {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub25.anIntArray3320[intValues[opcodeIndex]];
						continue;
					}
					if (opcode == 43) {
						final int i_17_ = intValues[opcodeIndex];
						Class120_Sub12_Sub25.anIntArray3320[i_17_] = ProducingGraphicsBuffer.intStack[--intStackIndex];
						CursorType.method1914(i_17_);
						continue;
					}
					if (opcode == 44) {
						final int i_18_ = intValues[opcodeIndex] & 0xffff;
						final int i_19_ = intValues[opcodeIndex] >> 16;
						final int i_20_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
						if (i_20_ < 0 || i_20_ > 5000) {
							throw new RuntimeException();
						}
						int i_21_ = -1;
						if (i_18_ == 105) {
							i_21_ = 0;
						}
						Class69_Sub3_Sub1.anIntArray3082[i_19_] = i_20_;
						for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
							Class65.anIntArrayArray594[i_19_][i_22_] = i_21_;
						}
						continue;
					}
					if (opcode == 45) {
						final int i_23_ = intValues[opcodeIndex];
						final int i_24_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
						if (i_24_ < 0 || i_24_ >= Class69_Sub3_Sub1.anIntArray3082[i_23_]) {
							throw new RuntimeException();
						}
						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class65.anIntArrayArray594[i_23_][i_24_];
						continue;
					}
					if (opcode == 46) {
						final int i_25_ = intValues[opcodeIndex];
						intStackIndex -= 2;
						final int i_26_ = ProducingGraphicsBuffer.intStack[intStackIndex];
						if (i_26_ < 0 || i_26_ >= Class69_Sub3_Sub1.anIntArray3082[i_25_]) {
							throw new RuntimeException();
						}
						Class65.anIntArrayArray594[i_25_][i_26_] = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
						continue;
					}
					if (opcode == 47) {
						String string = Class120_Sub2.aStringArray2420[intValues[opcodeIndex]];
						if (string == null) {
							string = "null";
						}
						Class33.stringStack[stringStackIndex++] = string;
						continue;
					}
					if (opcode == 48) {
						final int i_27_ = intValues[opcodeIndex];
						Class120_Sub2.aStringArray2420[i_27_] = Class33.stringStack[--stringStackIndex];
						NodeSub.method1411(i_27_, false);
						continue;
					}
					if (opcode == 51) {
						final Hashtable hashtable = clientScript.aClass75Array3552[intValues[opcodeIndex]];
						final IntegerNode class120_sub32 = (IntegerNode) hashtable.get(ProducingGraphicsBuffer.intStack[--intStackIndex]);
						if (class120_sub32 != null) {
							opcodeIndex += class120_sub32.value;
						}
						continue;
					}
				}
				boolean bool;
				if (intValues[opcodeIndex] != 1) {
					bool = false;
				} else {
					bool = true;
				}
				if (opcode >= 300) {
					if (opcode >= 500) {
						if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
							JagexInterface jagexInterface;
							if (opcode < 2000) {
								jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							} else {
								jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
								opcode -= 1000;
							}
							if (opcode == 1000) {
								intStackIndex -= 4;
								jagexInterface.originalX = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.originalY = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								int i_28_ = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
								if (i_28_ >= 0) {
									if (i_28_ > 5) {
										i_28_ = 5;
									}
								} else {
									i_28_ = 0;
								}
								int i_29_ = ProducingGraphicsBuffer.intStack[intStackIndex - -3];
								jagexInterface.dynamicXValue = (byte) i_28_;
								if (i_29_ < 0) {
									i_29_ = 0;
								} else if (i_29_ > 5) {
									i_29_ = 5;
								}
								jagexInterface.dynamicYValue = (byte) i_29_;
								InterfaceClickMask.redrawInterface(jagexInterface);
								Class120_Sub12_Sub34.method1379(jagexInterface);
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class179.method2261(jagexInterface.bitPacked, 11);
								}
							} else if (opcode == 1001) {
								intStackIndex -= 4;
								jagexInterface.originalWidth = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.originalHeight = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
								jagexInterface.anInt2069 = 0;
								jagexInterface.anInt2007 = 0;
								int i_30_ = ProducingGraphicsBuffer.intStack[intStackIndex + 3];
								if (i_30_ >= 0) {
									if (i_30_ > 4) {
										i_30_ = 4;
									}
								} else {
									i_30_ = 0;
								}
								int i_31_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
								if (i_31_ >= 0) {
									if (i_31_ > 4) {
										i_31_ = 4;
									}
								} else {
									i_31_ = 0;
								}
								jagexInterface.dynamicHeightValue = (byte) i_30_;
								jagexInterface.dynamicWidthValue = (byte) i_31_;
								InterfaceClickMask.redrawInterface(jagexInterface);
								Class120_Sub12_Sub34.method1379(jagexInterface);
								if (jagexInterface.type == 0) {
									ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
								}
							} else if (opcode == 1003) {
								final boolean bool_32_ = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								if (!bool_32_ != !jagexInterface.hidden) {
									jagexInterface.hidden = bool_32_;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
								if (jagexInterface.componentIndex == -1) {
									Class120_Sub12_Sub32.method1373(jagexInterface.bitPacked, 881);
								}
							} else if (opcode == 1004) {
								intStackIndex -= 2;
								jagexInterface.anInt1982 = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.anInt2085 = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
								Class120_Sub12_Sub34.method1379(jagexInterface);
								if (jagexInterface.type == 0) {
									ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
								}
							} else {
								if (opcode != 1005) {
									break;
								}
								jagexInterface.aBoolean1960 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
							}
						} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
							JagexInterface jagexInterface;
							if (opcode >= 2000) {
								jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
								opcode -= 1000;
							} else {
								jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							}
							if (opcode == 1100) {
								intStackIndex -= 2;
								jagexInterface.verticalScrollPosition = ProducingGraphicsBuffer.intStack[intStackIndex];
								if (jagexInterface.verticalScrollPosition > jagexInterface.maxScrollHorizontal - jagexInterface.width) {
									jagexInterface.verticalScrollPosition = jagexInterface.maxScrollHorizontal - jagexInterface.width;
								}
								if (jagexInterface.verticalScrollPosition < 0) {
									jagexInterface.verticalScrollPosition = 0;
								}
								jagexInterface.horizontalScrollPosition = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								if (jagexInterface.horizontalScrollPosition > jagexInterface.maxScrollVertical - jagexInterface.height) {
									jagexInterface.horizontalScrollPosition = jagexInterface.maxScrollVertical - jagexInterface.height;
								}
								if (jagexInterface.horizontalScrollPosition < 0) {
									jagexInterface.horizontalScrollPosition = 0;
								}
								InterfaceClickMask.redrawInterface(jagexInterface);
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class7.method108(jagexInterface.bitPacked, 12);
								}
							} else if (opcode == 1101) {
								jagexInterface.disabledColor = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class120_Sub29.method1730(true, jagexInterface.bitPacked);
								}
							} else if (opcode == 1102) {
								jagexInterface.filled = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1103) {
								jagexInterface.alpha = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1104) {
								jagexInterface.thickness = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1105) {
								jagexInterface.disabledSpriteId = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1106) {
								jagexInterface.rotation = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1107) {
								jagexInterface.aBoolean2001 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1108) {
								jagexInterface.modelTypeDisabled = 1;
								jagexInterface.mediaIdDisabled = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class33.method276(jagexInterface.bitPacked);
								}
							} else if (opcode == 1109) {
								intStackIndex -= 6;
								jagexInterface.anInt2076 = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.anInt1977 = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								jagexInterface.rotateX = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
								jagexInterface.rotateY = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
								jagexInterface.rotateZ = ProducingGraphicsBuffer.intStack[intStackIndex - -4];
								jagexInterface.zoom = ProducingGraphicsBuffer.intStack[intStackIndex - -5];
								InterfaceClickMask.redrawInterface(jagexInterface);
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									ParamType.method1514(jagexInterface.bitPacked);
									Class48.method401(jagexInterface.bitPacked);
								}
							} else if (opcode == 1110) {
								final int i_33_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if (i_33_ != jagexInterface.disabledAnim) {
									jagexInterface.frameDelay = 0;
									jagexInterface.disabledAnim = i_33_;
									jagexInterface.nextFrame = 1;
									jagexInterface.currentFrame = 0;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									GameShell.method47(jagexInterface.bitPacked, false);
								}
							} else if (opcode == 1111) {
								jagexInterface.aBoolean2046 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1112) {
								final String string = Class33.stringStack[--stringStackIndex];
								if (!string.equals(jagexInterface.disabledText)) {
									jagexInterface.disabledText = string;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class187.method2479(jagexInterface.bitPacked, 3);
								}
							} else if (opcode == 1113) {
								jagexInterface.font = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1114) {
								intStackIndex -= 3;
								jagexInterface.horizontalAlignment = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.verticalAlignment = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								jagexInterface.verticalSpacing = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1115) {
								jagexInterface.shaded = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1116) {
								jagexInterface.outline = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1117) {
								jagexInterface.shadow = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1118) {
								jagexInterface.flipVertical = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1119) {
								jagexInterface.flipHorizontal = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1120) {
								intStackIndex -= 2;
								jagexInterface.maxScrollHorizontal = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.maxScrollVertical = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
								InterfaceClickMask.redrawInterface(jagexInterface);
								if (jagexInterface.type == 0) {
									ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
								}
							} else if (opcode == 1121) {
								intStackIndex -= 2;
								jagexInterface.aShort2093 = (short) ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.aShort2065 = (short) ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1122) {
								jagexInterface.aBoolean2018 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (opcode == 1123) {
								jagexInterface.zoom = ProducingGraphicsBuffer.intStack[--intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
								if (jagexInterface.componentIndex == -1) {
									ParamType.method1514(jagexInterface.bitPacked);
								}
							} else {
								if (opcode != 1124) {
									break;
								}
								final int i_34_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
								jagexInterface.aBoolean1989 = i_34_ == 1;
								InterfaceClickMask.redrawInterface(jagexInterface);
							}
						} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
							JagexInterface jagexInterface;
							if (opcode < 2000) {
								jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							} else {
								opcode -= 1000;
								jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
							}
							InterfaceClickMask.redrawInterface(jagexInterface);
							if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209) {
								intStackIndex -= 2;
								final int i_35_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
								final int i_36_ = ProducingGraphicsBuffer.intStack[intStackIndex];
								if (jagexInterface.componentIndex == -1) {
									GameShell.method43(jagexInterface.bitPacked, 9);
									ParamType.method1514(jagexInterface.bitPacked);
									Class48.method401(jagexInterface.bitPacked);
								}
								if ((i_36_ ^ 0xffffffff) == 0) {
									jagexInterface.modelTypeDisabled = 1;
									jagexInterface.mediaIdDisabled = -1;
									jagexInterface.anInt2030 = -1;
								} else {
									jagexInterface.anInt2075 = i_35_;
									if (opcode == 1208 || opcode == 1209) {
										jagexInterface.aBoolean2097 = true;
									} else {
										jagexInterface.aBoolean2097 = false;
									}
									jagexInterface.anInt2030 = i_36_;
									final ObjType objType = ObjType.list(i_36_);
									jagexInterface.anInt1977 = objType.yof2d;
									jagexInterface.anInt2076 = objType.xof2d;
									jagexInterface.rotateX = objType.xan2d;
									jagexInterface.rotateY = objType.yan2d;
									jagexInterface.zoom = objType.zoom2d;
									jagexInterface.rotateZ = objType.zan2d;
									if (opcode != 1205) {
										jagexInterface.aBoolean1956 = true;
									} else {
										jagexInterface.aBoolean1956 = false;
									}
									if (jagexInterface.anInt2069 > 0) {
										jagexInterface.zoom = 32 * jagexInterface.zoom / jagexInterface.anInt2069;
									} else if (jagexInterface.originalWidth > 0) {
										jagexInterface.zoom = jagexInterface.zoom * 32 / jagexInterface.originalWidth;
									}
								}
							} else if (opcode == 1201) {
								jagexInterface.modelTypeDisabled = 2;
								jagexInterface.mediaIdDisabled = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class33.method276(jagexInterface.bitPacked);
								}
							} else if (opcode == 1202) {
								jagexInterface.modelTypeDisabled = 3;
								jagexInterface.mediaIdDisabled = Class100.selfPlayer.appearance.method2043();
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class33.method276(jagexInterface.bitPacked);
								}
							} else if (opcode == 1203) {
								jagexInterface.modelTypeDisabled = 6;
								jagexInterface.mediaIdDisabled = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if ((jagexInterface.componentIndex ^ 0xffffffff) == 0) {
									Class33.method276(jagexInterface.bitPacked);
								}
							} else if (opcode == 1204) {
								jagexInterface.modelTypeDisabled = 5;
								jagexInterface.mediaIdDisabled = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if (jagexInterface.componentIndex == -1) {
									Class33.method276(jagexInterface.bitPacked);
								}
							} else if (opcode == 1206) {
								intStackIndex -= 4;
								jagexInterface.anInt2088 = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.anInt2002 = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
								jagexInterface.anInt2094 = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
								jagexInterface.anInt1966 = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else {
								if (opcode != 1207) {
									break;
								}
								intStackIndex -= 2;
								jagexInterface.anInt2078 = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.anInt2004 = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
								InterfaceClickMask.redrawInterface(jagexInterface);
							}
						} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
							JagexInterface jagexInterface;
							if (opcode < 2000) {
								jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							} else {
								opcode -= 1000;
								jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
							}
							if (opcode == 1300) {
								final int i_37_ = -1 + ProducingGraphicsBuffer.intStack[--intStackIndex];
								if (i_37_ < 0 || i_37_ > 9) {
									stringStackIndex--;
								} else {
									jagexInterface.setAction(Class33.stringStack[--stringStackIndex], i_37_);
								}
							} else if (opcode == 1301) {
								intStackIndex -= 2;
								final int i_38_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
								final int i_39_ = ProducingGraphicsBuffer.intStack[intStackIndex];
								jagexInterface.aClass189_1931 = JagexInterface.getComponent(i_39_, i_38_);
							} else if (opcode == 1302) {
								jagexInterface.aBoolean1939 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
							} else if (opcode == 1303) {
								jagexInterface.anInt1962 = ProducingGraphicsBuffer.intStack[--intStackIndex];
							} else if (opcode == 1304) {
								jagexInterface.anInt2066 = ProducingGraphicsBuffer.intStack[--intStackIndex];
							} else if (opcode == 1305) {
								jagexInterface.spellNameni = Class33.stringStack[--stringStackIndex];
							} else if (opcode == 1306) {
								jagexInterface.selectedActionName = Class33.stringStack[--stringStackIndex];
							} else if (opcode == 1307) {
								jagexInterface.niActions = null;
							} else if (opcode == 1308) {
								jagexInterface.cursorId = ProducingGraphicsBuffer.intStack[--intStackIndex];
								jagexInterface.targetCursorId = ProducingGraphicsBuffer.intStack[--intStackIndex];
							} else if (opcode == 1309) {
								final int i_40_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
								final int i_41_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if (i_41_ >= 1 && i_41_ <= 10) {
									jagexInterface.setCursor(-1 + i_41_, i_40_);
								}
							} else {
								if (opcode != 1310) {
									break;
								}
								jagexInterface.actionSufix = Class33.stringStack[--stringStackIndex];
							}
						} else if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
							JagexInterface jagexInterface;
							if (opcode < 2000) {
								jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							} else {
								jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
								opcode -= 1000;
							}
							String string = Class33.stringStack[--stringStackIndex];
							int[] is_42_ = null;
							if (string.length() > 0 && string.charAt(-1 + string.length()) == 'Y') {
								int i_43_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
								if (i_43_ > 0) {
									is_42_ = new int[i_43_];
									while ((i_43_-- ^ 0xffffffff) < -1) {
										is_42_[i_43_] = ProducingGraphicsBuffer.intStack[--intStackIndex];
									}
								}
								string = string.substring(0, -1 + string.length());
							}
							Object[] objects = new Object[string.length() - -1];
							for (int i_44_ = objects.length - 1; i_44_ >= 1; i_44_--) {
								if (string.charAt(-1 + i_44_) != 's') {
									objects[i_44_] = new Integer(ProducingGraphicsBuffer.intStack[--intStackIndex]);
								} else {
									objects[i_44_] = Class33.stringStack[--stringStackIndex];
								}
							}
							final int i_45_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
							if (i_45_ != -1) {
								objects[0] = new Integer(i_45_);
							} else {
								objects = null;
							}
							jagexInterface.aBoolean1940 = true;
							if (opcode == 1400) {
								jagexInterface.mouseClickFocusListener = objects;
							} else if (opcode != 1401) {
								if (opcode == 1402) {
									jagexInterface.mouseClickUnfocusListener = objects;
								} else if (opcode != 1403) {
									if (opcode != 1404) {
										if (opcode == 1405) {
											jagexInterface.anObjectArray1959 = objects;
										} else if (opcode != 1406) {
											if (opcode == 1407) {
												jagexInterface.anObjectArray2050 = objects;
												jagexInterface.varpListenerTriggers = is_42_;
											} else if (opcode == 1408) {
												jagexInterface.anObjectArray1998 = objects;
											} else if (opcode == 1409) {
												jagexInterface.anObjectArray2006 = objects;
											} else if (opcode != 1410) {
												if (opcode != 1411) {
													if (opcode == 1412) {
														jagexInterface.anObjectArray1953 = objects;
													} else if (opcode != 1414) {
														if (opcode != 1415) {
															if (opcode == 1416) {
																jagexInterface.onSpellSelectionListener = objects;
															} else if (opcode == 1417) {
																jagexInterface.mouseWheelListener = objects;
															} else if (opcode != 1418) {
																if (opcode != 1419) {
																	if (opcode != 1420) {
																		if (opcode == 1421) {
																			jagexInterface.anObjectArray2036 = objects;
																		} else if (opcode != 1422) {
																			if (opcode == 1423) {
																				jagexInterface.anObjectArray2013 = objects;
																			} else if (opcode == 1424) {
																				jagexInterface.anObjectArray1932 = objects;
																			} else if (opcode != 1425) {
																				if (opcode == 1426) {
																					jagexInterface.anObjectArray1942 = objects;
																				} else if (opcode != 1427) {
																					if (opcode == 1428) {
																						jagexInterface.anObjectArray2062 = objects;
																						jagexInterface.integerScriptsValuesTriggers = is_42_;
																					} else if (opcode == 1429) {
																						jagexInterface.anObjectArray2032 = objects;
																						jagexInterface.stringScriptValuesTriggers = is_42_;
																					}
																				} else {
																					jagexInterface.onResizeListener = objects;
																				}
																			} else {
																				jagexInterface.anObjectArray1984 = objects;
																			}
																		} else {
																			jagexInterface.anObjectArray2086 = objects;
																		}
																	} else {
																		jagexInterface.privateChatUpdateListener = objects;
																	}
																} else {
																	jagexInterface.keyPressedListener = objects;
																}
															} else {
																jagexInterface.anObjectArray1944 = objects;
															}
														} else {
															jagexInterface.skillUpdateListener = objects;
															jagexInterface.skillListernerTriggers = is_42_;
														}
													} else {
														jagexInterface.inventoryListenerTriggers = is_42_;
														jagexInterface.anObjectArray1929 = objects;
													}
												} else {
													jagexInterface.anObjectArray1993 = objects;
												}
											} else {
												jagexInterface.anObjectArray1947 = objects;
											}
										} else {
											jagexInterface.onSpellDeselectionListener = objects;
										}
									} else {
										jagexInterface.mouseUnfocusListener = objects;
									}
								} else {
									jagexInterface.mouseFocusListener = objects;
								}
							} else {
								jagexInterface.mouseDraggedListener = objects;
							}
						} else if (opcode >= 1600) {
							if (opcode < 1700) {
								final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : ParamType.aClass189_3540;
								if (opcode == 1600) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.verticalScrollPosition;
								} else if (opcode == 1601) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.horizontalScrollPosition;
								} else if (opcode == 1602) {
									Class33.stringStack[stringStackIndex++] = jagexInterface.disabledText;
								} else if (opcode == 1603) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.maxScrollHorizontal;
								} else if (opcode == 1604) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.maxScrollVertical;
								} else if (opcode == 1605) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.zoom;
								} else if (opcode == 1606) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateX;
								} else if (opcode == 1607) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateZ;
								} else if (opcode == 1608) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateY;
								} else if (opcode == 1609) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.alpha;
								} else if (opcode == 1610) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2076;
								} else if (opcode == 1611) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt1977;
								} else {
									if (opcode != 1612) {
										break;
									}
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.disabledSpriteId;
								}
							} else if (opcode < 1800) {
								final JagexInterface jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
								if (opcode == 1700) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2030;
								} else if (opcode == 1701) {
									if (jagexInterface.anInt2030 == -1) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
									} else {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2075;
									}
								} else {
									if (opcode != 1702) {
										break;
									}
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.componentIndex;
								}
							} else if (opcode < 1900) {
								final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : ParamType.aClass189_3540;
								if (opcode == 1800) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = client.getClickMask(jagexInterface).method1685(1105924391);
								} else if (opcode == 1801) {
									int i_46_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
									i_46_--;
									if (jagexInterface.niActions != null && jagexInterface.niActions.length > i_46_ && jagexInterface.niActions[i_46_] != null) {
										Class33.stringStack[stringStackIndex++] = jagexInterface.niActions[i_46_];
									} else {
										Class33.stringStack[stringStackIndex++] = "";
									}
								} else {
									if (opcode != 1802) {
										break;
									}
									if (jagexInterface.spellNameni != null) {
										Class33.stringStack[stringStackIndex++] = jagexInterface.spellNameni;
									} else {
										Class33.stringStack[stringStackIndex++] = "";
									}
								}
							} else if (opcode >= 2600) {
								if (opcode >= 2700) {
									if (opcode >= 2800) {
										if (opcode < 2900) {
											final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
											if (opcode == 2800) {
												ProducingGraphicsBuffer.intStack[intStackIndex++] = client.getClickMask(jagexInterface).method1685(1105924391);
											} else if (opcode == 2801) {
												int i_47_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
												i_47_--;
												if (jagexInterface.niActions == null || i_47_ >= jagexInterface.niActions.length || jagexInterface.niActions[i_47_] == null) {
													Class33.stringStack[stringStackIndex++] = "";
												} else {
													Class33.stringStack[stringStackIndex++] = jagexInterface.niActions[i_47_];
												}
											} else {
												if (opcode != 2802) {
													break;
												}
												if (jagexInterface.spellNameni != null) {
													Class33.stringStack[stringStackIndex++] = jagexInterface.spellNameni;
												} else {
													Class33.stringStack[stringStackIndex++] = "";
												}
											}
										} else if (opcode >= 3200) {
											if (opcode >= 3300) {
												if (opcode >= 3400) {
													if (opcode < 3500) {
														if (opcode == 3400) {
															intStackIndex -= 2;
															final int i_48_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_49_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															final EnumType class120_sub14_sub2 = EnumType.list(i_48_);
															if (class120_sub14_sub2.aChar3451 != 0) {
																/* empty */
															}
															Class33.stringStack[stringStackIndex++] = class120_sub14_sub2.getStringParamValue(i_49_);
														} else if (opcode == 3408) {
															intStackIndex -= 4;
															final int i_50_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															final int i_51_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_52_ = ProducingGraphicsBuffer.intStack[intStackIndex - -2];
															final int i_53_ = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
															final EnumType class120_sub14_sub2 = EnumType.list(i_52_);
															if (i_51_ != class120_sub14_sub2.aChar3458 || i_50_ != class120_sub14_sub2.aChar3451) {
																throw new RuntimeException("C3408-1");
															}
															if (i_50_ == 115) {
																Class33.stringStack[stringStackIndex++] = class120_sub14_sub2.getStringParamValue(i_53_);
															} else {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub2.getIntegerParamValue(i_53_);
															}
														} else if (opcode == 3409) {
															intStackIndex -= 3;
															final int i_54_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_55_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															final int i_56_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
															if (i_55_ == -1) {
																throw new RuntimeException("C3409-2");
															}
															final EnumType class120_sub14_sub2 = EnumType.list(i_55_);
															if (class120_sub14_sub2.aChar3451 != i_54_) {
																throw new RuntimeException("C3409-1");
															}
															ProducingGraphicsBuffer.intStack[intStackIndex++] = !class120_sub14_sub2.method1420(i_56_) ? 0 : 1;
														} else if (opcode == 3410) {
															final String string = Class33.stringStack[--stringStackIndex];
															final int i_57_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
															if ((i_57_ ^ 0xffffffff) == 0) {
																throw new RuntimeException("C3410-2");
															}
															final EnumType class120_sub14_sub2 = EnumType.list(i_57_);
															if (class120_sub14_sub2.aChar3451 != 's') {
																throw new RuntimeException("C3410-1");
															}
															ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub2.method1427(string) ? 1 : 0;
														} else {
															if (opcode != 3411) {
																break;
															}
															final int i_58_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
															final EnumType class120_sub14_sub2 = EnumType.list(i_58_);
															ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub2.params.getCount();
														}
													} else if (opcode >= 3700) {
														if (opcode < 4000) {
															if (opcode == 3903) {
																final int i_59_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_59_].method2097();
															} else if (opcode == 3904) {
																final int i_60_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_60_].id;
															} else if (opcode == 3905) {
																final int i_61_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_61_].price;
															} else if (opcode == 3906) {
																final int i_62_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_62_].amount;
															} else if (opcode == 3907) {
																final int i_63_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_63_].soldAmount;
															} else if (opcode == 3908) {
																final int i_64_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub3.grandExchangeObjects[i_64_].totalPrice;
															} else if (opcode == 3910) {
																final int i_65_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final int i_66_ = Class120_Sub3.grandExchangeObjects[i_65_].getProgress();
																ProducingGraphicsBuffer.intStack[intStackIndex++] = i_66_ == 0 ? 1 : 0;
															} else if (opcode == 3911) {
																final int i_67_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final int i_68_ = Class120_Sub3.grandExchangeObjects[i_67_].getProgress();
																ProducingGraphicsBuffer.intStack[intStackIndex++] = i_68_ != 2 ? 0 : 1;
															} else if (opcode == 3912) {
																final int i_69_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final int i_70_ = Class120_Sub3.grandExchangeObjects[i_69_].getProgress();
																ProducingGraphicsBuffer.intStack[intStackIndex++] = i_70_ != 5 ? 0 : 1;
															} else {
																if (opcode != 3913) {
																	break;
																}
																final int i_71_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final int i_72_ = Class120_Sub3.grandExchangeObjects[i_71_].getProgress();
																ProducingGraphicsBuffer.intStack[intStackIndex++] = i_72_ == 1 ? 1 : 0;
															}
														} else if (opcode >= 4100) {
															if (opcode >= 4200) {
																if (opcode >= 4300) {
																	if (opcode < 4400) {
																		if (opcode != 4300) {
																			break;
																		}
																		intStackIndex -= 2;
																		final int i_73_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																		final int i_74_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																		final ParamType class120_sub14_sub11 = ParamType.list(i_73_);
																		if (!class120_sub14_sub11.isString()) {
																			ProducingGraphicsBuffer.intStack[intStackIndex++] = NpcType.list(i_74_).method2206(-9059, class120_sub14_sub11.defaultInt, i_73_);
																		} else {
																			Class33.stringStack[stringStackIndex++] = NpcType.list(i_74_).method2202(-1575770623, i_73_, class120_sub14_sub11.defaultString);
																		}
																	} else if (opcode >= 4500) {
																		if (opcode >= 4600) {
																			if (opcode < 5100) {
																				if (opcode == 5000) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class69_Sub3_Sub1.anInt3084;
																				} else if (opcode == 5001) {
																					intStackIndex -= 3;
																					Class69_Sub3_Sub1.anInt3084 = ProducingGraphicsBuffer.intStack[intStackIndex];
																					Class120_Sub12_Sub31.anInt3382 = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																					KeyboardHandler.anInt1507 = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(234);
																					Class120_Sub12_Sub11.outputStream.putByte(Class69_Sub3_Sub1.anInt3084);
																					Class120_Sub12_Sub11.outputStream.putByte(Class120_Sub12_Sub31.anInt3382);
																					Class120_Sub12_Sub11.outputStream.putByte(KeyboardHandler.anInt1507);
																				} else if (opcode == 5002) {
																					final String string = Class33.stringStack[--stringStackIndex];
																					intStackIndex -= 2;
																					final int i_75_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_76_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(90);
																					Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(string));
																					Class120_Sub12_Sub11.outputStream.putByte(i_75_ + -1);
																					Class120_Sub12_Sub11.outputStream.putByte(i_76_);
																				} else if (opcode == 5003) {
																					final int i_77_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					String string = null;
																					if (i_77_ < 100) {
																						string = GrandExchangeObject.aStringArray1502[i_77_];
																					}
																					if (string == null) {
																						string = "";
																					}
																					Class33.stringStack[stringStackIndex++] = string;
																				} else if (opcode == 5004) {
																					int i_78_ = -1;
																					final int i_79_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					if (i_79_ < 100 && GrandExchangeObject.aStringArray1502[i_79_] != null) {
																						i_78_ = Class136.anIntArray1315[i_79_];
																					}
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_78_;
																				} else if (opcode == 5005) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub31.anInt3382;
																				} else if (opcode == 5008) {
																					String string = Class33.stringStack[--stringStackIndex];
																					if (string.startsWith("::")) {
																						Class120_Sub12_Sub20.method1301((byte) 124, string);
																					} else if (Class86.staffLevel != 0 || (!VarBit.aBoolean167 || OverlayType.aBoolean1228) && !Class120_Sub14_Sub4.aBoolean3464) {
																						String string_80_ = string.toLowerCase();
																						int i_81_ = 0;
																						int i_82_ = 0;
																						if (string_80_.startsWith(Class120_Sub12.aString2566)) {
																							string = string.substring(Class120_Sub12.aString2566.length());
																							i_81_ = 0;
																						} else if (string_80_.startsWith(Class120_Sub15.aString2589)) {
																							i_81_ = 1;
																							string = string.substring(Class120_Sub15.aString2589.length());
																						} else if (!string_80_.startsWith(Class33.aString276)) {
																							if (!string_80_.startsWith(Class111.aString1066)) {
																								if (string_80_.startsWith(Node.aString1148)) {
																									string = string.substring(Node.aString1148.length());
																									i_81_ = 4;
																								} else if (!string_80_.startsWith(Class118.aString1137)) {
																									if (!string_80_.startsWith(GroundTile.aString2622)) {
																										if (!string_80_.startsWith(SubScript.aString1766)) {
																											if (string_80_.startsWith(Class127.aString1217)) {
																												string = string.substring(Class127.aString1217.length());
																												i_81_ = 8;
																											} else if (string_80_.startsWith(Class120_Sub21.aString2665)) {
																												string = string.substring(Class120_Sub21.aString2665.length());
																												i_81_ = 9;
																											} else if (string_80_.startsWith(Class7.aString60)) {
																												i_81_ = 10;
																												string = string.substring(Class7.aString60.length());
																											} else if (string_80_.startsWith(ObjectContainer.aString2614)) {
																												string = string.substring(ObjectContainer.aString2614.length());
																												i_81_ = 11;
																											} else if (Class9.language != 0) {
																												if (!string_80_.startsWith(Class69_Sub1.aString2231)) {
																													if (!string_80_.startsWith(Class53_Sub1.aString2213)) {
																														if (string_80_.startsWith(Class69.aString618)) {
																															i_81_ = 2;
																															string = string.substring(Class69.aString618.length());
																														} else if (!string_80_.startsWith(Class158.aString1483)) {
																															if (!string_80_.startsWith(AbstractRequest.aString3575)) {
																																if (string_80_.startsWith(ClanMember.aString2574)) {
																																	string = string.substring(ClanMember.aString2574.length());
																																	i_81_ = 5;
																																} else if (!string_80_.startsWith(Class147.aString1397)) {
																																	if (string_80_.startsWith(Class53_Sub1.aString2206)) {
																																		i_81_ = 7;
																																		string = string.substring(Class53_Sub1.aString2206.length());
																																	} else if (string_80_.startsWith(NpcType.aString1685)) {
																																		string = string.substring(NpcType.aString1685.length());
																																		i_81_ = 8;
																																	} else if (!string_80_.startsWith(Class111.aString1062)) {
																																		if (!string_80_.startsWith(Class156.aString1457)) {
																																			if (string_80_.startsWith(Class136.aString1316)) {
																																				i_81_ = 11;
																																				string = string.substring(Class136.aString1316.length());
																																			}
																																		} else {
																																			string = string.substring(Class156.aString1457.length());
																																			i_81_ = 10;
																																		}
																																	} else {
																																		i_81_ = 9;
																																		string = string.substring(Class111.aString1062.length());
																																	}
																																} else {
																																	string = string.substring(Class147.aString1397.length());
																																	i_81_ = 6;
																																}
																															} else {
																																i_81_ = 4;
																																string = string.substring(AbstractRequest.aString3575.length());
																															}
																														} else {
																															i_81_ = 3;
																															string = string.substring(Class158.aString1483.length());
																														}
																													} else {
																														string = string.substring(Class53_Sub1.aString2213.length());
																														i_81_ = 1;
																													}
																												} else {
																													string = string.substring(Class69_Sub1.aString2231.length());
																													i_81_ = 0;
																												}
																											}
																										} else {
																											i_81_ = 7;
																											string = string.substring(SubScript.aString1766.length());
																										}
																									} else {
																										string = string.substring(GroundTile.aString2622.length());
																										i_81_ = 6;
																									}
																								} else {
																									string = string.substring(Class118.aString1137.length());
																									i_81_ = 5;
																								}
																							} else {
																								string = string.substring(Class111.aString1066.length());
																								i_81_ = 3;
																							}
																						} else {
																							string = string.substring(Class33.aString276.length());
																							i_81_ = 2;
																						}
																						string_80_ = string.toLowerCase();
																						if (string_80_.startsWith(Class71.aString624)) {
																							string = string.substring(Class71.aString624.length());
																							i_82_ = 1;
																						} else if (string_80_.startsWith(Class99.aString952)) {
																							i_82_ = 2;
																							string = string.substring(Class99.aString952.length());
																						} else if (string_80_.startsWith(Class39.aString325)) {
																							i_82_ = 3;
																							string = string.substring(Class39.aString325.length());
																						} else if (!string_80_.startsWith(Class186.aString1903)) {
																							if (string_80_.startsWith(InterfaceListener.aString2548)) {
																								i_82_ = 5;
																								string = string.substring(InterfaceListener.aString2548.length());
																							} else if (Class9.language != 0) {
																								if (!string_80_.startsWith(HintIcon.aString807)) {
																									if (string_80_.startsWith(Class147.aString1398)) {
																										string = string.substring(Class147.aString1398.length());
																										i_82_ = 2;
																									} else if (!string_80_.startsWith(Class96.aString915)) {
																										if (string_80_.startsWith(GameEntity.aString3011)) {
																											i_82_ = 4;
																											string = string.substring(GameEntity.aString3011.length());
																										} else if (string_80_.startsWith(InterfaceListener.aString2538)) {
																											string = string.substring(InterfaceListener.aString2538.length());
																											i_82_ = 5;
																										}
																									} else {
																										i_82_ = 3;
																										string = string.substring(Class96.aString915.length());
																									}
																								} else {
																									string = string.substring(HintIcon.aString807.length());
																									i_82_ = 1;
																								}
																							}
																						} else {
																							string = string.substring(Class186.aString1903.length());
																							i_82_ = 4;
																						}
																						Class120_Sub12_Sub11.outputStream.putByteIsaac(186);
																						Class120_Sub12_Sub11.outputStream.putByte(0);
																						final int i_83_ = Class120_Sub12_Sub11.outputStream.pos;
																						Class120_Sub12_Sub11.outputStream.putByte(i_81_);
																						Class120_Sub12_Sub11.outputStream.putByte(i_82_);
																						Class148.method2060(Class120_Sub12_Sub11.outputStream, string, -32696);
																						Class120_Sub12_Sub11.outputStream.putSizedByte(Class120_Sub12_Sub11.outputStream.pos + -i_83_);
																					}
																				} else if (opcode == 5009) {
																					stringStackIndex -= 2;
																					final String string = Class33.stringStack[stringStackIndex];
																					final String string_84_ = Class33.stringStack[stringStackIndex + 1];
																					if (Class86.staffLevel != 0 || (!VarBit.aBoolean167 || OverlayType.aBoolean1228) && !Class120_Sub14_Sub4.aBoolean3464) {
																						Class120_Sub12_Sub11.outputStream.putByteIsaac(157);
																						Class120_Sub12_Sub11.outputStream.putByte(0);
																						final int i_85_ = Class120_Sub12_Sub11.outputStream.pos;
																						Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(string));
																						Class148.method2060(Class120_Sub12_Sub11.outputStream, string_84_, -32696);
																						Class120_Sub12_Sub11.outputStream.putSizedByte(-i_85_ + Class120_Sub12_Sub11.outputStream.pos);
																					}
																				} else if (opcode == 5010) {
																					String string = null;
																					final int i_86_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					if (i_86_ < 100) {
																						string = Class76.aStringArray677[i_86_];
																					}
																					if (string == null) {
																						string = "";
																					}
																					Class33.stringStack[stringStackIndex++] = string;
																				} else if (opcode == 5011) {
																					final int i_87_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					String string = null;
																					if (i_87_ < 100) {
																						string = Class120_Sub2.aStringArray2423[i_87_];
																					}
																					if (string == null) {
																						string = "";
																					}
																					Class33.stringStack[stringStackIndex++] = string;
																				} else if (opcode == 5012) {
																					final int i_88_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					int i_89_ = -1;
																					if (i_88_ < 100) {
																						i_89_ = Class120_Sub12_Sub36.anIntArray3422[i_88_];
																					}
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_89_;
																				} else if (opcode == 5015) {
																					String string;
																					if (Class100.selfPlayer != null && Class100.selfPlayer.name != null) {
																						string = Class100.selfPlayer.getTitledName();
																					} else {
																						string = Class74.loginName;
																					}
																					Class33.stringStack[stringStackIndex++] = string;
																				} else if (opcode == 5016) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = KeyboardHandler.anInt1507;
																				} else if (opcode == 5017) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub16.messageCount;
																				} else if (opcode == 5050) {
																					final int i_90_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					Class33.stringStack[stringStackIndex++] = Class120_Sub11.method1174(i_90_).aString3650;
																				} else if (opcode == 5051) {
																					final int i_91_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_91_);
																					if (class120_sub14_sub23.anIntArray3651 != null) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub23.anIntArray3651.length;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					}
																				} else if (opcode == 5052) {
																					intStackIndex -= 2;
																					final int i_92_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					final int i_93_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_93_);
																					final int i_94_ = class120_sub14_sub23.anIntArray3651[i_92_];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_94_;
																				} else if (opcode == 5053) {
																					final int i_95_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_95_);
																					if (class120_sub14_sub23.anIntArray3648 != null) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub23.anIntArray3648.length;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					}
																				} else if (opcode == 5054) {
																					intStackIndex -= 2;
																					final int i_96_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_97_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub11.method1174(i_96_).anIntArray3648[i_97_];
																				} else if (opcode == 5055) {
																					final int i_98_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					Class33.stringStack[stringStackIndex++] = Class121.method1837(i_98_, true).method1510();
																				} else if (opcode == 5056) {
																					final int i_99_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_99_, true);
																					if (class120_sub14_sub10.anIntArray3535 != null) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub10.anIntArray3535.length;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					}
																				} else if (opcode == 5057) {
																					intStackIndex -= 2;
																					final int i_100_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_101_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class121.method1837(i_100_, true).anIntArray3535[i_101_];
																				} else if (opcode == 5058) {
																					Class101_Sub1.aClass22_2273 = new Class22();
																					Class101_Sub1.aClass22_2273.anInt129 = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128 = Class121.method1837(Class101_Sub1.aClass22_2273.anInt129, true);
																					Class101_Sub1.aClass22_2273.anIntArray133 = new int[Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1500()];
																				} else if (opcode == 5059) {
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(222);
																					Class120_Sub12_Sub11.outputStream.putByte(0);
																					final int i_102_ = Class120_Sub12_Sub11.outputStream.pos;
																					Class120_Sub12_Sub11.outputStream.putByte(0);
																					Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																					Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																					Class120_Sub12_Sub11.outputStream.putSizedByte(-i_102_ + Class120_Sub12_Sub11.outputStream.pos);
																				} else if (opcode == 5060) {
																					final String string = Class33.stringStack[--stringStackIndex];
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(42);
																					Class120_Sub12_Sub11.outputStream.putByte(0);
																					final int i_103_ = Class120_Sub12_Sub11.outputStream.pos;
																					Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(string));
																					Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																					Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																					Class120_Sub12_Sub11.outputStream.putSizedByte(-i_103_ + Class120_Sub12_Sub11.outputStream.pos);
																				} else if (opcode == 5061) {
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(222);
																					Class120_Sub12_Sub11.outputStream.putByte(0);
																					final int i_104_ = Class120_Sub12_Sub11.outputStream.pos;
																					Class120_Sub12_Sub11.outputStream.putByte(1);
																					Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																					Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																					Class120_Sub12_Sub11.outputStream.putSizedByte(Class120_Sub12_Sub11.outputStream.pos + -i_104_);
																				} else if (opcode == 5062) {
																					intStackIndex -= 2;
																					final int i_105_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_106_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub11.method1174(i_105_).aCharArray3652[i_106_];
																				} else if (opcode == 5063) {
																					intStackIndex -= 2;
																					final int i_107_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_108_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub11.method1174(i_107_).aCharArray3653[i_108_];
																				} else if (opcode == 5064) {
																					intStackIndex -= 2;
																					final int i_109_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																					final int i_110_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					if (i_109_ != -1) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub11.method1174(i_110_).method1643((char) i_109_);
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					}
																				} else if (opcode == 5065) {
																					intStackIndex -= 2;
																					final int i_111_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																					final int i_112_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					if (i_111_ != -1) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub11.method1174(i_112_).method1640((char) i_111_, -1);
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					}
																				} else if (opcode == 5066) {
																					final int i_113_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class121.method1837(i_113_, true).method1500();
																				} else if (opcode == 5067) {
																					intStackIndex -= 2;
																					final int i_114_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_115_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																					final int i_116_ = Class121.method1837(i_114_, true).method1502(i_115_, 0);
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_116_;
																				} else if (opcode == 5068) {
																					intStackIndex -= 2;
																					final int i_117_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_118_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					Class101_Sub1.aClass22_2273.anIntArray133[i_117_] = i_118_;
																				} else if (opcode == 5069) {
																					intStackIndex -= 2;
																					final int i_119_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_120_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					Class101_Sub1.aClass22_2273.anIntArray133[i_119_] = i_120_;
																				} else if (opcode == 5070) {
																					intStackIndex -= 3;
																					final int i_121_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_122_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
																					final int i_123_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_121_, true);
																					if (class120_sub14_sub10.method1502(i_123_, 0) != 0) {
																						throw new RuntimeException("bad command");
																					}
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub10.method1501(i_122_, 0, i_123_);
																				} else if (opcode == 5071) {
																					final String string = Class33.stringStack[--stringStackIndex];
																					final boolean bool_124_ = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																					Class110.method978(bool_124_, string);
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Buffer.anInt2474;
																				} else if (opcode == 5072) {
																					if (Class120_Sub12_Sub37.aShortArray3430 != null && Buffer.anInt2474 > Class108.anInt1035) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(65535, Class120_Sub12_Sub37.aShortArray3430[Class108.anInt1035++]);
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					}
																				} else {
																					if (opcode != 5073) {
																						break;
																					}
																					Class108.anInt1035 = 0;
																				}
																			} else if (opcode < 5200) {
																				if (opcode == 5100) {
																					if (NodeCache.aBooleanArray299[86]) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					}
																				} else if (opcode == 5101) {
																					if (!NodeCache.aBooleanArray299[82]) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
																					}
																				} else {
																					if (opcode != 5102) {
																						break;
																					}
																					if (NodeCache.aBooleanArray299[81]) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					}
																				}
																			} else if (opcode >= 5300) {
																				if (opcode < 5400) {
																					if (opcode == 5300) {
																						intStackIndex -= 2;
																						final int i_125_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																						final int i_126_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																						AbstractSprite.method1593(3, i_125_, i_126_, false);
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub14_Sub10.fullscreenFrame != null ? 1 : 0;
																					} else if (opcode == 5301) {
																						if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																							AbstractSprite.method1593(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
																						}
																					} else if (opcode == 5302) {
																						final DisplayModeInfo[] class171s = Class114.constructDisplayModes();
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class171s.length;
																					} else if (opcode == 5303) {
																						final int i_127_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																						final DisplayModeInfo[] class171s = Class114.constructDisplayModes();
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class171s[i_127_].width;
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = class171s[i_127_].height;
																					} else if (opcode == 5305) {
																						final int i_128_ = Class120_Sub12_Sub18.lastFullscreenWidth;
																						final int i_129_ = Class120_Sub12_Sub12.lastFullscreenHeight;
																						int i_130_ = -1;
																						final DisplayModeInfo[] class171s = Class114.constructDisplayModes();
																						for (int i_131_ = 0; class171s.length > i_131_; i_131_++) {
																							final DisplayModeInfo displayModeInfo = class171s[i_131_];
																							if (displayModeInfo.width == i_128_ && displayModeInfo.height == i_129_) {
																								i_130_ = i_131_;
																								break;
																							}
																						}
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = i_130_;
																					} else if (opcode == 5306) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub4.getDisplayMode();
																					} else if (opcode == 5307) {
																						int i_132_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																						if (i_132_ < 0 || i_132_ > 2) {
																							i_132_ = 0;
																						}
																						AbstractSprite.method1593(i_132_, -1, -1, false);
																					} else if (opcode == 5308) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub19.currentDisplayMode;
																					} else {
																						if (opcode != 5309) {
																							break;
																						}
																						int i_133_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																						if (i_133_ < 0 || i_133_ > 2) {
																							i_133_ = 0;
																						}
																						Class120_Sub12_Sub19.currentDisplayMode = i_133_;
																						Class120_Sub6.savePreferences(NpcType.gameSignlink);
																					}
																				} else if (opcode >= 5500) {
																					if (opcode >= 5600) {
																						if (opcode < 5700) {
																							if (opcode == 5600) {
																								stringStackIndex -= 2;
																								final int i_134_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								final String string = Class33.stringStack[stringStackIndex];
																								final String string_135_ = Class33.stringStack[stringStackIndex - -1];
																								if (Class109.gameState == 10 && FrameLoader.anInt3609 == 0 && Class86.loginStep == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																									CanvasWrapper.method66(string_135_, string, i_134_);
																								}
																							} else if (opcode == 5601) {
																								Buffer.method1121(-3);
																							} else if (opcode == 5602) {
																								if (Class86.loginStep == 0) {
																									Class48.returnCode = -2;
																								}
																							} else if (opcode == 5603) {
																								intStackIndex -= 4;
																								if (Class109.gameState == 10 && FrameLoader.anInt3609 == 0 && Class86.loginStep == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																									Queue.method2254(false, ProducingGraphicsBuffer.intStack[2 + intStackIndex], ProducingGraphicsBuffer.intStack[intStackIndex - -3], ProducingGraphicsBuffer.intStack[intStackIndex - -1], ProducingGraphicsBuffer.intStack[intStackIndex]);
																								}
																							} else if (opcode == 5604) {
																								stringStackIndex--;
																								if (Class109.gameState == 10 && FrameLoader.anInt3609 == 0 && Class86.loginStep == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																									Class3.method87(19536, Varp.stringToLong(Class33.stringStack[stringStackIndex]));
																								}
																							} else if (opcode == 5605) {
																								intStackIndex -= 7;
																								stringStackIndex -= 3;
																								if (Class109.gameState == 10 && FrameLoader.anInt3609 == 0 && Class86.loginStep == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																									Class142.method2007(ProducingGraphicsBuffer.intStack[intStackIndex - -6] == 1, ProducingGraphicsBuffer.intStack[intStackIndex], ProducingGraphicsBuffer.intStack[intStackIndex - -4] == 1, ProducingGraphicsBuffer.intStack[intStackIndex - -3], Class33.stringStack[stringStackIndex + 2], ProducingGraphicsBuffer.intStack[intStackIndex - -1], ProducingGraphicsBuffer.intStack[2 + intStackIndex], (byte) 119, Varp.stringToLong(Class33.stringStack[stringStackIndex]), ProducingGraphicsBuffer.intStack[intStackIndex - -5] == 1, Class33.stringStack[1 + stringStackIndex]);
																								}
																							} else if (opcode == 5606) {
																								if (Class154.anInt1440 == 0) {
																									Class120_Sub12_Sub35.anInt3410 = -2;
																								}
																							} else if (opcode == 5607) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class48.returnCode;
																							} else if (opcode == 5608) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class57.anInt504;
																							} else if (opcode == 5609) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub35.anInt3410;
																							} else if (opcode == 5610) {
																								for (int i_136_ = 0; i_136_ < 5; i_136_++) {
																									Class33.stringStack[stringStackIndex++] = Class45.aStringArray399.length > i_136_ ? Class120_Sub12_Sub23.method1326(Class45.aStringArray399[i_136_], true) : "";
																								}
																								Class45.aStringArray399 = null;
																							} else {
																								if (opcode != 5611) {
																									break;
																								}
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub22.anInt2672;
																							}
																						} else if (opcode < 6100) {
																							if (opcode == 6001) {
																								int i_137_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_137_ < 1) {
																									i_137_ = 1;
																								}
																								if (i_137_ > 4) {
																									i_137_ = 4;
																								}
																								FileSystemRequest.brightness = i_137_;
																								if (!HDToolkit.glEnabled || !Class120_Sub12_Sub6.highLightingDetail) {
																									if (FileSystemRequest.brightness == 1) {
																										Rasterizer.method852(0.9F);
																									}
																									if (FileSystemRequest.brightness == 2) {
																										Rasterizer.method852(0.8F);
																									}
																									if (FileSystemRequest.brightness == 3) {
																										Rasterizer.method852(0.7F);
																									}
																									if (FileSystemRequest.brightness == 4) {
																										Rasterizer.method852(0.6F);
																									}
																								}
																								if (HDToolkit.glEnabled) {
																									AmbientSound.method1159();
																									if (!Class120_Sub12_Sub6.highLightingDetail) {
																										LocType.method2458();
																									}
																								}
																								Class10.method122();
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6002) {
																								GameShell.method32(ProducingGraphicsBuffer.intStack[--intStackIndex] == 1);
																								Class120_Sub12_Sub25.method1334();
																								LocType.method2458();
																								Class57.method492();
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6003) {
																								Class120_Sub12.aBoolean2564 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class57.method492();
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6005) {
																								Hashtable.showGroundDecorations = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								LocType.method2458();
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6006) {
																								Class108_Sub3.highDetailTextures = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								((Class143_Sub1) Rasterizer.anInterface5_973).method2022(!Class108_Sub3.highDetailTextures, 2047);
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6007) {
																								Class120_Sub12_Sub10.manyIdleAnimations = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6008) {
																								Class191.flickeringEffectsOn = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6009) {
																								Class120_Sub30_Sub1.manyGroundTextures = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6010) {
																								Class120_Sub6.characterShadowsOn = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6011) {
																								int i_138_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_138_ < 0 || i_138_ > 2) {
																									i_138_ = 0;
																								}
																								Class74.sceneryShadowsType = i_138_;// TODO
																																	// this,
																																	// dig
																																	// deeper
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6012) {
																								if (HDToolkit.glEnabled) {
																									Class120_Sub14_Sub13.method1532(0, 0);
																								}
																								Class120_Sub12_Sub6.highLightingDetail = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								if (!HDToolkit.glEnabled || !Class120_Sub12_Sub6.highLightingDetail) {
																									if (FileSystemRequest.brightness == 1) {
																										Rasterizer.method852(0.9F);
																									}
																									if (FileSystemRequest.brightness == 2) {
																										Rasterizer.method852(0.8F);
																									}
																									if (FileSystemRequest.brightness == 3) {
																										Rasterizer.method852(0.7F);
																									}
																									if (FileSystemRequest.brightness == 4) {
																										Rasterizer.method852(0.6F);
																									}
																								} else {
																									Rasterizer.method852(0.7F);
																								}
																								LocType.method2458();
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6014) {
																								PacketBuffer.highWaterDetail = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								if (HDToolkit.glEnabled) {
																									LocType.method2458();
																								}
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6015) {
																								Decimator.fogEnabled = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								if (HDToolkit.glEnabled) {
																									AmbientSound.method1159();
																								}
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6016) {
																								int i_139_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (HDToolkit.glEnabled) {
																									Class120_Sub3.canvasReplaceRecommended = true;
																								}
																								if (i_139_ < 0 || i_139_ > 2) {
																									i_139_ = 0;
																								}
																								Class36.antiAliasingSamples = i_139_;
																							} else if (opcode == 6017) {
																								Class167.aBoolean1619 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class10.method123(23529);
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6018) {
																								int i_140_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_140_ < 0) {
																									i_140_ = 0;
																								}
																								if (i_140_ > 127) {
																									i_140_ = 127;
																								}
																								Class111.anInt1061 = i_140_;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6019) {
																								int i_141_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_141_ < 0) {
																									i_141_ = 0;
																								}
																								if (i_141_ > 255) {
																									i_141_ = 255;
																								}
																								if (RuntimeException_Sub1.anInt2142 != i_141_) {
																									if (RuntimeException_Sub1.anInt2142 != 0 || (Class157.anInt1466 ^ 0xffffffff) == 0) {
																										if (i_141_ == 0) {
																											Class188.method2481(104);
																											Class120_Sub12_Sub15.aBoolean3247 = false;
																										} else {
																											Class140.method1995(i_141_);
																										}
																									} else {
																										Class127.method1891(i_141_, -20329, 0, Class157.anInt1466, false, Class120_Sub12_Sub36.aClass50_3419);
																										Class120_Sub12_Sub15.aBoolean3247 = false;
																									}
																									RuntimeException_Sub1.anInt2142 = i_141_;
																								}
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6020) {
																								int i_142_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_142_ < 0) {
																									i_142_ = 0;
																								}
																								if (i_142_ > 127) {
																									i_142_ = 127;
																								}
																								CursorType.anInt1242 = i_142_;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																							} else if (opcode == 6021) {
																								Class52.aBoolean466 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class57.method492();
																							} else if (opcode == 6023) {
																								boolean bool_143_ = false;
																								int i_144_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_144_ < 0) {
																									i_144_ = 0;
																								}
																								if (i_144_ > 2) {
																									i_144_ = 2;
																								}
																								if (Class120_Sub14_Sub13.maxMemory < 96) {
																									i_144_ = 0;
																									bool_143_ = true;
																								}
																								ParticleEngine.setParticles(i_144_);
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								Class120_Sub14_Sub5.aBoolean3471 = false;
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = bool_143_ ? 0 : 1;
																							} else if (opcode == 6024) {
																								int i_145_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (i_145_ < 0 || i_145_ > 2) {
																									i_145_ = 0;
																								}
																								AbstractMouseWheelHandler.antiAliasingSamplesWrapper = i_145_;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																							} else if (opcode == 6027) {
																								int i_146_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																								if (HDToolkit.glEnabled) {
																									if (i_146_ < 0 || i_146_ > 1) {
																										i_146_ = 0;
																									}
																									Class108_Sub1.method933(i_146_ == 1);
																								}
																							} else {
																								if (opcode != 6028) {
																									break;
																								}
																								Class38.cursorsEnabled = ProducingGraphicsBuffer.intStack[--intStackIndex] != 0;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																							}
																						} else if (opcode < 6200) {
																							if (opcode == 6101) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = FileSystemRequest.brightness;
																							} else if (opcode == 6102) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = !Class143_Sub1.method2021() ? 0 : 1;
																							} else if (opcode == 6103) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12.aBoolean2564 ? 1 : 0;
																							} else if (opcode == 6105) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = !Hashtable.showGroundDecorations ? 0 : 1;
																							} else if (opcode == 6106) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class108_Sub3.highDetailTextures ? 1 : 0;
																							} else if (opcode == 6107) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub10.manyIdleAnimations ? 1 : 0;
																							} else if (opcode == 6108) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = !Class191.flickeringEffectsOn ? 0 : 1;
																							} else if (opcode == 6109) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub30_Sub1.manyGroundTextures ? 1 : 0;
																							} else if (opcode == 6110) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub6.characterShadowsOn ? 1 : 0;
																							} else if (opcode == 6111) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class74.sceneryShadowsType;
																							} else if (opcode == 6112) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub6.highLightingDetail ? 1 : 0;
																							} else if (opcode == 6114) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = PacketBuffer.highWaterDetail ? 1 : 0;
																							} else if (opcode == 6115) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Decimator.fogEnabled ? 1 : 0;
																							} else if (opcode == 6116) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class36.antiAliasingSamples;
																							} else if (opcode == 6117) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class167.aBoolean1619 ? 1 : 0;
																							} else if (opcode == 6118) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class111.anInt1061;
																							} else if (opcode == 6119) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = RuntimeException_Sub1.anInt2142;
																							} else if (opcode == 6120) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = CursorType.anInt1242;
																							} else if (opcode == 6121) {
																								if (HDToolkit.glEnabled) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = HDToolkit.aBoolean523 ? 1 : 0;
																								} else {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																								}
																							} else if (opcode == 6123) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = ParticleEngine.method949();
																							} else if (opcode == 6124) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = AbstractMouseWheelHandler.antiAliasingSamplesWrapper;
																							} else if (opcode == 6126) {
																								if (HDToolkit.glEnabled) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = Class34.method286() ? 1 : 0;
																								} else {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																								}
																							} else if (opcode == 6127) {
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class186.hdrEnabled ? 1 : 0;
																							} else {
																								if (opcode != 6128) {
																									break;
																								}
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class38.cursorsEnabled ? 1 : 0;
																							}
																						} else if (opcode >= 6300) {
																							if (opcode < 6400) {
																								if (opcode == 6300) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (TimeUtil.getSafeTime() / 60000L);
																								} else if (opcode == 6301) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (TimeUtil.getSafeTime() / 86400000L) - 11745;
																								} else if (opcode == 6302) {
																									intStackIndex -= 3;
																									final int i_147_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																									final int i_148_ = ProducingGraphicsBuffer.intStack[intStackIndex - -2];
																									final int i_149_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																									Class192.aCalendar2121.clear();
																									Class192.aCalendar2121.set(11, 12);
																									Class192.aCalendar2121.set(i_148_, i_149_, i_147_);
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (Class192.aCalendar2121.getTime().getTime() / 86400000L) - 11745;
																								} else if (opcode == 6303) {
																									Class192.aCalendar2121.clear();
																									Class192.aCalendar2121.setTime(new Date(TimeUtil.getSafeTime()));
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = Class192.aCalendar2121.get(1);
																								} else {
																									if (opcode != 6304) {
																										break;
																									}
																									final int i_150_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									boolean bool_151_ = true;
																									if (i_150_ >= 0) {
																										if (i_150_ < 1582) {
																											bool_151_ = i_150_ % 4 == 0;
																										} else if (i_150_ % 4 != 0) {
																											bool_151_ = false;
																										} else if (i_150_ % 100 != 0) {
																											bool_151_ = true;
																										} else if (i_150_ % 400 != 0) {
																											bool_151_ = false;
																										}
																									} else {
																										bool_151_ = (1 + i_150_) % 4 == 0;
																									}
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = !bool_151_ ? 0 : 1;
																								}
																							} else if (opcode < 6500) {
																								if (opcode == 6405) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = Canvas_Sub1.showVideoAd() ? 1 : 0;
																								} else {
																									if (opcode != 6406) {
																										break;
																									}
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = Light.isShowingVideoAd() ? 1 : 0;
																								}
																							} else if (opcode < 6600) {
																								if (opcode == 6500) {
																									if (Class109.gameState != 10 || FrameLoader.anInt3609 != 0 || Class86.loginStep != 0 || Class154.anInt1440 != 0) {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
																									} else {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = (Class96.method788(61) ^ 0xffffffff) != 0 ? 1 : 0;
																									}
																								} else if (opcode == 6501) {
																									final World class167_sub1 = World.getFirstWorld();
																									if (class167_sub1 == null) {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																									} else {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.worldId;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.flag;
																										Class33.stringStack[stringStackIndex++] = class167_sub1.activity;
																										final WorldInfo worldInfo = class167_sub1.getWorldInfo();
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = worldInfo.country;
																										Class33.stringStack[stringStackIndex++] = worldInfo.region;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.players;
																									}
																								} else if (opcode == 6502) {
																									final World class167_sub1 = World.getNextWorld();
																									if (class167_sub1 == null) {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																									} else {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.worldId;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.flag;
																										Class33.stringStack[stringStackIndex++] = class167_sub1.activity;
																										final WorldInfo worldInfo = class167_sub1.getWorldInfo();
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = worldInfo.country;
																										Class33.stringStack[stringStackIndex++] = worldInfo.region;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.players;
																									}
																								} else if (opcode == 6503) {
																									final int i_152_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									if (Class109.gameState == 10 && FrameLoader.anInt3609 == 0 && Class86.loginStep == 0 && Class154.anInt1440 == 0) {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = Class188.method2483(i_152_) ? 1 : 0;
																									} else {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																									}
																								} else if (opcode == 6504) {
																									Class120_Sub19.anInt2657 = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									Class120_Sub6.savePreferences(NpcType.gameSignlink);
																								} else if (opcode == 6505) {
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub19.anInt2657;
																								} else if (opcode == 6506) {
																									final int i_153_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									final World class167_sub1 = Class82.method710(i_153_);
																									if (class167_sub1 == null) {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																										Class33.stringStack[stringStackIndex++] = "";
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																									} else {
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.flag;
																										Class33.stringStack[stringStackIndex++] = class167_sub1.activity;
																										final WorldInfo worldInfo = class167_sub1.getWorldInfo();
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = worldInfo.country;
																										Class33.stringStack[stringStackIndex++] = worldInfo.region;
																										ProducingGraphicsBuffer.intStack[intStackIndex++] = class167_sub1.players;
																									}
																								} else {
																									if (opcode != 6507) {
																										break;
																									}
																									intStackIndex -= 4;
																									final int i_154_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																									final boolean bool_155_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex] == 1;
																									final int i_156_ = ProducingGraphicsBuffer.intStack[intStackIndex - -2];
																									final boolean bool_157_ = ProducingGraphicsBuffer.intStack[3 + intStackIndex] == 1;
																									Class120_Sub12_Sub4.method1211(bool_155_, 80, i_154_, bool_157_, i_156_);
																								}
																							} else if (opcode >= 6700) {
																								if (opcode >= 6900) {
																									break;
																								}
																								if (opcode == 6800) {
																									final int i_158_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									final Class73 class73 = Class73.list(i_158_);
																									if (class73.aString649 != null) {
																										Class33.stringStack[stringStackIndex++] = class73.aString649;
																									} else {
																										Class33.stringStack[stringStackIndex++] = "";
																									}
																								} else if (opcode == 6801) {
																									final int i_159_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									final Class73 class73 = Class73.list(i_159_);
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = class73.anInt644;
																								} else if (opcode == 6802) {
																									final int i_160_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									final Class73 class73 = Class73.list(i_160_);
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = class73.fontType;
																								} else {
																									if (opcode != 6803) {
																										break;
																									}
																									final int i_161_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																									final Class73 class73 = Class73.list(i_161_);
																									ProducingGraphicsBuffer.intStack[intStackIndex++] = class73.anInt652;
																								}
																							} else if (opcode == 6600) {
																								Class134.aBoolean1277 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																							} else {
																								if (opcode != 6601) {
																									break;
																								}
																								ProducingGraphicsBuffer.intStack[intStackIndex++] = Class134.aBoolean1277 ? 1 : 0;
																							}
																						} else if (opcode == 6200) {
																							intStackIndex -= 2;
																							Class169.aShort1651 = (short) ProducingGraphicsBuffer.intStack[intStackIndex];
																							if (Class169.aShort1651 <= 0) {
																								Class169.aShort1651 = (short) 256;
																							}
																							Class120_Sub14_Sub13.aShort3570 = (short) ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																							if (Class120_Sub14_Sub13.aShort3570 <= 0) {
																								Class120_Sub14_Sub13.aShort3570 = (short) 205;
																							}
																						} else if (opcode == 6201) {
																							intStackIndex -= 2;
																							Class120_Sub12_Sub11.aShort3216 = (short) ProducingGraphicsBuffer.intStack[intStackIndex];
																							if (Class120_Sub12_Sub11.aShort3216 <= 0) {
																								Class120_Sub12_Sub11.aShort3216 = (short) 256;
																							}
																							Class61.aShort565 = (short) ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																							if (Class61.aShort565 <= 0) {
																								Class61.aShort565 = (short) 320;
																							}
																						} else if (opcode == 6202) {
																							intStackIndex -= 4;
																							Class120_Sub12_Sub16.aShort3250 = (short) ProducingGraphicsBuffer.intStack[intStackIndex];
																							if (Class120_Sub12_Sub16.aShort3250 <= 0) {
																								Class120_Sub12_Sub16.aShort3250 = (short) 1;
																							}
																							FileSystemRequest.aShort3932 = (short) ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																							if (FileSystemRequest.aShort3932 > 0) {
																								if (Class120_Sub12_Sub16.aShort3250 > FileSystemRequest.aShort3932) {
																									FileSystemRequest.aShort3932 = Class120_Sub12_Sub16.aShort3250;
																								}
																							} else {
																								FileSystemRequest.aShort3932 = (short) 32767;
																							}
																							RuntimeException_Sub1.aShort2143 = (short) ProducingGraphicsBuffer.intStack[intStackIndex + 2];
																							if (RuntimeException_Sub1.aShort2143 <= 0) {
																								RuntimeException_Sub1.aShort2143 = (short) 1;
																							}
																							GameShell.aShort2 = (short) ProducingGraphicsBuffer.intStack[intStackIndex + 3];
																							if (GameShell.aShort2 > 0) {
																								if (RuntimeException_Sub1.aShort2143 > GameShell.aShort2) {
																									GameShell.aShort2 = RuntimeException_Sub1.aShort2143;
																								}
																							} else {
																								GameShell.aShort2 = (short) 32767;
																							}
																						} else if (opcode == 6203) {
																							Class154.method2079(0, false, false, DummyInputStream.aClass189_26.height, 0, DummyInputStream.aClass189_26.width);
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub27.anInt3339;
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Light.anInt391;
																						} else if (opcode == 6204) {
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub11.aShort3216;
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Class61.aShort565;
																						} else {
																							if (opcode != 6205) {
																								break;
																							}
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Class169.aShort1651;
																							ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub14_Sub13.aShort3570;
																						}
																					} else if (opcode == 5500) {
																						intStackIndex -= 4;
																						final int i_162_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																						final int i_163_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																						final int i_164_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
																						final int i_165_ = ProducingGraphicsBuffer.intStack[intStackIndex - -3];
																						Class120_Sub14_Sub23.method1639(i_164_, -GameEntity.currentBaseX + ((i_162_ & 0xffffb19) >> 14), i_165_, i_163_, false, 0, (i_162_ & 0x3fff) + -Class181.currentBaseZ);
																					} else if (opcode == 5501) {
																						intStackIndex -= 4;
																						final int i_166_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																						final int i_167_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																						final int i_168_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
																						final int i_169_ = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
																						Class120_Sub12_Sub16.method1278(26379, i_167_, i_168_, ((i_166_ & 0xffff699) >> 14) - GameEntity.currentBaseX, -Class181.currentBaseZ + (0x3fff & i_166_), i_169_);
																					} else if (opcode == 5502) {
																						intStackIndex -= 6;
																						final int i_170_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																						if (i_170_ >= 2) {
																							throw new RuntimeException();
																						}
																						AbstractGraphicsBuffer.anInt1157 = i_170_;
																						final int i_171_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																						if (Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157].length >> 1 <= 1 + i_171_) {
																							throw new RuntimeException();
																						}
																						Class32.anInt272 = 0;
																						PlayerAppearance.anInt1372 = i_171_;
																						JagexInterface.anInt2053 = ProducingGraphicsBuffer.intStack[intStackIndex - -2];
																						Class120_Sub12_Sub6.anInt3176 = ProducingGraphicsBuffer.intStack[intStackIndex - -3];
																						final int i_172_ = ProducingGraphicsBuffer.intStack[4 + intStackIndex];
																						if (i_172_ >= 2) {
																							throw new RuntimeException();
																						}
																						Class120_Sub12_Sub15.anInt3248 = i_172_;
																						final int i_173_ = ProducingGraphicsBuffer.intStack[intStackIndex + 5];
																						if (Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248].length >> 1 <= 1 + i_173_) {
																							throw new RuntimeException();
																						}
																						client.cameraType = 3;
																						Class9.anInt67 = i_173_;
																					} else if (opcode == 5503) {
																						SpotAnimType.method876((byte) 103);
																					} else if (opcode == 5504) {
																						intStackIndex -= 2;
																						AmbientSound.method1158(ProducingGraphicsBuffer.intStack[intStackIndex], ProducingGraphicsBuffer.intStack[1 + intStackIndex]);
																					} else if (opcode == 5505) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) Class120_Sub12_Sub21.aFloat3293;
																					} else if (opcode == 5506) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) DummyOutputStream.aFloat28;
																					} else if (opcode == 5507) {
																						Class86.method727();
																					} else if (opcode == 5508) {
																						MouseHandler.method1028();
																					} else if (opcode == 5509) {
																						Class81.method707();
																					} else if (opcode == 5510) {
																						Class164.method2142();
																					} else {
																						if (opcode != 5512) {
																							break;
																						}
																						Class3.smoothCamera();
																					}
																				} else if (opcode == 5400) {
																					stringStackIndex -= 2;
																					final String string = Class33.stringStack[1 + stringStackIndex];
																					final int i_174_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					final String string_175_ = Class33.stringStack[stringStackIndex];
																					Class120_Sub12_Sub11.outputStream.putByteIsaac(243);
																					Class120_Sub12_Sub11.outputStream.putByte(1 + Class69_Sub2_Sub1.method620(string_175_) + Class69_Sub2_Sub1.method620(string));
																					Class120_Sub12_Sub11.outputStream.putJagexString(string_175_);
																					Class120_Sub12_Sub11.outputStream.putJagexString(string);
																					Class120_Sub12_Sub11.outputStream.putByte(i_174_);
																				} else if (opcode == 5401) {
																					intStackIndex -= 2;
																					Class120_Sub14_Sub22.aShortArray3639[ProducingGraphicsBuffer.intStack[intStackIndex]] = (short) InterfaceClickMask.method1688(122, ProducingGraphicsBuffer.intStack[intStackIndex + 1]);
																					Class79_Sub1.method695();
																					Class10.method122();
																					Class69_Sub3.method625(114);
																					Class38.method316(2883872);
																					Class132_Sub1.method1931();
																				} else if (opcode == 5405) {
																					intStackIndex -= 2;
																					final int i_176_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_177_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					if (i_176_ >= 0 && i_176_ < 2) {
																						Class143_Sub1.anIntArrayArrayArray2195[i_176_] = new int[i_177_ << 1][4];
																					}
																				} else if (opcode == 5406) {
																					intStackIndex -= 7;
																					final int i_178_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1] << 1;
																					final int i_179_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					final int i_180_ = ProducingGraphicsBuffer.intStack[intStackIndex - -3];
																					final int i_181_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
																					final int i_182_ = ProducingGraphicsBuffer.intStack[intStackIndex + 4];
																					final int i_183_ = ProducingGraphicsBuffer.intStack[5 + intStackIndex];
																					final int i_184_ = ProducingGraphicsBuffer.intStack[intStackIndex + 6];
																					if (i_179_ >= 0 && i_179_ < 2 && Class143_Sub1.anIntArrayArrayArray2195[i_179_] != null && i_178_ >= 0 && Class143_Sub1.anIntArrayArrayArray2195[i_179_].length > i_178_) {
																						Class143_Sub1.anIntArrayArrayArray2195[i_179_][i_178_] = new int[] { 128 * Class120_Sub12_Sub3.method1207(i_181_ >> 14, 16383), i_180_, 128 * Class120_Sub12_Sub3.method1207(16383, i_181_), i_184_ };
																						Class143_Sub1.anIntArrayArrayArray2195[i_179_][1 + i_178_] = new int[] { 128 * (Class120_Sub12_Sub3.method1207(i_182_, 268421244) >> 14), i_183_, Class120_Sub12_Sub3.method1207(16383, i_182_) * 128 };
																					}
																				} else if (opcode == 5407) {
																					final int i_185_ = Class143_Sub1.anIntArrayArrayArray2195[ProducingGraphicsBuffer.intStack[--intStackIndex]].length >> 1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_185_;
																				} else if (opcode == 5411) {
																					if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																						AbstractSprite.method1593(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
																					}
																					if (Class112.frame != null) {
																						System.exit(0);
																					} else {
																						Class188.method2482(Class181.method2439((byte) 104), false);
																					}
																				} else if (opcode == 5419) {
																					String string = "";
																					if (LabelGroup.aClass185_2403 != null) {
																						if (LabelGroup.aClass185_2403.value != null) {
																							string = (String) LabelGroup.aClass185_2403.value;
																						} else {
																							string = Class125.method1879(LabelGroup.aClass185_2403.integerData);
																						}
																					}
																					Class33.stringStack[stringStackIndex++] = string;
																				} else if (opcode == 5420) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Signlink.anInt1310 == 3 ? 1 : 0;
																				} else if (opcode == 5421) {
																					if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																						AbstractSprite.method1593(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
																					}
																					final String string = Class33.stringStack[--stringStackIndex];
																					final boolean bool_186_ = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																					final String string_187_ = new StringBuilder(Class181.method2439((byte) 104)).append(string).toString();
																					if (Class112.frame == null && (!bool_186_ || Signlink.anInt1310 == 3 || !Signlink.osName.startsWith("win") || FileSystem.haveInternetExplorer6)) {
																						Class188.method2482(string_187_, bool_186_);
																					} else {
																						WorldInfo.aString1421 = string_187_;
																						Class99.aBoolean950 = bool_186_;
																						Class3.aClass185_56 = NpcType.gameSignlink.method1953(string_187_, (byte) -88);
																					}
																				} else if (opcode == 5422) {
																					stringStackIndex -= 2;
																					final String string = Class33.stringStack[stringStackIndex];
																					final String string_188_ = Class33.stringStack[stringStackIndex + 1];
																					final int i_189_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																					if (string.length() > 0) {
																						if (Class182.prefixTitles == null) {
																							Class182.prefixTitles = new String[Node.anIntArray1151[Buffer.gameId]];
																						}
																						Class182.prefixTitles[i_189_] = string;
																					}
																					if (string_188_.length() > 0) {
																						if (Class53.suffixTitles == null) {
																							Class53.suffixTitles = new String[Node.anIntArray1151[Buffer.gameId]];
																						}
																						Class53.suffixTitles[i_189_] = string_188_;
																					}
																				} else if (opcode == 5423) {
																					System.out.println(Class33.stringStack[--stringStackIndex]);
																				} else if (opcode == 5424) {
																					intStackIndex -= 11;
																					Class140.anInt1345 = ProducingGraphicsBuffer.intStack[intStackIndex];
																					Class89.anInt837 = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																					Class120_Sub12_Sub3.anInt3147 = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
																					Class88.anInt832 = ProducingGraphicsBuffer.intStack[intStackIndex + 3];
																					client.anInt2199 = ProducingGraphicsBuffer.intStack[intStackIndex + 4];
																					Class114.anInt1099 = ProducingGraphicsBuffer.intStack[intStackIndex + 5];
																					Class24.anInt146 = ProducingGraphicsBuffer.intStack[intStackIndex + 6];
																					Class92.anInt864 = ProducingGraphicsBuffer.intStack[intStackIndex + 7];
																					Class31.anInt240 = ProducingGraphicsBuffer.intStack[intStackIndex + 8];
																					Class120_Sub12_Sub3.anInt3151 = ProducingGraphicsBuffer.intStack[intStackIndex + 9];
																					Class120_Sub12_Sub13.anInt3233 = ProducingGraphicsBuffer.intStack[intStackIndex + 10];
																					Class7.aClass50_63.method429(client.anInt2199);
																					Class7.aClass50_63.method429(Class114.anInt1099);
																					Class7.aClass50_63.method429(Class24.anInt146);
																					Class7.aClass50_63.method429(Class92.anInt864);
																					Class7.aClass50_63.method429(Class31.anInt240);
																					Class186.usingSpriteMenu = true;
																				} else if (opcode == 5425) {
																					LocType.resetSpriteMenu();
																					Class186.usingSpriteMenu = false;
																				} else if (opcode == 5426) {
																					AbstractIndexedSprite.defaultCursorId = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				} else if (opcode == 5427) {
																					intStackIndex -= 2;
																					Class120_Sub12_Sub10.anInt3205 = ProducingGraphicsBuffer.intStack[intStackIndex];
																					Class120_Sub12_Sub11.anInt3211 = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																				} else {
																					if (opcode != 5428) {
																						break;
																					}
																					intStackIndex -= 2;
																					final int i_190_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																					final int i_191_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = !Player.method2345(i_191_, i_190_, (byte) 117) ? 0 : 1;
																				}
																			} else if (opcode == 5200) {
																				ClientScript.method1522(ProducingGraphicsBuffer.intStack[--intStackIndex]);
																			} else if (opcode == 5201) {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = ParamType.method1517((byte) -120);
																			} else if (opcode == 5205) {
																				Class108.method932(false, -1, -1, ProducingGraphicsBuffer.intStack[--intStackIndex]);
																			} else if (opcode == 5206) {
																				final int i_192_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method676((i_192_ & 0xfffc4e5) >> 14, 0x3fff & i_192_);
																				if (class120_sub14_sub22 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub22.anInt3634;
																				}
																			} else if (opcode == 5207) {
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(ProducingGraphicsBuffer.intStack[--intStackIndex]);
																				if (class120_sub14_sub22 == null || class120_sub14_sub22.aString3647 == null) {
																					Class33.stringStack[stringStackIndex++] = "";
																				} else {
																					Class33.stringStack[stringStackIndex++] = class120_sub14_sub22.aString3647;
																				}
																			} else if (opcode == 5208) {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class173.anInt1726;
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = GroundObjectNode.anInt3628;
																			} else if (opcode == 5209) {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class108_Sub1.anInt2336 - -Class79.anInt695;
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class79.anInt694 + -Class169.anInt1646 + -1 + Class79.anInt692;
																			} else if (opcode == 5210) {
																				final int i_193_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_193_);
																				if (class120_sub14_sub22 != null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(class120_sub14_sub22.anInt3633 >> 14, 16383);
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(class120_sub14_sub22.anInt3633, 16383);
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																				}
																			} else if (opcode == 5211) {
																				final int i_194_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_194_);
																				if (class120_sub14_sub22 != null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub22.anInt3642 - class120_sub14_sub22.anInt3632;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub22.anInt3644 - class120_sub14_sub22.anInt3636;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																				}
																			} else if (opcode == 5212) {
																				final Class120_Sub14_Sub5 class120_sub14_sub5 = Class120_Sub12_Sub3.method1206((byte) 113);
																				if (class120_sub14_sub5 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub5.anInt3473;
																					final int i_195_ = Class79.anInt695 + class120_sub14_sub5.anInt3480 << 14 | class120_sub14_sub5.anInt3474 << 28 | Class79.anInt694 + Class79.anInt692 + -1 + -class120_sub14_sub5.anInt3481;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_195_;
																				}
																			} else if (opcode == 5213) {
																				final Class120_Sub14_Sub5 class120_sub14_sub5 = Class112.method992(2048);
																				if (class120_sub14_sub5 != null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub5.anInt3473;
																					final int i_196_ = -1 + Class79.anInt692 + Class79.anInt694 + -class120_sub14_sub5.anInt3481 | class120_sub14_sub5.anInt3474 << 28 | class120_sub14_sub5.anInt3480 - -Class79.anInt695 << 14;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = i_196_;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				}
																			} else if (opcode == 5214) {
																				final int i_197_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938();
																				if (class120_sub14_sub22 != null) {
																					final boolean bool_198_ = class120_sub14_sub22.method1630(0x3fff & i_197_, -1, i_197_ >> 28 & 0x3, anIntArray2832, i_197_ >> 14 & 0x3fff);
																					if (bool_198_) {
																						FileSystemWorker.a(anIntArray2832[1], anIntArray2832[2]);
																					}
																				}
																			} else if (opcode == 5215) {
																				intStackIndex -= 2;
																				final int i_199_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																				final int i_200_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																				final Queue queue = Class79.method677(0x3fff & i_200_ >> 14, i_200_ & 0x3fff);
																				boolean bool_201_ = false;
																				for (Class120_Sub14_Sub22 class120_sub14_sub22 = (Class120_Sub14_Sub22) queue.peekFirst(); class120_sub14_sub22 != null; class120_sub14_sub22 = (Class120_Sub14_Sub22) queue.peekNext()) {
																					if (class120_sub14_sub22.anInt3634 == i_199_) {
																						bool_201_ = true;
																						break;
																					}
																				}
																				if (!bool_201_) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
																				}
																			} else if (opcode == 5218) {
																				final int i_202_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_202_);
																				if (class120_sub14_sub22 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = class120_sub14_sub22.anInt3643;
																				}
																			} else if (opcode == 5220) {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class90.anInt848 != 100 ? 0 : 1;
																			} else if (opcode == 5221) {
																				final int i_203_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				FileSystemWorker.a((i_203_ & 0xfffc9be) >> 14, 0x3fff & i_203_);
																			} else if (opcode == 5222) {
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938();
																				if (class120_sub14_sub22 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				} else {
																					final boolean bool_204_ = class120_sub14_sub22.method1635(Class79.anInt695 + Class108_Sub1.anInt2336, Class79.anInt692 - (1 + Class169.anInt1646 + -Class79.anInt694), (byte) -125, anIntArray2832);
																					if (!bool_204_) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[1];
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[2];
																					}
																				}
																			} else if (opcode == 5223) {
																				intStackIndex -= 2;
																				final int i_205_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																				final int i_206_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																				Class108.method932(false, i_205_ & 0x3fff, i_205_ >> 14 & 0x3fff, i_206_);
																			} else if (opcode == 5224) {
																				final int i_207_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938();
																				if (class120_sub14_sub22 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				} else {
																					final boolean bool_208_ = class120_sub14_sub22.method1630(0x3fff & i_207_, -1, i_207_ >> 28 & 0x3, anIntArray2832, i_207_ >> 14 & 0x3fff);
																					if (bool_208_) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[1];
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[2];
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					}
																				}
																			} else if (opcode == 5225) {
																				final int i_209_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938();
																				if (class120_sub14_sub22 != null) {
																					final boolean bool_210_ = class120_sub14_sub22.method1635((i_209_ & 0xfffdf1a) >> 14, i_209_ & 0x3fff, (byte) -128, anIntArray2832);
																					if (bool_210_) {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[1];
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = anIntArray2832[2];
																					} else {
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																						ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					}
																				} else {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																				}
																			} else if (opcode == 5226) {
																				WorldInfo.method2066((byte) -121, ProducingGraphicsBuffer.intStack[--intStackIndex]);
																			} else if (opcode == 5227) {
																				intStackIndex -= 2;
																				final int i_211_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																				final int i_212_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																				Class108.method932(true, 0x3fff & i_212_, 0x3fff & i_212_ >> 14, i_211_);
																			} else if (opcode == 5228) {
																				Class120_Sub12_Sub27.aBoolean3348 = ProducingGraphicsBuffer.intStack[--intStackIndex] == 1;
																			} else if (opcode == 5229) {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub27.aBoolean3348 ? 1 : 0;
																			} else if (opcode == 5230) {
																				final int i_213_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				PacketBuffer.method1143(i_213_, (byte) -113);
																			} else if (opcode == 5231) {
																				intStackIndex -= 2;
																				final int i_214_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																				final boolean bool_215_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1] == 1;
																				if (Class81.aClass75_777 != null) {
																					Node node = Class81.aClass75_777.get(i_214_);
																					if (node == null || bool_215_) {
																						if (node == null && bool_215_) {
																							node = new Node();
																							Class81.aClass75_777.put(node, i_214_);
																						}
																					} else {
																						node.unlink();
																					}
																				}
																			} else if (opcode == 5232) {
																				final int i_216_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				if (Class81.aClass75_777 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																				} else {
																					final Node node = Class81.aClass75_777.get(i_216_);
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = node != null ? 1 : 0;
																				}
																			} else if (opcode == 5233) {
																				intStackIndex -= 2;
																				final int i_217_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																				final boolean bool_218_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1] == 1;
																				if (Class86.aClass75_823 != null) {
																					Node node = Class86.aClass75_823.get(i_217_);
																					if (node == null || bool_218_) {
																						if (node == null && bool_218_) {
																							node = new Node();
																							Class86.aClass75_823.put(node, i_217_);
																						}
																					} else {
																						node.unlink();
																					}
																				}
																			} else if (opcode == 5234) {
																				final int i_219_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																				if (Class86.aClass75_823 == null) {
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																				} else {
																					final Node node = Class86.aClass75_823.get(i_219_);
																					ProducingGraphicsBuffer.intStack[intStackIndex++] = node != null ? 1 : 0;
																				}
																			} else {
																				if (opcode != 5235) {
																					break;
																				}
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = Class79.aClass120_Sub14_Sub22_691 == null ? -1 : Class79.aClass120_Sub14_Sub22_691.anInt3634;
																			}
																		} else {
																			if (opcode != 4500) {
																				break;
																			}
																			intStackIndex -= 2;
																			final int i_220_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																			final int i_221_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																			final ParamType class120_sub14_sub11 = ParamType.list(i_221_);
																			if (class120_sub14_sub11.isString()) {
																				Class33.stringStack[stringStackIndex++] = StructType.list(i_220_).getStringParamValue(i_221_, class120_sub14_sub11.defaultString);
																			} else {
																				ProducingGraphicsBuffer.intStack[intStackIndex++] = StructType.list(i_220_).getIntegerParamValue(i_221_, class120_sub14_sub11.defaultInt);
																			}
																		}
																	} else {
																		if (opcode != 4400) {
																			break;
																		}
																		intStackIndex -= 2;
																		final int i_222_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																		final int i_223_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																		final ParamType class120_sub14_sub11 = ParamType.list(i_223_);
																		if (class120_sub14_sub11.isString()) {
																			Class33.stringStack[stringStackIndex++] = LocType.list(i_222_).getStringParamValue(i_223_, class120_sub14_sub11.defaultString);
																		} else {
																			ProducingGraphicsBuffer.intStack[intStackIndex++] = LocType.list(i_222_).getIntegerParamValue(i_223_, class120_sub14_sub11.defaultInt);
																		}
																	}
																} else if (opcode == 4200) {
																	final int i_224_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	Class33.stringStack[stringStackIndex++] = ObjType.list(i_224_).name;
																} else if (opcode == 4201) {
																	intStackIndex -= 2;
																	final int i_225_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																	final int i_226_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																	final ObjType objType = ObjType.list(i_226_);
																	if (i_225_ < 1 || i_225_ > 5 || objType.options[i_225_ - 1] == null) {
																		Class33.stringStack[stringStackIndex++] = "";
																	} else {
																		Class33.stringStack[stringStackIndex++] = objType.options[i_225_ - 1];
																	}
																} else if (opcode == 4202) {
																	intStackIndex -= 2;
																	final int i_227_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																	final int i_228_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																	final ObjType objType = ObjType.list(i_227_);
																	if (i_228_ < 1 || i_228_ > 5 || objType.inventoryOptions[-1 + i_228_] == null) {
																		Class33.stringStack[stringStackIndex++] = "";
																	} else {
																		Class33.stringStack[stringStackIndex++] = objType.inventoryOptions[i_228_ + -1];
																	}
																} else if (opcode == 4203) {
																	final int i_229_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjType.list(i_229_).cost;
																} else if (opcode == 4204) {
																	final int i_230_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjType.list(i_230_).stackable == 1 ? 1 : 0;
																} else if (opcode == 4205) {
																	final int i_231_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	final ObjType objType = ObjType.list(i_231_);
																	if (objType.certtemplate != -1 || objType.certlink < 0) {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = i_231_;
																	} else {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = objType.certlink;
																	}
																} else if (opcode == 4206) {
																	final int i_232_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	final ObjType objType = ObjType.list(i_232_);
																	if (objType.certtemplate >= 0 && objType.certlink >= 0) {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = objType.certlink;
																	} else {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = i_232_;
																	}
																} else if (opcode == 4207) {
																	final int i_233_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjType.list(i_233_).members ? 1 : 0;
																} else if (opcode == 4208) {
																	intStackIndex -= 2;
																	final int i_234_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
																	final int i_235_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																	final ParamType class120_sub14_sub11 = ParamType.list(i_234_);
																	if (class120_sub14_sub11.isString()) {
																		Class33.stringStack[stringStackIndex++] = ObjType.list(i_235_).getStringParam(class120_sub14_sub11.defaultString, i_234_);
																	} else {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjType.list(i_235_).getIntegerParamValue(class120_sub14_sub11.defaultInt, i_234_);
																	}
																} else if (opcode == 4210) {
																	final String string = Class33.stringStack[--stringStackIndex];
																	final int i_236_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																	Class120_Sub12_Sub25.method1333(string, i_236_ == 1);
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = Buffer.anInt2474;
																} else if (opcode == 4211) {
																	if (Class120_Sub12_Sub37.aShortArray3430 == null || Buffer.anInt2474 <= Class108.anInt1035) {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
																	} else {
																		ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(Class120_Sub12_Sub37.aShortArray3430[Class108.anInt1035++], 65535);
																	}
																} else {
																	if (opcode != 4212) {
																		break;
																	}
																	Class108.anInt1035 = 0;
																}
															} else if (opcode == 4100) {
																final String string = Class33.stringStack[--stringStackIndex];
																final int i_237_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																Class33.stringStack[stringStackIndex++] = new StringBuilder(string).append(i_237_).toString();
															} else if (opcode == 4101) {
																stringStackIndex -= 2;
																final String string = Class33.stringStack[stringStackIndex];
																final String string_238_ = Class33.stringStack[stringStackIndex - -1];
																Class33.stringStack[stringStackIndex++] = new StringBuilder(string).append(string_238_).toString();
															} else if (opcode == 4102) {
																final int i_239_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final String string = Class33.stringStack[--stringStackIndex];
																Class33.stringStack[stringStackIndex++] = new StringBuilder(string).append(Class134.method1949(false, i_239_, true)).toString();
															} else if (opcode == 4103) {
																final String string = Class33.stringStack[--stringStackIndex];
																Class33.stringStack[stringStackIndex++] = string.toLowerCase();
															} else if (opcode == 4104) {
																final int i_240_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																final long l = 1014768000000L + 86400000L * i_240_;
																Class192.aCalendar2121.setTime(new Date(l));
																final int i_241_ = Class192.aCalendar2121.get(5);
																final int i_242_ = Class192.aCalendar2121.get(2);
																final int i_243_ = Class192.aCalendar2121.get(1);
																Class33.stringStack[stringStackIndex++] = new StringBuilder(String.valueOf(i_241_)).append("-").append(Class120_Sub24.aStringArray2716[i_242_]).append("-").append(i_243_).toString();
															} else if (opcode == 4105) {
																stringStackIndex -= 2;
																final String string = Class33.stringStack[stringStackIndex - -1];
																final String string_244_ = Class33.stringStack[stringStackIndex];
																if (Class100.selfPlayer.appearance != null && Class100.selfPlayer.appearance.isFemale) {
																	Class33.stringStack[stringStackIndex++] = string;
																} else {
																	Class33.stringStack[stringStackIndex++] = string_244_;
																}
															} else if (opcode == 4106) {
																final int i_245_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																Class33.stringStack[stringStackIndex++] = Integer.toString(i_245_);
															} else if (opcode == 4107) {
																stringStackIndex -= 2;
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class124.method1874(-1, Class120_Sub12_Sub21_Sub1.method1313(5379, Class33.stringStack[1 + stringStackIndex], Class9.language, Class33.stringStack[stringStackIndex]));
															} else if (opcode == 4108) {
																intStackIndex -= 2;
																final int i_246_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																final int i_247_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																final String string = Class33.stringStack[--stringStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class148.method2061(94, i_246_).method1481(string, i_247_);
															} else if (opcode == 4109) {
																intStackIndex -= 2;
																final String string = Class33.stringStack[--stringStackIndex];
																final int i_248_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																final int i_249_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class148.method2061(-97, i_249_).method1468(string, i_248_);
															} else if (opcode == 4110) {
																stringStackIndex -= 2;
																final String string = Class33.stringStack[stringStackIndex];
																final String string_250_ = Class33.stringStack[1 + stringStackIndex];
																if (ProducingGraphicsBuffer.intStack[--intStackIndex] != 1) {
																	Class33.stringStack[stringStackIndex++] = string_250_;
																} else {
																	Class33.stringStack[stringStackIndex++] = string;
																}
															} else if (opcode == 4111) {
																final String string = Class33.stringStack[--stringStackIndex];
																Class33.stringStack[stringStackIndex++] = Class120_Sub14_Sub8.method1472(string);
															} else if (opcode == 4112) {
																final String string = Class33.stringStack[--stringStackIndex];
																final int i_251_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																if ((i_251_ ^ 0xffffffff) == 0) {
																	throw new RuntimeException("null char");
																}
																Class33.stringStack[stringStackIndex++] = new StringBuilder(string).append((char) i_251_).toString();
															} else if (opcode == 4113) {
																final int i_252_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub14_Sub10.method1504(80, (char) i_252_) ? 1 : 0;
															} else if (opcode == 4114) {
																final int i_253_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub5.method1217(true, (char) i_253_) ? 1 : 0;
															} else if (opcode == 4115) {
																final int i_254_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = ParamType.method1516((char) i_254_, true) ? 1 : 0;
															} else if (opcode == 4116) {
																final int i_255_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = FileSystem.method447(false, (char) i_255_) ? 1 : 0;
															} else if (opcode == 4117) {
																final String string = Class33.stringStack[--stringStackIndex];
																if (string == null) {
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
																} else {
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = string.length();
																}
															} else if (opcode == 4118) {
																intStackIndex -= 2;
																final String string = Class33.stringStack[--stringStackIndex];
																final int i_256_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																final int i_257_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
																Class33.stringStack[stringStackIndex++] = string.substring(i_256_, i_257_);
															} else if (opcode == 4119) {
																final String string = Class33.stringStack[--stringStackIndex];
																boolean bool_258_ = false;
																final StringBuffer stringbuffer = new StringBuffer(string.length());
																for (int i_259_ = 0; i_259_ < string.length(); i_259_++) {
																	final char c = string.charAt(i_259_);
																	if (c == '<') {
																		bool_258_ = true;
																	} else if (c == '>') {
																		bool_258_ = false;
																	} else if (!bool_258_) {
																		stringbuffer.append(c);
																	}
																}
																Class33.stringStack[stringStackIndex++] = stringbuffer.toString();
															} else if (opcode == 4120) {
																intStackIndex -= 2;
																final String string = Class33.stringStack[--stringStackIndex];
																final int i_260_ = ProducingGraphicsBuffer.intStack[intStackIndex];
																final int i_261_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = string.indexOf(i_260_, i_261_);
															} else if (opcode == 4121) {
																final int i_262_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																stringStackIndex -= 2;
																final String string = Class33.stringStack[stringStackIndex];
																final String string_263_ = Class33.stringStack[1 + stringStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = string.indexOf(string_263_, i_262_);
															} else if (opcode == 4122) {
																final int i_264_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Character.toLowerCase((char) i_264_);
															} else if (opcode == 4123) {
																final int i_265_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																ProducingGraphicsBuffer.intStack[intStackIndex++] = Character.toUpperCase((char) i_265_);
															} else {
																if (opcode != 4124) {
																	break;
																}
																final boolean bool_266_ = ProducingGraphicsBuffer.intStack[--intStackIndex] != 0;
																final int i_267_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
																Class33.stringStack[stringStackIndex++] = Class120_Sub12_Sub37.method1395(i_267_, bool_266_, -7, 0, Class9.language);
															}
														} else if (opcode == 4000) {
															intStackIndex -= 2;
															final int i_268_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															final int i_269_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_269_ - -i_268_;
														} else if (opcode == 4001) {
															intStackIndex -= 2;
															final int i_270_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_271_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_270_ - i_271_;
														} else if (opcode == 4002) {
															intStackIndex -= 2;
															final int i_272_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_273_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_272_ * i_273_;
														} else if (opcode == 4003) {
															intStackIndex -= 2;
															final int i_274_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															final int i_275_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_275_ / i_274_;
														} else if (opcode == 4004) {
															final int i_276_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (i_276_ * Math.random());
														} else if (opcode == 4005) {
															final int i_277_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) ((i_277_ - -1) * Math.random());
														} else if (opcode == 4006) {
															intStackIndex -= 5;
															final int i_278_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_279_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
															final int i_280_ = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
															final int i_281_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															final int i_282_ = ProducingGraphicsBuffer.intStack[4 + intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = (-i_279_ + i_282_) * (-i_278_ + i_281_) / (-i_279_ + i_280_) + i_278_;
														} else if (opcode == 4007) {
															intStackIndex -= 2;
															final long l = ProducingGraphicsBuffer.intStack[intStackIndex];
															final long l_283_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (l_283_ * l / 100L + l);
														} else if (opcode == 4008) {
															intStackIndex -= 2;
															final int i_284_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_285_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class191.method2512(1 << i_285_, i_284_);
														} else if (opcode == 4009) {
															intStackIndex -= 2;
															final int i_286_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_287_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(-(1 << i_287_) + -1, i_286_);
														} else if (opcode == 4010) {
															intStackIndex -= 2;
															final int i_288_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_289_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(i_288_, 1 << i_289_) != 0 ? 1 : 0;
														} else if (opcode == 4011) {
															intStackIndex -= 2;
															final int i_290_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_291_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_290_ % i_291_;
														} else if (opcode == 4012) {
															intStackIndex -= 2;
															final int i_292_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_293_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															if (i_292_ == 0) {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
															} else {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) Math.pow(i_292_, i_293_);
															}
														} else if (opcode == 4013) {
															intStackIndex -= 2;
															final int i_294_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_295_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															if (i_294_ != 0) {
																if (i_295_ == 0) {
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = 2147483647;
																} else {
																	ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) Math.pow(i_294_, 1.0 / i_295_);
																}
															} else {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
															}
														} else if (opcode == 4014) {
															intStackIndex -= 2;
															final int i_296_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_297_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(i_297_, i_296_);
														} else if (opcode == 4015) {
															intStackIndex -= 2;
															final int i_298_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
															final int i_299_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class191.method2512(i_298_, i_299_);
														} else if (opcode == 4016) {
															intStackIndex -= 2;
															final int i_300_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_301_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_301_ <= i_300_ ? i_301_ : i_300_;
														} else if (opcode == 4017) {
															intStackIndex -= 2;
															final int i_302_ = ProducingGraphicsBuffer.intStack[intStackIndex];
															final int i_303_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = i_302_ > i_303_ ? i_302_ : i_303_;
														} else {
															if (opcode != 4018) {
																break;
															}
															intStackIndex -= 3;
															final long l = ProducingGraphicsBuffer.intStack[intStackIndex];
															final long l_304_ = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
															final long l_305_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
															ProducingGraphicsBuffer.intStack[intStackIndex++] = (int) (l_304_ * l / l_305_);
														}
													} else if (opcode == 3600) {
														if (ObjectPile.friendsServerStatus != 0) {
															if (ObjectPile.friendsServerStatus == 1) {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
															} else {
																ProducingGraphicsBuffer.intStack[intStackIndex++] = ProducingGraphicsBuffer.friendCount;
															}
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = -2;
														}
													} else if (opcode == 3601) {
														final int i_306_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus == 2 && i_306_ < ProducingGraphicsBuffer.friendCount) {
															Class33.stringStack[stringStackIndex++] = Class120_Sub16.friendsName[i_306_];
														} else {
															Class33.stringStack[stringStackIndex++] = "";
														}
													} else if (opcode == 3602) {
														final int i_307_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus == 2 && i_307_ < ProducingGraphicsBuffer.friendCount) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub16.friendsWorld[i_307_];
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														}
													} else if (opcode == 3603) {
														final int i_308_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus != 2 || i_308_ >= ProducingGraphicsBuffer.friendCount) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub30.friendsRank[i_308_];
														}
													} else if (opcode == 3604) {
														final String string = Class33.stringStack[--stringStackIndex];
														final int i_309_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														Class90.method755(215, i_309_, string);
													} else if (opcode == 3605) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class48.method406(0, Varp.stringToLong(string));
													} else if (opcode == 3606) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class108_Sub1.method941(Varp.stringToLong(string));
													} else if (opcode == 3607) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class154.addIgnore(Varp.stringToLong(string), false);
													} else if (opcode == 3608) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class93.method770(Varp.stringToLong(string), (byte) -67);
													} else if (opcode == 3609) {
														String string = Class33.stringStack[--stringStackIndex];
														if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
															string = string.substring(7);
														}
														ProducingGraphicsBuffer.intStack[intStackIndex++] = SpotAnimType.method875(-38, string) ? 1 : 0;
													} else if (opcode == 3610) {
														final int i_310_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus == 2 && i_310_ < ProducingGraphicsBuffer.friendCount) {
															Class33.stringStack[stringStackIndex++] = Class79_Sub1.friendsSideText[i_310_];
														} else {
															Class33.stringStack[stringStackIndex++] = "";
														}
													} else if (opcode == 3611) {
														if (InterfaceChangeNode.clanName == null) {
															Class33.stringStack[stringStackIndex++] = "";
														} else {
															Class33.stringStack[stringStackIndex++] = Class120_Sub12_Sub23.method1326(InterfaceChangeNode.clanName, true);
														}
													} else if (opcode == 3612) {
														if (InterfaceChangeNode.clanName == null) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub14_Sub13.clanMembersAmount;
														}
													} else if (opcode == 3613) {
														final int i_311_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (InterfaceChangeNode.clanName != null && i_311_ < Class120_Sub14_Sub13.clanMembersAmount) {
															Class33.stringStack[stringStackIndex++] = Class120_Sub12_Sub23.method1326(Class120_Sub28.clanMembers[i_311_].name, true);
														} else {
															Class33.stringStack[stringStackIndex++] = "";
														}
													} else if (opcode == 3614) {
														final int i_312_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (InterfaceChangeNode.clanName != null && Class120_Sub14_Sub13.clanMembersAmount > i_312_) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub28.clanMembers[i_312_].world;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														}
													} else if (opcode == 3615) {
														final int i_313_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (InterfaceChangeNode.clanName == null || Class120_Sub14_Sub13.clanMembersAmount <= i_313_) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub28.clanMembers[i_313_].rank;
														}
													} else if (opcode == 3616) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Class112.kickRights;
													} else if (opcode == 3617) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class166.kickUser(string);
													} else if (opcode == 3618) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = MouseHandler.selfClanRank;
													} else if (opcode == 3619) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class120_Sub21.joinClanChat(Varp.stringToLong(string));
													} else if (opcode == 3620) {
														client.leaveClanChat();
													} else if (opcode == 3621) {
														if (ObjectPile.friendsServerStatus != 0) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub26.ignoreCount;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = -1;
														}
													} else if (opcode == 3622) {
														final int i_314_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus == 0 || Class120_Sub12_Sub26.ignoreCount <= i_314_) {
															Class33.stringStack[stringStackIndex++] = "";
														} else {
															Class33.stringStack[stringStackIndex++] = Class136.longToString(HintIcon.ignoreNamesAsLong[i_314_]);
														}
													} else if (opcode == 3623) {
														String string = Class33.stringStack[--stringStackIndex];
														if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
															string = string.substring(7);
														}
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Light.method351(false, string) ? 1 : 0;
													} else if (opcode == 3624) {
														final int i_315_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (Class120_Sub28.clanMembers == null || i_315_ >= Class120_Sub14_Sub13.clanMembersAmount || !Class120_Sub28.clanMembers[i_315_].name.equalsIgnoreCase(Class100.selfPlayer.name)) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
														}
													} else if (opcode == 3625) {
														if (Class150.clanOwner != null) {
															Class33.stringStack[stringStackIndex++] = Class120_Sub12_Sub23.method1326(Class150.clanOwner, true);
														} else {
															Class33.stringStack[stringStackIndex++] = "";
														}
													} else if (opcode == 3626) {
														final int i_316_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (InterfaceChangeNode.clanName == null || Class120_Sub14_Sub13.clanMembersAmount <= i_316_) {
															Class33.stringStack[stringStackIndex++] = "";
														} else {
															Class33.stringStack[stringStackIndex++] = Class120_Sub28.clanMembers[i_316_].sideText;
														}
													} else if (opcode == 3627) {
														final int i_317_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														if (ObjectPile.friendsServerStatus == 2 && i_317_ >= 0 && ProducingGraphicsBuffer.friendCount > i_317_) {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub9.aBooleanArray3194[i_317_] ? 1 : 0;
														} else {
															ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
														}
													} else if (opcode == 3628) {
														String string = Class33.stringStack[--stringStackIndex];
														if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
															string = string.substring(7);
														}
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub7.getFriendsIndex(string);
													} else if (opcode == 3629) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Node.countryId;
													} else if (opcode == 3630) {
														final String string = Class33.stringStack[--stringStackIndex];
														Class154.addIgnore(Varp.stringToLong(string), true);
													} else {
														if (opcode != 3631) {
															break;
														}
														final int i_318_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub14_Sub4.aBooleanArray3468[i_318_] ? 1 : 0;
													}
												} else if (opcode == 3300) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class101_Sub2.loopCycle;
												} else if (opcode == 3301) {
													intStackIndex -= 2;
													final int i_319_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
													final int i_320_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getId(i_320_, i_319_);
												} else if (opcode == 3302) {
													intStackIndex -= 2;
													final int i_321_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													final int i_322_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getIndexCount(i_321_, i_322_);
												} else if (opcode == 3303) {
													intStackIndex -= 2;
													final int i_323_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													final int i_324_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getCount(i_323_, i_324_);
												} else if (opcode == 3304) {
													final int i_325_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = InvType.list(i_325_).size;
												} else if (opcode == 3305) {
													final int i_326_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = SceneGraphNode.skillsLevel[i_326_];
												} else if (opcode == 3306) {
													final int i_327_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Decimator.skillsBaseLevel[i_327_];
												} else if (opcode == 3307) {
													final int i_328_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub38.skillsXp[i_328_];
												} else if (opcode == 3308) {
													final int i_329_ = Class173.gameLevel;
													final int i_330_ = GameEntity.currentBaseX + (Class100.selfPlayer.x >> 7);
													final int i_331_ = Class181.currentBaseZ + (Class100.selfPlayer.z >> 7);
													ProducingGraphicsBuffer.intStack[intStackIndex++] = (i_330_ << 14) + (i_329_ << 28) + i_331_;
												} else if (opcode == 3309) {
													final int i_332_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(16383, i_332_ >> 14);
												} else if (opcode == 3310) {
													final int i_333_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = i_333_ >> 28;
												} else if (opcode == 3311) {
													final int i_334_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub3.method1207(16383, i_334_);
												} else if (opcode == 3312) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub37.membersClient ? 1 : 0;
												} else if (opcode == 3313) {
													intStackIndex -= 2;
													final int i_336_ = ProducingGraphicsBuffer.intStack[intStackIndex] + 32768;
													final int i_335_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getId(i_336_, i_335_);
												} else if (opcode == 3314) {
													intStackIndex -= 2;
													final int i_338_ = ProducingGraphicsBuffer.intStack[intStackIndex] + 32768;
													final int i_337_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getIndexCount(i_338_, i_337_);
												} else if (opcode == 3315) {
													intStackIndex -= 2;
													final int i_339_ = ProducingGraphicsBuffer.intStack[intStackIndex] + 32768;
													final int i_340_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = ObjectContainer.getCount(i_339_, i_340_);
												} else if (opcode == 3316) {
													if (Class86.staffLevel >= 2) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Class86.staffLevel;
													} else {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
													}
												} else if (opcode == 3317) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub22.systemUpdateCycle;
												} else if (opcode == 3318) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class157.worldId;
												} else if (opcode == 3321) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class69_Sub2.energy;
												} else if (opcode == 3322) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = LookupTable.weight;
												} else if (opcode == 3323) {
													if (Class120_Sub12_Sub9.anInt3199 < 5 || Class120_Sub12_Sub9.anInt3199 > 9) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
													} else {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
													}
												} else if (opcode == 3324) {
													if (Class120_Sub12_Sub9.anInt3199 >= 5 && Class120_Sub12_Sub9.anInt3199 <= 9) {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub9.anInt3199;
													} else {
														ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
													}
												} else if (opcode == 3325) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub21_Sub1.aBoolean3908 ? 1 : 0;
												} else if (opcode == 3326) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class100.selfPlayer.combatLevel;
												} else if (opcode == 3327) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class100.selfPlayer.appearance.isFemale ? 1 : 0;
												} else if (opcode == 3328) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = VarBit.aBoolean167 && !OverlayType.aBoolean1228 ? 1 : 0;
												} else if (opcode == 3329) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = !Class120_Sub14_Sub4.aBoolean3464 ? 0 : 1;
												} else if (opcode == 3330) {
													final int i_341_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub29.method1726(i_341_, (byte) -38);
												} else if (opcode == 3331) {
													intStackIndex -= 2;
													final int i_342_ = ProducingGraphicsBuffer.intStack[intStackIndex - -1];
													final int i_343_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class127.method1888(i_342_, (byte) -65, i_343_, false);
												} else if (opcode == 3332) {
													intStackIndex -= 2;
													final int i_344_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
													final int i_345_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class127.method1888(i_344_, (byte) -95, i_345_, true);
												} else if (opcode == 3333) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = AbstractMouseWheelHandler.anInt116;
												} else if (opcode == 3335) {
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class9.language;
												} else if (opcode == 3336) {
													intStackIndex -= 4;
													int i_346_ = ProducingGraphicsBuffer.intStack[intStackIndex];
													final int i_347_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
													final int i_348_ = ProducingGraphicsBuffer.intStack[2 + intStackIndex];
													i_346_ += i_347_ << 14;
													i_346_ += i_348_ << 28;
													final int i_349_ = ProducingGraphicsBuffer.intStack[3 + intStackIndex];
													i_346_ += i_349_;
													ProducingGraphicsBuffer.intStack[intStackIndex++] = i_346_;
												} else {
													if (opcode != 3337) {
														break;
													}
													ProducingGraphicsBuffer.intStack[intStackIndex++] = Class120_Sub12_Sub33.affiliateId;
												}
											} else if (opcode == 3200) {
												intStackIndex -= 3;
												Class48.method404(ProducingGraphicsBuffer.intStack[intStackIndex - -2], ProducingGraphicsBuffer.intStack[intStackIndex], ProducingGraphicsBuffer.intStack[intStackIndex - -1], 255);
											} else if (opcode == 3201) {
												ObjectPile.method2447((byte) 89, 255, ProducingGraphicsBuffer.intStack[--intStackIndex]);
											} else {
												if (opcode != 3202) {
													break;
												}
												intStackIndex -= 2;
												Class101.method832(-1, 255, ProducingGraphicsBuffer.intStack[1 + intStackIndex], ProducingGraphicsBuffer.intStack[intStackIndex]);
											}
										} else if (opcode == 3100) {
											final String string = Class33.stringStack[--stringStackIndex];
											AbstractRequest.method1540("", 0, string);
										} else if (opcode == 3101) {
											intStackIndex -= 2;
											Class192.method2517(Class100.selfPlayer, ProducingGraphicsBuffer.intStack[intStackIndex], ProducingGraphicsBuffer.intStack[1 + intStackIndex]);
										} else if (opcode == 3103) {
											Class90.removeOverridedInterfaces();
										} else if (opcode == 3104) {
											final String string = Class33.stringStack[--stringStackIndex];
											int i_350_ = 0;
											if (Class120_Sub21.method1697(string, (byte) -36)) {
												i_350_ = Class31.method265(string);
											}
											Class120_Sub12_Sub11.outputStream.putByteIsaac(219);
											Class120_Sub12_Sub11.outputStream.putInt(i_350_);
										} else if (opcode == 3105) {
											final String string = Class33.stringStack[--stringStackIndex];
											Class120_Sub12_Sub11.outputStream.putByteIsaac(149);
											Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(string));
										} else if (opcode == 3106) {
											final String string = Class33.stringStack[--stringStackIndex];
											Class120_Sub12_Sub11.outputStream.putByteIsaac(164);
											Class120_Sub12_Sub11.outputStream.putByte(string.length() - -1);
											Class120_Sub12_Sub11.outputStream.putJagexString(string);
										} else if (opcode == 3107) {
											final int i_351_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
											final String string = Class33.stringStack[--stringStackIndex];
											Class3.method81(i_351_, (byte) 61, string);
										} else if (opcode == 3108) {
											intStackIndex -= 3;
											final int i_352_ = ProducingGraphicsBuffer.intStack[intStackIndex];
											final int i_354_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
											final int i_353_ = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
											final JagexInterface jagexInterface = Class74.getJagexInterface(i_353_);
											Class120_Sub12_Sub8.method1241(jagexInterface, i_352_, i_354_);
										} else if (opcode == 3109) {
											intStackIndex -= 2;
											final int i_356_ = ProducingGraphicsBuffer.intStack[intStackIndex];
											final int i_355_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
											final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : ParamType.aClass189_3540;
											Class120_Sub12_Sub8.method1241(jagexInterface, i_356_, i_355_);
										} else {
											if (opcode != 3110) {
												break;
											}
											final int i_357_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
											Class120_Sub12_Sub11.outputStream.putByteIsaac(231);
											Class120_Sub12_Sub11.outputStream.putShort(i_357_);
										}
									} else if (opcode == 2700) {
										final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2030;
									} else if (opcode == 2701) {
										final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
										if ((jagexInterface.anInt2030 ^ 0xffffffff) == 0) {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
										} else {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2075;
										}
									} else if (opcode == 2702) {
										final int i_358_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
										final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_358_);
										if (class120_sub26 == null) {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
										} else {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
										}
									} else if (opcode == 2703) {
										final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
										if (jagexInterface.components == null) {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
										} else {
											int i_359_ = jagexInterface.components.length;
											for (int i_360_ = 0; jagexInterface.components.length > i_360_; i_360_++) {
												if (jagexInterface.components[i_360_] == null) {
													i_359_ = i_360_;
													break;
												}
											}
											ProducingGraphicsBuffer.intStack[intStackIndex++] = i_359_;
										}
									} else {
										if (opcode != 2704 && opcode != 2705) {
											break;
										}
										intStackIndex -= 2;
										final int i_361_ = ProducingGraphicsBuffer.intStack[intStackIndex];
										final int i_362_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
										final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_361_);
										if (class120_sub26 == null || class120_sub26.interfaceId != i_362_) {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
										} else {
											ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
										}
									}
								} else {
									final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
									if (opcode == 2600) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.verticalScrollPosition;
									} else if (opcode == 2601) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.horizontalScrollPosition;
									} else if (opcode == 2602) {
										Class33.stringStack[stringStackIndex++] = jagexInterface.disabledText;
									} else if (opcode == 2603) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.maxScrollHorizontal;
									} else if (opcode == 2604) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.maxScrollVertical;
									} else if (opcode == 2605) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.zoom;
									} else if (opcode == 2606) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateX;
									} else if (opcode == 2607) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateZ;
									} else if (opcode == 2608) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.rotateY;
									} else if (opcode == 2609) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.alpha;
									} else if (opcode == 2610) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt2076;
									} else if (opcode == 2611) {
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.anInt1977;
									} else {
										if (opcode != 2612) {
											break;
										}
										ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.disabledSpriteId;
									}
								}
							} else {
								final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
								if (opcode == 2500) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.x;
								} else if (opcode == 2501) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.y;
								} else if (opcode == 2502) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.width;
								} else if (opcode == 2503) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.height;
								} else if (opcode == 2504) {
									ProducingGraphicsBuffer.intStack[intStackIndex++] = !jagexInterface.hidden ? 0 : 1;
								} else {
									if (opcode != 2505) {
										break;
									}
									ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.parent;
								}
							}
						} else {
							final JagexInterface jagexInterface = bool ? ParamType.aClass189_3540 : Class93.aClass189_869;
							if (opcode == 1500) {
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.x;
							} else if (opcode == 1501) {
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.y;
							} else if (opcode == 1502) {
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.width;
							} else if (opcode == 1503) {
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.height;
							} else if (opcode == 1504) {
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.hidden ? 1 : 0;
							} else {
								if (opcode != 1505) {
									break;
								}
								ProducingGraphicsBuffer.intStack[intStackIndex++] = jagexInterface.parent;
							}
						}
					} else if (opcode == 403) {
						intStackIndex -= 2;
						final int i_363_ = ProducingGraphicsBuffer.intStack[intStackIndex];
						final int i_364_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
						for (int i_365_ = 0; i_365_ < ObjType.anIntArray1520.length; i_365_++) {
							if (i_363_ == ObjType.anIntArray1520[i_365_]) {
								Class100.selfPlayer.appearance.method2036((byte) -111, i_365_, i_364_);
								continue while_218_;
							}
						}
						for (int i_366_ = 0; Class120_Sub12_Sub27.anIntArray3349.length > i_366_; i_366_++) {
							if (Class120_Sub12_Sub27.anIntArray3349[i_366_] == i_363_) {
								Class100.selfPlayer.appearance.method2036((byte) -40, i_366_, i_364_);
								break;
							}
						}
					} else if (opcode == 404) {
						intStackIndex -= 2;
						final int i_367_ = ProducingGraphicsBuffer.intStack[intStackIndex];
						final int i_368_ = ProducingGraphicsBuffer.intStack[1 + intStackIndex];
						Class100.selfPlayer.appearance.method2045(i_367_, (byte) -103, i_368_);
					} else {
						if (opcode != 410) {
							break;
						}
						final boolean bool_369_ = ProducingGraphicsBuffer.intStack[--intStackIndex] != 0;
						Class100.selfPlayer.appearance.method2037(bool_369_);
					}
				} else if (opcode == 100) {
					intStackIndex -= 3;
					final int bitPacked = ProducingGraphicsBuffer.intStack[intStackIndex];
					final int type = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
					final int i_370_ = ProducingGraphicsBuffer.intStack[intStackIndex + 2];
					if (type == 0) {
						throw new RuntimeException();
					}
					final JagexInterface jagexInterface = Class74.getJagexInterface(bitPacked);
					if (jagexInterface.components == null) {
						jagexInterface.components = new JagexInterface[1 + i_370_];
					}
					if (i_370_ >= jagexInterface.components.length) {
						final JagexInterface[] class189s = new JagexInterface[i_370_ + 1];
						for (int i_373_ = 0; i_373_ < jagexInterface.components.length; i_373_++) {
							class189s[i_373_] = jagexInterface.components[i_373_];
						}
						jagexInterface.components = class189s;
					}
					if (i_370_ > 0 && jagexInterface.components[i_370_ - 1] == null) {
						throw new RuntimeException("Gap at:" + (i_370_ - 1));
					}
					final JagexInterface class189_374_ = new JagexInterface();
					class189_374_.parent = class189_374_.bitPacked = jagexInterface.bitPacked;
					class189_374_.newFormat = true;
					class189_374_.componentIndex = i_370_;
					class189_374_.type = type;
					jagexInterface.components[i_370_] = class189_374_;
					if (bool) {
						ParamType.aClass189_3540 = class189_374_;
					} else {
						Class93.aClass189_869 = class189_374_;
					}
					InterfaceClickMask.redrawInterface(jagexInterface);
				} else if (opcode == 101) {
					final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : ParamType.aClass189_3540;
					if (jagexInterface.componentIndex == -1) {
						if (!bool) {
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					final JagexInterface class189_375_ = Class74.getJagexInterface(jagexInterface.bitPacked);
					class189_375_.components[jagexInterface.componentIndex] = null;
					InterfaceClickMask.redrawInterface(class189_375_);
				} else if (opcode == 102) {
					final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.intStack[--intStackIndex]);
					jagexInterface.components = null;
					InterfaceClickMask.redrawInterface(jagexInterface);
				} else if (opcode == 200) {
					intStackIndex -= 2;
					final int i_376_ = ProducingGraphicsBuffer.intStack[intStackIndex];
					final int i_377_ = ProducingGraphicsBuffer.intStack[intStackIndex + 1];
					final JagexInterface jagexInterface = JagexInterface.getComponent(i_376_, i_377_);
					if (jagexInterface == null || i_377_ == -1) {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
					} else {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
						if (bool) {
							ParamType.aClass189_3540 = jagexInterface;
						} else {
							Class93.aClass189_869 = jagexInterface;
						}
					}
				} else {
					if (opcode != 201) {
						break;
					}
					final int i_378_ = ProducingGraphicsBuffer.intStack[--intStackIndex];
					final JagexInterface jagexInterface = Class74.getJagexInterface(i_378_);
					if (jagexInterface == null) {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = 0;
					} else {
						ProducingGraphicsBuffer.intStack[intStackIndex++] = 1;
						if (bool) {
							ParamType.aClass189_3540 = jagexInterface;
						} else {
							Class93.aClass189_869 = jagexInterface;
						}
					}
				}
			}
			throw new IllegalStateException();
		} catch (final Exception exception) {
			if (clientScript.name != null) {
				final StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("%0a - in: ").append(clientScript.name);
				for (int i_379_ = Buffer.subScriptAmount + -1; i_379_ >= 0; i_379_--) {
					stringbuffer.append("%0a - via: ").append(Class179.subScripts[i_379_].origClientScript.name);
				}
				if (opcode == 40) {
					final int i_380_ = intValues[opcodeIndex];
					stringbuffer.append("%0a - non-existant gosub script-num: ").append(Integer.toString(i_380_));
				}
				if (AbstractIndexedSprite.modeWhere != 0) {
					AbstractRequest.method1540("", 0, new StringBuilder("Clientscript error in: ").append(clientScript.name).toString());
				}
				Class180_Sub3.method2312(exception, new StringBuilder("CS2 - scr:").append(clientScript.uid).append(" op:").append(opcode).append(stringbuffer.toString()).toString());
			} else {
				if (AbstractIndexedSprite.modeWhere != 0) {
					AbstractRequest.method1540("", 0, "Clientscript error - check log for details");
				}
				Class180_Sub3.method2312(exception, new StringBuilder("CS2 - scr:").append(clientScript.uid).append(" op:").append(opcode).toString());
			}
		}
	}

	final WorldInfo getWorldInfo() {
		return Class148.worldsInfo[this.location];
	}

	static final World getNextWorld() {
		if (Class86.worlds.length > Class108_Sub3.worldPos) {
			return Class86.worlds[Class108_Sub3.worldPos++];
		}
		return null;
	}

	static final World getFirstWorld() {
		Class108_Sub3.worldPos = 0;
		return World.getNextWorld();
	}

	static final float[] method2196(final int i, final int i_381_) {
		float[] fs;
		try {
			final float f = Class117.method1012() + Class117.method1015();
			final int i_382_ = Class117.method1017();
			final float f_383_ = (i_382_ >> 16 & 0xff) / 255.0F;
			if (i != -13316) {
				return null;
			}
			final float f_384_ = (0xff & i_382_) / 255.0F;
			NodeSub.aFloatArray2583[3] = 1.0F;
			final float f_385_ = (0xff & i_382_ >> 8) / 255.0F;
			NodeSub.aFloatArray2583[0] = f * (f_383_ * ((Class120_Sub12_Sub3.method1207(16740947, i_381_) >> 16) / 255.0F) * 0.58823526F);
			NodeSub.aFloatArray2583[2] = f_384_ * (Class120_Sub12_Sub3.method1207(255, i_381_) / 255.0F) * 0.58823526F * f;
			NodeSub.aFloatArray2583[1] = f_385_ * ((Class120_Sub12_Sub3.method1207(i_381_, 65526) >> 8) / 255.0F) * 0.58823526F * f;
			fs = NodeSub.aFloatArray2583;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gb.M(").append(i).append(',').append(i_381_).append(')').toString());
		}
		return fs;
	}
}
