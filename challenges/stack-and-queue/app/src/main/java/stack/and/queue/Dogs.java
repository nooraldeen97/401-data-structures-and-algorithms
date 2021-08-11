package stack.and.queue;

public class Dogs extends Animal {

  public String dogName;

  public Dogs(String dogName) {
    this.dogName=dogName;

  }

  @Override
  public String toString() {
    return "Dogs{" +
      "dogName='" + dogName + '\'' +
      '}';
  }
}
