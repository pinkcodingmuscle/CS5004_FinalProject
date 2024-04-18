import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the IModel interface and contains the linked list methods
 */


public class JobPostModel <T> implements IModel <T> {
  private INode<T> head;

  // Constructors
  public JobPostModel() {
    this.head = new EmptyNode<>();
  }

  public JobPostModel(T t) {
    this.head = new ContentNode<>(t, new EmptyNode <>());
  }

  private JobPostModel(INode<T> head) {
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
  public <R> IModel <R> map(Function<T, R> mapper) {
    return new JobPostModel<>(head.map(mapper));
  }

  @Override
  public IModel <T> filter(Predicate<T> tester) {
    return new JobPostModel<>(head.filter(tester));
  }

  public List<JobPostModel<T>> toList(Predicate<JobPostModel<T>> predicate) {
    List<JobPostModel<T>> result = new ArrayList<>();
    if(predicate.test(this))result.add(this);
    return result;
  }

  @Override
  public String toString() {
    return "(" + head.toString() + ")";
  }
}
