;

public class ArrayProduct {
    public static void main(String[] args) {
        
        // product of array except itself - brute force approach

        int[] arr = {1, 2, 3, 4} ; 
        int product = 1 ; 
        int[] result = new int[arr.length] ; 

        for(int i = 0 ; i < arr.length ; i++){
            product *= arr[i] ;   // 24 
        }

        for(int i=0 ; i < arr.length ; i++){
            result[i] = product/arr[i] ; 
        }

        System.out.println("Resultant product array without itself: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}
