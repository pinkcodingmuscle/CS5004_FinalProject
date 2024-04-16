import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/15/24
 *
 * This class contains the linked list methods
 *
 */
public interface IModel<T> {
  void addNode(T b);
  // adds an object to this list so that it occupies the provided index
  void add(int index, T b);
  // returns the number of objects currently in the list
  int getSize();
  // removes the first instance of this object from the list
  void remove(T b);
  // get the index of an object in the list
  T getNodeContent(int index) throws IllegalArgumentException;
  // Map higher order function that returns the corresponding list of type R
  <R> IModel<R> map(Function<T,R> mapper);
  // filter higher order function that returns a new list based on the set predicate
  IModel<T> filter (Predicate <T> tester);
  //method that returns a sorted list based on priority
  //void sortByPriority(INode <T> b);
}

