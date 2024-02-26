package OOP.part2.MasterChallenge;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
         this.burger = new Burger('R', (byte) 1);
         this.drink = new Drink('S', 'L');
        this.sideItem = new SideItem('F');
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void printMeal(){
        System.out.printf("Price of the burger is = %f \n extra toppings = %d \n Price of the drink = %f \n Price of the side drink =%f \n Total = %f \n",
                burger.getBasePrice(), burger.getTopping(), drink.getPrice(), sideItem.getPrice(),
                burger.getBasePrice()+burger.getTopping()+drink.getPrice()+ sideItem.getPrice() );
    }

}
