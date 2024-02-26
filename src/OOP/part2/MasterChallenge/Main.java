package OOP.part2.MasterChallenge;

public class Main {

    Burger burger = new Burger('l', 2);
    Drink drink = new Drink('s', 'R');
    SideItem sideItem = new SideItem('c');

    MealOrder order1 = new MealOrder();
    MealOrder order2 = new MealOrder(burger, drink, sideItem);

    DeluxeBurger order3 = new DeluxeBurger(5, 's','L');


}
