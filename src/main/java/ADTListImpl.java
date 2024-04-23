import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the ADTList interface and contains the linked list methods
 */


public class ADTListImpl <T> implements ADTList<T> {
  private INode<T> head;

  // Constructors
  public ADTListImpl() {
    this.head = new EmptyNode<>();
  }

  public ADTListImpl(T t) {
    this.head = new ContentNode<>(t, new EmptyNode <>());
  }

  private ADTListImpl(INode<T> head) {
    this.head = head;
  }

  @Override
  // recursive method that adds a new node to the list
  public void addNode(T t) {
    head = new ContentNode <>(t, head);
  }

  @Override
  public void add(int index, T b) {
    head = head.addNodeAtIndex(index, b);
  }

  @Override
  public int getSize() {
    return head.count();
  }

  @Override
  public void remove(T b) {
    head = head.remove(b);
  }

  @Override
  public T getNodeContent(int index) throws IllegalArgumentException {
    if ((index >= 0) && (index < getSize())) return head.getNodeContent(index);
    else throw new IllegalArgumentException("Invalid index");
  }

  @Override
  public <R> ADTList<R> map(Function<T, R> mapper) {
    return new ADTListImpl<>(head.map(mapper));
  }

  @Override
  public ADTList<T> filter(Predicate<T> tester) {
    return new ADTListImpl<>(head.filter(tester));
  }

  public List<ADTListImpl<T>> toList(Predicate<ADTListImpl<T>> predicate) {
    List<ADTListImpl<T>> result = new ArrayList<>();
    if(predicate.test(this))result.add(this);
    return result;
  }

  @Override
  public String toString() {
    return "(" + head.toString() + ")";
  }
}
