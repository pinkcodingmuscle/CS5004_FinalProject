import java.util.function.Function;
import java.util.function.Predicate;
/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * This class implements the Node interface and is responsible for terminating a list
 */
public class EmptyNode <T> implements INode <T>{

  private INode <T> nextNode;

  // this method returns the 0 for an empty node
  @Override
  public int count(){
    return 0;
  }

  @Override
  public INode <T> addFront(T data) {
    return new ContentNode<T>(data, this);
  }

  @Override
  public INode <T> addBack(T data) {
    return addFront(data);
  }

  @Override
  public INode <T> getNextNode() {
    return null;
  }

  @Override
  public void setNextNode(INode<T> nextNode) {
    this.nextNode = nextNode;

  }

  @Override
  public INode<T> addNodeAtIndex(int position, T data) throws IllegalArgumentException {
    if (position == 0) return  addFront(data);
    throw new IllegalArgumentException("Invalid index to add an element");
  }

  @Override
  public INode<T> remove(T b) {
    return this;
  }

  // this method returns null as an empty node does not contain data
  @Override
  public T getNodeContent(int position) {
    throw new IllegalArgumentException("Wrong index.");
  }

  @Override
  public INode <T> filter(Predicate<T> tester) {
    return new EmptyNode <T>();
  }

  @Override
  public <R> INode<R> map(Function<T, R> mapper) {
    return new EmptyNode<R>();
  }

  // this method will return a formatted string
  @Override
  public String toString(){
    return "";
  }

}