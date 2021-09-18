package stack.and.queue;

public class Stack<T> {
 public Node <T> top;

  public Stack() {
    this.top = null;
  }



  public void push(T value) {
    Node <T> newNode= new Node<>(value);
    newNode.next=top;
    top=newNode;
  }


  public T peek() throws Exception {
    if(top==null){
      throw new Exception("the Stack is empty");
    }else{
      return  top.value;

    }
  }

  public T pop() throws Exception {
    Node <T>removed;
    if(top==null){
      throw new Exception("The stack is empty");
    }else {
      removed =top;
      top=top.next;
    }

  return removed.value;
  }

  public boolean isEmpty(){

    if(top==null){
      return true;
    }else{
      return false;
    }
  }

  public String ToString(){
    Node<T> current=top;
    String result = "Top->";
    while (current!=null){
      result+="{"+current.value+"}"+"->";
      current=current.next;
    }
      result=result+"null";
    return result;
  }



}
