package Binary;

public class PositionInInfinte {
    public static void main(String[] args) {
        int[] arr = {1, 2,  3, 5, 6, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        
        System.out.println(findingAns(arr, target));

    }
    static int findingAns(int[] arr, int target) {
        //find the range
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            int newStart = end +1;
            // end = p end + sizeofbox *2
            end = end + (end - start +1) *2;
            start = newStart;
           
        }
        return search(arr, target, start, end);

    }
    static int search(int[] arr, int target, int start, int end){
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
        return -1;
    }
}
