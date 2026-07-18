package String;

public class PalindromeString {
    public static boolean isPalindrome(String str){

        str = str.toLowerCase() ;
        String originalStr = str, reverse = "" ; 
        char[] ch = str.toCharArray() ;

        for(int i=ch.length-1 ; i>=0 ; i--){
            reverse += ch[i] ; 
        }

        return originalStr.equals(reverse) ; 
    }
    public static void main(String[] args) {
        String str = "nitin" ; 
        System.out.println(isPalindrome(str));
    }
}
