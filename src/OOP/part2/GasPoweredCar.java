package OOP.part2;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(int cylinders, String name, double avgKmPerLitre, int cylinders1) {
        super(cylinders, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders1;
    }

    //    public GasPoweredCar( double avgKmPerLitre, int cylinders) {
//        super("Gas Powered Car");
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.cylinders = cylinders;
//    }
//
//    @Override
//    protected void runEngine() {
////        super.runEngine();
//        System.out.println("I am gas powered car.");
//    }
//
//    @Override
//    public void drive() {
////        super.drive();
//        System.out.println("I am driving a gas powered car");
//    }
}
