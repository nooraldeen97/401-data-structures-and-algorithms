/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TreeIntersection;


public class App {


    public static void main(String[] args) {
      TreeIntersection treeIntersection=new TreeIntersection();

      BinaryTree<Integer> binaryTree1=new BinaryTree<Integer>();
      binaryTree1.root = new Node(150);
      binaryTree1.root.left = new Node(100);
      binaryTree1.root.right = new Node(250);
      binaryTree1.root.left.left = new Node(75);
      binaryTree1.root.left.right = new Node(160);
      binaryTree1.root.left.right.left = new Node(125);
      binaryTree1.root.left.right.right = new Node(175);
      binaryTree1.root.right.left = new Node(200);
      binaryTree1.root.right.right = new Node(350);
      binaryTree1.root.right.right.left = new Node(300);
      binaryTree1.root.right.right.right = new Node(500);
      /////
      BinaryTree<Integer> binraryTree2=new BinaryTree<Integer>();
      binraryTree2.root = new Node(42);
      binraryTree2.root.left = new Node(100);
      binraryTree2.root.right = new Node(600);
      binraryTree2.root.left.left = new Node(15);
      binraryTree2.root.left.right = new Node(160);
      binraryTree2.root.left.right.left = new Node(125);
      binraryTree2.root.left.right.right = new Node(175);
      binraryTree2.root.right.left = new Node(200);
      binraryTree2.root.right.right = new Node(350);
      binraryTree2.root.right.right.left = new Node(4);
      binraryTree2.root.right.right.right = new Node(500);
      System.out.println(treeIntersection.IntersectionTwoTrees(binaryTree1,binraryTree2));
    }
}
