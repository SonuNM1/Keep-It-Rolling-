package String;

// take a string input and print all the space characters indexes 

public class SpaceCharacterIndex {

    public static boolean isSpace(char c){
        if(c == ' '){
            return true ; 
        }
        return false ; 
    }
    public static void main(String[] args) {
        String str = " sonu nm" ; 
        char[] ch = str.toCharArray() ; 

        System.out.println("Space character indexes: ");

        for(int i=0 ; i< ch.length ; i++){
            if(isSpace(ch[i])){
                System.out.print(i + " ");
            }
        }

    }
}
