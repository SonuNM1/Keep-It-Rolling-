package String;

import java.util.Scanner;

// from the given string print the biggest numeric character, return -1 if there is no numeric character 

public class BiggestNumericCharacter {
    public static int biggest(String str){

        int largest = -1 ; 

        for(int i= 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch >= '0' && ch <= '9'){
                if((ch-'0') > largest){
                    largest = ch-'0' ; 
                }
            }
        }

        return largest ; 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the word");
        String str = sc.nextLine() ; 

        System.out.println("Largest: " + biggest(str));
    }
}
