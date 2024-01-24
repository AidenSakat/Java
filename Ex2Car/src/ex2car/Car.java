// Car Class

package ex2car;


public class Car {
    
    private int yearModel;
    private String make;
    private int speed;
    
        // constructor sets variables
        public Car(int yM, String m, int s){
            yearModel = yM;
            make = m;
            speed = s;
        }
        // constructor 2 to set to empty values
        public Car(){
            yearModel = 0;
            make = "";
            speed = 0;
        }
        // accelerate class which adds +5 to speed everytime its called
        public int accelerate(){
            speed +=5;
            return speed;
        }
        // braking class which subtracts -5 from speed everytime its called
        public int brake(){
            speed -= 5;
            return speed;
        }
        // returns speed
        public int getSpeed(){
            return speed;
        }
        // gets year model
        public void setYearModel(int yM){
            yearModel = yM;
        }
        // returns year model
        public int getYearModel(){
            return yearModel;
        }
        // gets make
        public void setMake(String m){
            make = m;
        }
        // returns male
        public String getMake(){
            return make;
        }
        
        
}
