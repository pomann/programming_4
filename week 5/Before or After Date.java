public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String date){
        String [] dates = date.split(" ");
        this.day = Integer.parseInt(dates[0]);
        this.month = Integer.parseInt(dates[1]);
        this.year = Integer.parseInt(dates[2]);
    }
    
    public boolean isOnOrAfter(Date date2){
        if(this.year > date2.year){
            return true;
        }else if(this.year < date2.year){
            return false;
        }
        if(this.month > date2.month){
            return true;
        }else if(this.month < date2.month){
            return false;
        }
        if(this.day > date2.day){
            return true;
        }else if(this.day < date2.day){
            return false;
        }
        
        return true;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Create a boolean method which will check to sae that the date is on or after the date that is passed as a parameter.
}