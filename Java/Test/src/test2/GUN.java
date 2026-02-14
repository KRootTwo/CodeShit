public class GUN {
    private final String name;
    private final String model;
    private final String action;
    private final Var variation;
    private final int magCap;
    private final int year;
    private int cBull = magCap;
    private boolean safe;
    private boolean lvl;
    private enum Var {
        MP43, MP44, StG44, MKb42H, MKb42W
    }

    GUN(String name, String model, int year, int magCap, Var variation) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.magCap = magCap;
        this.variation = variation;
    }
    
        
}
