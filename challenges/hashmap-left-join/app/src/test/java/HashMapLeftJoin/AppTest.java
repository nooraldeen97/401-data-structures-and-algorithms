/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashMapLeftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class AppTest {
  // here we test if the keys are pushed successfully to the hashmap.
  @Test
  public void testTheExistingOfKeys(){

    HashMap<String, ArrayList<String>> hashMap1=new HashMap<>();
    ArrayList<String > list=new ArrayList<>();
    list.add("enamored");
    hashMap1.put("fond",list);
    ArrayList<String > list2=new ArrayList<>();
    list2.add("anger");
    hashMap1.put("wrath",list2);
    ArrayList<String > list3=new ArrayList<>();
    list3.add("employed");
    hashMap1.put("diligent",list3);
    ArrayList<String > list4=new ArrayList<>();
    list4.add("garb");
    hashMap1.put("outfit",list4);
    ArrayList<String > list5=new ArrayList<>();
    list5.add("usher");
    hashMap1.put("guide",list5);

    assertEquals(true,hashMap1.containsKey("fond"));
    assertEquals(true,hashMap1.containsKey("wrath"));
    assertEquals(true,hashMap1.containsKey("diligent"));
    assertEquals(true,hashMap1.containsKey("outfit"));
    assertEquals(true,hashMap1.containsKey("guide"));
  }

  // here we test if the values if they are pushed successfully to the hashmap.
    @Test
    public void testExistingOfValues(){
      HashMap<String, ArrayList<String>> hashMap1=new HashMap<>();
      ArrayList<String > list=new ArrayList<>();
      list.add("enamored");
      hashMap1.put("fond",list);
      ArrayList<String > list2=new ArrayList<>();
      list2.add("anger");
      hashMap1.put("wrath",list2);
      ArrayList<String > list3=new ArrayList<>();
      list3.add("employed");
      hashMap1.put("diligent",list3);
      ArrayList<String > list4=new ArrayList<>();
      list4.add("garb");
      hashMap1.put("outfit",list4);
      ArrayList<String > list5=new ArrayList<>();
      list5.add("usher");
      hashMap1.put("guide",list5);

      assertEquals(true,hashMap1.containsValue(list));
      assertEquals(true,hashMap1.containsValue(list2));
      assertEquals(true,hashMap1.containsValue(list3));
      assertEquals(true,hashMap1.containsValue(list4));
      assertEquals(true,hashMap1.containsValue(list5));
    }

  // here we test the result arraylist of the function leftJoin
  @Test
  public void testLeftJoinFunction(){
    HashMap<String, ArrayList<String>> hashMap1=new HashMap<>();
    ArrayList<String > list=new ArrayList<>();
    list.add("enamored");
    hashMap1.put("fond",list);
    ArrayList<String > list2=new ArrayList<>();
    list2.add("anger");
    hashMap1.put("wrath",list2);
    ArrayList<String > list3=new ArrayList<>();
    list3.add("employed");
    hashMap1.put("diligent",list3);
    ArrayList<String > list4=new ArrayList<>();
    list4.add("garb");
    hashMap1.put("outfit",list4);
    ArrayList<String > list5=new ArrayList<>();
    list5.add("usher");
    hashMap1.put("guide",list5);

    HashMap<String, String > hashMap2=new HashMap<>();
    hashMap2.put("fond","averse");
    hashMap2.put("wrath","delight");
    hashMap2.put("diligent","idle");
    hashMap2.put("guide","follow");
    hashMap2.put("flow","jam");
    HashMapLeftJoin hashMapLeftJoin=new HashMapLeftJoin();
    ArrayList<String> result=new ArrayList<>();
    result.add("diligent=[employed, idle], outfit=[garb, NULL], wrath=[anger, delight], guide=[usher, follow], fond=[enamored, averse]");

    assertEquals(result.toString(),hashMapLeftJoin.leftJoin(hashMap1,hashMap2).toString());
  }


}
