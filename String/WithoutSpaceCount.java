package String;

import java.util.Scanner;

// take a string input and count all the characters without spaces in the String

public class WithoutSpaceCount {
    public static void main(String[] args) {
        
        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.nextLine() ; 

        char[] ch = str.toCharArray() ; 
        int count = 0 ; 

        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] != ' '){
                count++ ; 
            }
        }

        System.out.println("Count of characters without space: " + count);

    }
}
