package Array;

public class EvenStringLength {
    public static void main(String[] args) {
        
        // Given an array of strings, print and count all the Strings which has even number of characters 

        String[] str = {"Java", "Python", "JavaScript", "React", "NodeJS"} ; 

        for(int i = 0 ; i < str.length ; i++){
            if(str[i].length() % 2 == 0){
                System.out.println(str[i] + " - " + str[i].length());
            }
        }

    }
}
