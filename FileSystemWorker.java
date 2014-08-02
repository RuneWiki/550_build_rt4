/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileSystemWorker implements Runnable {
	static int localPlayerCount = 0;
	static int[] anIntArray789;
	private Queue requestQueue = new Queue();
	private boolean stopped = false;
	static int renderX;
	int requestsAwaiting = 0;
	static js5 aClass50_794;
	private Thread thread;

	@Override
	public final void run() {
		while (!stopped) {
			FileSystemRequest fsRequest;
			synchronized (requestQueue) {
				fsRequest = (FileSystemRequest) requestQueue.removeFirst();
				if (fsRequest != null) {
					this.requestsAwaiting--;
				} else {
					try {
						requestQueue.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (fsRequest.type == 2) {
					fsRequest.fileSystem.save(fsRequest.buffer, (int) fsRequest.subUid, fsRequest.buffer.length);
				} else if (fsRequest.type == 3) {
					fsRequest.buffer = fsRequest.fileSystem.get((int) fsRequest.subUid);
				}
			} catch (final Exception exception) {
				SpotAnimation.method2312(exception, null);
			}
			fsRequest.aBoolean3576 = false;
		}
	}

	final FileSystemRequest requestRead(final FileSystem fileSystem, final int id) {
		final FileSystemRequest fsRequest = new FileSystemRequest();
		fsRequest.type = 3;
		fsRequest.fileSystem = fileSystem;
		fsRequest.aBoolean3573 = false;
		fsRequest.subUid = id;
		putRequest(fsRequest);
		return fsRequest;
	}

	static final int a(final byte[] buffer, final String string, final int len, final int bufferPos, final int off) {
		final int i_6_ = len - off;
		for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
			final char c = string.charAt(off + i_7_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
				buffer[i_7_ + bufferPos] = (byte) c;
			} else if (c != '\u20ac') {
				if (c != '\u201a') {
					if (c != '\u0192') {
						if (c != '\u201e') {
							if (c != '\u2026') {
								if (c != '\u2020') {
									if (c == '\u2021') {
										buffer[i_7_ + bufferPos] = (byte) -121;
									} else if (c != '\u02c6') {
										if (c == '\u2030') {
											buffer[bufferPos - -i_7_] = (byte) -119;
										} else if (c != '\u0160') {
											if (c != '\u2039') {
												if (c != '\u0152') {
													if (c != '\u017d') {
														if (c == '\u2018') {
															buffer[bufferPos - -i_7_] = (byte) -111;
														} else if (c != '\u2019') {
															if (c == '\u201c') {
																buffer[bufferPos - -i_7_] = (byte) -109;
															} else if (c != '\u201d') {
																if (c == '\u2022') {
																	buffer[bufferPos + i_7_] = (byte) -107;
																} else if (c != '\u2013') {
																	if (c != '\u2014') {
																		if (c == '\u02dc') {
																			buffer[bufferPos - -i_7_] = (byte) -104;
																		} else if (c != '\u2122') {
																			if (c == '\u0161') {
																				buffer[i_7_ + bufferPos] = (byte) -102;
																			} else if (c != '\u203a') {
																				if (c != '\u0153') {
																					if (c != '\u017e') {
																						if (c != '\u0178') {
																							buffer[i_7_ + bufferPos] = (byte) 63;
																						} else {
																							buffer[bufferPos - -i_7_] = (byte) -97;
																						}
																					} else {
																						buffer[bufferPos + i_7_] = (byte) -98;
																					}
																				} else {
																					buffer[i_7_ + bufferPos] = (byte) -100;
																				}
																			} else {
																				buffer[bufferPos - -i_7_] = (byte) -101;
																			}
																		} else {
																			buffer[bufferPos - -i_7_] = (byte) -103;
																		}
																	} else {
																		buffer[i_7_ + bufferPos] = (byte) -105;
																	}
																} else {
																	buffer[i_7_ + bufferPos] = (byte) -106;
																}
															} else {
																buffer[i_7_ + bufferPos] = (byte) -108;
															}
														} else {
															buffer[i_7_ + bufferPos] = (byte) -110;
														}
													} else {
														buffer[bufferPos - -i_7_] = (byte) -114;
													}
												} else {
													buffer[i_7_ + bufferPos] = (byte) -116;
												}
											} else {
												buffer[i_7_ + bufferPos] = (byte) -117;
											}
										} else {
											buffer[bufferPos + i_7_] = (byte) -118;
										}
									} else {
										buffer[i_7_ + bufferPos] = (byte) -120;
									}
								} else {
									buffer[i_7_ + bufferPos] = (byte) -122;
								}
							} else {
								buffer[i_7_ + bufferPos] = (byte) -123;
							}
						} else {
							buffer[i_7_ + bufferPos] = (byte) -124;
						}
					} else {
						buffer[bufferPos + i_7_] = (byte) -125;
					}
				} else {
					buffer[bufferPos - -i_7_] = (byte) -126;
				}
			} else {
				buffer[i_7_ + bufferPos] = (byte) -128;
			}
		}
		return i_6_;
	}

	public static void a() {
		anIntArray789 = null;
		aClass50_794 = null;
	}

	final FileSystemRequest requestWrite(final FileSystem fileSystem, final byte[] buffer, final int id) {
		final FileSystemRequest fsRequest = new FileSystemRequest();
		fsRequest.subUid = id;
		fsRequest.fileSystem = fileSystem;
		fsRequest.aBoolean3573 = false;
		fsRequest.type = 2;
		fsRequest.buffer = buffer;
		putRequest(fsRequest);
		return fsRequest;
	}

	static final void b() {
		KeyboardHandler.aClass21_1504.clearSoftReference();
		SceneGraphNode.aClass21_1781.clearSoftReference();
	}

	static final void a(final int i, final int i_11_) {
		Class120_Sub2.anInt2422 = Class79.anInt694 + -i_11_ + Class79.anInt692 - 1;
		CanvasWrapper.anInt20 = i - Class79.anInt695;
	}

	final void stop() {
		stopped = true;
		synchronized (requestQueue) {
			requestQueue.notifyAll();
		}
		try {
			thread.join();
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
		thread = null;
	}

	private final void putRequest(final FileSystemRequest fsRequest) {
		synchronized (requestQueue) {
			requestQueue.insertLast(fsRequest);
			requestQueue.notifyAll();
			this.requestsAwaiting++;
		}
	}

	final FileSystemRequest requestRead2(final FileSystem fileSystem, final int id) {
		final FileSystemRequest fsRequest = new FileSystemRequest();
		fsRequest.type = 1;
		synchronized (requestQueue) {
			for (FileSystemRequest firstFSRequest = (FileSystemRequest) requestQueue.peekFirst(); firstFSRequest != null; firstFSRequest = (FileSystemRequest) requestQueue.peekNext()) {
				if (firstFSRequest.subUid == id && fileSystem == firstFSRequest.fileSystem && firstFSRequest.type == 2) {
					fsRequest.buffer = firstFSRequest.buffer;
					fsRequest.aBoolean3576 = false;
					return fsRequest;
				}
			}
		}
		fsRequest.buffer = fileSystem.get(id);
		fsRequest.aBoolean3576 = false;
		fsRequest.aBoolean3573 = true;
		return fsRequest;
	}

	public FileSystemWorker() {
		final SignlinkNode signlinkNode = NpcType.gameSignlink.startThread(this, 5);
		while (signlinkNode.status == 0) {
			PacketBuffer.sleepWrapper(10L);
		}
		if (signlinkNode.status == 2) {
			throw new RuntimeException();
		}
		thread = (Thread) signlinkNode.value;
	}
}
