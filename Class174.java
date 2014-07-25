/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 {
	static int[] anIntArray1731 = new int[50];
	ParticleNode head = new ParticleNode();
	static String aString1733 = "skill: ";
	private ParticleNode next;
	static int currentCursorId = -1;
	
	final ParticleNode peekFirst() {
		final ParticleNode node = this.head.next;
		if (this.head == node) {
			next = null;
			return null;
		}
		next = node.next;
		return node;
	}

	final ParticleNode peekNext() {
		final ParticleNode node = next;
		if (this.head == node) {
			next = null;
			return null;
		}
		next = node.next;
		return node;
	}

	final int getCount() {
		int count = 0;
		ParticleNode next = this.head.next;
		while (this.head != next) {
			next = next.next;
			count++;
		}
		return count;
	}

	public static void method2232(final int i) {
		try {
			anIntArray1731 = null;
			if (i != 0) {
				method2232(70);
			}
			aString1733 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ug.B(").append(i).append(')').toString());
		}
	}

	static final void method2233(final byte i) {
		try {
			if (i >= 0) {
				longToString(-9L);
			}
			while (Canvas_Sub1.inputStream.getBitsLeft(AbstractMouseWheelHandler.packetSize) >= 11) {
				final int i_3_ = Canvas_Sub1.inputStream.getBitValue(11);
				if (i_3_ == 2047) {
					break;
				}
				boolean bool = false;
				if (Class118.playersList[i_3_] == null) {
					bool = true;
					Class118.playersList[i_3_] = new Player();
					if (StringNode.playerAppearanceBuffers[i_3_] != null) {
						Class118.playersList[i_3_].decodeAppearance(StringNode.playerAppearanceBuffers[i_3_]);
					}
				}
				Class112.playerIndices[FileSystemWorker.localPlayerCount++] = i_3_;
				final Player class180_sub5_sub1 = Class118.playersList[i_3_];
				class180_sub5_sub1.anInt2985 = Class101_Sub2.loopCycle;
				final int i_4_ = Class15.anIntArray101[Canvas_Sub1.inputStream.getBitValue(3)];
				if (bool) {
					class180_sub5_sub1.anInt3019 = class180_sub5_sub1.anInt3032 = i_4_;
				}
				int i_5_ = Canvas_Sub1.inputStream.getBitValue(5);
				if (i_5_ > 15) {
					i_5_ -= 32;
				}
				final int i_6_ = Canvas_Sub1.inputStream.getBitValue(1);
				final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
				if (i_7_ == 1) {
					Class169.anIntArray1648[Class154.anInt1441++] = i_3_;
				}
				int i_8_ = Canvas_Sub1.inputStream.getBitValue(5);
				if (i_8_ > 15) {
					i_8_ -= 32;
				}
				class180_sub5_sub1.method2343(TileParticleQueue.selfPlayer.walkQueueX[0] + i_5_, TileParticleQueue.selfPlayer.walkQueueZ[0] + i_8_, i_6_ == 1);
			}
			Canvas_Sub1.inputStream.endBitAccess();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ug.F(").append(i).append(')').toString());
		}
	}

	static final String longToString(long l) {
		if ((l ^ 0xffffffffffffffffL) >= -1L || (l ^ 0xffffffffffffffffL) <= -6582952005840035282L) {
			return null;
		}
		if (l % 37L == 0L) {
			return null;
		}
		int i_9_ = 0;
		for (long l_10_ = l; l_10_ != 0L; l_10_ /= 37L) {
			i_9_++;
		}
		final StringBuffer stringbuffer = new StringBuffer(i_9_);
		while ((l ^ 0xffffffffffffffffL) != -1L) {
			final long l_11_ = l;
			l /= 37L;
			stringbuffer.append(Class120_Sub12_Sub16.aCharArray3254[(int) (l_11_ + -(l * 37L))]);
		}
		return stringbuffer.reverse().toString();
	}

	static final void method2236(final int i) {
		try {
			if (i == 60) {
				for (Class120_Sub14_Sub4 class120_sub14_sub4 = (Class120_Sub14_Sub4) Class120_Sub12_Sub7.aClass105_3177.getFront(); class120_sub14_sub4 != null; class120_sub14_sub4 = (Class120_Sub14_Sub4) Class120_Sub12_Sub7.aClass105_3177.getNext()) {
					final Class180_Sub3 class180_sub3 = class120_sub14_sub4.aClass180_Sub3_3467;
					if (class180_sub3.anInt2908 == Class173.gameLevel && !class180_sub3.aBoolean2920) {
						if (Class101_Sub2.loopCycle >= class180_sub3.anInt2917) {
							class180_sub3.method2311(Class120_Sub12_Sub22.redrawRate, (byte) -46);
							if (!class180_sub3.aBoolean2920) {
								Class120_Sub12_Sub5.method1218(class180_sub3.anInt2908, class180_sub3.anInt2904, class180_sub3.anInt2907, class180_sub3.anInt2905, 60, class180_sub3, 0, -1L, false);
							} else {
								class120_sub14_sub4.unlink();
							}
						}
					} else {
						class120_sub14_sub4.unlink();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ug.C(").append(i).append(')').toString());
		}
	}

	final void insertLast(final ParticleNode class108) {
		if (class108.previous != null) {
			class108.unlink();
		}
		class108.next = this.head;
		class108.previous = this.head.previous;
		class108.previous.next = class108;
		class108.next.previous = class108;
	}

	public Class174() {
		this.head.previous = this.head;
		this.head.next = this.head;
	}
}
