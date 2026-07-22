// You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.

// Return all lonely numbers in nums. You may return the answer in any order.

import java.util.HashMap;

public class LonelyNumbers {
    public static void main(String[] args) {
        int[] arr = {10,6,5,8} ; 

        int lonely = 0 ; 

        // count frequency 

        HashMap<Integer, Integer> map = new HashMap<>() ; 
        for(int i=0 ; i < arr.length; i++){
            int element = arr[i] ;

            map.put(element, map.getOrDefault(element, 0)+1) ; 
        }

        // check each element

        System.out.println("Lonely numbers: ");

        for(int i=0 ; i < arr.length ; i++){
            int element = arr[i] ; 

            if((map.get(element) == 1) && (!map.containsKey(element-1)) && (!map.containsKey(element+1))){
                System.out.print(element + " ");
            }

        }
        
    }
}
