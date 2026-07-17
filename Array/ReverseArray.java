package Array;

public class ReverseArray {
    public static void main(String[] args) {
        
        // reverse array 

        int[] arr = {10, 20, 30, 40, 50, 60, 70} ; 
        int[] result = new int[arr.length] ; 
        int j = 0 ; 

        for(int i=arr.length-1 ; i >= 0 ; i--){
            result[j] = arr[i] ;
            j++ ; 
        }

        System.out.println("Reverse array: ");

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}
