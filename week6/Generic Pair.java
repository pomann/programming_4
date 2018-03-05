import java.util.Map;
import java.util.HashMap;

public class Pair<T,V>{
    
    Map<T,V> set = new HashMap<T,V>();
    
    public Pair(T p1, V p2){
        this.set.put(p1,p2);
    }
    
    public String toString(){
        return this.set.keySet().toArray()[0] + " " + this.set.get(this.set.keySet().toArray()[0]);
    }
}