package Array ;

public class PrimeNumber{

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

    public static void printPrimeNumbers(int[] arr){
        int count = 0 ; 

        System.out.println("Prime numbers: ");

        for(int i=0 ; i < arr.length ; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
                count++ ;
            }
        }
        System.out.println();
        System.out.println("Total prime number: " + count);

    }

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6, 23} ; 
        printPrimeNumbers(num);
    }
}