package OOP.part2.MasterChallenge;

public class Restaurant {

    private String name;
    private String desc;

    public Restaurant(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
}

class Hamburger extends Restaurant {

    private String typeOfBurgers;
    private String extras;
    private double price;

    private String drinks;

    public Hamburger() {
        super("Hamburger Restaurant", "We sell Hamburger meals! :)");
        this.typeOfBurgers = "Regular";
        this.extras = "fires";
        this.drinks = "Coke";
        this.price = 4.99;

    }

    public Hamburger( String typeOfBurgers, String extras, String drinks) {
        this();
        this.typeOfBurgers = typeOfBurgers;
        this.extras = extras;
        this.drinks = drinks;
//        this.price = price;

    }
}
