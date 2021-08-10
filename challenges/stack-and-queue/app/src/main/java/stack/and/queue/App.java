/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {


    public static void main(String[] args) throws Exception {


//      Stack<Integer> stack = new Stack<>();
//      stack.push(2);
//      stack.push(5);
//      stack.push(6);
//      stack.pop();
//      stack.pop();
//      System.out.println(stack.isEmpty());
//      System.out.println(stack.ToString());
//      System.out.println(stack.peek());
//
//
//
//      Queue<Integer> queue = new Queue<>();
//      queue.enqueue(5);
//      queue.enqueue(6);
//      queue.enqueue(8);
//      queue.dequeue();
//      System.out.println(queue.ToSting());
//      System.out.println(queue.back.value);
//      System.out.println(queue.peek());
//      System.out.println(queue.front.value);


      PseudoQueue<Integer> pseudoQueue =new PseudoQueue<>();
      pseudoQueue.pseudoEnqueue(4);
      pseudoQueue.pseudoEnqueue(5);
      pseudoQueue.pseudoEnqueue(6);
      System.out.println(pseudoQueue.front.value);
      System.out.println(pseudoQueue.back.value);

      System.out.println(pseudoQueue.pseudoDequeue());

      System.out.println(pseudoQueue.ToSting());

    }
}
