/* Class120_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AmbientSound extends Node {
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2478;
	static js5 aClass50_2479;
	int anInt2480 = 0;
	int anInt2481;
	int[] anIntArray2482;
	int anInt2483;
	static boolean aBoolean2484 = false;
	int anInt2485;
	int anInt2486;
	int anInt2487;
	Class120_Sub30_Sub4 aClass120_Sub30_Sub4_2488;
	int anInt2489;
	static int hitmarksId;
	boolean aBoolean2491;
	Npc npc;
	int anInt2493;
	int anInt2494;
	Player player;
	int anInt2496;
	LocType location;
	int anInt2498;
	int anInt2499;

	static final void translateToFrench() {
		World.aString2837 = "Librairie 3D d\u00e9marr\u00e9e";
		NpcType.aString1685 = "clignotant3:";
		Class120_Sub12_Sub18.aString3272 = "Chargement de RuneScape en cours - veuillez patienter...";
		Class156.aString1457 = "brillant2:";
		Class120_Sub12_Sub21_Sub1.aString3911 = "niveau ";
		GameEntity.aString3011 = "d\u00e9roulement:";
		Class120_Sub12_Sub27.aString3338 = "V\u00e9rification des mises \u00e0 jour - ";
		Class109.aString1038 = "Gestionnaire de saisie charg\u00e9";
		Class53_Sub1.aString2206 = "clignotant2:";
		AbstractGraphicsBuffer.aString1176 = "Utiliser";
		Class147.aString1398 = "ondulation2:";
		Class111.aString1062 = "brillant1:";
		Class136.aString1316 = "brillant3:";
		Class120_Sub11.aString2550 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).";
		Class120_Sub14_Sub1.aString3449 = "Prendre";
		Class120_Sub11.aString2554 = "Chargement des param\u00e8tres par d\u00e9faut - ";
		Class174.aString1733 = "comp\u00e9tence ";
		Class120_Sub3.aString2424 = "classement ";
		HintIcon.aString807 = "ondulation:";
		Class120_Sub14_Sub23.aString3655 = "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.";
		Class116.aString1116 = "Connexion perdue.";
		Class5.aString2153 = "Fermer";
		ClanMember.aString2578 = " de votre liste noire.";
		DisplayModeInfo.aString1708 = "Monde de jeu cr\u00e9\u00e9";
		Class11.aString82 = "Connect\u00e9 au serveur de mise \u00e0 jour";
		Class120_Sub12_Sub1.aString3132 = "Atteindre";
		Class120_Sub15.aString2594 = "Liste des mises \u00e0 jour charg\u00e9e";
		Class8.aString64 = "Jeter";
		SceneGroundObject.aString2849 = "Veuillez commencer par supprimer ";
		AbstractRequest.aString3575 = "violet:";
		Class142.aString1358 = "Textures charg\u00e9es";
		CursorType.aString1238 = "K";
		Class11.aString81 = "Examiner";
		Class71.aString626 = "Veuillez patienter...";
		Class24.aString142 = "Veuillez patienter - tentative de r\u00e9tablissement.";
		Js5Worker.aString398 = "Chargement du module texte - ";
		Class65.aString591 = "Attaquer";
		Class120_Sub12_Sub21_Sub1.aString3910 = " est d\u00e9j\u00e0 dans votre liste d'amis.";
		PlayerAppearance.aString1368 = "M\u00e9moire attribu\u00e9e";
		DummyInputStream.aString25 = "Objet d'abonn\u00e9s";
		Class69_Sub2_Sub1.aString3078 = " est d\u00e9j\u00e0 dans votre liste noire.";
		Class69_Sub1.aString2231 = "jaune:";
		MouseRecorder.aString853 = "M\u00e9moire en cours d'attribution";
		Class120_Sub6.aString2444 = "Liste des serveurs charg\u00e9e";
		Class101_Sub3.aString2285 = "Poser";
		Class147.aString1397 = "clignotant1:";
		Class120_Sub12_Sub25.aString3319 = "Veuillez commencer par supprimer ";
		Class121.aString1155 = "Polices charg\u00e9es";
		Class120_Sub12_Sub28.okString = "OK";
		Class29.aString217 = "Chargement de l'\u00e9cran-titre - ";
		Class143_Sub1.aString2192 = "Votre liste noire est pleine (100 noms maximum).";
		NodeSub.aString2585 = "Fichiers config charg\u00e9s";
		Js5Worker.aString400 = "D\u00e9marrage de la librairie 3D";
		Class108_Sub3.aString2396 = "Chargement de Mechscape en cours - veuillez patienter...";
		Class120_Sub11.aString2553 = " autres options";
		Class61.aString568 = "voudrait faire un \u00e9change avec vous.";
		Class120_Sub30_Sub2.aString3679 = "Chargement en cours. Veuillez patienter.";
		MouseRecorder.aString854 = "K";
		Class29.aString196 = " ";
		Class120_Sub14_Sub24.aString3665 = "Chargement des sprites - ";
		Class114.aString1098 = "Chargement de la liste des serveurs";
		Class120_Sub19.aString2653 = "M";
		Class120_Sub12_Sub1.aString3137 = "Param\u00e8tres par d\u00e9faut charg\u00e9s";
		InterfaceListener.aString2538 = "glissement:";
		Class120_Sub21.aString2669 = " s'est connect\u00e9.";
		Class180_Sub6.aString3062 = "Impossible de trouver ";
		Class53_Sub1.aString2213 = "rouge:";
		AbstractIndexedSprite.aString1025 = "Moteur son pr\u00e9par\u00e9";
		Class120_Sub24.aString2726 = "Sprites charg\u00e9s";
		IntegerNode.aString2788 = "Chargement des interfaces - ";
		Class69.aString618 = "vert:";
		Class132.aString1250 = " s'est d\u00e9connect\u00e9.";
		Class158.aString1483 = "cyan:";
		Class84.aString799 = "Interfaces charg\u00e9es";
		InterfaceClickMask.aString2660 = "Chargement des polices - ";
		Class120_Sub3.aString2428 = "Chargement des fichiers config - ";
		CursorType.aString1239 = "\u00c9cran-titre charg\u00e9";
		Class109.continueString = "Continuer";
		SceneGroundObject.aString2847 = "Module texte charg\u00e9";
		Class143.selectString = "S\u00e9lectionner";
		Class54.aString489 = " de votre liste d'amis.";
		ClanMember.aString2574 = "blanc:";
		Class36.aString313 = "Chargement en cours...";
		Class120_Sub11.aString2552 = "\u00c9cran-titre ouvert";
		Class120_Sub12_Sub30.aString3371 = "Chargement des textures - ";
		Class120_Sub12_Sub15.aString3244 = "Cach\u00e9";
		Class82.aString787 = "Regarder dans cette direction";
		Class112.aString1079 = "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.";
		EnumType.aString3455 = "M";
		Class111.aString1056 = "Choisir une option";
		Class157.aString1462 = "Annuler";
		Class191.aString2105 = "Connexion au serveur de mise \u00e0 jour en cours";
		Class96.aString915 = "tremblement:";
	}

	final void method1156() {
		final int i_0_ = this.anInt2485;
		if (this.location == null) {
			if (this.npc != null) {
				final int i_1_ = Class20.method178(this.npc);
				if (i_0_ != i_1_) {
					this.anInt2485 = i_1_;
					NpcType npcType = this.npc.npcType;
					if (npcType.childrenIDs != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType != null) {
						this.anInt2493 = 128 * npcType.anInt1677;
						this.anInt2499 = npcType.anInt1658;
					} else {
						this.anInt2499 = this.anInt2493 = 0;
					}
				}
			} else if (this.player != null) {
				this.anInt2485 = Class20.method179(this.player);
				this.anInt2493 = 128 * this.player.anInt3735;
				this.anInt2499 = this.player.anInt3739;
			}
		} else {
			final LocType locType = this.location.handleVarp();
			if (locType == null) {
				this.anInt2489 = 0;
				this.anInt2493 = 0;
				this.anIntArray2482 = null;
				this.anInt2499 = 0;
				this.anInt2485 = -1;
				this.anInt2486 = 0;
			} else {
				this.anInt2485 = locType.anInt1833;
				this.anInt2489 = locType.anInt1879;
				this.anInt2486 = locType.anInt1845;
				this.anInt2493 = 128 * locType.anInt1832;
				this.anInt2499 = locType.anInt1839;
				this.anIntArray2482 = locType.anIntArray1870;
			}
		}
		if (this.anInt2485 != i_0_ && this.aClass120_Sub30_Sub4_2488 != null) {
			Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(this.aClass120_Sub30_Sub4_2488);
			this.aClass120_Sub30_Sub4_2488 = null;
		}
	}

	public static void method1157(final int i) {
		try {
			if (i != 0) {
				method1157(-41);
			}
			aClass50_2479 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gn.B(").append(i).append(')').toString());
		}
	}

	static final void method1158(final int i, final int i_3_) {
		if (client.cameraType == 2) {
			OverlayType.renderPitch = i;
			Class180_Sub3.renderYaw = i_3_;
		}
		DummyOutputStream.aFloat28 = i_3_;
		Class120_Sub12_Sub21.aFloat3293 = i;
		Class127.method1892();
		Class118.aBoolean1134 = true;
	}

	static final void method1159() {
		Class158.aBoolean1478 = true;
	}

	static final void fillArray(final int[] src, final int val, int i_5_, int i_6_) {
		final int i_7_ = -7 + --i_6_;
		i_5_--;
		while (i_5_ < i_7_) {
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
			src[++i_5_] = val;
		}
		while (i_6_ > i_5_) {
			src[++i_5_] = val;
		}
	}
}
