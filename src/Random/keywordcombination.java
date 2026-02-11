package Random;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class keywordcombination {
    public static void main(String[] args) {
    ArrayList<String> result =combination("32");
        System.out.println(result);
    }
    static ArrayList<String> combination(String Dig){
        ArrayList<String> result= new ArrayList<>();
        if(Dig.length()==0){
            return result;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
            back(0,Dig,map,new StringBuilder(),result);
            return result;
    }
    static void back(int index, String digit, HashMap<Character,String> map, StringBuilder sb, ArrayList<String> result){
        if(index==digit.length()){
            result.add(sb.toString());
            return;
        }
        String letters= map.get(digit.charAt(index));
        for(char c : letters.toCharArray()){
            sb.append(c);
            back(index+1,digit,map,sb,result);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
