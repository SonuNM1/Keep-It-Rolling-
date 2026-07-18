package String;

import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "programming" ;  
        String result = "" ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(int i= 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; // p

            if(!map.containsKey(ch)){
                result += ch ; 
                map.put(ch, 1) ; 
            }
        }

        System.out.println(result);

    }
}

// create hashmap - > traverse the character array -> if character is in the hashmap, do not add it -> if not store in the hashmap 