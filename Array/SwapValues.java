
import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        
        // WAP to swap the values present at 2 specified indices of a given array 

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter first index: ");
        int idx1 = sc.nextInt() ; 
        System.out.println("Enter second index: ");
        int idx2 = sc.nextInt() ; 

        // edge case - invalid indexes 

        if(idx1 < 0 || idx1 >= arr.length || idx2 < 0 || idx2 >= arr.length){
            System.out.println("Enter correct indices");
            return ; 
        }
        
        int temp = arr[idx1] ; 
        arr[idx1] = arr[idx2] ; 
        arr[idx2] = temp ; 

        System.out.println("Resultant swapped array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }
   
    }
}
