/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #6, Exercise #3, Write a program that converts a fahrenheit temperature input to celsius and kelvin 
Developer: Aiden Sakat
*************************************************************************/
package ex3temperature;

import java.util.Scanner;


public class Ex3Temperature {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompts user for fahrenheit
        System.out.print("Enter the Fahrenheit temperature: ");
        double fahrenheit = scanner.nextDouble();
        // sets temperature
        Temperature temperature = new Temperature();
        temperature.setFahrenheit(fahrenheit);
        // output with converted outputs
        System.out.println("Celsius: " + temperature.getCelsius());
        System.out.println("Kelvin: " +temperature.getKelvin());
    }
    
}
