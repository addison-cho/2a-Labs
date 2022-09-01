/*
 * Addison Cho
 * 
 * 
 */

import java.text.NumberFormat;

public class split{
    public static void main(String args[]){
        double bill = 10, tip, total, amount;
        int people = 6;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        tip = bill * .2;
        total = bill + tip;
        amount = total / people;
        
        System.out.println("Cost of bill: " + money.format(bill));
        System.out.println("Cost of tip: " + money.format(tip));
        System.out.println("Total cost: " + money.format(total));
        System.out.println("Amount each person pays: " + money.format(amount));
        
        double percentage = bill / total;
        System.out.println("Percentage for bill: " + percent.format(percentage));
        System.out.println("Percentage for tip: " + percent.format(1-percentage));
        
    }
    
}