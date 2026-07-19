// second smallest element in the array 

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5, 4} ;

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE; 

        if(arr[0] < min1){
            min1 = arr[0] ; 
            min2 = arr[1] ; 
        } else {
            min1 = arr[1] ; 
            min2 = arr[0] ;
        }

        for(int i=2 ; i < arr.length ; i++){
            if(arr[i] < min1){
                min2 = min1 ; 
                min1 = arr[i] ; 
            } else if (arr[i] < min2 && arr[i] != min1){
                min2 = arr[i] ; 
            }
        }
    
        System.out.println("Smallest element: " + min1);
        System.out.println("Second smallest element: " + min2);
        
    }
}
