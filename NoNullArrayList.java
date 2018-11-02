import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int start){
    size=start;
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Value cannot be null");
    }
    super.set();
    return super.set(i,value);
  }

  public boolean add(T value) {
   if (value == null) {
     throw new IllegalArgumentException("Value cannot be null") ;
   }
   else {
     super.add(value) ;
     return true ;
   }
   return super.add(value);
 }

 public void add(int index, T value) {
   if (value == null) {
     throw new IllegalArgumentException("Value cannot be null") ;
   }
   else {
     super.add(index, value) ;
   }
}

}
