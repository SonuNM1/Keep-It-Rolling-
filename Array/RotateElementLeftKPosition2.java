
import java.util.Scanner;

public class RotateElementLeftKPosition2 {
    public static void main(String[] args) {
        
        // rotate each element of the array left by k position 

        int[] arr = {1, 2, 3, 4, 5, 6} ; 

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of k"); 
        int k = sc.nextInt() ; // 3 

        if(k < 0 ){
            System.out.println("Enter the valid value of k. Negative rotation not considered.");
            return ; 
        }

        // If k is greater than the array length, a full rotation brings the array back to its original position, So only the remaining rotations matter.
        
        k = k % arr.length ; 

        int start = 0 ; 
        int end = k-1 ; 

        // reverse till first k 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ;
        }

        // reversing the remaining element 

        start = k ; 
        end = arr.length-1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        // reversing the whole array 

        start = 0 ; 
        end = arr.length-1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        System.out.println("Result after rotating k position towards left");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}

// optimized - 1. Reverse first till k position 2. reverse the remaining 3. reverse the whole array 

