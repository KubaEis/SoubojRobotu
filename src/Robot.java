public abstract class Robot {
    private int bodyEnergie;

    public Robot() {
        this.bodyEnergie = 100;
    }

    public int getBodyEnergie() {
        return bodyEnergie;
    }

    public void setBodyEnergie(int bodyEnergie) {
        this.bodyEnergie = bodyEnergie;
    }

    public abstract int getSilaUtoku();


    public void utoc(Robot cil){
        if (this.bodyEnergie <= 0) {
            return;
        }else{
            cil.prijmoutZasah(this.getSilaUtoku());
            System.out.println("robot zautocil na robota za "+this.getSilaUtoku());
        }
    };

    public abstract void prijmoutZasah(int sila);

}
