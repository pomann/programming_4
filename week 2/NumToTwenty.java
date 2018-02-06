import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        for(int i2 = i; i2<21; i2++)
        {
            System.out.print(i2 + " ");
        }
        System.out.println();
    }
}