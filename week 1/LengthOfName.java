import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        int length = name.length();
        System.out.println("Hello " + name +", your name has " + length + " letters." );
        
        
        // Use the length() method of the String class.
    }
}