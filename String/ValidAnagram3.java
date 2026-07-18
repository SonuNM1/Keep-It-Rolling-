package String ;

import java.util.HashMap;

public class ValidAnagram3{
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false ; 
        }

        HashMap<Character, Integer> map = new HashMap<>() ; 

        // traversing the first array and incrementing the character count 

        for(int i=0 ; i < str1.length() ; i++){
            char ch = str1.charAt(i) ; 

            map.put(ch, map.getOrDefault(ch, 0) + 1) ; 
        }

        // traversing the second array and decrementing the count associated with character and removing the character with count 0

        for(int i=0 ; i < str2.length() ; i++){
            char ch = str2.charAt(i) ; 

            map.put(ch, map.get(ch) - 1) ; 

            if(map.get(ch) == 0){
                map.remove(ch) ; 
            }
        }

        return map.isEmpty() ;
    }
    public static void main(String[] args) {
        String str1 = "Silent" ; 
        String str2 = "Listen" ; 

        str1 = str1.toLowerCase() ; 
        str2 = str2.toLowerCase() ; 

        System.out.println(isAnagram(str1, str2)); ; 

    }
}

// Using HashMap - first check the length of both array, put elements in hashmap and increment the character's associated count, traverse through second array and in map reduce the associated count of characters, remove the characters from the hashmap if their count frequency is 0 . and in the end if hashmp is empty then anagram otherwise not . 