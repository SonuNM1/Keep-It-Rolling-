package Array ; 
public class ReverseElement{
    public static void main(String[] args) {
        
        // WAP to reverse the digits of each element in a given integer array while keeping the positions of the elements unchanged.

        // [123, 456, 789, 120] -> [321, 654, 987, 21]

        int[] arr = {123, 456, 789, 120} ; 
        int[] result = new int[arr.length] ; 
        
        for(int i=0 ; i < arr.length ; i++){

            int num = arr[i] ; 
            
            while(num > 0){
                result[i] = result[i] * 10 + (num % 10) ; 
                num = num / 10 ; 
            }
        }

        for(int element: result){
            System.out.print(element + " ");
        }

    }
}