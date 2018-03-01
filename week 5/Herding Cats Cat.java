// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
    
    public boolean lessThan(Order order){
        Cat cat = (Cat) order;
        if(this.name.length() >= cat.name.length()){
            return false;
        }else{
            
            return true;
        }
        
    }
}