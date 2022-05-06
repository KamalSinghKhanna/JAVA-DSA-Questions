//Q1. arr=[2,3,5,9,14,16,18] , target = 15
// ceiling = smallest number in the array greator or equal to then target element
//ceiling(arr, target =14) = 14
//ceiling(arr, target =15) = 16
//ceiling(arr, target =4) = 5


package Binary;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr, target));

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<= end) {
            int mid = start + (end - start )/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start= mid+1;
            }
            else if(arr[mid] > target){
                end= mid-1; 
            }
        }




        return start;
    }
}
