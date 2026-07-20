package String;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String str = "Programming" ; 

        str = str.toLowerCase() ;
        String result = "" ; 

        for(int i= 0 ; i< str.length() ; i++){
            char ch = str.charAt(i) ; 

            if(result.indexOf(ch) == -1){
                result += ch; 
            }
        }

        System.out.println("After removing duplicate characters: " + result);
        

    }
}
