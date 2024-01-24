// ProductionWorker Class

package ex1inheritance;


public class ProductionWorker {
    private int shift;
    private double payRate;
    
    public ProductionWorker(int shift, double payRate){
        this.shift = shift;
        this.payRate = payRate;
    }
    
    public ProductionWorker(){
        shift = 0;
        payRate = 0.0;
    }
    // setter and getter for shift. When user inputs 1 then will output day or else it will output night
    public String getShift(){
        return (shift == 1) ? "Day" : "Night";
    } 
    public void setShift(int shift){   
        this.shift = shift;
    }
    // setter and getter for payrate
    public double getPayRate(){
        return payRate;
    }
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
}
