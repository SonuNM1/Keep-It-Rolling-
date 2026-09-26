public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2} ; 
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) 
            return 0 ; 

        // sorting the array using bubble sort 

        for(int i=0 ; i < nums.length ; i++) {
            for(int j=0 ; j < nums.length-1-i ; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j] ; 
                    nums[j] = nums[j+1] ; 
                    nums[j+1] = temp ; 
                }
            }
        }

        int count = 1 ; 
        int maxLength = 1 ; 

        // finding the longest consecutive subsequence 

        for(int i=1 ; i < nums.length ; i++) {
            if(nums[i] == nums[i-1]+1) {
                count++ ; 
            } else if (nums[i] == nums[i-1]) {
                continue ; 
            } else {
                count = 1 ; 
            }

            // keeping track of longest sequence 

            maxLength = Math.max(count, maxLength) ; 
        }
        return maxLength ; 
    }
}
