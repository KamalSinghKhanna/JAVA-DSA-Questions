package Linear;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 22, 6, 7896};
        System.out.println(findNumbers(nums)); 
        System.out.println(digits2(42345567));
        
    }

    static int findNumbers(int[] nums){
        int counter = 0;
            for(int num:nums) {
                if (even(num)) {
                    counter++;
                }
            }
        
        return counter;
    }

    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        // if(numberOfDigits % 2 == 0){
        //     return true;
        // }
        // return false;
        return numberOfDigits % 2 == 0;
    }


    static int digits(int num) {

        if(num<0) {
            num = num*-1;
        }
        int count = 0;

        while(num>0){
            count++;
            num = num /10;
        }

        return count;

    }

    static int digits2(int num) {
        return  (int)(Math.log10(num)) +1;
    }
}
