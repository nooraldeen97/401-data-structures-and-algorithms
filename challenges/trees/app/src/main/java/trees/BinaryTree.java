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

//  public int preOrder(Node <T> root){
//    System.out.println(root.value);
//    if(root.left !=null){
//      preOrder(root.left);
//    }
//    if(root.right!=null){
//      preOrder(root.right);
//    }
//    return (int) root.value;
//  }
//
//  public void preOrderSearch(Node <T> root, int value){
//    if(root.value.equals(value)) {
//      System.out.println("found");
//    }
//  }
//  public void intersection(BinaryTree a,BinaryTree b){
//    preOrderSearch(a.root,preOrder(b.root));
//    if(root.left !=null){
//      preOrderSearch(a.root.left,preOrder(b.root));
//    }
//    if(root.right!=null){
//      preOrderSearch(a.root.right,preOrder(b.root));
//    }
//
//  }

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

