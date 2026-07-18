package String;

// sum of numerics in a string 

public class NumericCharacterSum {
    public static int numericSum(String str){
        int sum = 0 ; 
        char[] ch = str.toCharArray() ; 

        for(int i= 0 ; i < ch.length ; i++){
            char element = ch[i] ; 

            if(element >= '1' && element <= '9'){
                sum += element - '0' ; 
            }
        }

        return sum ; 
    }
    public static void main(String[] args) {
        String str = "123sonu4" ; 
        System.out.println(numericSum(str));
    }
}

// whenever u have digit stored as character ('0' to '9'), and want its numeric value, use int digit = ch - '0' since the numeric characters are stored as ASCII value not their numeric value 