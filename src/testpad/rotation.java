package testpad;

public class rotation {
    public static void main(String[] args) {
        System.out.println(isrotation("abcde","cdeab"));
    }
    static boolean  isrotation(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        String com= s1+s1;
        int i=0;
        int j=s2.length();
        while (j<=com.length()){
            if(com.substring(i,j).equals(s2)) return true;
            i++;
            j++;
        }
        return false;
    }
}
