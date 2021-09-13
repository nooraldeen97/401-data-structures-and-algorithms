package Graph;

public class Node<T> {
  T value;
  int weight;

  public Node(T value) {
    this.value = value;
  }

  public Node(T value, int weight) {
    this.value = value;
    this.weight = weight;
  }

  @Override
  public String toString() {
    if(weight>0){
      return "Node{" + value +"  the weight is "+ weight+
        '}';
    }else {
      return "Node{"+value+"}";
    }

  }
}
