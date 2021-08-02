/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        LinkedList classUnderTest = new LinkedList();
    }
      LinkedList ls = new LinkedList();
    @Test public void TestInsert(){
      ls.Insert(2);
      ls.Insert(2);
      ls.Insert(2);

      assertEquals("This method check if the inserted time equal the linkedList length",3,ls.counter,0.0);
    }

    @Test public void TestIfEmptyLinkedList(){
      assertEquals("this method to make sure that we made an empty linked list",null,ls.head);
    }

    @Test public void TestIncludes(){
      ls.Insert(5);
      ls.Insert(7);


      assertEquals("This method return true if the value is found in the linked list and false if not",true,ls.Includes(5));
      assertEquals("This method return true if the value is found in the linked list and false if not",false,ls.Includes(8));
    }

    @Test public void TestPrintAllLinkedList(){
      ls.Insert(1);
      ls.Insert(2);
      ls.Insert(3);

      assertEquals("make sure it can print out the linked list","{1}->{2}->{3}->NULL",ls.ToString());
    }

    @Test public void TestIfHeadPointToFirstNode(){
      ls.Insert(1);
      ls.Insert(2);
      ls.Insert(3);
      assertEquals("make sure that head point to the firstNode",1, ls.head.value);
      assertEquals("make sure that head point to the firstNode",2, ls.head.next.value);

    }


    @Test public void TestInsertBefore(){
      ls.Insert(1);
      ls.Insert(2);
      ls.Insert(3);
      ls.InsertBefore(1,9);
      System.out.println(ls.ToString());
      assertEquals(9,ls.head.value); //insert before the first node
      ls.InsertBefore(3,8);
      System.out.println(ls.ToString());

      assertEquals("head ->{9}->{1}->{2}->{8}->{3}->X",ls.ToString()); //insert before the middle node
    }

    @Test public void TestInsertAfter(){
      ls.Insert(1);
      ls.Insert(2);
      ls.Insert(3);
      ls.InsertAfter(3,4);
      System.out.println(ls.ToString());
      assertEquals("head ->{1}->{2}->{3}->{4}->X",ls.ToString()); //test Insert after the last node
      ls.InsertAfter(2,6);
      System.out.println(ls.ToString());
      assertEquals("head ->{1}->{2}->{6}->{3}->{4}->X",ls.ToString());//Insert after the middle node
    }
}
