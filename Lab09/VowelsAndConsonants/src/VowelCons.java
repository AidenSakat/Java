// VowelCons Class
import java.util.Scanner;

public class VowelCons {
    private int vowels;
    private int consonants ;
    private String input;
    
    // constructor which accepts string as argument and changes it to lowercase
        public VowelCons(String input){
            this.input = input;
            input = input.toLowerCase();
            consonants = 0;
            vowels = 0;
        }

        // method to count vowels by adding +1 each time a vowel is shown
         public int countVowels(){
             for (int i = 0; i < input.length(); i++) {
                 if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || 
                    input.charAt(i) == 'i' || input.charAt(i) == 'o' || 
                    input.charAt(i) == 'u'){
                     vowels++;
                 }
             }
             
             return vowels;
         }
         
         // method to count Consonants by adding +1 each time a Consonants is shown (same loop as countVowels)
         public int countConsonants(){
             for (int i = 0; i < input.length(); i++) {
                 if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || 
                    input.charAt(i) == 'i' || input.charAt(i) == 'o' || 
                    input.charAt(i) == 'u' || input.charAt(i) == ' '){
                 }
                 else {
                     consonants++;
                 }
              }
                          return consonants;
    }
}
