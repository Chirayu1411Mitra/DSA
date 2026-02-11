package testpad;

import java.util.HashSet;

public class keyboardisue {
    public static void main(String[] args) {
    String s= ans("mnoppppppqqqqqqt");
        System.out.println(s);
    }
    static String ans(String str){
       HashSet<Character> set= new HashSet<>();
        for(int i =0;i<str.length();i++) {
            set.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
