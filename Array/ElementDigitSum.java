public class ElementDigitSum {
    public static void main(String[] args) {
        
        // difference between element and digit sum of a given array 

        int[] num = {123, 15, 4 , 3} ; 
        int elementSum = 0, digitSum = 0; 

        // calculating element sum 

        for(int i = 0 ; i < num.length ; i ++){
            elementSum += num[i] ; // 23
        }

        // calculating the digit sum 

        for(int i = 0 ; i < num.length ; i++){
            int n = num[i] ; 

            while(n > 0 ){
                digitSum += n % 10 ; // 3
                n = n/10 ; 
            }
        }

        System.out.println("Difference between the elementSum and digitSum is: " + (elementSum - digitSum));

    }
}
