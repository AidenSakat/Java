// Employee Class

package ex1inheritance;


public class Employee extends ProductionWorker implements ShiftSupervisorInterface {
    private String name;
    private String employeeNumber;
    private String hireDate;
    private double annualSalary;
    private double annualBonus;
    
    public Employee(String name, String employeeNumber, String hireDate, int shift, double payRate, double annualSalary, double annualBonus){
        super(shift, payRate);
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }
    
    public Employee(){
        name = "";
        employeeNumber = "";
        hireDate = "";
    }
    // setter and getter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // setter and  getter for employee number
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    // setter and getter for hire date
    public String getHireDate(){
        return hireDate;
    }
    public void setHireDate(String hireDate){
        this.hireDate =  hireDate;
    }

    @Override
    public double getAnnualSalary(){
        return annualSalary;
    }
    @Override
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }    
    
    @Override
    public double getAnnualBonus(){
        return annualBonus;
    }    
    @Override
    public void setAnnualBonus(double annualBonus){
        this.annualBonus = annualBonus;
    }
}
