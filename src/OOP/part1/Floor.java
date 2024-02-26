package OOP.part1;

public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = Math.max(length,0);
        this.width = Math.max(width,0);
    }

    public double getArea(){
        return width * length;
    }
}

