package String;

// print sum of all even numeric characters in the string 

public class EvenNumericCharacterSum {
    public static void main(String[] args) {
        
        String str = "sonu2435" ; 
        char[] ch = str.toCharArray() ; 

        int sum = 0 ; 

        for(int i= 0 ; i < str.length() ; i++){
            char element = ch[i] ; 

            if(element >= '0' && element <= '9'){
                if((element - '0') % 2 == 0){
                    sum += element - '0' ; 
                }
            }
        }

        System.out.println(sum);

    }
}
