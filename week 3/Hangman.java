// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);

        // Now you have the word ... encourage the user to guess.

        
        String guesses = "";
        for(int i = 0; i<word.length();i++)
        {
            String under = "_";
            guesses = guesses + under;
        }
        System.out.println("The word is");
        System.out.println(guesses);
        System.out.println("Guess a letter:");
        String letter = in.next();
        while(!guesses.equals(word))
        {
            for(int i = 0; i<word.length();i++)
            {
                if(word.charAt(i) == letter.charAt(0))
                {
                    guesses = guesses.substring(0,i) + letter + guesses.substring(i+1,guesses.length());
                }
            }
            System.out.println(guesses);
            if(guesses.equals(word))
                break;
            System.out.println("Guess a letter:");
            letter = in.next();
        }
        System.out.println("Well Done, the word was "+ word + ".");
    }
}