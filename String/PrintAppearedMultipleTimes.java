package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// in a given string, print the character that appeared multiple times 

public class PrintAppearedMultipleTimes {
    public static void print(String str){

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(char ch: str.toCharArray()){
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0) + 1) ; 
            }
        }

        System.out.println("Printing characters that appeared multiple times in the string: ");

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
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
