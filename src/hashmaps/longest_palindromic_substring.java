package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class longest_palindromic_substring {
    public static void main(String[] args) {

    }
    // static String substring(String s){
    //     HashMap<String ,Boolean>map = new HashMap<>();


    // }
    static boolean palindrom(String s){
        if(s.length()==1){
            return true;
        }
        StringBuilder rev = new StringBuilder(s).reverse();
        if( s.equals(rev.toString())){
            return true;
        }
        return false;
    }

}
