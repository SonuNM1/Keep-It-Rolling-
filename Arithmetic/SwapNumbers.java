public class SwapNumbers {
    public static void main(String[] args) {
        
        // Swap two numbers using third variable 

        int a = 1, b = 2; 
        int c; 

        System.out.println("Value before swapping - a: " + a + " b: " + b);

        c = b ; // 2 
        b = a ; // 1
        a = c ; 

        System.out.println("Value after swapping - a: " + a + " b: " + b);

    }
}
