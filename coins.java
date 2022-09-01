/*
 * Addison Cho
 * 8/31/2022
 * Coin Counter
 * Calculates the total of multiple coins
 */

import java.text.NumberFormat;
public class coins{
    public static void main(String args[]){
        int quarters = 1, dimes = 1, nickels = 1, pennies = 1;
        double total = (quarters*0.25 + dimes*0.1 + nickels*.05 + pennies*.01);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Total: " + money.format(total));
        
    }
    
}