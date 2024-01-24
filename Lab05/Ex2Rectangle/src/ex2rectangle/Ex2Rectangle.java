/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #5, Exercise #2, Write a program that asks the user for length and width of rectangle then calculates area.
Developer: Aiden Sakat
*************************************************************************/
package ex2rectangle;

import java.util.Scanner;

/**
 *
 * @author User
 */

public class Ex2Rectangle {
 public static void main(String[] args) {
     // create variable per each
        float length = getLength();
        float width = getWidth();
        float area = calcArea(length, width);
        // gathers up all the variables to display the output
        displayArea(length, width, area);
        
    }
    // prompts user for length => 1 then returns it
    public static float getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = scanner.nextFloat();
        while (length <= 1){
            System.out.println("Input must be >= 1");
            System.out.print("Enter length: ");
            length = scanner.nextFloat();
            if (length >= 1) {
                break;
            }
        }
        return length;
    }
    // prompts user for width => 1 then returns it
    public static float getWidth() {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        float width = scanner.nextFloat();
        while (width <= 1){
            System.out.println("Input must be >= 1");
            System.out.print("Enter width: ");
            width = scanner.nextFloat();
            if (width >= 1) {
                break;
            }
        }
        return width;
    }
    // calculates the area by multiplying the length and width
     public static float calcArea(float length, float width) {
         float area = length * width;
         return area;
    }
     // displays length, width, and area
     public static void displayArea(float length, float width, float area) {
         System.out.println("\n\nResults:\n" + "Length = " + length + "\nWidth = " + width + "\nArea = "  + area );
    }
}
