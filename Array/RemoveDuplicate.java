import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4, 1, 2} ; 
        int[] result = new int[arr.length] ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            if(!map.containsKey(element)){
                result[i] = element ; 
                map.put(element, 1) ; 
            }
        }
        System.out.println("After removing duplicates: ");
        for(int element: result){
            System.out.print(element + " ");
        }
    }
}
