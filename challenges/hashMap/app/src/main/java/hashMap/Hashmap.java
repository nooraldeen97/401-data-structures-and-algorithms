package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hashmap {
  List <String> spec=new ArrayList<String>();
  public String hashMap(String statement){
      String repeatedWord="";

    HashMap<String,Integer> container=new HashMap<>();
    String[] splitArr=statement.split(" ",0);
    for (int i = 0; i < splitArr.length; i++) {
      if(!container.containsKey(splitArr[i])){
        container.put(splitArr[i],1);
        spec.add(splitArr[i]);
      }else {
        container.replace(splitArr[i],container.get(splitArr[i])+1);
      }
    }

    int max=container.get(splitArr[0]);
    String maxS=splitArr[4];
    for (int i = 0; i < splitArr.length; i++) {
      if(container.get(splitArr[i])>max) {
        max = container.get(splitArr[i]);
        maxS= splitArr[i];
      }
    }
//
//    int max=container.get(spec.get(0));
//    String maxS=spec.get(0);
//    for (int i = 1; i < spec.size(); i++) {
//      if(container.get(spec.get(i))>max) {
//        max = container.get(spec.get(i));
//        maxS= spec.get(i);
//      }
//    }
  return maxS;
    }
  }


