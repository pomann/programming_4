import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String date1){
        try{
            String [] dates = date1.split(" ");
            this.day = Integer.parseInt(dates[0]);
            this.month = Integer.parseInt(dates[1]);
            this.year = Integer.parseInt(dates[2]);
        }catch(Exception e){
            this.day = 0;
            this.month = 0;
            this.year = 0;
        }
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Insert the isAfter method here.
    
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        Date latest = new Date("0 0 0");
        String line;
        while(in.hasNextLine())
        {
           line = in.nextLine();
           Date date2 = new Date(line);
              // Do what you want with the date.
            if(latest.year > date2.year){
                continue;
            }else if(latest.year < date2.year){
                latest = date2;
            }
            if(latest.month > date2.month){
                continue;
            }else if(latest.month < date2.month){
                latest = date2;
            }
            if(latest.day > date2.day){
                continue;
            }else if(latest.day < date2.day){
                latest = date2;
            }

        }
        System.out.println(latest.toString()); // Print the latest date
    }
}
