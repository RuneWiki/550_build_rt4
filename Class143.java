/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class143 implements Interface3 {
	static String selectString = "Select";
	private final Class50 aClass50_2184;
	static volatile long lastCanvasReplace = 0L;
	private final Class114[] aClass114Array2186;
	private final Class50 aClass50_2187;
	static int anInt2188 = 2;
	private final Class35 aClass35_2189 = new Class35(256);

	@Override
	public final int[] method6(final int i, final float f, final int i_0_, final int i_1_, final int i_2_, final boolean bool) {
		int[] is;
		try {
			if (i_2_ > -125) {
				return null;
			}
			is = method2016(i_0_, true).method1533(f, aClass114Array2186[i_0_].aBoolean1107, 30319, aClass50_2187, this, i, bool, i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.C(").append(i).append(',').append(f).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(bool).append(')').toString());
		}
		return is;
	}

	static final void method2013(final int i, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final boolean bool, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		try {
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				for (int i_13_ = 0; i_13_ < 104; i_13_++) {
					Class179.anIntArrayArray1774[i_12_][i_13_] = 0;
					Class120_Sub2.anIntArrayArray2416[i_12_][i_13_] = 99999999;
				}
			}
			int i_14_ = i_4_;
			Class179.anIntArrayArray1774[i_6_][i_4_] = 99;
			Class120_Sub2.anIntArrayArray2416[i_6_][i_4_] = 0;
			int i_15_ = i_6_;
			int i_16_ = 0;
			int i_17_ = 0;
			boolean bool_18_ = false;
			Class150.anIntArray1412[i_17_] = i_6_;
			Class120_Sub12.anIntArray2565[i_17_++] = i_4_;
			if (i_8_ != -1) {
				selectString = null;
			}
			final int[][] is = Class182.aClass25Array1802[Class173.gameLevel].anIntArrayArray152;
			while (i_17_ != i_16_) {
				i_15_ = Class150.anIntArray1412[i_16_];
				i_14_ = Class120_Sub12.anIntArray2565[i_16_];
				i_16_ = 0xfff & i_16_ + 1;
				if (i == i_15_ && i_14_ == i_7_) {
					bool_18_ = true;
					break;
				}
				if (i_5_ != 0) {
					if ((i_5_ < 5 || i_5_ == 10) && Class182.aClass25Array1802[Class173.gameLevel].method220(i_7_, i_9_, i_14_, i_15_, (byte) -93, i, 2, i_5_ + -1)) {
						bool_18_ = true;
						break;
					}
					if (i_5_ < 10 && Class182.aClass25Array1802[Class173.gameLevel].method223(i, i_15_, i_7_, 1024, i_14_, i_5_ - 1, i_9_, 2)) {
						bool_18_ = true;
						break;
					}
				}
				if (i_3_ != 0 && i_11_ != 0 && Class182.aClass25Array1802[Class173.gameLevel].method216(i_14_, -1, i_10_, 2, i_7_, i, i_11_, i_3_, i_15_)) {
					bool_18_ = true;
					break;
				}
				final int i_19_ = 1 + Class120_Sub2.anIntArrayArray2416[i_15_][i_14_];
				if (i_15_ > 0 && Class179.anIntArrayArray1774[i_15_ - 1][i_14_] == 0 && (is[i_15_ + -1][i_14_] & 0x2c010e) == 0 && (0x2c0138 & is[i_15_ - 1][i_14_ - -1]) == 0) {
					Class150.anIntArray1412[i_17_] = i_15_ - 1;
					Class120_Sub12.anIntArray2565[i_17_] = i_14_;
					Class179.anIntArrayArray1774[i_15_ - 1][i_14_] = 2;
					Class120_Sub2.anIntArrayArray2416[i_15_ - 1][i_14_] = i_19_;
					i_17_ = 0xfff & 1 + i_17_;
				}
				if (i_15_ < 102 && Class179.anIntArrayArray1774[1 + i_15_][i_14_] == 0 && (is[2 + i_15_][i_14_] & 0x2c0183) == 0 && (is[i_15_ - -2][1 + i_14_] & 0x2c01e0) == 0) {
					Class150.anIntArray1412[i_17_] = i_15_ - -1;
					Class120_Sub12.anIntArray2565[i_17_] = i_14_;
					Class179.anIntArrayArray1774[i_15_ + 1][i_14_] = 8;
					i_17_ = 0xfff & 1 + i_17_;
					Class120_Sub2.anIntArrayArray2416[i_15_ - -1][i_14_] = i_19_;
				}
				if (i_14_ > 0 && Class179.anIntArrayArray1774[i_15_][-1 + i_14_] == 0 && (0x2c010e & is[i_15_][-1 + i_14_]) == 0 && (0x2c0183 & is[i_15_ - -1][-1 + i_14_]) == 0) {
					Class150.anIntArray1412[i_17_] = i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = -1 + i_14_;
					Class179.anIntArrayArray1774[i_15_][-1 + i_14_] = 1;
					i_17_ = i_17_ - -1 & 0xfff;
					Class120_Sub2.anIntArrayArray2416[i_15_][i_14_ - 1] = i_19_;
				}
				if (i_14_ < 102 && Class179.anIntArrayArray1774[i_15_][i_14_ + 1] == 0 && (is[i_15_][i_14_ + 2] & 0x2c0138) == 0 && (is[1 + i_15_][2 + i_14_] & 0x2c01e0) == 0) {
					Class150.anIntArray1412[i_17_] = i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = 1 + i_14_;
					i_17_ = 0xfff & i_17_ + 1;
					Class179.anIntArrayArray1774[i_15_][i_14_ + 1] = 4;
					Class120_Sub2.anIntArrayArray2416[i_15_][i_14_ + 1] = i_19_;
				}
				if (i_15_ > 0 && i_14_ > 0 && Class179.anIntArrayArray1774[-1 + i_15_][i_14_ + -1] == 0 && (0x2c013e & is[-1 + i_15_][i_14_]) == 0 && (is[-1 + i_15_][-1 + i_14_] & 0x2c010e) == 0 && (is[i_15_][-1 + i_14_] & 0x2c018f) == 0) {
					Class150.anIntArray1412[i_17_] = -1 + i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = i_14_ + -1;
					i_17_ = 0xfff & i_17_ - -1;
					Class179.anIntArrayArray1774[i_15_ - 1][-1 + i_14_] = 3;
					Class120_Sub2.anIntArrayArray2416[-1 + i_15_][i_14_ + -1] = i_19_;
				}
				if (i_15_ < 102 && i_14_ > 0 && Class179.anIntArrayArray1774[i_15_ + 1][-1 + i_14_] == 0 && (0x2c018f & is[1 + i_15_][i_14_ - 1]) == 0 && (0x2c0183 & is[i_15_ - -2][i_14_ - 1]) == 0 && (is[2 + i_15_][i_14_] & 0x2c01e3) == 0) {
					Class150.anIntArray1412[i_17_] = 1 + i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = -1 + i_14_;
					i_17_ = 1 + i_17_ & 0xfff;
					Class179.anIntArrayArray1774[1 + i_15_][-1 + i_14_] = 9;
					Class120_Sub2.anIntArrayArray2416[i_15_ + 1][i_14_ - 1] = i_19_;
				}
				if (i_15_ > 0 && i_14_ < 102 && Class179.anIntArrayArray1774[-1 + i_15_][i_14_ + 1] == 0 && (0x2c013e & is[i_15_ - 1][1 + i_14_]) == 0 && (0x2c0138 & is[-1 + i_15_][i_14_ - -2]) == 0 && (0x2c01f8 & is[i_15_][i_14_ + 2]) == 0) {
					Class150.anIntArray1412[i_17_] = -1 + i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = i_14_ + 1;
					i_17_ = 0xfff & 1 + i_17_;
					Class179.anIntArrayArray1774[-1 + i_15_][i_14_ - -1] = 6;
					Class120_Sub2.anIntArrayArray2416[-1 + i_15_][i_14_ - -1] = i_19_;
				}
				if (i_15_ < 102 && i_14_ < 102 && Class179.anIntArrayArray1774[1 + i_15_][i_14_ + 1] == 0 && (0x2c01f8 & is[1 + i_15_][2 + i_14_]) == 0 && (is[2 + i_15_][i_14_ + 2] & 0x2c01e0) == 0 && (0x2c01e3 & is[i_15_ - -2][i_14_ + 1]) == 0) {
					Class150.anIntArray1412[i_17_] = 1 + i_15_;
					Class120_Sub12.anIntArray2565[i_17_] = i_14_ + 1;
					i_17_ = 0xfff & i_17_ - -1;
					Class179.anIntArrayArray1774[1 + i_15_][i_14_ + 1] = 12;
					Class120_Sub2.anIntArrayArray2416[1 + i_15_][i_14_ + 1] = i_19_;
				}
			}
			if (!bool_18_) {
				if (!bool) {
					return;
				}
				int i_20_ = 1000;
				int i_21_ = 100;
				for (int i_23_ = i - 10; i_23_ <= 10 + i; i_23_++) {
					for (int i_24_ = -10 + i_7_; i_7_ + 10 >= i_24_; i_24_++) {
						if (i_23_ >= 0 && i_24_ >= 0 && i_23_ < 104 && i_24_ < 104 && Class120_Sub2.anIntArrayArray2416[i_23_][i_24_] < 100) {
							int i_25_ = 0;
							int i_26_ = 0;
							if (i <= i_23_) {
								if (i_3_ + i + -1 < i_23_) {
									i_25_ = i_23_ - (i_3_ + i - 1);
								}
							} else {
								i_25_ = i + -i_23_;
							}
							if (i_24_ >= i_7_) {
								if (i_24_ > i_11_ + i_7_ + -1) {
									i_26_ = i_24_ + 1 + -i_11_ + -i_7_;
								}
							} else {
								i_26_ = i_7_ + -i_24_;
							}
							final int i_27_ = i_25_ * i_25_ + i_26_ * i_26_;
							if (i_20_ > i_27_ || i_27_ == i_20_ && i_21_ > Class120_Sub2.anIntArrayArray2416[i_23_][i_24_]) {
								i_21_ = Class120_Sub2.anIntArrayArray2416[i_23_][i_24_];
								i_14_ = i_24_;
								i_15_ = i_23_;
								i_20_ = i_27_;
							}
						}
					}
				}
				if (i_20_ == 1000 || i_6_ == i_15_ && i_4_ == i_14_) {
					return;
				}
			}
			SceneGroundObject.aBoolean2848 = false;
			Class120_Sub12_Sub26.anInt3327 = i_15_;
			Class65.anInt592 = i_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("qi.IA(").append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(bool).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',')
							.append(i_11_).append(')').toString());
		}
	}

	static final void setSettings(final String string) {
		Class120_Sub12_Sub25.settings = string;
		if (NpcType.gameSignlink.gameApplet != null) {
			try {
				final String string_28_ = NpcType.gameSignlink.gameApplet.getParameter("cookieprefix");
				final String string_29_ = NpcType.gameSignlink.gameApplet.getParameter("cookiehost");
				String string_30_ = new StringBuilder(string_28_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_29_).toString();
				if (string.length() == 0) {
					string_30_ = new StringBuilder(string_30_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				} else {
					string_30_ = new StringBuilder(string_30_).append("; Expires=").append(Class32.method270(94608000000L + TimeUtil.getSafeTime(), 1)).append("; Max-Age=").append(94608000L).toString();
				}
				Class77.method668(new StringBuilder("document.cookie=\"").append(string_30_).append("\"").toString(), NpcType.gameSignlink.gameApplet);
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method2015(final int i) {
		do {
			try {
				Class154.aClass21_1438.clear();
				if (i != -5069) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.KA(").append(i).append(')').toString());
			}
		} while (false);
	}

	Class120_Sub14_Sub13 method2016(final int i, final boolean bool) {
		Class120_Sub14_Sub13 class120_sub14_sub13;
		try {
			final NodeSub class120_sub14 = aClass35_2189.method302(17301, i);
			if (class120_sub14 != null) {
				return (Class120_Sub14_Sub13) class120_sub14;
			}
			final byte[] is = aClass50_2184.method413(i, bool);
			if (is == null) {
				return null;
			}
			final Class120_Sub14_Sub13 class120_sub14_sub13_31_ = new Class120_Sub14_Sub13(new Buffer(is));
			aClass35_2189.method301(i, 30, class120_sub14_sub13_31_);
			class120_sub14_sub13 = class120_sub14_sub13_31_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.O(").append(i).append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub13;
	}

	public static void method2017(final byte i) {
		try {
			if (i == -10) {
				selectString = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.JA(").append(i).append(')').toString());
		}
	}

	@Override
	public final boolean method7(final int i, final int i_32_) {
		boolean bool;
		try {
			if (i_32_ != 1) {
				setSettings(null);
			}
			final Class120_Sub14_Sub13 class120_sub14_sub13 = method2016(i, true);
			bool = class120_sub14_sub13 != null && class120_sub14_sub13.method1529(this, aClass50_2187, -50);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.A(").append(i).append(',').append(i_32_).append(')').toString());
		}
		return bool;
	}

	@Override
	public final Class114 method8(final int i, final byte i_33_) {
		Class114 class114;
		try {
			class114 = aClass114Array2186[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.B(").append(i).append(',').append(i_33_).append(')').toString());
		}
		return class114;
	}

	static final String method2018(final int i, final long l) {
		String string;
		try {
			if (i <= 92) {
				method2015(48);
			}
			string = Class174.method2234(0, l);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.MA(").append(i).append(',').append(l).append(')').toString());
		}
		return string;
	}

	static final boolean method2019(final char c, final int i) {
		boolean bool;
		try {
			if (i > (c ^ 0xffffffff) && c < 128 || c >= 160 && c <= 255) {
				return true;
			}
			if (c != 0) {
				int i_34_ = 0;
				for (final char[] cs = Class120_Sub12_Sub32.aCharArray3385; i_34_ < cs.length; i_34_++) {
					final int i_35_ = cs[i_34_];
					if (c == i_35_) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qi.LA(").append(c).append(',').append(i).append(')').toString());
		}
		return bool;
	}

	static final void translateToGermany() {
		Class101_Sub3.aString2285 = "Fallen lassen";
		Class156.aString1457 = "leuchten2:";
		Class5.aString2153 = "Schlie\u00dfen";
		Class11.aString82 = "Verbindung zum Update-Server hergestellt.";
		Class53_Sub1.aString2213 = "rot:";
		Class91.aString853 = "Speicher wird zugewiesen.";
		Class120_Sub11.aString2553 = " weitere Optionen";
		SceneGroundObject.aString2847 = "Wordpack geladen.";
		CursorType.aString1239 = "Titelbild geladen.";
		Class120_Sub12_Sub1.aString3137 = "Standardinstellungen geladen";
		selectString = "Ausw\u00e4hlen";
		Class120_Sub12_Sub27.aString3338 = "Suche nach Updates - ";
		Class36.aString313 = "Lade...";
		Class29.aString217 = "Lade Titelbild - ";
		Class109.continueString = "Weiter";
		Class120_Sub14_Sub24.aString3665 = "Lade Sprites - ";
		Class120_Sub12_Sub25.aString3319 = "Bitte entferne ";
		Class120_Sub12_Sub30.aString3371 = "Lade Texturen - ";
		DummyInputStream.aString25 = "Gegenstand f\u00fcr Mitglieder";
		AbstractGraphicsBuffer.aString1176 = "Benutzen";
		Class120_Sub6.aString2444 = "Liste der Welten geladen";
		Class120_Sub12_Sub18.aString3272 = "RuneScape wird geladen - bitte warten...";
		Class120_Sub19.aString2653 = "M";
		Class45.aString398 = "Lade Wordpack - ";
		Class191.aString2105 = "Verbindung mit Update-Server...";
		Class45.aString400 = "Starte 3D-Softwarebibliothek.";
		Class85.aString807 = "welle:";
		Class143_Sub1.aString2192 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Class120_Sub12_Sub28.okString = "Okay";
		Class96.aString915 = "sch\u00fctteln:";
		IntegerNode.aString2788 = "Lade Benutzeroberfl\u00e4che - ";
		Class120_Sub11.aString2554 = "Lade Standardeinstellungen - ";
		Class69_Sub2_Sub1.aString3078 = " steht bereits auf deiner Ignorieren-Liste!";
		World.aString2837 = "3D-Softwarebibliothek gestartet.";
		Class120_Sub14_Sub2.aString3455 = "M";
		Class24.aString142 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
		Class69.aString618 = "gr\u00fcn:";
		InterfaceClickMask.aString2660 = "Lade Schrifts\u00e4tze - ";
		Class120_Sub13.aString2574 = "weiss:";
		DisplayModeInfo.aString1708 = "Spielwelt erstellt.";
		Class29.aString196 = ": ";
		GameEntity.aString3011 = "scrollen:";
		Class180_Sub6.aString3062 = "Spieler kann nicht gefunden werden: ";
		Class120_Sub11.aString2552 = "Titelbild ge\u00f6ffnet.";
		Class120_Sub3.aString2428 = "Lade Konfiguration - ";
		Class107.aString1025 = "Musik-Engine vorbereitet.";
		Class120_Sub30_Sub2.aString3679 = "Ladevorgang - bitte warte.";
		Class65.aString591 = "Angreifen";
		Class120_Sub11.aString2550 = "Deine Freunde-Liste ist voll! Maximale Eintr\u00e4ge: Mitglieder 200/freie Spieler 100";
		Class54.aString489 = " zuerst von deiner Freunde-Liste!";
		Class111.aString1062 = "leuchten1:";
		Class114.aString1098 = "Lade Liste der Welten";
		NpcType.aString1685 = "blinken3:";
		Class136.aString1316 = "leuchten3:";
		Class61.aString568 = "m\u00f6chte mit dir handeln.";
		Class82.aString787 = "Hierhin drehen";
		CursorType.aString1238 = "T";
		Class120_Sub24.aString2726 = "Sprites geladen.";
		Class120_Sub12_Sub1.aString3132 = "Hierhin gehen";
		Class111.aString1056 = "W\u00e4hl eine Option";
		Class147.aString1397 = "blinken1:";
		Class120_Sub21.aString2669 = " loggt sich ein.";
		Class132.aString1250 = " loggt sich aus.";
		Class120_Sub12_Sub15.aString3244 = "Versteckt";
		Class158.aString1483 = "blaugr\u00fcn:";
		Class120_Sub15.aString2594 = "Update-Liste geladen.";
		Class109.aString1038 = "Eingabeprozedur geladen.";
		Class71.aString626 = "Bitte warte...";
		Class116.aString1116 = "Verbindung abgebrochen.";
		Class157.aString1462 = "Abbrechen";
		Class147.aString1398 = "welle2:";
		Class120_Sub12_Sub21_Sub1.aString3911 = "Stufe: ";
		Class91.aString854 = "T";
		Class11.aString81 = "Untersuchen";
		Class121.aString1155 = "Schrifts\u00e4tze geladen.";
		Class8.aString64 = "Ablegen";
		PlayerAppearance.aString1368 = "Zugewiesener Speicher.";
		Class84.aString799 = "Benutzeroberfl\u00e4che geladen.";
		Class174.aString1733 = "Fertigkeit: ";
		Class112.aString1079 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Class120_Sub10.aString2538 = "gleiten:";
		Class120_Sub12_Sub21_Sub1.aString3910 = " steht bereits auf deiner Freunde-Liste!";
		SceneGroundObject.aString2849 = "Bitte entferne ";
		Class53_Sub1.aString2206 = "blinken2:";
		Class108_Sub3.aString2396 = "Mechscape wird geladen - bitte warten...";
		NodeSub.aString2585 = "Konfig geladen.";
		Class120_Sub14_Sub1.aString3449 = "Nehmen";
		Class120_Sub14_Sub23.aString3655 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Class142.aString1358 = "Texturen geladen.";
		Class69_Sub1.aString2231 = "gelb:";
		Class120_Sub14_Sub14.aString3575 = "lila:";
		Class120_Sub3.aString2424 = "Kampfstufe: ";
		Class120_Sub13.aString2578 = " zuerst von deiner Ignorieren-Liste!";
	}

	Class143(final Class50 class50, final Class50 class50_36_, final Class50 class50_37_) {
		aClass50_2184 = class50_36_;
		aClass50_2187 = class50_37_;
		final Buffer class120_sub7 = new Buffer(class50.getFile(0, 0));
		final int i = class120_sub7.getUShort();
		aClass114Array2186 = new Class114[i];
		for (int i_38_ = 0; i > i_38_; i_38_++) {
			if (class120_sub7.getUByte() == 1) {
				aClass114Array2186[i_38_] = new Class114();
			}
		}
		for (int i_39_ = 0; i > i_39_; i_39_++) {
			if (aClass114Array2186[i_39_] != null) {
				aClass114Array2186[i_39_].aBoolean1108 = class120_sub7.getUByte() == 0;
			}
		}
		for (int i_40_ = 0; i_40_ < i; i_40_++) {
			if (aClass114Array2186[i_40_] != null) {
				aClass114Array2186[i_40_].aBoolean1101 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_41_ = 0; i > i_41_; i_41_++) {
			if (aClass114Array2186[i_41_] != null) {
				aClass114Array2186[i_41_].aBoolean1100 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_42_ = 0; i > i_42_; i_42_++) {
			if (aClass114Array2186[i_42_] != null) {
				aClass114Array2186[i_42_].aBoolean1096 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_43_ = 0; i > i_43_; i_43_++) {
			if (aClass114Array2186[i_43_] != null) {
				aClass114Array2186[i_43_].aByte1105 = class120_sub7.getByte();
			}
		}
		for (int i_44_ = 0; i_44_ < i; i_44_++) {
			if (aClass114Array2186[i_44_] != null) {
				aClass114Array2186[i_44_].aByte1102 = class120_sub7.getByte();
			}
		}
		for (int i_45_ = 0; i > i_45_; i_45_++) {
			if (aClass114Array2186[i_45_] != null) {
				aClass114Array2186[i_45_].aByte1103 = class120_sub7.getByte();
			}
		}
		for (int i_46_ = 0; i > i_46_; i_46_++) {
			if (aClass114Array2186[i_46_] != null) {
				aClass114Array2186[i_46_].aByte1104 = class120_sub7.getByte();
			}
		}
		for (int i_47_ = 0; i_47_ < i; i_47_++) {
			if (aClass114Array2186[i_47_] != null) {
				aClass114Array2186[i_47_].aShort1106 = (short) class120_sub7.getUShort();
			}
		}
		if (class120_sub7.pos < class120_sub7.buf.length) {
			for (int i_48_ = 0; i_48_ < i; i_48_++) {
				if (aClass114Array2186[i_48_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_49_ = 0; i_49_ < i; i_49_++) {
				if (aClass114Array2186[i_49_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_50_ = 0; i_50_ < i; i_50_++) {
				if (aClass114Array2186[i_50_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_51_ = 0; i_51_ < i; i_51_++) {
				if (aClass114Array2186[i_51_] != null) {
					aClass114Array2186[i_51_].aBoolean1107 = class120_sub7.getUByte() == 1;
				}
			}
			for (int i_52_ = 0; i_52_ < i; i_52_++) {
				if (aClass114Array2186[i_52_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_53_ = 0; i_53_ < i; i_53_++) {
				if (aClass114Array2186[i_53_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_54_ = 0; i_54_ < i; i_54_++) {
				if (aClass114Array2186[i_54_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_55_ = 0; i_55_ < i; i_55_++) {
				if (aClass114Array2186[i_55_] != null) {
					class120_sub7.getUByte();
				}
			}
		}
	}
}
