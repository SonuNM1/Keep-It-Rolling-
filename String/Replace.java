package String;

public class Replace {
    public static void main(String[] args) {
        
        String str = " sonu  nm" ;

        char[] ch = str.toCharArray() ; 

        for(int i= 0 ; i < str.length() ; i++){
            if(ch[i] == ' '){
                ch[i] = '_' ; 
            }
        }
        
        // converting the character array back to String 

        String result = new String(ch) ; 
        System.out.println("Result: " + result);

    }    
}
