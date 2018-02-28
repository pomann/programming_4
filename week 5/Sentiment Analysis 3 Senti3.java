import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti3
{
    public static String score(String fileName, String s) throws FileNotFoundException{
        Scanner in = new Scanner(new File(fileName));
        double totalScore = 0.00;
        int countLines = 0;
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            int score = Integer.parseInt(line.substring(0,1));
            String [] review = line.substring(2,line.length()).split(" ");
            
            if(contains(review, s)){
                countLines ++;
                totalScore = totalScore + score;
            }
        }
        in.close();
        return String.format("%.2f", (totalScore/countLines));
    }
    
    public static boolean contains(String [] sa, String s){
        for(int i = 0; i < sa.length; i++){
            if(sa[i].equals(s)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(args[0]));
        while(sc.hasNext()){
            String word = sc.next();
            String score = score(args[1], word);
            System.out.println("The score of " + word + " is " + score + ".");
        }
    }
}