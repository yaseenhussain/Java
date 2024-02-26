package OOP.part2;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return this.getClass().getSimpleName() + " -> startEngine()" ;
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()" ;

//        System.out.printf("%s -> accelerate()", this.getClass().getSimpleName());
    }

    public String brake(){
        return this.getClass().getSimpleName() + " -> brake()" ;
//        System.out.printf("%s -> brake()", this.getClass().getSimpleName());
    }
}

class Something{

}