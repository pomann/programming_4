@SuppressWarnings("unchecked")
public class Bag<T>
{
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }
   
   public void remove(T x){
      T[] newBag = (T[])(new Object[100]);
      int numElementsNew = 0;
      for(int i = 0; i < this.numElements; i++){
          if(!x.equals(bag[i])){
              newBag[numElementsNew] = bag[i];
              numElementsNew++;
          }else{
              x = (T)"";
          }
      }
      this.bag = newBag;
      this.numElements = numElementsNew;
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i=0; i<numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }

   public int length()
   {
      return numElements;
   }
}