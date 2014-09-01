/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class182 {
	int anInt1792;
	static String[] prefixTitles;
	long bitPacked = 0L;
	int anInt1795;
	SceneGraphNode aClass180_1796;
	int anInt1797;
	int anInt1799;
	SceneGraphNode aClass180_1800;
	int anInt1801;
	static CollisionMap[] collisionMaps = new CollisionMap[4];

	public static void method2442() {
		collisionMaps = null;
		prefixTitles = null;
	}

	static final boolean method2443(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		boolean bool;
		try {
			if (i_0_ + i_4_ <= i_6_ || i_7_ + i_6_ <= i_0_) {
				return false;
			}
			if (i >= i_1_ + i_3_ || i_3_ >= i_2_ + i) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ve.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
		return bool;
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
			String string = new StringBuilder("T2 - ").append(Class23.packetType).append(",").append(MapFunctionType.anInt639).append(",").append(SeqType.anInt333).append(" - ").append(AbstractMouseWheelHandler.packetSize).append(",").append(GameEntity.currentBaseX + TileParticleQueue.selfPlayer.walkQueueX[0]).append(",").append(Class181.currentBaseZ + TileParticleQueue.selfPlayer.walkQueueZ[0]).append(" - ").toString();
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

	public Class182() {
		/* empty */
	}
}
