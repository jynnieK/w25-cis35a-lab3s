public class HumanGenome {
    // Variables
    private String genomeName;
    private int countGenes;
    private int countChromo;
    private int countCells;

    // default constructor
    // L3_CHANGE: I just realized Java zero-arg. constructors will implicitly
    // initialize variables to zero/null/false etc.
    // (unlike C++ which I learned first)
    public HumanGenome() {
//        genomeName = "";
//        countGenes = 0;
//        countChromo = 0;
//        countCells = 0;
    }

    // Specified construction
    public HumanGenome(String genomeName, int countGenes,
                       int countChromo, int countCells) {
        this.genomeName = genomeName;
        this.countGenes = countGenes;
        this.countChromo = countChromo;
        this.countCells = countCells;
    }

    // Getters, setters
    public String genomeName() { return genomeName; }
    public int countGenes() { return countGenes; }
    public int countChromo() { return countChromo; }
    public int countCells() { return countCells; }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public void setCountGenes(int countGenes) {
        this.countGenes = countGenes;
    }

    public void setCountChromo(int countChromo) {
        this.countChromo = countChromo;
    }

    public void setCountCells(int countCells) {
        this.countCells = countCells;
    }

    // TODO: print
    public void print() {
        System.out.printf("honk");
    }
}