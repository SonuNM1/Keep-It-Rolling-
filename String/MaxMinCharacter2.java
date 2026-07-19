package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Given a string, print all the characters having the maximum frequency and all the characters with minimum frequency. Ignore spaces while counting the frequency of characters

public class MaxMinCharacter2 {
    public static void characterFreq(String str){

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0)+1) ; 
            }
        }

        int max = Integer.MIN_VALUE ; 
        int min = Integer.MAX_VALUE ; 



        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            int frequency = entry.getValue() ; 

            if(frequency > max){
                max = frequency ; 
            }
            
            if(frequency < min){
                min = frequency ; 
            }
        }

        System.out.println("Maximum frequency: " + max);
        System.out.println("Characters: ");

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == max){
                System.out.print(entry.getKey() + " ");
            }
        }

        System.out.println();
        System.out.println("Minimum frequency: " + min);
        System.out.println("Characters: ");

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == min){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the word or sentence: ");
        String str = sc.nextLine() ; 

        characterFreq(str);
    }    
}
