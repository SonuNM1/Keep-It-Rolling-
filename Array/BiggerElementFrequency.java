// // among all the elements having the maximum frequency, print the bigger one  

import java.util.HashMap;
import java.util.Map;

public class BiggerElementFrequency {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 4, 5, 6, 6, 6} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0; i < arr.length ; i++){
            int element = arr[i] ;

            map.put(element, map.getOrDefault(element, 0) +1) ; 
        }

        int maxFreq = Integer.MIN_VALUE ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue() ; 
            }
        }

        int biggerElement = Integer.MIN_VALUE ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == maxFreq){
                if(entry.getKey() > biggerElement){
                    biggerElement = entry.getKey() ; 
                }
            }
        }

        System.out.println("Bigger element: " + biggerElement);

    }
}

