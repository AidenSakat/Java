// TestScores class
package ex1testscores;


public class TestScores {
    private double[] testScores;
    private double average;
    
    public TestScores(double[] testScores)throws IllegalArgumentException{
        for(int i = 0; i <testScores.length; i++){
            double score = testScores[i];
            // throws exception if score is below 0 or above 100
            if(score < 0 || score > 100){
                throw new IllegalArgumentException("Invalid score found.\nElement: " + i + " Score: " + score);
            }
        }
        
        this.testScores = testScores;
    }
    // method to get the average in array
    public double getAverage(){
        double sum = 0;
        
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        average = sum / testScores.length;
        return average;
    }
    
}
