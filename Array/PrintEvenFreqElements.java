// print elements with even frequency 

import java.util.HashMap;
import java.util.Map;

public class PrintEvenFreqElements {
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 3, 2, 2} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 
            map.put(element, map.getOrDefault(element, 0)+ 1) ; 
        }

        System.out.println("Elements with even frequency: ");

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() % 2 == 0){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
