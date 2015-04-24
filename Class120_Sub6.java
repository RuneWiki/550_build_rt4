/* Class120_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub6 extends Node {
	static ObjectCache aClass21_2443;
	static String aString2444 = "Loaded world list data";
	int anInt2445;
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2446;
	Class120_Sub5_Sub1 aClass120_Sub5_Sub1_2447;
	static boolean characterShadowsOn = true;
	int anInt2449;
	static js5 aClass50_2450;
	int anInt2451;
	int anInt2452;
	int anInt2453;
	int anInt2454;
	int anInt2455;
	int anInt2456;
	int anInt2457;
	int anInt2458;
	Class120_Sub22 aClass120_Sub22_2459;
	int anInt2460;
	int anInt2461;
	Class157 aClass157_2462;
	int anInt2463;
	int anInt2464;
	int anInt2465;
	int anInt2466;
	int anInt2467;

	static {
		aClass21_2443 = new ObjectCache(4);
	}

	static final String method1068(final String string) {
		String string_1_ = Class174.longToString(Varp.stringToLong(string));
		if (string_1_ == null) {
			string_1_ = "";
		}
		return string_1_;
	}

	static final void savePreferences(final Signlink signlink) {
		FileOnDisk fileOnDisk = null;
		try {
			final SignlinkNode signlinkNode = signlink.openPreferencesFile("runescape");
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(1L);
			}
			if (signlinkNode.status == 1) {
				fileOnDisk = (FileOnDisk) signlinkNode.value;
				final Buffer buffer = js5.method417();
				fileOnDisk.write(buffer.buf, 0, buffer.pos);
			}
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			if (fileOnDisk != null) {
				fileOnDisk.close();
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	static final int method1070(final int i_2_) {
		return i_2_ & 0xff;
	}

	final void method1071() {
		this.aClass120_Sub30_Sub4_2446 = null;
		this.aClass157_2462 = null;
		this.aClass120_Sub22_2459 = null;
		this.aClass120_Sub5_Sub1_2447 = null;
	}

	static final void method1074(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_10_) {
		if (js5.loadInterface(i)) {
			client.method60(Node.interfaceCache[i], -1, i_8_, i_6_, i_4_, i_10_, i_5_, i_7_);
		}
	}

	static final byte[] method1075(final String string) {
		final int i_11_ = string.length();
		final byte[] is_12_ = new byte[i_11_];
		for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
			final char c = string.charAt(i_13_);
			if (c > '\0' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
				is_12_[i_13_] = (byte) c;
			} else if (c != '\u20ac') {
				if (c != '\u201a') {
					if (c == '\u0192') {
						is_12_[i_13_] = (byte) -125;
					} else if (c == '\u201e') {
						is_12_[i_13_] = (byte) -124;
					} else if (c == '\u2026') {
						is_12_[i_13_] = (byte) -123;
					} else if (c != '\u2020') {
						if (c == '\u2021') {
							is_12_[i_13_] = (byte) -121;
						} else if (c != '\u02c6') {
							if (c != '\u2030') {
								if (c == '\u0160') {
									is_12_[i_13_] = (byte) -118;
								} else if (c == '\u2039') {
									is_12_[i_13_] = (byte) -117;
								} else if (c != '\u0152') {
									if (c != '\u017d') {
										if (c == '\u2018') {
											is_12_[i_13_] = (byte) -111;
										} else if (c == '\u2019') {
											is_12_[i_13_] = (byte) -110;
										} else if (c == '\u201c') {
											is_12_[i_13_] = (byte) -109;
										} else if (c != '\u201d') {
											if (c == '\u2022') {
												is_12_[i_13_] = (byte) -107;
											} else if (c != '\u2013') {
												if (c != '\u2014') {
													if (c != '\u02dc') {
														if (c == '\u2122') {
															is_12_[i_13_] = (byte) -103;
														} else if (c != '\u0161') {
															if (c == '\u203a') {
																is_12_[i_13_] = (byte) -101;
															} else if (c != '\u0153') {
																if (c != '\u017e') {
																	if (c != '\u0178') {
																		is_12_[i_13_] = (byte) 63;
																	} else {
																		is_12_[i_13_] = (byte) -97;
																	}
																} else {
																	is_12_[i_13_] = (byte) -98;
																}
															} else {
																is_12_[i_13_] = (byte) -100;
															}
														} else {
															is_12_[i_13_] = (byte) -102;
														}
													} else {
														is_12_[i_13_] = (byte) -104;
													}
												} else {
													is_12_[i_13_] = (byte) -105;
												}
											} else {
												is_12_[i_13_] = (byte) -106;
											}
										} else {
											is_12_[i_13_] = (byte) -108;
										}
									} else {
										is_12_[i_13_] = (byte) -114;
									}
								} else {
									is_12_[i_13_] = (byte) -116;
								}
							} else {
								is_12_[i_13_] = (byte) -119;
							}
						} else {
							is_12_[i_13_] = (byte) -120;
						}
					} else {
						is_12_[i_13_] = (byte) -122;
					}
				} else {
					is_12_[i_13_] = (byte) -126;
				}
			} else {
				is_12_[i_13_] = (byte) -128;
			}
		}
		return is_12_;
	}
}
