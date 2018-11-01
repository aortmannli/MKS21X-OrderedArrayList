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
  }

}
