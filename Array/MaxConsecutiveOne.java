;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        
        // max consecutive 1s in any array 

        int[] arr = {6, 1, 1, 1, 1, 7, 7, 1, 7, 1, 1} ; 
        int count = 0, maxCount = 0; 

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                count++ ; 
                if(count > maxCount){
                    maxCount = count ; 
                }
            } else {
                count = 0 ; 
            }
        }

        System.out.println("most consecutive one: " + maxCount);

    }
}
