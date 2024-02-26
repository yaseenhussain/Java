package OOP.part1;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(radius,0);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
