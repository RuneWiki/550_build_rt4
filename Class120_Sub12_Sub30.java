/* Class120_Sub12_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub12_Sub30 extends Class120_Sub12 {
	static AbstractSprite[] crossSprites;
	static String worldListIpAddress;
	static int[] friendsRank = new int[200];
	static String worldIpAddress;
	static int anInt3376;
	static int anInt3377;

	static final void randomFileRead(final Buffer buffer) {
		final byte[] data = new byte[24];
		if (Class10.randomFile != null) {
			try {
				Class10.randomFile.seek(0L);
				Class10.randomFile.read(data);
				int i_0_;
				for (i_0_ = 0; i_0_ < 24 && data[i_0_] == 0; i_0_++) {
					/* empty */
				}
				if (i_0_ >= 24) {
					throw new IOException();
				}
			} catch (final Exception exception) {
				for (int id = 0; id < 24; id++) {
					data[id] = (byte) -1;
				}
			}
		}
		buffer.putBuffer(data, 0, 24);
	}

	private final int noise(final int i, final int i_3_) {
		int i_5_ = i_3_ - -(57 * i);
		i_5_ = i_5_ << 1 ^ i_5_;
		return 4096 + -((0x7fffffff & 1376312589 + i_5_ * (789221 + 15731 * i_5_ * i_5_)) / 262144);
	}

	@Override
	final int[] method1187(final int i_7_) {
		final int[] is_8_ = this.aClass30_2563.method258(i_7_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_9_ = Class150.anIntArray1405[i_7_];
			for (int i_10_ = 0; i_10_ < Class120_Sub12_Sub7.anInt3178; i_10_++) {
				is_8_[i_10_] = noise(i_9_, Class90.anIntArray849[i_10_]) % 4096;
			}
		}
		return is_8_;
	}

	static final Class101_Sub4 method1362(final Buffer buffer) {
		return new Class101_Sub4(buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getMedium(), buffer.getUByte());
	}

	public Class120_Sub12_Sub30() {
		super(0, true);
	}

	static final void method1363(final int pRenderX, final int pRenderY, final int pRenderZ, final int yaw, final int pitch, int zoom, final int screenHeight) {
		int delta = screenHeight - 334;
		if (delta < 0) {
			delta = 0;
		} else if (delta > 100) {
			delta = 100;
		}
		final int zoomModifier = delta * (client.aShort565 - Class120_Sub12_Sub11.aShort3216) / 100 + Class120_Sub12_Sub11.aShort3216;
		zoom = zoom * zoomModifier >> 8;
		final int yawDelta = 2048 - yaw & 0x7ff;
		final int pitchDelta = 2048 - pitch & 0x7ff;
		int yOff = 0;
		int xOff = 0;
		int zOff = zoom;
		if (pitchDelta != 0) {
			final int pitchSin = Rasterizer.sinTable[pitchDelta];
			final int pitchCos = Rasterizer.cosTable[pitchDelta];
			yOff = -zOff * pitchSin >> 16;
			zOff = zOff * pitchCos >> 16;
		}
		if (yawDelta != 0) {
			final int yawSin = Rasterizer.sinTable[yawDelta];
			final int yawCos = Rasterizer.cosTable[yawDelta];
			xOff = zOff * yawSin >> 16;
			zOff = zOff * yawCos >> 16;
		}
		FileSystemWorker.renderX = pRenderX - xOff;
		Class120_Sub12_Sub10.renderY = pRenderY - yOff;
		GroundObjectNode.renderZ = pRenderZ - zOff;
		SpotAnimation.renderYaw = yaw;
		UnderlayType.renderPitch = pitch;
	}
}
