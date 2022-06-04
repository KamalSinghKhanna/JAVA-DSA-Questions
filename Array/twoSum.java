// package Array;

// import java.util.Arrays;
// import java.util.HashMap;

// public class twoSum {
//     public static void main(String[] args) {
//         int[] arr = {7,3,5};
//         int target = 8;
//         System.out.println(Arrays.toString(twoSum(arr, target)));
//     }
//     static int[] twoSum(int[] numbers, int target) {
//         HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
//         for(int i = 0; i < numbers.length; i++){
//             Integer requiredNum = (Integer)(target - numbers[i]);
//             if(indexMap.containsKey(requiredNum)){
//                 int toReturn[] = {indexMap.get(requiredNum), i};
//                 return toReturn;
//             }

//             indexMap.put(numbers[i], i);
//         }
//         return null;
//     }
// }


