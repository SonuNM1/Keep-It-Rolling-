// given an array, every element appears exactly twice except one element, which appears only once - no extra space (means can't use HashMap) - use XOR 

public class SingleNumber {
    public static int singleNumber(int[] arr){
        int answer = 0 ; 

        for(int num: arr){
            answer = answer^num ; 
        }

        return answer ; 
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1} ; 
        System.out.println(singleNumber(arr));
    }
}

// XOR (outputs 1 when exactly one input is 1). XOR returns 1 when the bits are different. It returns 0 when the bits are same (Same -> 0, Different -> 1)