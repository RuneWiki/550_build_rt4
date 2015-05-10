/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MasterIndexInfo {
	int[] anIntArray465;
	static boolean aBoolean466;
	static boolean[] needInterfaceRedrawWrapper = new boolean[100];
	int[][] groupFileIds;
	static js5 aClass50_469;
	int[] groupCrcs;
	int version;
	int groupLength;
	LookupTable groupLookupTable;
	int[][] groupFileHashes;
	int[] groupFileCount;
	static js5 aClass50_476;
	static int headiconsprayerId;
	static int gregorianDateSeed;
	LookupTable[] groupFileLookupTable;
	int[] groupHashes;
	int indexCrc;
	int[] groupIds;
	int[] groupVersions;
	int anInt484;

	static {
		aBoolean466 = false;
	}

	static final AbstractTimer constructTimer() {
		JagmiscTimer jagmiscTimer;
		try {
			jagmiscTimer = new JagmiscTimer();
		} catch (final Throwable throwable) {
			AbstractTimer abstractTimer;
			try {
				abstractTimer = (AbstractTimer) Class.forName("NanoTimer").newInstance();
			} catch (final Throwable throwable_0_) {
				return new MillisTimer();
			}
			return abstractTimer;
		}
		return jagmiscTimer;
	}

	static final void resetVarBit(final int i) {
		VarBit.recentUse.clear();
		VarBit.recentUse = new ObjectCache(i);
	}

	private final void decode(final byte[] data) {
		final Buffer buffer = new Buffer(Class71.unpack(data));
		final int protocol = buffer.getUByte();
		if (protocol != 5 && protocol != 6) {
			throw new RuntimeException();
		}
		if (protocol >= 6) {
			this.version = buffer.getInt();
		} else {
			this.version = 0;
		}
		int offset = 0;
		final int groupNamed = buffer.getUByte();
		this.groupLength = buffer.getUShort();
		int lastGroupId = -1;
		this.groupIds = new int[this.groupLength];
		for (int id = 0; id < this.groupLength; id++) {
			this.groupIds[id] = offset += buffer.getUShort();
			if (lastGroupId < this.groupIds[id]) {
				lastGroupId = this.groupIds[id];
			}
		}
		this.anInt484 = 1 + lastGroupId;
		this.groupFileCount = new int[this.anInt484];
		this.groupCrcs = new int[this.anInt484];
		this.groupFileIds = new int[this.anInt484][];
		this.anIntArray465 = new int[this.anInt484];
		this.groupVersions = new int[this.anInt484];
		if (groupNamed != 0) {
			this.groupHashes = new int[this.anInt484];
			for (int id = 0; id < this.anInt484; id++) {
				this.groupHashes[id] = -1;
			}
			for (int id = 0; id < this.groupLength; id++) {
				this.groupHashes[this.groupIds[id]] = buffer.getInt();
			}
			this.groupLookupTable = new LookupTable(this.groupHashes);
		}
		for (int id = 0; id < this.groupLength; id++) {
			this.groupCrcs[this.groupIds[id]] = buffer.getInt();
		}
		for (int id = 0; id < this.groupLength; id++) {
			this.groupVersions[this.groupIds[id]] = buffer.getInt();
		}
		for (int id = 0; id < this.groupLength; id++) {
			this.groupFileCount[this.groupIds[id]] = buffer.getUShort();
		}
		for (int id = 0; id < this.groupLength; id++) {
			offset = 0;
			int lastFileId = -1;
			final int groupId = this.groupIds[id];
			final int fileCount = this.groupFileCount[groupId];
			this.groupFileIds[groupId] = new int[fileCount];
			for (int fileIndex = 0; fileIndex < fileCount; fileIndex++) {
				final int fileId = this.groupFileIds[groupId][fileIndex] = offset += buffer.getUShort();
				if (lastFileId < fileId) {
					lastFileId = fileId;
				}
			}
			this.anIntArray465[groupId] = lastFileId + 1;
			if (fileCount == lastFileId + 1) {
				this.groupFileIds[groupId] = null;
			}
		}
		if (groupNamed != 0) {
			this.groupFileHashes = new int[lastGroupId + 1][];
			this.groupFileLookupTable = new LookupTable[lastGroupId + 1];
			for (int id = 0; id < this.groupLength; id++) {
				final int groupId = this.groupIds[id];
				final int fileCount = this.groupFileCount[groupId];
				this.groupFileHashes[groupId] = new int[this.anIntArray465[groupId]];
				for (int fileIndex = 0; fileIndex < this.anIntArray465[groupId]; fileIndex++) {
					this.groupFileHashes[groupId][fileIndex] = -1;
				}
				for (int fileIndex = 0; fileIndex < fileCount; fileIndex++) {
					int fileId;
					if (this.groupFileIds[groupId] != null) {
						fileId = this.groupFileIds[groupId][fileIndex];
					} else {
						fileId = fileIndex;
					}
					this.groupFileHashes[groupId][fileId] = buffer.getInt();
				}
				this.groupFileLookupTable[groupId] = new LookupTable(this.groupFileHashes[groupId]);
			}
		}
	}

	MasterIndexInfo(final byte[] data, final int crc) {
		this.indexCrc = AbstractObject.getCrc(data, data.length);
		if (this.indexCrc != crc) {
			throw new RuntimeException();
		}
		decode(data);
	}
}
