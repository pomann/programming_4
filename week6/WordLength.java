import java.util.*;

public class WordLength
{
    public static void main(String [] args)
    {
        Map<Integer,Integer> len = new HashMap<Integer,Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] details = line.split(" ");
            for(String s : details){
                if(!len.containsKey(s.length()) && s.length() != 0){
                    len.put(s.length(),1);
                }else if(s.length() != 0){
                    int n = len.get(s.length());
                    len.put(s.length(),n+1);
                }
            }
        }
        
        List<Integer> key = new ArrayList<Integer>(len.keySet());
        
        Collections.sort(key);
        
        for(int n : key){
            System.out.println(n + ": " + len.get(n));
        }
    }
}