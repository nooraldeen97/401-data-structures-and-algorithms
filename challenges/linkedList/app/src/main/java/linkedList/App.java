package linkedList;

public class App {

  public static void main(String[] args) throws Exception {

    LinkedList ls =new LinkedList();
    ls.Insert(1);
    ls.Insert(2);
    ls.Insert(3);
    ls.InsertBefore(2,5);
//    ls.InsertAfter(2,9);

    System.out.println(ls.ToString());
    System.out.println(ls.kthFromEnd(2));
//    System.out.println(ls.Includes(5));
  }
  }
