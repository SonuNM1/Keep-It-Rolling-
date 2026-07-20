// Frequency of all elements in the array 

import java.util.HashMap;
import java.util.Map;

public class FrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 6, 6,3, 4} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0 ; i < arr.length ; i++){
            int element = arr[i] ;

            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        System.out.println("Printing element and its frequency: ");

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("Element: " + entry.getKey() + " Frequency: " + entry.getValue());
        }

    }
}
