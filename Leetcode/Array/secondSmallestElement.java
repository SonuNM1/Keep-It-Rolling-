public class secondSmallestElement {
    public static void main(String[] args) {

    }
    public static int secondSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE ; 
        int secondSmallest = Integer.MAX_VALUE ; 

        for(int i=0 ; i < nums.length; i++) {
            if(nums[i] < smallest) {
                secondSmallest = smallest ; 
                smallest = nums[i] ; 
            } 
            else if(nums[i] > smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i] ; 
            }
        }

        if(secondSmallest == Integer.MAX_VALUE) return -1 ; 

        return secondSmallest ; 
    }
}
