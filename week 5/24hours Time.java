public class Time
{
    private String hour;
    private String minute;
    
    public Time(String time){
        this.hour = time.substring(0,2);
        this.minute = time.substring(2,4);
    }
    
    public boolean isLater(Time time2){
        if(Integer.parseInt(this.hour) > Integer.parseInt(time2.hour)){
            return true;
        }else if(Integer.parseInt(this.hour) < Integer.parseInt(time2.hour)){
            return false;
        }
        if(Integer.parseInt(this.minute) > Integer.parseInt(time2.minute)){
            return true;
        }else if(Integer.parseInt(this.minute) < Integer.parseInt(time2.minute)){
            return false;
        }
        return false;
    }
    
    public String toString(){
        return this.hour+":"+this.minute;
    }
}