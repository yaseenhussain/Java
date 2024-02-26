package OOP.part2;

public class Refrigerator {
    private  boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (this.hasWorkToDo) {
            System.out.println("Food is being ordered, wait for sometime.");
            hasWorkToDo = false;
        }

    }
}
