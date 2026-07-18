package String;

public class ValidAnagram2 {
    public static boolean isAnagram(String str1, String str2){
        
        if(str1.length() != str2.length()){
            System.out.println("not an anagram");
            return false; 
        }

        int[] freq = new int[26] ; 

        char[] ch1 = str1.toCharArray() ; 
        char[] ch2 = str2.toCharArray() ; 

        // frequency count of each character in str1 increasing 

        for(int i=0 ; i < ch1.length ; i++){
            freq[ch1[i] - 'a']++ ; 
        }

        for(int i= 0 ; i < ch2.length ; i++){
            freq[ch2[i] - 'a']-- ; 
        }

        for(int i=0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                return false ; 
            }
        }
        return true ; 
    }
    public static void main(String[] args) {
        String str1 = "Silent" ; 
        String str2 = "Listen" ; 

        str1 = str1.toLowerCase() ; 
        str2 = str2.toLowerCase() ; 

        System.out.println(isAnagram(str1, str2));
    }
}

// Frequency Array - we count how many times each character appears. Since strings only contain lowercase alphabets, we create an integer array of size 26, where each index represents one character. We first traverse the first string and increment the frequency of every character. Then we traverse the second string and decrement the frequency of every character. Therefore, after processing both the strings, every element in the frequency array must be 0. If even one element is non-zero, the strings are not anagram. 

// Check lengths -> Create frequency array of size 26 -> Traverse the first string - increase frequency -> Traverse second string - decrease frequency -> traverse frequency array -> if every value is zero, return True otherwise false 