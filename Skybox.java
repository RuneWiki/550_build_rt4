/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Skybox {
	private int anInt350 = -1;
	private final int anInt351;
	private Sphere aClass97_352;
	private int sortedSpheresPos;
	private final Sphere[] spheres;
	private final int anInt355;
	private int textureId;
	private Sphere[] sortedSpheres;
	private int textureSize;
	private final int anInt359;
	private LDSprite aClass120_Sub14_Sub19_Sub2_361;
	static ObjectCache recentUse = new ObjectCache(4);

	final void drawLD(final int i, final int x, final int y, final int width, final int height, final int pitch, int yaw, final int screenColor) {
		method335(height);
		yaw = yaw + i & 0x7ff;
		if (textureId != -1) {
			if (aClass120_Sub14_Sub19_Sub2_361 == null) {
				aClass120_Sub14_Sub19_Sub2_361 = Rasterizer.anInterface5_973.method26(false, Rasterizer.brightness, textureSize, textureId);
			}
			if (!Rasterizer.anInterface5_973.method17(textureId)) {
				GraphicsLD.fillRect(x, y, width, height, screenColor);
			}
			if (aClass120_Sub14_Sub19_Sub2_361 != null) {
				int i_7_ = pitch * height / -512;
				int i_8_ = (width - height) / 2 + yaw * height / 512;
				System.out.println(i_7_+":"+i_8_);
				for (; i_8_ > height; i_8_ -= height) {
					/* empty */
				}
				for (/**/; i_8_ < 0; i_8_ += height) {
					/* empty */
				}
				for (/**/; i_7_ > height; i_7_ -= height) {
					/* empty */
				}
				for (/**/; i_7_ < 0; i_7_ += height) {
					/* empty */
				}
				for (int i_9_ = i_8_ - height; i_9_ < width; i_9_ += height) {
					for (int i_10_ = i_7_ - height; i_10_ < height; i_10_ += height) {
						aClass120_Sub14_Sub19_Sub2_361.method1588(i_9_ + x, i_10_ + y, height, height);
					}
				}
			}
		} else {
			GraphicsLD.fillRect(x, y, width, height, screenColor);
		}
		for (int i_11_ = sortedSpheresPos - 1; i_11_ >= 0; i_11_--) {
			sortedSpheres[i_11_].method802(x, y, width, height, pitch, yaw, aClass97_352);
		}
	}

	final void drawHD(final int i, final int x, final int y, final int width, final int height, final int pitch, int yaw, final int screenColor) {
		final GL gl = HDToolkit.gl;
		method335(height);
		yaw = yaw + i & 0x7ff;
		final int i_19_ = x + width;
		final int i_20_ = y + height;
		HDToolkit.toggleFog(false);
		HDToolkit.toggleLighting(false);
		HDToolkit.toggleDepthTest(false);
		HDToolkit.method509();
		HDToolkit.method520(x, i_19_, y, i_20_);
		HDToolkit.disableDepthMask();
		for (int i_21_ = sortedSpheresPos - 1; i_21_ >= 0; i_21_--) {
			sortedSpheres[i_21_].method796(aClass97_352);
		}
		//textureId = 521;
		if (textureId != -1) {
			if (!Rasterizer.anInterface5_973.method17(textureId)) {
				HDToolkit.method529(screenColor);
			}
			Rasterizer.anInterface5_973.method28(textureSize, textureId);
			final float f = pitch / 512.0F;
			final float f_22_ = yaw / -512.0F;
			final float f_23_ = (width - height) / (2.0F * height);
			gl.glBegin(7);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			gl.glTexCoord2f(-f_23_ + f_22_, f);
			gl.glVertex2i(x, y);
			gl.glTexCoord2f(-f_23_ + f_22_, 1.0F + f);
			gl.glVertex2i(x, i_20_);
			gl.glTexCoord2f(1.0F + f_23_ + f_22_, 1.0F + f);
			gl.glVertex2i(i_19_, i_20_);
			gl.glTexCoord2f(1.0F + f_23_ + f_22_, f);
			gl.glVertex2i(i_19_, y);
			gl.glEnd();
		} else {
			HDToolkit.method529(screenColor);
		}
		for (int i_24_ = sortedSpheresPos - 1; i_24_ >= 0; i_24_--) {
			sortedSpheres[i_24_].method795(x, y, width, height, pitch, yaw);
		}
		HDToolkit.enableDepthMask();
		HDToolkit.toggleDepthTest(true);
		HDToolkit.toggleLighting(true);
		HDToolkit.toggleFog(true);
	}

	static final void method333() {
		Sphere.method806();
	}

	Skybox(final int i, final Sphere[] class97s, final int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		anInt351 = i_26_;
		anInt355 = i_27_;
		anInt359 = i_28_;
		textureId = i;
		spheres = class97s;
		if (class97s != null) {
			sortedSpheres = new Sphere[class97s.length];
			aClass97_352 = i_25_ >= 0 ? class97s[i_25_] : null;
		} else {
			sortedSpheres = null;
			aClass97_352 = null;
		}
	}

	private final void method335(final int height) {
		if (anInt350 != height) {
			anInt350 = height;
			int i_29_ = Deque.highestOneBit(height);
			if (i_29_ > 512) {
				i_29_ = 512;
			}
			if (textureSize != i_29_) {
				textureSize = i_29_;
				aClass120_Sub14_Sub19_Sub2_361 = null;
			}
			if (spheres != null) {
				sortedSpheresPos = 0;
				final int[] lengths = new int[spheres.length];
				for (int id = 0; id < spheres.length; id++) {
					final Sphere sphere = spheres[id];
					if (sphere.method797(anInt351, anInt355, anInt359, anInt350)) {
						lengths[sortedSpheresPos] = sphere.anInt930;
						sortedSpheres[sortedSpheresPos++] = sphere;
					}
				}
				ArrayUtils.quicksort(sortedSpheresPos - 1, sortedSpheres, 0, lengths);
			}
		}
	}

	static final Skybox list(final int skyboxId, final int xOff, final int yOff, final int zOff) {
		final long l = 0xffffL & skyboxId | (0xffffL & xOff) << 48 | (0xffffL & yOff) << 32 | (zOff & 0xffffL) << 16;
		Skybox skybox = (Skybox) recentUse.get(l);
		if (skybox != null) {
			return skybox;
		}
		Sphere[] spheres = null;
		final SkyboxType skyboxType = SkyboxType.list(skyboxId);
		if (skyboxType.sphereIds != null) {
			spheres = new Sphere[skyboxType.sphereIds.length];
			for (int id = 0; id < spheres.length; id++) {
				final SphereType sphereType = SphereType.list(skyboxType.sphereIds[id]);
				spheres[id] = new Sphere(sphereType.type, sphereType.mediaId, sphereType.x, sphereType.y, sphereType.z, sphereType.size, sphereType.glowColor, sphereType.fixedSize);
			}
		}
		spheres = new Sphere[1];
		spheres[0] = new Sphere(1, 28, 10, 200, 256, 300, 0xffff, false);
		skybox = new Skybox(skyboxType.textureId, spheres, skyboxType.anInt1380, xOff, yOff, zOff);
		recentUse.put(skybox, l);
		return skybox;
	}
}
