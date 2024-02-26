import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {


        // getBucketCount
        System.out.println(getBucketCount(-3.4, 2.1,1.5,2));
        System.out.println(getBucketCount(3.4, 2.1,1.5,2));
        System.out.println(getBucketCount(2.75, 3.25,2.5,1));
        System.out.println(getBucketCount(-3.4, 2.1,1.5));
        System.out.println(getBucketCount(3.4, 2.1,1.5));
        System.out.println(getBucketCount(7.25, 4.3,2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

        // inputThenPrintSumAndAverage
//        inputThenPrintSumAndAverage();

        // min max challenge
//        minMaxChallenge();

        //sum challenge
//        System.out.println("Sum is = " + scannersumchallenge());

//        int currentyear = 2024;
//        try {
//            System.out.println(getInputFromConsole(currentyear));
//        }catch (NullPointerException e) {
//            System.out.println("Exception is = " + e);
//            System.out.println(getInputFromScanner(currentyear));
//        }
    }

    public static String getInputFromConsole(int currentyear){
        String name = System.console().readLine("What's your name?");
        System.out.println("Hi, " + name);
        int yob = Integer.parseInt(System.console().readLine("What's your year of birth?"));
        return "You're age is " + (currentyear - yob) + " old";

    }

    public static String getInputFromScanner(int currentyear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name");
        String name = scanner.nextLine(); // nextline doesn't accept any input, so use print to prompt texts
        System.out.println("Hi, " + name );
        System.out.println("What's your year of birth?");
        int yob = -1;
        int num_of_tries = 3;
        do {
            try {
                yob = checkData(currentyear, scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Only numericals are accepted");
            }
            num_of_tries-=1;
            if (yob == -1) System.out.println("You have entered wrong year, enter right year i.e >=" + (currentyear-125) + " and <= " + currentyear);
            if (num_of_tries ==0) System.out.println("You are run out of tries ");
        }while (yob == -1 && num_of_tries !=0);
        return "Age is " + (currentyear - yob) + " old";
    }

    public static int checkData(int currentyear, String yob){
        int yeob = Integer.parseInt(yob);
        if  (yeob > currentyear || yeob < currentyear -125) return -1;
        return yeob;

    };

    public static int scannersumchallenge(){
        int num = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (num <=5){
            System.out.println("Enter the number #" + num +": ");
            try {
                sum+= Integer.parseInt(scanner.nextLine()); // to accept float or double use Double.parseDouble(scanner.nextLine());
                num++;
            }catch (NumberFormatException e){
                System.out.println("Only Integers are accepted. Please enter a valid integer number");
            }

        }
        return sum;
    }

    public static void minMaxChallenge(){
        Scanner scanner = new Scanner(System.in);
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double num = 0;
        while(true){
            System.out.println("Enter the number or character to quit");
            try {
                num = Double.parseDouble(scanner.nextLine());
                min = Math.min(num, min);
                max = Math.max(num, max);
                System.out.println("Minimum number = " + min + " Maximum number = " + max);
            } catch (NumberFormatException e){
                System.out.println("You have enter a character, quitting the program");
                break;
            }

        }

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num = 0;
        long avg = 0;
        double count = 0.0;
        while (true){
            try{
                num = Integer.parseInt(scanner.nextLine());
                sum+=num;
                count++;
            }catch (NumberFormatException e){
                if (count > 0) avg = Math.round(sum/count);
                System.out.println("SUM = "+ sum + " AVG = " + avg);
                break;
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <=0 || height <=0 || areaPerBucket <=0 || extraBuckets < 0) return -1;
        double area = width * height;
        double buckets = Math.ceil(area/areaPerBucket);
        return Math.max((int) buckets -extraBuckets, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }

}
