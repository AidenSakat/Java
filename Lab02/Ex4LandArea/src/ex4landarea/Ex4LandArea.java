/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4landarea;

/**
 *
 * @author User
 */
public class Ex4LandArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //formulas
        double squareFeet = 389767;
        double acres = squareFeet / 43560;
        //print
        System.out.print("A tract of land with " +squareFeet);
        System.out.print(" square feet has " +acres);
        System.out.println(" acres");
    }
    
}
