package String;

import java.util.Scanner;

//Write a Java program to take a string as input and segregate (separate) all alphabetic characters and numeric digits. Print a new string in which all alphabets appear first and all digits appear after them

// a4cdx37d2b -> dcaxdb4372 - no need to maintain the order 

public class SeggregateAlphaNumeric {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the sentence");
        String str = sc.nextLine() ; 

        str = str.toLowerCase() ; 

        String alphabet = "", digits = "" ; 

        char[] ch = str.toCharArray() ; 

        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                alphabet = alphabet + ch[i] ; 
            } else {
                digits = digits + ch[i] ; 
            }
        }

        System.out.println("Seggregated String: " + (alphabet + digits));

    }    
}
