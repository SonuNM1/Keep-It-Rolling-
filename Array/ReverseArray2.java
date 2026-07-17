package Array;

public class ReverseArray2 {
    public static void main(String[] args) {
        
        // reverse array - without using any new temp array 

        int[] arr = {10, 20, 30, 40, 50, 60, 70} ; 
        int start = 0 ; 
        int end = arr.length-1 ; 

        while(start < end){
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 

            start++ ; 
            end-- ; 
        }

        System.out.println("Reversed array: ");

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}
