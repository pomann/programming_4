// You may assume that the input will be two integers and that they will not be equal.
import java.util.Scanner;

public class Bigger
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if(a > b){
            System.out.println(a + " is the biggest.");
        }else{
            System.out.println(b + " is the biggest.");
        }
    }
}