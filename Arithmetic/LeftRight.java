public class LeftRight {
    public static void main(String[] args) {
        
        // print each digit of the number one by one from left to right 

        int n = 5783 ; 
        
        String s = String.valueOf(n) ; // "5783" 

        for(int i = 0 ; i < s.length() ; i++){
            System.out.println(s.charAt(i));
        }

    }
}


// valueOf converts any data type to String 