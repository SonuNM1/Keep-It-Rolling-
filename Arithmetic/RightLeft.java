public class RightLeft {
    public static void main(String[] args) {
        
        // print each digit of the number one by one from Right to Left 

        int n = 5783 ; 
        int lastDigit = 0 ; 

        while(n > 0){
            lastDigit = n % 10 ; 

            System.out.print(lastDigit + " ");

            n = n / 10 ;
        }

    }
}
