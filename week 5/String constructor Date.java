public class Date
{
    private String day;
    private String month;
    private String year;
    
    public Date(String date){
        String [] dates = date.split(" ");
        this.day = dates[0];
        this.month = dates[1];
        this.year = dates[2];
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}