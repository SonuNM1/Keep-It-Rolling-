// print prime number till Nth term 

public class PrimeNumberTillN {
    public static boolean isPrime(int n){

        if(n <= 1){
            return false ; 
        }

        for(int i=2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false ;
            }
        }

        return true ; 

    }
    public static void main(String[] args) {
        int n = 5 ; 
        int count = 0 ; 
        int number = 2 ; 

        System.out.println("Prime number till: " + n + " terms");

        while(count < n){
            if(isPrime(number)){
                System.out.print(number + " ");
                count++ ; 
            }
            number++ ; 
        }
    }
}
