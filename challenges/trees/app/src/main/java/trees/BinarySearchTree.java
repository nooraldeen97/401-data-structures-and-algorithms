package trees;

public class BinarySearchTree<T> extends BinaryTree<T>{

  public Node<Integer> root;


  public Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node(value);
    }

    if (value < (int)current.value) {
      current.left = addRecursive(current.left, value);
    } else if (value >(int) current.value) {
      current.right = addRecursive(current.right, value);
    } else {
      // value already exists
      return current;
    }

    return current;
  }
// Find the max number in a Binary tree.
  public int findMax(){

    Node current=root;
    int max=0;
    while (current.right!=null){

      current=current.right;
    }
    max= (int) current.value;
    return max;
  }
// Find second max value in binary tree.
  public int findSecondMax(){
    Node current=root;
    int secondMax=0;
    while (current.right.right!=null){
      current=current.right;
    }
    secondMax= (int) current.value;

    if(current.right.left!=null){
//      if((int)current.right.left.value >(int) current.value){
        secondMax=(int)current.right.left.value;
//      }
    }
    return secondMax;
  }
  // Find min value in binary tree.
public int findMin(){
    Node current=root;
    int min=0;
    while (current.left!=null){
      current=current.left;
    }
    min= (int) current.value;
    return min;
}

public int findSecondMin(){
    Node current=root;
    int secondMin=0;
    while (current.left.left!=null){
      current=current.left;
    }
    secondMin= (int) current.value;
    if(current.left.right!=null){
      secondMin= (int) current.left.right.value;
    }
    return secondMin;
}

  public void add(Integer value) {

    if (root.value == null) {
      root = new Node<>(value);

    } else {
      Node<Integer> current = root;
      Node<Integer> newNode = new Node<>(value);
      while (!value.equals(current.value) && (current.right != newNode || current.left != newNode)) {
        if (value < current.value) {
          if (current.left == null) current.left = newNode;
          else current = current.left;
        } else {
          if (current.right == null) current.right = newNode;
          else current = current.right;
        }
      }
    }
  }

  public boolean contains(Integer value) {
    if (root == null) return false;

    if (value.equals(root.value)) return true;

    Node<Integer> current = root;
    while (current.left != null || current.right != null) {
      if (value < current.value && current.left != null) {
        current = current.left;
      } else if (value > current.value && current.right != null) {
        current = current.right;
      } else return false;
      if (value.equals(current.value)) return true;
    }
    return false;
  }



//
//public  void add(Integer value){
//  Node <Integer> addedNode = new Node<>(value);
//  Node <Integer> current;
//  current=root;
//  while (current != null){
//      if(current.right!=null){
//        if(addedNode.value >(Integer) current.right.value){
//          current=current.right;
//      }else {
//          addedNode=current.left;
//        }
//      current=current.right;
//    }else{
//      current.left=addedNode;
//      break;
//
//    }
//
//    if(addedNode.value < (Integer) current.left.value){
//      if(current.left==null){
//        current.left=addedNode;
//        break;
//      }
//      current=current.left;
//    }else{
//      current.right=addedNode;
//      break;
//
//    }
//
//  }
//  root=addedNode ;


}


