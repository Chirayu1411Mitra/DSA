package testpad;

import java.util.ArrayList;

public class itoaatio {
    public static void main(String[] args) {

    }
    static int sttoint(String s){
        return Integer.parseInt(s);
    }
    static String inttostr(int n){
        return String.valueOf(n);
    }
    static String strcat(String s1,String s2){
        return s1.concat(s2);
    }
    static int count(String str){
       String [] s = str.split("\\W+");
        return s.length;
    }
}
