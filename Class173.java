/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class173 {
	static boolean[] aBooleanArray1723;
	static int anInt1724;
	static AbstractSprite aClass120_Sub14_Sub19_1725;
	static int anInt1726;
	static int hintmapmarkersId;
	static int anInt1728 = 0;
	static int gameLevel;
	static int[] anIntArray1730;

	static {
		aBooleanArray1723 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
		anIntArray1730 = new int[4];
		anInt1724 = 0;
	}

	static final void method2225() {
		if (Class86.aClass120_Sub18ArrayArrayArray820 != null) {
			for (int i = 0; i < Class86.aClass120_Sub18ArrayArrayArray820.length; i++) {
				for (int i_0_ = 0; i_0_ < Class186.anInt1900; i_0_++) {
					for (int i_1_ = 0; i_1_ < Class120_Sub12_Sub38.anInt3440; i_1_++) {
						Class86.aClass120_Sub18ArrayArrayArray820[i][i_0_][i_1_] = null;
					}
				}
			}
		}
		SceneGroundObject.aClass120_Sub9ArrayArray2844 = null;
		if (Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437 != null) {
			for (int i = 0; i < Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437.length; i++) {
				for (int i_2_ = 0; i_2_ < Class186.anInt1900; i_2_++) {
					for (int i_3_ = 0; i_3_ < Class120_Sub12_Sub38.anInt3440; i_3_++) {
						Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437[i][i_2_][i_3_] = null;
					}
				}
			}
		}
		IntegerNode.aClass120_Sub9ArrayArray2789 = null;
		Class49.anInt438 = 0;
		if (SceneGraphNode.aClass188Array1782 != null) {
			for (int i = 0; i < Class49.anInt438; i++) {
				SceneGraphNode.aClass188Array1782[i] = null;
			}
		}
		if (Class111.aClass28Array1057 != null) {
			for (int i = 0; i < ClientScript.anInt3556; i++) {
				Class111.aClass28Array1057[i] = null;
			}
			ClientScript.anInt3556 = 0;
		}
		if (Class39.aClass28Array323 != null) {
			for (int i = 0; i < Class39.aClass28Array323.length; i++) {
				Class39.aClass28Array323[i] = null;
			}
		}
	}

	static final int method2226(final byte i, final int i_4_) {
		int i_5_;
		try {
			if (i > -93) {
				aClass120_Sub14_Sub19_1725 = null;
			}
			final VarBit varBit = VarBit.list(i_4_);
			final int i_6_ = varBit.setting;
			final int i_7_ = varBit.startBit;
			final int i_8_ = varBit.endBit;
			final int i_9_ = Class120_Sub14_Sub15.anIntArray3580[-i_7_ + i_8_];
			i_5_ = i_9_ & Class2.permanentVariable[i_6_] >> i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("uf.B(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return i_5_;
	}

	static final void translateToSpanish() {
		InterfaceClickMask.aString2660 = "Carregando fontes - ";
		Class120_Sub19.aString2653 = "M";
		DummyInputStream.aString25 = "Objeto para membros";
		SceneGroundObject.aString2849 = "Remova ";
		MouseRecorder.aString853 = "Alocando mem\u00f3ria";
		Class120_Sub12_Sub30.aString3371 = "Carregando /secure/libs_v4s/RCras - ";
		Class108_Sub3.aString2396 = "Mechscape carregando. Aguarde...";
		Class109.aString1038 = "Gerenciador de entradas carregado";
		NpcType.aString1685 = "brilho3:";
		Class120_Sub12_Sub1.aString3137 = "Padr\u00f5es carregados";
		Class8.aString64 = "Descartar";
		AbstractRequest.aString3575 = "roxo:";
		AbstractGraphicsBuffer.aString1176 = "Usar";
		Class120_Sub14_Sub24.aString3665 = "Carregando sprites - ";
		Class82.aString787 = "Virar para c\u00e1";
		CursorType.aString1238 = "K";
		Class69_Sub1.aString2231 = "amarelo:";
		Class180_Sub6.aString3062 = "N\u00e3o \u00e9 poss\u00edvel encontrar ";
		ClanMember.aString2578 = " da sua lista de ignorados primeiro.";
		Class120_Sub15.aString2594 = "Lista de atualiza\u00e7\u00f5es carregada";
		Class69_Sub2_Sub1.aString3078 = " j\u00e1 est\u00e1 na sua lista de ignorados.";
		Class109.continueString = "Continuar";
		Class121.aString1155 = "Fontes carregadas";
		Class65.aString591 = "Atacar";
		Class116.aString1116 = "Conex\u00e3o perdida.";
		Class174.aString1733 = "habilidade: ";
		Class24.aString142 = "Tentando reestabelecer conex\u00e3o. Aguarde.";
		Class45.aString400 = "Iniciando biblioteca 3D";
		AbstractIndexedSprite.aString1025 = "Mecanismo de som preparado";
		Class101_Sub3.aString2285 = "Largar";
		Class120_Sub12_Sub18.aString3272 = "RuneScape carregando. Aguarde...";
		Class111.aString1062 = "brilho1:";
		EnumType.aString3455 = "M";
		Class136.aString1316 = "brilho3:";
		Class69.aString618 = "verde:";
		Class120_Sub12_Sub27.aString3338 = "Verificando atualiza\u00e7\u00f5es - ";
		Class29.aString196 = " ";
		Class120_Sub11.aString2552 = "Tela t\u00edtulo aberta";
		Class120_Sub14_Sub1.aString3449 = "Pegar";
		HintIcon.aString807 = "onda:";
		Class147.aString1398 = "onda2:";
		Class84.aString799 = "Interfaces carregadas";
		PlayerAppearance.aString1368 = "Mem\u00f3ria alocada";
		Class11.aString82 = "Conectado ao servidor de atualiza\u00e7\u00e3o";
		Class36.aString313 = "Carregando...";
		Class120_Sub12_Sub25.aString3319 = "Remova ";
		GameEntity.aString3011 = "rolagem:";
		Class120_Sub30_Sub2.aString3679 = "Carregando. Aguarde.";
		Class143_Sub1.aString2192 = "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.";
		Class54.aString489 = " da sua lista de amigos primeiro.";
		Class120_Sub3.aString2424 = "qualifica\u00e7\u00e3o: ";
		ClanMember.aString2574 = "branco:";
		Class191.aString2105 = "Conectando ao servidor de atualiza\u00e7\u00e3o";
		Class158.aString1483 = "cyan:";
		Class120_Sub6.aString2444 = "Dados da lista de mundos carregados";
		Class29.aString217 = "Carregando tela t\u00edtulo - ";
		Class120_Sub11.aString2554 = "Carregando padr\u00f5es - ";
		Class120_Sub12_Sub21_Sub1.aString3911 = "n\u00edvel: ";
		Class132.aString1250 = " saiu do jogo.";
		MouseRecorder.aString854 = "K";
		NodeSub.aString2585 = "Config carregada";
		Class111.aString1056 = "Selecionar op\u00e7\u00e3o";
		World.aString2837 = "Biblioteca 3D iniciada";
		Class96.aString915 = "tremor:";
		Class120_Sub12_Sub28.okString = "Ok";
		SceneGroundObject.aString2847 = "Pacote de palavras carregado";
		Class156.aString1457 = "brilho2:";
		Class112.aString1079 = "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados.";
		Class120_Sub24.aString2726 = "Sprites carregados";
		CursorType.aString1239 = "Tela t\u00edtulo carregada";
		Class157.aString1462 = "Cancelar";
		Class147.aString1397 = "flash1:";
		Class114.aString1098 = "Carregando dados da lista de mundos";
		Class120_Sub11.aString2550 = "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 100 para os usu\u00e1rios n\u00e3o pagantes e 200 para os membros.";
		Class120_Sub11.aString2553 = " mais op\u00e7\u00f5es";
		Class71.aString626 = "Aguarde...";
		Class5.aString2153 = "Fechar";
		Class120_Sub12_Sub21_Sub1.aString3910 = " j\u00e1 est\u00e1 na sua lista de amigos.";
		Class120_Sub14_Sub23.aString3655 = "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.";
		Class120_Sub12_Sub1.aString3132 = "Caminhar para c\u00e1";
		Class143.selectString = "Selecionar";
		Class11.aString81 = "Examinar";
		InterfaceListener.aString2538 = "deslizamento:";
		Class120_Sub12_Sub15.aString3244 = "Oculto";
		Class120_Sub21.aString2669 = " entrou no jogo.";
		Class120_Sub3.aString2428 = "Carregando config - ";
		IntegerNode.aString2788 = "Carregando interfaces - ";
		Class53_Sub1.aString2206 = "flash2:";
		Class61.aString568 = "deseja negociar com voc\u00ea.";
		Class53_Sub1.aString2213 = "vermelho:";
		Class142.aString1358 = "Texturas carregadas";
		DisplayModeInfo.aString1708 = "Universo de jogo criado";
		Class45.aString398 = "Carregando pacote de palavras - ";
	}

	public static void method2229(final byte i) {
		try {
			aClass120_Sub14_Sub19_1725 = null;
			if (i != 59) {
				anInt1728 = 57;
			}
			anIntArray1730 = null;
			aBooleanArray1723 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("uf.E(").append(i).append(')').toString());
		}
	}
}
