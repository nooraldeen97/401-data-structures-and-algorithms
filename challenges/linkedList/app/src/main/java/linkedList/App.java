package linkedList;

public class App {

  public static void main(String[] args) {

    LinkedList ls =new LinkedList();
    ls.Insert(5);
    ls.Insert(4);
    ls.Insert(2);
//    ls.InsertBefore(4,1);
    ls.InsertAfter(4,9);

    System.out.println(ls.ToString());
    System.out.println(ls.Includes(5));
  }
  }
