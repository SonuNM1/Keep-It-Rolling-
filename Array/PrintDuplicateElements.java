// print element of the array which has appeared more than once/which has duplicate values in the array 

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateElements {
    public static void main(String[] args) {
      
        int[] arr = {1, 1, 3, 2, 4, 5, 4} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        System.out.println("Printing duplicate elements: ");

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
