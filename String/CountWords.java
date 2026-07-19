package String;

// count total number of words without using split method

public class CountWords {
    public static void main(String[] args) {
        String name = "Sonu N Mahto" ; 
        int count = 1 ; 

        for(int i=0 ; i < name.length()-1 ; i++){
            char ch1 = name.charAt(i) ;
            char ch2 = name.charAt(i+1) ; 

            if(ch1 == ' ' && ch2 != ' '){
                count++ ; 
            }
        }

        System.out.println(count);

    }
}
