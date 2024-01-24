// RainFall class

package ex1rainfall;


public class RainFall {
   private double[] rain;
   private double totalRain;
   private double averageRain;
   private double leastRain;
   private double mostRain;
   
        public RainFall(double[] r, double tR, double aR, double lR, double mR){
         rain = r;
         totalRain = tR;
         averageRain = aR;
         leastRain = lR;
         mostRain = mR;
        }
        
        public RainFall(){
            
             rain = new double[12];
        for (int i = 0; i < rain.length; i++) {
            rain[i] = 0.0;
        }
            totalRain = 0.0;
            averageRain = 0.0;
            leastRain = 0.0;
            mostRain = 0.0;
        }
        
        // sets rainfall from main method
       public void setRainFall(double[] rainFall){
           rain = rainFall;
       }
       // gets total rain by adding whole array
       public double getTotalRainfall(){
           for (int i = 0; i < rain.length; i++) {
               totalRain += rain[i];
           }
           return totalRain;
       } 
       // gets average rainfall by dividing total by 12
       public double getAverageRainfall(){
           averageRain = totalRain / rain.length;
           return averageRain;
       }
       // gets highest rain month
       public double getMostRain(){
           double max = rain[0];
           for (int i = 1; i < rain.length; i++) {
               if(rain[i] > max){
                   max = rain[i];
               }
           }
           return max;
       }
       // gets least rain month
       public double getLeastRain(){
            double least = rain[0];
           for (int i = 1; i < rain.length; i++) {
               if(rain[i] < least){
                   least = rain[i];
               }
           }
           return least;
       }
}
