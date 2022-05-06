package Linear;

public class linear{
    public static void main(String[] args) {
        int[] arr = {12, 24, 12, 45, 56, 3, 0};
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }   

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

//complexity linear time 
//best case - only one compairison o(1)
//worst case - n o(n)