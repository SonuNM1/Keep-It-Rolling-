package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
        // Given an array of integers and a target value, find the indices of the two numbers whose sum is equal to the target

        int[] arr = {1, 2, 3, 5, 4} ; 
        int target = 6 ; 

        // for(int i=0 ; i < arr.length ; i++){
        //     for(int j = i + 1 ; j < arr.length ; j++){
        //         if(arr[i] + arr[j] == target){
        //             System.out.println(i + " , " + j);
        //         }
        //     }            
        // }

        // HashMap stores: key (array element) and value (index of that element)

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        for(int i =0 ; i < arr.length ; i++){
            int needed = target - arr[i] ; 

            // checking if the required number has already been seen 

            if(map.containsKey(needed)){
                
                // map.get returns index of that number 

                System.out.println("Indices : " + map.get(needed) + " , " + i);
            }

            // storing the current element and its index for future 

            map.put(arr[i], i) ; 
        }

    }
}
