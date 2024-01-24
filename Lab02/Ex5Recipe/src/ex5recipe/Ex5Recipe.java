/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5recipe;
// Scanner import for user input
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ex5Recipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // asks user for input
        System.out.print("Enter the number of cookies: ");
        int cookies = scanner.nextInt();
        System.out.println("To make " +cookies+ ", cookies you will need:");
        // ingredients divided by 48 because recipe list is for 48 cookies
        double sugar = 1.5/48;
        double butter = 1.0/48;
        double flour = 2.75/48;
        // gets total ingredients needed by multiplying users desired amount of cookies to ingredints per 1 cookie.
        double tSugar = sugar * cookies;
        double tFlour = flour * cookies;
        double tButter = butter * cookies;
        // prints everything
        System.out.println(+tSugar+ " cups of sugar\n"+tButter+ " cups of butter\n" +tFlour+ " cups of flour");
    }
    
}
