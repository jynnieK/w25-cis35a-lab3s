public class Driver {

    // define test strings
    public static final String[] tSeq = {
            "AGCCTAGGATCAG",
            "AGCCTAGGATCTAGGATCAG",
            "AGCCTATAGGATCAG",
            "AAAGCCTAGGATAGGATCAG",
            "AAAGCCTCTGAGGATAGGATCAG"
    };

    public static void main(String[] args) {
        // Sample runs per instructions
        DNA dna1 = new DNA(tSeq[0]);
        DNA dna2 = new DNA(tSeq[1]);
        DNA dna3 = new DNA(tSeq[2]);
        DNA dna4 = new DNA(tSeq[3]);
        DNA dna5 = new DNA(tSeq[4]);
        dna1.print();
        dna2.print();
        dna3.print();
        dna4.print();
        dna5.print();
    }
}