/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #5, Exercise #1, Write a program that asks the user to enter an item’s wholesale cost and its markup percentage
Developer: Aiden Sakat
*************************************************************************/
package ex1retailprice;

import java.util.Scanner;


public class Ex1RetailPrice {

    public static void main(String[] args) 
    {
                Scanner scanner = new Scanner(System.in);
                // prompts user for inputs
                System.out.print("Enter the item's wholesale cost: ");
                float wholesalePrice = scanner.nextFloat();
                System.out.print("Enter the item's markup  percentage: ");
                float markupPercent  = scanner.nextFloat();
                calculateRetail(wholesalePrice, markupPercent);
                
    }
    // method used to calculate and print the retail price
    public static void calculateRetail(float wholesalePrice, float markupPercent){
        //  equation to achieve the retail price after markup
        float retailPrice = wholesalePrice + (wholesalePrice * (markupPercent / 100));
        System.out.println("The item's retail price is $" + retailPrice);
    } 
}
