/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

class Node {
	static int objCount;
	Node previous;
	Node next;
	static int countryId;
	long uid;
	static Canvas canvas;
	static JagexInterface[][] interfaceCache;
	static int[] anIntArray1151 = { 1, 4 };

	static final void deselectSpell() {
		if (Class88.spellSelected) {
			final JagexInterface jagexInterface = JagexInterface.getComponent(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked, JagexSocket.selectedSpellComponextIndex);
			if (jagexInterface != null && jagexInterface.onSpellDeselectionListener != null) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.objectData = jagexInterface.onSpellDeselectionListener;
				class120_sub10.aClass189_2534 = jagexInterface;
				Class88.method744(class120_sub10);
			}
			Class88.spellSelected = false;
			Class192.selectedSpellCursor = -1;
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
	}

	public static void method1030(final int i) {
		try {
			TextRepository.aString1148 = null;
			canvas = null;
			interfaceCache = null;
			anIntArray1151 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ni.TA(").append(i).append(')').toString());
		}
	}

	static final void method1031(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			int i_5_ = i_0_;
			int i_6_ = 0;
			final int i_7_ = i_0_ * i_0_;
			final int i_8_ = i_2_ * i_2_;
			final int i_9_ = i_8_ << 1;
			final int i_10_ = i_7_ << 1;
			final int i_11_ = i_0_ << 1;
			int i_12_ = -((i_11_ - 1) * i_9_) + i_7_;
			int i_13_ = (-i_11_ + 1) * i_8_ - -i_10_;
			final int i_14_ = i_8_ << 2;
			final int i_15_ = i_7_ << 2;
			int i_16_ = i_10_ * ((i_6_ << 1) + 3);
			int i_17_ = i_15_ * (1 + i_6_);
			int i_18_ = (-3 + (i_5_ << 1)) * i_9_;
			if (i >= Class120_Sub30_Sub2.anInt3699 && IdentityKit.anInt1334 >= i) {
				final int i_19_ = Class3.method83(Class32.anInt260, i_3_ + i_2_, ParamType.anInt3544);
				final int i_20_ = Class3.method83(Class32.anInt260, i_3_ - i_2_, ParamType.anInt3544);
				AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i], i_1_, i_20_, i_19_);
			}
			int i_21_ = i_14_ * (i_5_ + -1);
			while (i_5_ > 0) {
				if (i_13_ < 0) {
					while (i_13_ < 0) {
						i_13_ += i_16_;
						i_12_ += i_17_;
						i_17_ += i_15_;
						i_16_ += i_15_;
						i_6_++;
					}
				}
				i_5_--;
				if (i_12_ < 0) {
					i_12_ += i_17_;
					i_17_ += i_15_;
					i_13_ += i_16_;
					i_6_++;
					i_16_ += i_15_;
				}
				i_13_ += -i_21_;
				final int i_22_ = -i_5_ + i;
				i_12_ += -i_18_;
				i_21_ -= i_14_;
				final int i_23_ = i_5_ + i;
				i_18_ -= i_14_;
				if (i_23_ >= Class120_Sub30_Sub2.anInt3699 && IdentityKit.anInt1334 >= i_22_) {
					final int i_24_ = Class3.method83(Class32.anInt260, i_6_ + i_3_, ParamType.anInt3544);
					final int i_25_ = Class3.method83(Class32.anInt260, i_3_ - i_6_, ParamType.anInt3544);
					if (Class120_Sub30_Sub2.anInt3699 <= i_22_) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_22_], i_1_, i_25_, i_24_);
					}
					if (i_23_ <= IdentityKit.anInt1334) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_23_], i_1_, i_25_, i_24_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ni.AB(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	final boolean hasPrevious() {
		if (this.previous == null) {
			return false;
		}
		return true;
	}

	static final String method1033(final int count) {
		String string_27_ = Integer.toString(count);
		for (int i_28_ = string_27_.length() - 3; i_28_ > 0; i_28_ -= 3) {
			string_27_ = new StringBuilder(string_27_.substring(0, i_28_)).append(",").append(string_27_.substring(i_28_)).toString();
		}
		if (string_27_.length() > 9) {
			return new StringBuilder(" <col=00ff80>").append(string_27_.substring(0, string_27_.length() - 8)).append(Class120_Sub19.aString2653).append(" (").append(string_27_).append(")</col>").toString();
		}
		if (string_27_.length() > 6) {
			return new StringBuilder(" <col=ffffff>").append(string_27_.substring(0, string_27_.length() - 4)).append(MouseRecorder.aString854).append(" (").append(string_27_).append(")</col>").toString();
		}
		return new StringBuilder(" <col=ffff00>").append(string_27_).append("</col>").toString();
	}

	final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}

	public Node() {
		/* empty */
	}
}
