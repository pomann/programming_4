/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        
        // YOUR CODE HERE
        for(int i = 2; i < word.length() + 1; i++)
        {
            String omo = "hi";
            if(omo.equals(word.substring(i-2,i)))
                System.out.println(omo);
        }
    }
}