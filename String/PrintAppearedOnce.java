package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Print all the characters which has appeared exactly once in the String 

public class PrintAppearedOnce {
    public static void print(String str){

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1) ; 
        }

        System.out.println("Characters that appeared only once: ");

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the word or sentence: ");
        String str = sc.nextLine() ; 

        print(str);

    }
}
