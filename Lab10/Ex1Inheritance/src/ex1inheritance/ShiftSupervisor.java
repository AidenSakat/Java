// ShiftSupervisor Class
package ex1inheritance;
// interface for class (not sure if I did this right?)
interface ShiftSupervisorInterface{
    double getAnnualSalary();
    void setAnnualSalary(double annualSalary);
    double getAnnualBonus();
    void setAnnualBonus(double annualBonus);
}

public class ShiftSupervisor implements ShiftSupervisorInterface {
    private double annualSalary;
    private double annualBonus;
    
    public ShiftSupervisor(double annualSalary, double annualBonus){
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    public ShiftSupervisor(){
        annualSalary = 0.0;
        annualBonus = 0.0;
    }
    
    // gets and sets annualSalary
    @Override
    public double getAnnualSalary(){
        return annualSalary;
    }
    @Override
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }    
    
    // gets and sets annualBonus
    @Override
    public double getAnnualBonus(){
        return annualBonus;
    }    
    @Override
    public void setAnnualBonus(double annualBonus){
        this.annualBonus = annualBonus;
    }
    
}
