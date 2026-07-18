package String;

// without using toCharArray, convert the String to character array 

public class StringToCharacterArray {
    public static void main(String[] args) {
        
        String str = "Sonu NM" ; 
        char[] ch = new char[str.length()] ; 

        for(int i=0 ; i < str.length() ; i++){
            char c = str.charAt(i) ; 

            ch[i] = c ; 
        }

        System.out.println("Printing the character array: ");

        for(char element: ch){
            System.out.print(element + " ");
        }

    }
}
