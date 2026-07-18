package String;

import java.util.HashMap;

// count frequency of each character in the String 

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "Sonu NM" ; 
        str = str.toLowerCase() ; 

        char[] ch = str.toCharArray() ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < ch.length ; i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+ 1) ; 
        }

        System.out.println(map);

    }
}
