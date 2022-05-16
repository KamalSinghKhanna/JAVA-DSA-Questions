package Binary;


public class SearchInRotatedArrayWithDuplicateValues{
    public static void main(String[] args) {
       int arr[]  = {4,5,6,7,0,1,2};
       int target = 4;
       System.out.println(search(arr, target));
    }

    static boolean search(int[] arr, int target) {
        int pivot = findPivotWithDuplicate(arr);
        //if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }
        //if pivot is found, you have found 2 asc sorted arrays
        if(arr[pivot]== target) {
            return true;
        } 
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        } else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while(start<= end) {
            int mid = start + (end - start )/2;
            if(arr[mid] == target) {
                return true;
            }
            else if(arr[mid] < target) {
                start= mid+1;
            }
            else if(arr[mid] > target){
                end= mid-1; 
            }
        }
        return false;
    }
    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end -start) /2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
           
            //if element at mid, start, end are equal then just skip the duplicates
            if (arr[mid]== arr[start] && arr[mid]==arr[end]) {

                // Note: what if these elements at start and end were the pivot??
                //check if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;


                //check weather end is pivot or not

                if (arr[end]< arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end]< arr[mid])){
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;

    }
}