/*
 * Addison Cho
 * 9/2/22
 * Full Name Display
 * Asks the user for their full name and displays it
 */
import java.util.Scanner;

public class name{
    public static void main(String args[]){
        // objects and variables
        Scanner scan = new Scanner(System.in);
        String name = new String();
        int a, b;
       
        System.out.println("What is your full name? ");
        name = scan.nextLine();
       
        // index of spaces in String object: name
        a = name.indexOf(" ");
        b = name.indexOf(" ", a + 1);
        
        System.out.println("\t" + name.substring(0, a) + " " + (name.substring(a+1, b)).charAt(0) + ".");
        System.out.println("\t" + name.substring(b + 1, name.length()));
        
    }
    
}

/*
 * Input: Addison Skyler Cho
 * Output:
    Addison S.
    Cho
    
* Input: Christine Qingxin Wang
* Output: 
    Christine Q.
    Wang
 */