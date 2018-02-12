// Create a Word class with one static method called showLetter
public class Word
{
    public static String showLetter(String word, char letter)
    {
        String guesses = "";
        for(int i = 0; i<word.length();i++)
        {
            String under = "_";
            guesses = guesses + under;
        }
        
        for(int i = 0; i<word.length();i++)
        {
            if(word.charAt(i) == letter)
            {
                guesses = guesses.substring(0,i) + letter + guesses.substring(i+1,guesses.length());
            }
        }
        
        return guesses;
    }
}