import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        double cen = in.nextInt();
        System.out.print((int) cen);
        System.out.print(' ');
        System.out.print((cen * 9 / 5 + 32));
    }
}