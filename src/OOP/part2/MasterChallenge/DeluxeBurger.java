package OOP.part2.MasterChallenge;

public class DeluxeBurger extends Burger{


    public DeluxeBurger(int topping, char typeOfDrink, char sizeOfDrink) {
        super('D', topping);
        Drink drink = new Drink(typeOfDrink, sizeOfDrink);
        SideItem sideItem = new SideItem('f');
    }
}
