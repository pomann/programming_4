import java.util.Scanner;

public class OneToNum
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        for(int i1 = 1; i1 < i + 1; i1++)
        {
            System.out.print(i1 + " ");
        }
        System.out.println();
    }
}
