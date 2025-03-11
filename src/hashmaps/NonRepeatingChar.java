import java.util.*;
public class NonRepeatingChar{
    public static void main(String[] args){
        String str="Porn Hub feat. deepak ka Laal";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
             if (map.get(i) == 1) {
                System.out.print(i+" ");
        }

    }
}
}
