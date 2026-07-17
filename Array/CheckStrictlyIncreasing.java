package Array;

public class CheckStrictlyIncreasing {

    public static Boolean isStrictlyIncreasing(int[] arr){

        // check if an array is strictly increasing 

        boolean result = true ; 

        for(int i= 0 ; i < arr.length ; i++){
            if(arr[i] >= arr[i+1]){
                result = false ; 
            }
        }

        return result ; 
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 9} ; 
        System.out.println(isStrictlyIncreasing(arr));
    }
}


// the definition of a strictly increasing pair is: arr[i] < arr[i+1] . we dont need to compare every element with every other element 