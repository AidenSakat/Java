//TestScores1 Class

package ex1testscores;
// InvalidTestScore class 
class InvalidTestScore extends IllegalArgumentException{
    public InvalidTestScore(String message) {
        super(message);
    }
}

public class TestScores1 {
     private double[] testScores;
    private double average;
    
    public TestScores1 (double[] testScores)throws InvalidTestScore{
        for(int i = 0; i <testScores.length; i++){
            double score = testScores[i];
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score found.\nElement: " + i + " Score: " + score);            }
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
