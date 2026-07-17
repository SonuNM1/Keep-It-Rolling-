public class SumDigits {
    public static void main(String[] args) {
        
        // sum of 3 digit number without using loops 

        int n = 123 ; 
        int sum = 0 ; 

        sum = (n/100) + (n/10)%10 + n%10 ; 

        System.out.println("Sum: " + sum);

    }
}
