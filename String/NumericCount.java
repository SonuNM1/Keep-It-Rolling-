package String;

import java.util.Scanner;

// take string input and count all the numeric characters in the string 

public class NumericCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the word");
        String str = sc.nextLine() ; 
        
        char[] ch = str.toCharArray() ; 
        int count = 0 ; 

        for(char c: ch){
            if(c >= '0' && c <= '9'){
                count++ ; 
            }
        }

        System.out.println("Count of numeric characters in the string: " + count);

    }
}
