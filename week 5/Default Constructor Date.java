public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}