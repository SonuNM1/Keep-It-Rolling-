 ; 

public class RotateElementLeft{
    public static void main(String[] args) {
        
        // rotate each element by one position towards left 

        int[] arr = {10, 20, 30, 40, 50, 60, 70} ; 

        int temp = arr[0] ;

        for(int i=0 ; i < arr.length-1 ; i++){
            arr[i] = arr[i+1] ; 
        }

        arr[arr.length-1] = temp ; 

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}