package String ;

import java.util.HashMap;
import java.util.Map;

// Print the character which has appeared the max number of times. If multiple characters have the same max frequency, return the smallest character 

public class MaxFrequencySmallestCharacter{
    public static void main(String[] args) {
        
        String str = "Programming" ; 
        str = str.toLowerCase() ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(char ch: str.toCharArray()){
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0)+1) ; 
            }
        }

        int max = Integer.MIN_VALUE ; 

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue() ; 
            }
        }

        char smallestChar = Character.MAX_VALUE ;
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                if(entry.getKey() < smallestChar){
                    smallestChar = entry.getKey() ; 
                }
            }
        }

        System.out.println("Smallest character: " + smallestChar);

    }
}