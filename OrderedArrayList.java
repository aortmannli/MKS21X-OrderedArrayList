public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int start){
    super(start);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Value cannot be null");
    }
    T oldboi = this.get(index);
    super.remove(index);
    add(value);
    return oldboi;
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Value cannot be null") ;
    }
    for(int i = 0; i < size(); i++){
      if(value.compareTo(this.get(i)) <= 0){
         super.add(i, value);
         return true ;
      }
    }
    super.add(0,value);
    return true;
   }


    public void add(int index, T value) {
      this.add(value);
    }
}
