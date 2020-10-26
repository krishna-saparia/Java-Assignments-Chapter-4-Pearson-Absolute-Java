import java.util.Objects;

public class Temperature {
    private double tempValue;
    private char scale;
    // Create 4 Constructors.
    // A first Constructor set initial or default value
    public Temperature(){
        tempValue = 0;
        scale = 'C';
    }
    // This Constructor with parameter take argument value of tempvalue & another parameter set to default
    public Temperature(double temp){
        this.tempValue = temp;
        scale = 'C';
    }
    // This Constructor take argument value of scale & another parameter set to default
    public Temperature(char scl){
        this.scale = scl;
        tempValue = 0;
    }
    // This constructor takes two parameters
    public Temperature(double temp , char scl){
        this.tempValue = temp;
        this.scale = scl;
    }

    // Method to get celsius temperature
    public double getCelsiusTemp(){
        if (scale == 'C'){
            return tempValue;
        }
        else{
            double degreeC = Math.round(5.0 * (tempValue - 32.0) / 9.0);
            return degreeC;
        }
    }

    // Method to get fahrenheit temperature
    public double getFahrenheit(){
        if (scale == 'F' ){
            return tempValue;
        }
        else{

            double degreeF = Math.round(9.0 * (tempValue/5.0) + 32.0);
            return degreeF;
        }
    }

    //Methods to set values
    public void setTempValue(double tempValue1){
        this.tempValue = tempValue1;
    }

    public void setScale(char scale1){
        this.scale = scale1;
    }

    public void setTempvalueAndScale(double tempValue1 , char scale1){
        this.tempValue = tempValue1;
        this.scale = scale1;
    }

    //Equals method to compare different object's temperature value
    @Override
    public boolean equals(Object o) {
        if(o instanceof Temperature){
            Temperature t1 = (Temperature) o;
            return getCelsiusTemp() == t1.getCelsiusTemp();
        }
        return false;
    }

    public boolean lessThan(Object o) {
        if(o instanceof Temperature){
            Temperature t1 = (Temperature) o;
            return getCelsiusTemp() > t1.getCelsiusTemp();
        }
        return false;
    }

    public boolean greaterThan(Object o) {
        if(o instanceof Temperature){
            Temperature t1 = (Temperature) o;
            return getCelsiusTemp() < t1.getCelsiusTemp();
        }
        return false;
    }

    //This method converts into string
    @Override
    public String toString() {

        if(scale == 'C'){
            return String.format(" %.1f degree Celsius = %.1f degree Fahrenheit" ,tempValue ,getFahrenheit());
        }
        else{
            return String.format("%.1f degree Fahrenheit = %.1f degree Celsius" , tempValue,getCelsiusTemp());
        }
    }
    // @Override
   /* public int hashCode() {
    *   return Objects.hash(tempValue, scale);
    *}
    */
}
