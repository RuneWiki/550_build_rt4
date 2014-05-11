/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileOnDisk {
	private RandomAccessFile randomAccessFile;
	private long maxFileSize;
	private long position;
	private final File wrappedFile;

	public final File getFile() {
		return wrappedFile;
	}

	public final void write(final byte[] buffer, final int off, final int len) throws IOException {
		if (maxFileSize < position + len) {
			randomAccessFile.seek(maxFileSize);
			randomAccessFile.write(1);
			throw new EOFException();
		}
		randomAccessFile.write(buffer, off, len);
		position += len;
	}

	public final void seek(final long l) throws IOException {
		randomAccessFile.seek(l);
		position = l;
	}

	public final void close() throws IOException {
		if (randomAccessFile != null) {
			randomAccessFile.close();
			randomAccessFile = null;
		}
	}

	public final int read(final byte[] buffer, final int off, final int len) throws IOException {
		final int pos = randomAccessFile.read(buffer, off, len);
		if (pos > 0) {
			position += pos;
		}
		return pos;
	}

	@Override
	protected void finalize() throws Throwable {
		if (randomAccessFile != null) {
			System.out.println("Warning! fileondisk " + wrappedFile + " not closed correctly using close(). Auto-closing instead. ");
			close();
		}
	}

	public final long getLength() throws IOException {
		return randomAccessFile.length();
	}

	public FileOnDisk(final File file, final String mode, long mfs) throws IOException {
		if (mfs == -1L) {
			mfs = 9223372036854775807L;
		}
		if (file.length() >= mfs) {
			file.delete();
		}
		randomAccessFile = new RandomAccessFile(file, mode);
		wrappedFile = file;
		maxFileSize = mfs;
		position = 0L;
		final int i = randomAccessFile.read();
		if (i != -1 && !mode.equals("r")) {
			randomAccessFile.seek(0L);
			randomAccessFile.write(i);
		}
		randomAccessFile.seek(0L);
	}
}
