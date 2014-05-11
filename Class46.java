/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;

final class Class46 implements Runnable {
	static int anInt414 = 5063219;
	static BigInteger aBigInteger415;
	private OutputStream anOutputStream416;
	private boolean aBoolean417 = false;
	private int anInt418 = 0;
	static int[][][] anIntArrayArrayArray419;
	static int anInt420 = -1;
	private byte[] aByteArray421;
	private final Socket aSocket422;
	static boolean aBoolean423 = false;
	private InputStream anInputStream424;
	private boolean aBoolean425 = false;
	static Class107_Sub1[] aClass107_Sub1Array426;
	private final Signlink aClass135_427;
	private SignlinkNode aClass185_428;
	private int anInt429 = 0;

	static {
		aBigInteger415 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	}

	public static void method372(final int i) {
		try {
			aBigInteger415 = null;
			anIntArrayArrayArray419 = null;
			if (i != 14420) {
				method372(31);
			}
			aClass107_Sub1Array426 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.C(").append(i).append(')').toString());
		}
	}

	final void method373(int i, final byte[] is, int i_0_, final byte i_1_) throws IOException {
		try {
			if (i_1_ <= 11) {
				anInt420 = -8;
			}
			if (!aBoolean417) {
				while (i_0_ > 0) {
					final int i_2_ = anInputStream424.read(is, i, i_0_);
					if (i_2_ <= 0) {
						throw new EOFException();
					}
					i_0_ -= i_2_;
					i += i_2_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.I(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final void method374(final int i) {
		try {
			if (Class120_Sub14_Sub18.anInt3609 != 0) {
				do {
					try {
						if ((++Class79_Sub1.anInt2244 ^ 0xffffffff) < -1501) {
							if (AbstractTimer.aClass46_825 != null) {
								AbstractTimer.aClass46_825.method377(i ^ ~0x129b);
								AbstractTimer.aClass46_825 = null;
							}
							if (Class137.anInt1323 >= 1) {
								Class48.anInt436 = -5;
								Class120_Sub14_Sub18.anInt3609 = 0;
								return;
							}
							Class120_Sub14_Sub18.anInt3609 = 1;
							Class137.anInt1323++;
							if (Class75.anInt675 != Class116.anInt1115) {
								Class116.anInt1115 = Class75.anInt675;
							} else {
								Class116.anInt1115 = Class183.anInt1808;
							}
							Class79_Sub1.anInt2244 = 0;
						}
						if (Class120_Sub14_Sub18.anInt3609 == 1) {
							Class53_Sub1.aClass185_2217 = NpcType.gameSignlink.method1976(19, Class120_Sub12_Sub30.aString3372, Class116.anInt1115);
							Class120_Sub14_Sub18.anInt3609 = 2;
						}
						if (Class120_Sub14_Sub18.anInt3609 == 2) {
							if (Class53_Sub1.aClass185_2217.status == 2) {
								throw new IOException();
							}
							if (Class53_Sub1.aClass185_2217.status != 1) {
								return;
							}
							AbstractTimer.aClass46_825 = new Class46((Socket) Class53_Sub1.aClass185_2217.value, NpcType.gameSignlink);
							Class53_Sub1.aClass185_2217 = null;
							AbstractTimer.aClass46_825.method381(0, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.buf, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos, i ^ 0x2dc5);
							if (Class120_Sub12_Sub3.aClass164_3150 != null) {
								Class120_Sub12_Sub3.aClass164_3150.method2131(i + -22771);
							}
							if (Class120_Sub12_Sub29.aClass164_3366 != null) {
								Class120_Sub12_Sub29.aClass164_3366.method2131(2);
							}
							final int i_3_ = AbstractTimer.aClass46_825.read();
							if (Class120_Sub12_Sub3.aClass164_3150 != null) {
								Class120_Sub12_Sub3.aClass164_3150.method2131(2);
							}
							if (Class120_Sub12_Sub29.aClass164_3366 != null) {
								Class120_Sub12_Sub29.aClass164_3366.method2131(2);
							}
							if (i_3_ == 101) {
								Class120_Sub14_Sub18.anInt3609 = 3;
							} else {
								Class48.anInt436 = i_3_;
								Class120_Sub14_Sub18.anInt3609 = 0;
								AbstractTimer.aClass46_825.method377(i ^ ~0x129b);
								AbstractTimer.aClass46_825 = null;
								return;
							}
						}
						if (Class120_Sub14_Sub18.anInt3609 != 3) {
							break;
						}
						if (AbstractTimer.aClass46_825.method375((byte) -72) >= 2) {
							final int i_4_ = AbstractTimer.aClass46_825.read() << 8 | AbstractTimer.aClass46_825.read();
							Class188.method2483((byte) 125, i_4_);
							if ((Class157.anInt1469 ^ 0xffffffff) == 0) {
								Class120_Sub14_Sub18.anInt3609 = 0;
								Class48.anInt436 = 6;
								AbstractTimer.aClass46_825.method377(-19055);
								AbstractTimer.aClass46_825 = null;
							} else {
								Class120_Sub14_Sub18.anInt3609 = 0;
								AbstractTimer.aClass46_825.method377(i ^ ~0x129b);
								AbstractTimer.aClass46_825 = null;
								Class120_Sub1.method1037((byte) -120);
							}
						}
					} catch (final IOException ioexception) {
						if (AbstractTimer.aClass46_825 != null) {
							AbstractTimer.aClass46_825.method377(-19055);
							AbstractTimer.aClass46_825 = null;
						}
						if (Class137.anInt1323 < 1) {
							Class137.anInt1323++;
							Class79_Sub1.anInt2244 = 0;
							if (Class116.anInt1115 == Class75.anInt675) {
								Class116.anInt1115 = Class183.anInt1808;
							} else {
								Class116.anInt1115 = Class75.anInt675;
							}
							Class120_Sub14_Sub18.anInt3609 = 1;
						} else {
							Class120_Sub14_Sub18.anInt3609 = 0;
							Class48.anInt436 = -4;
						}
						break;
					}
					return;
				} while (false);
				if (i != 22773) {
					method376(true, -13);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.J(").append(i).append(')').toString());
		}
	}

	final int method375(final byte i) throws IOException {
		int i_5_;
		try {
			if (aBoolean417) {
				return 0;
			}
			i_5_ = anInputStream424.available();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.D(").append(i).append(')').toString());
		}
		return i_5_;
	}

	static final void method376(final boolean bool, final int i) {
		try {
			if (i != -1 && Class50.method434(-125, i) && bool) {
				final Class189[] class189s = Node.aClass189ArrayArray1150[i];
				Class189[] class189s_7_;
				final int i_6_ = (class189s_7_ = class189s).length;
				for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
					final Class189 class189 = class189s_7_[i_8_];
					if (class189.anObjectArray2034 != null) {
						final Class120_Sub10 class120_sub10 = new Class120_Sub10();
						class120_sub10.anObjectArray2537 = class189.anObjectArray2034;
						class120_sub10.aClass189_2534 = class189;
						Class21.method194(class120_sub10, false, 2000000);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.F(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	final void method377(final int i) {
		try {
			if (i != -19055) {
				aByteArray421 = null;
			}
			if (!aBoolean417) {
				synchronized (this) {
					aBoolean417 = true;
					notifyAll();
				}
				if (aClass185_428 != null) {
					while (aClass185_428.status == 0) {
						PacketBuffer.sleepWrapper(1L);
					}
					if (aClass185_428.status == 1) {
						try {
							((Thread) aClass185_428.value).join();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				aClass185_428 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.G(").append(i).append(')').toString());
		}
	}

	final void method378(final byte i) {
		try {
			if (i != 52) {
				aBoolean423 = true;
			}
			if (!aBoolean417) {
				anInputStream424 = new InputStream_Sub1();
				anOutputStream416 = new OutputStream_Sub1();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.E(").append(i).append(')').toString());
		}
	}

	final int read() throws IOException {
		if (aBoolean417) {
			return 0;
		}
		return anInputStream424.read();
	}

	@Override
	protected final void finalize() {
		try {
			method377(-19055);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "eo.finalize()");
		}
	}

	final void method380(final byte i) throws IOException {
		try {
			if (!aBoolean417) {
				if (i != -120) {
					method376(false, 116);
				}
				if (aBoolean425) {
					aBoolean425 = false;
					throw new IOException();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.B(").append(i).append(')').toString());
		}
	}

	@Override
	public final void run() {
		do {
			try {
				try {
					for (;;) {
						int i;
						int i_9_;
						synchronized (this) {
							if (anInt429 == anInt418) {
								if (aBoolean417) {
									break;
								}
								try {
									this.wait();
								} catch (final InterruptedException interruptedexception) {
									/* empty */
								}
							}
							i = anInt418;
							if (anInt418 <= anInt429) {
								i_9_ = anInt429 - anInt418;
							} else {
								i_9_ = 5000 + -anInt418;
							}
						}
						if (i_9_ > 0) {
							try {
								anOutputStream416.write(aByteArray421, i, i_9_);
							} catch (final IOException ioexception) {
								aBoolean425 = true;
							}
							anInt418 = (i_9_ + anInt418) % 5000;
							try {
								if (anInt429 == anInt418) {
									anOutputStream416.flush();
								}
							} catch (final IOException ioexception) {
								aBoolean425 = true;
							}
						}
					}
					try {
						if (anInputStream424 != null) {
							anInputStream424.close();
						}
						if (anOutputStream416 != null) {
							anOutputStream416.close();
						}
						if (aSocket422 != null) {
							aSocket422.close();
						}
					} catch (final IOException ioexception) {
						/* empty */
					}
					aByteArray421 = null;
				} catch (final Exception exception) {
					Class180_Sub3.method2312(exception, null);
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, "eo.run()");
			}
		} while (false);
	}

	final void method381(final int i, final byte[] is, final int i_10_, final int i_11_) throws IOException {
		try {
			if (i_11_ != 30000) {
				anInputStream424 = null;
			}
			if (!aBoolean417) {
				if (aBoolean425) {
					aBoolean425 = false;
					throw new IOException();
				}
				if (aByteArray421 == null) {
					aByteArray421 = new byte[5000];
				}
				synchronized (this) {
					for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
						aByteArray421[anInt429] = is[i_12_ + i];
						anInt429 = (anInt429 - -1) % 5000;
						if ((anInt418 - -4900) % 5000 == anInt429) {
							throw new IOException();
						}
					}
					if (aClass185_428 == null) {
						aClass185_428 = aClass135_427.startThread(this, 3);
					}
					notifyAll();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eo.H(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_10_).append(',').append(i_11_).append(')').toString());
		}
	}

	Class46(final Socket socket, final Signlink signlink) throws IOException {
		aSocket422 = socket;
		aClass135_427 = signlink;
		aSocket422.setSoTimeout(30000);
		aSocket422.setTcpNoDelay(true);
		anInputStream424 = aSocket422.getInputStream();
		anOutputStream416 = aSocket422.getOutputStream();
	}
}
