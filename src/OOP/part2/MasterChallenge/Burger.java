package OOP.part2.MasterChallenge;

public class Burger {

    private char type;
    private double basePrice;
    private int topping;

    public Burger(char type, int topping) {
        this.type = Character.toUpperCase(type);
        this.topping = (topping < 3 && topping >0) ? topping: 0;
        if (this.type == 'D') this.topping = Math.max(topping,5);
        switch (this.type) {
            case 'R' -> this.basePrice = 20;
            case 'L' -> this.basePrice = 30;
            case  'S' -> this.basePrice = 10;
            case 'D' -> this.basePrice = 45;
            default -> this.basePrice = 0;
        }
        if (this.basePrice == 0 || this.topping == 0) {
            System.out.println("Invalid input, we accept only R, L, S, and D and topping range 1-3");
        }
        else if(this.type == 'D'){
            System.out.println("no additional cost for toppings..");
        }
        else {
            this.basePrice += this.topping * 2;
        }
    }

    public void addAdditionalToppings(int topping){
        if (topping <1 && topping>3) System.out.println("Invalid topping value");
        else this.topping = Math.max(this.topping+topping, 3);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getTopping() {
        return topping;
    }
}
