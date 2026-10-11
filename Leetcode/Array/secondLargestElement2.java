public class secondLargestElement2 {
    public static void main(String[] args) {
        
    }
    public static int secondLargest(int[] nums) {

        int largest = Integer.MIN_VALUE ; 
        int secondLargest = Integer.MIN_VALUE ; 

        for(int num: nums) {
            if(num > largest) {
                secondLargest = largest ; 
                largest = num ; 
            } else if ((num < largest) && (num > secondLargest)) {
                secondLargest = num ; 
            }
        }

        if(secondLargest == Integer.MIN_VALUE) return -1 ; 

        return secondLargest ; 
    }
}
