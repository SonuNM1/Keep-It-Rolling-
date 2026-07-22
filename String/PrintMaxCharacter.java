package String;

import java.util.HashMap;
import java.util.Map;

// Print the character which has appeared the max number of times 

public class PrintMaxCharacter {
    public static void main(String[] args) {
        String str = "programming" ; 

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

        System.out.println("Most occuring character: ");

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                System.out.print(entry.getKey() + " ");
                break ; 
            }
        }

    }
}
