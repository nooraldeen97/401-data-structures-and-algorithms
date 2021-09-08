package TreeIntersection;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class BinaryTree<T> {
  public Node <T> root;

  public ArrayList<T> preOrderList=new ArrayList<>();

  public ArrayList preOrder(Node <T> root){
    if(root!=null){
//      System.out.println(root.value);
    preOrderList.add(root.value);
    }
    if(root.left !=null){
      preOrder(root.left);
    }
    if(root.right!=null){
      preOrder(root.right);
    }
    return preOrderList;
  }



}
