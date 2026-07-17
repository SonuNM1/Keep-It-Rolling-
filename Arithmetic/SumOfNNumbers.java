import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
     
     // sum of N natural numbers without using loops 

     Scanner sc = new Scanner(System.in) ; 
     System.out.println("Enter the number of terms: ");
     int n = sc.nextInt() ; 

     double sum = (double)(n*(n+1))/2 ; 

     System.out.println("Sum till " + n + " terms is: " + sum);

    }
}
