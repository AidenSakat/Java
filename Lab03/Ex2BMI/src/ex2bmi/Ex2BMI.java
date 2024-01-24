/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #3, Exercise #2, Write a program that displays your calculated BMI.
Developer: Aiden Sakat
*************************************************************************/
package ex2bmi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex2BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        // gets weight
        System.out.print("Enter weight in pounds: ");
        float weight = scanner.nextInt();
        // gets feet
        System.out.print("Enter feet: ");
        float getFeet = scanner.nextInt();
        // converts feet into inches
        float feet = getFeet * 12;
        // gets inches
        System.out.print("Enter inches ");
        float inches = scanner.nextInt();
        
        // equation to get height in inches
        float height = (feet + inches) * (feet + inches);
        
        // equation to get BMI
        float BMI = (weight * 703) / height;
        System.out.println("BMI is " + BMI);
        
        // calculates if you are underweight, normal, or overweight
        if (BMI >= 25)
        {
            System.out.println("Overweight");
        }
        else if (BMI <= 18.5)
        {
            System.out.println("Underweight");
        }
        else
        {
            System.out.println("Normal");
        }
    }
    
}
