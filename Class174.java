/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 {
	static int[] SoundEffectCoordinates = new int[50];
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
			player.lastUpdateCycle = Class101_Sub2.clientClock;
			final int i_4_ = Class15.anIntArray101[Canvas_Sub1.inputStream.getBitValue(3)];
			if (newPlayer) {
				player.newFaceDegrees = player.faceDegrees = i_4_;
			}
			int x = Canvas_Sub1.inputStream.getBitValue(5);
			if (x > 15) {
				x -= 32;
			}
			final int i_6_ = Canvas_Sub1.inputStream.getBitValue(1);
			final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
			if (i_7_ == 1) {
				ModelParticleMagnet.toUpdateEntityIndex[Class154.toUpdateEntitiesPos++] = index;
			}
			int z = Canvas_Sub1.inputStream.getBitValue(5);
			if (z > 15) {
				z -= 32;
			}
			player.setPos(TileParticleQueue.selfPlayer.walkQueueX[0] + x, TileParticleQueue.selfPlayer.walkQueueZ[0] + z, i_6_ == 1);
		}
		Canvas_Sub1.inputStream.endBitAccess();
	}

	static final String longToString(long hash) {
		if (hash <= 0L || hash >= 6582952005840035281L) {
			return null;
		}
		if (hash % 37L == 0L) {
			return null;
		}
		int charLen = 0;
		for (long id = hash; id != 0L; id /= 37L) {
			charLen++;
		}
		final StringBuffer stringbuffer = new StringBuffer(charLen);
		while (hash != 0L) {
			final long lastHash = hash;
			hash /= 37L;
			stringbuffer.append(Class120_Sub12_Sub16.validCharacters[(int) (lastHash - hash * 37L)]);
		}
		return stringbuffer.reverse().toString();
	}

	static final void processSpotAnimations() {
		for (SpotAnimationNode spotAnimationNode = (SpotAnimationNode) Class120_Sub12_Sub7.spotAnimationDeque.getFront(); spotAnimationNode != null; spotAnimationNode = (SpotAnimationNode) Class120_Sub12_Sub7.spotAnimationDeque.getNext()) {
			final SpotAnimation spotAnimation = spotAnimationNode.spotAnimation;
			if (spotAnimation.level == Class173.gameLevel && !spotAnimation.finishedAnimating) {
				if (Class101_Sub2.clientClock >= spotAnimation.startCycle) {
					spotAnimation.animate(Class120_Sub12_Sub22.redrawRate);
					if (spotAnimation.finishedAnimating) {
						spotAnimationNode.unlink();
					} else {
						Class120_Sub12_Sub5.method1218(spotAnimation.level, spotAnimation.x, spotAnimation.z, spotAnimation.y, 60, spotAnimation, 0, -1L, false);
					}
				}
			} else {
				spotAnimationNode.unlink();
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
