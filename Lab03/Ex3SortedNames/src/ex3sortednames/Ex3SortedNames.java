/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #3, Exercise #3, Write a program that sorts names in order.
Developer: Aiden Sakat
*************************************************************************/

package ex3sortednames;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ex3SortedNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // array to store names in
      String[] names = new String[3];
        System.out.print("Enter the first name: ");
        // sends name directly to array
             names[0] = scanner.nextLine();
             
        System.out.print("Enter the second name: ");
             names[1] = scanner.nextLine();
             
        System.out.print("Enter the third name: ");
             names[2] = scanner.nextLine();
             // name sorter
       Arrays.sort(names);
       // displays the names in order
 for (String name : names) {
            System.out.println(name);
        }
   }
    
}
