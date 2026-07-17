public class SwapNumbers2 {
    public static void main(String[] args) {
        
        // swap two numbers without using third variable 

        int a = 1, b = 2 ; 

        System.out.println("Original: a - " + a + " b - " + b);

        a = a + b ; // 3 
        b = a - b ; // 3 - 2 = 1 
        a = a - b ; 

        System.out.println("After Swapping: a - " + a + " b - " + b);

    }
}
