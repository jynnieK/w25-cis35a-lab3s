public class DNA {
    NucleicAcid[] L2R_helix;
    NucleicAcid[] R2L_helix;

    public DNA() {
//        L2R_helix = new NucleicAcid[1];
//        R2L_helix = new NucleicAcid[1];
    }

    // this constructor calls L2R_populate() & R2L_populate() to
    // populate the two arrays
    public DNA(String strand) {
        L2R_helix = new NucleicAcid[strand.length()];
        L2R_populate(strand);

        R2L_helix = new NucleicAcid[strand.length()];
        R2L_populate(strand);
    }

    // I'm unsure about the assignment's instructions on creating the nucleic
    // acid objects. In this case, the data is hard-coded into the program.
    public void L2R_populate(String strand) {
        for (int i = 0; i < strand.length(); i++) {
            char c = strand.charAt(i);
            System.out.print(c + " at position " + i + ", ");
            switch (c) {
                case 'A': L2R_helix[i] = new NucleicAcid(
                        "Adenine", "C5N5H5" , 135.13f, 1.6f
                );
                    break;

                case 'T': L2R_helix[i] = new NucleicAcid(
                        "Thymine", "C5H6N2O2", 126.115f, 1.223f
                );
                    break;

                case 'C': L2R_helix[i] = new NucleicAcid(
                        "Cytosine", "C4H5N3O", 111.10f, 1.55f
                );
                    break;

                case 'G': L2R_helix[i] = new NucleicAcid(
                        "Guanine", "C5H5N5O", 151.13f, 2.2f
                );
                    break;
            }
        }
    }

    public void R2L_populate(String strand) {
        for (int i = 0; i < strand.length(); i++) {
            char c = strand.charAt(i);
            System.out.print(c + " at position " + i + ", ");
            // ID each character, insert codon at array position
            switch (c) {
                case 'T': R2L_helix[i] = new NucleicAcid(
                        "Adenine", "C5N5H5" , 135.13f, 1.6f
                );
                    break;

                case 'A': R2L_helix[i] = new NucleicAcid(
                        "Thymine", "C5H6N2O2", 126.115f, 1.223f
                );
                    break;

                case 'G': R2L_helix[i] = new NucleicAcid(
                        "Cytosine", "C4H5N3O", 111.10f, 1.55f
                );
                    break;

                case 'C': R2L_helix[i] = new NucleicAcid(
                        "Guanine", "C5H5N5O", 151.13f, 2.2f
                );
                    break;
            }
        }
    }

    // iterates thru array, calls print() for each obj
    public void print() {
        // TODO: formatting
        for (NucleicAcid n : L2R_helix) {
            n.print();
        }
        for (NucleicAcid n : R2L_helix) {
            n.print();
        }
    }

    // iterates thru array, tracks highest mass
    public void highestMolarMass() {
        for (NucleicAcid n : L2R_helix) {
            NucleicAcid temp = new NucleicAcid();
            if (n.molMass() > temp.molMass()) {
                temp = n;
            }
        }
    }

    // twin for-loops iterate through each array and add to running total
    // tracking total density of each polynucleotide strand
    public void totalDensity() {
        int L2R_total = 0;
        for (NucleicAcid n : L2R_helix) {
            L2R_total += n.density();
        }
        int R2L_total = 0;
        for (NucleicAcid n : R2L_helix) {
            R2L_total += n.density();
        }
        System.out.printf("TODO: density here");
    }
}
