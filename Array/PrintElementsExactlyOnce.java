// print element of array only once - dont print duplicate ones 

import java.util.HashSet;

public class PrintElementsExactlyOnce {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 5, 3, 6, 6,3, 4} ; 

        HashSet<Integer> set = new HashSet<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            if(!set.contains(arr[i])){
                System.out.print(arr[i] + " ");
                set.add(arr[i]) ; 
            }
        }

    }
}
