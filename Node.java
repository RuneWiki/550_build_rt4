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
	static int[] anIntArray1151 = { 1, 4 };

	static final void targetLeave() {
		if (Class88.spellSelected) {
			final JagexInterface jagexInterface = JagexInterface.getComponent(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked, JagexSocket.selectedSpellComponextIndex);
			if (jagexInterface != null && jagexInterface.onTargetLeaveListener != null) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.objectData = jagexInterface.onTargetLeaveListener;
				class120_sub10.jagexInterface = jagexInterface;
				Class88.executeScript(class120_sub10);
			}
			Class88.spellSelected = false;
			Class192.selectedSpellCursor = -1;
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
	}

	static final void method1031(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
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
		if (i >= Class120_Sub30_Sub2.anInt3699 && Identikit.anInt1334 >= i) {
			final int i_19_ = Class3.method83(MagnetType.anInt260, i_3_ + i_2_, ParamType.anInt3544);
			final int i_20_ = Class3.method83(MagnetType.anInt260, i_3_ - i_2_, ParamType.anInt3544);
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
			if (i_23_ >= Class120_Sub30_Sub2.anInt3699 && Identikit.anInt1334 >= i_22_) {
				final int i_24_ = Class3.method83(MagnetType.anInt260, i_6_ + i_3_, ParamType.anInt3544);
				final int i_25_ = Class3.method83(MagnetType.anInt260, i_3_ - i_6_, ParamType.anInt3544);
				if (Class120_Sub30_Sub2.anInt3699 <= i_22_) {
					AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_22_], i_1_, i_25_, i_24_);
				}
				if (i_23_ <= Identikit.anInt1334) {
					AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_23_], i_1_, i_25_, i_24_);
				}
			}
		}
	}

	final boolean hasPrevious() {
		if (this.previous == null) {
			return false;
		}
		return true;
	}

	static final String formatObjectCount(final int count) {
		String countAsString = Integer.toString(count);
		for (int id = countAsString.length() - 3; id > 0; id -= 3) {
			countAsString = countAsString.substring(0, id) + "," + countAsString.substring(id);
		}
		if (countAsString.length() > 9) {
			return " <col=00ff80>" + countAsString.substring(0, countAsString.length() - 8) + StringLibrary.aString2653 + " (" + countAsString + ")</col>";
		}
		if (countAsString.length() > 6) {
			return " <col=ffffff>" + countAsString.substring(0, countAsString.length() - 4) + StringLibrary.aString854 + " (" + countAsString + ")</col>";
		}
		return " <col=ffff00>" + countAsString + "</col>";
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
