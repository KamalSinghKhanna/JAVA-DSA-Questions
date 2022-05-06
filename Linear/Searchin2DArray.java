// //Q4

// package Linear;

// import java.util.Arrays;

// public class Searchin2DArray {
//     public static void main(String[] args) {
//         int[][] arr = {
//             {12, 34, 7},
//             {23, 2, -3, 12},
//             {246, 3, -12, 0, 9}
//         };
//         int target = -3;
//         int[] ans = search(arr, target);
//         // System.out.println(Arrays.toString(ans));
//         System.out.println(searchMin(arr));
//     }
//     static int[] search(int[][] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//         }   
//         return new int[] {-1, -1};


//     }


//     static int searchMin(int[][] arr) {
//         // if (arr.length==0) {
//         //     return -1;
//         // }
//         // int min = arr[0][0];
//             int min = Integer.MAX_VALUE;
//         for (int[] element : arr) {
//            for (int element2 : element) {
//                if(element2 < min) {
//                    min = element2;
//                }
//            }
//         }
//         return min;
//     }
// }
