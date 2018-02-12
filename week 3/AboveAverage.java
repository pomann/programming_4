import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double[] scores = new double[num]; 
        
        System.out.print("Enter " + num + " numbers: ");
        int sum = 0;
        double average = 0;
        double x = 0;
        // Now read in the numbers
        for(int i = 0; i<num; i++){
            double l = in.nextDouble();
            x = x + l;
            scores[i] = l;
            sum++;
        }
        average = x/sum;
        System.out.println("The above average numbers are:");
        for(int i = 0; i<scores.length; i++){
            if (scores[i]> average)
                 System.out.print(" " + scores[i]);
        }
        // Print out the numbers greater than the average
        
        // You can use the following code to print out one number
        

        System.out.println(); // Should finish with a new line
    }
}