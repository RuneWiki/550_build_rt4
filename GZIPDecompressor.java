/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class GZIPDecompressor {
	static int anInt796 = -2;
	private Inflater inflater;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_798;
	static int[] anIntArray800;
	static String[] ignoreNames = new String[100];

	public GZIPDecompressor() {
		this(-1, 1000000, 1000000);
	}

	static final void method717(final int i, final int i_0_, final int i_1_, final int i_2_) {
		if (i_0_ >= i) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_2_], i_1_, i, i_0_);
		} else {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_2_], i_1_, i_0_, i);
		}
	}

	static final void processProjectiles() {
		for (ProjectileNode projectileNode = (ProjectileNode) FileSystemRequest.projectileDeque.getFront(); projectileNode != null; projectileNode = (ProjectileNode) FileSystemRequest.projectileDeque.getNext()) {
			final Projectile class180_sub4 = projectileNode.projectile;
			if (class180_sub4.level != Class173.gameLevel || Class101_Sub2.clientClock > class180_sub4.endCycle) {
				projectileNode.unlink();
			} else if (class180_sub4.startCycle <= Class101_Sub2.clientClock) {
				if (class180_sub4.lockonIndex > 0) {
					final Npc npc = Class120_Sub12_Sub11.npcList[class180_sub4.lockonIndex - 1];
					if (npc != null && npc.x >= 0 && npc.x < 13312 && npc.z >= 0 && npc.z < 13312) {
						class180_sub4.method2319(npc.x, Class22.getTileHeight(npc.x, npc.z, class180_sub4.level) - class180_sub4.yOff, npc.z, Class101_Sub2.clientClock);
					}
				}
				if (class180_sub4.lockonIndex < 0) {
					final int i_3_ = -class180_sub4.lockonIndex - 1;
					Player player;
					if (Class167.selfPlayerIndex == i_3_) {
						player = TileParticleQueue.selfPlayer;
					} else {
						player = Class118.playersList[i_3_];
					}
					if (player != null && player.x >= 0 && player.x < 13312 && player.z >= 0 && player.z < 13312) {
						class180_sub4.method2319(player.x, Class22.getTileHeight(player.x, player.z, class180_sub4.level) - class180_sub4.yOff, player.z, Class101_Sub2.clientClock);
					}
				}
				class180_sub4.method2317(Class120_Sub12_Sub22.redrawRate);
				Class120_Sub12_Sub5.method1218(Class173.gameLevel, (int) class180_sub4.aDouble2949, (int) class180_sub4.aDouble2953, (int) class180_sub4.aDouble2937, 60, class180_sub4, class180_sub4.anInt2944, -1L, false);
			}
		}
	}

	static final void setHuffman(final Huffman huffman) {
		client.huffman = huffman;
	}

	final void decompress(final Buffer buffer, final byte[] output) {
		if (buffer.buf[buffer.pos] != 31 || buffer.buf[buffer.pos + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (inflater == null) {
			inflater = new Inflater(true);
		}
		try {
			inflater.setInput(buffer.buf, buffer.pos + 10, buffer.buf.length - (buffer.pos + 18));
			inflater.inflate(output);
		} catch (final Exception exception) {
			inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		inflater.reset();
	}

	private GZIPDecompressor(final int i, final int i_4_, final int i_5_) {
		/* empty */
	}
}
