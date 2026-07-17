public class Loss {
    public static void main(String[] args) {
        
        // for a given CP and SP. Calculate the loss %. CP - 120, SP - 90 

        int cp = 120, sp = 90 ; 

        double loss = (((double)(cp - sp)/cp))*100 ; 

        System.out.println("Loss percentage: " + loss);

    }
}
