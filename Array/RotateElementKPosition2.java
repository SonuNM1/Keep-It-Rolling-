package Array;

public class RotateElementKPosition2 {
    public static void main(String[] args) {
        
        // rotate element by k position 

        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 2 ; 

        int start = 0 ; 
        int end = arr.length-1 ; 

        // reversing the whole array

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        k = k % arr.length ; // value more than arr.length makes full rotation back to original (if k = 6, the array will become like original, so k=7 is like k=1 rotation)

        // reversing till k positions 

        start = 0 ; 
        end = k-1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        start = k ; 
        end = arr.length - 1 ;

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}


// optimized approach - 1. Reverse the array 2. Reverse till k positions 3. Reverse remaining elements 