public class LastTwoDigit {
    public static void main(String[] args) {
        int num = 5783 ;

        int lastTwoDigit = num % 10 ; // 3 

        num = num / 10 ; // 578 ; 

        lastTwoDigit =  (num % 10)*10 + lastTwoDigit ;

        System.out.println("The last two digit of " + num + " is " + lastTwoDigit);

    }
}
