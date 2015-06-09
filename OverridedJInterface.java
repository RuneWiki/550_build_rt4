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
	static WorldMapFont aClass98_2739;
	static int worldListDataLength;
	static int[][][] activeTileHeightMap;
	static int worldListErrorCount = 0;
	static int[] maxParticleCount = { 2047, 16383, 65535 };
	int type;
	int interfaceId;
	static Deque reflectionCheckDeque;
	static int loadingBarPercent;

	static {
		worldListDataLength = 0;
		loadingBarPercent = 10;
		reflectionCheckDeque = new Deque();
	}

	static final void processReflectionChecks(final PacketBuffer packetBuffer) {
		for (;;) {
			final ReflectionCheckNode reflectionCheckNode = (ReflectionCheckNode) reflectionCheckDeque.getFront();
			if (reflectionCheckNode == null) {
				break;
			}
			boolean shouldNotSend = false;
			for (int id = 0; id < reflectionCheckNode.count; id++) {
				if (reflectionCheckNode.fieldsInformationNode[id] != null) {
					if (reflectionCheckNode.fieldsInformationNode[id].status == 2) {
						reflectionCheckNode.errorTypes[id] = -5;
					}
					if (reflectionCheckNode.fieldsInformationNode[id].status == 0) {
						shouldNotSend = true;
					}
				}
				if (reflectionCheckNode.methodsInformationNode[id] != null) {
					if (reflectionCheckNode.methodsInformationNode[id].status == 2) {
						reflectionCheckNode.errorTypes[id] = -6;
					}
					if (reflectionCheckNode.methodsInformationNode[id].status == 0) {
						shouldNotSend = true;
					}
				}
			}
			if (shouldNotSend) {
				break;
			}
			packetBuffer.putByteIsaac(78);
			packetBuffer.putByte(0);
			final int startPos = packetBuffer.pos;
			packetBuffer.putInt(reflectionCheckNode.uid);
			for (int id = 0; id < reflectionCheckNode.count; id++) {
				if (reflectionCheckNode.errorTypes[id] != 0) {
					packetBuffer.putByte(reflectionCheckNode.errorTypes[id]);
				} else {
					try {
						final int type = reflectionCheckNode.checkTypes[id];
						if (type == 0) {
							final Field field = (Field) reflectionCheckNode.fieldsInformationNode[id].value;
							final int fieldValue = field.getInt(null);
							packetBuffer.putByte(0);
							packetBuffer.putInt(fieldValue);
						} else if (type == 1) {
							final Field field = (Field) reflectionCheckNode.fieldsInformationNode[id].value;
							field.setInt(null, reflectionCheckNode.fieldsValue[id]);
							packetBuffer.putByte(0);
						} else if (type == 2) {
							final Field field = (Field) reflectionCheckNode.fieldsInformationNode[id].value;
							final int fieldModifier = field.getModifiers();
							packetBuffer.putByte(0);
							packetBuffer.putInt(fieldModifier);
						} else if (type == 3) {
							final Method method = (Method) reflectionCheckNode.methodsInformationNode[id].value;
							final byte[][] argumentData = reflectionCheckNode.methodsArgumentData[id];
							final Object[] arguments = new Object[argumentData.length];
							for (int argId = 0; argId < argumentData.length; argId++) {
								final ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(argumentData[argId]));
								arguments[argId] = objectinputstream.readObject();
							}
							final Object object = method.invoke(null, arguments);
							if (object == null) {
								packetBuffer.putByte(0);
							} else if (object instanceof Number) {
								packetBuffer.putByte(1);
								packetBuffer.putLong(((Number) object).longValue());
							} else if (object instanceof String) {
								packetBuffer.putByte(2);
								packetBuffer.putJagexString((String) object);
							} else {
								packetBuffer.putByte(4);
							}
						} else if (type == 4) {
							final Method method = (Method) reflectionCheckNode.methodsInformationNode[id].value;
							final int methodModifier = method.getModifiers();
							packetBuffer.putByte(0);
							packetBuffer.putInt(methodModifier);
						}
					} catch (final ClassNotFoundException classnotfoundexception) {
						packetBuffer.putByte(-10);
					} catch (final InvalidClassException invalidclassexception) {
						packetBuffer.putByte(-11);
					} catch (final StreamCorruptedException streamcorruptedexception) {
						packetBuffer.putByte(-12);
					} catch (final OptionalDataException optionaldataexception) {
						packetBuffer.putByte(-13);
					} catch (final IllegalAccessException illegalaccessexception) {
						packetBuffer.putByte(-14);
					} catch (final IllegalArgumentException illegalargumentexception) {
						packetBuffer.putByte(-15);
					} catch (final InvocationTargetException invocationtargetexception) {
						packetBuffer.putByte(-16);
					} catch (final SecurityException securityexception) {
						packetBuffer.putByte(-17);
					} catch (final IOException ioexception) {
						packetBuffer.putByte(-18);
					} catch (final NullPointerException nullpointerexception) {
						packetBuffer.putByte(-19);
					} catch (final Exception exception) {
						packetBuffer.putByte(-20);
					} catch (final Throwable throwable) {
						packetBuffer.putByte(-21);
					}
				}
			}
			packetBuffer.putCrc(startPos);
			packetBuffer.putByteAt(packetBuffer.pos - startPos);
			reflectionCheckNode.unlink();
		}
	}

	public OverridedJInterface() {
		/* empty */
	}
}
