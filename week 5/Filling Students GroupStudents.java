import java.util.Scanner;
import java.io.File;

public class GroupStudents
{
   public static void main(String [] args)
   {
       try{
           if(args.length == 0){
               System.out.println("Please enter filename");
               System.exit(0);
           }
           
           Scanner sc = new Scanner(new File(args[0]));
           int fileMax = sc.nextInt();
           Student [] group = new Student[fileMax];
           int i = -1;
           
           while(sc.hasNextLine()){
               String line = sc.nextLine();
               if(line.length() != 0){
                   String [] lines = line.split(" ");
                   Student student = new Student(lines[0], Integer.parseInt(lines[1]));
                   group[i] = student;
               }
               i++;
           }
           Student.print(group);
       }
       catch(Exception e){
       }
   }
}