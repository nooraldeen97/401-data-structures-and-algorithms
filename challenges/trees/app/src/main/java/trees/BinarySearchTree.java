package trees;

public class BinarySearchTree<T> extends BinaryTree<T>{

public  Node<Integer> root;
  public  void add(Integer value) {
    Node<Integer> addedNode = new Node<>(value);
    Node<Integer> current;
    current = root;
    while (current != null) {
      if (current.right != null && addedNode.value > (Integer) current.right.value) {
        current = current.right;
       if(current.left==null && current.right!=null&& addedNode.value < (Integer) current.right.value)
       {
           current.left=addedNode;
           break;
       }
       else if(current.right==null){current.right=addedNode;
           break;}
      }
      if (current.left!=null && addedNode.value > (Integer) current.left.value) {
          current = current.left;
          if(current.right==null)
          {
              current.right=addedNode;
              break;
           }
          else if( addedNode.value < (Integer)current.right.value)
          {
            current.right=addedNode;
            break;
          }
        }
    }

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


