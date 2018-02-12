import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");
        double sum= 0.0;
        // Read in the numbers (note that they could be floating point)
        for(int i = 0; i < num; i++){
         sum = sum + in.nextDouble();
        }
        // and calculate the average (or calculate the average as you read the numbers => no need for an array)
        double y = num;
        System.out.println("The average is " + sum / y);
    }
}