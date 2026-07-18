public class PalindromeNumber {
    public static void main(String[] args) {
        
        int num = 121 ; 
        int originalNum = num, reverse = 0 ; 

        while(num > 0){
            reverse = reverse * 10 + num % 10 ; 
            num = num/10 ; 
        }

        if(originalNum == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
