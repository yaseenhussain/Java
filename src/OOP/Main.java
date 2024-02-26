package OOP;

//import OOP.part1.*;
//import OOP.part2.SmartKitchen;
import OOP.part2.*;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.describeCar();
//        System.out.println(car.getDoors());
//        System.out.println(car.getColor());
//        System.out.println(car.getMake());
//        BankAccount yasAccount = new BankAccount("Yaseen", "yas@gmail.com", "87665");
//        System.out.println(yasAccount);
//        BankAccount zakAccount = new BankAccount(3, 25, "Zakir", "Zak@gmail.com", "87657");
//        System.out.println(zakAccount);
//        yasAccount.depositFunds(2000.5);
//        yasAccount.withdrawFunds(-20);
//        yasAccount.withdrawFunds(25000);
//        yasAccount.withdrawFunds(1995);
//        SimpleCalculator calcy = new SimpleCalculator();
//        calcy.setFirstNumber(5);
//        calcy.setSecondNumber(4);
//        System.out.printf("add = %.2f \n sub = %.2f \n mul = %.2f \n div = %.2f", calcy.getAdditionResult(),
//                calcy.getSubtractionResult(), calcy.getMultiplicationResult(), calcy.getDivisionResult());

//        Customer cust = new Customer("yas", 25.0, "yas@gmail.com");
//        Customer cust1 = new Customer("yas1", "yas1@gmail.com");
//        Customer cust2 = new Customer();
//
//        System.out.printf("name = %s, limit = %f, email = %s \n", cust.getName(), cust.getCreditLimit(), cust.getEmailAddress());
//        System.out.printf("name = %s, limit = %f, email = %s \n", cust1.getName(), cust1.getCreditLimit(), cust1.getEmailAddress());
//        System.out.printf("name = %s, limit = %f, email = %s \n", cust2.getName(), cust2.getCreditLimit(), cust2.getEmailAddress());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

//        kitchen.setKitchenState(true, false, true);
//        kitchen.doKitchenWork();
//
//        kitchen.setKitchenState(false, true, true);
//        kitchen.doKitchenWork();

//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("Yaseen", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//
//        bedRoom.getLamp().turnOn();

//        Printer printer = new Printer(50, true);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//        printer.printPages(20);
//        System.out.println("initial page count = " + printer.getPagesPrinted());

//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());



    }

}
