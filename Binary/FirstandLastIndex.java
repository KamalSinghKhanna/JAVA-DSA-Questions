package Binary;

import java.util.Arrays;

public class FirstandLastIndex {
   public static void main(String[] args) {
       int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
       int target = 7;
       System.out.println(Arrays.toString(firstAndLastIndex(arr, target)));
   } 

   static int[] firstAndLastIndex(int[] arr, int target){

    int[] ans = {-1, -1};

    //chec for first occurence
    int start = search(arr, target, true);
    int end = search(arr, target, false);
    

    ans[0] =  start;
    ans[1] = end;
   
       
    




    return ans;
}

//this function just returns the index value of target
    static int search(int[] arr, int target, boolean findStartIndex) {
     int ans = -1;

    //chec for first occurence
    int start = 0;
    int end = arr.length -1;
    while(start<= end) {
        int mid = start + (end - start )/2;
        if(arr[mid] == target) {
            //potential ans found
            ans = mid;
            if(findStartIndex){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        else if(arr[mid] < target) {
            start= mid+1;
        }
        else if(arr[mid] > target){
            end= mid-1; 
        }
    }




    return ans;
    }
}
