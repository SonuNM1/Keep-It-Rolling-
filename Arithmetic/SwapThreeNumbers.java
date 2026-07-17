public class SwapThreeNumbers {
    public static void main(String[] args) {
        
        // for the given three numbers, Swap 1st into 2nd, 2nd into 3rd, 3rd into first - using fourth variable 

        int a = 1, b = 2, c = 3 ; 
        int temp ; 

        System.out.println("Original: a - " + a + " b - " + b + " c - " + c);

        temp = a ; 
        a = c ; 
        c = b ; 
        b = temp ; 

        System.out.println("Original: a - " + a + " b - " + b + " c - " + c);

    }
}
