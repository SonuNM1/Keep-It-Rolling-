import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {
        
        // remove last digit of the number 

        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the number: ");
        int num = sc.nextInt() ; 

        System.out.println("Original number: " + num);

        num = num / 10 ; 

        System.out.println("Number after removing the last digit: " + num);
    }
}
