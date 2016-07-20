/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class ParticleNode {
	static int anInt1031 = 0;
	ParticleNode next;
	ParticleNode previous;
	static float aFloat1034;
	static int searchResultsPos;

	final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}

	static final void tele(final int x, final int z, final int level) {
		final String teleCommand = "::tele " + level + "," + (x >> 6) + "," + (z >> 6) + "," + (x & 0x3f) + "," + (z & 0x3f);
		System.out.println(teleCommand);
		Class120_Sub12_Sub20.executeCommand(teleCommand);
	}

	static final void getSpriteIds(final js5 js5) {
		MagnetType.p11fullId = js5.getGroupId("p11_full");
		ChunkAtmosphere.p12fullId = js5.getGroupId("p12_full");
		Class110.b12fullId = js5.getGroupId("b12_full");
		AmbientSound.hitmarksId = js5.getGroupId("hitmarks");
		Class120_Sub12_Sub25.hitbardefaultId = js5.getGroupId("hitbar_default");
		Class120_Sub14_Sub15.headiconspkId = js5.getGroupId("headicons_pk");
		MasterIndexInfo.headiconsprayerId = js5.getGroupId("headicons_prayer");
		Class120_Sub21.hintheadiconsId = js5.getGroupId("hint_headicons");
		Class173.hintmapmarkersId = js5.getGroupId("hint_mapmarkers");
		ModelParticleMagnet.mapflagId = js5.getGroupId("mapflag");
		Class132_Sub2.crossId = js5.getGroupId("cross");
		MapFunctionType.mapdotsId = js5.getGroupId("mapdots");
		Class134.scrollbarId = js5.getGroupId("scrollbar");
		Class81.nameiconsId = js5.getGroupId("name_icons");
		Class120_Sub12_Sub7.floorshadowsId = js5.getGroupId("floorshadows");
		Class9.compassId = js5.getGroupId("compass");
		PlayerAppearance.hintmapedgeId = js5.getGroupId("hint_mapedge");
	}

	static final void method932(final boolean bool, final int i, final int i_3_, final int i_4_) {
		Class120_Sub30_Sub1.method1739();
		JagexSocket.aBoolean423 = bool;
		Class120_Sub12_Sub33.anInt3407 = i_3_;
		Class86.anInt818 = i;
		WorldMapHandler.method684(i_4_);
		Class86.aClass75_823 = new Hashtable(8);
		Class81.aClass75_777 = new Hashtable(8);
	}

	public ParticleNode() {
		/* empty */
	}
}
