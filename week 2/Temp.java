/*
    Create a class with a main method.
    The method should read in a Fahrenhit Temperature
    Get the equivalent in Celsius (using the fahr2cels() method
    and print out the result.
*/
import java.util.Scanner;
public class Temp{
    public static void main (String [] args){
       Scanner in = new Scanner(System.in);
       double fahr = in.nextDouble();
       double temp = Convert.fahr2cels(fahr);
       System.out.println(temp);
    }
}