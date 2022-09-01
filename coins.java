/*
 * Addison Cho
 * 8/31/2022
 * Coin Counter
 * Calculates the total of multiple coins
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class coins{
    public static void main(String args[]){
        // variables and Scanner object
        Scanner scan = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;
        
        // requests user input for amounts of coins
        System.out.println("# of Quarters: ");
        quarters = scan.nextInt();
        
        System.out.println("# of Dimes: ");
        dimes = scan.nextInt();
        
        System.out.println("# of Nickels: ");
        nickels = scan.nextInt();
        
        System.out.println("# of Pennies: ");
        pennies = scan.nextInt();
        
        // adds up total
        double total = (quarters*0.25 + dimes*0.1 + nickels*.05 + pennies*.01);
        
        // display
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Total: " + money.format(total));
        
    }
    
}