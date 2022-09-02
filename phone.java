/*
 * Addison Cho
 * 8/31/2022
 * Random Phone Number (2.14, 2.13 in book)
 * Generates a random phone number with certain restrictions
 */
import java.util.Random;
import java.text.DecimalFormat;

public class phone{
    public static void main(String args[]){
        // objects (format and random generator)
        Random generator = new Random();
        DecimalFormat fmt3 = new DecimalFormat("000");
        DecimalFormat fmt4 = new DecimalFormat("0000");
        
        // variables
        int a, b, c, d, e;
        
        // randomly generates the numbers in the phone number
        a = generator.nextInt(8);
        b = generator.nextInt(8);
        c = generator.nextInt(8);
        d = (int)(Math.random() * 723);
        e = (int)(Math.random() * 9999);
        
        // display
        System.out.print("Your phone number is: " + a + b + c + "-" + fmt3.format(d) + "-" + fmt4.format(e));
        
    }
    
}

/*
 * Outputs:
 * 730-342-6869
 * 532-088-7629
 */