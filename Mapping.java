/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Mapping {
	int mux;
	int submaps;
	int[] submapFloors;
	int[] submapResidues;

	Mapping() {
		Class120_Sub23.getInt(16);//version 0
		this.submaps = Class120_Sub23.getBit() != 0 ? Class120_Sub23.getInt(4) + 1 : 1;
		if (Class120_Sub23.getBit() != 0) {
			Class120_Sub23.getInt(8);//couplingSteps
		}
		Class120_Sub23.getInt(2);//reserved mapping field
		if (this.submaps > 1) {
			this.mux = Class120_Sub23.getInt(4);
		}
		this.submapFloors = new int[this.submaps];
		this.submapResidues = new int[this.submaps];
		for (int id = 0; id < this.submaps; id++) {
			Class120_Sub23.getInt(8);//discard time placeholder
			this.submapFloors[id] = Class120_Sub23.getInt(8);
			this.submapResidues[id] = Class120_Sub23.getInt(8);
		}
	}
}
