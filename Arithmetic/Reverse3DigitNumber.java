public class Reverse3DigitNumber {
    public static void main(String[] args) {
        
        // reverse 3 digit number using pure arithmetic operation 

        int n = 123 ; 
        int original = n, reverse = 0 ; 

        while(n > 0){   // 1
            reverse = (reverse * 10) + (n % 10) ; // 320 + 1 
            n = n / 10 ;  // 0 
        }

        System.out.println("Original: " + original + " ,Reverse: " + reverse);

    }    
}
