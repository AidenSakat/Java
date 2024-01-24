/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #6, Exercise #2, Write a program that creates a car that accelerates and stops 5 times 
Developer: Aiden Sakat
*************************************************************************/
package ex2car;

import java.util.Scanner;


public class Ex2Car {

   private static Scanner scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        // prompts user for year model then stores it into the Car class
        System.out.print("Enter the Year Model of your vehicle: ");
        int yearModel = scanner.nextInt();
        car.setYearModel(yearModel);
        // prompts user for car make then stores it into the Car class
        scanner.nextLine();
        System.out.print("Enter the Make of your vehicle: ");
        String make = scanner.nextLine();
        car.setMake(make);
        
        // displays the current car status and speed
        System.out.println("Current status of the car:" + "\nYear Model: " + car.getYearModel() + "\nMake: " + car.getMake());
        System.out.println("Speed: " + car.getSpeed());
        
        // accelerating loop 5 times
        System.out.println("\nAccelerating...");
        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println("The speed is now " + car.getSpeed());
        }
        // braking loop 5 times
        System.out.println("\nBraking...");
        for (int i = 0; i < 5; i++) {
            car.brake();
            System.out.println("The speed is now " + car.getSpeed());
        }
    }
    
}
