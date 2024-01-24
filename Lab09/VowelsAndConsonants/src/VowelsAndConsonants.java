/*************************************************************************
Cuyamaca College CS-182
File name: fileName.java
Description: Lab #8, Exercise #1, Write a program that prompts the user for a string then lists the amount of vowels and/or constants.
Developer: Aiden Sakat
*************************************************************************/


import java.util.Scanner;



public class VowelsAndConsonants {

   
    public static void main(String[] args) {
        // prompts user for string
                Scanner scanner = new Scanner(System.in);        
                    System.out.print("(prompt for string) Enter a string: ");
                    String input = scanner.nextLine();
                    
                while(true){
                    // each time user inputs string it goes through constructor
                    VowelCons vc = new VowelCons(input);
                    int vowels = vc.countVowels();
                    int consonants = vc.countConsonants();
                
                    // options
                    System.out.println("\nMenu:");
                    System.out.println("a) Count the number of vowels in the string.");
                    System.out.println("b) Count the number of consonants in the string.");
                    System.out.println("c) Count both the vowels and consonants in the string.");
                    System.out.println("d) Enter another string.");
                    System.out.println("e) Exit the program.");
                    
                    String choice = scanner.nextLine();
                    
                    
                    if(choice.equalsIgnoreCase("a")){  
                        System.out.println("Now displaying Vowels with countVowels()");
                        System.out.println("Number of Vowels: " + vowels);
                    }
                    
                    else if(choice.equalsIgnoreCase("b")){
                        System.out.println("Now displaying consonants with countConsonants()");
                        System.out.println("Number of consonants: " + consonants);
                    }
                    
                    else if(choice.equalsIgnoreCase("c")){
                        System.out.println("Now displaying vowels and consonants with countConsonants() and countVowels()");
                        System.out.println("Number of Vowels: " + vowels);
                        System.out.println("Number of consonants: " + consonants);
                    }
                    
                    else if(choice.equalsIgnoreCase("d")){
                        System.out.print("(changes string that was in class constructor) Enter a string: ");
                        input = scanner.nextLine();
                    }
                    
                    else if(choice.equalsIgnoreCase("e")){
                        System.out.println("Exiting application!");
                         break;
                     }
                    
                    else{
                        System.out.print("Only enter a, b, c, d, or e: ");
                    }
                }
                

    }
    
}
