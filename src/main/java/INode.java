import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/15/24
 *
 * Node interface to establish polymorphic use of a Node
 *
 */

interface INode <T> {
  //returns the number of objects in the list
  int count();

  // helper method for accumulator of count
  int countHelp(int acc);

  // adds the given object at front of the list and returns a modified list
  INode<T> addFront(T b);

  // adds the given object at back of the list and returns a modified list
  INode<T> addBack(T b);

  INode<T> getNextNode();

  void setNextNode(INode<T> nextNode);

  // adds the given object at the given position in the list
  INode<T> addNodeAtIndex(int position, T b) throws IllegalArgumentException;

  //removes the first instance of an object from a list
  INode<T> remove(T b);

  // get the object at the specified location
  T getNodeContent(int position) throws IllegalArgumentException;

  // returns a list of  identical structure that is filtered based on sent predicate
  INode<T> filter(Predicate<T> tester);

  // returns a list of identical structure wit each data type of T converted into
  // R using the provided converter method
  <R> INode<R> map(Function<T, R> mapper);
}