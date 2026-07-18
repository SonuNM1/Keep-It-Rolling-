import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int n){

        int first = 0 ; 
        int second = 1 ; 

        if(n >= 1){
            System.out.println(first + " ");
        }

        if(n >= 2){
            System.out.println(second + " ");
        }

        for(int i=3 ; i < n ; i++){
            int next = first + second ; 
            System.out.print(next + " ");

            first = second ; 
            second = next ; 
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt() ; 

        printFibonacci(n);

    }    
}
