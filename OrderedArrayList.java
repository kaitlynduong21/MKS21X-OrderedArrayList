public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

/* Override both add methods -> find the correct index where the new element should be added,
                                 then add() the new element into that position
                                 (hint: 1.compareTo 2.helper method)

    Override set(index,value) -> remove() the element at index, then add() the new value.

    Only have 2 constructors:  default + startingCapacity.
*/

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T newVal) {
    int index = findIndex(newVal);
    super.add(index, newVal);
    return this.get(index) == newVal;
  }

  public void add(int index, T newVal) {
    int index1 = findIndex(newVal);
    super.add(index1, newVal);
  }

  public int findIndex(T newVal){
    for (int i = 0; i < size() + 1; i++) {
      if (newVal.compareTo(this.get(i)) <= 0) {
          return i;
      }
    }
    return size();
  }

}
