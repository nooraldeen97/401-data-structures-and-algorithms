/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        LinkedList classUnderTest = new LinkedList();
    }
      LinkedList ls = new LinkedList();
    @Test public void TestInsert(){
      ls.insert(2);
      ls.insert(2);
      ls.insert(2);

      assertEquals("This method check if the inserted time equal the linkedList length",3,ls.counter,0.0);
    }

    @Test public void TestIfEmptyLinkedList(){
      assertEquals("this method to make sure that we made an empty linked list",null,ls.head);
    }

    @Test public void TestIncludes(){
      ls.insert(5);
      ls.append(7);


      assertEquals("This method return true if the value is found in the linked list and false if not",true,ls.Includes(5));
      assertEquals("This method return true if the value is found in the linked list and false if not",false,ls.Includes(8));
    }

    @Test public void TestPrintAllLinkedList(){
      ls.insert(1);
      ls.append(2);
      ls.append(3);

      assertEquals("make sure it can print out the linked list","{1}->{2}->{3}->NULL",ls.ToString());
    }

    @Test public void TestIfHeadPointToFirstNode(){
      ls.insert(1);
      ls.append(2);
      ls.append(3);
      assertEquals("make sure that head point to the firstNode",1, ls.head.value);
      assertEquals("make sure that head point to the firstNode",2, ls.head.next.value);

    }


    @Test public void TestInsertBefore(){
      ls.insert(1);
      ls.append(2);
      ls.append(3);
      ls.InsertBefore(1,9);
      System.out.println(ls.ToString());
      assertEquals(9,ls.head.value); //insert before the first node
      ls.InsertBefore(3,8);
      System.out.println(ls.ToString());

      assertEquals("head ->{9}->{1}->{2}->{8}->{3}->X",ls.ToString()); //insert before the middle node
    }

    @Test public void TestInsertAfter(){
      ls.insert(1);
      ls.append(2);
      ls.append(3);
      ls.InsertAfter(3,4);
      System.out.println(ls.ToString());
      assertEquals("head ->{1}->{2}->{3}->{4}->X",ls.ToString()); //test Insert after the last node
      ls.InsertAfter(2,6);
      System.out.println(ls.ToString());
      assertEquals("head ->{1}->{2}->{6}->{3}->{4}->X",ls.ToString());//Insert after the middle node
    }

    // test the ZipLists when both linked list have the same length
    @Test public void testZipLists(){
      LinkedList list1 =new LinkedList();
      LinkedList list2 =new LinkedList();
      list1.insert(1);
      list1.append(3);
      list1.append(2);
      list2.append(5);
      list2.append(9);
      list2.append(4);
      assertEquals("head ->{1}->{5}->{3}->{9}->{2}->{4}->X",list1.zipLists(list1,list2).ToString().toString());
    }

  // test the ZipLists when both linked list dont have  the same length
  @Test public void test2ZipLists(){
    LinkedList list1 =new LinkedList();
    LinkedList list2 =new LinkedList();
    list1.insert(1);
    list1.append(3);
    list1.append(2);
    list2.append(5);
    list2.append(9);
    assertEquals("head ->{1}->{5}->{3}->{9}->{2}->X",list1.zipLists(list1,list2).ToString().toString());
  }

  // test the ZipLists when one of them is empty linked list
  @Test public void test3ZipLists(){
    LinkedList list1 =new LinkedList();
    LinkedList list2 =new LinkedList();
    list1.insert(1);
    list1.append(3);
    list1.append(2);
    assertEquals("head ->{1}->{3}->{2}->X",list1.zipLists(list1,list2).ToString().toString());
  }

  @Test public void testkthFromEnd() throws Exception {
      ls.insert(1);
      ls.append(2);
      ls.append(3);
      ls.kthFromEnd(2);
      assertEquals(1,ls.kthFromEnd(2),0.0);
    }
}
