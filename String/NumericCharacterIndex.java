package String;

// take string input and print indexes of numeric characters in the string 

public class NumericCharacterIndex {

    public static boolean isNumeric(char c){
        if(c >= '0' && c <= '9'){
            return true ; 
        } ; 
        return false ; 
    }
    public static void main(String[] args) {
        String str = "Sonu 21 sm 1" ; 
        
        char[] ch = str.toCharArray() ; 

        System.out.println("Numeric character indexes: ");

        for(int i=0 ; i< ch.length ; i++){
            if(isNumeric(ch[i])){
                System.out.print(i + " ");
            }
        }
    }
}
