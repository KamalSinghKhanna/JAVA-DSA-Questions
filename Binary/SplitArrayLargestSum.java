package Binary;
//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m){
        // int start = 0;
        // int end = 0;
        int start = largetsInArray(nums);
        int end = maxSum(nums);
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //int the end of the loop this will contain thhe max sum of array
            end += nums[i];
        }

        //binary search
        while (start< end) {
            //try for the middle as potential ans
            int mid = start + (end-start)/2;

            // claculate the pieces you can devide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum+num>mid) {
                    //you can not add ths in subarry create new one
                    sum=num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces>m) {
                start = mid+1;
            } else{
                end = mid;
            }
        }
        return end;
       


    }

 //minimum value of array sum would be tha largest number in array;
    static int largetsInArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

//maximum value of array would be the sum of whole array
    static int maxSum(int[] nums) {
        int sum = 0;
       for (int i = 0; i < nums.length; i++) {
           sum += nums[i];
       }
       return sum;
    }
}
