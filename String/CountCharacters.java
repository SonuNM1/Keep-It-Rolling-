package String;

import java.util.Scanner;

// character count without digit or symbol 

public class CountCharacters {
    public static void main(String[] args) {
        
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.nextLine() ; 

        str = str.toLowerCase() ; 

        char[] ch = str.toCharArray() ; 
        int count = 0 ; 

        for(int i=0 ; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                count++ ; 
            }
        }

        System.out.println("Count of characters: " + count);

    }
}
