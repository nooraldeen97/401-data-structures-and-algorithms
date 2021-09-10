package HashMapLeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapLeftJoin {

  public ArrayList leftJoin(HashMap<String, ArrayList<String>> FirstHashMap, HashMap<String,String> secondHashMap){
    ArrayList <Object> result=new ArrayList<>();
    for (Object key: FirstHashMap.keySet()) {
      if(secondHashMap.containsKey(key)){
        FirstHashMap.get(key).add(secondHashMap.get(key));
      }else {
        FirstHashMap.get(key).add("NULL");
      }
    }

    for (Object entry:FirstHashMap.entrySet()) {
      result.add(entry);
    }
    return result;
  }


}
