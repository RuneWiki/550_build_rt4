/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Floor1 {
	private final int[] classSubclasses;
	private final int[] partitionClassList;
	private final int[] classDimensions;
	private static boolean[] step2Flags;
	private static int[] xList;
	private static int[] yList;
	private final int[] alXList;
	private final int[][] subclassBooks;
	private final int multiplier;
	private static final float[] DB_STATIC_TABLE = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F,
			3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F,
			1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
			3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F,
			1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F,
			4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F,
			1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
			4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F,
			0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F,
			0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F,
			0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F,
			0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F,
			0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
	private final int[] classMasterbooks;
	private static final int[] RANGES = { 256, 128, 86, 64 };

	final void computeFloor(final float[] vector, final int i) {
		final int values = alXList.length;
		final int range = RANGES[multiplier - 1];
		step2Flags[0] = step2Flags[1] = true;
		for (int id = 2; id < values; id++) {
			final int lowNeighbourOffset = lowNeighbour(xList, id);
			final int highNeighbourOffset = highNeighbour(xList, id);
			final int predicted = renderPoint(xList[lowNeighbourOffset], yList[lowNeighbourOffset], xList[highNeighbourOffset], yList[highNeighbourOffset], xList[id]);
			final int val = yList[id];
			final int highRoom = range - predicted;
			final int lowRoom = predicted;
			final int room = (highRoom < lowRoom ? highRoom : lowRoom) << 1;
			if (val != 0) {
				step2Flags[lowNeighbourOffset] = step2Flags[highNeighbourOffset] = true;
				step2Flags[id] = true;
				if (val >= room) {
					yList[id] = highRoom > lowRoom ? val - lowRoom + predicted : predicted - val + highRoom - 1;
				} else {
					yList[id] = (val & 0x1) != 0 ? predicted - (val + 1) / 2 : predicted + val / 2;
				}
			} else {
				step2Flags[id] = false;
				yList[id] = predicted;
			}
		}
		sort(0, values - 1);
		int lx = 0;
		int ly = yList[0] * multiplier;
		for (int id = 1; id < values; id++) {
			if (step2Flags[id]) {
				final int hx = xList[id];
				final int hy = yList[id] * multiplier;
				renderLine(lx, ly, hx, hy, vector, i);
				if (hx >= i) {
					return;
				}
				lx = hx;
				ly = hy;
			}
		}
		final float r = DB_STATIC_TABLE[ly];
		for (int id = lx; id < i; id++) {
			vector[id] *= r;
		}
	}

	private final void sort(final int i, final int i_21_) {
		if (i < i_21_) {
			int i_22_ = i;
			final int i_23_ = xList[i_22_];
			final int i_24_ = yList[i_22_];
			final boolean bool = step2Flags[i_22_];
			for (int i_25_ = i + 1; i_25_ <= i_21_; i_25_++) {
				final int i_26_ = xList[i_25_];
				if (i_26_ < i_23_) {
					xList[i_22_] = i_26_;
					yList[i_22_] = yList[i_25_];
					step2Flags[i_22_] = step2Flags[i_25_];
					i_22_++;
					xList[i_25_] = xList[i_22_];
					yList[i_25_] = yList[i_22_];
					step2Flags[i_25_] = step2Flags[i_22_];
				}
			}
			xList[i_22_] = i_23_;
			yList[i_22_] = i_24_;
			step2Flags[i_22_] = bool;
			sort(i, i_22_ - 1);
			sort(i_22_ + 1, i_21_);
		}
	}

	final boolean decodedFloor() {
		if (Class120_Sub23.getBit() == 0) {
			return false;
		}
		final int i = alXList.length;
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			xList[i_27_] = alXList[i_27_];
		}
		final int range = RANGES[multiplier - 1];
		final int bits = Class120_Sub23.ilog(range - 1);
		yList[0] = Class120_Sub23.getInt(bits);
		yList[1] = Class120_Sub23.getInt(bits);
		int offset = 2;
		for (int id = 0; id < partitionClassList.length; id++) {
			final int cls = partitionClassList[id];
			final int cdim = classDimensions[cls];
			final int cbits = classSubclasses[cls];
			final int csub = (1 << cbits) - 1;
			int cval = 0;
			if (cbits > 0) {
				cval = Class120_Sub23.codeBooks[classMasterbooks[cls]].getHuffmanRoot();
			}
			for (int j = 0; j < cdim; j++) {
				final int book = subclassBooks[cls][cval & csub];
				cval >>>= cbits;
				yList[offset++] = book >= 0 ? Class120_Sub23.codeBooks[book].getHuffmanRoot() : 0;
			}
		}
		return true;
	}
	
	private static final int lowNeighbour(final int[] v, final int x) {
		int n = -1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < x; i++) {
			if (v[i] < v[x] && v[i] > max) {
				n = i;
				max = v[i];
			}
		}
		return n;
	}

	private static final int highNeighbour(final int[] v, final int x) {
		int n = -1;
		int min = Integer.MAX_VALUE;
		for (int id = 0; id < x; id++) {
			if (v[id] > v[x] && v[id] < min) {
				min = v[id];
				n = id;
			}
		}
		return n;
	}

	private final void renderLine(final int x0, final int y0, int x1, final int y1, final float[] v, final int i_48_) {
		final int dy = y1 - y0;
		final int adx = x1 - x0;
		int ady = dy < 0 ? -dy : dy;
		final int base = dy / adx;
		int y = y0;
		int err = 0;
		final int sy = dy < 0 ? base - 1 : base + 1;
		ady = ady - (base < 0 ? -base : base) * adx;
		v[x0] *= DB_STATIC_TABLE[y];
		if (x1 > i_48_) {
			x1 = i_48_;
		}
		for (int x = x0 + 1; x < x1; x++) {
			err += ady;
			if (err >= adx) {
				err -= adx;
				y += sy;
			} else {
				y += base;
			}
			v[x] *= DB_STATIC_TABLE[y];
		}
	}

	private final int renderPoint(final int x0, final int y0, final int x1, final int y1, final int x) {
		final int dy = y1 - y0;
		final int ady = dy < 0 ? -dy : dy;
		final int off = (ady * (x - x0)) / (x1 - x0);
		return dy < 0 ? y0 - off : y0 + off;
	}

	Floor1() {
		final int type = Class120_Sub23.getInt(16);
		if (type != 1) {
			throw new RuntimeException("Unsupported floor type " + type);
		}
		final int partitions = Class120_Sub23.getInt(5);
		int maximumClass = 0;
		partitionClassList = new int[partitions];
		for (int id = 0; id < partitions; id++) {
			final int val = Class120_Sub23.getInt(4);
			partitionClassList[id] = val;
			if (maximumClass <= val) {
				maximumClass = val + 1;
			}
		}
		classDimensions = new int[maximumClass];
		classSubclasses = new int[maximumClass];
		classMasterbooks = new int[maximumClass];
		subclassBooks = new int[maximumClass][];
		for (int id = 0; id < maximumClass; id++) {
			classDimensions[id] = Class120_Sub23.getInt(3) + 1;
			int subClassVal = classSubclasses[id] = Class120_Sub23.getInt(2);
			if (subClassVal != 0) {
				classMasterbooks[id] = Class120_Sub23.getInt(8);
			}
			subClassVal = 1 << subClassVal;
			final int[] book = new int[subClassVal];
			subclassBooks[id] = book;
			for (int j = 0; j < subClassVal; j++) {
				book[j] = Class120_Sub23.getInt(8) - 1;
			}
		}
		multiplier = Class120_Sub23.getInt(2) + 1;
		final int rangeBits = Class120_Sub23.getInt(4);
		int alXListSize = 2;
		for (int i_75_ = 0; i_75_ < partitions; i_75_++) {
			alXListSize += classDimensions[partitionClassList[i_75_]];
		}
		alXList = new int[alXListSize];
		alXList[0] = 0;
		alXList[1] = 1 << rangeBits;
		alXListSize = 2;
		for (int partition = 0; partition < partitions; partition++) {
			final int classId = partitionClassList[partition];
			for (int dim = 0; dim < classDimensions[classId]; dim++) {
				alXList[alXListSize++] = Class120_Sub23.getInt(rangeBits);
			}
		}
		if (xList == null || xList.length < alXListSize) {
			xList = new int[alXListSize];
			yList = new int[alXListSize];
			step2Flags = new boolean[alXListSize];
		}
	}
}
