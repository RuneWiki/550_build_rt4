/* Class120_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class OverridedJInterface extends Node {
	static int worldOff;
	static Class98 aClass98_2739;
	static int anInt2740;
	static int[][][] anIntArrayArrayArray2741;
	static int anInt2742 = 0;
	static int[] anIntArray2743 = { 2047, 16383, 65535 };
	int type;
	int interfaceId;
	static Deque aClass105_2746;
	static int loadingBarPercent;

	static {
		anInt2740 = 0;
		loadingBarPercent = 10;
		aClass105_2746 = new Deque();
	}

	static final void method1722(final PacketBuffer class120_sub7_sub1, final boolean bool, final int i) {
		try {
			if (!bool) {
				aClass105_2746 = null;
			}
			for (;;) {
				final Class120_Sub28 class120_sub28 = (Class120_Sub28) aClass105_2746.getFront();
				if (class120_sub28 == null) {
					break;
				}
				boolean bool_0_ = false;
				for (int i_1_ = 0; class120_sub28.anInt2753 > i_1_; i_1_++) {
					if (class120_sub28.aClass185Array2755[i_1_] != null) {
						if (class120_sub28.aClass185Array2755[i_1_].status == 2) {
							class120_sub28.anIntArray2763[i_1_] = -5;
						}
						if (class120_sub28.aClass185Array2755[i_1_].status == 0) {
							bool_0_ = true;
						}
					}
					if (class120_sub28.aClass185Array2760[i_1_] != null) {
						if (class120_sub28.aClass185Array2760[i_1_].status == 2) {
							class120_sub28.anIntArray2763[i_1_] = -6;
						}
						if (class120_sub28.aClass185Array2760[i_1_].status == 0) {
							bool_0_ = true;
						}
					}
				}
				if (bool_0_) {
					break;
				}
				class120_sub7_sub1.putByteIsaac(i);
				class120_sub7_sub1.putByte(0);
				final int i_2_ = class120_sub7_sub1.pos;
				class120_sub7_sub1.putInt(class120_sub28.anInt2757);
				for (int i_3_ = 0; i_3_ < class120_sub28.anInt2753; i_3_++) {
					if (class120_sub28.anIntArray2763[i_3_] != 0) {
						class120_sub7_sub1.putByte(class120_sub28.anIntArray2763[i_3_]);
					} else {
						try {
							final int i_4_ = class120_sub28.anIntArray2756[i_3_];
							if (i_4_ == 0) {
								final Field field = (Field) class120_sub28.aClass185Array2755[i_3_].value;
								final int i_5_ = field.getInt(null);
								class120_sub7_sub1.putByte(0);
								class120_sub7_sub1.putInt(i_5_);
							} else if (i_4_ == 1) {
								final Field field = (Field) class120_sub28.aClass185Array2755[i_3_].value;
								field.setInt(null, class120_sub28.anIntArray2752[i_3_]);
								class120_sub7_sub1.putByte(0);
							} else if (i_4_ == 2) {
								final Field field = (Field) class120_sub28.aClass185Array2755[i_3_].value;
								final int i_6_ = field.getModifiers();
								class120_sub7_sub1.putByte(0);
								class120_sub7_sub1.putInt(i_6_);
							}
							if (i_4_ != 3) {
								if (i_4_ == 4) {
									final Method method = (Method) class120_sub28.aClass185Array2760[i_3_].value;
									final int i_7_ = method.getModifiers();
									class120_sub7_sub1.putByte(0);
									class120_sub7_sub1.putInt(i_7_);
								}
							} else {
								final Method method = (Method) class120_sub28.aClass185Array2760[i_3_].value;
								final byte[][] is = class120_sub28.aByteArrayArrayArray2750[i_3_];
								final Object[] objects = new Object[is.length];
								for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
									final ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(is[i_8_]));
									objects[i_8_] = objectinputstream.readObject();
								}
								final Object object = method.invoke(null, objects);
								if (object == null) {
									class120_sub7_sub1.putByte(0);
								} else if (object instanceof Number) {
									class120_sub7_sub1.putByte(1);
									class120_sub7_sub1.putLong(((Number) object).longValue());
								} else if (object instanceof String) {
									class120_sub7_sub1.putByte(2);
									class120_sub7_sub1.putJagexString((String) object);
								} else {
									class120_sub7_sub1.putByte(4);
								}
							}
						} catch (final ClassNotFoundException classnotfoundexception) {
							class120_sub7_sub1.putByte(-10);
						} catch (final InvalidClassException invalidclassexception) {
							class120_sub7_sub1.putByte(-11);
						} catch (final StreamCorruptedException streamcorruptedexception) {
							class120_sub7_sub1.putByte(-12);
						} catch (final OptionalDataException optionaldataexception) {
							class120_sub7_sub1.putByte(-13);
						} catch (final IllegalAccessException illegalaccessexception) {
							class120_sub7_sub1.putByte(-14);
						} catch (final IllegalArgumentException illegalargumentexception) {
							class120_sub7_sub1.putByte(-15);
						} catch (final InvocationTargetException invocationtargetexception) {
							class120_sub7_sub1.putByte(-16);
						} catch (final SecurityException securityexception) {
							class120_sub7_sub1.putByte(-17);
						} catch (final IOException ioexception) {
							class120_sub7_sub1.putByte(-18);
						} catch (final NullPointerException nullpointerexception) {
							class120_sub7_sub1.putByte(-19);
						} catch (final Exception exception) {
							class120_sub7_sub1.putByte(-20);
						} catch (final Throwable throwable) {
							class120_sub7_sub1.putByte(-21);
						}
					}
				}
				class120_sub7_sub1.putCrc(i_2_);
				class120_sub7_sub1.putSizedByte(class120_sub7_sub1.pos - i_2_);
				class120_sub28.unlink();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rl.A(").append(class120_sub7_sub1 != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(')').toString());
		}
	}

	public static void method1723(final int i) {
		try {
			aClass98_2739 = null;
			aClass105_2746 = null;
			if (i != -11) {
				anIntArrayArrayArray2741 = null;
			}
			anIntArray2743 = null;
			anIntArrayArrayArray2741 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rl.B(").append(i).append(')').toString());
		}
	}

	public OverridedJInterface() {
		/* empty */
	}
}
