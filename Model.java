import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* Class180_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Model extends SceneGraphNode {
	short[] faceTextures;
	byte[] aByteArray2851;
	short[] aShortArray2852;
	private static int[] cosinTable = Rasterizer.cosTable;
	private short aShort2854;
	int anInt2855;
	int triangleCount = 0;
	short[] faceColors;
	private static int[] sinTable;
	byte[] aByteArray2859;
	int[] vertexLabelIds;
	int[] yVertices;
	private static int anInt2862 = 0;
	int[][] triangleLabels;
	byte[] faceAlphas;
	private short aShort2865;
	short contrast;
	short[] aShortArray2867;
	private short aShort2868;
	private boolean boundsCalculated = false;
	byte[] aByteArray2870;
	ModelParticleEmitter[] aClass158Array2871;
	int[] faceLabelIds;
	short[] texturesScaleY;
	private short aShort2874;
	short[] textureFacesM;
	byte[] faceTextureIndex;
	byte[] textureRotationY;
	Normal[] normals;
	byte[] facePriorities;
	Class115[] aClass115Array2880;
	int[] zVertices;
	private static int[] anIntArray2882;
	private static int[] anIntArray2883;
	int[][] vertexLabels;
	byte[] textureTypes;
	int highestVertexId;
	ModelParticleMagnet[] aClass169Array2887;
	byte[] aByteArray2888;
	private short aShort2889;
	int[] xVertices;
	int[] facesB;
	short[] textureFacesN;
	Normal[] aClass26Array2893;
	short ambient;
	byte[] faceRenderTypes;
	int vertexCount = 0;
	int[] facesA;
	int[] facesC;
	byte modelPriority = 0;
	short[] texturesScaleZ;
	short[] textureFacesP;
	private short aShort2902;
	short[] texturesScaleX;

	static {
		sinTable = Rasterizer.sinTable;
		anIntArray2883 = new int[10000];
		anIntArray2882 = new int[10000];
	}

	final void rotateY(final int rot) {
		final int rotSin = sinTable[rot];
		final int rotCos = cosinTable[rot];
		for (int id = 0; id < this.vertexCount; id++) {
			final int x = this.zVertices[id] * rotSin + this.xVertices[id] * rotCos >> 16;
			this.zVertices[id] = this.zVertices[id] * rotCos - this.xVertices[id] * rotSin >> 16;
			this.xVertices[id] = x;
		}
		method2296();
	}

	private final int method2280(final Model class180_sub2_4_, final int i, final short i_5_) {
		final int i_6_ = class180_sub2_4_.xVertices[i];
		final int i_7_ = class180_sub2_4_.yVertices[i];
		final int i_8_ = class180_sub2_4_.zVertices[i];
		for (int i_9_ = 0; i_9_ < this.vertexCount; i_9_++) {
			if (i_6_ == this.xVertices[i_9_] && i_7_ == this.yVertices[i_9_] && i_8_ == this.zVertices[i_9_]) {
				this.aShortArray2852[i_9_] |= i_5_;
				return i_9_;
			}
		}
		this.xVertices[this.vertexCount] = i_6_;
		this.yVertices[this.vertexCount] = i_7_;
		this.zVertices[this.vertexCount] = i_8_;
		this.aShortArray2852[this.vertexCount] = i_5_;
		if (class180_sub2_4_.vertexLabelIds != null) {
			this.vertexLabelIds[this.vertexCount] = class180_sub2_4_.vertexLabelIds[i];
		}
		return this.vertexCount++;
	}

	@Override
	final int getMaxY() {
		if (!boundsCalculated) {
			calculateBounds();
		}
		return aShort2874;
	}

	final void method2281() {
		for (int i = 0; i < this.vertexCount; i++) {
			final int i_10_ = this.xVertices[i];
			this.xVertices[i] = this.zVertices[i];
			this.zVertices[i] = -i_10_;
		}
		method2296();
	}

	final void translate(final int xOff, final int yOff, final int zOff) {
		for (int id = 0; id < this.vertexCount; id++) {
			this.xVertices[id] += xOff;
			this.yVertices[id] += yOff;
			this.zVertices[id] += zOff;
		}
		method2296();
	}

	final void createLabels() {
		if (this.vertexLabelIds != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_14_ = 0; i_14_ < this.vertexCount; i_14_++) {
				final int i_15_ = this.vertexLabelIds[i_14_];
				is[i_15_]++;
				if (i_15_ > i) {
					i = i_15_;
				}
			}
			this.vertexLabels = new int[i + 1][];
			for (int i_16_ = 0; i_16_ <= i; i_16_++) {
				this.vertexLabels[i_16_] = new int[is[i_16_]];
				is[i_16_] = 0;
			}
			for (int i_17_ = 0; i_17_ < this.vertexCount; i_17_++) {
				final int i_18_ = this.vertexLabelIds[i_17_];
				this.vertexLabels[i_18_][is[i_18_]++] = i_17_;
			}
			this.vertexLabelIds = null;
		}
		if (this.faceLabelIds != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_19_ = 0; i_19_ < this.triangleCount; i_19_++) {
				final int i_20_ = this.faceLabelIds[i_19_];
				is[i_20_]++;
				if (i_20_ > i) {
					i = i_20_;
				}
			}
			this.triangleLabels = new int[i + 1][];
			for (int i_21_ = 0; i_21_ <= i; i_21_++) {
				this.triangleLabels[i_21_] = new int[is[i_21_]];
				is[i_21_] = 0;
			}
			for (int i_22_ = 0; i_22_ < this.triangleCount; i_22_++) {
				final int i_23_ = this.faceLabelIds[i_22_];
				this.triangleLabels[i_23_][is[i_23_]++] = i_22_;
			}
			this.faceLabelIds = null;
		}
	}

	final void method2284() {
		for (int i = 0; i < this.vertexCount; i++) {
			this.xVertices[i] = -this.xVertices[i];
			this.zVertices[i] = -this.zVertices[i];
		}
		method2296();
	}

	@Override
	final void render(final int i, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final int i_29_, final int i_30_, final long l, final int i_31_, final ParticleEngine class108_sub2) {
		/* empty */
	}

	private final void method2285(final int[][] is, final int i, final int i_32_, final int i_33_, final int i_34_, final int i_35_) {
		final int i_36_ = -i_34_ / 2;
		final int i_37_ = -i_35_ / 2;
		final int i_38_ = method2301(is, i + i_36_, i_33_ + i_37_);
		final int i_39_ = i_34_ / 2;
		final int i_40_ = -i_35_ / 2;
		final int i_41_ = method2301(is, i + i_39_, i_33_ + i_40_);
		final int i_42_ = -i_34_ / 2;
		final int i_43_ = i_35_ / 2;
		final int i_44_ = method2301(is, i + i_42_, i_33_ + i_43_);
		final int i_45_ = i_34_ / 2;
		final int i_46_ = i_35_ / 2;
		final int i_47_ = method2301(is, i + i_45_, i_33_ + i_46_);
		final int i_48_ = i_38_ < i_41_ ? i_38_ : i_41_;
		final int i_49_ = i_44_ < i_47_ ? i_44_ : i_47_;
		final int i_50_ = i_41_ < i_47_ ? i_41_ : i_47_;
		final int i_51_ = i_38_ < i_44_ ? i_38_ : i_44_;
		if (i_35_ != 0) {
			final int i_52_ = (int) (Math.atan2(i_48_ - i_49_, i_35_) * 325.95) & 0x7ff;
			if (i_52_ != 0) {
				method2297(i_52_);
			}
		}
		if (i_34_ != 0) {
			final int i_53_ = (int) (Math.atan2(i_51_ - i_50_, i_34_) * 325.95) & 0x7ff;
			if (i_53_ != 0) {
				method2308(i_53_);
			}
		}
		int i_54_ = i_38_ + i_47_;
		if (i_41_ + i_44_ < i_54_) {
			i_54_ = i_41_ + i_44_;
		}
		i_54_ = (i_54_ >> 1) - i_32_;
		if (i_54_ != 0) {
			translate(0, i_54_, 0);
		}
	}

	@Override
	final boolean method2268() {
		return true;
	}

	@Override
	final void method2266(final int i, final int i_55_, final int i_57_, final int i_56_, final int i_58_) {
		/* empty */
	}

	final void method2286() {
		for (int i = 0; i < this.vertexCount; i++) {
			final int i_59_ = this.zVertices[i];
			this.zVertices[i] = this.xVertices[i];
			this.xVertices[i] = -i_59_;
		}
		method2296();
	}

	@Override
	final SceneGraphNode method2269(final int i, final int i_60_, final int i_61_) {
		return toRenderer(this.ambient, this.contrast, i, i_60_, i_61_);
	}

	final void method2287() {
		for (int i = 0; i < this.vertexCount; i++) {
			this.zVertices[i] = -this.zVertices[i];
		}
		for (int i = 0; i < this.triangleCount; i++) {
			final int i_62_ = this.facesA[i];
			this.facesA[i] = this.facesC[i];
			this.facesC[i] = i_62_;
		}
		method2296();
	}

	final Model method2288() {
		final Model class180_sub2_63_ = new Model();
		if (this.faceRenderTypes != null) {
			class180_sub2_63_.faceRenderTypes = new byte[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				class180_sub2_63_.faceRenderTypes[i] = this.faceRenderTypes[i];
			}
		}
		class180_sub2_63_.vertexCount = this.vertexCount;
		class180_sub2_63_.highestVertexId = this.highestVertexId;
		class180_sub2_63_.triangleCount = this.triangleCount;
		class180_sub2_63_.anInt2855 = this.anInt2855;
		class180_sub2_63_.xVertices = this.xVertices;
		class180_sub2_63_.yVertices = this.yVertices;
		class180_sub2_63_.zVertices = this.zVertices;
		class180_sub2_63_.facesA = this.facesA;
		class180_sub2_63_.facesB = this.facesB;
		class180_sub2_63_.facesC = this.facesC;
		class180_sub2_63_.facePriorities = this.facePriorities;
		class180_sub2_63_.faceAlphas = this.faceAlphas;
		class180_sub2_63_.faceTextureIndex = this.faceTextureIndex;
		class180_sub2_63_.faceColors = this.faceColors;
		class180_sub2_63_.faceTextures = this.faceTextures;
		class180_sub2_63_.modelPriority = this.modelPriority;
		class180_sub2_63_.textureTypes = this.textureTypes;
		class180_sub2_63_.textureFacesP = this.textureFacesP;
		class180_sub2_63_.textureFacesM = this.textureFacesM;
		class180_sub2_63_.textureFacesN = this.textureFacesN;
		class180_sub2_63_.texturesScaleX = this.texturesScaleX;
		class180_sub2_63_.texturesScaleY = this.texturesScaleY;
		class180_sub2_63_.texturesScaleZ = this.texturesScaleZ;
		class180_sub2_63_.textureRotationY = this.textureRotationY;
		class180_sub2_63_.aByteArray2888 = this.aByteArray2888;
		class180_sub2_63_.aByteArray2870 = this.aByteArray2870;
		class180_sub2_63_.aByteArray2859 = this.aByteArray2859;
		class180_sub2_63_.aByteArray2851 = this.aByteArray2851;
		class180_sub2_63_.vertexLabelIds = this.vertexLabelIds;
		class180_sub2_63_.faceLabelIds = this.faceLabelIds;
		class180_sub2_63_.vertexLabels = this.vertexLabels;
		class180_sub2_63_.triangleLabels = this.triangleLabels;
		class180_sub2_63_.normals = this.normals;
		class180_sub2_63_.aClass115Array2880 = this.aClass115Array2880;
		class180_sub2_63_.ambient = this.ambient;
		class180_sub2_63_.contrast = this.contrast;
		class180_sub2_63_.aClass158Array2871 = this.aClass158Array2871;
		class180_sub2_63_.aClass169Array2887 = this.aClass169Array2887;
		return class180_sub2_63_;
	}

	private final void decodeOld(final byte[] is) {
		boolean bool = false;
		boolean bool_64_ = false;
		final Buffer class120_sub7 = new Buffer(is);
		final Buffer class120_sub7_65_ = new Buffer(is);
		final Buffer class120_sub7_66_ = new Buffer(is);
		final Buffer class120_sub7_67_ = new Buffer(is);
		final Buffer class120_sub7_68_ = new Buffer(is);
		class120_sub7.pos = is.length - 18;//footer data
		final int vertexAmount = class120_sub7.getUShort();
		final int faceAmount = class120_sub7.getUShort();
		final int i_70_ = class120_sub7.getUByte();
		final int i_71_ = class120_sub7.getUByte();
		final int i_72_ = class120_sub7.getUByte();
		final int i_73_ = class120_sub7.getUByte();
		final int i_74_ = class120_sub7.getUByte();
		final int i_75_ = class120_sub7.getUByte();
		final int i_76_ = class120_sub7.getUShort();
		final int i_77_ = class120_sub7.getUShort();
		final int i_78_ = class120_sub7.getUShort();
		final int i_79_ = class120_sub7.getUShort();
		int i_80_ = 0;
		final int i_81_ = i_80_;
		i_80_ += vertexAmount;
		final int i_82_ = i_80_;
		i_80_ += faceAmount;
		final int i_83_ = i_80_;
		if (i_72_ == 255) {
			i_80_ += faceAmount;
		}
		final int i_84_ = i_80_;
		if (i_74_ == 1) {
			i_80_ += faceAmount;
		}
		final int i_85_ = i_80_;
		if (i_71_ == 1) {
			i_80_ += faceAmount;
		}
		final int i_86_ = i_80_;
		if (i_75_ == 1) {
			i_80_ += vertexAmount;
		}
		final int i_87_ = i_80_;
		if (i_73_ == 1) {
			i_80_ += faceAmount;
		}
		final int i_88_ = i_80_;
		i_80_ += i_79_;
		final int i_89_ = i_80_;
		i_80_ += faceAmount * 2;
		final int i_90_ = i_80_;
		i_80_ += i_70_ * 6;
		final int i_91_ = i_80_;
		i_80_ += i_76_;
		final int i_92_ = i_80_;
		i_80_ += i_77_;
		final int i_93_ = i_80_;
		i_80_ += i_78_;
		this.vertexCount = vertexAmount;
		this.triangleCount = faceAmount;
		this.anInt2855 = i_70_;
		this.xVertices = new int[vertexAmount];
		this.yVertices = new int[vertexAmount];
		this.zVertices = new int[vertexAmount];
		this.facesA = new int[faceAmount];
		this.facesB = new int[faceAmount];
		this.facesC = new int[faceAmount];
		if (i_70_ > 0) {
			this.textureTypes = new byte[i_70_];
			this.textureFacesP = new short[i_70_];
			this.textureFacesM = new short[i_70_];
			this.textureFacesN = new short[i_70_];
		}
		if (i_75_ == 1) {
			this.vertexLabelIds = new int[vertexAmount];
		}
		if (i_71_ == 1) {
			this.faceRenderTypes = new byte[faceAmount];
			this.faceTextureIndex = new byte[faceAmount];
			this.faceTextures = new short[faceAmount];
		}
		if (i_72_ == 255) {
			this.facePriorities = new byte[faceAmount];
		} else {
			this.modelPriority = (byte) i_72_;
		}
		if (i_73_ == 1) {
			this.faceAlphas = new byte[faceAmount];
		}
		if (i_74_ == 1) {
			this.faceLabelIds = new int[faceAmount];
		}
		this.faceColors = new short[faceAmount];
		class120_sub7.pos = i_81_;
		class120_sub7_65_.pos = i_91_;
		class120_sub7_66_.pos = i_92_;
		class120_sub7_67_.pos = i_93_;
		class120_sub7_68_.pos = i_86_;
		int i_94_ = 0;
		int i_95_ = 0;
		int i_96_ = 0;
		for (int i_97_ = 0; i_97_ < vertexAmount; i_97_++) {
			final int vertexFlag = class120_sub7.getUByte();
			int i_99_ = 0;
			if ((vertexFlag & 0x1) != 0) {
				i_99_ = class120_sub7_65_.getSmart();
			}
			int i_100_ = 0;
			if ((vertexFlag & 0x2) != 0) {
				i_100_ = class120_sub7_66_.getSmart();
			}
			int i_101_ = 0;
			if ((vertexFlag & 0x4) != 0) {
				i_101_ = class120_sub7_67_.getSmart();
			}
			this.xVertices[i_97_] = i_94_ + i_99_;
			this.yVertices[i_97_] = i_95_ + i_100_;
			this.zVertices[i_97_] = i_96_ + i_101_;
			i_94_ = this.xVertices[i_97_];
			i_95_ = this.yVertices[i_97_];
			i_96_ = this.zVertices[i_97_];
			if (i_75_ == 1) {
				this.vertexLabelIds[i_97_] = class120_sub7_68_.getUByte();
			}
		}
		class120_sub7.pos = i_89_;
		class120_sub7_65_.pos = i_85_;
		class120_sub7_66_.pos = i_83_;
		class120_sub7_67_.pos = i_87_;
		class120_sub7_68_.pos = i_84_;
		for (int i_102_ = 0; i_102_ < faceAmount; i_102_++) {
			this.faceColors[i_102_] = (short) class120_sub7.getUShort();
			if (i_71_ == 1) {
				final int i_103_ = class120_sub7_65_.getUByte();
				if ((i_103_ & 0x1) == 1) {
					this.faceRenderTypes[i_102_] = (byte) 1;
					bool = true;
				} else {
					this.faceRenderTypes[i_102_] = (byte) 0;
				}
				if ((i_103_ & 0x2) == 2) {
					this.faceTextureIndex[i_102_] = (byte) (i_103_ >> 2);
					this.faceTextures[i_102_] = this.faceColors[i_102_];
					this.faceColors[i_102_] = (short) 127;
					if (this.faceTextures[i_102_] != -1) {
						bool_64_ = true;
					}
				} else {
					this.faceTextureIndex[i_102_] = (byte) -1;
					this.faceTextures[i_102_] = (short) -1;
				}
			}
			if (i_72_ == 255) {
				this.facePriorities[i_102_] = class120_sub7_66_.getByte();
			}
			if (i_73_ == 1) {
				this.faceAlphas[i_102_] = class120_sub7_67_.getByte();
			}
			if (i_74_ == 1) {
				this.faceLabelIds[i_102_] = class120_sub7_68_.getUByte();
			}
		}
		this.highestVertexId = -1;
		class120_sub7.pos = i_88_;
		class120_sub7_65_.pos = i_82_;
		int i_104_ = 0;
		int i_105_ = 0;
		int i_106_ = 0;
		int i_107_ = 0;
		for (int i_108_ = 0; i_108_ < faceAmount; i_108_++) {
			final int i_109_ = class120_sub7_65_.getUByte();
			if (i_109_ == 1) {
				i_104_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_104_;
				i_105_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_105_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.facesA[i_108_] = i_104_;
				this.facesB[i_108_] = i_105_;
				this.facesC[i_108_] = i_106_;
				if (i_104_ > this.highestVertexId) {
					this.highestVertexId = i_104_;
				}
				if (i_105_ > this.highestVertexId) {
					this.highestVertexId = i_105_;
				}
				if (i_106_ > this.highestVertexId) {
					this.highestVertexId = i_106_;
				}
			}
			if (i_109_ == 2) {
				i_105_ = i_106_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.facesA[i_108_] = i_104_;
				this.facesB[i_108_] = i_105_;
				this.facesC[i_108_] = i_106_;
				if (i_106_ > this.highestVertexId) {
					this.highestVertexId = i_106_;
				}
			}
			if (i_109_ == 3) {
				i_104_ = i_106_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.facesA[i_108_] = i_104_;
				this.facesB[i_108_] = i_105_;
				this.facesC[i_108_] = i_106_;
				if (i_106_ > this.highestVertexId) {
					this.highestVertexId = i_106_;
				}
			}
			if (i_109_ == 4) {
				final int i_110_ = i_104_;
				i_104_ = i_105_;
				i_105_ = i_110_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.facesA[i_108_] = i_104_;
				this.facesB[i_108_] = i_105_;
				this.facesC[i_108_] = i_106_;
				if (i_106_ > this.highestVertexId) {
					this.highestVertexId = i_106_;
				}
			}
		}
		this.highestVertexId++;
		class120_sub7.pos = i_90_;
		for (int i_111_ = 0; i_111_ < i_70_; i_111_++) {
			this.textureTypes[i_111_] = (byte) 0;
			this.textureFacesP[i_111_] = (short) class120_sub7.getUShort();
			this.textureFacesM[i_111_] = (short) class120_sub7.getUShort();
			this.textureFacesN[i_111_] = (short) class120_sub7.getUShort();
		}
		if (this.faceTextureIndex != null) {
			boolean bool_112_ = false;
			for (int i_113_ = 0; i_113_ < faceAmount; i_113_++) {
				final int i_114_ = this.faceTextureIndex[i_113_] & 0xff;
				if (i_114_ != 255) {
					if ((this.textureFacesP[i_114_] & 0xffff) == this.facesA[i_113_] && (this.textureFacesM[i_114_] & 0xffff) == this.facesB[i_113_] && (this.textureFacesN[i_114_] & 0xffff) == this.facesC[i_113_]) {
						this.faceTextureIndex[i_113_] = (byte) -1;
					} else {
						bool_112_ = true;
					}
				}
			}
			if (!bool_112_) {
				this.faceTextureIndex = null;
			}
		}
		if (!bool_64_) {
			this.faceTextures = null;
		}
		if (!bool) {
			this.faceRenderTypes = null;
		}
	}
	
	public static final byte[] ReadFile(String s) {
        try  {
            File file = new File(s);
            int i = (int)file.length();
            byte abyte0[] = new byte[i];
            DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
            datainputstream.readFully(abyte0, 0, i);
            datainputstream.close();
            return abyte0;
        } catch(Exception exception) {
        }
        return null;
    }

	static final Model get(final js5 js5, final int group, final int file) {
		byte[] data = js5.getFile(group, file);
		if (data == null) {
			return null;
		}
		//if(i == 1570)
		// is = ReadFile("c:/51223.dat");//TODO
		return new Model(data, group);
	}

	final void retexture(final short i, final short i_116_) {
		if (this.faceTextures != null) {
			for (int i_117_ = 0; i_117_ < this.triangleCount; i_117_++) {
				if (this.faceTextures[i_117_] == i) {
					this.faceTextures[i_117_] = i_116_;
				}
			}
		}
	}

	final void rotate(final int xRot, final int yRot, final int zRot) {
		if (xRot != 0) {
			final int i_124_ = sinTable[xRot];
			final int i_125_ = cosinTable[xRot];
			for (int i_126_ = 0; i_126_ < this.vertexCount; i_126_++) {
				final int i_127_ = this.yVertices[i_126_] * i_125_ - this.zVertices[i_126_] * i_124_ >> 16;
				this.zVertices[i_126_] = this.yVertices[i_126_] * i_124_ + this.zVertices[i_126_] * i_125_ >> 16;
				this.yVertices[i_126_] = i_127_;
			}
		}
		if (yRot != 0) {
			final int i_128_ = sinTable[yRot];
			final int i_129_ = cosinTable[yRot];
			for (int i_130_ = 0; i_130_ < this.vertexCount; i_130_++) {
				final int i_131_ = this.zVertices[i_130_] * i_128_ + this.xVertices[i_130_] * i_129_ >> 16;
				this.zVertices[i_130_] = this.zVertices[i_130_] * i_129_ - this.xVertices[i_130_] * i_128_ >> 16;
				this.xVertices[i_130_] = i_131_;
			}
		}
		if (zRot != 0) {
			final int i_120_ = sinTable[zRot];
			final int i_121_ = cosinTable[zRot];
			for (int i_122_ = 0; i_122_ < this.vertexCount; i_122_++) {
				final int i_123_ = this.yVertices[i_122_] * i_120_ + this.xVertices[i_122_] * i_121_ >> 16;
				this.yVertices[i_122_] = this.yVertices[i_122_] * i_121_ - this.xVertices[i_122_] * i_120_ >> 16;
				this.xVertices[i_122_] = i_123_;
			}
		}
	}

	/*
	 * Ty packersfan
	 */
	private final void decodeNew(final byte[] is) {
		final Buffer class120_sub7 = new Buffer(is);
		final Buffer class120_sub7_132_ = new Buffer(is);
		final Buffer class120_sub7_133_ = new Buffer(is);
		final Buffer class120_sub7_134_ = new Buffer(is);
		final Buffer class120_sub7_135_ = new Buffer(is);
		final Buffer class120_sub7_136_ = new Buffer(is);
		final Buffer class120_sub7_137_ = new Buffer(is);
		class120_sub7.pos = is.length - 23;//footer data
		final int vertexCount = class120_sub7.getUShort();
		final int faceCount = class120_sub7.getUShort();
		final int texturedFaceCount = class120_sub7.getUByte();
		final int flags = class120_sub7.getUByte();
		final boolean hasFaceRenderTypes = (flags & 0x1) == 1;
		final boolean hasParticles = (flags & 0x2) == 2;
		final int priority = class120_sub7.getUByte();
		final int hasFaceAlpha = class120_sub7.getUByte();
		final int hasFaceLabels = class120_sub7.getUByte();
		final int hasFaceTextures = class120_sub7.getUByte();
		final int hasVertexLabels = class120_sub7.getUByte();
		final int i_147_ = class120_sub7.getUShort();
		final int i_148_ = class120_sub7.getUShort();
		final int i_149_ = class120_sub7.getUShort();
		final int i_150_ = class120_sub7.getUShort();
		final int i_151_ = class120_sub7.getUShort();
		int simpleTextureFaceCount = 0;
		int complexTextureFaceCount = 0;
		int cubeTextureFaceCount = 0;
		if (texturedFaceCount > 0) {
			this.textureTypes = new byte[texturedFaceCount];
			class120_sub7.pos = 0;
			for (int id = 0; id < texturedFaceCount; id++) {
				final byte type = this.textureTypes[id] = class120_sub7.getByte();
				if (type == 0) {
					simpleTextureFaceCount++;
				}
				if (type >= 1 && type <= 3) {
					complexTextureFaceCount++;
				}
				if (type == 2) {
					cubeTextureFaceCount++;
				}
			}
		}
		int i_157_ = texturedFaceCount;
		final int i_158_ = i_157_;
		i_157_ += vertexCount;
		final int i_159_ = i_157_;
		if (hasFaceRenderTypes) {
			i_157_ += faceCount;
		}
		final int i_160_ = i_157_;
		i_157_ += faceCount;
		final int i_161_ = i_157_;
		if (priority == 255) {
			i_157_ += faceCount;
		}
		final int i_162_ = i_157_;
		if (hasFaceLabels == 1) {
			i_157_ += faceCount;
		}
		final int i_163_ = i_157_;
		if (hasVertexLabels == 1) {
			i_157_ += vertexCount;
		}
		final int i_164_ = i_157_;
		if (hasFaceAlpha == 1) {
			i_157_ += faceCount;
		}
		final int i_165_ = i_157_;
		i_157_ += i_150_;
		final int i_166_ = i_157_;
		if (hasFaceTextures == 1) {
			i_157_ += faceCount * 2;
		}
		final int i_167_ = i_157_;
		i_157_ += i_151_;
		final int i_168_ = i_157_;
		i_157_ += faceCount * 2;
		final int i_169_ = i_157_;
		i_157_ += i_147_;
		final int i_170_ = i_157_;
		i_157_ += i_148_;
		final int i_171_ = i_157_;
		i_157_ += i_149_;
		final int i_172_ = i_157_;
		i_157_ += simpleTextureFaceCount * 6;
		final int i_173_ = i_157_;
		i_157_ += complexTextureFaceCount * 6;
		final int i_174_ = i_157_;
		i_157_ += complexTextureFaceCount * 6;
		final int i_175_ = i_157_;
		i_157_ += complexTextureFaceCount;
		final int i_176_ = i_157_;
		i_157_ += complexTextureFaceCount;
		final int i_177_ = i_157_;
		i_157_ += complexTextureFaceCount + cubeTextureFaceCount * 2;
		final int i_178_ = i_157_;
		this.vertexCount = vertexCount;
		this.triangleCount = faceCount;
		this.anInt2855 = texturedFaceCount;
		this.xVertices = new int[vertexCount];
		this.yVertices = new int[vertexCount];
		this.zVertices = new int[vertexCount];
		this.facesA = new int[faceCount];
		this.facesB = new int[faceCount];
		this.facesC = new int[faceCount];
		if (hasVertexLabels == 1) {
			this.vertexLabelIds = new int[vertexCount];
		}
		if (hasFaceRenderTypes) {
			this.faceRenderTypes = new byte[faceCount];
		}
		if (priority == 255) {
			this.facePriorities = new byte[faceCount];
		} else {
			this.modelPriority = (byte) priority;
		}
		if (hasFaceAlpha == 1) {
			this.faceAlphas = new byte[faceCount];
		}
		if (hasFaceLabels == 1) {
			this.faceLabelIds = new int[faceCount];
		}
		if (hasFaceTextures == 1) {
			this.faceTextures = new short[faceCount];
		}
		if (hasFaceTextures == 1 && texturedFaceCount > 0) {
			this.faceTextureIndex = new byte[faceCount];
		}
		this.faceColors = new short[faceCount];
		if (texturedFaceCount > 0) {
			this.textureFacesP = new short[texturedFaceCount];
			this.textureFacesM = new short[texturedFaceCount];
			this.textureFacesN = new short[texturedFaceCount];
			if (complexTextureFaceCount > 0) {
				this.texturesScaleX = new short[complexTextureFaceCount];
				this.texturesScaleY = new short[complexTextureFaceCount];
				this.texturesScaleZ = new short[complexTextureFaceCount];
				this.textureRotationY = new byte[complexTextureFaceCount];
				this.aByteArray2888 = new byte[complexTextureFaceCount];
				this.aByteArray2870 = new byte[complexTextureFaceCount];
			}
			if (cubeTextureFaceCount > 0) {
				this.aByteArray2859 = new byte[cubeTextureFaceCount];
				this.aByteArray2851 = new byte[cubeTextureFaceCount];
			}
		}
		class120_sub7.pos = i_158_;
		class120_sub7_132_.pos = i_169_;
		class120_sub7_133_.pos = i_170_;
		class120_sub7_134_.pos = i_171_;
		class120_sub7_135_.pos = i_163_;
		int prevX = 0;
		int prevY = 0;
		int prevZ = 0;
		for (int id = 0; id < vertexCount; id++) {
			final int vertexFlags = class120_sub7.getUByte();
			int x = 0;
			if ((vertexFlags & 0x1) != 0) {
				x = class120_sub7_132_.getSmart();
			}
			int y = 0;
			if ((vertexFlags & 0x2) != 0) {
				y = class120_sub7_133_.getSmart();
			}
			int z = 0;
			if ((vertexFlags & 0x4) != 0) {
				z = class120_sub7_134_.getSmart();
			}
			this.xVertices[id] = prevX + x;
			this.yVertices[id] = prevY + y;
			this.zVertices[id] = prevZ + z;
			prevX = this.xVertices[id];
			prevY = this.yVertices[id];
			prevZ = this.zVertices[id];
			if (hasVertexLabels == 1) {
				this.vertexLabelIds[id] = class120_sub7_135_.getUByte();
			}
		}
		class120_sub7.pos = i_168_;
		class120_sub7_132_.pos = i_159_;
		class120_sub7_133_.pos = i_161_;
		class120_sub7_134_.pos = i_164_;
		class120_sub7_135_.pos = i_162_;
		class120_sub7_136_.pos = i_166_;
		class120_sub7_137_.pos = i_167_;
		for (int id = 0; id < faceCount; id++) {
			this.faceColors[id] = (short) class120_sub7.getUShort();
			if (hasFaceRenderTypes) {
				this.faceRenderTypes[id] = class120_sub7_132_.getByte();
			}
			if (priority == 255) {
				this.facePriorities[id] = class120_sub7_133_.getByte();
			}
			if (hasFaceAlpha == 1) {
				this.faceAlphas[id] = class120_sub7_134_.getByte();
			}
			if (hasFaceLabels == 1) {
				this.faceLabelIds[id] = class120_sub7_135_.getUByte();
			}
			if (hasFaceTextures == 1) {
				this.faceTextures[id] = (short) (class120_sub7_136_.getUShort() - 1);
			}
			if (this.faceTextureIndex != null) {
				if (this.faceTextures[id] != -1) {
					this.faceTextureIndex[id] = (byte) (class120_sub7_137_.getUByte() - 1);
				} else {
					this.faceTextureIndex[id] = (byte) -1;
				}
			}
		}
		this.highestVertexId = -1;
		class120_sub7.pos = i_165_;
		class120_sub7_132_.pos = i_160_;
		int i_188_ = 0;
		int i_189_ = 0;
		int i_190_ = 0;
		int i_191_ = 0;
		for (int i_192_ = 0; i_192_ < faceCount; i_192_++) {
			final int i_193_ = class120_sub7_132_.getUByte();
			if (i_193_ == 1) {
				i_188_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_188_;
				i_189_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_189_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.facesA[i_192_] = i_188_;
				this.facesB[i_192_] = i_189_;
				this.facesC[i_192_] = i_190_;
				if (i_188_ > this.highestVertexId) {
					this.highestVertexId = i_188_;
				}
				if (i_189_ > this.highestVertexId) {
					this.highestVertexId = i_189_;
				}
				if (i_190_ > this.highestVertexId) {
					this.highestVertexId = i_190_;
				}
			}
			if (i_193_ == 2) {
				i_189_ = i_190_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.facesA[i_192_] = i_188_;
				this.facesB[i_192_] = i_189_;
				this.facesC[i_192_] = i_190_;
				if (i_190_ > this.highestVertexId) {
					this.highestVertexId = i_190_;
				}
			}
			if (i_193_ == 3) {
				i_188_ = i_190_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.facesA[i_192_] = i_188_;
				this.facesB[i_192_] = i_189_;
				this.facesC[i_192_] = i_190_;
				if (i_190_ > this.highestVertexId) {
					this.highestVertexId = i_190_;
				}
			}
			if (i_193_ == 4) {
				final int i_194_ = i_188_;
				i_188_ = i_189_;
				i_189_ = i_194_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.facesA[i_192_] = i_188_;
				this.facesB[i_192_] = i_189_;
				this.facesC[i_192_] = i_190_;
				if (i_190_ > this.highestVertexId) {
					this.highestVertexId = i_190_;
				}
			}
		}
		this.highestVertexId++;
		class120_sub7.pos = i_172_;
		class120_sub7_132_.pos = i_173_;
		class120_sub7_133_.pos = i_174_;
		class120_sub7_134_.pos = i_175_;
		class120_sub7_135_.pos = i_176_;
		class120_sub7_136_.pos = i_177_;
		for (int id = 0; id < texturedFaceCount; id++) {
			final int type = this.textureTypes[id] & 0xff;
			if (type == 0) {
				this.textureFacesP[id] = (short) class120_sub7.getUShort();
				this.textureFacesM[id] = (short) class120_sub7.getUShort();
				this.textureFacesN[id] = (short) class120_sub7.getUShort();
			}
			if (type == 1) {
				this.textureFacesP[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesM[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesN[id] = (short) class120_sub7_132_.getUShort();
				this.texturesScaleX[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleY[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleZ[id] = (short) class120_sub7_133_.getUShort();
				this.textureRotationY[id] = class120_sub7_134_.getByte();
				this.aByteArray2888[id] = class120_sub7_135_.getByte();
				this.aByteArray2870[id] = class120_sub7_136_.getByte();
			}
			if (type == 2) {
				this.textureFacesP[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesM[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesN[id] = (short) class120_sub7_132_.getUShort();
				this.texturesScaleX[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleY[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleZ[id] = (short) class120_sub7_133_.getUShort();
				this.textureRotationY[id] = class120_sub7_134_.getByte();
				this.aByteArray2888[id] = class120_sub7_135_.getByte();
				this.aByteArray2870[id] = class120_sub7_136_.getByte();
				this.aByteArray2859[id] = class120_sub7_136_.getByte();
				this.aByteArray2851[id] = class120_sub7_136_.getByte();
			}
			if (type == 3) {
				this.textureFacesP[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesM[id] = (short) class120_sub7_132_.getUShort();
				this.textureFacesN[id] = (short) class120_sub7_132_.getUShort();
				this.texturesScaleX[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleY[id] = (short) class120_sub7_133_.getUShort();
				this.texturesScaleZ[id] = (short) class120_sub7_133_.getUShort();
				this.textureRotationY[id] = class120_sub7_134_.getByte();
				this.aByteArray2888[id] = class120_sub7_135_.getByte();
				this.aByteArray2870[id] = class120_sub7_136_.getByte();
			}
		}
		if(modelId == 1570) {
			this.aClass158Array2871 = new ModelParticleEmitter[1];
			for (int i_198_ = 0; i_198_ < 1; i_198_++) {
				final int particleId = 0;
				final int i_200_ = 1;
				this.aClass158Array2871[i_198_] = new ModelParticleEmitter(particleId, this.facesA[i_200_], this.facesB[i_200_], this.facesC[i_200_]);
			}
		}
		if (hasParticles) {//51222 and 51223
			class120_sub7.pos = i_178_;
			final int i_197_ = class120_sub7.getUByte();
			if (i_197_ > 0) {
				this.aClass158Array2871 = new ModelParticleEmitter[i_197_];
				for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
					final int particleId = class120_sub7.getUShort();
					final int i_200_ = class120_sub7.getUShort();
					this.aClass158Array2871[i_198_] = new ModelParticleEmitter(particleId, this.facesA[i_200_], this.facesB[i_200_], this.facesC[i_200_]);
				}
			}
			final int i_201_ = class120_sub7.getUByte();
			if (i_201_ > 0) {
				this.aClass169Array2887 = new ModelParticleMagnet[i_201_];
				for (int i_202_ = 0; i_202_ < i_201_; i_202_++) {
					this.aClass169Array2887[i_202_] = new ModelParticleMagnet(class120_sub7.getUShort(), class120_sub7.getUShort());
				}
			}
		}
	}

	final int addFace(final int a, final int b, final int c, final byte i_205_, final short color, final byte alpha) {
		this.facesA[this.triangleCount] = a;
		this.facesB[this.triangleCount] = b;
		this.facesC[this.triangleCount] = c;
		this.faceRenderTypes[this.triangleCount] = i_205_;
		this.faceTextureIndex[this.triangleCount] = (byte) -1;
		this.faceColors[this.triangleCount] = color;
		this.faceTextures[this.triangleCount] = (short) -1;
		this.faceAlphas[this.triangleCount] = alpha;
		return this.triangleCount++;
	}

	private final void method2296() {
		this.normals = null;
		this.aClass26Array2893 = null;
		this.aClass115Array2880 = null;
		boundsCalculated = false;
	}

	private final void method2297(final int i) {
		final int i_208_ = sinTable[i];
		final int i_209_ = cosinTable[i];
		for (int i_210_ = 0; i_210_ < this.vertexCount; i_210_++) {
			final int i_211_ = this.yVertices[i_210_] * i_209_ - this.zVertices[i_210_] * i_208_ >> 16;
			this.zVertices[i_210_] = this.yVertices[i_210_] * i_208_ + this.zVertices[i_210_] * i_209_ >> 16;
			this.yVertices[i_210_] = i_211_;
		}
		method2296();
	}

	final LDModelRenderer method2298(final int i, final int i_212_, final int i_213_, final int i_214_, final int i_215_) {
		return new LDModelRenderer(this, i, i_212_, i_213_, i_214_, i_215_);
	}

	final void method2299() {
		this.vertexLabelIds = null;
		this.faceLabelIds = null;
		this.vertexLabels = null;
		this.triangleLabels = null;
	}

	@Override
	final void method2267(final SceneGraphNode sceneGraphNode, final int xOff, final int yOff, final int zOff, final boolean bool) {
		final Model class180_sub2_218_ = (Model) sceneGraphNode;
		class180_sub2_218_.calculateBounds();
		class180_sub2_218_.createNormals();
		anInt2862++;
		int i_219_ = 0;
		final int[] is = class180_sub2_218_.xVertices;
		final int i_220_ = class180_sub2_218_.highestVertexId;
		for (int i_221_ = 0; i_221_ < this.highestVertexId; i_221_++) {
			final Normal class26 = this.normals[i_221_];
			if (class26.anInt156 != 0) {
				final int i_222_ = this.yVertices[i_221_] - yOff;
				if (i_222_ >= class180_sub2_218_.aShort2874 && i_222_ <= class180_sub2_218_.aShort2868) {
					final int i_223_ = this.xVertices[i_221_] - xOff;
					if (i_223_ >= class180_sub2_218_.aShort2854 && i_223_ <= class180_sub2_218_.aShort2902) {
						final int i_224_ = this.zVertices[i_221_] - zOff;
						if (i_224_ >= class180_sub2_218_.aShort2889 && i_224_ <= class180_sub2_218_.aShort2865) {
							for (int i_225_ = 0; i_225_ < i_220_; i_225_++) {
								final Normal class26_226_ = class180_sub2_218_.normals[i_225_];
								if (i_223_ == is[i_225_] && i_224_ == class180_sub2_218_.zVertices[i_225_] && i_222_ == class180_sub2_218_.yVertices[i_225_] && class26_226_.anInt156 != 0) {
									if (this.aClass26Array2893 == null) {
										this.aClass26Array2893 = new Normal[this.highestVertexId];
									}
									if (class180_sub2_218_.aClass26Array2893 == null) {
										class180_sub2_218_.aClass26Array2893 = new Normal[i_220_];
									}
									Normal class26_227_ = this.aClass26Array2893[i_221_];
									if (class26_227_ == null) {
										class26_227_ = this.aClass26Array2893[i_221_] = new Normal(class26);
									}
									Normal class26_228_ = class180_sub2_218_.aClass26Array2893[i_225_];
									if (class26_228_ == null) {
										class26_228_ = class180_sub2_218_.aClass26Array2893[i_225_] = new Normal(class26_226_);
									}
									class26_227_.x += class26_226_.x;
									class26_227_.y += class26_226_.y;
									class26_227_.z += class26_226_.z;
									class26_227_.anInt156 += class26_226_.anInt156;
									class26_228_.x += class26.x;
									class26_228_.y += class26.y;
									class26_228_.z += class26.z;
									class26_228_.anInt156 += class26.anInt156;
									i_219_++;
									anIntArray2882[i_221_] = anInt2862;
									anIntArray2883[i_225_] = anInt2862;
								}
							}
						}
					}
				}
			}
		}
		if (i_219_ >= 3 && bool) {
			for (int i_229_ = 0; i_229_ < this.triangleCount; i_229_++) {
				if (anIntArray2882[this.facesA[i_229_]] == anInt2862 && anIntArray2882[this.facesB[i_229_]] == anInt2862 && anIntArray2882[this.facesC[i_229_]] == anInt2862) {
					if (this.faceRenderTypes == null) {
						this.faceRenderTypes = new byte[this.triangleCount];
					}
					this.faceRenderTypes[i_229_] = (byte) 2;
				}
			}
			for (int i_230_ = 0; i_230_ < class180_sub2_218_.triangleCount; i_230_++) {
				if (anIntArray2883[class180_sub2_218_.facesA[i_230_]] == anInt2862 && anIntArray2883[class180_sub2_218_.facesB[i_230_]] == anInt2862 && anIntArray2883[class180_sub2_218_.facesC[i_230_]] == anInt2862) {
					if (class180_sub2_218_.faceRenderTypes == null) {
						class180_sub2_218_.faceRenderTypes = new byte[class180_sub2_218_.triangleCount];
					}
					class180_sub2_218_.faceRenderTypes[i_230_] = (byte) 2;
				}
			}
		}
	}

	final AbstractModelRenderer toRenderer(final int ambient, final int contrast, final int lightX, final int lightY, final int lightZ) {
		if (HDToolkit.glEnabled) {
			final HDModelRenderer class180_sub7_sub2 = new HDModelRenderer(this, ambient, contrast, true);
			class180_sub7_sub2.method2426();
			return class180_sub7_sub2;
		}
		return new LDModelRenderer(this, ambient, contrast, lightX, lightY, lightZ);
	}

	private static final int method2301(final int[][] is, final int i, final int i_235_) {
		final int i_236_ = i >> 7;
		final int i_237_ = i_235_ >> 7;
		if (i_236_ < 0 || i_237_ < 0 || i_236_ >= is.length || i_237_ >= is[0].length) {
			return 0;
		}
		final int i_238_ = i & 0x7f;
		final int i_239_ = i_235_ & 0x7f;
		final int i_240_ = is[i_236_][i_237_] * (128 - i_238_) + is[i_236_ + 1][i_237_] * i_238_ >> 7;
		final int i_241_ = is[i_236_][i_237_ + 1] * (128 - i_238_) + is[i_236_ + 1][i_237_ + 1] * i_238_ >> 7;
		return i_240_ * (128 - i_239_) + i_241_ * i_239_ >> 7;
	}

	final int addVertex(final int x, final int y, final int z) {
		for (int i_244_ = 0; i_244_ < this.vertexCount; i_244_++) {
			if (this.xVertices[i_244_] == x && this.yVertices[i_244_] == y && this.zVertices[i_244_] == z) {
				return i_244_;
			}
		}
		this.xVertices[this.vertexCount] = x;
		this.yVertices[this.vertexCount] = y;
		this.zVertices[this.vertexCount] = z;
		this.highestVertexId = ++this.vertexCount;
		return this.vertexCount - 1;
	}

	final void createNormals() {
		if (this.normals == null) {
			this.normals = new Normal[this.highestVertexId];
			for (int id = 0; id < this.highestVertexId; id++) {
				this.normals[id] = new Normal();
			}
			for (int id = 0; id < this.triangleCount; id++) {
				final int tA = this.facesA[id];
				final int tB = this.facesB[id];
				final int tC = this.facesC[id];
				final int v1x = this.xVertices[tB] - this.xVertices[tA];
				final int v1y = this.yVertices[tB] - this.yVertices[tA];
				final int v1z = this.zVertices[tB] - this.zVertices[tA];
				final int v2x = this.xVertices[tC] - this.xVertices[tA];
				final int v2y = this.yVertices[tC] - this.yVertices[tA];
				final int v2z = this.zVertices[tC] - this.zVertices[tA];
				int normalX = v1y * v2z - v2y * v1z;
				int normalY = v1z * v2x - v2z * v1x;
				int normalZ = v1x * v2y - v2x * v1y;
				for (; normalX > 8192 || normalY > 8192 || normalZ > 8192 || normalX < -8192 || normalY < -8192 || normalZ < -8192;) {
					normalZ >>= 1;
					normalX >>= 1;
					normalY >>= 1;
				}
				int normalLength = (int) Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
				if (normalLength <= 0) {
					normalLength = 1;
				}
				normalX = normalX * 256 / normalLength;
				normalY = normalY * 256 / normalLength;
				normalZ = normalZ * 256 / normalLength;
				byte i_258_;
				if (this.faceRenderTypes == null) {
					i_258_ = (byte) 0;
				} else {
					i_258_ = this.faceRenderTypes[id];
				}
				if (i_258_ == 0) {
					Normal normal = this.normals[tA];
					normal.x += normalX;
					normal.y += normalY;
					normal.z += normalZ;
					normal.anInt156++;
					normal = this.normals[tB];
					normal.x += normalX;
					normal.y += normalY;
					normal.z += normalZ;
					normal.anInt156++;
					normal = this.normals[tC];
					normal.x += normalX;
					normal.y += normalY;
					normal.z += normalZ;
					normal.anInt156++;
				} else if (i_258_ == 1) {
					if (this.aClass115Array2880 == null) {
						this.aClass115Array2880 = new Class115[this.triangleCount];
					}
					final Class115 class115 = this.aClass115Array2880[id] = new Class115();
					class115.x = normalX;
					class115.y = normalY;
					class115.z = normalZ;
				}
			}
		}
	}

	private final void calculateBounds() {
		if (!boundsCalculated) {
			boundsCalculated = true;
			int lowestX = 32767;
			int lowestY = 32767;
			int lowestZ = 32767;
			int highestX = -32768;
			int highestY = -32768;
			int highestZ = -32768;
			for (int i_264_ = 0; i_264_ < this.highestVertexId; i_264_++) {
				final int x = this.xVertices[i_264_];
				final int y = this.yVertices[i_264_];
				final int z = this.zVertices[i_264_];
				if (x < lowestX) {
					lowestX = x;
				}
				if (x > highestX) {
					highestX = x;
				}
				if (y < lowestY) {
					lowestY = y;
				}
				if (y > highestY) {
					highestY = y;
				}
				if (z < lowestZ) {
					lowestZ = z;
				}
				if (z > highestZ) {
					highestZ = z;
				}
			}
			aShort2854 = (short) lowestX;
			aShort2902 = (short) highestX;
			aShort2874 = (short) lowestY;
			aShort2868 = (short) highestY;
			aShort2889 = (short) lowestZ;
			aShort2865 = (short) highestZ;
		}
	}

	final Model method2305(final int i, final int i_268_, final int[][] is, final int[][] is_269_, final int i_270_, final int i_271_, final int i_272_, final boolean bool, final boolean bool_273_) {
		calculateBounds();
		int i_274_ = i_270_ + aShort2854;
		int i_275_ = i_270_ + aShort2902;
		int i_276_ = i_272_ + aShort2889;
		int i_277_ = i_272_ + aShort2865;
		if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_274_ < 0 || i_275_ + 128 >> 7 >= is.length || i_276_ < 0 || i_277_ + 128 >> 7 >= is[0].length)) {
			return this;
		}
		if (i == 4 || i == 5) {
			if (is_269_ == null) {
				return this;
			}
			if (i_274_ < 0 || i_275_ + 128 >> 7 >= is_269_.length || i_276_ < 0 || i_277_ + 128 >> 7 >= is_269_[0].length) {
				return this;
			}
		} else {
			i_274_ >>= 7;
			i_275_ = i_275_ + 127 >> 7;
			i_276_ >>= 7;
			i_277_ = i_277_ + 127 >> 7;
			if (is[i_274_][i_276_] == i_271_ && is[i_275_][i_276_] == i_271_ && is[i_274_][i_277_] == i_271_ && is[i_275_][i_277_] == i_271_) {
				return this;
			}
		}
		Model class180_sub2_278_;
		if (bool) {
			class180_sub2_278_ = new Model();
			class180_sub2_278_.vertexCount = this.vertexCount;
			class180_sub2_278_.highestVertexId = this.highestVertexId;
			class180_sub2_278_.triangleCount = this.triangleCount;
			class180_sub2_278_.anInt2855 = this.anInt2855;
			class180_sub2_278_.facesA = this.facesA;
			class180_sub2_278_.facesB = this.facesB;
			class180_sub2_278_.facesC = this.facesC;
			class180_sub2_278_.faceRenderTypes = this.faceRenderTypes;
			class180_sub2_278_.facePriorities = this.facePriorities;
			class180_sub2_278_.faceAlphas = this.faceAlphas;
			class180_sub2_278_.faceTextureIndex = this.faceTextureIndex;
			class180_sub2_278_.faceColors = this.faceColors;
			class180_sub2_278_.faceTextures = this.faceTextures;
			class180_sub2_278_.modelPriority = this.modelPriority;
			class180_sub2_278_.textureTypes = this.textureTypes;
			class180_sub2_278_.textureFacesP = this.textureFacesP;
			class180_sub2_278_.textureFacesM = this.textureFacesM;
			class180_sub2_278_.textureFacesN = this.textureFacesN;
			class180_sub2_278_.texturesScaleX = this.texturesScaleX;
			class180_sub2_278_.texturesScaleY = this.texturesScaleY;
			class180_sub2_278_.texturesScaleZ = this.texturesScaleZ;
			class180_sub2_278_.textureRotationY = this.textureRotationY;
			class180_sub2_278_.aByteArray2888 = this.aByteArray2888;
			class180_sub2_278_.aByteArray2870 = this.aByteArray2870;
			class180_sub2_278_.aByteArray2859 = this.aByteArray2859;
			class180_sub2_278_.aByteArray2851 = this.aByteArray2851;
			class180_sub2_278_.vertexLabelIds = this.vertexLabelIds;
			class180_sub2_278_.faceLabelIds = this.faceLabelIds;
			class180_sub2_278_.vertexLabels = this.vertexLabels;
			class180_sub2_278_.triangleLabels = this.triangleLabels;
			class180_sub2_278_.ambient = this.ambient;
			class180_sub2_278_.contrast = this.contrast;
			class180_sub2_278_.normals = this.normals;
			class180_sub2_278_.aClass115Array2880 = this.aClass115Array2880;
			class180_sub2_278_.aClass26Array2893 = this.aClass26Array2893;
			class180_sub2_278_.aClass158Array2871 = this.aClass158Array2871;
			class180_sub2_278_.aClass169Array2887 = this.aClass169Array2887;
			if (i == 3) {
				class180_sub2_278_.xVertices = SpotAnimType.arrayCopy(this.xVertices);
				class180_sub2_278_.yVertices = SpotAnimType.arrayCopy(this.yVertices);
				class180_sub2_278_.zVertices = SpotAnimType.arrayCopy(this.zVertices);
			} else {
				class180_sub2_278_.xVertices = this.xVertices;
				class180_sub2_278_.yVertices = new int[class180_sub2_278_.vertexCount];
				class180_sub2_278_.zVertices = this.zVertices;
			}
		} else {
			class180_sub2_278_ = this;
		}
		if (i == 1) {
			for (int i_279_ = 0; i_279_ < class180_sub2_278_.highestVertexId; i_279_++) {
				final int i_280_ = this.xVertices[i_279_] + i_270_;
				final int i_281_ = this.zVertices[i_279_] + i_272_;
				final int i_282_ = i_280_ & 0x7f;
				final int i_283_ = i_281_ & 0x7f;
				final int i_284_ = i_280_ >> 7;
				final int i_285_ = i_281_ >> 7;
				final int i_286_ = is[i_284_][i_285_] * (128 - i_282_) + is[i_284_ + 1][i_285_] * i_282_ >> 7;
				final int i_287_ = is[i_284_][i_285_ + 1] * (128 - i_282_) + is[i_284_ + 1][i_285_ + 1] * i_282_ >> 7;
				final int i_288_ = i_286_ * (128 - i_283_) + i_287_ * i_283_ >> 7;
				class180_sub2_278_.yVertices[i_279_] = this.yVertices[i_279_] + i_288_ - i_271_;
			}
			for (int i_289_ = class180_sub2_278_.highestVertexId; i_289_ < class180_sub2_278_.vertexCount; i_289_++) {
				final int i_290_ = this.xVertices[i_289_] + i_270_;
				final int i_291_ = this.zVertices[i_289_] + i_272_;
				final int i_292_ = i_290_ & 0x7f;
				final int i_293_ = i_291_ & 0x7f;
				final int i_294_ = i_290_ >> 7;
				final int i_295_ = i_291_ >> 7;
				if (i_294_ >= 0 && i_294_ < is.length - 1 && i_295_ >= 0 && i_295_ < is[0].length - 1) {
					final int i_296_ = is[i_294_][i_295_] * (128 - i_292_) + is[i_294_ + 1][i_295_] * i_292_ >> 7;
					final int i_297_ = is[i_294_][i_295_ + 1] * (128 - i_292_) + is[i_294_ + 1][i_295_ + 1] * i_292_ >> 7;
					final int i_298_ = i_296_ * (128 - i_293_) + i_297_ * i_293_ >> 7;
					class180_sub2_278_.yVertices[i_289_] = this.yVertices[i_289_] + i_298_ - i_271_;
				}
			}
		} else if (i == 2) {
			for (int i_299_ = 0; i_299_ < class180_sub2_278_.highestVertexId; i_299_++) {
				final int i_300_ = (this.yVertices[i_299_] << 16) / aShort2874;
				if (i_300_ < i_268_) {
					final int i_301_ = this.xVertices[i_299_] + i_270_;
					final int i_302_ = this.zVertices[i_299_] + i_272_;
					final int i_303_ = i_301_ & 0x7f;
					final int i_304_ = i_302_ & 0x7f;
					final int i_305_ = i_301_ >> 7;
					final int i_306_ = i_302_ >> 7;
					final int i_307_ = is[i_305_][i_306_] * (128 - i_303_) + is[i_305_ + 1][i_306_] * i_303_ >> 7;
					final int i_308_ = is[i_305_][i_306_ + 1] * (128 - i_303_) + is[i_305_ + 1][i_306_ + 1] * i_303_ >> 7;
					final int i_309_ = i_307_ * (128 - i_304_) + i_308_ * i_304_ >> 7;
					class180_sub2_278_.yVertices[i_299_] = this.yVertices[i_299_] + (i_309_ - i_271_) * (i_268_ - i_300_) / i_268_;
				} else {
					class180_sub2_278_.yVertices[i_299_] = this.yVertices[i_299_];
				}
			}
			for (int i_310_ = class180_sub2_278_.highestVertexId; i_310_ < class180_sub2_278_.vertexCount; i_310_++) {
				final int i_311_ = (this.yVertices[i_310_] << 16) / aShort2874;
				if (i_311_ < i_268_) {
					final int i_312_ = this.xVertices[i_310_] + i_270_;
					final int i_313_ = this.zVertices[i_310_] + i_272_;
					final int i_314_ = i_312_ & 0x7f;
					final int i_315_ = i_313_ & 0x7f;
					final int i_316_ = i_312_ >> 7;
					final int i_317_ = i_313_ >> 7;
					if (i_316_ >= 0 && i_316_ < is.length - 1 && i_317_ >= 0 && i_317_ < is[0].length - 1) {
						final int i_318_ = is[i_316_][i_317_] * (128 - i_314_) + is[i_316_ + 1][i_317_] * i_314_ >> 7;
						final int i_319_ = is[i_316_][i_317_ + 1] * (128 - i_314_) + is[i_316_ + 1][i_317_ + 1] * i_314_ >> 7;
						final int i_320_ = i_318_ * (128 - i_315_) + i_319_ * i_315_ >> 7;
						class180_sub2_278_.yVertices[i_310_] = this.yVertices[i_310_] + (i_320_ - i_271_) * (i_268_ - i_311_) / i_268_;
					}
				} else {
					class180_sub2_278_.yVertices[i_310_] = this.yVertices[i_310_];
				}
			}
		} else if (i == 3) {
			final int i_321_ = (i_268_ & 0xff) * 4;
			final int i_322_ = (i_268_ >> 8 & 0xff) * 4;
			class180_sub2_278_.method2285(is, i_270_, i_271_, i_272_, i_321_, i_322_);
		} else if (i == 4) {
			final int i_323_ = aShort2868 - aShort2874;
			for (int i_324_ = 0; i_324_ < this.highestVertexId; i_324_++) {
				final int i_325_ = this.xVertices[i_324_] + i_270_;
				final int i_326_ = this.zVertices[i_324_] + i_272_;
				final int i_327_ = i_325_ & 0x7f;
				final int i_328_ = i_326_ & 0x7f;
				final int i_329_ = i_325_ >> 7;
				final int i_330_ = i_326_ >> 7;
				final int i_331_ = is_269_[i_329_][i_330_] * (128 - i_327_) + is_269_[i_329_ + 1][i_330_] * i_327_ >> 7;
				final int i_332_ = is_269_[i_329_][i_330_ + 1] * (128 - i_327_) + is_269_[i_329_ + 1][i_330_ + 1] * i_327_ >> 7;
				final int i_333_ = i_331_ * (128 - i_328_) + i_332_ * i_328_ >> 7;
				class180_sub2_278_.yVertices[i_324_] = this.yVertices[i_324_] + i_333_ - i_271_ + i_323_;
			}
			for (int i_334_ = class180_sub2_278_.highestVertexId; i_334_ < class180_sub2_278_.vertexCount; i_334_++) {
				final int i_335_ = this.xVertices[i_334_] + i_270_;
				final int i_336_ = this.zVertices[i_334_] + i_272_;
				final int i_337_ = i_335_ & 0x7f;
				final int i_338_ = i_336_ & 0x7f;
				final int i_339_ = i_335_ >> 7;
				final int i_340_ = i_336_ >> 7;
				if (i_339_ >= 0 && i_339_ < is_269_.length - 1 && i_340_ >= 0 && i_340_ < is_269_[0].length - 1) {
					final int i_341_ = is_269_[i_339_][i_340_] * (128 - i_337_) + is_269_[i_339_ + 1][i_340_] * i_337_ >> 7;
					final int i_342_ = is_269_[i_339_][i_340_ + 1] * (128 - i_337_) + is_269_[i_339_ + 1][i_340_ + 1] * i_337_ >> 7;
					final int i_343_ = i_341_ * (128 - i_338_) + i_342_ * i_338_ >> 7;
					class180_sub2_278_.yVertices[i_334_] = this.yVertices[i_334_] + i_343_ - i_271_ + i_323_;
				}
			}
		} else if (i == 5) {
			final int i_344_ = aShort2868 - aShort2874;
			for (int i_345_ = 0; i_345_ < this.highestVertexId; i_345_++) {
				final int i_346_ = this.xVertices[i_345_] + i_270_;
				final int i_347_ = this.zVertices[i_345_] + i_272_;
				final int i_348_ = i_346_ & 0x7f;
				final int i_349_ = i_347_ & 0x7f;
				final int i_350_ = i_346_ >> 7;
				final int i_351_ = i_347_ >> 7;
				int i_352_ = is[i_350_][i_351_] * (128 - i_348_) + is[i_350_ + 1][i_351_] * i_348_ >> 7;
				int i_353_ = is[i_350_][i_351_ + 1] * (128 - i_348_) + is[i_350_ + 1][i_351_ + 1] * i_348_ >> 7;
				final int i_354_ = i_352_ * (128 - i_349_) + i_353_ * i_349_ >> 7;
				i_352_ = is_269_[i_350_][i_351_] * (128 - i_348_) + is_269_[i_350_ + 1][i_351_] * i_348_ >> 7;
				i_353_ = is_269_[i_350_][i_351_ + 1] * (128 - i_348_) + is_269_[i_350_ + 1][i_351_ + 1] * i_348_ >> 7;
				final int i_355_ = i_352_ * (128 - i_349_) + i_353_ * i_349_ >> 7;
				final int i_356_ = i_354_ - i_355_;
				class180_sub2_278_.yVertices[i_345_] = ((this.yVertices[i_345_] << 8) / i_344_ * i_356_ >> 8) - (i_271_ - i_354_);
			}
			for (int i_357_ = class180_sub2_278_.highestVertexId; i_357_ < class180_sub2_278_.vertexCount; i_357_++) {
				final int i_358_ = this.xVertices[i_357_] + i_270_;
				final int i_359_ = this.zVertices[i_357_] + i_272_;
				final int i_360_ = i_358_ & 0x7f;
				final int i_361_ = i_359_ & 0x7f;
				final int i_362_ = i_358_ >> 7;
				final int i_363_ = i_359_ >> 7;
				if (i_362_ >= 0 && i_362_ < is.length - 1 && i_362_ < is_269_.length - 1 && i_363_ >= 0 && i_363_ < is[0].length - 1 && i_363_ < is_269_[0].length - 1) {
					int i_364_ = is[i_362_][i_363_] * (128 - i_360_) + is[i_362_ + 1][i_363_] * i_360_ >> 7;
					int i_365_ = is[i_362_][i_363_ + 1] * (128 - i_360_) + is[i_362_ + 1][i_363_ + 1] * i_360_ >> 7;
					final int i_366_ = i_364_ * (128 - i_361_) + i_365_ * i_361_ >> 7;
					i_364_ = is_269_[i_362_][i_363_] * (128 - i_360_) + is_269_[i_362_ + 1][i_363_] * i_360_ >> 7;
					i_365_ = is_269_[i_362_][i_363_ + 1] * (128 - i_360_) + is_269_[i_362_ + 1][i_363_ + 1] * i_360_ >> 7;
					final int i_367_ = i_364_ * (128 - i_361_) + i_365_ * i_361_ >> 7;
					final int i_368_ = i_366_ - i_367_;
					class180_sub2_278_.yVertices[i_357_] = ((this.yVertices[i_357_] << 8) / i_344_ * i_368_ >> 8) - (i_271_ - i_366_);
				}
			}
		}
		if (bool_273_) {
			class180_sub2_278_.method2296();
		} else {
			boundsCalculated = false;
		}
		return class180_sub2_278_;
	}

	final void scale(final int x, final int y, final int z) {
		for (int i_371_ = 0; i_371_ < this.vertexCount; i_371_++) {
			this.xVertices[i_371_] = this.xVertices[i_371_] * x / 128;
			this.yVertices[i_371_] = this.yVertices[i_371_] * y / 128;
			this.zVertices[i_371_] = this.zVertices[i_371_] * z / 128;
		}
		method2296();
	}

	final void recolor(final short i, final short i_372_) {
		for (int i_373_ = 0; i_373_ < this.triangleCount; i_373_++) {
			if (this.faceColors[i_373_] == i) {
				this.faceColors[i_373_] = i_372_;
			}
		}
	}

	private final void method2308(final int i) {
		final int i_374_ = sinTable[i];
		final int i_375_ = cosinTable[i];
		for (int i_376_ = 0; i_376_ < this.vertexCount; i_376_++) {
			final int i_377_ = this.yVertices[i_376_] * i_374_ + this.xVertices[i_376_] * i_375_ >> 16;
			this.yVertices[i_376_] = this.yVertices[i_376_] * i_375_ - this.xVertices[i_376_] * i_374_ >> 16;
			this.xVertices[i_376_] = i_377_;
		}
		method2296();
	}

	private Model() {
		this.highestVertexId = 0;
	}
	
	public int modelId = -1;

	private Model(final byte[] buffer, int id) {
		this.highestVertexId = 0;
		modelId = id;
		if (buffer[buffer.length - 1] == -1 && buffer[buffer.length - 2] == -1) {
			decodeNew(buffer);
		} else {
			decodeOld(buffer);
		}
	}

	Model(final int i, final int i_378_, final int i_379_) {
		this.highestVertexId = 0;
		this.xVertices = new int[i];
		this.yVertices = new int[i];
		this.zVertices = new int[i];
		this.vertexLabelIds = new int[i];
		this.facesA = new int[i_378_];
		this.facesB = new int[i_378_];
		this.facesC = new int[i_378_];
		this.faceRenderTypes = new byte[i_378_];
		this.facePriorities = new byte[i_378_];
		this.faceAlphas = new byte[i_378_];
		this.faceColors = new short[i_378_];
		this.faceTextures = new short[i_378_];
		this.faceTextureIndex = new byte[i_378_];
		this.faceLabelIds = new int[i_378_];
		if (i_379_ > 0) {
			this.textureTypes = new byte[i_379_];
			this.textureFacesP = new short[i_379_];
			this.textureFacesM = new short[i_379_];
			this.textureFacesN = new short[i_379_];
			this.texturesScaleX = new short[i_379_];
			this.texturesScaleY = new short[i_379_];
			this.texturesScaleZ = new short[i_379_];
			this.textureRotationY = new byte[i_379_];
			this.aByteArray2888 = new byte[i_379_];
			this.aByteArray2870 = new byte[i_379_];
			this.aByteArray2859 = new byte[i_379_];
			this.aByteArray2851 = new byte[i_379_];
		}
	}

	Model(final Model[] class180_sub2s, final int i) {
		this.highestVertexId = 0;
		boolean bool = false;
		boolean bool_380_ = false;
		boolean bool_381_ = false;
		boolean bool_382_ = false;
		boolean bool_383_ = false;
		boolean bool_384_ = false;
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.anInt2855 = 0;
		int i_385_ = 0;
		int i_386_ = 0;
		this.modelPriority = (byte) -1;
		for (int i_387_ = 0; i_387_ < i; i_387_++) {
			final Model class180_sub2_388_ = class180_sub2s[i_387_];
			if (class180_sub2_388_ != null) {
				this.vertexCount += class180_sub2_388_.vertexCount;
				this.triangleCount += class180_sub2_388_.triangleCount;
				this.anInt2855 += class180_sub2_388_.anInt2855;
				if (class180_sub2_388_.facePriorities != null) {
					bool_380_ = true;
				} else {
					if (this.modelPriority == -1) {
						this.modelPriority = class180_sub2_388_.modelPriority;
					}
					if (this.modelPriority != class180_sub2_388_.modelPriority) {
						bool_380_ = true;
					}
				}
				bool = bool | class180_sub2_388_.faceRenderTypes != null;
				bool_381_ = bool_381_ | class180_sub2_388_.faceAlphas != null;
				bool_382_ = bool_382_ | class180_sub2_388_.faceLabelIds != null;
				bool_383_ = bool_383_ | class180_sub2_388_.faceTextures != null;
				bool_384_ = bool_384_ | class180_sub2_388_.faceTextureIndex != null;
				if (class180_sub2_388_.aClass158Array2871 != null) {
					i_385_ += class180_sub2_388_.aClass158Array2871.length;
				}
				if (class180_sub2_388_.aClass169Array2887 != null) {
					i_386_ += class180_sub2_388_.aClass169Array2887.length;
				}
			}
		}
		this.xVertices = new int[this.vertexCount];
		this.yVertices = new int[this.vertexCount];
		this.zVertices = new int[this.vertexCount];
		this.vertexLabelIds = new int[this.vertexCount];
		this.aShortArray2852 = new short[this.vertexCount];
		this.facesA = new int[this.triangleCount];
		this.facesB = new int[this.triangleCount];
		this.facesC = new int[this.triangleCount];
		if (bool) {
			this.faceRenderTypes = new byte[this.triangleCount];
		}
		if (bool_380_) {
			this.facePriorities = new byte[this.triangleCount];
		}
		if (bool_381_) {
			this.faceAlphas = new byte[this.triangleCount];
		}
		if (bool_382_) {
			this.faceLabelIds = new int[this.triangleCount];
		}
		if (bool_383_) {
			this.faceTextures = new short[this.triangleCount];
		}
		if (bool_384_) {
			this.faceTextureIndex = new byte[this.triangleCount];
		}
		if (i_385_ > 0) {
			this.aClass158Array2871 = new ModelParticleEmitter[i_385_];
		}
		if (i_386_ > 0) {
			this.aClass169Array2887 = new ModelParticleMagnet[i_386_];
		}
		this.faceColors = new short[this.triangleCount];
		this.aShortArray2867 = new short[this.triangleCount];
		if (this.anInt2855 > 0) {
			this.textureTypes = new byte[this.anInt2855];
			this.textureFacesP = new short[this.anInt2855];
			this.textureFacesM = new short[this.anInt2855];
			this.textureFacesN = new short[this.anInt2855];
			this.texturesScaleX = new short[this.anInt2855];
			this.texturesScaleY = new short[this.anInt2855];
			this.texturesScaleZ = new short[this.anInt2855];
			this.textureRotationY = new byte[this.anInt2855];
			this.aByteArray2888 = new byte[this.anInt2855];
			this.aByteArray2870 = new byte[this.anInt2855];
			this.aByteArray2859 = new byte[this.anInt2855];
			this.aByteArray2851 = new byte[this.anInt2855];
		}
		this.vertexCount = 0;
		this.triangleCount = 0;
		this.anInt2855 = 0;
		i_385_ = 0;
		i_386_ = 0;
		for (int i_389_ = 0; i_389_ < i; i_389_++) {
			final short i_390_ = (short) (1 << i_389_);
			final Model class180_sub2_391_ = class180_sub2s[i_389_];
			if (class180_sub2_391_ != null) {
				for (int i_392_ = 0; i_392_ < class180_sub2_391_.triangleCount; i_392_++) {
					if (bool && class180_sub2_391_.faceRenderTypes != null) {
						this.faceRenderTypes[this.triangleCount] = class180_sub2_391_.faceRenderTypes[i_392_];
					}
					if (bool_380_) {
						if (class180_sub2_391_.facePriorities != null) {
							this.facePriorities[this.triangleCount] = class180_sub2_391_.facePriorities[i_392_];
						} else {
							this.facePriorities[this.triangleCount] = class180_sub2_391_.modelPriority;
						}
					}
					if (bool_381_ && class180_sub2_391_.faceAlphas != null) {
						this.faceAlphas[this.triangleCount] = class180_sub2_391_.faceAlphas[i_392_];
					}
					if (bool_382_ && class180_sub2_391_.faceLabelIds != null) {
						this.faceLabelIds[this.triangleCount] = class180_sub2_391_.faceLabelIds[i_392_];
					}
					if (bool_383_) {
						if (class180_sub2_391_.faceTextures != null) {
							this.faceTextures[this.triangleCount] = class180_sub2_391_.faceTextures[i_392_];
						} else {
							this.faceTextures[this.triangleCount] = (short) -1;
						}
					}
					this.faceColors[this.triangleCount] = class180_sub2_391_.faceColors[i_392_];
					this.aShortArray2867[this.triangleCount] = i_390_;
					this.facesA[this.triangleCount] = method2280(class180_sub2_391_, class180_sub2_391_.facesA[i_392_], i_390_);
					this.facesB[this.triangleCount] = method2280(class180_sub2_391_, class180_sub2_391_.facesB[i_392_], i_390_);
					this.facesC[this.triangleCount] = method2280(class180_sub2_391_, class180_sub2_391_.facesC[i_392_], i_390_);
					this.triangleCount++;
				}
				if (class180_sub2_391_.aClass158Array2871 != null) {
					for (int i_393_ = 0; i_393_ < class180_sub2_391_.aClass158Array2871.length; i_393_++) {
						final int i_394_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1485, i_390_);
						final int i_395_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1484, i_390_);
						final int i_396_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1476, i_390_);
						this.aClass158Array2871[i_385_] = new ModelParticleEmitter(class180_sub2_391_.aClass158Array2871[i_393_].emitterType, i_394_, i_395_, i_396_);
						i_385_++;
					}
				}
				if (class180_sub2_391_.aClass169Array2887 != null) {
					for (int i_397_ = 0; i_397_ < class180_sub2_391_.aClass169Array2887.length; i_397_++) {
						final int i_398_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass169Array2887[i_397_].vertexId, i_390_);
						this.aClass169Array2887[i_386_] = new ModelParticleMagnet(class180_sub2_391_.aClass169Array2887[i_397_].magnetType, i_398_);
						i_386_++;
					}
				}
			}
		}
		int i_399_ = 0;
		this.highestVertexId = this.vertexCount;
		for (int i_400_ = 0; i_400_ < i; i_400_++) {
			final Model class180_sub2_401_ = class180_sub2s[i_400_];
			final short i_402_ = (short) (1 << i_400_);
			if (class180_sub2_401_ != null) {
				for (int i_403_ = 0; i_403_ < class180_sub2_401_.triangleCount; i_403_++) {
					if (bool_384_) {
						this.faceTextureIndex[i_399_++] = (byte) (class180_sub2_401_.faceTextureIndex != null && class180_sub2_401_.faceTextureIndex[i_403_] != -1 ? class180_sub2_401_.faceTextureIndex[i_403_] + this.anInt2855 : -1);
					}
				}
				for (int i_404_ = 0; i_404_ < class180_sub2_401_.anInt2855; i_404_++) {
					final byte i_405_ = this.textureTypes[this.anInt2855] = class180_sub2_401_.textureTypes[i_404_];
					if (i_405_ == 0) {
						this.textureFacesP[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.textureFacesP[i_404_], i_402_);
						this.textureFacesM[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.textureFacesM[i_404_], i_402_);
						this.textureFacesN[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.textureFacesN[i_404_], i_402_);
					}
					if (i_405_ >= 1 && i_405_ <= 3) {
						this.textureFacesP[this.anInt2855] = class180_sub2_401_.textureFacesP[i_404_];
						this.textureFacesM[this.anInt2855] = class180_sub2_401_.textureFacesM[i_404_];
						this.textureFacesN[this.anInt2855] = class180_sub2_401_.textureFacesN[i_404_];
						this.texturesScaleX[this.anInt2855] = class180_sub2_401_.texturesScaleX[i_404_];
						this.texturesScaleY[this.anInt2855] = class180_sub2_401_.texturesScaleY[i_404_];
						this.texturesScaleZ[this.anInt2855] = class180_sub2_401_.texturesScaleZ[i_404_];
						this.textureRotationY[this.anInt2855] = class180_sub2_401_.textureRotationY[i_404_];
						this.aByteArray2888[this.anInt2855] = class180_sub2_401_.aByteArray2888[i_404_];
						this.aByteArray2870[this.anInt2855] = class180_sub2_401_.aByteArray2870[i_404_];
					}
					if (i_405_ == 2) {
						this.aByteArray2859[this.anInt2855] = class180_sub2_401_.aByteArray2859[i_404_];
						this.aByteArray2851[this.anInt2855] = class180_sub2_401_.aByteArray2851[i_404_];
					}
					this.anInt2855++;
				}
			}
		}
	}

	Model(final Model class180_sub2_406_, final boolean bool, final boolean bool_407_, final boolean bool_408_, final boolean bool_409_) {
		this.highestVertexId = 0;
		this.vertexCount = class180_sub2_406_.vertexCount;
		this.highestVertexId = class180_sub2_406_.highestVertexId;
		this.triangleCount = class180_sub2_406_.triangleCount;
		this.anInt2855 = class180_sub2_406_.anInt2855;
		if (bool) {
			this.xVertices = class180_sub2_406_.xVertices;
			this.yVertices = class180_sub2_406_.yVertices;
			this.zVertices = class180_sub2_406_.zVertices;
		} else {
			this.xVertices = new int[this.vertexCount];
			this.yVertices = new int[this.vertexCount];
			this.zVertices = new int[this.vertexCount];
			for (int i = 0; i < this.vertexCount; i++) {
				this.xVertices[i] = class180_sub2_406_.xVertices[i];
				this.yVertices[i] = class180_sub2_406_.yVertices[i];
				this.zVertices[i] = class180_sub2_406_.zVertices[i];
			}
		}
		if (bool_407_) {
			this.faceColors = class180_sub2_406_.faceColors;
		} else {
			this.faceColors = new short[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				this.faceColors[i] = class180_sub2_406_.faceColors[i];
			}
		}
		if (bool_408_ || class180_sub2_406_.faceTextures == null) {
			this.faceTextures = class180_sub2_406_.faceTextures;
		} else {
			this.faceTextures = new short[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				this.faceTextures[i] = class180_sub2_406_.faceTextures[i];
			}
		}
		if (bool_409_) {
			this.faceAlphas = class180_sub2_406_.faceAlphas;
		} else {
			this.faceAlphas = new byte[this.triangleCount];
			if (class180_sub2_406_.faceAlphas == null) {
				for (int i = 0; i < this.triangleCount; i++) {
					this.faceAlphas[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < this.triangleCount; i++) {
					this.faceAlphas[i] = class180_sub2_406_.faceAlphas[i];
				}
			}
		}
		this.facesA = class180_sub2_406_.facesA;
		this.facesB = class180_sub2_406_.facesB;
		this.facesC = class180_sub2_406_.facesC;
		this.faceRenderTypes = class180_sub2_406_.faceRenderTypes;
		this.facePriorities = class180_sub2_406_.facePriorities;
		this.faceTextureIndex = class180_sub2_406_.faceTextureIndex;
		this.modelPriority = class180_sub2_406_.modelPriority;
		this.textureTypes = class180_sub2_406_.textureTypes;
		this.textureFacesP = class180_sub2_406_.textureFacesP;
		this.textureFacesM = class180_sub2_406_.textureFacesM;
		this.textureFacesN = class180_sub2_406_.textureFacesN;
		this.texturesScaleX = class180_sub2_406_.texturesScaleX;
		this.texturesScaleY = class180_sub2_406_.texturesScaleY;
		this.texturesScaleZ = class180_sub2_406_.texturesScaleZ;
		this.textureRotationY = class180_sub2_406_.textureRotationY;
		this.aByteArray2888 = class180_sub2_406_.aByteArray2888;
		this.aByteArray2870 = class180_sub2_406_.aByteArray2870;
		this.aByteArray2859 = class180_sub2_406_.aByteArray2859;
		this.aByteArray2851 = class180_sub2_406_.aByteArray2851;
		this.vertexLabelIds = class180_sub2_406_.vertexLabelIds;
		this.faceLabelIds = class180_sub2_406_.faceLabelIds;
		this.vertexLabels = class180_sub2_406_.vertexLabels;
		this.triangleLabels = class180_sub2_406_.triangleLabels;
		this.normals = class180_sub2_406_.normals;
		this.aClass115Array2880 = class180_sub2_406_.aClass115Array2880;
		this.aClass26Array2893 = class180_sub2_406_.aClass26Array2893;
		this.ambient = class180_sub2_406_.ambient;
		this.contrast = class180_sub2_406_.contrast;
		this.aClass158Array2871 = class180_sub2_406_.aClass158Array2871;
		this.aClass169Array2887 = class180_sub2_406_.aClass169Array2887;
	}
}
