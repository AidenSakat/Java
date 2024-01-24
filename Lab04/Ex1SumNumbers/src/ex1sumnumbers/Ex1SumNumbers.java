/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #4, Exercise #1, Write a program that finds the sum of integer from 1 up to 50
Developer: Aiden Sakat
*************************************************************************/
package ex1sumnumbers;
import java.util.Scanner;

public class Ex1SumNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         // while loop so user cant exit until they get good input
         while(true)
         {  
             // prompt to ask for number 
             System.out.print("Enter a positive nonzero number: ");
             int num = scanner.nextInt();

                // error code if user inputs number below 1
                  if (num < 1){           
                 System.out.println("Input Value must be 1 or more.");
                }
                  // if user inputs correct number then they will be taken here
                  else  {
                      // equation to get the sum
                     int sum = num * (1+num)/2;
                      System.out.println("The sum of all the integers from 1 through " + num + " is " + sum);
                      // break is used to exit the loop and end the application. Though you can repeat 
                      /// the application as many times you want if you remove the break or used if statement to ask if user wants to continue.
                      break;
                   }
         }
         

    }
    
}
