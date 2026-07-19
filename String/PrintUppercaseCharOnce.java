package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// print characters only once 

public class PrintUppercaseCharOnce {
    
    public static void printUppercase(String str){

        HashSet<Character> set = new HashSet<>() ; 

        System.out.println("Printing uppercase characters once");

        for(char ch: str.toCharArray()){
            if((ch >= 'A' && ch <= 'Z') && !set.contains(ch)){
                System.out.print(ch + " ");
                set.add(ch) ;
            }
        }
    }

    public static void printLowercase(String str){
        HashSet<Character> set = new HashSet<>() ; 

        System.out.println();
        System.out.println("Printing lowercase characters once: ");

        for(char ch: str.toCharArray()){
            if((ch >= 'a' && ch <= 'z') && !set.contains(ch)){
                System.out.print(ch + " ");
                set.add(ch) ; 
            }
        }
    }

    public static void printCharacters(String str){
        HashSet<Character> set = new HashSet<>() ; 
        
        System.out.println();
        System.out.println("Printing characters atleast once: ");

        for(char ch : str.toCharArray()){
            if(Character.isAlphabetic(ch)){
                System.out.print(ch + " ");
                set.add(ch) ; 
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the word or sentence");
        String str = sc.nextLine() ; 

        printUppercase(str);
        printLowercase(str);
        printCharacters(str);

    }
}
