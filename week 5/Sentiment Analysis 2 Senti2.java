import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Senti2
{
    public static void main(String [] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(args[1]));
        int countWord = 0;
        int countLine = 0;
        double totalScore = 0.00;
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            int score = Integer.parseInt(line.substring(0,1));
            line = line.substring(2,line.length());
            if(line.contains(args[0])){
                countLine++;
                totalScore = totalScore + score;
                int index = line.indexOf(args[0]);
                while (index >= 0) {
                    countWord++;
                    index = line.indexOf(args[0], index + 1);
                }
            }
        }
        
        if(countWord == 0){
            countLine = 1;
        }
        
        System.out.println(args[0] + " appears " + countWord + " times.");
        System.out.println("The average score of the reviews containing " + args[0] + " is " + String.format("%.2f", (totalScore/countLine)));
    }
}