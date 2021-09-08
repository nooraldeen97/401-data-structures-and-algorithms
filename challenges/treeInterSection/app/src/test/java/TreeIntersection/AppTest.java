/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testCode32(){
    BinaryTree<Integer> firtTree=new BinaryTree<Integer>();
    firtTree.root = new Node(150);
    firtTree.root.left = new Node(100);
    firtTree.root.right = new Node(250);
    firtTree.root.left.left = new Node(75);
    firtTree.root.left.right = new Node(160);
    firtTree.root.left.right.left = new Node(125);
    firtTree.root.left.right.right = new Node(175);
    firtTree.root.right.left = new Node(200);
    firtTree.root.right.right = new Node(350);
    firtTree.root.right.right.left = new Node(300);
    firtTree.root.right.right.right = new Node(500);
    /////
    BinaryTree<Integer> secondTree=new BinaryTree<Integer>();
    secondTree.root = new Node(42);
    secondTree.root.left = new Node(100);
    secondTree.root.right = new Node(600);
    secondTree.root.left.left = new Node(15);
    secondTree.root.left.right = new Node(160);
    secondTree.root.left.right.left = new Node(125);
    secondTree.root.left.right.right = new Node(175);
    secondTree.root.right.left = new Node(200);
    secondTree.root.right.right = new Node(350);
    secondTree.root.right.right.left = new Node(4);
    secondTree.root.right.right.right = new Node(500);
    List<Integer> result= new ArrayList();
    result.add(100);
    result.add(160);
    result.add(125);
    result.add(175);
    result.add(200);
    result.add(350);
    result.add(500);
    TreeIntersection treeIntersection=new TreeIntersection();
    assertEquals(result, treeIntersection.IntersectionTwoTrees(firtTree,secondTree));

  }
}
