/* Class120_Sub12_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub12_Sub29 extends Class120_Sub12 {
	static int npcSpawnsRegionPos = 0;
	static String[] membersObjInventoryOptions = null;
	private int anInt3364;
	private int anInt3365 = 2048;
	static Class164 aClass164_3366;
	static js5 aClass50_3367;
	private int anInt3368;
	static String[] menuOptionSuffix = new String[500];

	public Class120_Sub12_Sub29() {
		super(1, false);
		anInt3364 = 1024;
		anInt3368 = 3072;
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_2_ = method1192(i_0_, 0);
			for (int i_3_ = 0; Class120_Sub12_Sub7.anInt3178 > i_3_; i_3_++) {
				is_1_[i_3_] = anInt3364 + (is_2_[i_3_] * anInt3365 >> 12);
			}
		}
		return is_1_;
	}

	static final void ping(final boolean forceSend) {
		Class120_Sub2.method1050();
		if (Class109.gameState == 30 || Class109.gameState == 25) {
			Class65.pingTimer++;
			if (Class65.pingTimer >= 50 || forceSend) {
				Class65.pingTimer = 0;
				if (!Class120_Sub12_Sub5.errorPinging && AbstractTimer.worldConnection != null) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(137);
					try {
						AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						Class120_Sub12_Sub11.outputStream.pos = 0;
					} catch (final IOException ioexception) {
						Class120_Sub12_Sub5.errorPinging = true;
					}
				}
				Class120_Sub2.method1050();
			}
		}
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_5_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[][] is_6_ = method1179(0, i);
			final int[] is_7_ = is_6_[0];
			final int[] is_8_ = is_6_[1];
			final int[] is_9_ = is_5_[0];
			final int[] is_10_ = is_5_[2];
			final int[] is_11_ = is_5_[1];
			final int[] is_12_ = is_6_[2];
			for (int i_13_ = 0; i_13_ < Class120_Sub12_Sub7.anInt3178; i_13_++) {
				is_9_[i_13_] = (anInt3365 * is_7_[i_13_] >> 12) + anInt3364;
				is_11_[i_13_] = anInt3364 + (is_8_[i_13_] * anInt3365 >> 12);
				is_10_[i_13_] = anInt3364 - -(anInt3365 * is_12_[i_13_] >> 12);
			}
		}
		return is_5_;
	}

	static final char normalizeLatinCharacters(final char character) {
		if (character == '\u00c6') {
			return 'E';
		}
		if (character == '\u00e6') {
			return 'e';
		}
		if (character == '\u00df') {
			return 's';
		}
		if (character == '\u0152') {
			return 'E';
		}
		if (character == '\u0153') {
			return 'e';
		}
		return '\0';
	}

	@Override
	final void postDecode() {
		anInt3365 = -anInt3364 + anInt3368;
	}

	static final boolean isWaterShader(final int i) {
		return i == 4 || i == 8;
	}

	static final Class101_Sub3 method1356(final Buffer buffer) {
		return new Class101_Sub3(buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getMedium(), buffer.getMedium(), buffer.getUByte());
	}

	@Override
	final void decode(final Buffer buffer, final int i_17_) {
		while_128_: do {
			do {
				if (i_17_ != 0) {
					if (i_17_ != 1) {
						if (i_17_ == 2) {
							break;
						}
						break while_128_;
					}
				} else {
					anInt3364 = buffer.getUShort();
					break while_128_;
				}
				anInt3368 = buffer.getUShort();
				break while_128_;
			} while (false);
			this.aBoolean2558 = buffer.getUByte() == 1;
		} while (false);
	}

	static final Class101_Sub2 method1357(final Buffer buffer) {
		return new Class101_Sub2(buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getMedium(), buffer.getUByte());
	}
}
