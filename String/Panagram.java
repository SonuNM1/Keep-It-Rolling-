package String;

// A panagram is a sentence that contains every letter of the English alphabet(a-z) at least once

public class Panagram {
    public static boolean isPanagram(String str){
        boolean result = true ; 

        int[] frequency = new int[26] ; 

        for(int i=0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch >= 'a' && ch <= 'z'){
                frequency[ch-'a']++ ; 
            }
        }

        // check whether every alphabet is presennt 

        for(int i=0 ; i < 26; i ++){
            if(frequency[i] == 0){
                result = false ; 
                break ;
            }
        }

        return result ; 
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog." ; 
        System.out.println(isPanagram(str));
    }
}
