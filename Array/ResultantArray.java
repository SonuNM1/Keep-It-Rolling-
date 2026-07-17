package Array;

public class ResultantArray {
    public static void main(String[] args) {
        
        // WAP to create a new array such that each element is equal to (20 - corresponding element of the original array).

        int[] arr = {2, 5, 4, 3, 6} ; 
        int[] result = new int[arr.length] ; 

        for(int i = 0; i < arr.length ; i++){
            result[i] = 20 - arr[i] ; 
        }

        System.out.println("Resultant: ");

        for(int num: result){
            System.out.print(num + " ");
        }

    }
}
