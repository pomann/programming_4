// Create a Word class with a static method called allDone
public class Word
{
    public static boolean containsLetter(String word, char letter)
    {
        for(int i = 0; i<word.length();i++)
        {
            if(word.charAt(i) == letter)
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean allDone(String word, String guesses)
    {
        for(int i = 0; i < word.length();i++)
        {
            boolean m = containsLetter(guesses, word.charAt(i));
            if(m == false)
                return false;
        }
        return true;
    }
}