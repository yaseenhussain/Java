package OOP.part2;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

//    public Printer(int pagesPrinted) {
//        this(10, pagesPrinted, true);
//    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel<0 || tonerLevel > 100) ? -1: tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tmp = tonerAmount + tonerLevel;
        if (tmp < 0 || tmp >100) return -1;
        tonerLevel += tmp;
        return tonerLevel;
    }

    public int printPages(int pages){
        if (duplex) System.out.println("Printing in duplex mode");
        pagesPrinted += (duplex) ? pages/2 + pages %2 : pages;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
