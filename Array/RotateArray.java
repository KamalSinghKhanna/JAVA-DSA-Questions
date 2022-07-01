import java.util.Arrays;

// package Array;
// import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int d = 3;
        // int n = nums.length;
        System.out.println(Arrays.toString(rotate(nums, d)));
        
    }

    // static int[] rotate(int[] arr, int d, int n) {
    //     int temp[] = new int[d+1];
 
    //     // Copying first d element in array temp
    //     for (int i = 0; i <= d; i++)
    //         temp[i] = arr[i];
 
    //     // Moving the rest element to index
    //     // zero to N-d
    //     for (int i = d; i < n-1; i++) {
    //         arr[i - d] = arr[i+1];
    //     }
 
    //     // Copying the temp array element
    //     // in original array
    //     for (int i = 0; i <= d; i++) {
    //         arr[i + n-1 - d] = temp[i];
    //     }


    //     return arr;
    // }


    static int[] rotate(int[] nums, int k) {
        int res[] = new int[nums.length-1]; 
        int left = 0;
        int right = nums.length-1;
        while(left<right) {
            if(left<k){
                res[left]=nums[right];
                    right--;
            }
            else{
                // res[left] = nums[left];
                left++;
            }
        }
        return res;
    
    }
 
   
 
    }
    
