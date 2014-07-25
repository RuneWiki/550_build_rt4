import java.util.Arrays;

/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class js5 {
	private boolean clearOnUnpack;
	private boolean clearOnUse;
	private Object[][] anObjectArrayArray448;
	static int lastClickX = 0;
	private Class53 aClass53_450;
	private Object[] anObjectArray451;
	private MasterIndexInfo aClass52_452 = null;

	final boolean method410(String string, final byte i, String string_0_) {
		boolean bool;
		try {
			if (!informationLoaded()) {
				return false;
			}
			string = string.toLowerCase();
			string_0_ = string_0_.toLowerCase();
			final int i_1_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
			if (!method436(i_1_)) {
				return false;
			}
			if (i != -99) {
				method426(true, false, (byte) 79);
			}
			final int i_2_ = aClass52_452.groupFileLookupTable[i_1_].lookupIdentifier(Class120_Sub14_Sub13.method1524(string_0_, 0));
			bool = fileExists(i_1_, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.T(").append(string != null ? "{...}" : "null").append(',').append(i).append(',').append(string_0_ != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	private final void method411(final int i, final int i_3_) {
		try {
			if (i == 0) {
				aClass53_450.method459(i_3_, -6);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.G(").append(i).append(',').append(i_3_).append(')').toString());
		}
	}

	final int method412(String string, final byte i) {
		int i_4_;
		try {
			if (i != -11) {
				aClass52_452 = null;
			}
			if (!informationLoaded()) {
				return 0;
			}
			string = string.toLowerCase();
			final int i_5_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, i + 11));
			i_4_ = method416(i_5_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.EA(").append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_4_;
	}

	final byte[] getFileSmart(final int groupId) {
		if (!informationLoaded()) {
			return null;
		}
		if (aClass52_452.anIntArray465.length == 1) {
			return getFile(0, groupId);
		}
		if (!method436(groupId)) {
			return null;
		}
		if (aClass52_452.anIntArray465[groupId] == 1) {
			return getFile(groupId, 0);
		}
		throw new RuntimeException();
	}

	final boolean method414(String string) {
		if (!informationLoaded()) {
			return false;
		}
		string = string.toLowerCase();
		final int i_6_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
		if (i_6_ < 0) {
			return false;
		}
		return true;
	}

	final int method415() {
		if (!informationLoaded()) {
			return 0;
		}
		int i_8_ = 0;
		int i_9_ = 0;
		for (int i_10_ = 0; anObjectArray451.length > i_10_; i_10_++) {
			if (aClass52_452.groupFileCount[i_10_] > 0) {
				i_9_ += method416(i_10_);
				i_8_ += 100;
			}
		}
		if (i_8_ == 0) {
			return 100;
		}
		return i_9_ * 100 / i_8_;
	}

	private final int method416(final int i) {
		if (!method436(i)) {
			return 0;
		}
		if (anObjectArray451[i] != null) {
			return 100;
		}
		return aClass53_450.method458(i);
	}

	static final Buffer method417() {
		final Buffer class120_sub7_14_ = new Buffer(34);
		class120_sub7_14_.putByte(11);
		class120_sub7_14_.putByte(FileSystemRequest.brightness);
		class120_sub7_14_.putByte(Class61.aBoolean566 ? 1 : 0);
		class120_sub7_14_.putByte(Class120_Sub12.aBoolean2564 ? 1 : 0);
		class120_sub7_14_.putByte(Hashtable.showGroundDecorations ? 1 : 0);
		class120_sub7_14_.putByte(ParticleNodeSub.highDetailTextures ? 1 : 0);
		class120_sub7_14_.putByte(Class120_Sub12_Sub10.manyIdleAnimations ? 1 : 0);
		class120_sub7_14_.putByte(Class191.flickeringEffectsOn ? 1 : 0);
		class120_sub7_14_.putByte(Class120_Sub30_Sub1.manyGroundTextures ? 1 : 0);
		class120_sub7_14_.putByte(Class120_Sub6.characterShadowsOn ? 1 : 0);
		class120_sub7_14_.putByte(Class74.sceneryShadowsType);
		class120_sub7_14_.putByte(Class120_Sub12_Sub6.highLightingDetail ? 1 : 0);
		class120_sub7_14_.putByte(PacketBuffer.highWaterDetail ? 1 : 0);
		class120_sub7_14_.putByte(Decimator.fogEnabled ? 1 : 0);
		class120_sub7_14_.putByte(AbstractMouseWheelHandler.antiAliasingSamplesWrapper);
		class120_sub7_14_.putByte(Class167.aBoolean1619 ? 1 : 0);
		class120_sub7_14_.putByte(Class111.anInt1061);
		class120_sub7_14_.putByte(RuntimeException_Sub1.anInt2142);
		class120_sub7_14_.putByte(CursorType.anInt1242);
		class120_sub7_14_.putShort(Class120_Sub12_Sub18.lastFullscreenWidth);
		class120_sub7_14_.putShort(Class120_Sub12_Sub12.lastFullscreenHeight);
		class120_sub7_14_.putByte(ParticleEngine.method949());
		class120_sub7_14_.putInt(Class120_Sub19.anInt2657);
		class120_sub7_14_.putByte(Class120_Sub12_Sub19.currentDisplayMode);
		class120_sub7_14_.putByte(InterfaceClickMask.safeModeEnabled ? 1 : 0);
		class120_sub7_14_.putByte(Class134.aBoolean1277 ? 1 : 0);
		class120_sub7_14_.putByte(Class140.anInt1343);
		class120_sub7_14_.putByte(Class186.hdrEnabled ? 1 : 0);
		class120_sub7_14_.putByte(Class38.cursorsEnabled ? 1 : 0);
		return class120_sub7_14_;
	}

	private final boolean informationLoaded() {
		if (aClass52_452 == null) {
			aClass52_452 = aClass53_450.method462();
			if (aClass52_452 == null) {
				return false;
			}
			anObjectArray451 = new Object[aClass52_452.anInt484];
			anObjectArrayArray448 = new Object[aClass52_452.anInt484][];
		}
		return true;
	}

	final void method419() {
		if (anObjectArrayArray448 != null) {
			for (int i_15_ = 0; i_15_ < anObjectArrayArray448.length; i_15_++) {
				anObjectArrayArray448[i_15_] = null;
			}
		}
	}

	final byte[] method420(final boolean bool, final int i, final int i_16_) {
		byte[] is;
		try {
			if (!method423(i, i_16_)) {
				return null;
			}
			if (anObjectArrayArray448[i_16_] == null || anObjectArrayArray448[i_16_][i] == null) {
				boolean bool_17_ = method424(0, null, i_16_);
				if (!bool_17_) {
					method422(i_16_);
					bool_17_ = method424(0, null, i_16_);
					if (!bool_17_) {
						return null;
					}
				}
			}
			final byte[] is_18_ = IdentityKit.method1988(anObjectArrayArray448[i_16_][i], bool);
			is = is_18_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.I(").append(bool).append(',').append(i).append(',').append(i_16_).append(')').toString());
		}
		return is;
	}

	final int method421() {
		if (!informationLoaded()) {
			return -1;
		}
		return aClass52_452.anIntArray465.length;
	}

	private final void method422(final int i_20_) {
		if (!clearOnUnpack) {
			anObjectArray451[i_20_] = Class143_Sub1.method2026(aClass53_450.method460(i_20_), false, 136);
		} else {
			anObjectArray451[i_20_] = aClass53_450.method460(i_20_);
		}
	}

	private final boolean method423(final int i, final int i_22_) {
		if (!informationLoaded()) {
			return false;
		}
		if (i_22_ < 0 || i < 0 || aClass52_452.anIntArray465.length <= i_22_ || i >= aClass52_452.anIntArray465[i_22_]) {
			if (Class90.aBoolean845) {
				throw new IllegalArgumentException(new StringBuilder(String.valueOf(i_22_)).append(",").append(i).toString());
			}
			return false;
		}
		return true;
	}

	private final boolean method424(final int i, final int[] is, final int i_23_) {
		boolean bool;
		try {
			if (!method436(i_23_)) {
				return false;
			}
			if (anObjectArray451[i_23_] == null) {
				return false;
			}
			final int[] is_24_ = aClass52_452.groupFileIds[i_23_];
			final int i_25_ = aClass52_452.groupFileCount[i_23_];
			boolean bool_26_ = true;
			if (anObjectArrayArray448[i_23_] == null) {
				anObjectArrayArray448[i_23_] = new Object[aClass52_452.anIntArray465[i_23_]];
			}
			final Object[] objects = anObjectArrayArray448[i_23_];
			for (int i_27_ = i; i_27_ < i_25_; i_27_++) {
				int i_28_;
				if (is_24_ == null) {
					i_28_ = i_27_;
				} else {
					i_28_ = is_24_[i_27_];
				}
				if (objects[i_28_] == null) {
					bool_26_ = false;
					break;
				}
			}
			if (bool_26_) {
				return true;
			}
			byte[] is_29_;
			if (is != null && (is[0] != 0 || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
				is_29_ = IdentityKit.method1988(anObjectArray451[i_23_], true);
				final Buffer class120_sub7 = new Buffer(is_29_);
				class120_sub7.decryptXTEA(is, 5, class120_sub7.buf.length);
			} else {
				is_29_ = IdentityKit.method1988(anObjectArray451[i_23_], false);
			}
			byte[] is_30_;
			try {
				is_30_ = Class71.unpack(is_29_);
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception,
						new StringBuilder("T3 - ").append(is != null ? Arrays.toString(is) : "null").append(",").append(i_23_).append(",").append(is_29_.length).append(",").append(AbstractObject.getCrc(is_29_, is_29_.length)).append(",").append(AbstractObject.getCrc(is_29_, is_29_.length - 2))
								.append(",").append(aClass52_452.groupCrcs[i_23_]).append(",").append(aClass52_452.indexCrc).toString());
			}
			if (clearOnUnpack) {
				anObjectArray451[i_23_] = null;
			}
			if (i_25_ > 1) {
				int i_31_ = is_30_.length;
				final int[] is_32_ = new int[i_25_];
				final int i_33_ = is_30_[--i_31_] & 0xff;
				final Buffer class120_sub7 = new Buffer(is_30_);
				i_31_ -= i_25_ * i_33_ * 4;
				class120_sub7.pos = i_31_;
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					int i_35_ = 0;
					for (int i_36_ = 0; i_36_ < i_25_; i_36_++) {
						i_35_ += class120_sub7.getInt();
						is_32_[i_36_] += i_35_;
					}
				}
				final byte[][] is_37_ = new byte[i_25_][];
				for (int i_38_ = 0; i_25_ > i_38_; i_38_++) {
					is_37_[i_38_] = new byte[is_32_[i_38_]];
					is_32_[i_38_] = 0;
				}
				class120_sub7.pos = i_31_;
				int i_39_ = 0;
				for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
					int i_41_ = 0;
					for (int i_42_ = 0; i_25_ > i_42_; i_42_++) {
						i_41_ += class120_sub7.getInt();
						ArrayUtils.arrayCopy(is_30_, i_39_, is_37_[i_42_], is_32_[i_42_], i_41_);
						i_39_ += i_41_;
						is_32_[i_42_] += i_41_;
					}
				}
				for (int i_43_ = 0; i_25_ > i_43_; i_43_++) {
					int i_44_;
					if (is_24_ == null) {
						i_44_ = i_43_;
					} else {
						i_44_ = is_24_[i_43_];
					}
					if (clearOnUse) {
						objects[i_44_] = is_37_[i_43_];
					} else {
						objects[i_44_] = Class143_Sub1.method2026(is_37_[i_43_], false, 136);
					}
				}
			} else {
				int i_45_;
				if (is_24_ == null) {
					i_45_ = 0;
				} else {
					i_45_ = is_24_[0];
				}
				if (clearOnUse) {
					objects[i_45_] = is_30_;
				} else {
					objects[i_45_] = Class143_Sub1.method2026(is_30_, false, 136);
				}
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.U(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_23_).append(')').toString());
		}
		return bool;
	}

	private final boolean allFilesComplete(final int i) {
		if (!method436(i)) {
			return false;
		}
		if (anObjectArray451[i] != null) {
			return true;
		}
		method422(i);
		if (anObjectArray451[i] != null) {
			return true;
		}
		return false;
	}

	final void method426(final boolean bool, final boolean bool_47_, final byte i) {
		try {
			if (i != -20) {
				aClass52_452 = null;
			}
			if (informationLoaded()) {
				if (bool_47_) {
					aClass52_452.groupFileLookupTable = null;
					aClass52_452.groupFileHashes = null;
				}
				if (bool) {
					aClass52_452.groupHashes = null;
					aClass52_452.groupLookupTable = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.S(").append(bool).append(',').append(bool_47_).append(',').append(i).append(')').toString());
		}
	}

	final void method427(final int i, String string) {
		try {
			if (i <= 6) {
				method431(86, 36, null);
			}
			if (informationLoaded()) {
				string = string.toLowerCase();
				final int i_48_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
				method411(0, i_48_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.C(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}

	final byte[] method428(final int i, String string, String string_49_) {
		byte[] is;
		try {
			if (!informationLoaded()) {
				return null;
			}
			string_49_ = string_49_.toLowerCase();
			if (i < 62) {
				return null;
			}
			string = string.toLowerCase();
			final int i_50_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string_49_, 0));
			if (!method436(i_50_)) {
				return null;
			}
			final int i_51_ = aClass52_452.groupFileLookupTable[i_50_].lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
			is = getFile(i_50_, i_51_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.H(").append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(string_49_ != null ? "{...}" : "null").append(')').toString());
		}
		return is;
	}

	final boolean method429(final int i) {
		if (!informationLoaded()) {
			return false;
		}
		if (aClass52_452.anIntArray465.length == 1) {
			return fileExists(0, i);
		}
		if (!method436(i)) {
			return false;
		}
		if (aClass52_452.anIntArray465[i] == 1) {
			return fileExists(i, 0);
		}
		throw new RuntimeException();
	}

	final boolean method430() {
		if (!informationLoaded()) {
			return false;
		}
		boolean bool_54_ = true;
		for (final int i_55_ : aClass52_452.groupIds) {
			if (anObjectArray451[i_55_] == null) {
				method422(i_55_);
				if (anObjectArray451[i_55_] == null) {
					bool_54_ = false;
				}
			}
		}
		return bool_54_;
	}

	final byte[] method431(final int i, final int i_56_, final int[] is) {
		if (!method423(i, i_56_)) {
			return null;
		}
		if (anObjectArrayArray448[i_56_] == null || anObjectArrayArray448[i_56_][i] == null) {
			boolean bool = method424(0, is, i_56_);
			if (!bool) {
				method422(i_56_);
				bool = method424(0, is, i_56_);
				if (!bool) {
					return null;
				}
			}
		}
		final byte[] is_59_ = IdentityKit.method1988(anObjectArrayArray448[i_56_][i], false);
		if (clearOnUse) {
			anObjectArrayArray448[i_56_][i] = null;
			if (aClass52_452.anIntArray465[i_56_] == 1) {
				anObjectArrayArray448[i_56_] = null;
			}
		}
		return is_59_;
	}

	final int method432(String string) {
		if (!informationLoaded()) {
			return -1;
		}
		string = string.toLowerCase();
		final int i_60_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
		if (!method436(i_60_)) {
			return -1;
		}
		return i_60_;
	}

	final int[] method433(final boolean bool, final int i) {
		int[] is;
		try {
			if (!bool) {
				method432(null);
			}
			if (!method436(i)) {
				return null;
			}
			int[] is_61_ = aClass52_452.groupFileIds[i];
			if (is_61_ == null) {
				is_61_ = new int[aClass52_452.groupFileCount[i]];
				for (int i_62_ = 0; i_62_ < is_61_.length; i_62_++) {
					is_61_[i_62_] = i_62_;
				}
			}
			is = is_61_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.AA(").append(bool).append(',').append(i).append(')').toString());
		}
		return is;
	}

	static final boolean loadInterface(final int group) {
		if (Class57.interfaceLoaded[group]) {
			return true;
		}
		if (!Class101_Sub4.interfaceJs5.allFilesComplete(group)) {
			return false;
		}
		final int fileAmount = Class101_Sub4.interfaceJs5.getFileAmount(group);
		if (fileAmount == 0) {
			Class57.interfaceLoaded[group] = true;
			return true;
		}
		if (Node.interfaceCache[group] == null) {
			Node.interfaceCache[group] = new JagexInterface[fileAmount];
		}
		for (int file = 0; file < fileAmount; file++) {
			if (Node.interfaceCache[group][file] == null) {
				final byte[] data = Class101_Sub4.interfaceJs5.getFile(group, file);
				if (data != null) {
					final JagexInterface jagexInterface = Node.interfaceCache[group][file] = new JagexInterface();
					jagexInterface.bitPacked = (group << 16) + file;
					if (data[0] == -1) {
						jagexInterface.decodeNew(new Buffer(data));
					} else {
						jagexInterface.decodeOld(new Buffer(data));
					}
				}
			}
		}
		Class57.interfaceLoaded[group] = true;
		return true;
	}

	final boolean method435(String string, final int i) {
		boolean bool;
		try {
			if (!informationLoaded()) {
				return false;
			}
			string = string.toLowerCase();
			if (i != 2) {
				method415();
			}
			final int i_66_ = aClass52_452.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.method1524(string, 0));
			bool = allFilesComplete(i_66_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.CA(").append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return bool;
	}

	private final boolean method436(final int i) {
		if (!informationLoaded()) {
			return false;
		}
		if (i < 0 || aClass52_452.anIntArray465.length <= i || aClass52_452.anIntArray465[i] == 0) {
			if (!Class90.aBoolean845) {
				return false;
			}
			throw new IllegalArgumentException(Integer.toString(i));
		}
		return true;
	}

	final int method437(final int i, final byte i_68_) {
		int i_69_;
		try {
			if (!informationLoaded()) {
				return -1;
			}
			final int i_70_ = aClass52_452.groupLookupTable.lookupIdentifier(i);
			if (!method436(i_70_)) {
				return -1;
			}
			if (i_68_ != -115) {
				return -24;
			}
			i_69_ = i_70_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fh.L(").append(i).append(',').append(i_68_).append(')').toString());
		}
		return i_69_;
	}

	final void clearFiles(final int group) {
		if (method436(group)) {
			if (anObjectArrayArray448 != null) {
				anObjectArrayArray448[group] = null;
			}
		}
	}

	final int getIndexCrc() {
		if (!informationLoaded()) {
			throw new IllegalStateException("");
		}
		return aClass52_452.indexCrc;
	}

	final boolean fileExists(final int group, final int file) {
		if (!method423(file, group)) {
			return false;
		}
		if (anObjectArrayArray448[group] != null && anObjectArrayArray448[group][file] != null) {
			return true;
		}
		if (anObjectArray451[group] != null) {
			return true;
		}
		method422(group);
		if (anObjectArray451[group] != null) {
			return true;
		}
		return false;
	}

	final int getFileAmount(final int i) {
		if (!method436(i)) {
			return 0;
		}
		return aClass52_452.anIntArray465[i];
	}

	final byte[] getFile(final int i, final int i_77_) {
		return method431(i_77_, i, null);
	}

	js5(final Class53 class53, final boolean bool, final boolean bool_78_) {
		clearOnUse = bool_78_;
		aClass53_450 = class53;
		clearOnUnpack = bool;
	}
}
