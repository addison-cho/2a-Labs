/*
 * Addison Cho
 * 8/31/22
 * Sphere Calculations (2.9)
 * Takes a radius of a sphere and returns its volume and surface area
 */
import java.text.DecimalFormat;

public class sphere{
   public static void main(String args[]){
       // variables
       double radius = 5, volume, sa;
       
       // rounds to two decimals (or less)
       DecimalFormat fmt = new DecimalFormat("0.##");
       
       // calculates volume and surface area
       volume = (4.0/3.0) * Math.pow(radius, 3) * Math.PI;
       sa = 4 * Math.PI * Math.pow(radius, 2);
       
       // display
       System.out.println("Radius: " + radius);
       System.out.println("Volume: " + fmt.format(volume));
       System.out.println("Surface Area: " + fmt.format(sa));
   }
}
