/* Class120_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CustomLocation extends Node {
	static String[] aStringArray2716;
	int rotation;
	static int mapFunctionCount;
	int id;
	int cycle1 = -1;//TODO
	int clientType;//0 wall, 1 wall decoration, 2 object, 3 ground decoration
	int level;
	int originalLocId;
	static int menuWidth;
	int z;
	int type;
	int originalLocType;
	int originalLocRotation;
	static int[] anIntArray2730;
	int x;
	int cycle2 = 0;//TODO

	static {
		mapFunctionCount = 0;
		aStringArray2716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		anIntArray2730 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };
	}

}
