package String;

import java.util.Arrays;

// check whether two strings are anagram of each other. Two strings are called anagram if they contains the same characters with the same frequencies, but the characters may appeaer in different order

public class ValidAnagram {
    public static boolean isAnagram(String str1, String str2){

        // check length 

        if(str1.length() != str2.length()){
            return false ; 
        }

        // convert to array 

        char[] ch1 = str1.toCharArray() ; 
        char[] ch2 = str2.toCharArray() ; 

        // sorting the character arrays 

        Arrays.sort(ch1) ;
        Arrays.sort(ch2) ; 

        // comparing both the arrays 

        return Arrays.equals(ch1, ch2) ; 

    }
    public static void main(String[] args) {
        String str1 = "silent" ; 
        String str2 = "listen" ; 

        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ; 

        System.out.println(isAnagram(str1, str2));
    }
}

// LOGIC 1 -> Since anagrams contain the same characters with the same frequency, sorting both strings alphabetically should produce identical sequences of characters. If the sorted strings are equal, they are anagrams; otherwise, they are not. 

// Check lengths -> Convert both strings into character arrays -> Sort both arrays -> Compare both arrays -> If equal return true, otherwise false 