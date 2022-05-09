package Binary;

public class RotationCountInRotated {
    public static void main (String[] args){
        int arr[]  = {5,1, 2, 3, 4};
        int n = 5;
        System.out.println(findPivot(arr, n));
    }

    static int findPivot(int[] arr, int n){
        int start = 0;
        int end = n-1;
        int ans = 0;
        while(start<=end) {
            int mid = start + (end -start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                ans = mid+1;
            } 
            if(mid > start && arr[mid] < arr[mid-1]) {
                ans = mid;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        if(ans == n) {
            return ans%n;
        } else {
            return ans;
        }
        
        // int start = 0;
        // int end = arr.length-1;
        // while (start<=end) {
        //     int mid = start + (end -start) /2;
        //     if(mid<end && arr[mid] > arr[mid+1]){
        //         return mid;
        //     }
        //     if(arr[mid]<arr[mid-1]){
        //         return mid-1;
        //     }
        //     if(arr[mid] <= arr[start]){
        //         end = mid-1;
        //     }
        //     else {
        //         start = mid+1;
        //     }
        // }
        // return -1;

    }

}