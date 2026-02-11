package testpad;

import java.util.*;

public class cntfrequency {
    static void countFrequency(String str) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i =0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getValue()+entry.getKey()+" ");
        }
    }

    public static void main(String[] args) {
        countFrequency("coding");
    }
}
