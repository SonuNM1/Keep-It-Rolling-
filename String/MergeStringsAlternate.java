package String;

// merge two strings by taking one character alternatively from each string. If one string becomes empty before the other, append all the remaining characters of the longer string 

public class MergeStringsAlternate {
    public static String merge(String str1, String str2){
        StringBuilder result = new StringBuilder() ; 

        int i= 0 ; 
        int j= 0 ; 

        while(i < str1.length() && j < str2.length()){
            result.append(str1.charAt(i)) ; 
            result.append(str2.charAt(j)) ; 

            i++ ; 
            j++ ; 
        }

        while(i < str1.length()){
            result.append(str1.charAt(i)) ; 
            i++ ; 
        }
        while(j < str2.length()){
            result.append(str2.charAt(j)) ; 
            j++ ; 
        }

        return result.toString() ; 

    }
    public static void main(String[] args) {
        String str1 = "sonu" ; 
        String str2 = "Garima" ; 

        String result = merge(str1, str2) ; 
        System.out.println("Result: " + result);
    }
}
