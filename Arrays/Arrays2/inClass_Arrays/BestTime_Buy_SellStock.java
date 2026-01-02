package CodeForDSA.Arrays.Arrays2.inClass_Arrays;
import java.util.*;

public class BestTime_Buy_SellStock {

    public static int buyAndSellStock(int price[]) {
        
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++){
            
            if( buyPrice < price[i] ){ // Profit
                int profit = price[i] - buyPrice; // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Input the size of Array
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int price[] = new int[n];

        // Input the value of Array
        for(int i=0; i<price.length; i++){
            System.out.print("Enter the value of index " + i +  " = ");
            price[i] = sc.nextInt();
        }
        
        // Print the Provided Array thant in from the User
        System.out.print("Your provided Stock list is = [ ");
        for(int i=0; i<price.length; i++){
            System.out.print( price[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        // Call the functions for "Print SubArrays"
        int profit = buyAndSellStock(price);
        System.out.println("MaxProfit From Stock : " + profit);

    }
    
}
