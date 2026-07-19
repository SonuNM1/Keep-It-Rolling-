// store n terms of fibonacci series into array 

import java.util.Scanner;

public class FibonnaciSeries {
    public static int[] fibonacci(int n){
        
        int first = 0 ; 
        int second = 1 ; 

        int[] result = new int[n] ; 

        if(n >= 1){
            result[0] = first ; 
        }

        if(n >= 2){
            result[1] = second ; 
        }

        for(int i=2 ; i < n ; i++){
            int next = first + second ; 

            result[i] = next ; 

            first = second ;
            second = next ;  
        }

        return result ; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the n term: ");
        int n = sc.nextInt() ; 

        int[] result = fibonacci(n) ; 

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}
