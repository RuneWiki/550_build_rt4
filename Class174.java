/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 {
	static int[] anIntArray1731 = new int[50];
	ParticleNode head = new ParticleNode();
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
			TextRepository.skill = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ug.B(").append(i).append(')').toString());
		}
	}

	static final void method2233() {
		while (Canvas_Sub1.inputStream.getBitsLeft(AbstractMouseWheelHandler.packetSize) >= 11) {
			final int index = Canvas_Sub1.inputStream.getBitValue(11);
			if (index == 2047) {
				break;
			}
			boolean newPlayer = false;
			if (Class118.playersList[index] == null) {
				Class118.playersList[index] = new Player();
				if (StringNode.playerAppearanceBuffers[index] != null) {
					Class118.playersList[index].decodeAppearance(StringNode.playerAppearanceBuffers[index]);
				}
				newPlayer = true;
			}
			Class112.playerIndices[FileSystemWorker.localPlayerCount++] = index;
			final Player player = Class118.playersList[index];
			player.lastUpdateCycle = Class101_Sub2.loopCycle;
			final int i_4_ = Class15.anIntArray101[Canvas_Sub1.inputStream.getBitValue(3)];
			if (newPlayer) {
				player.anInt3019 = player.anInt3032 = i_4_;
			}
			int x = Canvas_Sub1.inputStream.getBitValue(5);
			if (x > 15) {
				x -= 32;
			}
			final int i_6_ = Canvas_Sub1.inputStream.getBitValue(1);
			final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
			if (i_7_ == 1) {
				Class169.anIntArray1648[Class154.anInt1441++] = index;
			}
			int z = Canvas_Sub1.inputStream.getBitValue(5);
			if (z > 15) {
				z -= 32;
			}
			player.method2343(TileParticleQueue.selfPlayer.walkQueueX[0] + x, TileParticleQueue.selfPlayer.walkQueueZ[0] + z, i_6_ == 1);
		}
		Canvas_Sub1.inputStream.endBitAccess();
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

	static final void method2236() {
		for (SpotAnimationNode class120_sub14_sub4 = (SpotAnimationNode) Class120_Sub12_Sub7.aClass105_3177.getFront(); class120_sub14_sub4 != null; class120_sub14_sub4 = (SpotAnimationNode) Class120_Sub12_Sub7.aClass105_3177.getNext()) {
			final SpotAnimation class180_sub3 = class120_sub14_sub4.spotAnimation;
			if (class180_sub3.level == Class173.gameLevel && !class180_sub3.finishedAnimating) {
				if (Class101_Sub2.loopCycle >= class180_sub3.startCycle) {
					class180_sub3.animate(Class120_Sub12_Sub22.redrawRate);
					if (class180_sub3.finishedAnimating) {
						class120_sub14_sub4.unlink();
					} else {
						Class120_Sub12_Sub5.method1218(class180_sub3.level, class180_sub3.x, class180_sub3.z, class180_sub3.y, 60, class180_sub3, 0, -1L, false);
					}
				}
			} else {
				class120_sub14_sub4.unlink();
			}
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
