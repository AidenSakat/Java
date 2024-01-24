/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #5, Exercise #3, rite a program that prompts the user for the following inputs:The number of rooms to be painted. For each room, the square feet of wall space
Developer: Aiden Sakat
*************************************************************************/
package ex3paintjob;

import java.util.Scanner;


public class Ex3PaintJob {

    private static Scanner scanner;
    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        // assigns all methods to a variable
        float rooms = getRooms();
        float squareFeet = getSquareFeet(rooms);
        float paintPrice = getPaintCost();
        float totalGallons = calcPaintGallons(squareFeet);
        float paintCost = calcPaintCost(totalGallons, paintPrice);
        float laborCost = calcLaborCost(squareFeet);
        displayJobCost(squareFeet, totalGallons, paintCost, laborCost);
    }
    // asks user to enter rooms without accepting value < 1
    public static float getRooms(){
        while(true){
        System.out.print("Enter the number of rooms: ");
        float rooms = scanner.nextInt();
        if (rooms < 1)
        {
            System.out.println("Please enter a value greater than or equal to 1.");
        }
        else{
        return rooms;
        }
        }
    }
    // asks user for square feet of each room then adds them together
    public static float getSquareFeet(float rooms){
        float totalSquareFeet = 0;
        for (int i = 1; i <= rooms; i++)
        {
            System.out.print("Enter the square feet for room #" + i + ": ");
            float squareFeet = scanner.nextInt();
            totalSquareFeet += squareFeet;
        }
        return totalSquareFeet;
    }
    // asks for paint cost. does not accept value < 1
    public static float getPaintCost(){
        float paintCost;
        while(true){
        System.out.print("Price per gallon of paint: ");
        paintCost = scanner.nextInt();
        if (paintCost < 1)
        {
            System.out.println("Please enter a value greater than or equal to 1.");
        }
        else{
        break;}
                
        }
        return paintCost;
        }
    
    // calculates total gallons of paint needed
        public static float calcPaintGallons(float squareFeet){
            float totalGallons = squareFeet/115;
            return totalGallons;
        }
        // calculates the total paint cost needed
        public static float calcPaintCost(float paintGallons, float paintPrice){
            float paintCost = paintGallons * paintPrice;
            return paintCost;
        }
        // calculates required labor cost
        public static float calcLaborCost(float squareFeet){
            float laborCost = (squareFeet/115) * 8 * 25;
            return laborCost;
        }
        // lists the total job costs and total items required
        public static void displayJobCost(float totalSquareFeet, float paintGallons, float paintCost, float laborCost){
            float totalJobCost = paintCost + laborCost;
            System.out.print("Total square feet: " + totalSquareFeet);
            System.out.print("\nTotal gallons of paint: " + paintGallons);
            System.out.print("\nTotal paint cost: " + paintCost);
            System.out.print("\nTotal labor cost: " + laborCost);
            System.out.print("\nTotal job cost: " + totalJobCost + "\n");
        }
    }
