public class Factorial {
    public static void main(String[] args) {
        
        int n = 5 ; 
        long factorial = 1 ; // using long data structure rather than int bcz factorial grows very exponentially 

        for(int i= n ; i >= 1 ; i--){
            factorial *= i ; 
        }

        System.out.println("Factorial of " + n + " is: " + factorial);

    }
}
