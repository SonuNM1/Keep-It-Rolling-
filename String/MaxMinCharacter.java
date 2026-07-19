package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// maximum and minimum occuring character in java 

public class MaxMinCharacter {
    public static void occurence(String str){

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(int i= 0 ; i< str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0) + 1) ; 
            }
        }

        int max = Integer.MIN_VALUE ; 
        int min = Integer.MAX_VALUE ; 

        char maxChar = ' ', minChar = ' ' ; 

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            char ch = entry.getKey() ; 
            int frequency = entry.getValue() ; 

            if(frequency > max){
                maxChar = ch ; 
                max = frequency ; 
            }

            if(frequency < min){
                min = frequency ; 
                minChar = ch ; 
            }
        }

        System.out.println("Character with most frequency: " + maxChar + " -> " + max);
        System.out.println("Character with least frequency: " + minChar + " -> " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the word or sentence");
        String str = sc.nextLine() ; 

        occurence(str);

    }
}

// What if multiple characters have the same frequency 