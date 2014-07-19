/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83 implements Runnable {
	static int localPlayerCount = 0;
	static int[] anIntArray789;
	private Queue aClass177_790 = new Queue();
	private boolean aBoolean791 = false;
	static int renderX;
	int anInt793 = 0;
	static js5 aClass50_794;
	private Thread aThread795;

	@Override
	public final void run() {
		try {
			while (!aBoolean791) {
				Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1;
				synchronized (aClass177_790) {
					class120_sub14_sub14_sub1 = (Class120_Sub14_Sub14_Sub1) aClass177_790.removeFirst();
					if (class120_sub14_sub14_sub1 != null) {
						this.anInt793--;
					} else {
						try {
							aClass177_790.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					if (class120_sub14_sub14_sub1.anInt3927 == 2) {
						class120_sub14_sub14_sub1.aClass51_3935.put(class120_sub14_sub14_sub1.aByteArray3931.length, class120_sub14_sub14_sub1.aByteArray3931, (int) class120_sub14_sub14_sub1.subUid);
					} else if (class120_sub14_sub14_sub1.anInt3927 == 3) {
						class120_sub14_sub14_sub1.aByteArray3931 = class120_sub14_sub14_sub1.aClass51_3935.get((int) class120_sub14_sub14_sub1.subUid);
					}
				} catch (final Exception exception) {
					Class180_Sub3.method2312(exception, null);
				}
				class120_sub14_sub14_sub1.aBoolean3576 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "ja.run()");
		}
	}

	final Class120_Sub14_Sub14_Sub1 a(final int i, final FileSystem fileSystem, final int i_0_) {
		Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1;
		try {
			final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_1_ = new Class120_Sub14_Sub14_Sub1();
			class120_sub14_sub14_sub1_1_.anInt3927 = 3;
			class120_sub14_sub14_sub1_1_.aClass51_3935 = fileSystem;
			class120_sub14_sub14_sub1_1_.aBoolean3573 = false;
			if (i != -10260) {
				run();
			}
			class120_sub14_sub14_sub1_1_.subUid = i_0_;
			a(-377, class120_sub14_sub14_sub1_1_);
			class120_sub14_sub14_sub1 = class120_sub14_sub14_sub1_1_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.G(").append(i).append(',').append(fileSystem != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
		return class120_sub14_sub14_sub1;
	}

	static final int a(final byte[] is, final String string, final int i, final int i_2_, final int i_3_) {
		final int i_6_ = i - i_3_;
		for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
			final char c = string.charAt(i_3_ + i_7_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
				is[i_7_ + i_2_] = (byte) c;
			} else if (c != '\u20ac') {
				if (c != '\u201a') {
					if (c != '\u0192') {
						if (c != '\u201e') {
							if (c != '\u2026') {
								if (c != '\u2020') {
									if (c == '\u2021') {
										is[i_7_ + i_2_] = (byte) -121;
									} else if (c != '\u02c6') {
										if (c == '\u2030') {
											is[i_2_ - -i_7_] = (byte) -119;
										} else if (c != '\u0160') {
											if (c != '\u2039') {
												if (c != '\u0152') {
													if (c != '\u017d') {
														if (c == '\u2018') {
															is[i_2_ - -i_7_] = (byte) -111;
														} else if (c != '\u2019') {
															if (c == '\u201c') {
																is[i_2_ - -i_7_] = (byte) -109;
															} else if (c != '\u201d') {
																if (c == '\u2022') {
																	is[i_2_ + i_7_] = (byte) -107;
																} else if (c != '\u2013') {
																	if (c != '\u2014') {
																		if (c == '\u02dc') {
																			is[i_2_ - -i_7_] = (byte) -104;
																		} else if (c != '\u2122') {
																			if (c == '\u0161') {
																				is[i_7_ + i_2_] = (byte) -102;
																			} else if (c != '\u203a') {
																				if (c != '\u0153') {
																					if (c != '\u017e') {
																						if (c != '\u0178') {
																							is[i_7_ + i_2_] = (byte) 63;
																						} else {
																							is[i_2_ - -i_7_] = (byte) -97;
																						}
																					} else {
																						is[i_2_ + i_7_] = (byte) -98;
																					}
																				} else {
																					is[i_7_ + i_2_] = (byte) -100;
																				}
																			} else {
																				is[i_2_ - -i_7_] = (byte) -101;
																			}
																		} else {
																			is[i_2_ - -i_7_] = (byte) -103;
																		}
																	} else {
																		is[i_7_ + i_2_] = (byte) -105;
																	}
																} else {
																	is[i_7_ + i_2_] = (byte) -106;
																}
															} else {
																is[i_7_ + i_2_] = (byte) -108;
															}
														} else {
															is[i_7_ + i_2_] = (byte) -110;
														}
													} else {
														is[i_2_ - -i_7_] = (byte) -114;
													}
												} else {
													is[i_7_ + i_2_] = (byte) -116;
												}
											} else {
												is[i_7_ + i_2_] = (byte) -117;
											}
										} else {
											is[i_2_ + i_7_] = (byte) -118;
										}
									} else {
										is[i_7_ + i_2_] = (byte) -120;
									}
								} else {
									is[i_7_ + i_2_] = (byte) -122;
								}
							} else {
								is[i_7_ + i_2_] = (byte) -123;
							}
						} else {
							is[i_7_ + i_2_] = (byte) -124;
						}
					} else {
						is[i_2_ + i_7_] = (byte) -125;
					}
				} else {
					is[i_2_ - -i_7_] = (byte) -126;
				}
			} else {
				is[i_7_ + i_2_] = (byte) -128;
			}
		}
		return i_6_;
	}

	public static void a(final int i) {
		try {
			anIntArray789 = null;
			aClass50_794 = null;
			if (i != 31425) {
				renderX = -67;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.D(").append(i).append(')').toString());
		}
	}

	final Class120_Sub14_Sub14_Sub1 a(final byte i, final FileSystem fileSystem, final byte[] is, final int i_8_) {
		Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1;
		try {
			final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_9_ = new Class120_Sub14_Sub14_Sub1();
			class120_sub14_sub14_sub1_9_.subUid = i_8_;
			class120_sub14_sub14_sub1_9_.aClass51_3935 = fileSystem;
			class120_sub14_sub14_sub1_9_.aBoolean3573 = false;
			class120_sub14_sub14_sub1_9_.anInt3927 = 2;
			class120_sub14_sub14_sub1_9_.aByteArray3931 = is;
			a(-377, class120_sub14_sub14_sub1_9_);
			class120_sub14_sub14_sub1 = class120_sub14_sub14_sub1_9_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.E(").append(i).append(',').append(fileSystem != null ? "{...}" : "null").append(',').append(is != null ? "{...}" : "null").append(',').append(i_8_).append(')').toString());
		}
		return class120_sub14_sub14_sub1;
	}

	static final void b() {
		KeyboardHandler.aClass21_1504.clearSoftReference();
		SceneGraphNode.aClass21_1781.clearSoftReference();
	}

	static final void a(final int i, final byte i_10_, final int i_11_) {
		try {
			Class120_Sub2.anInt2422 = Class79.anInt694 + -i_11_ + Class79.anInt692 - 1;
			CanvasWrapper.anInt20 = i - Class79.anInt695;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.A(").append(i).append(',').append(i_10_).append(',').append(i_11_).append(')').toString());
		}
	}

	final void a(final boolean bool) {
		try {
			aBoolean791 = bool;
			synchronized (aClass177_790) {
				aClass177_790.notifyAll();
			}
			try {
				aThread795.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
			aThread795 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.F(").append(bool).append(')').toString());
		}
	}

	private final void a(final int i, final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1) {
		try {
			synchronized (aClass177_790) {
				aClass177_790.insertLast(class120_sub14_sub14_sub1);
				this.anInt793++;
				aClass177_790.notifyAll();
				if (i != -377) {
					renderX = 58;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.I(").append(i).append(',').append(class120_sub14_sub14_sub1 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class120_Sub14_Sub14_Sub1 a(final byte i, final FileSystem fileSystem, final int i_12_) {
		Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1;
		try {
			final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_13_ = new Class120_Sub14_Sub14_Sub1();
			class120_sub14_sub14_sub1_13_.anInt3927 = 1;
			synchronized (aClass177_790) {
				for (Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_14_ = (Class120_Sub14_Sub14_Sub1) aClass177_790.peekFirst(); class120_sub14_sub14_sub1_14_ != null; class120_sub14_sub14_sub1_14_ = (Class120_Sub14_Sub14_Sub1) aClass177_790.peekNext()) {
					if ((class120_sub14_sub14_sub1_14_.subUid ^ 0xffffffffffffffffL) == (i_12_ ^ 0xffffffffffffffffL) && fileSystem == class120_sub14_sub14_sub1_14_.aClass51_3935 && class120_sub14_sub14_sub1_14_.anInt3927 == 2) {
						class120_sub14_sub14_sub1_13_.aByteArray3931 = class120_sub14_sub14_sub1_14_.aByteArray3931;
						class120_sub14_sub14_sub1_13_.aBoolean3576 = false;
						final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_15_ = class120_sub14_sub14_sub1_13_;
						final Class120_Sub14_Sub14_Sub1 class120_sub14_sub14_sub1_16_ = class120_sub14_sub14_sub1_15_;
						return class120_sub14_sub14_sub1_16_;
					}
				}
			}
			if (i >= -114) {
				aClass177_790 = null;
			}
			class120_sub14_sub14_sub1_13_.aByteArray3931 = fileSystem.get(i_12_);
			class120_sub14_sub14_sub1_13_.aBoolean3576 = false;
			class120_sub14_sub14_sub1_13_.aBoolean3573 = true;
			class120_sub14_sub14_sub1 = class120_sub14_sub14_sub1_13_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ja.B(").append(i).append(',').append(fileSystem != null ? "{...}" : "null").append(',').append(i_12_).append(')').toString());
		}
		return class120_sub14_sub14_sub1;
	}

	public Class83() {
		final SignlinkNode signlinkNode = NpcType.gameSignlink.startThread(this, 5);
		while (signlinkNode.status == 0) {
			PacketBuffer.sleepWrapper(10L);
		}
		if (signlinkNode.status == 2) {
			throw new RuntimeException();
		}
		aThread795 = (Thread) signlinkNode.value;
	}
}
