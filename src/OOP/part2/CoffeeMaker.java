package OOP.part2;

public class CoffeeMaker {
    private  boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (this.hasWorkToDo) {
            System.out.println("Coffee is brewing.");
            hasWorkToDo = false;
        }

    }
}
