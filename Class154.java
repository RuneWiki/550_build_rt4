/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
	static Class32[] aClass32Array1437 = new Class32[8];
	static ObjectCache aClass21_1438;
	static boolean aBoolean1439 = false;
	static int anInt1440;
	static int anInt1441;
	static int anInt1442;
	
	static {
		aClass21_1438 = new ObjectCache(32);
		anInt1441 = 0;
		anInt1440 = 0;
		anInt1442 = 0;
	}

	static final void addIgnore(final long nameAsLong) {
		if (nameAsLong != 0L) {
			if (Class120_Sub12_Sub26.ignoreCount >= 100) {
				AbstractRequest.method1540("", 0, Class143_Sub1.aString2192);
			} else {
				final String name = Class136.longToString(nameAsLong);
				for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
					if (HintIcon.ignoreNamesAsLong[id] == nameAsLong) {
						AbstractRequest.method1540("", 0, new StringBuilder(name).append(Class69_Sub2_Sub1.aString3078).toString());
						return;
					}
				}
				for (int id = 0; id < ProducingGraphicsBuffer.friendCount; id++) {
					if (AbstractSprite.friendsNameAsLong[id] == nameAsLong) {
						AbstractRequest.method1540("", 0, new StringBuilder(Class120_Sub12_Sub25.aString3319).append(name).append(Class54.aString489).toString());
						return;
					}
				}
				if (name.equals(TileParticleQueue.selfPlayer.name)) {
					AbstractRequest.method1540("", 0, Class112.aString1079);
				} else {
					HintIcon.ignoreNamesAsLong[Class120_Sub12_Sub26.ignoreCount] = nameAsLong;
					GZIPDecompressor.ignoreNames[Class120_Sub12_Sub26.ignoreCount] = Class174.longToString(nameAsLong);
					SpotAnimationNode.aBooleanArray3468[Class120_Sub12_Sub26.ignoreCount++] = false;
					Class61.anInt563 = GrandExchangeObject.anInt1494;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(197);
					Class120_Sub12_Sub11.outputStream.putLong(nameAsLong);
				}
			}
		}
	}

	static final void method2079(int x, int y, int width, int height, final boolean bool) {
		if (width < 1) {
			width = 1;
		}
		if (height < 1) {
			height = 1;
		}
		if (HDToolkit.glEnabled) {
			int i_6_ = height - 334;
			if (i_6_ < 0) {
				i_6_ = 0;
			} else if (i_6_ > 100) {
				i_6_ = 100;
			}
			int i_7_ = Class169.aShort1651 + (Class120_Sub14_Sub13.aShort3570 - Class169.aShort1651) * i_6_ / 100;
			if (Class120_Sub12_Sub16.aShort3250 <= i_7_) {
				if (i_7_ > FileSystemRequest.aShort3932) {
					i_7_ = FileSystemRequest.aShort3932;
				}
			} else {
				i_7_ = Class120_Sub12_Sub16.aShort3250;
			}
			int i_8_ = 512 * height * i_7_ / (width * 334);
			if (i_8_ < RuntimeException_Sub1.aShort2143) {
				i_8_ = RuntimeException_Sub1.aShort2143;
				i_7_ = width * i_8_ * 334 / (512 * height);
				if (i_7_ > FileSystemRequest.aShort3932) {
					i_7_ = FileSystemRequest.aShort3932;
					final int i_9_ = height * i_7_ * 512 / (334 * i_8_);
					final int i_10_ = (width - i_9_) / 2;
					if (bool) {
						GraphicsHD.method597();
						GraphicsHD.fillRect(x, y, i_10_, height, 0);
						GraphicsHD.fillRect(x + width - i_10_, y, i_10_, height, 0);
					}
					width -= i_10_ * 2;
					x += i_10_;
				}
			} else if (i_8_ > GameShell.aShort2) {
				i_8_ = GameShell.aShort2;
				i_7_ = i_8_ * width * 334 / (height * 512);
				if (i_7_ < Class120_Sub12_Sub16.aShort3250) {
					i_7_ = Class120_Sub12_Sub16.aShort3250;
					final int i_11_ = 334 * width * i_8_ / (512 * i_7_);
					final int i_12_ = (height - i_11_) / 2;
					if (bool) {
						GraphicsHD.method597();
						GraphicsHD.fillRect(x, y, width, i_12_, 0);
						GraphicsHD.fillRect(x, -i_12_ + y - -height, width, i_12_, 0);
					}
					height -= i_12_ * 2;
					y += i_12_;
				}
			}
			Class179.anInt1775 = height * i_7_ / 334;
		}
		ObjectContainer.anInt2612 = x;
		ReflectionCheckNode.anInt2751 = y;
		Class120_Sub12_Sub27.anInt3339 = (short) width;
		Light.anInt391 = (short) height;
	}
}
