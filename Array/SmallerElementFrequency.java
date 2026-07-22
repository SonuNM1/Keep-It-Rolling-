/*
Print the smaller element and its frequency which has appeared the maximum number of times if more than one element has the maximum frequency

    arr = 1 1 1 4 5 6 6 6

Frequency 

    1 -> 3
    6 -> 3
    4 -> 1
    5 -> 1

    Maximum frequency is -> 3 (1, 6). There are 2 elements with same frequency. But the question says print the smaller element(1)

*/

import java.util.HashMap;
import java.util.Map;

public class SmallerElementFrequency {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 1, 4, 5, 6, 6, 6} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0; i < arr.length ; i++){
            int element = arr[i] ; 
            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        int maxFreq = Integer.MIN_VALUE ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue() ; 
            }
        }

        int smallestElement = Integer.MAX_VALUE ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(maxFreq == entry.getValue()){
                if(entry.getKey() < smallestElement){
                    smallestElement = entry.getKey() ; 
                }
            }
        }

        System.out.println("Smallest element: " + smallestElement);

    }
}

// among all the elements having the maximum frequency, print the smallest one 