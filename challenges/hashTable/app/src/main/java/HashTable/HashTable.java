package HashTable;


public class HashTable {

  public Entry[] array =new Entry[100];


  public void add(String key, int value){
//    System.out.println(hash(key));
    if(array[hash(key)] ==null){
      array[hash(key)]=new Entry(key,value);
    }else {
      Entry newItem=new Entry(key,value);
      array[hash(key)].next=newItem;
    }

  }



  public int hash(String key){
    int keyAscii=0;
    int result=0;
    for (int i = 0; i < key.length(); i++) {
//      System.out.println((int)key.charAt(i));
      keyAscii= keyAscii+(int)key.charAt(i);
      result=Math.round(keyAscii/29);
    }

    return result;
  }

  public int get(String InputKey){
    Entry current = array[hash(InputKey)];
    int theValue=0;

    while (current!= null){
      if(current.key==InputKey){
        theValue=current.value;
      }
      current=current.next;

    }
    return theValue;
  }

  public boolean contains(String key){
    Entry current = array[hash(key)];
    boolean cond=false;
    while (current!= null){
      if(current.key==key){
        cond=true;
      }
      current=current.next;

    }
    return cond;
  }
}
