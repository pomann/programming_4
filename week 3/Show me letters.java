// Create a Word class with one static method called showLetters
public class Word
{
    public static String showLetters(String word, String letter)
    {
        String guesses = "";
        for(int i = 0; i<word.length();i++)
        {
            String under = "_";
            guesses = guesses + under;
        }
        
        for(int l = 0; l<letter.length();l++)
        {
            for(int i = 0; i<word.length();i++)
            {
                if(word.charAt(i) == letter.charAt(l))
                {
                    guesses = guesses.substring(0,i) + letter.charAt(l) + guesses.substring(i+1,guesses.length());
                }
            }
        }
        return guesses;
    }
}