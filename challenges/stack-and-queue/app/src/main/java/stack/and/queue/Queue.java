package stack.and.queue;

public class Queue <T>{
  Node <T> front;
  Node <T> back;


  public Queue() {
    this.front = null;
    this.back = null;
  }


  public void enqueue(T value){


    Node<T> newNode = new Node<>(value);
    newNode.next=back;
    back=newNode;

    Node <T> current;
    current=back;
    while (current.next!=null){
      current=current.next;
    }
    front=current;
  }

  public void dequeue() throws Exception {
   Node<T> t;
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
