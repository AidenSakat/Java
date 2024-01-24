/*************************************************************************
Cuyamaca College CS-182
File name: Ex1Inheritance.java
Description: Lab #10, Exercise #1, Write a program that includes an employee class to display info 
Developer: Aiden Sakat
*************************************************************************/
package ex1inheritance;


public class Ex1Inheritance {

    
    public static void main(String[] args) {
       // hardcoded values in class
       Employee employee1 = new Employee("John Smith", "123-A", "11-15-2005", 1, 16.5, 48000.0, 6500.0);
       Employee employee2 = new Employee("Joan Jones", "222-L", "12-12-2005", 2, 18.5, 55000.0, 8000.0);
       
       // prints worker information
        System.out.println("Here's the first production worker.");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Employee Number: " + employee1.getEmployeeNumber());
        System.out.println("Hire Date: " + employee1.getHireDate());
        System.out.println("Shift: " + employee1.getShift());
        System.out.println("Hourly Pay Rate $" + employee1.getPayRate());
        
        System.out.println("\nHere's the second production worker.");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Employee Number: " + employee2.getEmployeeNumber());
        System.out.println("Hire Date: " + employee2.getHireDate());
        System.out.println("Shift: " + employee2.getShift());
        System.out.println("Hourly Pay Rate $" + employee2.getPayRate());
        
        System.out.println("\nHere's the first shift supervisor.");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Employee Number: " + employee1.getEmployeeNumber());
        System.out.println("Hire Date: " + employee1.getHireDate());
        System.out.println("Annual Salary: $" + employee1.getAnnualSalary());
        System.out.println("Annual Bonus: $" + employee1.getAnnualBonus());
        
        System.out.println("\nHere's the second shift supervisor.");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Employee Number: " + employee2.getEmployeeNumber());
        System.out.println("Hire Date: " + employee2.getHireDate());
        System.out.println("Annual Salary: $" + employee2.getAnnualSalary());
        System.out.println("Annual Bonus: $" + employee2.getAnnualBonus());
    }
    
}
