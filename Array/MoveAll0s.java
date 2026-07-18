package Array;

public class MoveAll0s {
    public static void main(String[] args) {
        
        // Move all zeroes of an array to the end 

        int[] arr = {7, 0, 2, 6, 0, 4} ;  

        int j = 0 ; 
        
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i] ; 
                arr[i] = arr[j] ; 
                arr[j] = temp ; 

                j++ ; 
            }
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}
