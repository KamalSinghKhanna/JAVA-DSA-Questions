package Binary;

public class RotationCountInRotated {
    public static void main (String[] args){
        // int arr[]  = {28, 66, 72, 79, 86, 95, 104, 106, 110, 119, 123, 124, 129, 132, 136, 137, 142, 150, 2, 12, 14, 17, 26, 30, 36, 38, 46, 52 ,60};
        int[] arr = {2,8,1};
        int n = arr.length;
        System.out.println(countRotations(arr, n));
    }

    static int countRotations(int[] arr, int n){
        int pivot = findPivot(arr, n);
       
        return pivot+1;
    }
//use this for non duplicates
    static int findPivot(int[] arr, int n) {
        int start = 0;
        int end = n-1;
        while (start<=end) {
            int mid = start + (end -start) /2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;

    }

    }

