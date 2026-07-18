;

public class Sum1DArray {
    public static void main(String[] args) {
        
        // Running sum of 1D Array 

        int[] arr = {2, 1, 3, 4} ; 
        int[] result = new int[arr.length] ; 
        int sum = 0 ; 

        System.out.println("Original array: ");
        for(int el: arr){
            System.out.print(el + " ");
        }

        System.out.println();

        for(int i=0 ; i < arr.length ; i++){
            sum += arr[i] ; 
            result[i] = sum ; 
        }

        System.out.println("Running sum of the given 1D array: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }    
}
