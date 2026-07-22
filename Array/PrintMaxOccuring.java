// print max occuring element in the array 

import java.util.HashMap;
import java.util.Map;

public class PrintMaxOccuring {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 2, 2, 2, 1} ; 
        int max = Integer.MIN_VALUE ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue() ; 
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                System.out.println("Max occuring element: " + entry.getKey() + "\nFrequency: " + max);
                break ; // so we print only the first one 
            }
        }

    }
}
