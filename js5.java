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
	private MasterIndexInfo masterIndexInfo = null;

	final boolean method410(String string, String string_0_) {
		if (!informationLoaded()) {
			return false;
		}
		string = string.toLowerCase();
		string_0_ = string_0_.toLowerCase();
		final int i_1_ = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
		if (!method436(i_1_)) {
			return false;
		}
		final int i_2_ = masterIndexInfo.groupFileLookupTable[i_1_].lookupIdentifier(Class120_Sub14_Sub13.toHash(string_0_));
		return requestDownload(i_1_, i_2_);
	}

	private final void method411(final int i_3_) {
		aClass53_450.method459(i_3_);
	}

	final int getCompletion(String string) {
		if (!informationLoaded()) {
			return 0;
		}
		string = string.toLowerCase();
		final int groupId = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
		return getCompletion(groupId);
	}

	final byte[] getFileSmart(final int groupId) {
		if (!informationLoaded()) {
			return null;
		}
		if (masterIndexInfo.anIntArray465.length == 1) {
			return getFile(0, groupId);
		}
		if (!method436(groupId)) {
			return null;
		}
		if (masterIndexInfo.anIntArray465[groupId] == 1) {
			return getFile(groupId, 0);
		}
		throw new RuntimeException();
	}

	final boolean method414(String string) {
		if (!informationLoaded()) {
			return false;
		}
		string = string.toLowerCase();
		final int i_6_ = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
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
			if (masterIndexInfo.groupFileCount[i_10_] > 0) {
				i_9_ += getCompletion(i_10_);
				i_8_ += 100;
			}
		}
		if (i_8_ == 0) {
			return 100;
		}
		return i_9_ * 100 / i_8_;
	}

	private final int getCompletion(final int groupId) {
		if (!method436(groupId)) {
			return 0;
		}
		if (anObjectArray451[groupId] != null) {
			return 100;
		}
		return aClass53_450.getCompletion(groupId);
	}

	static final Buffer preferencesToBuffer() {
		final Buffer buffer = new Buffer(34);
		buffer.putByte(11);
		buffer.putByte(FileSystemRequest.brightness);
		buffer.putByte(client.allVisibleLevels ? 1 : 0);
		buffer.putByte(Class120_Sub12.removeRoofsSelectively ? 1 : 0);
		buffer.putByte(Hashtable.showGroundDecorations ? 1 : 0);
		buffer.putByte(ParticleNodeSub.highDetailTextures ? 1 : 0);
		buffer.putByte(Class120_Sub12_Sub10.manyIdleAnimations ? 1 : 0);
		buffer.putByte(ChunkAtmosphere.flickeringEffectsOn ? 1 : 0);
		buffer.putByte(Class120_Sub30_Sub1.manyGroundTextures ? 1 : 0);
		buffer.putByte(Class120_Sub6.characterShadowsOn ? 1 : 0);
		buffer.putByte(Class74.sceneryShadowsType);
		buffer.putByte(Class120_Sub12_Sub6.highLightingDetail ? 1 : 0);
		buffer.putByte(PacketBuffer.highWaterDetail ? 1 : 0);
		buffer.putByte(Decimator.fogEnabled ? 1 : 0);
		buffer.putByte(AbstractMouseWheelHandler.antiAliasingDefault);
		buffer.putByte(Class167.isStereo ? 1 : 0);
		buffer.putByte(Class111.soundEffectVolume);
		buffer.putByte(RuntimeException_Sub1.musicVolume);
		buffer.putByte(CursorType.ambientSoundsVolume);
		buffer.putShort(Class120_Sub12_Sub18.lastFullscreenWidth);
		buffer.putShort(Class120_Sub12_Sub12.lastFullscreenHeight);
		buffer.putByte(ParticleEngine.getParticleSetting());
		buffer.putInt(Class120_Sub19.lastWorldId);
		buffer.putByte(Class120_Sub12_Sub19.lastUsedDisplayMode);
		buffer.putByte(InterfaceClickMask.safeModeEnabled ? 1 : 0);
		buffer.putByte(Class134.updateCameraFromCs2 ? 1 : 0);
		buffer.putByte(Class140.buildArea);
		buffer.putByte(WallDecoration.hdrEnabled ? 1 : 0);
		buffer.putByte(Class38.cursorsEnabled ? 1 : 0);
		return buffer;
	}

	private final boolean informationLoaded() {
		if (masterIndexInfo == null) {
			masterIndexInfo = aClass53_450.method462();
			if (masterIndexInfo == null) {
				return false;
			}
			anObjectArray451 = new Object[masterIndexInfo.anInt484];
			anObjectArrayArray448 = new Object[masterIndexInfo.anInt484][];
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

	final byte[] getFile2(final int group, final int file) {
		if (!method423(file, group)) {
			return null;
		}
		if (anObjectArrayArray448[group] == null || anObjectArrayArray448[group][file] == null) {
			boolean bool_17_ = method424(null, group);
			if (!bool_17_) {
				requestDownload(group);
				bool_17_ = method424(null, group);
				if (!bool_17_) {
					return null;
				}
			}
		}
		final byte[] is_18_ = Identikit.method1988(anObjectArrayArray448[group][file], false);
		return is_18_;
	}

	final int method421() {
		if (!informationLoaded()) {
			return -1;
		}
		return masterIndexInfo.anIntArray465.length;
	}

	private final void requestDownload(final int group) {
		if (!clearOnUnpack) {
			anObjectArray451[group] = Class143_Sub1.method2026(aClass53_450.method460(group), false, 136);
		} else {
			anObjectArray451[group] = aClass53_450.method460(group);
		}
	}

	private final boolean method423(final int i, final int i_22_) {
		if (!informationLoaded()) {
			return false;
		}
		if (i_22_ < 0 || i < 0 || masterIndexInfo.anIntArray465.length <= i_22_ || i >= masterIndexInfo.anIntArray465[i_22_]) {
			if (Class90.aBoolean845) {
				throw new IllegalArgumentException(String.valueOf(i_22_) + "," + i);
			}
			return false;
		}
		return true;
	}

	private final boolean method424(final int[] is, final int i_23_) {
		if (!method436(i_23_)) {
			return false;
		}
		if (anObjectArray451[i_23_] == null) {
			return false;
		}
		final int[] is_24_ = masterIndexInfo.groupFileIds[i_23_];
		final int i_25_ = masterIndexInfo.groupFileCount[i_23_];
		boolean bool_26_ = true;
		if (anObjectArrayArray448[i_23_] == null) {
			anObjectArrayArray448[i_23_] = new Object[masterIndexInfo.anIntArray465[i_23_]];
		}
		final Object[] objects = anObjectArrayArray448[i_23_];
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
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
			is_29_ = Identikit.method1988(anObjectArray451[i_23_], true);
			final Buffer class120_sub7 = new Buffer(is_29_);
			class120_sub7.decryptXTEA(is, 5, class120_sub7.buf.length);
		} else {
			is_29_ = Identikit.method1988(anObjectArray451[i_23_], false);
		}
		byte[] is_30_;
		try {
			is_30_ = Class71.unpack(is_29_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("T3 - ").append(is != null ? Arrays.toString(is) : "null").append(",").append(i_23_).append(",").append(is_29_.length).append(",").append(AbstractObject.getCrc(is_29_, is_29_.length)).append(",").append(AbstractObject.getCrc(is_29_, is_29_.length - 2)).append(",").append(masterIndexInfo.groupCrcs[i_23_]).append(",").append(masterIndexInfo.indexCrc).toString());
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
		return true;
	}

	private final boolean allFilesComplete(final int i) {
		if (!method436(i)) {
			return false;
		}
		if (anObjectArray451[i] != null) {
			return true;
		}
		requestDownload(i);
		if (anObjectArray451[i] != null) {
			return true;
		}
		return false;
	}

	final void method426(final boolean clearGroupsHash, final boolean clearFilesHash) {
		if (informationLoaded()) {
			if (clearFilesHash) {
				masterIndexInfo.groupFileLookupTable = null;
				masterIndexInfo.groupFileHashes = null;
			}
			if (clearGroupsHash) {
				masterIndexInfo.groupHashes = null;
				masterIndexInfo.groupLookupTable = null;
			}
		}
	}

	final void method427(String string) {
		if (informationLoaded()) {
			string = string.toLowerCase();
			final int i_48_ = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
			method411(i_48_);
		}
	}

	final byte[] method428(String string, String string_49_) {
		if (!informationLoaded()) {
			return null;
		}
		string_49_ = string_49_.toLowerCase();
		string = string.toLowerCase();
		final int i_50_ = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string_49_));
		if (!method436(i_50_)) {
			return null;
		}
		final int i_51_ = masterIndexInfo.groupFileLookupTable[i_50_].lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
		return getFile(i_50_, i_51_);
	}

	final boolean groupExist(final int i) {
		if (!informationLoaded()) {
			return false;
		}
		if (masterIndexInfo.anIntArray465.length == 1) {
			return requestDownload(0, i);
		}
		if (!method436(i)) {
			return false;
		}
		if (masterIndexInfo.anIntArray465[i] == 1) {
			return requestDownload(i, 0);
		}
		throw new RuntimeException();
	}

	final boolean method430() {
		if (!informationLoaded()) {
			return false;
		}
		boolean bool_54_ = true;
		for (final int i_55_ : masterIndexInfo.groupIds) {
			if (anObjectArray451[i_55_] == null) {
				requestDownload(i_55_);
				if (anObjectArray451[i_55_] == null) {
					bool_54_ = false;
				}
			}
		}
		return bool_54_;
	}

	final byte[] getFileXTEA(final int i, final int i_56_, final int[] is) {
		if (!method423(i, i_56_)) {
			return null;
		}
		if (anObjectArrayArray448[i_56_] == null || anObjectArrayArray448[i_56_][i] == null) {
			boolean bool = method424(is, i_56_);
			if (!bool) {
				requestDownload(i_56_);
				bool = method424(is, i_56_);
				if (!bool) {
					return null;
				}
			}
		}
		final byte[] is_59_ = Identikit.method1988(anObjectArrayArray448[i_56_][i], false);
		if (clearOnUse) {
			anObjectArrayArray448[i_56_][i] = null;
			if (masterIndexInfo.anIntArray465[i_56_] == 1) {
				anObjectArrayArray448[i_56_] = null;
			}
		}
		return is_59_;
	}

	final int getGroupId(String string) {
		if (!informationLoaded()) {
			return -1;
		}
		string = string.toLowerCase();
		final int id = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
		if (!method436(id)) {
			return -1;
		}
		return id;
	}

	final int[] getFileIds(final int group) {
		if (!method436(group)) {
			return null;
		}
		int[] fileIds = masterIndexInfo.groupFileIds[group];
		if (fileIds == null) {
			fileIds = new int[masterIndexInfo.groupFileCount[group]];
			for (int fileId = 0; fileId < fileIds.length; fileId++) {
				fileIds[fileId] = fileId;
			}
		}
		return fileIds;
	}

	static final boolean loadInterface(final int group) {
		if (JagexInterface.interfaceLoaded[group]) {
			return true;
		}
		if (!JagexInterface.interfaceJs5.allFilesComplete(group)) {
			return false;
		}
		final int fileAmount = JagexInterface.interfaceJs5.getFileAmount(group);
		if (fileAmount == 0) {
			JagexInterface.interfaceLoaded[group] = true;
			return true;
		}
		if (JagexInterface.interfaceCache[group] == null) {
			JagexInterface.interfaceCache[group] = new JagexInterface[fileAmount];
		}
		for (int file = 0; file < fileAmount; file++) {
			if (JagexInterface.interfaceCache[group][file] == null) {
				final byte[] data = JagexInterface.interfaceJs5.getFile(group, file);
				if (data != null) {
					final JagexInterface jagexInterface = JagexInterface.interfaceCache[group][file] = new JagexInterface();
					jagexInterface.bitPacked = (group << 16) + file;
					if (data[0] == -1) {
						jagexInterface.decodeIf3(new Buffer(data));
					} else {
						jagexInterface.decodeIf1(new Buffer(data));
					}
				}
			}
		}
		JagexInterface.interfaceLoaded[group] = true;
		return true;
	}

	final boolean allFilesComplete(String string) {
		if (!informationLoaded()) {
			return false;
		}
		string = string.toLowerCase();
		final int groupId = masterIndexInfo.groupLookupTable.lookupIdentifier(Class120_Sub14_Sub13.toHash(string));
		return allFilesComplete(groupId);
	}

	private final boolean method436(final int i) {
		if (!informationLoaded()) {
			return false;
		}
		if (i < 0 || masterIndexInfo.anIntArray465.length <= i || masterIndexInfo.anIntArray465[i] == 0) {
			if (!Class90.aBoolean845) {
				return false;
			}
			throw new IllegalArgumentException(Integer.toString(i));
		}
		return true;
	}

	final int method437(final int i) {
		if (!informationLoaded()) {
			return -1;
		}
		final int i_70_ = masterIndexInfo.groupLookupTable.lookupIdentifier(i);
		if (!method436(i_70_)) {
			return -1;
		}
		return i_70_;
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
		return masterIndexInfo.indexCrc;
	}

	final boolean requestDownload(final int group, final int file) {
		if (!method423(file, group)) {
			return false;
		}
		if (anObjectArrayArray448[group] != null && anObjectArrayArray448[group][file] != null) {
			return true;
		}
		if (anObjectArray451[group] != null) {
			return true;
		}
		requestDownload(group);
		if (anObjectArray451[group] != null) {
			return true;
		}
		return false;
	}

	final int getFileAmount(final int i) {
		if (!method436(i)) {
			return 0;
		}
		return masterIndexInfo.anIntArray465[i];
	}

	final byte[] getFile(final int i, final int i_77_) {
		return getFileXTEA(i_77_, i, null);
	}

	js5(final Class53 class53, final boolean bool, final boolean bool_78_) {
		clearOnUse = bool_78_;
		aClass53_450 = class53;
		clearOnUnpack = bool;
	}
}
