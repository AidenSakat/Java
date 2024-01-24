/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2cylinder;

/**
 *
 * @author User
 */
public class Ex2Cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // list of variables
        double radius = 4;
                double length = 6;
                double pi = 3.14159;
                // functions to find area and volume
double area = radius * radius * pi;
double volume = area * length; 
        // prints the area and volume  
        System.out.println("The area is " +area);
        System.out.println("The volume of the cylinder is " +volume);
        }
    
}
