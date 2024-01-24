
/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #3, Exercise #1, Write a program that displays roman numerals 1-10
Developer: Aiden Sakat
*************************************************************************/

package ex1romannumerals;
import java.util.Scanner;
/**
 *
 * @author User
 */
import java.util.Scanner;
public class Ex1RomanNumerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number in the range of 1 - 10: ");
                int number = scanner.nextInt();
                String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                if (1 <= number && number <= 10){         
                    System.out.println("The Roman numeral is " + romanNumerals[number - 1]);
                }
                else{
                    System.out.println("The number must be between 1 and 10.");
                }
    }
    
}
