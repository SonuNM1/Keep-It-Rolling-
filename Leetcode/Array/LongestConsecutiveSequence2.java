public class LongestConsecutiveSequence2 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2} ; 
        
        System.out.println("Longest consecutive sequence: " + longestSequence(nums));
    }
    public static int longestSequence(int[] nums) {
        int maxLength = 1 ;  

        for(int i=0 ; i < nums.length ; i++) {
            int length = 1; 

            int next = nums[i] + 1 ; // next element 

            while(linearSearch(nums, next)){
                length++ ; 
                next++ ; 
            }

            // updating longest sequence 

            maxLength = Math.max(length, maxLength) ;
        }

        return maxLength ; 
    }
    public static boolean linearSearch(int[] nums, int target) {
        for(int num: nums) {
            if(num == target){
                return true ; 
            }
        }
        return false ; 
    }
}
