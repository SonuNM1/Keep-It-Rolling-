;

public class LargestString {
    public static void main(String[] args) {
        
        // for the given array of strings, print the largest string 

        String[] str = {"Java", "Python", "JavaScript", "React", "NodeJS"} ; 
        String largest = str[0] ; 

        for(int i =0 ; i < str.length ; i++){
            if(str[i].length() > largest.length()){
                largest = str[i] ; 
            }
        }

        System.out.println("Largest string: " + largest);
        System.out.println("Largest string length: " + largest.length());

    }    
}
