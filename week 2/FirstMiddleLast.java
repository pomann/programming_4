import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String omo = sc.next();
        System.out.println(omo.substring(0,1));
        System.out.println(omo.substring(1,omo.length() - 1));
        System.out.println(omo.substring(omo.length() - 1,omo.length()));
    }
}