/*************************************************************************
CCuyamaca College CS-182
File name: fileName.java
Description: Lab #6, Exercise #1, Write a program that stores data in the three objects and then display the data for each employee on the screen.
Developer: Aiden Sakat
*************************************************************************/
package ex1employee;


public class Ex1Employee {

    
    public static void main(String[] args) {
        // employee class call instance
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting","Vice president");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT","Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing","Engineer");

            // prints everything
            System.out.println("Employee #1" +  "\nName: " + employee1.getName() + "\nID Number: " + employee1.getIdNumber() + "\nDepartment: " + employee1.getDepartment() + "\nPosition: "  + employee1.getPosition());
            System.out.println("\nEmployee #2" +  "\nName: " + employee2.getName() + "\nID Number: " + employee2.getIdNumber() + "\nDepartment: " + employee2.getDepartment() + "\nPosition: "  + employee2.getPosition());
            System.out.println("\nEmployee #3" +  "\nName: " + employee3.getName() + "\nID Number: " + employee3.getIdNumber() + "\nDepartment: " + employee3.getDepartment() + "\nPosition: "  + employee3.getPosition());

    }
    
}
