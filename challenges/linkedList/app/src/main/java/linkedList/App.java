package linkedList;

public class App {

  public static void main(String[] args) throws Exception {

//    LinkedList ls =new LinkedList();
//    ls.insert(1);
//    ls.append(2);
//    ls.append(3);
//    ls.insert(5);
//
//    ls.InsertBefore(2,5);
//    ls.InsertAfter(2,9);
//
//    System.out.println(ls.ToString());
////    System.out.println(ls.kthFromEnd(6));
//    System.out.println(ls.Includes(5));

    LinkedList list1 =new LinkedList();
    LinkedList list2 =new LinkedList();
    list1.insert(1);
    list1.append(3);
//    list1.append(2);
    list2.insert(5);
    list2.append(9);
    list2.append(4);
    System.out.println(list1.zipLists(list1,list2).ToString());

  }
  }
