/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class WallLocation {
	int anInt1792;
	static String[] prefixTitles;
	long bitPackedUid = 0L;
	int renderZ;
	SceneGraphNode aClass180_1796;
	int renderX;
	int anInt1799;
	SceneGraphNode aClass180_1800;
	int renderY;
	static CollisionMap[] collisionMaps = new CollisionMap[4];

	static final boolean method2443(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_6_, final int i_7_) {
		if (i_0_ + i_4_ <= i_6_ || i_7_ + i_6_ <= i_0_) {
			return false;
		}
		if (i >= i_1_ + i_3_ || i_3_ >= i_2_ + i) {
			return false;
		}
		return true;
	}

	static final int getMouseIdleCycle() {
		return Class136.mouseIdleCycle;
	}

	static final boolean method2445() {
		try {
			return AbstractTimer.method737();
		} catch (final IOException ioexception) {
			TileParticleQueue.dropClient();
			return true;
		} catch (final Exception exception) {
			String string = new StringBuilder("T2 - ").append(client.packetType).append(",").append(MapFunctionType.thirdPacketType).append(",").append(SeqType.fourthPacketType).append(" - ").append(AbstractMouseWheelHandler.packetSize).append(",").append(GameEntity.currentBaseX + TileParticleQueue.selfPlayer.walkQueueX[0]).append(",").append(LightType.currentBaseZ + TileParticleQueue.selfPlayer.walkQueueZ[0]).append(" - ").toString();
			for (int i_11_ = 0; i_11_ < AbstractMouseWheelHandler.packetSize && i_11_ < 50; i_11_++) {
				string = new StringBuilder(string).append(Canvas_Sub1.inputStream.buf[i_11_]).append(",").toString();
			}
			SpotAnimation.method2312(exception, string);
			DummyInputStream.processLogout();
			return true;
		}
	}

	static final int method2446(final int i_12_, final int i_13_, final int i_14_, final int i_15_) {
		final int i_17_ = i_14_ & 0xf;
		final int i_18_ = i_17_ >= 4 ? i_17_ == 12 || i_17_ == 14 ? i_13_ : i_15_ : i_12_;
		final int i_19_ = i_17_ < 8 ? i_13_ : i_12_;
		return ((0x2 & i_17_) != 0 ? -i_18_ : i_18_) + ((0x1 & i_17_) != 0 ? -i_19_ : i_19_);
	}

	public WallLocation() {
		/* empty */
	}
}
