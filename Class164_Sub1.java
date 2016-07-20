/* Class164_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class164_Sub1 extends Class164 {
	private boolean aBoolean2824 = false;
	private SourceDataLine aSourceDataLine2825;
	private int anInt2826;
	private AudioFormat anAudioFormat2827;
	private byte[] aByteArray2828;
	static Class aClass2829;

	@Override
	final void method2139() {
		if (aSourceDataLine2825 != null) {
			aSourceDataLine2825.close();
			aSourceDataLine2825 = null;
		}
	}

	@Override
	final void method2134(final int i) throws LineUnavailableException {
		try {
			final DataLine.Info info = new DataLine.Info(aClass2829 == null ? (aClass2829 = method2148("javax.sound.sampled.SourceDataLine")) : aClass2829, anAudioFormat2827, i << (Class90.aBoolean846 ? 2 : 1));
			aSourceDataLine2825 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine2825.open();
			aSourceDataLine2825.start();
			anInt2826 = i;
		} catch (final LineUnavailableException lineunavailableexception) {
			if (Class120_Sub12_Sub3.method1210(i) != 1) {
				method2134(Class120_Sub12_Sub17.farthestBitValue(i));
			} else {
				aSourceDataLine2825 = null;
				throw lineunavailableexception;
			}
		}
	}

	@Override
	final int method2137() {
		return anInt2826 - (aSourceDataLine2825.available() >> (Class90.aBoolean846 ? 2 : 1));
	}

	@Override
	final void method2146() throws LineUnavailableException {
		aSourceDataLine2825.flush();
		if (aBoolean2824) {
			aSourceDataLine2825.close();
			aSourceDataLine2825 = null;
			final DataLine.Info info = new DataLine.Info(aClass2829 == null ? (aClass2829 = method2148("javax.sound.sampled.SourceDataLine")) : aClass2829, anAudioFormat2827, anInt2826 << (Class90.aBoolean846 ? 2 : 1));
			aSourceDataLine2825 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine2825.open();
			aSourceDataLine2825.start();
		}
	}

	@Override
	final void method2141(final Component component) {
		final Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			final Mixer.Info[] infos_0_ = infos;
			Mixer.Info[] infos_1_;
			final int i = (infos_1_ = infos_0_).length;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				final Mixer.Info info = infos_1_[i_2_];
				if (info != null) {
					final String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0) {
						aBoolean2824 = true;
					}
				}
			}
		}
		anAudioFormat2827 = new AudioFormat(Class178.anInt1771, 16, Class90.aBoolean846 ? 2 : 1, true, false);
		aByteArray2828 = new byte[256 << (!Class90.aBoolean846 ? 1 : 2)];
	}

	@Override
	final void method2140() {
		int i = 256;
		if (Class90.aBoolean846) {
			i <<= 1;
		}
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = this.anIntArray1587[i_3_];
			if ((i_4_ + 8388608 & ~0xffffff) != 0) {
				i_4_ = 0x7fffff ^ i_4_ >> 31;
			}
			aByteArray2828[i_3_ * 2] = (byte) (i_4_ >> 8);
			aByteArray2828[i_3_ * 2 + 1] = (byte) (i_4_ >> 16);
		}
		aSourceDataLine2825.write(aByteArray2828, 0, i << 1);
	}

	static Class method2148(final String string) {
		Class var_class = null;
		try {
			var_class = Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			try {
				throw new NoClassDefFoundError().initCause(classnotfoundexception);
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
			}
		}
		return var_class;
	}
}
