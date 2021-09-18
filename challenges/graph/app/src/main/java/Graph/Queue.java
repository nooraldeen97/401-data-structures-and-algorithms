package Graph;

public class Queue<T> {

    QueueNode <T> front;
    QueueNode <T> back;


    public Queue() {
      this.front = null;
      this.back = null;
    }


    public void enqueue(T value){


      QueueNode<T> newNode = new QueueNode<T>(value);
      newNode.next=back;
      back=newNode;

      QueueNode <T> current;
      current=back;
      while (current.next!=null){
        current=current.next;
      }
      front=current;
    }

    public T dequeue() throws Exception {
      QueueNode<T> t;
      t=back;
      if(!isEmpty()){

        while (t!=null) {

          if (t.next == front) {
            front = t;
            t.next=null;

          }else if(t.next==null){
            back=null;
            front=null;
          }
          t = t.next;

        }
      }else{
        throw new Exception("The Queue is empty");
      }

    return (T) front;
    }

    public T peek() throws Exception {
      if (isEmpty()){
        throw new Exception("the Stack is empty");
      }else{
        return front.value;
      }
    }

    public boolean isEmpty(){
      if(back == front && back == null){
        return true;
      }else {
        return false;
      }
    }


    public String ToSting(){
      String result = "back->";
      QueueNode<T> current;
      current=back;
      while (current!=null){
        result+="{"+current.value+"}->";
        current=current.next;
      }
      result=result+"front";

      return result;
    }


}
