package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        
        // check whether a given array is in sorted array or not 

        int[] arr = {2, 7, 1, 8, 9} ; 
        boolean sorted = true ; 

        for(int i=0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                sorted = false ; 
                break ;
            }
        }

        System.out.println(sorted);
 
    }
}
