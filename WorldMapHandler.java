/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class WorldMapHandler {
	private static Hashtable aClass75_688 = new Hashtable(16);
	static js5 aClass50_689;
	static Queue mapFunctionsQueue;
	static Class120_Sub14_Sub22 aClass120_Sub14_Sub22_691;
	static int mapSizeY;
	static MapFunctionGroup aClass137_693;
	static int anInt694;
	static int anInt695;
	static float currentZoom;
	static float wantedZoom;
	static int mapSizeX;
	static int anInt701;
	static int[][][] mapscenesLoc;
	static byte[][][] aByteArrayArrayArray703;
	static int anInt704;
	static int anInt705;
	static byte[][][] aByteArrayArrayArray706;
	static byte[][][] wallsLoc;
	static int anInt708;
	static int anInt709;
	static byte[][][] aByteArrayArrayArray710;
	static byte[][][] aByteArrayArrayArray711;
	static int anInt712;
	static int[][][] underlayColors;
	static int anInt714;
	static int[] overlayColors;
	static int anInt716;

	static {
		mapFunctionsQueue = new Queue();
	}

	static final void method675(final js5 js5) {
		aClass50_689 = js5;
		aClass75_688.clear();
		final int i = aClass50_689.getGroupId("details");
		final int[] is = aClass50_689.getFileIds(i);
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			final int i_3_ = is[i_2_];
			aClass75_688.put(Class55.method485(new Buffer(aClass50_689.getFile(i, i_3_)), i_3_), i_3_);
		}
	}

	static final Class120_Sub14_Sub22 method676(final int i, final int i_4_) {
		for (Class120_Sub14_Sub22 class120_sub14_sub22 = (Class120_Sub14_Sub22) aClass75_688.getFirst(); class120_sub14_sub22 != null; class120_sub14_sub22 = (Class120_Sub14_Sub22) aClass75_688.getNext()) {
			if (class120_sub14_sub22.aBoolean3638 && class120_sub14_sub22.method1631(i, i_4_)) {
				return class120_sub14_sub22;
			}
		}
		return null;
	}

	static final Queue method677(final int i, final int i_5_) {
		final Queue queue = new Queue();
		for (Class120_Sub14_Sub22 class120_sub14_sub22 = (Class120_Sub14_Sub22) aClass75_688.getFirst(); class120_sub14_sub22 != null; class120_sub14_sub22 = (Class120_Sub14_Sub22) aClass75_688.getNext()) {
			if (class120_sub14_sub22.aBoolean3638 && class120_sub14_sub22.method1631(i, i_5_)) {
				queue.insertLast(class120_sub14_sub22);
			}
		}
		return queue;
	}

	private static final void method678(final int i, final int i_6_, final int i_7_, final int i_8_) {
		int i_9_ = anInt714 - anInt716;
		int i_10_ = anInt701 - anInt704;
		if (anInt714 < mapSizeX) {
			i_9_++;
		}
		if (anInt701 < mapSizeY) {
			i_10_++;
		}
		for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			int i_12_ = i_7_ + i * i_11_ >> 16;
			int i_13_ = i_7_ + i * (i_11_ + 1) >> 16;
			final int i_14_ = i_13_ - i_12_;
			if (i_14_ > 0) {
				final int i_15_ = i_11_ + anInt716 >> 6;
				if (i_15_ < 0 || i_15_ > underlayColors.length - 1) {
					i_12_ += anInt708;
					i_13_ += anInt708;
					for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
						final int i_17_ = (i_8_ + i_6_ * i_16_ >> 16) + anInt705;
						final int i_18_ = (i_8_ + i_6_ * (i_16_ + 1) >> 16) + anInt705;
						final int i_19_ = i_18_ - i_17_;
						int i_20_;
						if (aClass120_Sub14_Sub22_691.backgroundColor != -1) {
							i_20_ = aClass120_Sub14_Sub22_691.backgroundColor;
						} else if ((i_11_ + anInt716 & 0x4) != (i_16_ + anInt704 & 0x4)) {
							i_20_ = 4936552;
						} else {
							i_20_ = overlayColors[client.anInt137 + 1];
						}
						if (i_20_ == 0) {
							i_20_ = 1;
						}
						GraphicsLD.fillRect(i_12_, i_17_, i_14_, i_19_, i_20_);
					}
				} else {
					final int[][] is = underlayColors[i_15_];
					final byte[][] is_21_ = aByteArrayArrayArray711[i_15_];
					final byte[][] is_22_ = aByteArrayArrayArray710[i_15_];
					final byte[][] is_23_ = aByteArrayArrayArray703[i_15_];
					final byte[][] is_24_ = aByteArrayArrayArray706[i_15_];
					final byte[][] is_25_ = wallsLoc[i_15_];
					i_12_ += anInt708;
					i_13_ += anInt708;
					for (int i_26_ = 0; i_26_ < i_10_; i_26_++) {
						int i_27_ = i_8_ + i_6_ * i_26_ >> 16;
						int i_28_ = i_8_ + i_6_ * (i_26_ + 1) >> 16;
						final int i_29_ = i_28_ - i_27_;
						if (i_29_ > 0) {
							i_27_ += anInt705;
							i_28_ += anInt705;
							final int i_30_ = i_26_ + anInt704 >> 6;
							final int i_31_ = i_26_ + anInt704 & 0x3f;
							final int i_32_ = i_11_ + anInt716 & 0x3f;
							final int i_33_ = (i_31_ << 6) + i_32_;
							int i_34_;
							if (i_30_ < 0 || i_30_ > is.length - 1 || is[i_30_] == null) {
								if (aClass120_Sub14_Sub22_691.backgroundColor != -1) {
									i_34_ = aClass120_Sub14_Sub22_691.backgroundColor;
								} else if ((i_11_ + anInt716 & 0x4) != (i_26_ + anInt704 & 0x4)) {
									i_34_ = 4936552;
								} else {
									i_34_ = overlayColors[client.anInt137 + 1];
								}
								if (i_30_ < 0 || i_30_ > is.length - 1) {
									if (i_34_ == 0) {
										i_34_ = 1;
									}
									GraphicsLD.fillRect(i_12_, i_27_, i_14_, i_29_, i_34_);
									continue;
								}
							} else {
								i_34_ = is[i_30_][i_33_];
							}
							if (i_34_ == 0) {
								i_34_ = 1;
							}
							int i_35_ = is_21_[i_30_] == null ? 0 : overlayColors[is_21_[i_30_][i_33_] & 0xff];
							int i_36_ = is_23_[i_30_] == null ? 0 : overlayColors[is_23_[i_30_][i_33_] & 0xff];
							if (i_35_ == 0 && i_36_ == 0) {
								GraphicsLD.fillRect(i_12_, i_27_, i_14_, i_29_, i_34_);
							} else {
								if (i_35_ != 0) {
									if (i_35_ == -1) {
										i_35_ = 1;
									}
									final int i_37_ = is_22_[i_30_] == null ? (int) 0 : is_22_[i_30_][i_33_];
									final int i_38_ = i_37_ & 0xfc;
									if (i_38_ == 0 || i_14_ <= 1 || i_29_ <= 1) {
										GraphicsLD.fillRect(i_12_, i_27_, i_14_, i_29_, i_35_);
									} else {
										method691(GraphicsLD.pixels, i_12_, i_27_, i_34_, i_35_, i_14_, i_29_, i_38_ >> 2, i_37_ & 0x3, true);
									}
								}
								if (i_36_ != 0) {
									if (i_36_ == -1) {
										i_36_ = i_34_;
									}
									final int i_39_ = is_24_[i_30_][i_33_];
									final int i_40_ = i_39_ & 0xfc;
									if (i_40_ == 0 || i_14_ <= 1 || i_29_ <= 1) {
										GraphicsLD.fillRect(i_12_, i_27_, i_14_, i_29_, i_36_);
									}
									method691(GraphicsLD.pixels, i_12_, i_27_, 0, i_36_, i_14_, i_29_, i_40_ >> 2, i_39_ & 0x3, i_35_ == 0);
								}
							}
							if (is_25_[i_30_] != null) {
								int i_41_ = is_25_[i_30_][i_33_] & 0xff;
								if (i_41_ != 0) {
									int i_42_;
									if (i_14_ == 1) {
										i_42_ = i_12_;
									} else {
										i_42_ = i_13_ - 1;
									}
									int i_43_;
									if (i_29_ == 1) {
										i_43_ = i_27_;
									} else {
										i_43_ = i_28_ - 1;
									}
									int i_44_ = 13421772;
									if (i_41_ >= 5 && i_41_ <= 8 || i_41_ >= 13 && i_41_ <= 16 || i_41_ >= 21 && i_41_ <= 24 || i_41_ == 27 || i_41_ == 28) {
										i_44_ = 13369344;
										i_41_ -= 4;
									}//Draw lines here
									if (i_41_ == 1) {
										GraphicsLD.drawVerticalLine(i_12_, i_27_, i_29_, i_44_);
									} else if (i_41_ == 2) {
										GraphicsLD.drawHorizontalLine(i_12_, i_27_, i_14_, i_44_);
									} else if (i_41_ == 3) {
										GraphicsLD.drawVerticalLine(i_42_, i_27_, i_29_, i_44_);
									} else if (i_41_ == 4) {
										GraphicsLD.drawHorizontalLine(i_12_, i_43_, i_14_, i_44_);
									} else if (i_41_ == 9) {
										GraphicsLD.drawVerticalLine(i_12_, i_27_, i_29_, 16777215);
										GraphicsLD.drawHorizontalLine(i_12_, i_27_, i_14_, i_44_);
									} else if (i_41_ == 10) {
										GraphicsLD.drawVerticalLine(i_42_, i_27_, i_29_, 16777215);
										GraphicsLD.drawHorizontalLine(i_12_, i_27_, i_14_, i_44_);
									} else if (i_41_ == 11) {
										GraphicsLD.drawVerticalLine(i_42_, i_27_, i_29_, 16777215);
										GraphicsLD.drawHorizontalLine(i_12_, i_43_, i_14_, i_44_);
									} else if (i_41_ == 12) {
										GraphicsLD.drawVerticalLine(i_12_, i_27_, i_29_, 16777215);
										GraphicsLD.drawHorizontalLine(i_12_, i_43_, i_14_, i_44_);
									} else if (i_41_ == 17) {
										GraphicsLD.drawHorizontalLine(i_12_, i_27_, 1, i_44_);
									} else if (i_41_ == 18) {
										GraphicsLD.drawHorizontalLine(i_42_, i_27_, 1, i_44_);
									} else if (i_41_ == 19) {
										GraphicsLD.drawHorizontalLine(i_42_, i_43_, 1, i_44_);
									} else if (i_41_ == 20) {
										GraphicsLD.drawHorizontalLine(i_12_, i_43_, 1, i_44_);
									} else if (i_41_ == 25) {
										for (int i_45_ = 0; i_45_ < i_29_; i_45_++) {
											GraphicsLD.drawHorizontalLine(i_12_ + i_45_, i_43_ - i_45_, 1, i_44_);
										}
									} else if (i_41_ == 26) {
										for (int i_46_ = 0; i_46_ < i_29_; i_46_++) {
											GraphicsLD.drawHorizontalLine(i_12_ + i_46_, i_27_ + i_46_, 1, i_44_);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_47_ = -2; i_47_ < i_9_ + 2; i_47_++) {
			int i_48_ = i_7_ + i * i_47_ >> 16;
			int i_49_ = i_7_ + i * (i_47_ + 1) >> 16;
			final int i_50_ = i_49_ - i_48_;
			if (i_50_ > 0) {
				i_48_ += anInt708;
				i_49_ += anInt708;
				final int i_51_ = i_47_ + anInt716 >> 6;
				if (i_51_ >= 0 && i_51_ <= mapscenesLoc.length - 1) {
					final int[][] is = mapscenesLoc[i_51_];
					for (int i_52_ = -2; i_52_ < i_10_ + 2; i_52_++) {
						int i_53_ = i_8_ + i_6_ * i_52_ >> 16;
						int i_54_ = i_8_ + i_6_ * (i_52_ + 1) >> 16;
						final int i_55_ = i_54_ - i_53_;
						if (i_55_ > 0) {
							i_53_ += anInt705;
							i_54_ += anInt705;
							final int i_56_ = i_52_ + anInt704 >> 6;
							if (i_56_ >= 0 && i_56_ <= is.length - 1) {
								final int i_57_ = ((i_52_ + anInt704 & 0x3f) << 6) + (i_47_ + anInt716 & 0x3f);
								if (is[i_56_] != null) {
									final int i_58_ = is[i_56_][i_57_];
									final int i_59_ = i_58_ & 0x1fff;
									if (i_59_ != 0) {
										final MapSceneType class142 = MapSceneType.list(i_59_ - 1);
										int rotation = i_58_ >> 13 & 0x3;
										boolean flipVertical = (i_58_ >> 15 & 0x1) == 1;
										final LDIndexedSprite class107_sub1 = class142.constructSprite(rotation, flipVertical);
										if (class107_sub1 != null) {
											int i_61_ = i_50_ * class107_sub1.width / 4;
											int i_62_ = i_55_ * class107_sub1.height / 4;
											if (class142.enlarge) {
												int i_63_ = i_58_ >> 16 & 0xf;
												int i_64_ = i_58_ >> 20 & 0xf;
												if ((rotation & 0x1) == 1) {
													rotation = i_63_;
													i_63_ = i_64_;
													i_64_ = rotation;
												}
												i_61_ = i_63_ * i_50_;
												i_62_ = i_64_ * i_55_;
											}
											if (i_61_ != 0 && i_62_ != 0) {
												if (class142.anInt1360 != 0) {
													class107_sub1.method919(i_48_, i_53_ - i_62_ + i_55_, i_61_, i_62_, class142.anInt1360);
												} else {
													class107_sub1.method918(i_48_, i_53_ - i_62_ + i_55_, i_61_, i_62_);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final Deque method679() {//mapfunctions
		final int i = anInt714 - anInt716;
		final int i_65_ = anInt701 - anInt704;
		final int i_66_ = (anInt709 - anInt708 << 16) / i;
		final int i_67_ = (anInt712 - anInt705 << 16) / i_65_;
		return method692(i_66_, i_67_, 0, 0);
	}

	static final void decodeOverlay(final Buffer buffer) {
		while (buffer.pos < buffer.buf.length) {
			boolean bool = false;
			int i = 0;
			int i_68_ = 0;
			if (buffer.getUByte() == 1) {
				bool = true;
				i = buffer.getUByte();
				i_68_ = buffer.getUByte();
			}
			final int i_69_ = buffer.getUByte();
			final int i_70_ = buffer.getUByte();
			final int i_71_ = i_69_ * 64 - anInt695;
			final int i_72_ = mapSizeY - 1 - (i_70_ * 64 - anInt694);
			if (i_71_ >= 0 && i_72_ - 63 >= 0 && i_71_ + 63 < mapSizeX && i_72_ < mapSizeY) {
				final int i_73_ = i_71_ >> 6;
				final int i_74_ = i_72_ >> 6;
				for (int i_75_ = 0; i_75_ < 64; i_75_++) {
					for (int i_76_ = 0; i_76_ < 64; i_76_++) {
						if (!bool || i_75_ >= i * 8 && i_75_ < i * 8 + 8 && i_76_ >= i_68_ * 8 && i_76_ < i_68_ * 8 + 8) {
							final byte i_77_ = buffer.getByte();
							if (i_77_ != 0) {
								if (aByteArrayArrayArray711[i_73_][i_74_] == null) {
									aByteArrayArrayArray711[i_73_][i_74_] = new byte[4096];
								}
								aByteArrayArrayArray711[i_73_][i_74_][(63 - i_76_ << 6) + i_75_] = i_77_;
								final byte i_78_ = buffer.getByte();
								if (aByteArrayArrayArray710[i_73_][i_74_] == null) {
									aByteArrayArrayArray710[i_73_][i_74_] = new byte[4096];
								}
								aByteArrayArrayArray710[i_73_][i_74_][(63 - i_76_ << 6) + i_75_] = i_78_;
							}
						}
					}
				}
			} else {
				for (int i_79_ = 0; i_79_ < (bool ? 64 : 4096); i_79_++) {
					final byte i_80_ = buffer.getByte();
					if (i_80_ != 0) {
						buffer.pos++;
					}
				}
			}
		}
	}

	static final void method682() {
		for (int i = 0; i < aClass137_693.length; i++) {
			if (aClass137_693.nodes[i] != null) {
				mapFunctionsQueue.insertLast(aClass137_693.nodes[i]);
			}
		}
	}

	static final void method683(final int i, final int i_81_, final int mapSizeX, final int mapSizeY, final int offX, final int offY, final int width, final int height) {
		anInt716 = i;
		anInt704 = i_81_;
		anInt714 = mapSizeX;
		anInt701 = mapSizeY;
		anInt708 = offX;
		anInt705 = offY;
		anInt709 = width;
		anInt712 = height;
	}

	static final void method684(final int i) {
		aClass120_Sub14_Sub22_691 = (Class120_Sub14_Sub22) aClass75_688.get(i);
	}

	static final void method685() {
		final int i = anInt714 - anInt716;
		final int i_88_ = anInt701 - anInt704;
		final int i_89_ = (anInt709 - anInt708 << 16) / i;
		final int i_90_ = (anInt712 - anInt705 << 16) / i_88_;
		method678(i_89_, i_90_, 0, 0);
	}

	private static final void method686(final MapFunctionNode class120_sub14_sub5, final int i, final int i_91_, final int i_92_, final int i_93_) {
		class120_sub14_sub5.worldMapX = anInt708 + (i_92_ + i * (class120_sub14_sub5.x - anInt716) >> 16);
		class120_sub14_sub5.worldMapY = anInt705 + (i_93_ + i_91_ * (class120_sub14_sub5.z - anInt704) >> 16);
		final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5.id);
		if (class73.unfocusedSpriteId != -1) {
			final AbstractIndexedSprite abstractIndexedSprite = class73.consturctSprite(false, true);
			if (abstractIndexedSprite != null) {
				if (class120_sub14_sub5.worldMapX - (abstractIndexedSprite.width + 1 >> 1) > anInt709 || class120_sub14_sub5.worldMapX + (abstractIndexedSprite.width + 1 >> 1) < anInt708 || class120_sub14_sub5.worldMapY - (abstractIndexedSprite.height + 1 >> 1) > anInt712
						|| class120_sub14_sub5.worldMapY + (abstractIndexedSprite.height + 1 >> 1) < anInt705) {
					class120_sub14_sub5.aBoolean3476 = true;
				} else {
					class120_sub14_sub5.aBoolean3476 = false;
				}
				return;
			}
		}
		if (class120_sub14_sub5.x < anInt716 || class120_sub14_sub5.x > anInt714 || class120_sub14_sub5.z < anInt704 || class120_sub14_sub5.z > anInt701) {
			class120_sub14_sub5.aBoolean3476 = true;
		} else {
			class120_sub14_sub5.aBoolean3476 = false;
		}
	}

	static final Class120_Sub14_Sub22 method687(final int i) {
		return (Class120_Sub14_Sub22) aClass75_688.get(i);
	}

	static final void decodeOverlay2(final Buffer class120_sub7) {
		while (class120_sub7.pos < class120_sub7.buf.length) {
			boolean bool = false;
			int i = 0;
			int i_94_ = 0;
			if (class120_sub7.getUByte() == 1) {
				bool = true;
				i = class120_sub7.getUByte();
				i_94_ = class120_sub7.getUByte();
			}
			final int i_95_ = class120_sub7.getUByte();
			final int i_96_ = class120_sub7.getUByte();
			final int i_97_ = i_95_ * 64 - anInt695;
			final int i_98_ = mapSizeY - 1 - (i_96_ * 64 - anInt694);
			if (i_97_ >= 0 && i_98_ - 63 >= 0 && i_97_ + 63 < mapSizeX && i_98_ < mapSizeY) {
				final int i_99_ = i_97_ >> 6;
				final int i_100_ = i_98_ >> 6;
				for (int i_101_ = 0; i_101_ < 64; i_101_++) {
					for (int i_102_ = 0; i_102_ < 64; i_102_++) {
						if (!bool || i_101_ >= i * 8 && i_101_ < i * 8 + 8 && i_102_ >= i_94_ * 8 && i_102_ < i_94_ * 8 + 8) {
							final byte i_103_ = class120_sub7.getByte();
							if (i_103_ != 0) {
								if (aByteArrayArrayArray703[i_99_][i_100_] == null) {
									aByteArrayArrayArray703[i_99_][i_100_] = new byte[4096];
								}
								aByteArrayArrayArray703[i_99_][i_100_][(63 - i_102_ << 6) + i_101_] = i_103_;
								final byte i_104_ = class120_sub7.getByte();
								if (aByteArrayArrayArray706[i_99_][i_100_] == null) {
									aByteArrayArrayArray706[i_99_][i_100_] = new byte[4096];
								}
								aByteArrayArrayArray706[i_99_][i_100_][(63 - i_102_ << 6) + i_101_] = i_104_;
							}
						}
					}
				}
			} else {
				for (int i_105_ = 0; i_105_ < (bool ? 64 : 4096); i_105_++) {
					final byte i_106_ = class120_sub7.getByte();
					if (i_106_ != 0) {
						class120_sub7.pos++;
					}
				}
			}
		}
	}

	static final void decodeLoc(final Buffer buffer, final boolean membersClient) {
		while (buffer.pos < buffer.buf.length) {
			boolean bool_107_ = false;
			int i = 0;
			int i_108_ = 0;
			if (buffer.getUByte() == 1) {
				bool_107_ = true;
				i = buffer.getUByte();
				i_108_ = buffer.getUByte();
			}
			final int i_109_ = buffer.getUByte();
			final int i_110_ = buffer.getUByte();
			final int i_111_ = i_109_ * 64 - anInt695;
			final int i_112_ = mapSizeY - 1 - (i_110_ * 64 - anInt694);
			if (i_111_ >= 0 && i_112_ - 63 >= 0 && i_111_ + 63 < mapSizeX && i_112_ < mapSizeY) {
				final int x = i_111_ >> 6;
				final int y = i_112_ >> 6;
				for (int i_115_ = 0; i_115_ < 64; i_115_++) {
					for (int i_116_ = 0; i_116_ < 64; i_116_++) {
						if (!bool_107_ || i_115_ >= i * 8 && i_115_ < i * 8 + 8 && i_116_ >= i_108_ * 8 && i_116_ < i_108_ * 8 + 8) {
							final int i_117_ = buffer.getUByte();
							if (i_117_ != 0) {
								if ((i_117_ & 0x1) == 1) {
									final int i_118_ = buffer.getUByte();
									if (wallsLoc[x][y] == null) {
										wallsLoc[x][y] = new byte[4096];
									}
									wallsLoc[x][y][(63 - i_116_ << 6) + i_115_] = (byte) i_118_;
								}
								if ((i_117_ & 0x2) == 2) {
									final int i_119_ = buffer.getMedium();
									if (mapscenesLoc[x][y] == null) {
										mapscenesLoc[x][y] = new int[4096];
									}
									mapscenesLoc[x][y][(63 - i_116_ << 6) + i_115_] = i_119_;
								}
								if ((i_117_ & 0x4) == 4) {
									int locId = buffer.getUShort();
									final int level = buffer.getUByte();
									LocType locType = LocType.list(--locId);
									if (locType.transmogrificationIds != null) {
										locType = locType.handleVarp();
										if (locType == null || locType.mapFunctionId == -1) {
											continue;
										}
									}
									if ((!locType.members || membersClient) && locType.mapFunctionId != -1) {
										final MapFunctionNode mapFunctionNode = new MapFunctionNode();
										mapFunctionNode.id = locType.mapFunctionId;
										mapFunctionNode.level = level;
										mapFunctionNode.x = x * 64 + i_115_;
										mapFunctionNode.z = y * 64 + 64 - i_116_;
										mapFunctionsQueue.insertLast(mapFunctionNode);
									}
								}
							}
						}
					}
				}
			} else {
				for (int i_122_ = 0; i_122_ < (bool_107_ ? 64 : 4096); i_122_++) {
					final int i_123_ = buffer.getUByte();
					if (i_123_ != 0) {
						if ((i_123_ & 0x1) == 1) {
							buffer.pos++;
						}
						if ((i_123_ & 0x2) == 2) {
							buffer.pos += 2;
						}
						if ((i_123_ & 0x4) == 4) {
							buffer.pos += 3;
						}
					}
				}
			}
		}
	}

	static final void setupOverlayColors() {
		for (int id = 0; id < OverlayType.overlayAmount; id++) {
			final OverlayType overlayType = OverlayType.list(id);
			if (overlayType != null) {
				int textureId = overlayType.textureId;
				if (textureId >= 0 && !Rasterizer.anInterface5_973.method15(textureId)) {
					textureId = -1;
				}
				int color;
				if (overlayType.anInt1198 >= 0) {
					color = Rasterizer.palette[Class96.method789(overlayType.anInt1198, 96)];
				} else if (textureId >= 0) {
					color = Rasterizer.palette[Class96.method789(Rasterizer.anInterface5_973.getColorPaletteIndex(textureId), 96)];
				} else if (overlayType.color == -1) {
					color = -1;
				} else {
					color = Rasterizer.palette[Class96.method789(overlayType.color, 96)];
				}
				overlayColors[id + 1] = color;
			}
		}
	}

	private static final void method691(final int[] is, final int i, final int i_134_, final int i_135_, final int i_136_, final int i_137_, final int i_138_, int i_139_, int i_140_, final boolean bool) {
		int i_141_ = i;
		if (i_141_ < GraphicsLD.endX) {
			if (i_141_ < GraphicsLD.startX) {
				i_141_ = GraphicsLD.startX;
			}
			int i_142_ = i + i_137_;
			if (i_142_ > GraphicsLD.startX) {
				if (i_142_ > GraphicsLD.endX) {
					i_142_ = GraphicsLD.endX;
				}
				int i_143_ = i_134_;
				if (i_143_ < GraphicsLD.endY) {
					if (i_143_ < GraphicsLD.startY) {
						i_143_ = GraphicsLD.startY;
					}
					int i_144_ = i_134_ + i_138_;
					if (i_144_ > GraphicsLD.startY) {
						if (i_144_ > GraphicsLD.endY) {
							i_144_ = GraphicsLD.endY;
						}
						int i_145_ = i_143_ * GraphicsLD.width + i_141_;
						final int i_146_ = GraphicsLD.width + i_141_ - i_142_;
						i_141_ -= i;
						i_142_ -= i;
						i_143_ -= i_134_;
						i_144_ -= i_134_;
						final int i_147_ = i_137_ - i_142_;
						final int i_148_ = i_137_ - i_141_;
						final int i_149_ = i_138_ - i_144_;
						final int i_150_ = i_138_ - i_143_;
						if (i_139_ == 9) {
							i_139_ = 1;
							i_140_ = i_140_ + 1 & 0x3;
						}
						if (i_139_ == 10) {
							i_139_ = 1;
							i_140_ = i_140_ + 3 & 0x3;
						}
						if (i_139_ == 11) {
							i_139_ = 8;
							i_140_ = i_140_ + 3 & 0x3;
						}
						if (i_139_ == 1) {
							if (i_140_ == 0) {
								for (int i_151_ = i_143_; i_151_ < i_144_; i_151_++) {
									for (int i_152_ = i_141_; i_152_ < i_142_; i_152_++) {
										if (i_152_ <= i_151_) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 1) {
								for (int i_153_ = i_150_ - 1; i_153_ >= i_149_; i_153_--) {
									for (int i_154_ = i_141_; i_154_ < i_142_; i_154_++) {
										if (i_154_ <= i_153_) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 2) {
								for (int i_155_ = i_143_; i_155_ < i_144_; i_155_++) {
									for (int i_156_ = i_141_; i_156_ < i_142_; i_156_++) {
										if (i_156_ >= i_155_) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 3) {
								for (int i_157_ = i_150_ - 1; i_157_ >= i_149_; i_157_--) {
									for (int i_158_ = i_141_; i_158_ < i_142_; i_158_++) {
										if (i_158_ >= i_157_) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							}
						} else if (i_139_ == 2) {
							if (i_140_ == 0) {
								for (int i_159_ = i_150_ - 1; i_159_ >= i_149_; i_159_--) {
									for (int i_160_ = i_141_; i_160_ < i_142_; i_160_++) {
										if (i_160_ <= i_159_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 1) {
								for (int i_161_ = i_143_; i_161_ < i_144_; i_161_++) {
									for (int i_162_ = i_141_; i_162_ < i_142_; i_162_++) {
										if (i_145_ < 0 || i_145_ >= is.length) {
											i_145_++;
										} else {
											if (i_162_ >= i_161_ << 1) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 2) {
								for (int i_163_ = i_143_; i_163_ < i_144_; i_163_++) {
									for (int i_164_ = i_148_ - 1; i_164_ >= i_147_; i_164_--) {
										if (i_164_ <= i_163_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 3) {
								for (int i_165_ = i_150_ - 1; i_165_ >= i_149_; i_165_--) {
									for (int i_166_ = i_148_ - 1; i_166_ >= i_147_; i_166_--) {
										if (i_166_ >= i_165_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							}
						} else if (i_139_ == 3) {
							if (i_140_ == 0) {
								for (int i_167_ = i_150_ - 1; i_167_ >= i_149_; i_167_--) {
									for (int i_168_ = i_148_ - 1; i_168_ >= i_147_; i_168_--) {
										if (i_168_ <= i_167_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 1) {
								for (int i_169_ = i_150_ - 1; i_169_ >= i_149_; i_169_--) {
									for (int i_170_ = i_141_; i_170_ < i_142_; i_170_++) {
										if (i_170_ >= i_169_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 2) {
								for (int i_171_ = i_143_; i_171_ < i_144_; i_171_++) {
									for (int i_172_ = i_141_; i_172_ < i_142_; i_172_++) {
										if (i_172_ <= i_171_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 3) {
								for (int i_173_ = i_143_; i_173_ < i_144_; i_173_++) {
									for (int i_174_ = i_148_ - 1; i_174_ >= i_147_; i_174_--) {
										if (i_174_ >= i_173_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							}
						} else if (i_139_ == 4) {
							if (i_140_ == 0) {
								for (int i_175_ = i_150_ - 1; i_175_ >= i_149_; i_175_--) {
									for (int i_176_ = i_141_; i_176_ < i_142_; i_176_++) {
										if (i_176_ >= i_175_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 1) {
								for (int i_177_ = i_143_; i_177_ < i_144_; i_177_++) {
									for (int i_178_ = i_141_; i_178_ < i_142_; i_178_++) {
										if (i_178_ <= i_177_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 2) {
								for (int i_179_ = i_143_; i_179_ < i_144_; i_179_++) {
									for (int i_180_ = i_148_ - 1; i_180_ >= i_147_; i_180_--) {
										if (i_180_ >= i_179_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 3) {
								for (int i_181_ = i_150_ - 1; i_181_ >= i_149_; i_181_--) {
									for (int i_182_ = i_148_ - 1; i_182_ >= i_147_; i_182_--) {
										if (i_182_ <= i_181_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							}
						} else if (i_139_ == 5) {
							if (i_140_ == 0) {
								for (int i_183_ = i_150_ - 1; i_183_ >= i_149_; i_183_--) {
									for (int i_184_ = i_148_ - 1; i_184_ >= i_147_; i_184_--) {
										if (i_184_ >= i_183_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 1) {
								for (int i_185_ = i_150_ - 1; i_185_ >= i_149_; i_185_--) {
									for (int i_186_ = i_141_; i_186_ < i_142_; i_186_++) {
										if (i_186_ <= i_185_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 2) {
								for (int i_187_ = i_143_; i_187_ < i_144_; i_187_++) {
									for (int i_188_ = i_141_; i_188_ < i_142_; i_188_++) {
										if (i_188_ >= i_187_ >> 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							} else if (i_140_ == 3) {
								for (int i_189_ = i_143_; i_189_ < i_144_; i_189_++) {
									for (int i_190_ = i_148_ - 1; i_190_ >= i_147_; i_190_--) {
										if (i_190_ <= i_189_ << 1) {
											is[i_145_] = i_136_;
										} else if (bool) {
											is[i_145_] = i_135_;
										}
										i_145_++;
									}
									i_145_ += i_146_;
								}
							}
						} else {
							if (i_139_ == 6) {
								if (i_140_ == 0) {
									for (int i_191_ = i_143_; i_191_ < i_144_; i_191_++) {
										for (int i_192_ = i_141_; i_192_ < i_142_; i_192_++) {
											if (i_192_ <= i_137_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 1) {
									for (int i_193_ = i_143_; i_193_ < i_144_; i_193_++) {
										for (int i_194_ = i_141_; i_194_ < i_142_; i_194_++) {
											if (i_193_ <= i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 2) {
									for (int i_195_ = i_143_; i_195_ < i_144_; i_195_++) {
										for (int i_196_ = i_141_; i_196_ < i_142_; i_196_++) {
											if (i_196_ >= i_137_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 3) {
									for (int i_197_ = i_143_; i_197_ < i_144_; i_197_++) {
										for (int i_198_ = i_141_; i_198_ < i_142_; i_198_++) {
											if (i_197_ >= i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
							}
							if (i_139_ == 7) {
								if (i_140_ == 0) {
									for (int i_199_ = i_143_; i_199_ < i_144_; i_199_++) {
										for (int i_200_ = i_141_; i_200_ < i_142_; i_200_++) {
											if (i_200_ <= i_199_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 1) {
									for (int i_201_ = i_150_ - 1; i_201_ >= i_149_; i_201_--) {
										for (int i_202_ = i_141_; i_202_ < i_142_; i_202_++) {
											if (i_202_ <= i_201_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 2) {
									for (int i_203_ = i_150_ - 1; i_203_ >= i_149_; i_203_--) {
										for (int i_204_ = i_148_ - 1; i_204_ >= i_147_; i_204_--) {
											if (i_204_ <= i_203_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
								if (i_140_ == 3) {
									for (int i_205_ = i_143_; i_205_ < i_144_; i_205_++) {
										for (int i_206_ = i_148_ - 1; i_206_ >= i_147_; i_206_--) {
											if (i_206_ <= i_205_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
									return;
								}
							}
							if (i_139_ == 8) {
								if (i_140_ == 0) {
									for (int i_207_ = i_143_; i_207_ < i_144_; i_207_++) {
										for (int i_208_ = i_141_; i_208_ < i_142_; i_208_++) {
											if (i_208_ >= i_207_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
								} else if (i_140_ == 1) {
									for (int i_209_ = i_150_ - 1; i_209_ >= i_149_; i_209_--) {
										for (int i_210_ = i_141_; i_210_ < i_142_; i_210_++) {
											if (i_210_ >= i_209_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
								} else if (i_140_ == 2) {
									for (int i_211_ = i_150_ - 1; i_211_ >= i_149_; i_211_--) {
										for (int i_212_ = i_148_ - 1; i_212_ >= i_147_; i_212_--) {
											if (i_212_ >= i_211_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
								} else if (i_140_ == 3) {
									for (int i_213_ = i_143_; i_213_ < i_144_; i_213_++) {
										for (int i_214_ = i_148_ - 1; i_214_ >= i_147_; i_214_--) {
											if (i_214_ >= i_213_ - i_138_ / 2) {
												is[i_145_] = i_136_;
											} else if (bool) {
												is[i_145_] = i_135_;
											}
											i_145_++;
										}
										i_145_ += i_146_;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static final Deque method692(final int i, final int i_215_, final int i_216_, final int i_217_) {
		final Deque deque = new Deque();
		for (MapFunctionNode class120_sub14_sub5 = (MapFunctionNode) mapFunctionsQueue.peekFirst(); class120_sub14_sub5 != null; class120_sub14_sub5 = (MapFunctionNode) mapFunctionsQueue.peekNext()) {
			method686(class120_sub14_sub5, i, i_215_, i_216_, i_217_);
			deque.addLast(class120_sub14_sub5);
		}
		final int[] is = new int[3];
		for (int i_218_ = 0; i_218_ < aClass137_693.length; i_218_++) {
			final MapFunctionNode class120_sub14_sub5 = aClass137_693.nodes[i_218_];
			final boolean bool = aClass120_Sub14_Sub22_691.method1630(aClass137_693.coordinates[i_218_] & 0x3fff, aClass137_693.coordinates[i_218_] >> 28 & 0x3, is, aClass137_693.coordinates[i_218_] >> 14 & 0x3fff);
			if (bool) {
				class120_sub14_sub5.x = is[1] - anInt695;
				class120_sub14_sub5.z = mapSizeY - 1 - (is[2] - anInt694);
				method686(class120_sub14_sub5, i, i_215_, i_216_, i_217_);
				deque.addLast(class120_sub14_sub5);
			}
		}
		return deque;
	}

	static final void decodeUnderlay(final Buffer buffer) {
		final byte[][] is = new byte[mapSizeX][mapSizeY];
		while (buffer.buf.length > buffer.pos) {
			boolean bool = false;
			int i_4_ = 0;
			int i_5_ = 0;
			if (buffer.getUByte() == 1) {
				bool = true;
				i_5_ = buffer.getUByte();
				i_4_ = buffer.getUByte();
			}
			final int i_6_ = buffer.getUByte();
			final int i_7_ = buffer.getUByte();
			final int i_8_ = 64 * i_6_ + -anInt695;
			final int i_9_ = -1 + mapSizeY + anInt694 + -(64 * i_7_);
			if (i_8_ < 0 || -63 + i_9_ < 0 || i_8_ + 63 >= mapSizeX || i_9_ >= mapSizeY) {
				if (!bool) {
					buffer.pos += 4096;
				} else {
					buffer.pos += 64;
				}
			} else {
				for (int i_10_ = 0; i_10_ < 64; i_10_++) {
					final byte[] is_11_ = is[i_10_ + i_8_];
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						if (!bool || i_10_ >= 8 * i_5_ && i_10_ < 8 + i_5_ * 8 && i_12_ >= i_4_ * 8 && i_12_ < 8 * i_4_ - -8) {
							is_11_[-i_12_ + i_9_] = buffer.getByte();
						}
					}
				}
			}
		}
		final int i_13_ = mapSizeX;
		final int i_14_ = mapSizeY;
		final int[] is_15_ = new int[i_14_];
		final int[] is_16_ = new int[i_14_];
		final int[] is_17_ = new int[i_14_];
		final int[] is_18_ = new int[i_14_];
		final int[] is_19_ = new int[i_14_];
		for (int i_20_ = -5; i_13_ > i_20_; i_20_++) {
			if ((i_20_ & 0x1ff) == 0) {
				Class120_Sub12_Sub29.ping(true);
			}
			for (int i_21_ = 0; i_14_ > i_21_; i_21_++) {
				final int i_22_ = i_20_ + 5;
				if (i_13_ > i_22_) {
					final int i_23_ = 0xff & is[i_22_][i_21_];
					if (i_23_ > 0) {
						final UnderlayType underlayType = UnderlayType.list(i_23_ - 1);
						is_15_[i_21_] += underlayType.anInt1218;
						is_16_[i_21_] += underlayType.anInt1222;
						is_17_[i_21_] += underlayType.anInt1229;
						is_18_[i_21_] += underlayType.anInt1226;
						is_19_[i_21_]++;
					}
				}
				final int i_24_ = i_20_ - 5;
				if (i_24_ >= 0) {
					final int i_25_ = is[i_24_][i_21_] & 0xff;
					if (i_25_ > 0) {
						final UnderlayType underlayType = UnderlayType.list(i_25_ - 1);
						is_15_[i_21_] -= underlayType.anInt1218;
						is_16_[i_21_] -= underlayType.anInt1222;
						is_17_[i_21_] -= underlayType.anInt1229;
						is_18_[i_21_] -= underlayType.anInt1226;
						is_19_[i_21_]--;
					}
				}
			}
			if (i_20_ >= 0) {
				int i_26_ = 0;
				final int[][] is_27_ = underlayColors[i_20_ >> 6];
				int i_28_ = 0;
				int i_29_ = 0;
				int i_30_ = 0;
				int i_31_ = 0;
				for (int i_32_ = -5; i_32_ < i_14_; i_32_++) {
					final int i_33_ = i_32_ + 5;
					if (i_33_ < i_14_) {
						i_26_ += is_15_[i_33_];
						i_30_ += is_18_[i_33_];
						i_28_ += is_16_[i_33_];
						i_29_ += is_19_[i_33_];
						i_31_ += is_17_[i_33_];
					}
					final int i_34_ = i_32_ - 5;
					if (i_34_ >= 0) {
						i_26_ -= is_15_[i_34_];
						i_30_ -= is_18_[i_34_];
						i_29_ -= is_19_[i_34_];
						i_28_ -= is_16_[i_34_];
						i_31_ -= is_17_[i_34_];
					}
					if (i_32_ >= 0 && i_29_ > 0) {
						int[] is_35_ = is_27_[i_32_ >> 6];
						final int i_36_ = i_30_ != 0 ? MapFunctionNode.method1442(i_26_ * 256 / i_30_, i_28_ / i_29_, i_31_ / i_29_) : 0;
						if (is[i_20_][i_32_] == 0) {
							if (is_35_ != null) {
								is_35_[Class120_Sub12_Sub3.method1207(63, i_20_) + (Class120_Sub12_Sub3.method1207(63, i_32_) << 6)] = 0;
							}
						} else {
							if (is_35_ == null) {
								is_35_ = is_27_[i_32_ >> 6] = new int[4096];
							}
							is_35_[(Class120_Sub12_Sub3.method1207(i_32_, 63) << 6) + Class120_Sub12_Sub3.method1207(i_20_, 63)] = Rasterizer.palette[Class178.method2256(i_36_, 96)];
						}
					}
				}
			}
		}
	}
}
