import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int omo = 0;
        System.out.println("Enter numbers: ");
        for(int i = sc.nextInt(); i != -1; i = sc.nextInt())
        {
            omo++;
        }
        System.out.println(omo + " numbers were entered.");
    }
}