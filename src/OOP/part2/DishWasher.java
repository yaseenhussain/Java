package OOP.part2;

public class DishWasher {
    private  boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (this.hasWorkToDo) {
            System.out.println("Dishes are getting done, wait for sometime.");
            hasWorkToDo = false;
        }

    }
}
