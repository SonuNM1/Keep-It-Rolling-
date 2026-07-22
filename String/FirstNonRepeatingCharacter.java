package String;

import java.util.HashMap;

// return the index of first non-repeating character of the String. Return -1 if no such character is found.

public class FirstNonRepeatingCharacter {
    public static int firstUniqueCharacter(String str){
        int index = -1 ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        // count frequency 

        for(char ch: str.toCharArray()){
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0) + 1) ; 
            }
        }

        // find first non-repeating character 

        for(int i=0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch != ' ' && map.get(ch) == 1){
                index = i ;
                break ;  
            }
        }

        return index ; 
    }
    public static void main(String[] args) {
        String str = "programming" ; 
        System.out.println(firstUniqueCharacter(str));
    }
}
