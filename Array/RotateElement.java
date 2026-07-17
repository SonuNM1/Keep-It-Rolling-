package Array;

public class RotateElement {
    public static void main(String[] args) {
        
        // rotate each element of an array by one position in right side 

        int[] arr = {10, 20, 30, 40, 50} ; 
        
        int temp = arr[arr.length-1] ; // 50 

        for(int i=arr.length-1 ; i > 0 ; i --){
            arr[i] = arr[i-1] ; 
        }
        arr[0] = temp ; 
        
        System.out.println("result");

        for(int element: arr){
            System.out.print(element + " ");
        }
    }    
}
