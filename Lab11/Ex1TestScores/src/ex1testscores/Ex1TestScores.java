/*************************************************************************
Cuyamaca College CS-182
File name: Ex1TestScores.java
Description: Lab #11, Exercise #1, Write a program that gives average test scores but throws error when score is negative or over 100
Developer: Aiden Sakat
*************************************************************************/
package ex1testscores;


public class Ex1TestScores {

    
    public static void main(String[] args) {
        try {
        double[] scores = {0, 50.0, -10.0, 100};
        TestScores ts = new TestScores(scores);
     // TestScores1 ts = new TestScores1(scores);
         System.out.println("(No invalid test score so average will print)\nThe average of the good scores is " + ts.getAverage());

        } catch(IllegalArgumentException e){
        System.out.println("(Caught an invalid score so error will appear)\n" + e.getMessage());}
        }
    }
    
