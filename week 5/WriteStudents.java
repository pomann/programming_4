import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class WriteStudents
{
   public static void main(String [] args)
   {
        try{
            PrintWriter outFile = new PrintWriter(args[1]);
            Scanner sc = new Scanner(new File(args[0]));
            int i = 0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(i == 0){
                    outFile.println(line);
                    i++;
                    continue;
                }
                String [] lines = line.split(" ");
                outFile.println(lines[0] + " " + (Integer.parseInt(lines[1]) + 1));
           }
           sc.close();
           outFile.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

   }
}