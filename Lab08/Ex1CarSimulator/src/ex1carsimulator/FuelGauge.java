// FuelGauge class

package ex1carsimulator;


public class FuelGauge {
    private double fuel;
    private double gasCap;
    private double output;
    
    public FuelGauge(double fuel, double gasCap, double output){
        this.fuel = fuel;
        this.gasCap = gasCap;
        this.output = output;
    }
    
    public FuelGauge(){
        fuel = 0;
        gasCap = 15;
        output = 0;
    }
    // returns current fuel
    public double currentFuel(){
        return fuel;
    }
    // loses fuel
    public double loseFuel(){
         fuel -= 1;
         if (fuel == 1){
             System.out.println("Time to get gas!");
         }
        else if (fuel == 0){
             System.out.println("Uh oh, we just ran out!");
         }
         return fuel;
    }
    // gains fuel
     public double gainFuel(){
         fuel += 1;
         System.out.println("Gallons in: " + fuel);
         if (fuel >= gasCap){
             fuel = 15;
             System.out.println("you have fueled up your gas tank. Get to driving!");
         }
         return fuel;
    }
     // outputs gas used.
     public double gasUsed(){
         for (int i = 0; i < 1; i++) {
             output++; 
         }
         return output;
     };
}
