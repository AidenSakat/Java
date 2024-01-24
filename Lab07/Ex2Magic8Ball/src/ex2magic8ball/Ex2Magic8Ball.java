/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #7, Exercise #2, Write a program that prompts the user for a question then uses a file with 8 ball answers.
Developer: Aiden Sakat
*************************************************************************/
package ex2magic8ball;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Random;

public class Ex2Magic8Ball {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String file = "C:/Labs/8_ball_responses.txt";
        
        List<String> lines = new ArrayList<>();
        
        // throws try and catch and reads the whole file to store in array
         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String[] eightBall = lines.toArray(new String[0]);
        
       Random random = new Random();
       // while loop with no exit unless user inputs no
        while(true){
            System.out.print("What is your question?: ");
            String question = scanner.nextLine();
            
            int randomIndex = random.nextInt(lines.size());
            String randomResponse = lines.get(randomIndex);
            System.out.println(randomResponse);
            
            System.out.print("Do you have another question? (yes or no): ");
            String again = scanner.nextLine();
            
            if (again.equalsIgnoreCase("No")){
                break;
            }
        }
    }
    
}
