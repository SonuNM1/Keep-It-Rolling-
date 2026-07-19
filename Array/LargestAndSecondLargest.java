// largest and second largest number in the array 

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        
        int[] arr = {25, 16, 38, 10, 35, 48, 20, 50} ; 

        int max1, max2 ; 

        if(arr[0] > arr[1]){
            max1 = arr[0] ; 
            max2 = arr[1] ; 
        } else {
            max1 = arr[1] ; 
            max2 = arr[0] ; 
        }

        for(int i=2 ; i < arr.length ; i++){
            if(arr[i] > max1){
                max2 = max1 ; 
                max1 = arr[i] ; 
            } else if(arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i] ;
            }
        }

        System.out.println("Largest: " + max1 + " \nSecond largest: " + max2);

    }
}
