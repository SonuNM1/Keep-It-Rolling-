package String;

// count total number of words in a string - can use split method 

public class CountWords2 {
    public static void main(String[] args) {
        String str = "My name is  Sonu NM" ;
        int count = 0 ; 

        String[] s = str.split(" ") ; 
        
        for(int i= 0 ; i < s.length ; i++){
            if(!s[i].equals("")){
                count++ ; 
            }
        }

        System.out.println("Count: " + count);
        
    }
}
