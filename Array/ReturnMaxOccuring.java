// return the element which has highest frequency in the array 

import java.util.HashMap;
import java.util.Map;

public class ReturnMaxOccuring {
    public static int highestFreq(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0) + 1) ; 
        }

        int max = Integer.MIN_VALUE ; 
        int element = Integer.MIN_VALUE ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue() ;
                element = entry.getKey() ;  
            }
        }

        return element ; 

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 5, 1, 6, 7, 6, 6, 6} ; 
        System.out.println("Highest occuring element: " + highestFreq(arr)); ; 
    }
}
