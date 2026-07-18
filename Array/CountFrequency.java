// Count frequency of each number in the given array 

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 2, 1} ; 

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1) ; 
        }

        System.out.println("number with its count");
        System.out.println(map);

    }
}
