/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #4, Exercise #3, Write a program that creates an HYML file with users input.
Developer: Aiden Sakat
*************************************************************************/
package ex3webpage;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Ex3WebPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // creates HTML file in my desired folder.
        PrintWriter pw = new PrintWriter("C:\\Labs\\My_Page.html");
        Scanner scanner = new Scanner(System.in);
        // file format...
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>My Personal Web Page </title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<center>");
        //asks user for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        pw.println("<h1>" + name + "</h1>");
        
        pw.println("</center>");
        pw.println("<hr />");
        // asks user for description
        System.out.print("Describe yourself: ");
        String desc = scanner.nextLine();
        pw.print(desc);
        
        pw.println("<hr />");
        pw.println("</body>");
        pw.println("</html");
        System.out.println("File write complete.");
        pw.close();
        
    }
    
}
