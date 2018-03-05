// This class should contain a single method called max.
public class Test{
    static <TYPE> int max(Thing s, Thing n){
        if(n.value > s.value)
            return n.value;
    
        return s.value;
    }
}