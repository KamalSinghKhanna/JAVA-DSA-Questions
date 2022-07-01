// package Array;
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0; 
        int right = n-1;
        int pointer= n-1;
        int[] res = new int [n];
        while(left <= right) {
            if(Math.abs(nums[right])<Math.abs(nums[left])){
                res[pointer] = nums[left]*nums[left];
                left++;
            } else{
                res[pointer] = nums[right]*nums[right];
                right--;
            }
            pointer--;
        }
               return res;
    }
   
}
