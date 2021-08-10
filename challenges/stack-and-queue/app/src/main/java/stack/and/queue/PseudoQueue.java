package stack.and.queue;


  public class PseudoQueue<T> {



    public Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<>();

    public Node <T> back;
    public Node <T> front;

    public void pseudoEnqueue(T value) {
      stack1.push(value);
      back=stack1.top;
      Node<T> current;
      current=back;
      while (current.next!=null){
        current=current.next;
      }
      front=current;

    }




    public T pseudoDequeue() throws Exception {
      T result = null;
      if (stack2.isEmpty()){
        while (!stack1.isEmpty()){
          stack2.push(stack1.pop());
        }
        result = stack2.pop();
        while (!stack2.isEmpty()){
          stack1.push(stack2.pop());
        }
      }

      return result;
    }


  public String ToSting(){
    String result = "back->";
    Node<T> current;
    current=back;
    while (current!=null){
      result+="{"+current.value+"}->";
      current=current.next;
    }
    result=result+"front";

    return result;
  }


  
}
