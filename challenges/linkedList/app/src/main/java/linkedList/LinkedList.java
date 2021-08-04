/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class LinkedList{

  Node head;
  int counter;
  int length;

  public LinkedList(){
    this.head=null;
    this.counter=0;
    this.length=0;
  }

//while (list1Node != null || list2Node != null) {
//    if (list1Node != null){
//      mergedList.insert(list1Node.value);
//      list1Node = list1Node.next;
//    }
//    if (list2Node != null){
//      mergedList.insert(list2Node.value);
//      list2Node = list2Node.next;
//    }
//    public LinkedList  zipLists( LinkedList list1,LinkedList list2){
//    LinkedList ls = new LinkedList();
//    Node current1 = list1.head;
//    Node current2 = list2.head;
//
//      ls.insert(current1.value);
//      while (current1.next!=null || current2.next!=null ){
//         current1=current1.next;
//        ls.append(current2.value);
//        assert current1 != null;
//        ls.append(current1.value);
//        current2=current2.next;
//
//      }
//
////        ls.append(current2.value);
//
//      return ls;
//    }

// if(current1!= null){
//          ls.append(current1.value);
//          current1=current1.next;
//        }
//        if(current2!= null){
//          ls.append(current2.value);
//          current1=current2.next;
//        }


  public LinkedList  zipLists( LinkedList list1,LinkedList list2){


    LinkedList newLinkedList = new LinkedList();
    if (list1.head == null && list2.head == null) {
    }
    else if (list1.head == null) {
      newLinkedList = list2;
      return newLinkedList;
    }
    else if (list2.head == null) {
      newLinkedList = list1;
      return newLinkedList;
    }
    Node current1 = list1.head;
    Node current2 = list2.head;

    while (current1.next != null && current2.next != null) {
      newLinkedList.append(current1.value);
      newLinkedList.append(current2.value);
      current1 = current1.next;
      current2 = current2.next;
    }
    newLinkedList.append(current1.value);
    newLinkedList.append(current2.value);

    if (current1.next != null) {

      while (current1.next != null) {
        current1 = current1.next;
        newLinkedList.append(current1.value);
      }
    }
    else if (current2.next != null) {

      while (current2.next != null) {
        current2 = current2.next;
        newLinkedList.append(current2.value);
      }
    }
    return newLinkedList;
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

    public void insert(int value){
      Node newNode = new Node(value);
      newNode.next=head;
      head=newNode;

      counter++;
    }


    public void append(int value){
      Node newNode =new Node(value);
      if (head == null) {
        head = newNode;
      } else {
        Node current = head;
        while (current.next != null) {

          current = current.next;
        }
        current.next = newNode;

        counter++;
      }
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
