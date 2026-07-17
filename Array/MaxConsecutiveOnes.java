package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
        // Given a binary array (an array containing only 0s and 1s), find the maximum number of consecutive 1s.

        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1, 1} ; 
        int count = 0, maxCount = 0 ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                count++ ; 
                if(count > maxCount){
                    maxCount = count ; 
                }
            }else{
                count = 0 ; 
            }
        }

        System.out.println("Max consecutive 1s: " + maxCount);

    }
}
