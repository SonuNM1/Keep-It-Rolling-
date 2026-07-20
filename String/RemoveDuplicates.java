package String ;

import java.util.HashSet;

// remove duplicates from String 

public class RemoveDuplicates{
    public static void main(String[] args) {
        String str = "Programming" ; 
        str = str.toLowerCase() ; 

        HashSet<Character> unique = new HashSet<>() ; 

        for(int i= 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(!unique.contains(ch)){
                System.out.print(ch); // since hashset doesn't preserves the insertion order
                unique.add(ch) ; 
            }
        }
    }
}