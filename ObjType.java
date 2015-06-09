/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjType {
	int cursor2op = -1;
	private int scaleY;
	private int manwearyoff;
	private int manWear2;
	private int contrast;
	private int womanwearyoff;
	private byte[] recolorPalette;
	private int manhead2;
	private int modelId;
	int dummyobject = 0;
	static int[] maleBodyPartIds = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int zoom2d;
	Hashtable params;
	private int ambient;
	int cursor2;
	boolean stockmarket;
	int zan2d;
	private int womanwearzoff;
	int xof2d;
	int myId;
	int lentlink;
	private int scaleZ;
	String name;
	private short[] recolorModified;
	private int womanWear2;
	private int manWear3;
	static char aChar1536;
	int cursor1;
	int[] countcounts;
	private short[] retextureOriginal;
	int stackable;
	int lenttemplate;
	private int manhead;
	private int manwearzoff;
	private short[] recolorOriginal;
	int xan2d;
	int manWear;
	private int womanhead;
	private int manwearxoff;
	private int womanhead2;
	int cursor1op;
	static int anInt1551 = 0;
	int certtemplate;
	int womanWear;
	String[] inventoryOptions;
	boolean members;
	private int womanwearxoff;
	private int scaleX;
	int yan2d;
	private int womanWear3;
	private short[] retextureModified;
	int yof2d;
	int team;
	int certlink;
	String[] options;
	int cost;
	int[] countobj;
	static boolean objMemberClient;
	static ObjectCache recentUse = new ObjectCache(64);

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final Model method2103(final boolean isWoman) {
		int wearId = this.manWear;
		int wear2Id = manWear2;
		int wear3Id = manWear3;
		if (isWoman) {
			wearId = this.womanWear;
			wear2Id = womanWear2;
			wear3Id = womanWear3;
		}
		if (wearId == -1) {
			return null;
		}
		Model mainModel = Model.get(Class111.aClass50_1064, wearId, 0);
		if (wear2Id != -1) {
			final Model wear2Model = Model.get(Class111.aClass50_1064, wear2Id, 0);
			if (wear3Id == -1) {
				final Model[] models = { mainModel, wear2Model };
				mainModel = new Model(models, 2);
			} else {
				final Model wear3Model = Model.get(Class111.aClass50_1064, wear3Id, 0);
				final Model[] models = { mainModel, wear2Model, wear3Model };
				mainModel = new Model(models, 3);
			}
		}
		if (!isWoman && (manwearxoff != 0 || manwearyoff != 0 || manwearzoff != 0)) {
			mainModel.translate(manwearxoff, manwearyoff, manwearzoff);
		}
		if (isWoman && (womanwearxoff != 0 || womanwearyoff != 0 || womanwearzoff != 0)) {
			mainModel.translate(womanwearxoff, womanwearyoff, womanwearzoff);
		}
		if (recolorOriginal != null) {
			for (int id = 0; id < recolorOriginal.length; id++) {
				mainModel.recolor(recolorOriginal[id], recolorModified[id]);
			}
		}
		if (retextureOriginal != null) {
			for (int id = 0; id < retextureOriginal.length; id++) {
				mainModel.retexture(retextureOriginal[id], retextureModified[id]);
			}
		}
		return mainModel;
	}

	final void genCert(final ObjType link, final ObjType template) {
		this.cost = link.cost;
		recolorPalette = template.recolorPalette;
		recolorModified = template.recolorModified;
		retextureOriginal = template.retextureOriginal;
		this.yan2d = template.yan2d;
		this.xan2d = template.xan2d;
		this.xof2d = template.xof2d;
		recolorOriginal = template.recolorOriginal;
		modelId = template.modelId;
		this.name = link.name;
		this.stackable = 1;
		this.zan2d = template.zan2d;
		this.members = link.members;
		this.yof2d = template.yof2d;
		this.zoom2d = template.zoom2d;
		retextureModified = template.retextureModified;
	}

	final AbstractModelRenderer method2105(final int frameId, final int count, final int nextFrameId, final PlayerAppearance playerAppearance, final SeqType seqType, final int frameDelay) {
		if (this.countobj != null && count > 1) {
			int countObjId = -1;
			for (int id = 0; id < 10; id++) {
				if (count >= this.countcounts[id] && this.countcounts[id] != 0) {
					countObjId = this.countobj[id];
				}
			}
			if (countObjId != -1) {
				return ObjType.list(countObjId).method2105(frameId, 1, nextFrameId, playerAppearance, seqType, frameDelay);
			}
		}
		AbstractModelRenderer cachedModel = (AbstractModelRenderer) Class33.aClass21_273.get(this.myId);
		if (cachedModel == null) {
			final Model model = Model.get(Class111.aClass50_1064, modelId, 0);
			if (model == null) {
				return null;
			}
			if (recolorOriginal != null) {
				for (int id = 0; id < recolorOriginal.length; id++) {
					if (recolorPalette == null || id >= recolorPalette.length) {
						model.recolor(recolorOriginal[id], recolorModified[id]);
					} else {
						model.recolor(recolorOriginal[id], NodeSub.aShortArray2584[recolorPalette[id] & 0xff]);
					}
				}
			}
			if (retextureOriginal != null) {
				for (int id = 0; id < retextureOriginal.length; id++) {
					model.retexture(retextureOriginal[id], retextureModified[id]);
				}
			}
			if (playerAppearance != null) {
				for (int id = 0; id < 5; id++) {
					if (playerAppearance.colors[id] < Class159.aShortArrayArray1489[id].length) {
						model.recolor(Class120_Sub12_Sub37.aShortArray3429[id], Class159.aShortArrayArray1489[id][playerAppearance.colors[id]]);
					}
					if (playerAppearance.colors[id] < Class120_Sub30_Sub1.aShortArrayArray3668[id].length) {
						model.recolor(SpotAnimType.aShortArray994[id], Class120_Sub30_Sub1.aShortArrayArray3668[id][playerAppearance.colors[id]]);
					}
				}
			}
			cachedModel = model.toRenderer(ambient + 64, contrast + 768, -50, -10, -50);
			if (scaleX != 128 || scaleY != 128 || scaleZ != 128) {
				cachedModel.scale(scaleX, scaleY, scaleZ);
			}
			cachedModel.haveActions = true;
			if (HDToolkit.glEnabled) {
				((HDModelRenderer) cachedModel).method2432(false, false, false, true, false, false, true);
			}
			Class33.aClass21_273.put(cachedModel, this.myId);
		}
		if (seqType != null) {
			cachedModel = seqType.method323(cachedModel, frameDelay, nextFrameId, frameId);
		}
		return cachedModel;
	}

	final ObjType method2106(final int count) {
		if (this.countobj != null && count > 1) {
			int countObjId = -1;
			for (int id = 0; id < 10; id++) {
				if (this.countcounts[id] <= count && this.countcounts[id] != 0) {
					countObjId = this.countobj[id];
				}
			}
			if (countObjId != -1) {
				return ObjType.list(countObjId);
			}
		}
		return this;
	}

	final Model method2107(final boolean isWoman) {
		int i_25_ = manhead;
		int i_24_ = manhead2;
		if (isWoman) {
			i_25_ = womanhead;
			i_24_ = womanhead2;
		}
		if (i_25_ == -1) {
			return null;
		}
		Model class180_sub2_26_ = Model.get(Class111.aClass50_1064, i_25_, 0);
		if (i_24_ != -1) {
			final Model class180_sub2_27_ = Model.get(Class111.aClass50_1064, i_24_, 0);
			final Model[] class180_sub2s = { class180_sub2_26_, class180_sub2_27_ };
			class180_sub2_26_ = new Model(class180_sub2s, 2);
		}
		if (recolorOriginal != null) {
			for (int i_28_ = 0; i_28_ < recolorOriginal.length; i_28_++) {
				class180_sub2_26_.recolor(recolorOriginal[i_28_], recolorModified[i_28_]);
			}
		}
		if (retextureOriginal != null) {
			for (int i_29_ = 0; i_29_ < retextureOriginal.length; i_29_++) {
				class180_sub2_26_.retexture(retextureOriginal[i_29_], retextureModified[i_29_]);
			}
		}
		return class180_sub2_26_;
	}

	static final WallDecoration getWallDecoration(final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		return groundTile.wallDecoration;
	}

	final void postDecode() {
		/* empty */
	}

	final boolean modelsDownloaded(final boolean isWoman) {
		int i_33_ = manWear2;
		int i_34_ = manWear3;
		int i_35_ = this.manWear;
		if (isWoman) {
			i_34_ = womanWear3;
			i_33_ = womanWear2;
			i_35_ = this.womanWear;
		}
		if (i_35_ == -1) {
			return true;
		}
		boolean bool_36_ = true;
		if (!Class111.aClass50_1064.requestDownload(i_35_, 0)) {
			bool_36_ = false;
		}
		if (i_33_ != -1 && !Class111.aClass50_1064.requestDownload(i_33_, 0)) {
			bool_36_ = false;
		}
		if (i_34_ != -1 && !Class111.aClass50_1064.requestDownload(i_34_, 0)) {
			bool_36_ = false;
		}
		return bool_36_;
	}

	final String getStringParam(final int param, final String defaultString) {
		if (this.params == null) {
			return defaultString;
		}
		final StringNode stringNode = (StringNode) this.params.get(param);
		if (stringNode == null) {
			return defaultString;
		}
		return stringNode.value;
	}

	final void genLent(final ObjType class162_39_, final ObjType class162_40_) {
		this.womanWear = class162_39_.womanWear;
		manhead2 = class162_39_.manhead2;
		manhead = class162_39_.manhead;
		womanWear2 = class162_39_.womanWear2;
		manWear3 = class162_39_.manWear3;
		this.xof2d = class162_40_.xof2d;
		womanwearyoff = class162_39_.womanwearyoff;
		manWear2 = class162_39_.manWear2;
		this.params = class162_39_.params;
		recolorOriginal = class162_39_.recolorOriginal;
		this.zan2d = class162_40_.zan2d;
		womanhead2 = class162_39_.womanhead2;
		manwearyoff = class162_39_.manwearyoff;
		manwearzoff = class162_39_.manwearzoff;
		this.team = class162_39_.team;
		this.yan2d = class162_40_.yan2d;
		manwearxoff = class162_39_.manwearxoff;
		modelId = class162_40_.modelId;
		this.inventoryOptions = new String[5];
		this.members = class162_39_.members;
		recolorModified = class162_39_.recolorModified;
		womanwearzoff = class162_39_.womanwearzoff;
		this.yof2d = class162_40_.yof2d;
		retextureModified = class162_39_.retextureModified;
		this.xan2d = class162_40_.xan2d;
		this.manWear = class162_39_.manWear;
		retextureOriginal = class162_39_.retextureOriginal;
		womanwearxoff = class162_39_.womanwearxoff;
		womanhead = class162_39_.womanhead;
		this.zoom2d = class162_40_.zoom2d;
		womanWear3 = class162_39_.womanWear3;
		this.options = class162_39_.options;
		this.name = class162_39_.name;
		this.cost = 0;
		recolorPalette = class162_39_.recolorPalette;
		if (class162_39_.inventoryOptions != null) {
			for (int i_41_ = 0; i_41_ < 4; i_41_++) {
				this.inventoryOptions[i_41_] = class162_39_.inventoryOptions[i_41_];
			}
		}
		this.inventoryOptions[4] = Class8.aString64;
	}

	static final boolean decodedSprites(final js5 js5, final int groupId) {
		final byte[] data = js5.getFileSmart(groupId);
		if (data == null) {
			return false;
		}
		Class140.decodeSprites(data);
		return true;
	}

	final int getIntegerParamValue(final int param, final int defaultInt) {
		if (this.params == null) {
			return defaultInt;
		}
		final IntegerNode integerNode = (IntegerNode) this.params.get(param);
		if (integerNode == null) {
			return defaultInt;
		}
		return integerNode.value;
	}

	final boolean method2116(final boolean bool) {
		int i_47_ = manhead;
		int i_48_ = manhead2;
		if (bool) {
			i_47_ = womanhead;
			i_48_ = womanhead2;
		}
		if (i_47_ == -1) {
			return true;
		}
		boolean bool_49_ = true;
		if (!Class111.aClass50_1064.requestDownload(i_47_, 0)) {
			bool_49_ = false;
		}
		if (i_48_ != -1 && !Class111.aClass50_1064.requestDownload(i_48_, 0)) {
			bool_49_ = false;
		}
		return bool_49_;
	}

	final LDModelRenderer method2117(final PlayerAppearance playerAppearance) {
		final Model model = Model.get(Class111.aClass50_1064, modelId, 0);
		if (model == null) {
			return null;
		}
		if (recolorOriginal != null) {
			for (int id = 0; id < recolorOriginal.length; id++) {
				if (recolorPalette != null && recolorPalette.length > id) {
					model.recolor(recolorOriginal[id], NodeSub.aShortArray2584[recolorPalette[id] & 0xff]);
				} else {
					model.recolor(recolorOriginal[id], recolorModified[id]);
				}
			}
		}
		if (retextureOriginal != null) {
			for (int id = 0; id < retextureOriginal.length; id++) {
				model.retexture(retextureOriginal[id], retextureModified[id]);
			}
		}
		if (playerAppearance != null) {
			for (int id = 0; id < 5; id++) {
				if (Class159.aShortArrayArray1489[id].length > playerAppearance.colors[id]) {
					model.recolor(Class120_Sub12_Sub37.aShortArray3429[id], Class159.aShortArrayArray1489[id][playerAppearance.colors[id]]);
				}
				if (Class120_Sub30_Sub1.aShortArrayArray3668[id].length > playerAppearance.colors[id]) {
					model.recolor(SpotAnimType.aShortArray994[id], Class120_Sub30_Sub1.aShortArrayArray3668[id][playerAppearance.colors[id]]);
				}
			}
		}
		final LDModelRenderer ldModel = model.method2298(ambient + 64, contrast + 768, -50, -10, -50);
		if (scaleX != 128 || scaleY != 128 || scaleZ != 128) {
			ldModel.scale(scaleX, scaleY, scaleZ);
		}
		return ldModel;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			modelId = buffer.getUShort();
		} else if (code == 2) {
			this.name = buffer.getJagexString();
		} else if (code == 4) {
			this.zoom2d = buffer.getUShort();
		} else if (code == 5) {
			this.xan2d = buffer.getUShort();
		} else if (code == 6) {
			this.yan2d = buffer.getUShort();
		} else if (code == 7) {
			this.xof2d = buffer.getUShort();
			if (this.xof2d > 32767) {
				this.xof2d -= 65536;
			}
		} else if (code == 8) {
			this.yof2d = buffer.getUShort();
			if (this.yof2d > 32767) {
				this.yof2d -= 65536;
			}
		} else if (code == 11) {
			this.stackable = 1;
		} else if (code == 12) {
			this.cost = buffer.getInt();
		} else if (code == 16) {
			this.members = true;
		} else if (code == 23) {
			this.manWear = buffer.getUShort();
		} else if (code == 24) {
			manWear2 = buffer.getUShort();
		} else if (code == 25) {
			this.womanWear = buffer.getUShort();
		} else if (code == 26) {
			womanWear2 = buffer.getUShort();
		} else if (code >= 30 && code < 35) {
			this.options[code - 30] = buffer.getJagexString();
			if (this.options[code - 30].equalsIgnoreCase(StringLibrary.hidden)) {
				this.options[code - 30] = null;
			}
		} else if (code >= 35 && code < 40) {
			this.inventoryOptions[code - 35] = buffer.getJagexString();
		} else if (code == 40) {
			final int recolorLen = buffer.getUByte();
			recolorOriginal = new short[recolorLen];
			recolorModified = new short[recolorLen];
			for (int id = 0; id < recolorLen; id++) {
				recolorOriginal[id] = (short) buffer.getUShort();
				recolorModified[id] = (short) buffer.getUShort();
			}
		} else if (code == 41) {
			final int retextureLen = buffer.getUByte();
			retextureOriginal = new short[retextureLen];
			retextureModified = new short[retextureLen];
			for (int id = 0; id < retextureLen; id++) {
				retextureOriginal[id] = (short) buffer.getUShort();
				retextureModified[id] = (short) buffer.getUShort();
			}
		} else if (code == 42) {
			final int recolorLen = buffer.getUByte();
			recolorPalette = new byte[recolorLen];
			for (int id = 0; id < recolorLen; id++) {
				recolorPalette[id] = buffer.getByte();
			}
		} else if (code == 65) {
			this.stockmarket = true;
		} else if (code == 78) {
			manWear3 = buffer.getUShort();
		} else if (code == 79) {
			womanWear3 = buffer.getUShort();
		} else if (code == 90) {
			manhead = buffer.getUShort();
		} else if (code == 91) {
			womanhead = buffer.getUShort();
		} else if (code == 92) {
			manhead2 = buffer.getUShort();
		} else if (code == 93) {
			womanhead2 = buffer.getUShort();
		} else if (code == 95) {
			this.zan2d = buffer.getUShort();
		} else if (code == 96) {
			this.dummyobject = buffer.getUByte();
		} else if (code == 97) {
			this.certlink = buffer.getUShort();
		} else if (code == 98) {
			this.certtemplate = buffer.getUShort();
		} else if (code >= 100 && code < 110) {
			if (this.countobj == null) {
				this.countcounts = new int[10];
				this.countobj = new int[10];
			}
			this.countobj[code - 100] = buffer.getUShort();
			this.countcounts[code - 100] = buffer.getUShort();
		} else if (code == 110) {
			scaleX = buffer.getUShort();
		} else if (code == 111) {
			scaleY = buffer.getUShort();
		} else if (code == 112) {
			scaleZ = buffer.getUShort();
		} else if (code == 113) {
			ambient = buffer.getByte();
		} else if (code == 114) {
			contrast = buffer.getByte() * 5;
		} else if (code == 115) {
			this.team = buffer.getUByte();
		} else if (code == 121) {
			this.lentlink = buffer.getUShort();
		} else if (code == 122) {
			this.lenttemplate = buffer.getUShort();
		} else if (code == 125) {
			manwearxoff = buffer.getByte();
			manwearyoff = buffer.getByte();
			manwearzoff = buffer.getByte();
		} else if (code == 126) {
			womanwearxoff = buffer.getByte();
			womanwearyoff = buffer.getByte();
			womanwearzoff = buffer.getByte();
		} else if (code == 127) {
			this.cursor1op = buffer.getUByte();
			this.cursor1 = buffer.getUShort();
		} else if (code == 128) {
			this.cursor2op = buffer.getUByte();
			this.cursor2 = buffer.getUShort();
		} else if (code == 129) {
			int cursor1iop = buffer.getUByte();
			int icursor1 = buffer.getUShort();
		} else if (code == 130) {
			int cursor2iop = buffer.getUByte();
			int icursor2 = buffer.getUShort();
		} else if (code == 249) {
			final int paramLen = buffer.getUByte();
			if (this.params == null) {
				final int size = Class120_Sub12_Sub17.getFarestBitValue(paramLen);
				this.params = new Hashtable(size);
			}
			for (int id = 0; id < paramLen; id++) {
				final boolean isString = buffer.getUByte() == 1;
				final int uid = buffer.getMedium();
				Node node;
				if (isString) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				this.params.put(node, uid);
			}
		}
	}

	static final void setMembersClient2(final boolean bool) {
		if (ObjType.objMemberClient != bool) {
			ObjType.objMemberClient = bool;
			Class120_Sub12_Sub18.clearObjCache();
		}
	}

	static final ObjType list(final int id) {
		ObjType objType = (ObjType) recentUse.get(id);
		if (objType != null) {
			return objType;
		}
		final byte[] data = Class120_Sub12_Sub23.aClass50_3305.getFile(id >>> 8, id & 0xff);
		objType = new ObjType();
		objType.myId = id;
		if (data != null) {
			objType.decode(new Buffer(data));
		}
		objType.postDecode();
		if (objType.certtemplate != -1) {
			objType.genCert(list(objType.certlink), list(objType.certtemplate));
		}
		if (objType.lenttemplate != -1) {
			objType.genLent(list(objType.lentlink), list(objType.lenttemplate));
		}
		if (!ObjType.objMemberClient && objType.members) {
			objType.name = StringLibrary.membersObject;
			objType.options = Class120_Sub12_Sub32.membersObjOptions;
			objType.inventoryOptions = Class120_Sub12_Sub29.membersObjInventoryOptions;
			objType.team = 0;
			objType.stockmarket = false;
		}
		recentUse.put(objType, id);
		return objType;
	}

	public ObjType() {
		manhead2 = -1;
		this.cursor1 = -1;
		manWear2 = -1;
		ambient = 0;
		womanWear2 = -1;
		this.zoom2d = 2000;
		scaleZ = 128;
		scaleY = 128;
		womanwearzoff = 0;
		manwearyoff = 0;
		this.stackable = 0;
		this.xof2d = 0;
		this.name = "null";
		contrast = 0;
		manhead = -1;
		womanhead = -1;
		womanhead2 = -1;
		this.xan2d = 0;
		this.womanWear = -1;
		this.lentlink = -1;
		manWear3 = -1;
		this.lenttemplate = -1;
		this.certtemplate = -1;
		manwearxoff = 0;
		womanwearxoff = 0;
		manwearzoff = 0;
		this.stockmarket = false;
		this.certlink = -1;
		this.zan2d = 0;
		this.yan2d = 0;
		this.inventoryOptions = new String[] { null, null, null, null, StringLibrary.drop };
		this.members = false;
		this.manWear = -1;
		this.team = 0;
		this.yof2d = 0;
		this.cursor1op = -1;
		womanwearyoff = 0;
		scaleX = 128;
		this.cursor2 = -1;
		this.cost = 1;
		this.options = new String[] { null, null, StringLibrary.take, null, null };
		womanWear3 = -1;
	}
}
