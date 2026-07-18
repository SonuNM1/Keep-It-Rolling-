package String;

public class StringReverse {

    public static String printReverse1(String str){
        String reverse = "" ; 

        char[] ch = str.toCharArray() ; 

        for(int i=ch.length-1 ; i >= 0 ; i--){
            reverse = reverse + ch[i] ; 
        }  
        return reverse ;  
    }

    public static String printReverse2(String str){
        String reverse = "" ; 

        char[] ch = str.toCharArray() ; 

        for(int i= 0 ; i < ch.length ; i++){
            reverse = ch[i] + reverse ; 
        }

        return reverse ; 
    }

    public static void main(String[] args) {
        String str = "Sonu" ; 

        System.out.println("Method 1: " + printReverse1(str));
        System.out.println("Method 2: " + printReverse2(str));
    }
}
