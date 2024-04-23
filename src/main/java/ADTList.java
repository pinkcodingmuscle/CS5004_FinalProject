import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Name: Esther Mukuye
 * Date: 4/16/24
 *
 * ADTList interface to establish polymorphic use of a job posting manager
 *
 */
public interface ADTList<T> {
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
  <R> ADTList<R> map(Function<T,R> mapper);
  // filter higher order function that returns a new list based on the set predicate
  ADTList<T> filter (Predicate <T> tester);
}

