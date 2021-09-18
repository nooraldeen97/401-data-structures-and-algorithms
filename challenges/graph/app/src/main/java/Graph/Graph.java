package Graph;

import java.util.*;




public class Graph <T> {

  HashMap<Node,ArrayList<Node>> graphsNode=new HashMap<>();



  public List<Node<T>> breadthFirstTraverse(Node<T> root) throws Exception {
    if(root.value==null){
      return null;
    }
    Set<Node<T>> visited = new LinkedHashSet<>();
    Queue<Node<T>> queue = new Queue<Node<T>>();
    List<Node<T>> nodes = new ArrayList<>();

    queue.enqueue(root);
    visited.add(root);

    while (!queue.isEmpty()){
      Node<T> vertex = queue.dequeue();
      nodes.add(vertex);
      for (Node ver:graphsNode.get(vertex)) {
        if(!visited.contains(ver)){
          visited.add(ver);
          queue.enqueue(ver);
        }
      }
    }
    return nodes;
  }

  public Set<String> depthFirstTraverse(String root){
    Set<String> visited = new LinkedHashSet<>();
    Stack<String> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()){
      String vertex = stack.pop();
      if (!visited.contains(vertex)){
        visited.add(vertex);

        for (Node v: graphsNode.get(vertex)) {
          stack.push((String) v.value);
        }
      }
    }

    return visited;
  }


  public Node addToGraph(T value){
      ArrayList<Node> vertex=new ArrayList<>();
      Node addedNode=new Node(value);
      graphsNode.put(addedNode,vertex);

      return addedNode;
      }

      public void addEdge(Node<T> node1, Node<T> node2){
      graphsNode.get(node1).add(node2);
      graphsNode.get(node2).add(node1);
      }

  public void addEdge(Node<T> node1, Node<T> node2,int weight){
      Node newNode1=new Node<T>(node1.value,weight);
      Node newNode2=new Node<T>(node2.value,weight);
    graphsNode.get(node1).add(newNode2);
    graphsNode.get(node2).add(newNode1);
  }


      public ArrayList getNodes(){
      if(graphsNode.size()==0){
        return null;
      }else {
        ArrayList<Object> allNodes=new ArrayList<>();

        allNodes.add(graphsNode.keySet());
        return allNodes;
      }

      }


     public ArrayList getNeighbors(Node<T> node){
      return graphsNode.get(node);
     }

     public int sizeOfGraph(){
      return graphsNode.size();
     }

}


