public class SwapThreeNumbers2 {
    public static void main(String[] args) {
        
        // for the given three numbers, Swap 1st into 2nd, 2nd into 3rd, 3rd into first - without using fourth variable 

        int a = 1, b = 2, c = 3 ; 

        a = a+b+c ; 
        b = a-(b+c) ; 
        c = a-(b+c) ; 
        a = a-(b+c) ; 

        System.out.println("a: " + a + " b: " + b + " c: " + c);

    }
}
