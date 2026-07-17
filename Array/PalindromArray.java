package Array;

public class PalindromArray {
    public static void main(String[] args) {
        
        // WAP to check array is a palindromic array or not. Return true or false accordingly 

        int[] arr = {1, 2, 3, 2, 1} ; 
        
        int start = 0 ; 
        int end = arr.length - 1 ; 

        boolean isPalindrome = true ; 

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false ;  
                break ; 
            }
            start++ ; 
            end-- ; 
        }

        System.out.println(isPalindrome);

    }    
}
