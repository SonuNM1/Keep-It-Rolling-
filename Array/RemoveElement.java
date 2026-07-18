
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        
        // remove an element from the certain position of the array 

        int[] arr = {10, 20, 30, 40, 50, 60, 70} ; 
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Give me the index to remove: ");
        int idx = sc.nextInt() ; 

        if(idx < 0 || idx > arr.length){
            System.out.println("Enter valid index position");
            return ; 
        }

        for(int i=idx ; i < arr.length-1 ; i++){
            arr[idx] = arr[idx+1] ; 
        }

        System.out.println("Resultant array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }
        

    }
}
