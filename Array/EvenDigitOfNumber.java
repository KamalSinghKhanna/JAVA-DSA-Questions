// package Array;

public class EvenDigitOfNumber {
    public static void main(String[] args) {
        int nums[] = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length;i++){
            int number = even(nums[i]);
            if(number%2 == 0){
                count++;
            }
        }
        return count;
    }
    
    static int even(int num){
        int ans = 0;
        while(num>0) {
            ans++;
            num /=10;
        }
        return ans;
    
        
    }
}
