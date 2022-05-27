// package BinaryIn2dArray;

// import java.util.Arrays;

// public class SearchInMatrix2 {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         int target = 16;
//         System.out.println(Arrays.toString(binarySearch(arr, target)));
        
//     }
//     static int[] binarySearch(int[][] arr, int target){
//         int rStart = 0;
//         int rEnd = arr[rStart].length-1;
//         int mid = rStart + (rEnd-rStart)/2;

//         int start = arr[rStart][mid];
//         int end = arr[arr.length][mid];
//         while(start<= end){
//             int midB = start+(end-start)/2;
//             if(arr[midB]==target){
//                 return new int[]{midB}
//             }
//         }

//         return new int[]{-1,-1};
//     }
   
    
// }

