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
        if(Math.abs(this.x) + Math.abs(this.y) > Math.abs(otherPoint.x) + Math.abs(otherPoint.y)){
            return false;
        }else{
            return true;
        }
    }
}