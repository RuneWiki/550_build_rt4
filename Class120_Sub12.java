/* Class120_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub12 extends Node {
	static float aFloat2557;
	boolean aBoolean2558;
	Class109 aClass109_2559;
	static int anInt2560;
	Class120_Sub12[] aClass120_Sub12Array2561;
	static long[] menuOptionsData1 = new long[500];
	Class30 aClass30_2563;
	static boolean aBoolean2564 = true;
	static int[] anIntArray2565 = new int[4096];
	static String aString2566 = "yellow:";
	static int[] anIntArray2567 = new int[14];
	static byte[][] spriteAlphas;
	static float aFloat2569;
	int anInt2570;

	final int[][] method1179(final int i, final int i_0_) {
		if (!this.aClass120_Sub12Array2561[i].aBoolean2558) {
			return this.aClass120_Sub12Array2561[i].method1188(i_0_);
		}
		final int[][] is_2_ = new int[3][];
		final int[] is_3_ = this.aClass120_Sub12Array2561[i].method1187(i_0_);
		is_2_[0] = is_3_;
		is_2_[2] = is_3_;
		is_2_[1] = is_3_;
		return is_2_;
	}

	void decode(final Buffer buffer, final int code) {
	}

	int method1181() {
		return -1;
	}

	static final void readReflectionCheckPacket(final Signlink signlink, final Buffer buffer) {
		final ReflectionCheckNode reflectionCheckNode = new ReflectionCheckNode();
		reflectionCheckNode.count = buffer.getUByte();
		reflectionCheckNode.uid = buffer.getInt();
		reflectionCheckNode.checkTypes = new int[reflectionCheckNode.count];
		reflectionCheckNode.methodsArgumentData = new byte[reflectionCheckNode.count][][];
		reflectionCheckNode.fieldsInformationNode = new SignlinkNode[reflectionCheckNode.count];
		reflectionCheckNode.methodsInformationNode = new SignlinkNode[reflectionCheckNode.count];
		reflectionCheckNode.errorTypes = new int[reflectionCheckNode.count];
		reflectionCheckNode.fieldsValue = new int[reflectionCheckNode.count];
		for (int id = 0; id < reflectionCheckNode.count; id++) {
			try {
				final int type = buffer.getUByte();
				if (type == 0 || type == 1 || type == 2) {
					final String className = buffer.getJagexString();
					int fieldValue = 0;
					final String fieldName = buffer.getJagexString();
					if (type == 1) {
						fieldValue = buffer.getInt();
					}
					reflectionCheckNode.checkTypes[id] = type;
					reflectionCheckNode.fieldsValue[id] = fieldValue;
					reflectionCheckNode.fieldsInformationNode[id] = signlink.getFieldInformation(FrameLoader.getClassType(className), fieldName);
				} else if (type == 3 || type == 4) {
					final String className = buffer.getJagexString();
					final String methodName = buffer.getJagexString();
					final int argumentCount = buffer.getUByte();
					final String[] argumentTypes = new String[argumentCount];
					for (int argId = 0; argId < argumentCount; argId++) {
						argumentTypes[argId] = buffer.getJagexString();
					}
					final byte[][] argumentData = new byte[argumentCount][];
					if (type == 3) {
						for (int argId = 0; argId < argumentCount; argId++) {
							final int argumentDataLen = buffer.getInt();
							argumentData[argId] = new byte[argumentDataLen];
							buffer.getBuffer(argumentData[argId], 0, argumentDataLen);
						}
					}
					final Class[] argumentClassTypes = new Class[argumentCount];
					reflectionCheckNode.checkTypes[id] = type;
					for (int argId = 0; argId < argumentCount; argId++) {
						argumentClassTypes[argId] = FrameLoader.getClassType(argumentTypes[argId]);
					}
					reflectionCheckNode.methodsInformationNode[id] = signlink.getMethodInformation(FrameLoader.getClassType(className), methodName, argumentClassTypes);
					reflectionCheckNode.methodsArgumentData[id] = argumentData;
				}
			} catch (final ClassNotFoundException classnotfoundexception) {
				reflectionCheckNode.errorTypes[id] = -1;
			} catch (final SecurityException securityexception) {
				reflectionCheckNode.errorTypes[id] = -2;
			} catch (final NullPointerException nullpointerexception) {
				reflectionCheckNode.errorTypes[id] = -3;
			} catch (final Exception exception) {
				reflectionCheckNode.errorTypes[id] = -4;
			} catch (final Throwable throwable) {
				reflectionCheckNode.errorTypes[id] = -5;
			}
		}
		OverridedJInterface.reflectionCheckDeque.addLast(reflectionCheckNode);
	}

	static final void method1183(final LocType locType, final int i, final int i_17_, final int i_19_) {
		for (AmbientSound class120_sub8 = (AmbientSound) Class101_Sub1.locationAmbientSounds.getFront(); class120_sub8 != null; class120_sub8 = (AmbientSound) Class101_Sub1.locationAmbientSounds.getNext()) {
			if (class120_sub8.anInt2498 == i_17_ && class120_sub8.anInt2494 == i_19_ * 128 && class120_sub8.anInt2483 == i * 128 && locType.myId == class120_sub8.location.myId) {
				if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
					class120_sub8.aClass120_Sub30_Sub4_2488 = null;
				}
				if (class120_sub8.aClass120_Sub30_Sub4_2478 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2478);
					class120_sub8.aClass120_Sub30_Sub4_2478 = null;
				}
				class120_sub8.unlink();
				break;
			}
		}
	}

	int method1184() {
		return -1;
	}

	static final void method1185() {
		for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
			if (class120_sub24.anInt2720 > 0) {
				class120_sub24.anInt2720--;
			}
			if (class120_sub24.anInt2720 == 0) {
				if (class120_sub24.anInt2723 < 0 || Class167.method2190(class120_sub24.anInt2723, class120_sub24.anInt2728, -110)) {
					Class31.method264(class120_sub24.anInt2722, class120_sub24.anInt2729, class120_sub24.anInt2725, class120_sub24.anInt2721, class120_sub24.anInt2723, class120_sub24.anInt2731, class120_sub24.anInt2728);
					class120_sub24.unlink();
				}
			} else {
				if (class120_sub24.anInt2732 > 0) {
					class120_sub24.anInt2732--;
				}
				if (class120_sub24.anInt2732 == 0 && class120_sub24.anInt2731 >= 1 && class120_sub24.anInt2725 >= 1 && class120_sub24.anInt2731 <= 102 && class120_sub24.anInt2725 <= 102 && (class120_sub24.anInt2719 < 0 || Class167.method2190(class120_sub24.anInt2719, class120_sub24.anInt2727, -102))) {
					Class31.method264(class120_sub24.anInt2722, class120_sub24.anInt2717, class120_sub24.anInt2725, class120_sub24.anInt2721, class120_sub24.anInt2719, class120_sub24.anInt2731, class120_sub24.anInt2727);
					class120_sub24.anInt2732 = -1;
					if (class120_sub24.anInt2719 == class120_sub24.anInt2723 && class120_sub24.anInt2723 == -1) {
						class120_sub24.unlink();
					} else if (class120_sub24.anInt2719 == class120_sub24.anInt2723 && class120_sub24.anInt2717 == class120_sub24.anInt2729 && class120_sub24.anInt2727 == class120_sub24.anInt2728) {
						class120_sub24.unlink();
					}
				}
			}
		}
	}

	static final void method1186(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		if (Class32.anInt260 > i_28_ || i_28_ > ParamType.anInt3544 || Class32.anInt260 > i || ParamType.anInt3544 < i || Class32.anInt260 > i_23_ || ParamType.anInt3544 < i_23_ || Class32.anInt260 > i_24_ || i_24_ > ParamType.anInt3544 || i_25_ < Class120_Sub30_Sub2.anInt3699 || i_25_ > IdentityKit.anInt1334 || i_21_ < Class120_Sub30_Sub2.anInt3699 || IdentityKit.anInt1334 < i_21_ || i_27_ < Class120_Sub30_Sub2.anInt3699 || IdentityKit.anInt1334 < i_27_ || Class120_Sub30_Sub2.anInt3699 > i_26_ || IdentityKit.anInt1334 < i_26_) {
			WorldInfo.method2067(i_28_, i_27_, i_24_, i, i_21_, i_25_, i_26_, -17731, i_22_, i_23_);
		} else {
			LongNode.method1059(i_26_, i_27_, i_25_, i_22_, i, i_23_, i_24_, i_21_, i_28_, true);
		}
	}

	int[] method1187(final int i_30_) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	int[][] method1188(final int i) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	void method1189() {
		if (this.aBoolean2558) {
			this.aClass30_2563.method261();
			this.aClass30_2563 = null;
		} else {
			this.aClass109_2559.method972();
			this.aClass109_2559 = null;
		}
	}

	final void method1190(final int i, final int i_33_) {
		final int i_34_ = this.anInt2570 == 255 ? i : this.anInt2570;
		if (this.aBoolean2558) {
			this.aClass30_2563 = new Class30(i_34_, i, i_33_);
		} else {
			this.aClass109_2559 = new Class109(i_34_, i, i_33_);
		}
	}

	static final void method1191(final int i, final int i_35_, final int i_36_, final int i_37_, final int i_38_, final int i_39_, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final int i_48_, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_) {
		if (i_37_ == 0) {
			final PlainTile plainTile = new PlainTile(i_44_, i_45_, i_46_, i_47_, -1, i_52_, false);
			for (int i_54_ = i; i_54_ >= 0; i_54_--) {
				if (LabelGroup.groundTiles[i_54_][i_35_][i_36_] == null) {
					LabelGroup.groundTiles[i_54_][i_35_][i_36_] = new GroundTile(i_54_, i_35_, i_36_);
				}
			}
			LabelGroup.groundTiles[i][i_35_][i_36_].plainTile = plainTile;
		} else if (i_37_ == 1) {
			final PlainTile plainTile = new PlainTile(i_48_, i_49_, i_50_, i_51_, i_39_, i_53_, i_40_ == i_41_ && i_40_ == i_42_ && i_40_ == i_43_);
			for (int i_55_ = i; i_55_ >= 0; i_55_--) {
				if (LabelGroup.groundTiles[i_55_][i_35_][i_36_] == null) {
					LabelGroup.groundTiles[i_55_][i_35_][i_36_] = new GroundTile(i_55_, i_35_, i_36_);
				}
			}
			LabelGroup.groundTiles[i][i_35_][i_36_].plainTile = plainTile;
		} else {
			final ShapedTile shapedTile = new ShapedTile(i_37_, i_38_, i_39_, i_35_, i_36_, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, i_46_, i_47_, i_48_, i_49_, i_50_, i_51_, i_52_, i_53_);
			for (int i_56_ = i; i_56_ >= 0; i_56_--) {
				if (LabelGroup.groundTiles[i_56_][i_35_][i_36_] == null) {
					LabelGroup.groundTiles[i_56_][i_35_][i_36_] = new GroundTile(i_56_, i_35_, i_36_);
				}
			}
			LabelGroup.groundTiles[i][i_35_][i_36_].shapedTile = shapedTile;
		}
	}

	final int[] method1192(final int i_57_, final int i_58_) {
		if (this.aClass120_Sub12Array2561[i_58_].aBoolean2558) {
			return this.aClass120_Sub12Array2561[i_58_].method1187(i_57_);
		}
		return this.aClass120_Sub12Array2561[i_58_].method1188(i_57_)[0];
	}

	void postDecode() {
		/* empty */
	}

	Class120_Sub12(final int i, final boolean bool) {
		this.aBoolean2558 = bool;
		this.aClass120_Sub12Array2561 = new Class120_Sub12[i];
	}

	static final void method1194(final int i, final int i_59_, final int i_60_, final int i_62_, final int i_63_) {
		final int i_64_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_60_, IdentityKit.anInt1334);
		final int i_65_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_63_, IdentityKit.anInt1334);
		final int i_66_ = Class3.method83(Class32.anInt260, i, ParamType.anInt3544);
		final int i_67_ = Class3.method83(Class32.anInt260, i_59_, ParamType.anInt3544);
		for (int i_68_ = i_64_; i_65_ >= i_68_; i_68_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_68_], i_62_, i_66_, i_67_);
		}
	}
}
