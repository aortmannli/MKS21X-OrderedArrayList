public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int start){
    size=start;
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Value cannot be null");
    }
    super.remove(index);
    add(value);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Value cannot be null") ;
    }
    for(int i = 0; i < ; i++){
      if(value.compareTo(this.get(i)) > 0){
         super.add(value);
         return true ;
      }
    }
    super.add(0,value);
   }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Value cannot be null") ;
    }
    super.add(index, value);
  }
}
