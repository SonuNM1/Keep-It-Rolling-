import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4} ; 

        System.out.println("result: " + Arrays.toString(productExceptSelf(arr)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length] ; 

        int product = 1 ; 

        for(int num: nums) {
            product *= num ; 
        }

        for(int i=0 ; i < nums.length ; i++) {
            result[i] = product/nums[i];
        }

        return result ; 
    }
}
