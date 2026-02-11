package testpad;

import java.util.HashMap;
import java.util.Map;

public class firstunnique {
    public static void main(String[] args) {
        nonrep("codequotientchamp");
    }
    static void nonrep(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
