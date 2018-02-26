import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNames
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the file name: ");
        String name = sc.next();
        
        Scanner in = new Scanner(new File(name));
        int fileMax = in.nextInt();
        String [] content = new String[fileMax];
        
        for(int i = 0; i < fileMax; i++){
            content[fileMax - 1 - i] = in.next();
        }
        System.out.println("The names in reverse order are:");
        for(int i = 0; i < fileMax; i++){
            System.out.print(content[i]+" ");
        }
        System.out.println();
        
    }
}