/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #7, Exercise #1, Write a program that prompts the user for 12 months of rainfall data and then display the average rainfall for 12 months
Developer: Aiden Sakat
*************************************************************************/
package ex1rainfall;

import java.util.Scanner;


public class Ex1Rainfall {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // string with months
       String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
       
        RainFall rF = new RainFall();
        
        double[] rainFall = new double[12];
        // for loop and has do while loop inside for invalid input
        for (int i = 0; i < months.length; i++) {
            boolean validInput = false;
            do {
            System.out.print("Enter rainfall for month " + months[i] + ": ");
            rainFall[i] = scanner.nextDouble();
            if (rainFall[i] < 0) {
                System.out.println("Rainfall amount must be >= 0 ");
            }
            else{
                validInput = true;
            rF.setRainFall(rainFall);
            }
           }while(!validInput);
        }
        // output
        System.out.println("The total rainfall for this year is " + rF.getTotalRainfall());
        System.out.println("The average rainfall for this year is " + rF.getAverageRainfall());
        System.out.println("The month with the highest amount of rain is " + rF.getMostRain());
        System.out.println("The month with the least amount of rain is " + rF.getLeastRain());

    }
    
}
