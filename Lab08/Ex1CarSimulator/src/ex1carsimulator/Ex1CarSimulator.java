/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #8, Exercise #1, Write a program that simulate a car’s fuel gauge and odometer.
Developer: Aiden Sakat
*************************************************************************/

package ex1carsimulator;

import java.util.Scanner;


public class Ex1CarSimulator {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuelGauge fg = new FuelGauge();
        Odometer om = new Odometer();
        
        // while loop so user can exit when they want
        while(true){
            // fills up gas when its at 0
        if(fg.currentFuel() == 0){
        System.out.println("Filling up gas.");
        for (int i = 0; i < 15; i++) {
            fg.gainFuel();
           }
         }
        
            double fuel = fg.currentFuel();
            //  drives the vehicle while using up the fuel
        System.out.println("Miles Driven        Gas Used        Gas Remaining");
        for (int i = 0; i < fuel; i++) {
            System.out.println(om.driven()+ "              " + fg.gasUsed() + "                " + fg.loseFuel());
        }
            // asks user if they want to continue to refuel and keep driving or to exity
            System.out.print("\nDo you want to refuel and keep going?(y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N")){
                System.out.println("Have a good day!");
                break;
            }
      }
    }
    
}
