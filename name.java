/*
 * Addison Cho
 * 9/2/22
 * Full Name Display
 * Asks the user for their full name and displays it
 */

import java.util.Scanner;
public class name{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String first = new String();
        String middle = new String();
        String last = new String();

        System.out.println("What is your full name? ");
        first = scan.next();
        middle = scan.next();
        last = scan.next();
        
        System.out.println("\t" + first + " " + middle.charAt(0) + ".");
        System.out.println("\t" + last);
        
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