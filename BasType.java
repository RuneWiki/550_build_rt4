/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class BasType {
	int turnAnimation1;
	int runAnimationId2 = -1;
	int anInt189;
	int runAnimationId;
	int anInt191;
	int anInt192;
	int anInt193;
	int anInt194 = -1;
	int anInt197 = 0;
	int anInt198 = -1;
	static int[] anIntArray199 = { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int turnAnimation2;
	int anInt201;
	int anInt202;
	int anInt203;
	int anInt204;
	int walkAnimation;
	int anInt206;
	int anInt207;
	int anInt208;
	int anInt209 = 0;
	int anInt210;
	int anInt211;
	int anInt212;
	int turnAnimation3;
	int anInt214;
	int[][] modelRotateTranslate;
	int runAnimationId4;
	int idleAnimationId;
	int anInt219;
	int anInt220;
	int anInt221;
	int anInt222;
	int runAnimationId3;
	static js5 aClass50_18;
	static ObjectCache recentUse = new ObjectCache(64);

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
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(12, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_7_;
	}

	static final float[] method251() {
		final float colorMod = AtmosphereManager.getLightingModelAmbient() + AtmosphereManager.getLight0Diffuse();
		final int screenRgb = AtmosphereManager.getLightColor();
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
			this.idleAnimationId = buffer.getUShort();
			this.walkAnimation = buffer.getUShort();
			if (this.idleAnimationId == 65535) {
				this.idleAnimationId = -1;
			}
			if (this.walkAnimation == 65535) {
				this.walkAnimation = -1;
			}
		} else if (code == 2) {
			this.anInt212 = buffer.getUShort();
		} else if (code == 3) {
			this.anInt192 = buffer.getUShort();
		} else if (code == 4) {
			this.anInt210 = buffer.getUShort();
		} else if (code == 5) {
			this.anInt219 = buffer.getUShort();
		} else if (code == 6) {
			this.runAnimationId = buffer.getUShort();
		} else if (code == 7) {
			this.runAnimationId2 = buffer.getUShort();
		} else if (code == 8) {
			this.runAnimationId3 = buffer.getUShort();
		} else if (code == 9) {
			this.runAnimationId4 = buffer.getUShort();
		} else if (code != 26) {
			if (code == 27) {
				if (this.modelRotateTranslate == null) {
					this.modelRotateTranslate = new int[12][];
				}
				final int bodyId = buffer.getUByte();
				this.modelRotateTranslate[bodyId] = new int[6];
				for (int type = 0; type < 6; type++) {
					//0 rot x
					//1 rot y
					//2 rot z
					//3 translate x
					//4 translate y
					//5 translate z
					this.modelRotateTranslate[bodyId][type] = buffer.getShort();
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
							this.turnAnimation1 = buffer.getUShort();
						} else if (code == 41) {
							this.turnAnimation3 = buffer.getUShort();
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
							this.turnAnimation2 = buffer.getUShort();
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
	}
	
	static final void setup(final js5 js5) {
		aClass50_18 = js5;
	}

	final void postDecode() {
	}

	static final BasType list(final int id) {
		BasType basType = (BasType) recentUse.get(id);
		if (basType != null) {
			return basType;
		}
		final byte[] data = aClass50_18.getFile(32, id);
		basType = new BasType();
		if (data != null) {
			basType.decode(new Buffer(data));
		}
		basType.postDecode();
		recentUse.put(basType, id);
		return basType;
	}

	static final void method254(final int i_17_, final int i_18_, final int i_19_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(11, i_17_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_18_;
		class120_sub14_sub7.anInt3492 = i_19_;
	}

	static final long method255() {
		return Class101_Sub2.gameShellTimer.getAverageExecuteTime();
	}

	public BasType() {
		this.anInt203 = -1;
		this.anInt211 = -1;
		this.anInt212 = -1;
		this.anInt201 = -1;
		this.anInt204 = 0;
		this.turnAnimation3 = -1;
		this.anInt189 = 0;
		this.anInt207 = 0;
		this.anInt202 = -1;
		this.walkAnimation = -1;
		this.anInt206 = 0;
		this.anInt210 = -1;
		this.turnAnimation1 = -1;
		this.anInt208 = 0;
		this.anInt192 = -1;
		this.turnAnimation2 = -1;
		this.runAnimationId4 = -1;
		this.anInt219 = -1;
		this.idleAnimationId = -1;
		this.anInt222 = -1;
		this.anInt191 = -1;
		this.anInt193 = -1;
		this.runAnimationId = -1;
		this.anInt214 = 0;
		this.anInt220 = 0;
		this.runAnimationId3 = -1;
		this.anInt221 = 0;
	}
}
