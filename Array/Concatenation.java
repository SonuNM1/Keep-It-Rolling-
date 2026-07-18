

public class Concatenation {
    public static void main(String[] args) {
        
        // Concatenation of array - Array 1: [10,20] Array 2: [30,40,50] Result: [10,20,30,40,50]

        int[] arr1= {10, 20}, arr2 = {30, 40, 50} ; 

        int[] result = new int[arr1.length + arr2.length] ; 

        for(int i= 0 ; i < arr1.length ; i++){
            result[i] = arr1[i] ; 
        }

        for(int i = 0 ; i < arr2.length ; i++){
            result[arr1.length + i] = arr2[i] ; 
        }

        System.out.println("Concatenated array: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}
