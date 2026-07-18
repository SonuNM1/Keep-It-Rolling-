;

public class MissingNumber {
    public static void main(String[] args) {
        
        // Given an array containing n distinct numbers from the range 0 to n, find the missing number 

        int[] arr = {7, 4, 3, 0, 5, 1, 6} ;
        int n = arr.length ; 

        int expectedSum = ((int)n*(n+1))/2 ; 
        int totalSum = 0 ;

        for(int element: arr){
            totalSum += element ; 
        }

        System.out.println("Missing no: " + (expectedSum - totalSum));

    }
}
