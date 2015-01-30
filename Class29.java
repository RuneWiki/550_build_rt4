/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
	int anInt187;
	int anInt188 = -1;
	int anInt189;
	int anInt190;
	int anInt191;
	int anInt192;
	int anInt193;
	int anInt194 = -1;
	static int anInt195 = 0;
	static String aString196;
	int anInt197 = 0;
	int anInt198 = -1;
	static int[] anIntArray199 = { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int anInt200;
	int anInt201;
	int anInt202;
	int anInt203;
	int anInt204;
	int anInt205;
	int anInt206;
	int anInt207;
	int anInt208;
	int anInt209 = 0;
	int anInt210;
	int anInt211;
	int anInt212;
	int anInt213;
	int anInt214;
	int[][] anIntArrayArray215;
	int anInt216;
	static String aString217;
	int anInt218;
	int anInt219;
	int anInt220;
	int anInt221;
	int anInt222;
	int anInt223;

	static {
		aString196 = " ";
		aString217 = "Loading title screen - ";
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final String[] splitString(final String string, final char c) {
		final int charCount = Class8.getCharCount(string, c);
		final String[] results = new String[charCount + 1];
		int resultsPos = 0;
		int beginIndex = 0;
		for (int charIndex = 0; charIndex < charCount; charIndex++) {
			int endIndex;
			for (endIndex = beginIndex; c != string.charAt(endIndex); endIndex++) {
				/* empty */
			}
			results[resultsPos++] = string.substring(beginIndex, endIndex);
			beginIndex = endIndex + 1;
		}
		results[charCount] = string.substring(beginIndex);
		return results;
	}

	static final void method250(final int i, final int i_7_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(12, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_7_;
	}

	static final float[] method251() {
		final float colorMod = AtmosphereManager.getLightingModelAmbient() + AtmosphereManager.getLight0Diffuse();
		final int screenRgb = AtmosphereManager.getScreenColorRgb();
		final float red = (screenRgb >> 16 & 0xff) / 255.0F;
		final float green = (screenRgb >> 8 & 0xff) / 255.0F;
		final float blue = (screenRgb & 0xff) / 255.0F;
		NodeSub.aFloatArray2583[0] = Class120_Sub15.aFloatArray2596[0] * red * 0.58823526F * colorMod;
		NodeSub.aFloatArray2583[1] = Class120_Sub15.aFloatArray2596[1] * green * 0.58823526F * colorMod;
		NodeSub.aFloatArray2583[2] = Class120_Sub15.aFloatArray2596[2] * blue * 0.58823526F * colorMod;
		NodeSub.aFloatArray2583[3] = 1.0F;
		return NodeSub.aFloatArray2583;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.anInt218 = buffer.getUShort();
			this.anInt205 = buffer.getUShort();
			if (this.anInt218 == 65535) {
				this.anInt218 = -1;
			}
			if (this.anInt205 == 65535) {
				this.anInt205 = -1;
			}
		} else if (code == 2) {
			this.anInt212 = buffer.getUShort();
		} else if (code == 3) {
			this.anInt192 = buffer.getUShort();
		} else if (code == 4) {
			this.anInt210 = buffer.getUShort();
		} else if (code != 5) {
			if (code == 6) {
				this.anInt190 = buffer.getUShort();
			} else if (code == 7) {
				this.anInt188 = buffer.getUShort();
			} else if (code == 8) {
				this.anInt223 = buffer.getUShort();
			} else if (code == 9) {
				this.anInt216 = buffer.getUShort();
			} else if (code != 26) {
				if (code == 27) {
					if (this.anIntArrayArray215 == null) {
						this.anIntArrayArray215 = new int[12][];
					}
					final int i_15_ = buffer.getUByte();
					this.anIntArrayArray215[i_15_] = new int[6];
					for (int i_16_ = 0; i_16_ < 6; i_16_++) {
						this.anIntArrayArray215[i_15_][i_16_] = buffer.getShort();
					}
				} else if (code == 29) {
					this.anInt189 = buffer.getUByte();
				} else if (code == 30) {
					this.anInt220 = buffer.getUShort();
				} else if (code == 31) {
					this.anInt214 = buffer.getUByte();
				} else if (code == 32) {
					this.anInt197 = buffer.getUShort();
				} else if (code != 33) {
					if (code == 34) {
						this.anInt221 = buffer.getUByte();
					} else if (code == 35) {
						this.anInt207 = buffer.getUShort();
					} else if (code == 36) {
						this.anInt209 = buffer.getShort();
					} else if (code != 37) {
						if (code != 38) {
							if (code == 39) {
								this.anInt191 = buffer.getUShort();
							} else if (code == 40) {
								this.anInt187 = buffer.getUShort();
							} else if (code == 41) {
								this.anInt213 = buffer.getUShort();
							} else if (code != 42) {
								if (code != 43) {
									if (code == 44) {
										buffer.getUShort();
									} else if (code != 45) {
										if (code == 46) {
											this.anInt203 = buffer.getUShort();
										} else if (code != 47) {
											if (code != 48) {
												if (code == 49) {
													this.anInt211 = buffer.getUShort();
												} else if (code != 50) {
													if (code == 51) {
														this.anInt222 = buffer.getUShort();
													}
												} else {
													this.anInt202 = buffer.getUShort();
												}
											} else {
												this.anInt194 = buffer.getUShort();
											}
										} else {
											this.anInt198 = buffer.getUShort();
										}
									} else {
										buffer.getUShort();
									}
								} else {
									buffer.getUShort();
								}
							} else {
								this.anInt200 = buffer.getUShort();
							}
						} else {
							this.anInt193 = buffer.getUShort();
						}
					} else {
						this.anInt201 = buffer.getUByte();
					}
				} else {
					this.anInt208 = buffer.getShort();
				}
			} else {
				this.anInt204 = (short) (buffer.getUByte() * 4);
				this.anInt206 = (short) (buffer.getUByte() * 4);
			}
		} else {
			this.anInt219 = buffer.getUShort();
		}
	}

	final void postDecode() {
	}

	static final Class29 list(final int id) {
		Class29 class29 = (Class29) Class120_Sub12_Sub31.aClass21_3378.get(id);
		if (class29 != null) {
			return class29;
		}
		final byte[] data = CanvasWrapper.aClass50_18.getFile(32, id);
		class29 = new Class29();
		if (data != null) {
			class29.decode(new Buffer(data));
		}
		class29.postDecode();
		Class120_Sub12_Sub31.aClass21_3378.put(class29, id);
		return class29;
	}

	static final void method254(final int i_17_, final int i_18_, final int i_19_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(11, i_17_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_18_;
		class120_sub14_sub7.anInt3492 = i_19_;
	}

	static final long method255() {
		return Class101_Sub2.gameShellTimer.method739();
	}

	public static void method256() {
		anIntArray199 = null;
		aString217 = null;
		aString196 = null;
	}

	public Class29() {
		this.anInt203 = -1;
		this.anInt211 = -1;
		this.anInt212 = -1;
		this.anInt201 = -1;
		this.anInt204 = 0;
		this.anInt213 = -1;
		this.anInt189 = 0;
		this.anInt207 = 0;
		this.anInt202 = -1;
		this.anInt205 = -1;
		this.anInt206 = 0;
		this.anInt210 = -1;
		this.anInt187 = -1;
		this.anInt208 = 0;
		this.anInt192 = -1;
		this.anInt200 = -1;
		this.anInt216 = -1;
		this.anInt219 = -1;
		this.anInt218 = -1;
		this.anInt222 = -1;
		this.anInt191 = -1;
		this.anInt193 = -1;
		this.anInt190 = -1;
		this.anInt214 = 0;
		this.anInt220 = 0;
		this.anInt223 = -1;
		this.anInt221 = 0;
	}
}
