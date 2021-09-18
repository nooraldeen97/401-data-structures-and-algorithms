package stack.and.queue;

public class AnimalShelter<T> {


  public  Queue <Animal> queue=new Queue<>();

  public AnimalShelter() {
    this.queue = queue;
  }

  public void enqueue(Animal animal){
    if(animal instanceof Cats || animal instanceof Dogs){
      queue.enqueue(animal);
      System.out.println(queue.ToSting());
    }else{
      System.out.println("animal should be either dog or cat");
    }
  }


  public String dequeue(String pref) throws Exception {

    if(pref.toUpperCase().equals("CAT")|| pref.toUpperCase().equals("DOG")){
      queue.dequeue();
      System.out.println(queue.ToSting());
      return pref;
    }else{
      return null;
    }
  }

}

