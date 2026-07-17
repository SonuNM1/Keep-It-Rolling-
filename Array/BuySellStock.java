package Array;

public class BuySellStock {
    public static void main(String[] args) {

        // best time to buy and sell stock - you are given an array where each element represents the stock price on a particular day, Find the maximum profit u can achieve by buying the stock on one day and selling it on a later day. If no profit is possible, return 0 

        // Conditions - you can buy only once, u can sell only once, buy before selling 

        int[] arr = {3, 5, 1, 7, 4, 9, 3} ; 

        int minPrice = arr[0] ; 
        int maxProfit = 0 ; 

        for(int i = 1; i < arr.length ; i++){

            minPrice = Math.min(minPrice, arr[i]) ; 

            int currentProfit = arr[i] - minPrice ; 

            maxProfit = Math.max(maxProfit, currentProfit) ; 
        }
        System.out.println("Max Profit: " + maxProfit);

    }
}
