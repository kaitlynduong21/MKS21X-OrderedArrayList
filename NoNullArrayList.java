import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T newVal) {
    if (newVal == null) {
      throw new IllegalArgumentException("cannot add null");
    }
    return super.add(newVal);
  }

  public T set(int index, T newVal){
    if (newVal == null) {
      throw new IllegalArgumentException("cannot set null");
    }
    T oldVal = this.get(index);
    super.set(index, newVal);
    return oldVal;
 }
}
