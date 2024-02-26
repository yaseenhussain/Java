package OOP.part1;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return calculate(this.x, 0, this.y, 0);
    };

    public double distance(Point point){
        return calculate(this.x, point.x, this.y, point.y);
    };

    public double distance(int x, int y){
        return calculate(this.x, x, this.y, y);
    };

    public double calculate(int x1, int x2, int y1, int y2){
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        //A(xA,yA) and B(xB,yB),
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    }



}
