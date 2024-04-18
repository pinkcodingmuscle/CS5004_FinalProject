import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the Node interface and contains methods for nodes that contain data
 */
public class ContentNode <T> implements INode <T> {
  private final T data;
  private INode<T> next;

  // Constructors
  public ContentNode(T data, INode<T> nextNode) {
    this.data = data;
    this.next = nextNode;
  }

  // this method returns the number of nodes in a list
  @Override
  public int count() {
    if (next == null) {
      return 1;
    }
    return 1 + next.count();
  }

  @Override
  public INode<T> addFront(T data) {
    return new ContentNode<T>(data, this);
  }

  @Override
  public INode<T> addBack(T data) {
    this.next = this.next.addBack(data);
    return this;
  }

  @Override
  public INode<T> getNextNode() {
    return next;
  }

  @Override
  public void setNextNode(INode<T> nextNode) {
    this.next = nextNode;
  }

  @Override
  public INode<T> addNodeAtIndex(int position, T data) throws IllegalArgumentException {
    if (position == 0) return addFront(data);
    else {
      this.next = this.next.addNodeAtIndex(position - 1, data);
      return this;
    }
  }

  // this method that returns the data of a particular node given its position
  @Override
  public T getNodeContent(int position) throws IllegalArgumentException {
    if (position == 0) return this.data;
    else return next.getNodeContent(position - 1);
  }

  // this is a method that returns a new node with the desired condition
  @Override
  public INode<T> filter(Predicate<T> tester) {
    if (tester.test(data)) return new ContentNode<T>(data, next.filter(tester));
    else return next.filter(tester);
  }

  @Override
  public INode<T> remove(T data) {
    if (!(this.data.equals(data))) return new ContentNode<T>(data, next.remove(data));
    else return next.remove(data);
  }

  @Override
  public <R> INode<R> map(Function<T, R> mapper) {
    if (this.next == null) return new EmptyNode<>();
    else return new ContentNode<R>(mapper.apply(this.data), next.map(mapper));
  }

  // returns a formatted string
  @Override
  public String toString() {
    String data = this.data.toString();
    String nextNode = this.next.toString();
    if (nextNode.isEmpty()) return data;
    else return data + " " + nextNode;
  }
}


