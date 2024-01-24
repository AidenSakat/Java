// Temperature Class

package ex3temperature;


public class Temperature {
    private double fahrenheit;
    private double celsius;
    private double kelvin;
    // sets values
    public Temperature(double f, double c, double k){
        fahrenheit = f;
        celsius = c;
        kelvin = k;
    }
    // sets to 0
    public Temperature(){
        fahrenheit = 0.0;
        celsius = 0.0;
        kelvin = 0.0;
    }
    // sets fahrenheit
    public void setFahrenheit(double f){
        fahrenheit = f;
    }
    // returns fahrenheit
    public double getFahrenheit(){
        return fahrenheit;
    }
    // convert fahrenheit to celsius then returns celsius
    public double getCelsius(){
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
    // converts fahrenheit to kelvin then returns kelvin
    public double getKelvin(){
        kelvin = (fahrenheit - 32) * 5/9 + 273;
        return kelvin;
    }
}
