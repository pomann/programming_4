import java.util.*;
public class MakeMap
{
    // No main method required.
    public static Map<String,Integer> makeMap(Scanner sc){
        Map<String,Integer> students = new HashMap<String,Integer>();
        while(sc.hasNextLine()){
            try{
                String line = sc.nextLine();
                String [] details = line.split(" ");
                students.put(details[0], Integer.parseInt(details[1]));
            }catch(Exception e){}
        }
        return students;
    }
}