;

public class Oleft1Right {
    public static void main(String[] args) {
        
        // move all 0s to the left and 1s to the right 

        int[] arr = {0, 1, 1, 0, 0} ; 

        int j=0 ; 
        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != 1){
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
