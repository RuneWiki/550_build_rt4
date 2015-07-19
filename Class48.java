/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48 {
	static World[] worldList;
	static int returnCode = -2;
	static boolean jsEnabled = false;

	static final boolean method400(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		if (i_0_ < i_1_ && i_0_ < i_2_ && i_0_ < i_3_) {
			return false;
		}
		if (i_0_ > i_1_ && i_0_ > i_2_ && i_0_ > i_3_) {
			return false;
		}
		if (i < i_4_ && i < i_5_ && i < i_6_) {
			return false;
		}
		if (i > i_4_ && i > i_5_ && i > i_6_) {
			return false;
		}
		final int i_7_ = (i_0_ - i_1_) * (i_5_ - i_4_) - (i - i_4_) * (i_2_ - i_1_);
		final int i_8_ = (i_0_ - i_3_) * (i_4_ - i_6_) - (i - i_6_) * (i_1_ - i_3_);
		final int i_9_ = (i_0_ - i_2_) * (i_6_ - i_5_) - (i - i_5_) * (i_3_ - i_2_);
		if (i_7_ * i_9_ > 0 && i_9_ * i_8_ > 0) {
			return true;
		}
		return false;
	}

	static final void method401(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(10, i);
		class120_sub14_sub7.method1453();
	}

	static final void method404(final int id, final int i_16_, final int i_18_, final int i_19_) {
		if (Class111.anInt1061 != 0 && i_18_ != 0 && Class150.soundEffectCount < 50 && id != -1) {
			Class120_Sub12_Sub16.anIntArray3255[Class150.soundEffectCount] = id;
			LocType.anIntArray1834[Class150.soundEffectCount] = i_18_;
			Class81.soundEffectDelays[Class150.soundEffectCount] = i_16_;
			Class109.aClass6Array1047[Class150.soundEffectCount] = null;
			Class174.anIntArray1731[Class150.soundEffectCount] = 0;
			FileSystemRequest.anIntArray3926[Class150.soundEffectCount] = i_19_;
			Class150.soundEffectCount++;
		}
	}

	static final int getPlayersCacheSize() {
		return Class43.playerModelsCache.getCount();
	}

	static final void addFriend(final long nameAsLong) {
		if (nameAsLong != 0L) {
			if (ProducingGraphicsBuffer.friendCount >= 100 && !Class120_Sub12_Sub21_Sub1.extendFriendsList || ProducingGraphicsBuffer.friendCount >= 200) {
				AbstractRequest.pushMessage(StringLibrary.aString2550, "", 0);
			} else {
				final String name = Class136.longToString(nameAsLong);
				for (int id = 0; id < ProducingGraphicsBuffer.friendCount; id++) {
					if (nameAsLong == AbstractSprite.friendsNameAsLong[id]) {
						AbstractRequest.pushMessage(new StringBuilder(name).append(StringLibrary.aString3910).toString(), "", 0);
						return;
					}
				}
				for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
					if (nameAsLong == HintIcon.ignoreNamesAsLong[id]) {
						AbstractRequest.pushMessage(new StringBuilder(StringLibrary.aString2849).append(name).append(StringLibrary.aString2578).toString(), "", 0);
						return;
					}
				}
				if (name.equals(TileParticleQueue.selfPlayer.name)) {
					AbstractRequest.pushMessage(StringLibrary.aString3655, "", 0);
				} else {
					Class120_Sub16.friendsName[ProducingGraphicsBuffer.friendCount] = name;
					AbstractSprite.friendsNameAsLong[ProducingGraphicsBuffer.friendCount] = nameAsLong;
					Class120_Sub12_Sub16.friendsWorld[ProducingGraphicsBuffer.friendCount] = 0;
					Class79_Sub1.friendsSideText[ProducingGraphicsBuffer.friendCount] = "";
					Class120_Sub12_Sub30.friendsRank[ProducingGraphicsBuffer.friendCount] = 0;
					Class120_Sub12_Sub9.aBooleanArray3194[ProducingGraphicsBuffer.friendCount] = false;
					ProducingGraphicsBuffer.friendCount++;
					client.anInt563 = GrandExchangeObject.anInt1494;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(26);
					Class120_Sub12_Sub11.outputStream.putLong(nameAsLong);
				}
			}
		}
	}
}
