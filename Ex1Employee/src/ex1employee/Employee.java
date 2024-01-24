// Employee Class

package ex1employee;


public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    // constructor that assigns to variable
        public Employee(String n, int iN, String d, String p){
            name = n;
            idNumber = iN;
            department = d;
            position = p;
    }
        // constructor that assigns to empty value
        public Employee() {
            name = "";
            idNumber = 0;
            department = "";
            position = "";
    }
    // setter and getter for name
       public void setName(String n){
            name = n;
        }
       public String getName(){
            return name;
        }
        // setter and getter for id number
       public void setIdNumber(int iN){
            idNumber = iN;
        }
       public int getIdNumber(){
            return idNumber;
        }
        // setter and getter for department
       public void setDepartment(String d){
            department = d;
        }
       public String getDepartment(){
            return department;
        }
        // setter and getter for position
       public void setPosition(String p){
            position = p;
        }
       public String getPosition(){
            return position;
        }
}
