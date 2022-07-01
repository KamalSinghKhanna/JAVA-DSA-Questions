// package Array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {0,4,1,0,0,8,0,0,3};
        System.out.println(Arrays.toString(duplicateZeros(arr)));

    }
    static int[] duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==0) {
            for(int j=n-2;j>=i;j--){
                arr[j+1]= arr[j];
            
            }
                arr[i+1] = 0;
                i= i+2;
            }
        }
        return arr;
    }
}
