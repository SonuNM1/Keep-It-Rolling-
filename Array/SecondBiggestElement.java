// second biggest element of the array 

public class SecondBiggestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,3} ; 

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE ; 

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
            } else if (arr[i] > max2 && arr[i] != max1){
                max2 = arr[i] ; 
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second largest: " + max2);


    }
}
