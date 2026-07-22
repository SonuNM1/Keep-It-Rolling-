// print each element of the array which has appeared only once/unique elements in the array 

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueElements {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 3, 2, 6, 5} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        // }

        System.out.println("Printing unique elements: ");

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
