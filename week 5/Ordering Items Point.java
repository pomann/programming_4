public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    public boolean lessThan(Order other){
        Point otherPoint = (Point) other;
        if(this.x > otherPoint.x){
            return false;
        }else if(this.x < otherPoint.x){
            return true;
        }
        
        if(this.y > otherPoint.y){
            return false;
        }else if(this.y < otherPoint.y){
            return true;
        }
        return true;
    }
}