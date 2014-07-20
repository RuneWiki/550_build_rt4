/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class108 {
	static int anInt1031 = 0;
	Class108 next;
	Class108 previous;
	static float aFloat1034;
	static int anInt1035;

	final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}

	static final void tele(final int x, final int z, final int level) {
		final String string = new StringBuilder("::tele ").append(level).append(",").append(x >> 6).append(",").append(z >> 6).append(",").append(x & 0x3f).append(",").append(z & 0x3f).toString();
		System.out.println(string);
		Class120_Sub12_Sub20.method1301((byte) 95, string);
	}

	static final void getSpriteIds(final js5 js5) {
		Class32.p11fullId = js5.method432("p11_full");
		Class191.p12fullId = js5.method432("p12_full");
		Class110.b12fullId = js5.method432("b12_full");
		AmbientSound.hitmarksId = js5.method432("hitmarks");
		Class120_Sub12_Sub25.hitbardefaultId = js5.method432("hitbar_default");
		Class120_Sub14_Sub15.headiconspkId = js5.method432("headicons_pk");
		MasterIndexInfo.headiconsprayerId = js5.method432("headicons_prayer");
		Class120_Sub21.hintheadiconsId = js5.method432("hint_headicons");
		Class173.hintmapmarkersId = js5.method432("hint_mapmarkers");
		Class169.mapflagId = js5.method432("mapflag");
		Class132_Sub2.crossId = js5.method432("cross");
		Class73.mapdotsId = js5.method432("mapdots");
		Class134.scrollbarId = js5.method432("scrollbar");
		Class81.nameiconsId = js5.method432("name_icons");
		Class120_Sub12_Sub7.floorshadowsId = js5.method432("floorshadows");
		Class9.compassId = js5.method432("compass");
		PlayerAppearance.hintmapedgeId = js5.method432("hint_mapedge");
	}

	static final void method932(final boolean bool, final int i, final int i_3_, final int i_4_) {
		Class120_Sub30_Sub1.method1739(false);
		JagexSocket.aBoolean423 = bool;
		Class120_Sub12_Sub33.anInt3407 = i_3_;
		Class86.anInt818 = i;
		Class79.method684(i_4_);
		Class86.aClass75_823 = new Hashtable(8);
		Class81.aClass75_777 = new Hashtable(8);
	}

	public Class108() {
		/* empty */
	}
}
