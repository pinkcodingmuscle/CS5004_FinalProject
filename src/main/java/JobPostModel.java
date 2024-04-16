import java.util.function.Function;
import java.util.function.Predicate;

public class JobPostModel<T> implements IModel <T> {
  private INode<T> head; // reference to the head

  // Constructors
  // when the linked list is empty
  public JobPostModel() {
    this.head = new EmptyNode<>();
  }

  // when we add an item to the linked list
  public JobPostModel(T t) {
    this.head = new ContentNode<>(t, new EmptyNode <>());
  }

  private JobPostModel(INode<T> head) {
    this.head = head;
  }

  /**
   * @param b
   * this method adds a job posting to the linked list
   */
  @Override
  public void addNode(T b) {
    head = new ContentNode <>(b, head);
  }

  /**
   * @param index
   * @param b
   * this method adds a job posting to the linked list at a particular index
   */
  @Override
  public void add(int index, T b) {
    head = head.addNodeAtIndex(index, b);

  }

  // @return the size/ number of items in the linked list
  @Override
  public int getSize() {
    return head.count();
  }

  /**
   * @param b
   * removes an item (job posting) from the linked list
   */
  @Override
  public void remove(T b) {
    head = head.remove(b);
  }

  /**
   * @param index
   * @return the job posting at a particular index
   * @throws IllegalArgumentException if the index is invalid
   */
  @Override
  public T getNodeContent(int index) throws IllegalArgumentException {
    if ((index >= 0) && (index < getSize())) return head.getNodeContent(index);
    else throw new IllegalArgumentException("Invalid index");
  }

  /**
   * @param mapper
   * @param <R>
   * @return a new linked list with the
   */
  @Override
  public <R> IModel<R> map(Function<T, R> mapper) {
    return new JobPostModel<>(head.map(mapper));
  }

  /**
   * @param tester, this will be the desired condition
   * @return a new linked list with the desired condition
   */
  @Override
  public IModel<T> filter(Predicate<T> tester) {
    return new JobPostModel<>(head.filter(tester));
  }

  @Override
  public String toString() {
    return "(" + head.toString() + ")";
  }
}
