public class WhileLoopChallenge {
    public static void main(String[] args) {

        // words to num
        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

        //Perfect number
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));


        //Print Factors
//        printFactors(6);
//        printFactors(32);
//        printFactors(-1);
//        printFactors(0);

        //last digit checker
//        System.out.println(hasSameLastDigit(41,22,71));
//        System.out.println(hasSameLastDigit(23,32,42));
//        System.out.println(hasSameLastDigit(0,0,0));
//        System.out.println(hasSameLastDigit(9,99,999));

        //has share digits
//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));

        //Sum of even digits
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(2));
//        System.out.println(getEvenDigitSum(-22));
//        System.out.println(getEvenDigitSum(1133557799));

        //sumFirstAndLastDigit
//        System.out.println(sumFirstAndLastDigit(-1221));
//        System.out.println(sumFirstAndLastDigit(1221));
//        System.out.println(sumFirstAndLastDigit(122));

        // palindrome
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(1221));
//        System.out.println(isPalindrome(122));

        //Sum Digits
//        System.out.println(sumDigits(1234));
//        System.out.println(sumDigits(-125));
//        System.out.println(sumDigits(4));
//        System.out.println(sumDigits(32123));

        // isEvenNumber
//        System.out.println(isEvenNumber(2));
//        System.out.println(isEvenNumber(3));
//        System.out.println(isEvenNumber(0));
//        System.out.println(isEvenNumber(-1));
//        System.out.println(isEvenNumber(-2));
//        int start_num = 4;
//        int end_num = 20;
//        int even_count = 0;
//        int odd_count = 0;
//        while (start_num <=end_num){
//            start_num++;
//            if (isEvenNumber(start_num)) {
//                even_count++;
//                System.out.println("Even number : " + start_num);
//                continue;
//            }
//            if (even_count == 5)  {
//                System.out.println("Five even numbers are found, quitting the loop");
//                break;
//            }
//            odd_count++;
//
//
//        }
//        System.out.println("Total num of even " + even_count + " and total num of odd numbers " + odd_count);
    }

    public static boolean isEvenNumber(int val){
        return val % 2 == 0;
    }

    public static int sumDigits(int val){
        if (val < 0) return -1;
        int sum  = 0;
        while (val > 0){
            sum += val %10;
            val /=10;
        }
        return sum;
    }

    public static boolean isPalindrome (int val) {
        int reverse = 0;
        int temp = val;
        while (Math.abs(temp) > 0) {
            reverse = reverse * 10 + temp % 10;
            temp/=10;
        }
        return reverse == val;
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;
        int last = number %10;
        while (number > 9) {
            number/=10;
        }
        return number + last;
    }

    public static int getEvenDigitSum(int number) {
//        if (number < 0) return -1;
        int even_sum = 0;
        int t = 0;
        while (number > 0){
            t = number % 10;
            if (t % 2 == 0) {
                even_sum += t;
            }
            number/=10;
        }
        return number<0? -1: even_sum;
    }

    public static boolean hasSharedDigit(int val1, int val2){
        int val1_f = val1%10, val1_s= (val1/10) % 10 , val2_f = val2%10, val2_s= (val2/10) % 10 ;
        return val1 >= 10 && val2 >= 10 && val1 <= 99 && val2 <= 99 && ((val1_f == val2_f) || (val1_f == val2_s) || (val1_s == val2_f) || (val1_s == val2_s));
//        if (val1>=10 && val2>=10 && val1<=99 && val2<=99) {
//            int val1_f = val1%10, val1_s= (val1/10) % 10 , t = 0;
//            while (val2 > 0){
//                t = val2 % 10;
//                if (t == val1_f || t == val1_s) return true;
//                val2/=10;
//            }
//        }
//        return false;
    }

    public static boolean hasSameLastDigit(int v1, int v2, int v3) {
        return  isValid(v1) && isValid(v2) && isValid(v3) && (v1%10 == v2%10 || v1%10 == v3%10 || v2%10 == v3%10);
    }

    public static boolean isValid(int v){
        return v>=10  && v<=1000 ;
    }

    public static void printFactors(int number){
//        System.out.println(number<1? "Invalid value");
        if (number<1) System.out.println("Invalid value");
        for (int i=1; i<=number; i++){
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first <10 && second < 10) return -1;
        for (int i=0; i<=Math.min(first, second) ; i++) {
            if (first % i ==0 && second%i ==0) return i;
        }
        return -1;
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i<number; i++){
            if (number%i == 0){
                sum+=i;
            }
        }
        return sum == number;
    }

    public static int reversenum(int number){
        int reverse = 0;
        while (Math.abs(number) > 0) {
            reverse = reverse * 10 + number % 10;
            number/=10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;
        int cnt = 0;
        do {
            cnt++;
            number/=10;
        } while (number > 0);
        return cnt;
    }

    public static void numberToWords(int number){
        if (number < 0) System.out.println("Invalid Value");;
        int rev = reversenum(number);
        int countOfDigits = getDigitCount(number);
        int Digit = 0;
        while (countOfDigits > 0){
            Digit = rev %10;
            switch (Digit) {
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;

            }
//            switch (Digit) {
//
//                case 0 -> System.out.println("Zero");
//                case 1 -> System.out.println("One");
//                case 2 -> System.out.println("Two");
//                case 3 -> System.out.println("Three");
//                case 4 -> System.out.println("Four");
//                case 5 -> System.out.println("Five");
//                case 6 -> System.out.println("Six");
//                case 7 -> System.out.println("Seven");
//                case 8 -> System.out.println("Eight");
//                case 9 -> System.out.println("Nine");
//            }
            rev/=10;
            countOfDigits--;

        }

    }


    public static boolean canPack(int bigCount,int smallCount, int goal){
        return bigCount >= 0 && smallCount >= 0 && goal >= 0 && (bigCount * 5 + smallCount == goal ? true : false);
    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                number /= i; // set number as the "matching pair"
                i--; // negate the i++ increment
            }
        }
        return number; // return prime number
    }

    public static void printSquareStar(int number){
        if (number < 5) System.out.println("Invalid Value");
    }
}
