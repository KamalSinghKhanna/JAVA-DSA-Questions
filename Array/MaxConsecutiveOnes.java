package Array;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        // int[] arr = {0};
        // System.out.println(arr.length);
        
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int count =0,max=0;
		for(int i =0; i< nums.length;i++){

			if(nums[i]==1){
				count++;
			}
			if(nums[i]==0 || i==nums.length-1){
				if(count>max){
					max=count;
				}
				count=0;
			}
		}
		return max;
    }
}
