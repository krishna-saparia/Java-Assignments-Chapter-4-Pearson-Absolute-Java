import java.util.Scanner;

public class TemperatureTest {
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("----------------Celsius To Fahrenheit------------------");
        Temperature t1 = new Temperature();
        t1.setTempValue(3.00);
        t1.setScale('C');

        System.out.println(t1.toString());

        t1.setTempvalueAndScale(33.0,'C');
        System.out.println(t1.toString());
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("----------------Fahrenheit To Celsius------------------");
        Temperature t2 = new Temperature();
        t2.setTempValue(-32.0);
        t2.setScale('F');

        System.out.println(t2.toString());

        t2.setTempvalueAndScale(31,'F');
        System.out.println(t2.toString());

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("----------------Comparisions------------------");
        System.out.println("Compared : Obj1(t1) < Obj2(t2) --> " +t1.lessThan(t2));
        System.out.println("Compared : Obj1(t1) > Obj2(t2) --> " +t1.greaterThan(t2));
        System.out.println("Compared : Obj1(t1) = Obj2(t2) --> " +t1.equals(t2));
    }
}
