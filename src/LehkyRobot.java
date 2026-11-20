public class LehkyRobot extends Robot {
    int silaUtoku;

    public LehkyRobot(){
        super();
        silaUtoku = 30;
    }

    @Override
    public int getSilaUtoku() {
        return silaUtoku;
    }

    @Override
    public void prijmoutZasah(int sila) {
        setBodyEnergie(getBodyEnergie()-sila);
        System.out.println("lehky robot prijmul ztasah - " + sila);
        System.out.println("lehky robot ma energie - " + this.getBodyEnergie());
    }


}
