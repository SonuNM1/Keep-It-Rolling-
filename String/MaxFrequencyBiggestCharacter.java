package String;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyBiggestCharacter {
    public static void main(String[] args) {
        String str = "Programming" ; 
        str = str.toLowerCase() ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(char ch: str.toCharArray()){
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0)+ 1) ; 
            }
        }

        int max = Integer.MIN_VALUE ; 

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue() ; 
            }
        }

        char biggestChar = Character.MIN_VALUE ; 

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                if(entry.getKey() > biggestChar){
                    biggestChar = entry.getKey() ;
                }
            }
        }

        System.out.println("Biggest Character with highest frequency: " + biggestChar);

    }
}
