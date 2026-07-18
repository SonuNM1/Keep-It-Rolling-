package Array;

public class SameElements {
    public static void main(String[] args) {

        // all the elements in two array same - true otherwise false 

        int[] arr = {1,2,3,4} ;
        int[] arr2 = {1, 1, 3, 4} ; 

        boolean result = true ; 

        if(arr.length != arr2.length){
            System.out.println("Not equal");
            result = false ; 
            return ; 
        }

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != arr2[i]){
                result = false ; 
                break ; 
            }
        }

        System.out.println("Are two array equal? " + result);

    }
}
