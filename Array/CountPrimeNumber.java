// count all prime numbers from 1 to nth term 

public class CountPrimeNumber {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false ; 
        }

        for(int i=2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false ; 
            }
        }

        return true ; 
    }
    public static void main(String[] args) {
        int count = 0 ; 
        int n = 100 ; 

        for(int i=2 ; i <= n; i++){
            if(isPrime(i)){
                count++ ; 
            }
        }

        System.out.println(count);

    }
}
