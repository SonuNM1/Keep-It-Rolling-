package String;

// count the total number of vowel and consonant in the string 

public class VowelConsonantCount {
    public static void count(String str){
        int vowel = 0, consonant = 0; 
        str = str.toLowerCase() ; 
        
        for(int i= 0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++ ; 
                } else {
                    consonant++ ; 
                }
            }
        }

        System.out.println("Vowel: " + vowel + " Consonant: " + consonant);
    }

    public static void main(String[] args) {
        String name = "Sonu N Mahto" ; 
        count(name);
    }
}
