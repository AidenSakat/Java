/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3tips;

/**
 *
 * @author User
 */
public class Ex3Tips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        double mealPrice = 30;
                double gratuityPercentage = mealPrice * .15;
                double total = mealPrice + gratuityPercentage;
                // outputs
                System.out.print("The gratuity is $" +gratuityPercentage);
                System.out.print(" total is $" +total);
    }
    
}
