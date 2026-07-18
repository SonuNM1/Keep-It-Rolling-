package String;

import java.util.HashMap;

public class ValidAnagram3 {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false ; 
        }

        HashMap<Character, Integer> map = new HashMap<>() ; 

        // increasing frequency 

        for(int i= 0 ; i < str1.length() ; i++){
            char ch = str1.charAt(i) ; 

            map.put(ch, map.getOrDefault(ch, 0) + 1) ;

        }

        // decrease frequency 

        for(int i=0 ; i < str2.length() ; i++){
            char ch = str2.charAt(i) ; 

            map.put(ch, map.get(ch) - 1) ; 

            // if character count or frequency becomes 0 remove that character from hashmap 

            if(map.get(ch) == 0){
                map.remove(ch) ; 
            }
        }

        return map.isEmpty() ; 

    }
    public static void main(String[] args) {
        
        String str1 = "listen" ; 
        String str2 = "silent" ;

        System.out.println(isAnagram(str1, str2));

    }
}

// Instead of using a frequency array of size 26, we use a HashMap<Character, Integer> to store the frequency of each character. We first traverse the first string and store the frequency of every character in the HashMap. Then we traverse the second string and decrease the frequency of every character. If a character's frequency becomes zero, we remove it from the HashMap. At the end, if the HashMap is empty, both strings contain exactly the same characters with the same frequencies, so they are anagrams.

// Check lengths -> Creater HashMap<Character, Integer> -> Traverse first string, increase frequency -> Traverse second string, decrease frequency -> if frequency becomes 0, remove character from HashMap -> if hashmap is empty, return true 