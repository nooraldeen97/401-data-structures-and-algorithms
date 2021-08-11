package stack.and.queue;

public class Cats extends Animal{

  public String catName;

  public Cats( String catName) {
    this.catName=catName;
  }

  @Override
  public String toString() {
    return "Cats{" +
      "catName='" + catName + '\'' +
      '}';
  }
}
