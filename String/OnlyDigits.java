package String;

// check if a string only contains the digit 

public class OnlyDigits {
    public static boolean result (String str){
        char[] ch = str.toCharArray() ; 

        for(int i=0 ; i< ch.length ; i++){
            if(ch[i] >= '0' || ch[i] <= '9'){
                return false; 
            }
        }

        return true ; 
    }
    public static void main(String[] args) {
        String str = "1234323" ; 

        if(result(str)){
            System.out.println("Contains only digits");
        } else {
            System.out.println("Doesn't contain digit");
        }
    }
}
