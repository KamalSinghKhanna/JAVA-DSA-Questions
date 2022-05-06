package Binary;
// smallest letter greater than target

public class SmallestLetter {
   public static void main(String[] args) {
       char [] arr = {'c','f','j'};
       char target = 'f';

       System.out.println(SmallestLetterInArray(arr, target));
   } 

   static char SmallestLetterInArray(char[] arr, char target) {
    int start = 0;
    int end = arr.length -1;
    while(start<= end) {
        int mid = start + (end - start )/2;
    
        if(target < arr[mid]) {
            end= mid-1;
        }
        else {
            start= mid+1; 
        }
    }




    return arr[start % arr.length];
   }
}
