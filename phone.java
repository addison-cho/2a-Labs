/*
 * Addison Cho
 * 8/31/2022
 * Random Phone Number (2.14, 2.13 in book)
 * Generates a random phone number with certain restrictions
 */
import java.util.Random;

public class phone{
    public static void main(String args[]){
        Random generator = new Random();
        int a, b, c, d, e;
        
        a = generator.nextInt(10);
        b = generator.nextInt(10);
        c = generator.nextInt(10);
        d = (int)(Math.random() * 723);
        e = (int)(Math.random() * 9999);
        
        System.out.print("" + a + b + c + "-" + d + "-" + e);
        
    }
    
}