public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String omo)
    {
        // Reorganise the string.  Remember the '+' operator concatenates strings.
        // Needs to return the correct string.
        return (omo.substring(omo.length() - 1,omo.length())+ omo.substring(1,omo.length()-1)+omo.substring(0,1));
    }
}