import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) throws FileNotFoundException
    {
        int count = 0;
        Scanner sc = new Scanner(new File(args[1]));
        String wholefile = "";
        String line;
        
        while(sc.hasNext()){
            line = sc.next();
            wholefile = wholefile + line;
        }
        
        int index = wholefile.indexOf(args[0]);
        while (index >= 0) {
            count++;
            index = wholefile.indexOf(args[0], index + 1);
        }

        System.out.println(args[0]+" appears "+count+" times.");
    }
}