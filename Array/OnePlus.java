package Array;
//https://leetcode.com/problems/plus-one/
import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
       int[] digits = {1,2,3};
       System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        
        }
        int[] newArr = new int[n+1];
        newArr[0]=1;
        return newArr;
    }
}
