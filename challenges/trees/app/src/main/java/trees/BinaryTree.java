package trees;

import java.util.ArrayList;

public class BinaryTree <T>{
  public Node <T> root;


  public void preOrder(Node <T> root){
    System.out.println(root.value);
    if(root.left !=null){
      preOrder(root.left);
    }
    if(root.right!=null){
      preOrder(root.right);
    }
  }



  public void inOrder(Node <T> root) {
    if (root.left != null) {
      inOrder(root.left);
    }
    System.out.println(root.value);

    if (root.right != null) {
      inOrder(root.right);
    }
  }

  public ArrayList <String> result=new ArrayList<>();


    public ArrayList<String> postOrder (Node < T > root) {
      if (root.left != null) {
        postOrder(root.left);
      }
      if (root.right != null) {
        postOrder(root.right);
      }
      result.add((String) root.value);
//      System.out.println(root.value);

      return result;
    }



  }

