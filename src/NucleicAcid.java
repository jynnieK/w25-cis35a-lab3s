public class NucleicAcid {
    private String name;
    private String formula;
    private float molMass;
    private float density;

    // default
    // L3_CHANGE: see comment in HumanGenome
    public NucleicAcid() {
//        this.name = "n/a";
//        this.formula = "n/a";
//        this.molMass = -1.0f;
//        this.density = -1.0f;
    }

    // specified constructor
    public NucleicAcid(String name, String formula,
                       float molMass, float density) {
        this.name = name;
        this.formula = formula;
        this.molMass = molMass;
        this.density = density;
    }

    // Getters
    public String name() { return name; }
    public String formula() { return formula; }
    public float molMass() { return molMass; }
    public float density() { return density; }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setMolMass(float molMass) {
        this.molMass = molMass;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    // TODO: PRINT
    public void print() {
        System.out.printf("honk");
    }
}
