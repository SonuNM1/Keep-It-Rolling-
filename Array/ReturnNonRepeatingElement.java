// return the index of the first non-repeating element in an array otherwise return -1, if no such element is found - HashMap doesn't maintain the insertion order 

import java.util.HashMap;
import java.util.Map;

public class ReturnNonRepeatingElement {
    public static int firstNonRepeatingElement(int[] arr){
        int index = -1 ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i= 0; i < arr.length ; i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0)+1) ;
        }

        for(int i= 0 ; i < arr.length ; i++){
            if(map.get(arr[i]) == 1){
                index = i ; 
            }
        }

        return index ; 
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,1,2};

        System.out.println("First non-repeating element index: " + firstNonRepeatingElement(arr));
    }
}
