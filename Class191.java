/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class191 {
	float aFloat2102;
	static boolean flickeringEffectsOn = true;
	float aFloat2104;
	static String aString2105;
	float aFloat2106;
	int anInt2107;
	float aFloat2108;
	int anInt2109;
	int anInt2110;
	int anInt2111;
	int anInt2112;
	static int lastMouseY = 0;
	float aFloat2114 = 0.25F;
	static int p12fullId;
	float aFloat2116 = 1.0F;
	Class120_Sub14_Sub9 aClass120_Sub14_Sub9_2117;
	int anInt2118;
	static int[] anIntArray2119;

	static {
		aString2105 = "Connecting to update server";
		anIntArray2119 = new int[] { 12543016, 15504954, 15914854, 16773818 };
	}

	public static void method2507(final byte i) {
		try {
			anIntArray2119 = null;
			aString2105 = null;
			if (i != -64) {
				constructLDIndexedSprites(null, -113);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wj.F(").append(i).append(')').toString());
		}
	}

	static final void method2508() {
		if (FileSystem.anInt455 != 2) {
			if (Class115.anInt1110 == js5.lastClickX && Class120_Sub12_Sub21.anInt3298 == Class120_Sub12_Sub36.lastClickY) {
				FileSystem.anInt455 = 0;
				if (Class120_Sub14_Sub4.aBoolean3470 && NodeCache.aBooleanArray299[81] && Class186.menuOptionCount > 2) {
					GameShell.method31(Class186.menuOptionCount - 2);
				} else {
					GameShell.method31(Class186.menuOptionCount - 1);
				}
			} else {
				FileSystem.anInt455 = 2;
				Class31.anInt250 = Class120_Sub12_Sub36.lastClickY;
				ClientScript.anInt3558 = js5.lastClickX;
			}
		} else if (Class115.anInt1110 == ClientScript.anInt3558 && Class31.anInt250 == Class120_Sub12_Sub21.anInt3298) {
			FileSystem.anInt455 = 0;
			if (Class120_Sub14_Sub4.aBoolean3470 && NodeCache.aBooleanArray299[81] && Class186.menuOptionCount > 2) {
				GameShell.method31(Class186.menuOptionCount - 2);
			} else {
				GameShell.method31(Class186.menuOptionCount - 1);
			}
		}
	}

	static final void method2509(final js5 js5, final js5 class50_0_, final js5 class50_1_, final int i) {
		try {
			Class101_Sub3.aClass50_2286 = js5;
			if (i == 31779) {
				Class132_Sub1.aClass50_2813 = class50_1_;
				Class179.aClass50_1778 = class50_0_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wj.H(").append(js5 != null ? "{...}" : "null").append(',').append(class50_0_ != null ? "{...}" : "null").append(',').append(class50_1_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final void method2510(final Buffer class120_sub7, final int i) {
		try {
			this.aFloat2108 = class120_sub7.getUByte() * 8 / 255.0F;
			if (i != -27409) {
				method2509(null, null, null, -51);
			}
			this.aFloat2114 = class120_sub7.getUByte() * 8 / 255.0F;
			this.aFloat2116 = 8 * class120_sub7.getUByte() / 255.0F;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wj.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final void method2511(final js5 js5, final int i, final js5 class50_2_, final js5 class50_3_, final js5 class50_4_) {
		try {
			Class89.aClass50_836 = js5;
			if (i != 5) {
				lastMouseY = -56;
			}
			Decimator.aClass50_1721 = class50_4_;
			Class101_Sub4.interfaceJs5 = class50_3_;
			Class120_Sub12_Sub11.aClass50_3213 = class50_2_;
			Node.interfaceCache = new JagexInterface[Class101_Sub4.interfaceJs5.method421()][];
			Class57.interfaceLoaded = new boolean[Class101_Sub4.interfaceJs5.method421()];
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wj.E(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(',').append(class50_2_ != null ? "{...}" : "null").append(',').append(class50_3_ != null ? "{...}" : "null").append(',').append(class50_4_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static int method2512(final int i, final int i_5_) {
		return i | i_5_;
	}

	static final void method2513() {
		if (Class23.packetType == 17) {
			final int i_7_ = Canvas_Sub1.inputStream.getUByte();
			int i_8_ = Class32.anInt254 * 2 - -((0xfd & i_7_) >> 4);
			int i_9_ = (0xf & i_7_) + Class28.anInt176 * 2;
			int i_10_ = i_8_ - -Canvas_Sub1.inputStream.getByte();
			int i_11_ = Canvas_Sub1.inputStream.getByte() + i_9_;
			final int i_12_ = Canvas_Sub1.inputStream.getShort();
			final int i_13_ = Canvas_Sub1.inputStream.getUShort();
			final int i_14_ = 4 * Canvas_Sub1.inputStream.getUByte();
			final int i_15_ = 4 * Canvas_Sub1.inputStream.getUByte();
			final int i_16_ = Canvas_Sub1.inputStream.getUShort();
			final int i_17_ = Canvas_Sub1.inputStream.getUShort();
			int i_18_ = Canvas_Sub1.inputStream.getUByte();
			if (i_18_ == 255) {
				i_18_ = -1;
			}
			final int i_19_ = Canvas_Sub1.inputStream.getUByte();
			if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < 208 && i_9_ < 208 && i_10_ >= 0 && i_11_ >= 0 && i_10_ < 208 && i_11_ < 208 && -65536 != (i_13_ ^ 0xffffffff)) {
				i_8_ *= 64;
				i_9_ *= 64;
				i_10_ *= 64;
				final Projectile class180_sub4 = new Projectile(i_13_, Class173.gameLevel, i_8_, i_9_, -i_14_ + Class22.getTileHeight(Class173.gameLevel, i_8_, i_9_), i_16_ - -Class101_Sub2.loopCycle, Class101_Sub2.loopCycle + i_17_, i_18_, i_19_, i_12_, i_15_);
				i_11_ *= 64;
				class180_sub4.method2319(Class22.getTileHeight(Class173.gameLevel, i_10_, i_11_) + -i_15_, i_10_, Class101_Sub2.loopCycle + i_16_, i_11_);
				FileSystemRequest.aClass105_3928.addLast(new Class120_Sub14_Sub1(class180_sub4));
			}
		} else if (Class23.packetType == 114) {
			final int i_20_ = Canvas_Sub1.inputStream.getUByte();
			final int i_21_ = Class32.anInt254 + (i_20_ >> 4 & 0x7);
			final int i_22_ = (i_20_ & 0x7) + Class28.anInt176;
			final int i_23_ = Canvas_Sub1.inputStream.getUShort();
			final int i_24_ = Canvas_Sub1.inputStream.getUShort();
			final int i_25_ = Canvas_Sub1.inputStream.getUShort();
			if (i_21_ >= 0 && i_22_ >= 0 && i_21_ < 104 && i_22_ < 104) {
				final Deque deque = ClientScript.groundObjects[Class173.gameLevel][i_21_][i_22_];
				if (deque != null) {
					for (GroundObjectNode class120_sub14_sub21 = (GroundObjectNode) deque.getFront(); class120_sub14_sub21 != null; class120_sub14_sub21 = (GroundObjectNode) deque.getNext()) {
						final SceneGroundObject class180_sub1 = class120_sub14_sub21.aClass180_Sub1_3630;
						if (class180_sub1.id == (0x7fff & i_23_) && i_24_ == class180_sub1.amount) {
							class180_sub1.amount = i_25_;
							break;
						}
					}
					Class5.spawnGroundObject(i_21_, i_22_);
				}
			}
		} else {
			if (Class23.packetType == 133) {
				final int i_26_ = Canvas_Sub1.inputStream.getShortA();
				final int i_27_ = Canvas_Sub1.inputStream.getUByteA();
				final int i_28_ = (i_27_ & 0x7) + Class28.anInt176;
				final int i_29_ = (0x7 & i_27_ >> 4) + Class32.anInt254;
				final int i_30_ = Canvas_Sub1.inputStream.getULEShortA();
				final int i_31_ = Canvas_Sub1.inputStream.getUByte();
				final int i_32_ = i_31_ >> 2;
				final byte i_33_ = Canvas_Sub1.inputStream.getByteS();
				final int i_34_ = 0x3 & i_31_;
				final byte i_35_ = Canvas_Sub1.inputStream.getByteC();
				final byte i_36_ = Canvas_Sub1.inputStream.getByte();
				final byte i_37_ = Canvas_Sub1.inputStream.getByteC();
				final int i_38_ = Canvas_Sub1.inputStream.getULEShortA();
				final int i_39_ = Canvas_Sub1.inputStream.getUShort();
				if (!HDToolkit.glEnabled) {
					Class120_Sub12_Sub6.method1226(i_33_, i_26_, i_30_, i_38_, i_32_, i_35_, i_36_, 101, i_39_, i_34_, i_28_, i_37_, i_29_);
				}
			}
			if (Class23.packetType == 111) {
				final int i_40_ = Canvas_Sub1.inputStream.getUByte();
				int i_41_ = 2 * Class32.anInt254 + (i_40_ >> 4 & 0xf);
				int i_42_ = (i_40_ & 0xf) + Class28.anInt176 * 2;
				int i_43_ = Canvas_Sub1.inputStream.getByte() + i_41_;
				int i_44_ = i_42_ - -Canvas_Sub1.inputStream.getByte();
				final int i_45_ = Canvas_Sub1.inputStream.getShort();
				final int i_46_ = Canvas_Sub1.inputStream.getShort();
				final int i_47_ = Canvas_Sub1.inputStream.getUShort();
				int i_48_ = Canvas_Sub1.inputStream.getByte();
				final int i_49_ = 4 * Canvas_Sub1.inputStream.getUByte();
				final int i_50_ = Canvas_Sub1.inputStream.getUShort();
				final int i_51_ = Canvas_Sub1.inputStream.getUShort();
				int i_52_ = Canvas_Sub1.inputStream.getUByte();
				if (i_52_ == 255) {
					i_52_ = -1;
				}
				final int i_53_ = Canvas_Sub1.inputStream.getUByte();
				if (i_41_ >= 0 && i_42_ >= 0 && i_41_ < 208 && i_42_ < 208 && i_43_ >= 0 && i_44_ >= 0 && i_43_ < 208 && i_44_ < 208 && i_47_ != 65535) {
					i_44_ *= 64;
					i_43_ *= 64;
					i_41_ *= 64;
					i_42_ *= 64;
					if (i_45_ != 0) {
						int i_54_;
						GameEntity class180_sub5;
						if (i_45_ >= 0) {
							final int i_55_ = i_45_ - 1;
							i_54_ = (0x782f & i_55_) >> 11;
							final int i_56_ = 0x7ff & i_55_;
							class180_sub5 = Class120_Sub12_Sub11.npcList[i_56_];
						} else {
							final int i_57_ = -i_45_ - 1;
							i_54_ = (i_57_ & 0x7c23) >> 11;
							final int i_58_ = 0x7ff & i_57_;
							if (i_58_ == Class167.anInt1616) {
								class180_sub5 = TileParticleQueue.selfPlayer;
							} else {
								class180_sub5 = Class118.playersList[i_58_];
							}
						}
						if (class180_sub5 != null) {
							final Class29 class29 = class180_sub5.method2336();
							if (class29.anIntArrayArray215 != null && class29.anIntArrayArray215[i_54_] != null) {
								i_48_ -= class29.anIntArrayArray215[i_54_][1];
								int i_59_ = class29.anIntArrayArray215[i_54_][0];
								final int i_60_ = Rasterizer.sineTable[class180_sub5.anInt3032];
								int i_61_ = class29.anIntArrayArray215[i_54_][2];
								final int i_62_ = Rasterizer.cosineTable[class180_sub5.anInt3032];
								final int i_63_ = i_59_ * i_62_ + i_60_ * i_61_ >> 16;
								i_61_ = -(i_59_ * i_60_) + i_62_ * i_61_ >> 16;
								i_59_ = i_63_;
								i_42_ += i_61_;
								i_41_ += i_59_;
							}
						}
					}
					final Projectile class180_sub4 = new Projectile(i_47_, Class173.gameLevel, i_41_, i_42_, Class22.getTileHeight(Class173.gameLevel, i_41_, i_42_) + -i_48_, i_50_ - -Class101_Sub2.loopCycle, Class101_Sub2.loopCycle + i_51_, i_52_, i_53_, i_46_, i_49_);
					class180_sub4.method2319(Class22.getTileHeight(Class173.gameLevel, i_43_, i_44_) + -i_49_, i_43_, Class101_Sub2.loopCycle + i_50_, i_44_);
					FileSystemRequest.aClass105_3928.addLast(new Class120_Sub14_Sub1(class180_sub4));
				}
			} else if (Class23.packetType == 158) {
				final int i_64_ = Canvas_Sub1.inputStream.getUByte();
				int x = ((0x77 & i_64_) >> 4) + Class32.anInt254;
				int z = Class28.anInt176 + (0x7 & i_64_);
				final int id = Canvas_Sub1.inputStream.getUShort();
				final int y = Canvas_Sub1.inputStream.getUByte();
				final int i_69_ = Canvas_Sub1.inputStream.getUShort();
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					x = 64 + 128 * x;
					z = 64 + 128 * z;
					final SpotAnimation class180_sub3 = new SpotAnimation(id, Class173.gameLevel, x, z, Class22.getTileHeight(Class173.gameLevel, x, z) - y, i_69_, Class101_Sub2.loopCycle);
					Class120_Sub12_Sub7.aClass105_3177.addLast(new Class120_Sub14_Sub4(class180_sub3));
				}
			} else if (Class23.packetType == 179) {
				int i_70_ = Canvas_Sub1.inputStream.getUShort();
				if (i_70_ == 65535) {
					i_70_ = -1;
				}
				final int i_71_ = Canvas_Sub1.inputStream.getUByteS();
				final int i_72_ = i_71_ >> 2;
				final int i_73_ = 0x3 & i_71_;
				final int i_74_ = CollisionMap.anIntArray153[i_72_];
				final int i_75_ = Canvas_Sub1.inputStream.getUByte();
				final int i_76_ = (i_75_ & 0x7) + Class28.anInt176;
				final int i_77_ = Class32.anInt254 + ((0x7f & i_75_) >> 4);
				ProducingGraphicsBuffer.method1853(i_70_, i_77_, (byte) -73, Class173.gameLevel, i_76_, i_74_, i_73_, i_72_);
			} else if (Class23.packetType == 131) {
				final int i_78_ = Canvas_Sub1.inputStream.getUByteS();
				final int i_79_ = i_78_ >> 2;
				final int i_80_ = CollisionMap.anIntArray153[i_79_];
				final int i_81_ = i_78_ & 0x3;
				final int i_82_ = Canvas_Sub1.inputStream.getULEShort();
				final int i_83_ = Canvas_Sub1.inputStream.getUByte();
				final int i_84_ = (i_83_ & 0x7) + Class28.anInt176;
				final int i_85_ = (i_83_ >> 4 & 0x7) + Class32.anInt254;
				if (i_85_ >= 0 && i_84_ >= 0 && i_85_ < 104 && i_84_ < 104) {
					Class38.method317(i_82_, Class173.gameLevel, i_81_, i_85_, -1, i_84_, (byte) 20, i_79_, i_80_, 0);
				}
			} else if (Class23.packetType == 115) {
				final int i_86_ = Canvas_Sub1.inputStream.getUShort();
				final int i_87_ = Canvas_Sub1.inputStream.getUByte();
				LocType.list(i_86_).method2460(i_87_, 23428);
			} else if (Class23.packetType == 232) {
				final int i_88_ = Canvas_Sub1.inputStream.getUByteC();
				final int i_89_ = Class28.anInt176 + (i_88_ & 0x7);
				final int i_90_ = (i_88_ >> 4 & 0x7) + Class32.anInt254;
				final int i_91_ = Canvas_Sub1.inputStream.getUByte();
				final int i_92_ = i_91_ >> 2;
				final int i_93_ = CollisionMap.anIntArray153[i_92_];
				final int i_94_ = 0x3 & i_91_;
				if (i_90_ >= 0 && i_89_ >= 0 && i_90_ < 104 && i_89_ < 104) {
					Class38.method317(-1, Class173.gameLevel, i_94_, i_90_, -1, i_89_, (byte) -97, i_92_, i_93_, 0);
				}
			} else if (Class23.packetType == 105) {
				final int i_95_ = Canvas_Sub1.inputStream.getUByte();
				int i_96_ = (i_95_ >> 4 & 0x7) + Class32.anInt254;
				int i_97_ = (i_95_ & 0x7) + Class28.anInt176;
				int i_98_ = Canvas_Sub1.inputStream.getByte() + i_96_;
				int i_99_ = Canvas_Sub1.inputStream.getByte() + i_97_;
				final int i_100_ = Canvas_Sub1.inputStream.getShort();
				final int i_101_ = Canvas_Sub1.inputStream.getUShort();
				final int i_102_ = Canvas_Sub1.inputStream.getUByte() * 4;
				final int i_103_ = 4 * Canvas_Sub1.inputStream.getUByte();
				final int i_104_ = Canvas_Sub1.inputStream.getUShort();
				final int i_105_ = Canvas_Sub1.inputStream.getUShort();
				int i_106_ = Canvas_Sub1.inputStream.getUByte();
				final int i_107_ = Canvas_Sub1.inputStream.getUByte();
				if (i_106_ == 255) {
					i_106_ = -1;
				}
				if (i_96_ >= 0 && i_97_ >= 0 && i_96_ < 104 && i_97_ < 104 && i_98_ >= 0 && i_99_ >= 0 && i_98_ < 104 && i_99_ < 104 && 65535 != i_101_) {
					i_97_ = 64 + 128 * i_97_;
					i_98_ = i_98_ * 128 + 64;
					i_99_ = 64 + i_99_ * 128;
					i_96_ = 64 + i_96_ * 128;
					final Projectile class180_sub4 = new Projectile(i_101_, Class173.gameLevel, i_96_, i_97_, -i_102_ + Class22.getTileHeight(Class173.gameLevel, i_96_, i_97_), Class101_Sub2.loopCycle + i_104_, i_105_ - -Class101_Sub2.loopCycle, i_106_, i_107_, i_100_, i_103_);
					class180_sub4.method2319(Class22.getTileHeight(Class173.gameLevel, i_98_, i_99_) - i_103_, i_98_, i_104_ + Class101_Sub2.loopCycle, i_99_);
					FileSystemRequest.aClass105_3928.addLast(new Class120_Sub14_Sub1(class180_sub4));
				}
			} else if (Class23.packetType == 120) {
				final int i_108_ = Canvas_Sub1.inputStream.getUByteS();
				final int i_109_ = Class32.anInt254 - -((0x73 & i_108_) >> 4);
				final int i_110_ = (0x7 & i_108_) + Class28.anInt176;
				final int i_111_ = Canvas_Sub1.inputStream.getUShortA();
				if (i_109_ >= 0 && i_110_ >= 0 && i_109_ < 104 && i_110_ < 104) {
					final Deque deque = ClientScript.groundObjects[Class173.gameLevel][i_109_][i_110_];
					if (deque != null) {
						for (GroundObjectNode class120_sub14_sub21 = (GroundObjectNode) deque.getFront(); class120_sub14_sub21 != null; class120_sub14_sub21 = (GroundObjectNode) deque.getNext()) {
							if ((i_111_ & 0x7fff) == class120_sub14_sub21.aClass180_Sub1_3630.id) {
								class120_sub14_sub21.unlink();
								break;
							}
						}
						if (deque.getFront() == null) {
							ClientScript.groundObjects[Class173.gameLevel][i_109_][i_110_] = null;
						}
						Class5.spawnGroundObject(i_109_, i_110_);
					}
				}
			} else if (Class23.packetType == 60) {
				final int i_112_ = Canvas_Sub1.inputStream.getUByteA();
				final int i_113_ = Class28.anInt176 + (0x7 & i_112_);
				final int i_114_ = (i_112_ >> 4 & 0x7) + Class32.anInt254;
				final int i_115_ = Canvas_Sub1.inputStream.getULEShort();
				final int i_116_ = Canvas_Sub1.inputStream.getUShortA();
				if (i_114_ >= 0 && i_113_ >= 0 && i_114_ < 104 && i_113_ < 104) {
					final SceneGroundObject class180_sub1 = new SceneGroundObject();
					class180_sub1.amount = i_116_;
					class180_sub1.id = i_115_;
					if (ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_] == null) {
						ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_] = new Deque();
					}
					ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_].addLast(new GroundObjectNode(class180_sub1));
					Class5.spawnGroundObject(i_114_, i_113_);
				}
			} else if (Class23.packetType == 144) {
				final int i_117_ = Canvas_Sub1.inputStream.getUByte();
				final int i_118_ = Class28.anInt176 - -(i_117_ & 0x7);
				final int i_119_ = Class32.anInt254 - -(0x7 & i_117_ >> 4);
				int i_120_ = Canvas_Sub1.inputStream.getUShort();
				if (65535 == i_120_) {
					i_120_ = -1;
				}
				final int i_121_ = Canvas_Sub1.inputStream.getUByte();
				final int i_122_ = 0xf & i_121_ >> 4;
				final int i_123_ = 0x7 & i_121_;
				final int i_124_ = Canvas_Sub1.inputStream.getUByte();
				final int i_125_ = Canvas_Sub1.inputStream.getUByte();
				if (i_119_ >= 0 && i_118_ >= 0 && i_119_ < 104 && i_118_ < 104) {
					final int i_126_ = i_122_ + 1;
					if (-i_126_ + i_119_ <= TileParticleQueue.selfPlayer.walkQueueX[0] && TileParticleQueue.selfPlayer.walkQueueX[0] <= i_126_ + i_119_ && i_118_ + -i_126_ <= TileParticleQueue.selfPlayer.walkQueueZ[0] && i_118_ - -i_126_ >= TileParticleQueue.selfPlayer.walkQueueZ[0] && CursorType.anInt1242 != 0 && i_123_ > 0 && Class150.anInt1407 < 50 && i_120_ != -1) {
						Class120_Sub12_Sub16.anIntArray3255[Class150.anInt1407] = i_120_;
						LocType.anIntArray1834[Class150.anInt1407] = i_123_;
						Class81.anIntArray779[Class150.anInt1407] = i_124_;
						Class109.aClass6Array1047[Class150.anInt1407] = null;
						Class174.anIntArray1731[Class150.anInt1407] = i_122_ + (i_118_ << 8) + (i_119_ << 16);
						FileSystemRequest.anIntArray3926[Class150.anInt1407] = i_125_;
						Class150.anInt1407++;
					}
				}
			} else if (Class23.packetType == 47) {
				final int i_127_ = Canvas_Sub1.inputStream.getULEShortA();
				final int i_128_ = Canvas_Sub1.inputStream.getUShort();
				final int i_129_ = Canvas_Sub1.inputStream.getUShort();
				final int i_130_ = Canvas_Sub1.inputStream.getUByteA();
				final int i_131_ = ((i_130_ & 0x7a) >> 4) + Class32.anInt254;
				final int i_132_ = Class28.anInt176 + (0x7 & i_130_);
				if (i_131_ >= 0 && i_132_ >= 0 && i_131_ < 104 && i_132_ < 104 && i_128_ != Class167.anInt1616) {
					final SceneGroundObject class180_sub1 = new SceneGroundObject();
					class180_sub1.amount = i_129_;
					class180_sub1.id = i_127_;
					if (ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_] == null) {
						ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_] = new Deque();
					}
					ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_].addLast(new GroundObjectNode(class180_sub1));
					Class5.spawnGroundObject(i_131_, i_132_);
				}
			}
		}
	}

	static final LDIndexedSprite[] constructLDIndexedSprites(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return AbstractRequest.constructLDIndexedSprites();
	}

	public Class191() {
		this.aFloat2108 = 1.0F;
		this.anInt2109 = AtmosphereManager.defaultScreenColorRgb;
		this.aFloat2104 = 1.2F;
		this.anInt2107 = -50;
		this.anInt2110 = -50;
		this.anInt2118 = 0;
		this.aFloat2102 = 1.1523438F;
		this.anInt2112 = -60;
		this.aFloat2106 = 0.69921875F;
		this.anInt2111 = AtmosphereManager.defaulFogColorRgb;
		if (World.anIntArray2835 != null) {
			this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(World.anIntArray2835[0], World.anIntArray2835[1], World.anIntArray2835[2], World.anIntArray2835[3], World.anIntArray2835[4], World.anIntArray2835[5]);
		}
	}

	Class191(final Buffer class120_sub7) {
		this.aFloat2108 = 1.0F;
		final int i = class120_sub7.getUByte();
		if ((0x1 & i) != 0) {
			this.anInt2109 = class120_sub7.getInt();
		} else {
			this.anInt2109 = AtmosphereManager.defaultScreenColorRgb;
		}
		if ((0x2 & i) != 0) {
			this.aFloat2102 = class120_sub7.getUShort() / 256.0F;
		} else {
			this.aFloat2102 = 1.1523438F;
		}
		if ((i & 0x4) == 0) {
			this.aFloat2106 = 0.69921875F;
		} else {
			this.aFloat2106 = class120_sub7.getUShort() / 256.0F;
		}
		if ((0x8 & i) != 0) {
			this.aFloat2104 = class120_sub7.getUShort() / 256.0F;
		} else {
			this.aFloat2104 = 1.2F;
		}
		if ((i & 0x10) != 0) {
			this.anInt2110 = class120_sub7.getShort();
			this.anInt2112 = class120_sub7.getShort();
			this.anInt2107 = class120_sub7.getShort();
		} else {
			this.anInt2107 = -50;
			this.anInt2110 = -50;
			this.anInt2112 = -60;
		}
		if ((i & 0x20) == 0) {
			this.anInt2111 = AtmosphereManager.defaulFogColorRgb;
		} else {
			this.anInt2111 = class120_sub7.getInt();
		}
		if ((0x40 & i) != 0) {
			this.anInt2118 = class120_sub7.getUShort();
		} else {
			this.anInt2118 = 0;
		}
		if ((0x80 & i) == 0) {
			if (World.anIntArray2835 != null) {
				this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(World.anIntArray2835[0], World.anIntArray2835[1], World.anIntArray2835[2], World.anIntArray2835[3], World.anIntArray2835[4], World.anIntArray2835[5]);
			}
		} else {
			this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort());
		}
	}
}
