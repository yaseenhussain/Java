package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExerciese {

    Scanner scanner = new Scanner(System.in);

//    String arr = scanner.next();

    public int[] getIntegers(int size){
        int[] arr = new int[size];
        int i = 0;
        while (size > 0){
            System.out.println("Please enter the int number");
            String tmp = scanner.nextLine();
            arr[i] = Integer.parseInt(tmp);
            size--;
            i++;
            System.out.printf("You have entered number %s and you can enter %d more numbers to arr", tmp, size);
        }
        return arr;

    }

    public void printArray(int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.printf("Element %d contents %d \n", i, arr[i]);
        }
//        for (int e: arr){
//            System.out.println();
//        }

    }

    public int[] sortIntegers(int[] arr){
        int key, j;
        for (int i=1; i<arr.length; i++){
            key = arr[i];
            j = i-1;
            while (j>=0 && key > arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public int[] readIntegeres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number with , as delimiter");
        String[] numbers = scanner.nextLine().split(",");
//        System.out.println(numbers.toString());
        int[] arr = new int[numbers.length];
        for(int i=0; i< arr.length;i++){
            arr[i] = Integer.parseInt(numbers[i].trim());
        }
        return arr;
    }

    public int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if (e < min) min = e;
        }
        return min;
    }

    public int readInteger(){
        System.out.println("Enter the number of elements user needs to enter.");
        int num = scanner.nextInt();
        return num;
    }

    public int[] readElements(int cnt){
        cnt = Math.max(cnt, 0);
        int[] arr = new int[cnt];
        int i = 0;
        while (cnt >0){
            System.out.printf("Enter the number, you are allowed to enter %d more numbers", cnt);
            arr[i] = scanner.nextInt();
            cnt--;
            i++;
        }
        return arr;
    }

    public static void reverse(int[] arr){
        int l= 0, r=arr.length-1, tmp;
        System.out.println("Array = " + Arrays.toString(arr));
        while (l < r){
            tmp = arr[r];
            arr[r] = arr[l];
            arr[l] = tmp;
            l++;
            r--;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));

    }
}
