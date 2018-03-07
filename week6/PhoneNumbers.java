import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PhoneNumbers
{
    public static void main(String [] args)
    {
        Map<String, Integer> contacts = new HashMap<String, Integer>();
        System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while(!line.equals("!!")){
            String [] details = line.split(" ");
            if(details[1].length() == 1){
                if(contacts.get(details[0]) != null){
                    System.out.println(details[0] + " has number " + contacts.get(details[0]));
                }else{
                    System.out.println("Sorry, there is no " + details[0]);
                }
            }else{
                contacts.put(details[0],Integer.parseInt(details[1]));
            }
            line = sc.nextLine();
        }
        System.out.println("Bye");
    }
}