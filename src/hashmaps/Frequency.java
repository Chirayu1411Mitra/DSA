package hashmaps;

import java.util.*;
public class Frequency{
    public static void main(String[] args){
        HashMap<Integer,Integer> map= new HashMap<>();
        int []  arr={1,1,1,12,2,2,6,7,4,7,4};
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
            }
        System.out.println(map);


    }
    
}

