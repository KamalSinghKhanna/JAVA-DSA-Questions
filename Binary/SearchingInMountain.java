package Binary;


public class SearchingInMountain {
 
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,3,1,0};
        int target = 0;
        System.out.println(ans(arr, target));
     }

    static int ans(int[] arr, int target){
        int peak = peak(arr);
        int ans = search(arr, target, 0, peak);
        if (ans == -1) {
            return search(arr, target, peak+1, arr.length-1);
        }
        return ans;
    }

static int peak(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while (start<= end) {
        int mid = start + (end - start)/2;
        if(arr[mid] > arr[mid+1]){
            end = mid -1;
        }
        else if(arr[mid] < arr[mid+1]){
            start = mid+1;
        }
    }
    return start;
}

static int search(int[] arr, int target, int start, int end){
    boolean isAsc = arr[start]< arr[end];
    while(start<= end) {
        int mid = start + (end - start )/2;
        if(arr[mid] == target) {
            return mid;
        }
       
        if(isAsc){
            if(target < arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            } //123454321
        } else{
            if (target < arr[mid]) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
    }
    return -1;
}

}