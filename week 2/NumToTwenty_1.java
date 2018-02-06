import java.util.Scanner;
public class NumToTwenty
{
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int x = i;
    System.out.print("Enter a number: ");
    while(x <= 20){
        System.out.print(x + " ");
        x++;
        }
    System.out.println();}
}