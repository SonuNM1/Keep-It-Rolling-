import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] num = {1, 4, 7, 2, 3, 5} ; 

        System.out.println("Second largest: " + secondLargest(num));
    }
    public static int secondLargest(int[] num) {
        Arrays.sort(num) ; 

        int largest = num[num.length-1] ; 

        for(int i=num.length-2 ; i >= 0; i--) {
            if(num[i] < largest) {
                return num[i] ; 
            }
        }
        return -1; 
    }
}
