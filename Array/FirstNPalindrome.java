// Store first N palindrome number in array 

public class FirstNPalindrome {

    public static boolean isPalindrome(int n){
        int originalNum = n ; 
        int reverse = 0 ; 

        while(n > 0){
            reverse = (reverse*10) + n % 10 ; 
            n = n / 10 ; 
        }
        
        boolean isPal; 

        if(reverse == originalNum){
            isPal = true ; 
        } else {
            isPal = false ; 
        }

        return isPal ; 
    }
    public static int[] palindromeArray(int n){

        int[] arr = new int[n] ; 

        int count = 0 ; 
        int number = 0 ; // or number = 11 if we want to skip the single digit number 

        while(count < n){
            if(isPalindrome(number)){
                arr[count] = number ; 
                count++ ; 
            }
            number++ ; 
        }
        return arr ; 
    }
    public static void main(String[] args) {
        int n = 20 ; 
        int[] result = palindromeArray(n) ; 

        for(int num: result){
            System.out.print(num + " ");
        }
    }
}
