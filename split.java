/*
 * Addison Cho and Kristopher Colson
 * 8/29/22
 * Split the Bill at the Resturant
 * Takes a bill and calculates the tip. Then splits the amount of money across # people.
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class split{
    public static void main(String args[]){
        // variables
        double bill, tip, total, amount;
        int people = 6;
        
        // create formatting objects
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        // takes user input
        System.out.println("Bill: ");
        bill = scan.nextDouble();
        
        System.out.println("Number of People: ");
        people = scan.nextInt();
        
        // calculates tip, total, and amount split between people
        tip = bill * .2;
        total = bill + tip;
        amount = total / people;
        
        // display
        System.out.println("Cost of bill: " + money.format(bill));
        System.out.println("Cost of tip: " + money.format(tip));
        System.out.println("Total cost: " + money.format(total));
        System.out.println("Amount each person pays: " + money.format(amount));
        
        double percentage = bill / total;
        System.out.println("\nPercentage for bill: " + percent.format(percentage));
        System.out.println("Percentage for tip: " + percent.format(1-percentage));
        
    }
    
}