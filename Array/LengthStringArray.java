;

public class LengthStringArray {
    public static void main(String[] args) {
        
        // for the given array of strings, print the length of all the strings 

        String[] str = {"Java", "Python", "JavaScript", "React", "NodeJS"} ; 

        for(int i = 0 ; i < str.length; i++){
            System.out.println(str[i] + " - " + str[i].length());
        }

    }
}
