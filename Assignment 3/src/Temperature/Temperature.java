import java.util.Objects;

public class Temperature {
    private double tempValue;
    private char scale;

    public Temperature(){
        tempValue = 0;
        scale = 'C';
    }

    public Temperature(double temp){
        this.tempValue = temp;
        scale = 'C';
    }

    public Temperature(char scl){
        this.scale = scl;
        tempValue = 0;
    }

    public Temperature(double temp , char scl){
        this.tempValue = temp;
        this.scale = scl;
    }

    public double getCelsiusTemp(){
        if (scale == 'C'){
            return tempValue;
        }
        else{
            double degreeC = Math.round(5.0 * (tempValue - 32.0) / 9.0);
            return degreeC;
        }
    }

    public double getFahrenheit(){
        if (scale == 'F' ){
            return tempValue;
        }
        else{

            double degreeF = Math.round(9.0 * (tempValue/5.0) + 32.0);
            return degreeF;
        }
    }

    public void setTempValue(){
        this.tempValue = tempValue;
    }

    public void setScale(){
        this.scale = scale;
    }

    public void setTempvalueAndScale(double tempValue , char scale){
        this.tempValue = tempValue;
        this.scale = scale;
    }

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
    



   // @Override
   /* public int hashCode() {
    *   return Objects.hash(tempValue, scale);
    *}
    */
}
