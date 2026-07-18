package String;

// without using reverse 

public class PalindromeString2 {
    public static void main(String[] args) {
        String str = "Nitin" ; 
        str = str.toLowerCase() ; 

        char[] ch = str.toCharArray() ; 
        boolean isPalindrome = true ; 

        int start = ch[0] ; 
        int end = ch[ch.length-1] ; 

        while(start < end){
            if(ch[start] != ch[end]){
                isPalindrome = false ; 
                break ; 
            }
            start++ ; 
            end-- ; 
        }
        
        if(isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}

// A palindrome reads the same from left to right and right to left. Instead of reversing the string, compare characters from both the ends. If even one pair doesn't match, it's not a palindrome