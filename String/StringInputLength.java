package String;

import java.util.Scanner;

// take a string input and get length of string without using the length() method in at least 4 different ways 

public class StringInputLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a string word");
        String str = sc.nextLine() ; 

        System.out.println("String: " + str);

        // length method 1 

        char[] ch = str.toCharArray() ; 

        int length = 0 ; 

        for(char c: ch){
            length++ ; 
        }

        System.out.println("Length 1 = " + length);

        // length method 2 

        length = 0 ; 

        String[] s = str.split("") ; 

        for(String s1: s){
            length++ ; 
        }

        System.out.println("Length 2 = " + length);

        // length method 3 

        length = str.lastIndexOf(str) ; 

        System.out.println("Length 3 = " + length);

    }
}
