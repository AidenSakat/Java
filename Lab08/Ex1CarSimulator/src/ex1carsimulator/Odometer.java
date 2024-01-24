// Odometer class

package ex1carsimulator;


public class Odometer {
    private double mileage;
    
    public Odometer(double mileage){
        this.mileage = mileage;
    }
    
     public Odometer(){
        mileage = 0;
    }
     // displays the current miles
     public double currentMileage(){
         return mileage;
     }
     // adds 25 miles each time code is executed
     public double driven(){
         if (mileage >= 999999){
             mileage = 0;
             System.out.println("You have reached 1 million miles!!! Odometer resetting back to 0.");
         }
         mileage += 25;
         return mileage;
     }
}
