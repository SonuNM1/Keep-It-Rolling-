

import java.util.Scanner;

// Store the first N prime numbers into the array - if n = 5, [2, 3, 5, 7, 11]

public class PrintNPrimeNumber {

    public static boolean isPrime(int num){
        if(num <= 1){
            return false ; 
        }
        for(int i=2 ; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false ;
            }
        }
        return true ; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the n value: ");
        int n = sc.nextInt() ; 

        int[] arr = new int[n] ; 

        int count = 0 ; 
        int num = 2 ; 

        while(count < n){
            if(isPrime(num)){
                arr[count] = num ; 
                count++ ; 
            }
            num++ ; 
        }

        System.out.println("First " + n + " prime numbers: ");
        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}
