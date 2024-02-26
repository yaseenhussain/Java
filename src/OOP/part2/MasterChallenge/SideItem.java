package OOP.part2.MasterChallenge;

public class SideItem {

    private char type;
    private double price;

    public SideItem(char type) {
        this.type = Character.toUpperCase(type);
        switch (this.type) {
            case 'F' -> this.price = 8;
            case 'C' -> this.price = 15;
            default -> this.price = 0;
        }
        if (this.price == 0) {
            System.out.println("Invalid input, we accept only F and C");
        }
    }

    public double getPrice() {
        return price;
    }
}
