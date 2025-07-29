package hashmaps;

import java.util.*;
public class basics{
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();  // init hashmap <Int , int > can be anything 
        map.put("Hello",1 );                      // insert element in hashmap
        map.put("World",2);                         // map.put(key,value)
        map.put("every",3);

    System.out.println(map.get("Hello"));

   // map.remove("World");
    System.out.println(map.containsKey("every"));   // check for key because uts aleays unique
    


    for (String i:map.keySet()){
        System.out.println(map.get(i));
    }
    }

}
