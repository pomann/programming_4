import java.io.File;
import java.util.Scanner;


public class ReadNames
{
    public static void main(String [] args)
    {
        try{
            if(args.length == 0){
                System.out.println("Usage: java ReadNames <filename>");
                System.exit(1);
            }
            Scanner sc = new Scanner(new File(args[0]));
            int fileMax = sc.nextInt();
            String [] content = new String[fileMax];
            
            for(int i = 0; i < fileMax; i++){
                content[content.length-1-i] = sc.next();
            }
            System.out.println(" The names in reverse order are:");
            for(int i = 0; i < fileMax; i++){
                System.out.print(content[i]+" ");
            }
            System.out.println();
        }
        catch(Exception e){
            
        }
        
    }
}