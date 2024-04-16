public class Node <T> {
  // instance variables
  Node <T> next; // this will act as a pointer to the next node
  T data; // this will represent a job posting and its information

  // Constructors
  public Node(T newData){
    this.data = newData;
    this.next = null;
  }

  public Node(T newData, Node <T> nextNode){
    this.data = newData;
    this.next = nextNode;
  }

  // Getters and setters
  public T getData(){
    return this.data;
  }

  public Node <T> getNextNode(){
    return this.next;
  }

  public void setData(T newData){
    data = newData;
  }

  public void setNextNode(Node <T> nextNewNode){
    next = nextNewNode;
  }


}
