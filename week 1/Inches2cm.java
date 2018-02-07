import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        final double INCH = 2.54;
        System.out.println("Please enter a quantity in inches: ");
        int n = in.nextInt();
        System.out.println(n + " is " + (n * INCH) + " inch");
        // Find out how many inches (use a whole number for integers)

        // Print out the result
    }
}