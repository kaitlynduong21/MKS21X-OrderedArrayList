public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T newVal) {
    return 
  }

  public void sortList(T newVal){
    for (int i = 0; i < size() + 1; i++) {
      if (newVal.compareTo(this.get(i)) <= 0) {
        super.add(i, newVal);
        return this.get(i) == newVal;
      }
    }
  }

}
