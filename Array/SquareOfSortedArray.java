package Array;
import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l= 0; int r = n-1;
        while (l<=r) {
            if (nums[l]*nums[l]>nums[r]*nums[r]) {
               res[l] = nums[l]*nums[l];
                l++;
            } else{
                res[l] = nums[r]*nums[r];
                r--;
            }
        }

        return reverse(res, n);
      
    }
    static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
}
}
