import java.util.HashMap;
import java.util.Map;

public class UniqueElementsSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3} ;

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0)+1) ; 
        }

        int sum = 0 ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                sum += entry.getKey() ; 
            }
        }

        System.out.println("Sum of unique element: " + sum);

    }
}
