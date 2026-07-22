// print true if all the elements in the array are unique otherwise false 

import java.util.HashMap;
import java.util.Map;

public class ElementsUnique {
    public static boolean unique(int[] arr){
        boolean isUnique = true ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ;i++){
            int element = arr[i] ; 

            map.put(element, map.getOrDefault(element, 0)+1) ; 
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() != 1){
                isUnique = false ; 
            }
        }

        return isUnique ; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 4} ; 

        System.out.println(unique(arr));
    }
}
