/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class LinkedList {

  Node head;
  int counter;
  int length;

  public LinkedList(){
    this.head=null;
    this.counter=0;
    this.length=0;
  }

    public int kthFromEnd(int k) throws Exception {
      Node current = head;
      if (k > 0 && k <= counter) {
        while (current.next != null) {

          if ((counter - k) == length) {
            break;
          }
          current = current.next;
          length++;
        }
        return current.value;
      }
      else{
        throw new Exception("Exception message");
      }
    }


    public void InsertBefore(int value,int newValue){
      Node newNode = new Node(newValue);
      Node current =head;
      if(current.value==value){
        newNode.next=current;
        head=newNode;
      }
      while (current.next!=null){

        if(current.next.value ==value){

          newNode.next=current.next;
          current.next=newNode;
          break;
        }
        current=current.next;
      }
    }

    public void InsertAfter(int value , int newValue){
      Node newNode = new Node(newValue);
      Node current=head;

      while (current.next!=null){

        if(current.value ==value){
          newNode.next=current.next;
          current.next=newNode;
          break;
        }
        current=current.next;
      }
      if(current.next==null && current.value==value){
        newNode.next=null;
        current.next=newNode;
      }

    }


    public void Insert(int value){
      Node newNode =new Node(value);
      if(head==null){
        head =newNode;

      }else {
        Node current = head;
        while (current.next!=null){

          current=current.next;
        }
        current.next=newNode;

      }
      counter++;
    }

    public Boolean Includes(int value){
    Boolean cond =false;
      Node current=head;
      if(head.value==value){
        cond=true;
      }
      while (current.next!=null){

      if(current.value==value){
        cond=true;
      }
      current=current.next;
    }
    return cond;
    }


    public String ToString(){
      String result="";
      Node current = head;
      while (current!=null){
        result=result+"{"+current.value+"}->";
        current=current.next;
      }
      result=result+"X";
      return "head ->"+result;
    }

}
