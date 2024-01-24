/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #4, Exercise #2, Write a program that calculates the total miles driven per hour.
Developer: Aiden Sakat
*************************************************************************/
package ex2distance;
import java.util.Scanner;

public class Ex2Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the vehicle's speed: ");
         // while to keep everything in a loop
         while (true){
             int speed = scanner.nextInt();
             // if speed is greater than 1 the program proceeds
             if (speed > 1)
             {
                 System.out.print("Enter the number of hours the vehicle was in motion: ");
                 // another while loop to get hours and then calculate into distance traveled (kind of messy)
                 while(true){
                 int hours = scanner.nextInt();
                 if (hours > 1){
                     System.out.println("Hour           Distance Traveled");
                     System.out.println("--------------------------------");
                     // for loop that calculates from 0 - however many hours user desires and calculates into distance
                     for (int i = 0; i <= hours; i++){
                         float distance = i * speed;
                         System.out.println(i + "                     " + distance);
                     }
                     // not sure why but the break wasn't working so I couldn't close the program
                     break;
                 }
                 
                  // error when you enter hours below 1
                 else { 
                     System.out.print("Invalid hours. Enter 1 or greater for hours: ");
                      }
                 }
}
             // error when you enter speed below 1
             else{
                 System.out.print("Invalid speed. Enter 1 or greater for speed: ");
             }
         }
    }  
}
