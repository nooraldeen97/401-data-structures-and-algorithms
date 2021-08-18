package trees;

public class BinarySearchTree<T> extends BinaryTree<T>{

  public Node<Integer> root;

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


