package Array;

public class ProductDivisionArray {
    public static void main(String[] args) {
        
        // WAP to create a resultant array where each element is equal to the product of all elements of the original array divided by the corresponding element

        int[] arr = {2, 4, 5, 3, 6} ; 
        int[] result = new int[arr.length] ; 
        int product = 1 ; 

        for(int i=0 ; i < arr.length ; i++){
            product *= arr[i] ; 
        }

        for(int i = 0 ; i < arr.length ; i++){
            result[i] = product/arr[i] ; 
        }

        System.out.println("Resultant array: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }
    
}
