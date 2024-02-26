package OOP.part2;

public class SmartKitchen {
    private Refrigerator iceBox; // private Refrigerator iceBox = new Refrigerator();
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster = new CoffeeMaker();

    public SmartKitchen() {
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
//        this.brewMaster = brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }



    public void addWater(){
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);

    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean iceFlag, boolean dishFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(iceFlag);
        dishWasher.setHasWorkToDo(dishFlag);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();

    }
}
