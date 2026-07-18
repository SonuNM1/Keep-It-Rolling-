;

// print and count all the palindrome number in the array 

public class PrintCountPalindrome {

    public static boolean isPalindrome(int num){
        int reverse = 0 ;
        int originalNum = num ; 
        
        while(num > 0){
            reverse = reverse*10 + num % 10 ; 
            num = num/10 ; 
        }

        if(originalNum == reverse){
            return true ; 
        } else {
            return false ; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {121, 7, 44, 11, 48} ; 
        int count = 0 ; 

        System.out.println("Palindrome numbers: ");

        for(int i=0 ; i < arr.length ; i++){
            if(isPalindrome(arr[i])){
                System.out.print(arr[i] + " ");
                count++ ; 
            }
        }

        System.out.println();
        System.out.println("Total palindrome number: " + count);
    }
}
