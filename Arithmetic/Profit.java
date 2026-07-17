public class Profit {
    public static void main(String[] args) {
        
        // for a given CP and SP. Calculate the profit %. CP - 120, SP - 160 

        int cp = 120, sp = 160 ; 

        double profit = ((double)((sp-cp))/cp)*100 ; 

        System.out.println("Profit: " + profit);

    }
}
