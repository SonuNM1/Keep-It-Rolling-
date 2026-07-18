package String;

public class VowelCount {
    public static void main(String[] args) {
        String str = "Sonu nm" ;
        str = str.toLowerCase() ; 

        char[] ch = str.toCharArray() ; 
        int vowelCount = 0; 

        for(int i=0 ; i < ch.length ; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                vowelCount++ ; 
            }
        }

        System.out.println("Vowel count: " + vowelCount);

    }
}
