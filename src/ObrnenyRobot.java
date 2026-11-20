public class ObrnenyRobot extends Robot {
    int silaUtoku;

    public ObrnenyRobot(){
        super();
        silaUtoku = 20;
    }

    @Override
    public int getSilaUtoku() {
        return silaUtoku;
    }

    @Override
    public void prijmoutZasah(int sila) {
        setBodyEnergie(getBodyEnergie()-(sila-10));
        System.out.println("obrneny robot prijmul ztasah - " + sila);
        System.out.println("obrneny robot ma energie - " + this.getBodyEnergie());
    }
}
