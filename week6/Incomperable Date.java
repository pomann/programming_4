// Make the Date class implement the comparable interface
public class Date implements Comparable<Date>
{
   private int day, month, year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public int compareTo(Date date){
       if(this.year > date.year){
           return 1;
       }else if(this.year < date.year){
           return -1;
       }
       if(this.month > date.month){
           return 1;
       }else if(this.month < date.month){
           return -1;
       }
       if(this.day > date.day){
           return 1;
       }else if(this.day < date.day){
           return -1;
       }
       return 0;
   }

   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
}