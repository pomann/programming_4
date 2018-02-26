public class Period
{
    // Private variables
    private String startHour;
    private String startMinute;
    private String finishHour;
    private String finishMinute;
   
   // Constructor (with two Time parameters)
   public Period(Time startTime, Time finishTime){
		String time = startTime.toString();
		String time2 = finishTime.toString();
        this.startHour = time.substring(0,2);
        this.startMinute = time.substring(3,5);
        this.finishHour = time2.substring(0,2);
        this.finishMinute = time2.substring(3,5);
    }
   
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
    public boolean overlaps(Period period2){
        if(Integer.parseInt(this.startHour) > Integer.parseInt(period2.startHour) && Integer.parseInt(this.startHour) < Integer.parseInt(period2.finishHour)){
            return true;
        }else if(Integer.parseInt(this.startHour) < Integer.parseInt(period2.startHour) || Integer.parseInt(this.startHour) > Integer.parseInt(period2.finishHour)){
            return period2.overlap(this);
        }
        if(Integer.parseInt(this.startMinute) > Integer.parseInt(period2.startMinute) && Integer.parseInt(this.startMinute) < Integer.parseInt(period2.finishMinute)){
            return true;
        }else if(Integer.parseInt(this.startMinute) < Integer.parseInt(period2.startMinute) || Integer.parseInt(this.startMinute) > Integer.parseInt(period2.finishMinute)){
            return period2.overlap(this);
        }
        
        return period2.overlap(this);
    }
    
    public boolean overlap(Period period2){
        if(Integer.parseInt(this.startHour) > Integer.parseInt(period2.startHour) && Integer.parseInt(this.startHour) < Integer.parseInt(period2.finishHour)){
            return true;
        }else if(Integer.parseInt(this.startHour) < Integer.parseInt(period2.startHour) || Integer.parseInt(this.startHour) > Integer.parseInt(period2.finishHour)){
            return false;
        }
        if(Integer.parseInt(this.startMinute) > Integer.parseInt(period2.startMinute) && Integer.parseInt(this.startMinute) < Integer.parseInt(period2.finishMinute)){
            return true;
        }else if(Integer.parseInt(this.startMinute) < Integer.parseInt(period2.startMinute) || Integer.parseInt(this.startMinute) > Integer.parseInt(period2.finishMinute)){
            return false;
        }
        
        return false;
    }
   
   // String toString() // return a String representation of the Period
   public String toString(){
       return this.startHour+":"+this.startMinute+" -> "+this.finishHour+":"+this.finishMinute;
   }
}