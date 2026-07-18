;

public class ReverseFirstSecondArray {
    public static void main(String[] args) {
        
        // reverse the first and second half separately - handle both odd and even no of terms 

        int[] arr = {10, 20, 30, 40, 50, 60} ; 
        int length = arr.length ; 
        int mid = length/2 ; 

        int start = 0 ; 
        int end = mid-1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        if(length % 2 == 0){
            start = mid ; 
        } else {
            start = mid+1 ; 
        }

        end = length - 1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        System.out.println("Result");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}
