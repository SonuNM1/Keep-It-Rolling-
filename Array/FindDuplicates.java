import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1 ,2, 1, 2, 5, 4, 6, 4, 5} ; 

        HashMap<Integer, Integer> freq = new HashMap<>() ; 

        for(int i=0 ; i<arr.length ; i++){
            int element = arr[i] ; 

            freq.put(element, freq.getOrDefault(element, 0) + 1) ; 
        }

        // Printing the character and frequency 

        // for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
        //     System.out.println("Integer: " + entry.getKey() + " frequency -> " + entry.getValue());
        // }

        System.out.println("Duplicates: ");

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
