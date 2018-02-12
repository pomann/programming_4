import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read in the numbers
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        int [] numbers = new int[num];
        System.out.print("Enter " + num + " numbers: ");
        for(int i = 0; i < num; i++)
            numbers[i] = in.nextInt();
        // reverse the numbers
        System.out.print("The numbers reversed are:");
        for(int i = numbers.length - 1; i >= 0; i--)
            System.out.print(" " + numbers[i]);
            
        System.out.println();
        // print them out
        
        // Use System.out.print(" " + num[i]); and finish with a newline.
    }
}