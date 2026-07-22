// Majority element in an array is defined as the element that appears more than n/2 times 

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majority(int[] arr){
        int majority = -1 ; 

        int n = arr.length/2 ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1) ; 
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > n){
                majority = entry.getKey() ; 
            }
        }

        return majority ; 
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,1,2,2,2,2,2,2,2,2};

        System.out.println("Majority element: " + majority(arr));
    }
}
