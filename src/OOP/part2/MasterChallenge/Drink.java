package OOP.part2.MasterChallenge;

public class Drink {

    private char type;
    private char size;
    private double price;

    public Drink(char type, char size) {
        this.type = type;
        this.size = size;
        setSize(this.size);
        setType(this.type);
        if (this.price == 0) {
            System.out.println("Invalid input, we accept only R, L, and S");
        }
    }

    public void changeDrinkSize(char size){
        setSize(size);
        if (this.price == 0) {
            System.out.println("Invalid input, we accept only R, L, and S");
        }
        else {
            System.out.println("Drink Size is updated.");
        }
    }

    public double getPrice() {
        return price;
    }

    private void setSize(char size){
        switch (Character.toUpperCase(size)) {
            case 'R' -> this.price = 10;
            case 'L' -> this.price = 15;
            case  'S' -> this.price = 5;
            default -> this.price = 0;
        }
    }

    private void setType(char type){
        switch (Character.toUpperCase(type)) {
            case 'S' -> this.price += 5;
            case 'H' -> this.price +=7;
            default -> this.price = 0;
        }
    }
}
