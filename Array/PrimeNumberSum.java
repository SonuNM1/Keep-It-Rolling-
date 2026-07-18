;

public class PrimeNumberSum {

    // print the sum of all prime numbers in an array 

    public static boolean isPrime(int num){
        if(num <= 1){
            return false ; 
        }
        for(int i=2 ; i < Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false ; 
            }
        }
        return true ;
    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 8} ;
        int sumPrime = 0 ; 

        for(int i=0 ; i < arr.length ; i++){
            if(isPrime(arr[i])){
                sumPrime += arr[i] ; 
            }
        }
        
        System.out.println("Sum of prime number in the array: " + sumPrime);

    }
}
