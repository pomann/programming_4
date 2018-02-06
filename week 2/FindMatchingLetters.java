/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be difficult to get this correct if you do not use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        // Read in the two lines
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        // INSERT YOUR CODE HERE
        // it should work out what the number of matching characters is
        for(int i = 1; i < line1.length() + 1; i++)
        {
            if(line1.substring(i-1,i).equals(line2.substring(i-1,i)))
                numMatching++;
        }
        // Print out the solution
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}